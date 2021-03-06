package gob.inei.ene2019v2.fragment.ModIX;

import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogComponent.TIPO_DIALOGO;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIX.dialog.Mod_IX_Fragment_001_01;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.ModuloixDet01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.LinearLayout;
import android.widget.ScrollView;

// 
public class Mod_IX_Fragment_001 extends FragmentForm implements Respondible {

	private TableComponent tcCap;
	private LabelComponent lblTitulo, lblsubtitulo, lblnota;
	public List<ModuloixDet01> lstData;
	private GridComponent grid;
	public static Mod_IX_Fragment_001 _this;
	public static final int OTRO = 8;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public static enum ACCION {
		ADD, EDIT, FINISH, DELETE, RESUMEN, AVISO
	}

	private ACCION action;
	private ButtonComponent btnIniciar;
	private DialogComponent dc;
	private CuestionarioService cuestionarioService;
	SeccionCapitulo[] seccionVivienda;
	private Caratula caratula;
	public Integer valor =0;

	public Mod_IX_Fragment_001() {
	}

	public Mod_IX_Fragment_001 parent(MasterActivity parent) {
		this.parent = parent;
		return this;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		_this = this;
		rootView = createUI();
		setHasOptionsMenu(true);
		registerForContextMenu(tcCap.getListView());
		initObjectsWithoutXML(this, rootView);
		enlazarCajas();
		listening();

		return rootView;
	}

	@Override
	protected void buildFields() {

		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.Capitulo900)
				.textSize(21).centrar().negrita();

		lblsubtitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.Capitulo900t)
				.textSize(21).centrar().negrita();

		tcCap = new TableComponent(getActivity(), this, App.ESTILO, true)
				.size(600, 765).headerHeight(130).dataColumHeight(75)
				.headerTextSize(App.HTST);

		tcCap.addHeader(R.string.c2c100m9p001_3, 2.2f);
		tcCap.addHeader(R.string.c2c100m9p001_4, 0.8f);
		tcCap.addHeader(R.string.c2c100m9p001_5, 0.8f);
		tcCap.addHeader(R.string.c2c100m9p001_6, 1.1f);
		tcCap.setCellColor(-1, 1, true);

		btnIniciar = new ButtonComponent(getActivity(), App.ESTILO_BOTON).text(
				R.string.c900_AgregarPro).size(200, 60);
		btnIniciar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (lstData.size() < 5) {
					tryAddVisit(ACCION.ADD);
				}
			}
		});
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		if (v.getId() == tcCap.getListView().getId()) {
			menu.setHeaderTitle("Opciones");
			menu.add(0, 1, 1, "Editar Producto");
			menu.add(1, 1, 1, "Eliminar Producto");
			AdapterContextMenuInfo info = (AdapterContextMenuInfo) menuInfo;
			try {

			} catch (ClassCastException e) {
			}
		}

		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if (!getUserVisibleHint())
			return false;
		AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
		ModuloixDet01 seleccion = (ModuloixDet01) info.targetView.getTag();
		
		 valor = Util.getInt(seleccion.c9p901_id);
//		 
		 Log.e ("valoxxxxx", valor +"");

		if (item.getGroupId() == 0) {
			switch (item.getItemId()) {
			case 1:
				editVisit(seleccion, ACCION.EDIT);
				return true;
			}
		} else if (item.getGroupId() == 1) {
			switch (item.getItemId()) {
			case 1:
				dc = new DialogComponent(getActivity(), this,
						TIPO_DIALOGO.YES_NO, getResources().getString(
								R.string.app_name),
						"Desea Eliminar el producto?");
				action = ACCION.DELETE;
				dc.put("obj", seleccion);
				dc.showDialog();
				break;
			}
		}

		return true;
	}

	@Override
	protected View createUI() {
		buildFields();
		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.c2c100m9p901,  btnIniciar,
				tcCap.getTableView());
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);
		return contenedor;
	}

	public void reloadData(ModuloixDet01 visita, int opcion) {
		switch (opcion) {
		case 1:
			if (lstData.size() < visita.c9p901_id.intValue()) {
				lstData.add(visita);
				tcCap.getData().add(visita);
				setBorder();
			}
			break;
		case 2:
			removeObject(visita);
			break;
		default:
			break;
		}
		tcCap.reloadData();
	}

	private void removeObject(ModuloixDet01 detalle) {
		if (lstData.size() > 0) {
			for (int x = 0; x < lstData.size(); x++) {
				if (lstData.get(x).c9p901_id.equals(detalle.c9p901_id)) {
					lstData.remove(x);
					tcCap.getData().remove(x);
				}
			}
		}
	}

	private void deleteVisit(ModuloixDet01 visit) {
		try {
			
			recargarLista();
			getCuestionarioService().borrarDet01(visit);
			recargarLista();

		} catch (SQLException e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
		}
	}

	private void tryAddVisit(final ACCION accion) {
		addVisit(accion);
	}

	
	private int getMaxId(){
		int max = 0;
		if(!lstData.isEmpty()){
			for (int i = 0; i < lstData.size(); i++) {
				Log.e ("Util.getInt(lstData.get(i).c9p901_id)", Util.getInt(lstData.get(i).c9p901_id, 99) + "");
					max = Util.getInt(lstData.get(i).c9p901_id)  ;				
			}
		}
		return max == 0 ? 1 : max + 1;
	}
	
	
	private void addVisit(ACCION accion) {
		Log.e ("getMaxId()", getMaxId() + "");
		maintenanceVisit(new ModuloixDet01(caratula.id,getMaxId()),
				accion);
	}
		
	
	private void editVisit(ModuloixDet01 visita, ACCION accion) {
		maintenanceVisit(visita, accion);
	}

	private void maintenanceVisit(ModuloixDet01 moduloixDet01, ACCION accion) {
		FragmentManager fm = Mod_IX_Fragment_001.this.getFragmentManager();
		Mod_IX_Fragment_001_01 aperturaDialog = Mod_IX_Fragment_001_01
				.newInstance(Mod_IX_Fragment_001.this,  moduloixDet01,
						getCuestionarioService(),accion);
		aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		aperturaDialog.show(fm, "aperturaDialog");
	}

	@Override
	public boolean grabar() {
		if (!validar()) {
			if (error) {
				if (!mensaje.equals(""))
					ToastMessage.msgBox(this.getActivity(), mensaje,
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				if (view != null)
					view.requestFocus();
			}
			return false;
		}

		return true;
	}

	private boolean validar() {
		if (FragmentForm.DISABLED)
			return true;
		error = false;

//		if (lstData.size() == 0) {
//			mensaje = "Debe ingresar m�nimo un producto para poder continuar";
//			error = true;
//			return false;
//		}

		return true;
	}

	@Override
	public void cargarDatos() {
		caratula = App.getInstance().getEmpresa();
		recargarLista();
		setBorder();
		entityToUI(caratula);
		inicio();
	}
	
	
	public void recargarLista() {
		lstData = getCuestionarioService().getDet01s(
				caratula,
				caratula.getSecCap(
						getListFields(new ModuloixDet01(),
								new String[] { "id" }), false));
		tcCap.setData(lstData,  "c9p901_2", "c9p901_3", "c9p901_4",
				"c9p901_5");
		setBorder();
	}


	private void inicio() {
		tcCap.requestFocus();

		if (App.ONLY_VISUALITATION) {
	
		}
	}

	private void setBorder() {
		for (int i = 0; i < lstData.size(); i++) {
			if (!Util.esVacio(lstData.get(i).id))
				tcCap.setBorderRow(i);
			else
				tcCap.setBorderRow(i, false);
		}
	}

	@Override
	public boolean getSaltoNavegation() {
		return validar();
	}

	@Override
	public void onAccept() {
		switch (action) {
		case RESUMEN:
			action = null;
			App.ONLY_VISUALITATION = true;
			return;
		case DELETE:
			ModuloixDet01 obj = (ModuloixDet01) dc.get("obj");
			if (obj != null)
				deleteVisit(obj);
			action = null;
			return;
		default:
			action = null;
			break;
		}
	}

	@Override
	public void onCancel() {
		action = null;
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public static LinearLayout createTitle(Context context, View view,
			View... views) {
		LinearLayout ly = createLY(context, LinearLayout.VERTICAL);
		for (View v : views) {
			ly.addView(_this.createQuestionSection(v));
		}
		ly.addView(view);
		return ly;
	}

	public static LinearLayout createLY(Context context, int orientacion) {
		LinearLayout ly = new LinearLayout(context);
		LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT);
		ly.setLayoutParams(llp);
		ly.setOrientation(orientacion);
		ly.setBackgroundColor(_this.getResources().getColor(
				COLOR_LINEA_SECCION_PREGUNTA));
		return ly;
	}
}

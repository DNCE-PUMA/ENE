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
import gob.inei.ene2019v2.fragment.ModIX.dialog.Mod_IX_Fragment_003_01;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.ModuloixDet01;
import gob.inei.ene2019v2.model.ModuloixDet02;
import gob.inei.ene2019v2.model.ModuloixDet03;
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
public class Mod_IX_Fragment_003 extends FragmentForm implements Respondible {

	private TableComponent tcCap;
	private LabelComponent lblTitulo, lblsubTitulo;
	public List<ModuloixDet03> lstData;
	public List<ModuloixDet02> lstData2;
	private GridComponent grid;
	public static Mod_IX_Fragment_003 _this;
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

	public Mod_IX_Fragment_003() {
	}

	public Mod_IX_Fragment_003 parent(MasterActivity parent) {
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
				.size( MATCH_PARENT, MATCH_PARENT).text(R.string.Capitulo900)
				.textSize(21).centrar().negrita();
		lblsubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT)
				.text(R.string.c2c100m9p003_titulo).textSize(21).centrar()
				.negrita();
		tcCap = new TableComponent(getActivity(), this, App.ESTILO, true)
				.size(600, 750).headerHeight(120).dataColumHeight(75)
				.headerTextSize(App.HTST);
	//	tcCap.addHeader(R.string.c900_num, 0.5f);
		tcCap.addHeader(R.string.c2c100m9p003_2, 2.5f);
		tcCap.addHeader(R.string.c2c100m9p003_3, 1f);
		tcCap.setCellColor(-1, 1, true);

		btnIniciar = new ButtonComponent(getActivity(), App.ESTILO_BOTON).text(
				R.string.c2c100m9p003_add).size(200, 60);
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
			menu.add(0, 1, 1, "Editar Material Auxiliar");
			menu.add(1, 1, 1, "Eliminar Material Auxiliar");
			AdapterContextMenuInfo info = (AdapterContextMenuInfo) menuInfo;
			try {
//				if (info.position != lstData.size() - 1
//						|| App.ONLY_VISUALITATION) {
//					menu.removeGroup(1);
//				}

			} catch (ClassCastException e) {
			}
		}

		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if (!getUserVisibleHint())
			return false;
		AdapterContextMenuInfo info = (AdapterContextMenuInfo) item
				.getMenuInfo();
		ModuloixDet03 seleccion = (ModuloixDet03) info.targetView.getTag();

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
						"Desea Eliminar el Registro de Materiales Auxiliares o Suministros?");
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
		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
		q1 = createQuestionSection(R.string.c2c100m9p903, btnIniciar,
				tcCap.getTableView());
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);
		return contenedor;
	}

	public void reloadData(ModuloixDet03 visita, int opcion) {
		switch (opcion) {
		case 1:
			if (lstData.size() < visita.c9p903_id.intValue()) {
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
		// App.getInstance().setVisitas(lstData);
		tcCap.reloadData();
	}

	private void removeObject(ModuloixDet03 detalle) {
		if (lstData.size() > 0) {
			for (int x = 0; x < lstData.size(); x++) {
				if (lstData.get(x).c9p903_id.equals(detalle.c9p903_id)) {
					lstData.remove(x);
					tcCap.getData().remove(x);
				}
			}
		}
	}

	private void deleteVisit(ModuloixDet03 visit) {
		try {
			recargarLista();
			getCuestionarioService().borrarDet03(visit);
			recargarLista();
			//reloadData(visit, 2);
			// grabarCaratula();
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
				Log.e ("Util.getInt(lstData.get(i).c9p903_id)", Util.getInt(lstData.get(i).c9p903_id, 99) + "");
					max = Util.getInt(lstData.get(i).c9p903_id)  ;				
			}
		}
		return max == 0 ? 1 : max + 1;
	}
	
	private void addVisit(ACCION accion) {
		maintenanceVisit(new ModuloixDet03(caratula.id,getMaxId()),
				accion);
	}

	private void editVisit(ModuloixDet03 visita, ACCION accion) {
		maintenanceVisit(visita, accion);
	}

	private void maintenanceVisit(ModuloixDet03 moduloixDet03, ACCION accion) {
		FragmentManager fm = Mod_IX_Fragment_003.this.getFragmentManager();
		Mod_IX_Fragment_003_01 aperturaDialog = Mod_IX_Fragment_003_01
				.newInstance(Mod_IX_Fragment_003.this, moduloixDet03,
						getCuestionarioService(), accion);
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

//		if (lstData.size() == 0 && lstData2.size() == 0) {
//			mensaje = "Debe ingresar al menos una materia prima o material para poder continuar";
//			error = true;
//			return false;
//		}

		// if (lstData.size() > 0 && lstData2.size() > 0) {
		// mensaje =
		// "“Error: Debe existir registros de 2 o de 3, pero no los 2 a la vez”";
		// error = true;
		// return false;
		// }

		return true;
	}

	@Override
	public void cargarDatos() {
		caratula = App.getInstance().getEmpresa();
		lstData2 = getCuestionarioService().getDet02s(
				caratula,
				caratula.getSecCap(
						getListFields(new ModuloixDet02(),
								new String[] { "id" }), false));
		recargarLista();
		setBorder();
		entityToUI(caratula);
		inicio();
	}
	
	public void recargarLista() {
		lstData = getCuestionarioService().getDet03s(
				caratula,
				caratula.getSecCap(
						getListFields(new ModuloixDet03(),
								new String[] { "id" }), false));
		tcCap.setData(lstData, /* "c9p903_id",*/ "c9p903_2", "c9p903_3");
		setBorder();
	}


	private void inicio() {
		tcCap.requestFocus();

		if (App.ONLY_VISUALITATION) {
//			grid.setVisibility(View.GONE);
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
			ModuloixDet03 obj = (ModuloixDet03) dc.get("obj");
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

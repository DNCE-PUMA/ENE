package gob.inei.ene2019v2.fragment.ModIX.dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.ImageComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_001;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_001.ACCION;
import gob.inei.ene2019v2.model.ModuloixDet01;
import gob.inei.ene2019v2.model.UN;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Mod_IX_Fragment_001_01 extends DialogFragmentComponent  {
	public interface Mod_IX_Fragment_00X_01Listener {
		void onFinishEditDialog(String inputText);
	}

	@FieldAnnotation(orderIndex = 1)
	public TextField txtC9P901_2;	
	@FieldAnnotation(orderIndex = 2)
	public TextField txtC9P901_3_COD;	
	@FieldAnnotation(orderIndex = 3)
	public TextField txtC9P901_3;	
	@FieldAnnotation(orderIndex = 4)
	public ButtonComponent imgC1;
	@FieldAnnotation(orderIndex = 5)
	public ImageComponent imgE;
	@FieldAnnotation(orderIndex = 6)
	public IntegerField txtC9P901_4;
	@FieldAnnotation(orderIndex = 7)
	public IntegerField txtC9P901_5;
	@FieldAnnotation(orderIndex = 8)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 9)
	public ButtonComponent btnCancelar;
	private static Mod_IX_Fragment_001 caller;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7;
	private ModuloixDet01 detalle;
	private LabelComponent lblTitulo, lblSecProxV;
	private DialogComponent dlg;
	private ACCION accion;
	private CuestionarioService cuestionarioService;
	private int buscado = 0;
	public GridComponent grEspe01;
	
	private enum ACTION {
		COBERTURA, VALIDAR
	}

	private ACTION action;

	public static Mod_IX_Fragment_001_01 newInstance(FragmentForm pagina,
			ModuloixDet01 detalle, CuestionarioService cuestService, 
			Mod_IX_Fragment_001.ACCION accion) {
		caller = (Mod_IX_Fragment_001) pagina;
		Filtros.clear();
		Mod_IX_Fragment_001_01 f = new Mod_IX_Fragment_001_01();
		f.setParent(pagina);
		f.cuestionarioService = cuestService;
		f.accion = accion;
		Bundle args = new Bundle();
		args.putSerializable("detalle", detalle);
		f.setArguments(args);
		return f;
	}

	public Mod_IX_Fragment_001_01() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		detalle = (ModuloixDet01) getArguments().getSerializable("detalle");
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View rootView = createUI();
		getDialog().setTitle( detalle.c9p901_2 ==  null ? "" : "Producto : " + detalle.c9p901_2 );
		initObjectsWithoutXML(this, rootView);

		cargarDatos();
		enlazarCajas(this);
		listening();

		return rootView;

	}

	private void cargarDatos() {
		entityToUI(detalle);
		caretaker.addMemento("antes",
				detalle.saveToMemento(ModuloixDet01.class));
		inicio();
	}

	private void inicio() {
			
		
		Log.e("XXXXXXXXXXXXXXXXXXX ", "" + detalle.c9p901_3_cod);
		txtC9P901_2.requestFocus();
		
		if (Util.getInt(txtC9P901_3_COD)< 888 ){
			 txtC9P901_3.readOnly();
			
		}
		
	  	
	}

	@Override
	protected View createUI() {
		buildFields();

		q2 = createQuestionSection(R.string.c2c100m9p001_3, txtC9P901_2);
		q5 = createQuestionSection(R.string.c2c100m9p001_4, grEspe01.component());
		q6 = createQuestionSection(R.string.c2c100m9p001_5, txtC9P901_4);
		q7 = createQuestionSection(R.string.c2c100m9p001_6, txtC9P901_5);

		LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q2);
		form.addView(q5);
		form.addView(q6);
		form.addView(q7);
		form.addView(botones);

		return contenedor;
	}
	

	@Override
	protected void buildFields() {

		lblSecProxV = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.lb_V_Proxima)
				.textSize(21).centrar().negrita();

		txtC9P901_2 = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique).negrita();
		txtC9P901_3_COD = new TextField(this.getActivity(), false)
				.size(altoComponente, 150).negrita().soloTextoNumero().readOnly();
		txtC9P901_3 = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).negrita();
		txtC9P901_4 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().negrita();
		txtC9P901_5 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().negrita().maxLength(10);

		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Mod_IX_Fragment_001_01.this.dismiss();
			}
		});
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean flag = grabar();
				if (!flag) {
					return;
				}
				Mod_IX_Fragment_001_01.this.dismiss();
			//	caller.reloadData(detalle, 1);
				caller.recargarLista();
			//	nextPage();
			}
		});

		imgC1 = new ButtonComponent(this.getActivity())
		.size(70, altoComponente + 10).drawableLeft(App.SEARCH)
		.padding(15, 0, 0, 0);
		imgC1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				search();
			}
		});

		
		imgE = new ImageComponent(this.getActivity(), R.drawable.eliminar,
				R.drawable.eliminar).size(64, 64);
		imgE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC9P901_3_COD.setText("");
				txtC9P901_3.setText("");
			}
		});
		
		
		grEspe01 = new GridComponent(this.getActivity(), 4);
		grEspe01.colorFondo(android.R.color.transparent);
		grEspe01.addComponent(txtC9P901_3_COD);
		grEspe01.addComponent(txtC9P901_3);
		grEspe01.addComponent(imgC1);
		grEspe01.addComponent(imgE);

		
		Filtros.setFiltro(txtC9P901_2, Filtros.TIPO.ALFAN_U, 300,  new char[]{'\n','.',',','+','-','*','/','=','(',')'});
		Filtros.setFiltro(txtC9P901_4, Filtros.TIPO.NUMBER, 8, -1, null, 1,
				99999998);
		Filtros.setFiltro(txtC9P901_5, Filtros.TIPO.NUMBER, 9, -1, null, 1,
				999999998);
	}

	private void nextPage() {
		FragmentManager fm = caller.getFragmentManager();
		Mod_IX_Fragment_001_02 aperturaDialog = Mod_IX_Fragment_001_02
				.newInstance(caller, detalle, cuestionarioService, accion);
		aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		aperturaDialog.show(fm, "aperturaDialog");

	}

	private boolean validar() {
		error = false;
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (Util.esVacio(txtC9P901_2)) {
			mensaje = pregunta_no_vacia.replace("$", "Nombre de producto");
			view = txtC9P901_2;
			return !(error = true);
		}
				
		if (Util.esVacio(txtC9P901_3_COD)) {
			mensaje = pregunta_no_vacia.replace("$", " Cod Unidad de Medida");
			view = txtC9P901_3_COD;
			return !(error = true);
		}
		
		
		if (Util.esVacio(txtC9P901_3)) {
			mensaje = pregunta_no_vacia.replace("$", "Unidad de Medida");
			view = txtC9P901_3;
			return !(error = true);
		}
				
		
		if (Util.esVacio(txtC9P901_4)) {
			mensaje = pregunta_no_vacia.replace("$", "Cantidad");
			view = txtC9P901_4;
			return !(error = true);
		}
		if (Util.esVacio(txtC9P901_5)) {
			mensaje = pregunta_no_vacia.replace("$", "Valor de venta");
			view = txtC9P901_5;
			return !(error = true);
		}
		
		
		if (Util.getInt(txtC9P901_4) > 10    &&  ( Util.getInt(txtC9P901_5) == 0   || Util.getInt(txtC9P901_5) < 10  )   ){
			mensaje = "Error: productos comercializados y valor de venta es 0 o menor a 10 soles";
			view = txtC9P901_4;
			error = true;
			return false;
		}
		


		return true;
	}

	private boolean grabar() {
		if (!validar()) {
			if (error) {
				if (!mensaje.equals("")) {
					ToastMessage.msgBox(this.getActivity(), mensaje,
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
				if (view != null) {
					view.requestFocus();
				}
			}
			return false;
		}
		savePag(-1);

		return true;
	}

	private void savePag(Integer cod) {
		uiToEntity(detalle);
		try {
			saveVisita(detalle);
		} catch (Exception e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
		}
	}

	private void saveVisita(ModuloixDet01 detalle) throws SQLException {
		detalle.c9p901_2cd = detalle.c9p901_id;
		Log.e("detalle.c9p901_id", detalle.c9p901_id + "");
		if (!cuestionarioService.saveOrUpdate(detalle, detalle.getSecCap(caller
				.getListFields(this, new String[] { "C9P901_2CD" })))) {
			ToastMessage.msgBox(this.getActivity(),
					"Los datos no se guardaron", ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
		} else {
			caller.recargarLista();
			//caller.reloadData(detalle, 1);
			// caller.grabarCaratula();
		}
	}
	

	
	public void search() {
		FragmentManager fm = this.getFragmentManager();
		Buscar_unidades_medida aperturaDialog = Buscar_unidades_medida.newInstance(this, "Buscar1");
		aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		aperturaDialog.show(fm, "aperturaDialog");
	}
	
	
	
	public void seleccionarUM(UN seleccionado) {
		if (seleccionado == null) {
			ToastMessage.msgBox(this.getActivity(),
					"No seleccionó ninguna Unidad de Medida.",
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
			return;
		}		
		
		Log.e ("entr","ooo");
			txtC9P901_3_COD.setText(Util.getText(seleccionado.codigo));
			txtC9P901_3.setText(Util.getText(seleccionado.nombre));
			txtC9P901_3.readOnly();
		//	txtCIIU_S3_DESC.setText(s.descripcion);
			//txtC9P901_3.requestFocus();
	
			
			if (seleccionado.codigo.equals("888")) {
				txtC9P901_3.setText("");
				txtC9P901_3.requestFocus();
				txtC9P901_3.readOnly(false);
			}

	}
	
	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
	
	
	

}

package gob.inei.ene2019v2.fragment;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.EntityEPE.SeccionCapitulo;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.TableComponent.ALIGN;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.CCPP;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Caratula_Fragment_buscar_centros extends
		DialogFragmentComponent implements Respondible {

	@FieldAnnotation(orderIndex = 1)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 2)
	public ButtonComponent btnCancelar;
	public TableComponent tcCentros;
	private List<CCPP> listadoccpp;
	private static Caratula_Fragment_001 caller;
	private CuestionarioService service;
	private LabelComponent lblSubtitulo, lblTitulo;
	private CCPP seleccionado;
	SeccionCapitulo[] secciones;
	public static String codccdd;
	public static String codccpp;
	public static String codccdi;
	LinearLayout q0, q1, q2, q3, q4;
	// C3_Cap03_03 c3_cap03_03;
	private CuestionarioService cuestionarioService;
	// private CPV0301_DET_01 bean;

	// CPV0301_DET_01 cpv0301_det_01;
	TC_ClickListener listener;

	public static Caratula_Fragment_buscar_centros newInstance(
			Caratula_Fragment_001 pagina, String ccdd , String ccpp,  String ccdi) {
		caller = (Caratula_Fragment_001) pagina;
		Caratula_Fragment_buscar_centros f = new Caratula_Fragment_buscar_centros();
		f.setParent(pagina);
		Bundle args = new Bundle();
		// args.putSerializable("bean", bean);
		f.setArguments(args);
		codccdd= ccdd;
		codccpp= ccpp;
		codccdi= ccdi;
		return f;
	}

	public Caratula_Fragment_buscar_centros() {
		super();
	
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// bean = (Detalle2) getArguments().getSerializable("bean");
		// bean = (CPV0301_DET_01) getArguments().getSerializable("bean");
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getDialog().setTitle("Ingrese el Nombre del Centro Poblado" );
		final View rootView = createUI();
		initObjectsWithoutXML(this, rootView);
		listener = new TC_ClickListener();
		tcCentros.getListView().setOnItemClickListener(listener);
		cargarDatos();
		enlazarCajas();
		listening();
		return rootView;

	}


	@Override
	public void onDismiss(DialogInterface dialog) {
		// caller.refrescarTabla();
		// caller.tcCapPersonas.getListView().requestFocus();
	}


	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */
		q1 = createQuestionSection(tcCentros.getTableView());	
		tcCentros.setSelectorData(R.drawable.selector_sombra_lista);
		LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);
		
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q1);
		form.addView(botones);

		return contenedor;
	}

	@Override
	protected void buildFields() {
	
		tcCentros = new TableComponent(getActivity(), this, App.ESTILO)
				.size(530, 750).headerHeight(90).dataColumHeight(65).filter("nomccpp");
		tcCentros.setHeaderTextSize(12);
		tcCentros.addHeader(R.string.codigo, 0.6f);
		tcCentros.addHeader(R.string.centro_poblado, 3f,ALIGN.LEFT);
		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);

		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (grabar()) {
					Caratula_Fragment_buscar_centros.this.dismiss();
				}
			}
		});

		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			//	hogarm.restoreFromMemento(caretakerEPE.get("antes"));				
				Caratula_Fragment_buscar_centros.this.dismiss();
			}
		});
		
		

	}
	
	
	private void cargarDatos() {		
		inicio();
	}
	
	
	public void cargarTabla(String ccdd, String ccpp,  String ccdi) {
		
//		Log.e("ccdd", ccdd + "");
//		Log.e("ccdd", ccpp + "");
//		Log.e("ccdd", ccdi + "");
		listadoccpp = getCuestionarioService().getCCPP(ccdd, ccpp, ccdi);
		
		tcCentros.setData(listadoccpp, "codccpp", "nomccpp");

		// for (int i = 0; i < detalles100m.size(); i++) {
		// tcPersonas100m.setBorderRow(i, obtenerEstado(detalles100m.get(i)));
		// }
	}

	private CuestionarioService getService() {
		if (service == null) {
			service = CuestionarioService.getInstance(getActivity());
		}
		return service;
	}

	private boolean grabar() {
		// uiToEntity(bean);
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
		return true;
	}

	private boolean validar() {
		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);
		if (seleccionado == null) {
			ToastMessage.msgBox(this.getActivity(),
					"No selecciono ningún Centro de Poblado", ToastMessage.MESSAGE_INFO,
					ToastMessage.DURATION_LONG);
			return false;
		}
		return true;
	}

	private void inicio() {
		cargarTabla(codccdd, codccpp, codccdi);
	
	}
	
	

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
	
    @SuppressLint("ResourceAsColor") 
	private class TC_ClickListener implements OnItemClickListener {

		public TC_ClickListener() {
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			seleccionado = (CCPP) tcCentros.getAdapter().getItem(arg2);
			Log.e("clck",seleccionado.toString());
			tcCentros.resetCellColor();
			tcCentros.setCellColor(arg2, -1, R.color.amarillo, true);
			getDialog().setTitle("Selecc: "+seleccionado.codccpp.toString()  + " - " + seleccionado.nomccpp );
		}
	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAccept() {
		// TODO Auto-generated method stub
		
	}
	
	
}

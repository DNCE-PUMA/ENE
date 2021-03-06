package gob.inei.ene2019v2.fragment.ModIII.dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.ImageComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_002;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_002.DETALLES;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_III_Fragment_02_det  extends DialogFragmentComponent {


    @FieldAnnotation(orderIndex = 1)
    public IntegerField txtC3P302A;
    @FieldAnnotation(orderIndex = 2)
    public IntegerField txtC3P302B;
    @FieldAnnotation(orderIndex = 3)
    public IntegerField txtC3P302C;
	@FieldAnnotation(orderIndex = 4)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 5)
	public ButtonComponent btnCancelar;
	
	public ImageComponent btnOmisionH;
	public ImageComponent btnOmisionM;
	

	private static int OMISION = 99999;
	
	private int sizeWidth = 750, sizeHeigth = MATCH_PARENT;
	private GridComponent2 grid1, grid2, grid3, grid4;
	private LabelComponent lbl121, lbl122, lbl131, lbl132, lbl141, lbl142,lbl145,lbl145_1,lbl146,lbl150,lbl150_1,
			lbl151, lbl152,lbl141t;
	private CuestionarioService cuestionarioService;
	private static Mod_III_Fragment_002 caller;
	
//	MyTextWatcher2 mtw2;	
//	MyTextWatcher3 mtw3;	
	private DETALLES detalle;
//	private List<C2_Cap02_04_det> lstClone;
	SeccionCapitulo[] campos;
	private LabelComponent lblTitulo,lblCab1,lblCab2,lblCab3,lblCab4,lblCab5;
	Integer index;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q12, q9, q11;
	public Moduloiii01 bean;
	SeccionCapitulo[] seccionesGrabado;
	private static Mod_III_Fragment_02_det _this;

	public Mod_III_Fragment_02_det() {
	}

	public static Mod_III_Fragment_02_det newInstance(FragmentForm pagina,
			DETALLES detalles, int index, Moduloiii01 bean) {
		caller = (Mod_III_Fragment_002) pagina;
		Filtros.clear();
		Mod_III_Fragment_02_det f = new Mod_III_Fragment_02_det();
		f.setParent(pagina);
		Bundle args = new Bundle();
		f.index = index;
		args.putSerializable("detalle", detalles);
		args.putSerializable("Moduloiii01", bean);
		f.setArguments(args);
		return f;
	}
	


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		detalle = (DETALLES) getArguments().getSerializable("detalle");
		//bean = (bean) getArguments().get("bean");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// getDialog().setTitle("DATOS: "+detalle.nombre);
		getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
		final View rootView = createUI();
		_this = this;
		initObjectsWithoutXML(this, rootView);
		
		cargarDatos();
		enlazarCajas(this);
		setCalculo();
		listening();
		
		return rootView;
	}

	@Override
	protected void buildFields() {

		lblTitulo = new LabelComponent(this.getActivity())
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(detalle.nombre).textSize(20).negrita().centrar();

		lblCab1 = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(100, 450).text("N� de trabajadores 2018")
		.textSize(15).negrita().centrar();
		
		lblCab2 = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(100, 150).text("Total")
		.textSize(15).negrita().centrar();
		lblCab3 = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(70, 150).text("Hombres")
		.textSize(15).negrita().centrar();
		lblCab4 = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(70, 150).text("Mujeres")
		.textSize(15).negrita().centrar();

		
//		txtC3P302B  = new IntegerField(this.getActivity(), false).size(
//				altoComponente, 100).centrar();
//		txtC3P302B.addTextChangedListener(twFuncionBloqueo);
//		txtC3P302C  = new IntegerField(this.getActivity(), false).size(
//				altoComponente, 100).centrar();
//		txtC3P302C.addTextChangedListener(twFuncionBloqueo);
//		txtC3P302A = new IntegerField(this.getActivity(), false)
//		.size(altoComponente, 100).centrar().negrita();
		
		
		txtC3P302A = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar().maxLength(5);
		txtC3P302B = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar().maxLength(5);
		txtC3P302B.addTextChangedListener(twFuncionBloqueo);
		txtC3P302C = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar().maxLength(5);
		txtC3P302C.addTextChangedListener(twFuncionBloqueo);
		
	
		btnOmisionH = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(60,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B.setText(Util.getText(OMISION));
			//	txtC3P302A.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(60,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C.setText(Util.getText(OMISION));
			//	txtC3P302A.setText(Util.getText(OMISION));
			}
		});

		
		grid2 = new GridComponent2(this.getActivity(), Gravity.CENTER, 5);
		grid2.addComponent(lblCab1,5);
		
		grid2.addComponent(lblCab2);
		grid2.addComponent(lblCab3,2);
		grid2.addComponent(lblCab4,2);
		
		grid2.addComponent(txtC3P302A);		
		grid2.addComponent(txtC3P302B);	
		grid2.addComponent(btnOmisionH);
		grid2.addComponent(txtC3P302C);	
		grid2.addComponent(btnOmisionM);
		grid2.component();
		
		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// detalle.detalle.clear();
				// detalle.lstDataDet.addAll(lstClone);
				
				caller.refrescarTabla();
				Mod_III_Fragment_02_det.this.dismiss();
				
				int suma = Util.getInt(txtC3P302B) + Util.getInt(txtC3P302C);
				if (suma == 0) {
					grabarCancelar();
					caller.refrescarTabla();
					Mod_III_Fragment_02_det.this.dismiss();
				} else {
					Mod_III_Fragment_02_det.this.dismiss();
				}
			}
		});
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				save();
				caller.refrescarTabla();
			//	caller.dismissDialog(index);
			}
		});

		Filtros.setFiltro(txtC3P302B, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302C, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
	//	Filtros.setFiltro(txtC3P302A, Filtros.TIPO.NUMBER, 6, -1, null, 0,999998);


	}
	
	

	public boolean grabarCancelar() {
		uiToEntity(detalle.detalle);
		detalle.detalle.c3p302b = null;
		detalle.detalle.c3p302c = null;
		detalle.detalle.c3p302a = null;
		
		try {

			if (!getCuestionarioService().saveOrUpdate(
					detalle.detalle,
					detalle.detalle.getSecCap(Util.getListList("C3P302_ID",
							"C3P302_ID_ETIQ", "C3P302B", "C3P302C",
							"C3P302A")))) {
				ToastMessage.msgBox(this.getActivity(),
						"Los datos no se guardaron dia",
						ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
				return false;
			}
		} catch (SQLException e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
			return false;
		}

		return true;
	}


	@Override
	protected View createUI() {
		buildFields();
		q0 = createQuestionSection(lblTitulo);

		q1 = createQuestionSection(	grid2);
//		q2 = createQuestionSection(R.string.c3_cap02_04_1_4,
//				rgDDOC_04_001_3_INI19);

		LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
//		form.addView(q2);
		form.addView(botones);

		return contenedor;
	}

	private void save() {
		boolean flag = grabar();
		if (!flag) {
			return;
		}
		Mod_III_Fragment_02_det.this.dismiss();
	}

	private boolean grabar() {
		uiToEntity(detalle.detalle);
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
		try {
//			Log.e("el indice", String.valueOf(index));
//			Log.e("mira mira", String.valueOf(bean.ddoc_04_001_ini19));
//			Log.e("mira mira2", String.valueOf(bean.ddoc_04_002_ini19));
//			if(index<6){
//				bean.ddoc_04_001_ini19=1;
//				seccionesGrabado = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "DDOC_04_001_INI19") };
//			}
//			if(index>=6){
//				bean.ddoc_04_002_ini19=1;
//				seccionesGrabado = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "DDOC_04_002_INI19") };
//			}
			
//			if (!getCuestionarioService().saveOrUpdate(bean,
//					seccionesGrabado)) {
//				ToastMessage.msgBox(this.getActivity(),
//						"Los datos no pudieron ser guardados.",
//						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_SHORT);
//				return false;
//			}

			if (!getCuestionarioService().saveOrUpdate(
					detalle.detalle,
					detalle.detalle.getSecCap(Util.getListList("C3P302_ID",
							"C3P302_ID_ETIQ", "C3P302B", "C3P302C",
							"C3P302A"  )))) {
				ToastMessage.msgBox(this.getActivity(),
						"Los datos no se guardaron dia",
						ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
				return false;
			} else {
			//	caller.reloadData();
			}
		} catch (SQLException e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
			return false;
		}
		return true;
	}

	private boolean validar() {
		error = false;
		
		if (!isInRange()) {
			return false;
		}
		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);
		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
		
		
		if (Util.esVacio(txtC3P302A) ) {
			mensaje = preguntaVacia.replace("$",  "Total Trabajadores ");
			view = txtC3P302A;
			error = true;
			return false;
		}

		
		if (Util.esVacio(txtC3P302B) ) {
			mensaje = preguntaVacia.replace("$", "Trabajadores Hombres");
			view = txtC3P302B;
			error = true;
			return false;
		}

		if (Util.esVacio(txtC3P302C) ) {
			mensaje = preguntaVacia.replace("$", "Trabajadores Mujeres");
			view = txtC3P302C;
			error = true;
			return false;
		}
		
		
		int Total = Util.getInt(txtC3P302B.getText().toString()) + Util.getInt(txtC3P302C.getText().toString()) ;
		
		if ( Util.getInt(txtC3P302B.getText().toString()) != OMISION  && Util.getInt(txtC3P302C.getText().toString()) != OMISION ) {
			if (Util.getInt(Total) != Util.getInt(txtC3P302A.getText().toString())  ) {
				mensaje = "La suma no concuerda ";
				view = txtC3P302B;
				error = true;
				return false;
			}
			if (Util.getInt(txtC3P302A.getText().toString()) == OMISION ) {
				mensaje = "Valor ingresado esta fuera del rango, Los valores permitidos van desde 0 hasta 99998 ";
				view = txtC3P302A;
				error = true;
				return false;
			}
		}
				
		
		if (Util.getInt(Total) == 0) {
			mensaje = "la suma de hombres y mujeres no puede ser 0 ";
			view = txtC3P302B;
			error = true;
			return false;
		}
		
		
	

		return true;
	}

	private void cargarDatos() {

	//	lstClone = new ArrayList<C2_Cap02_04_det>();
		//lstClone.add((C2_Cap02_04_det) detalle.detalle);
		entityToUI(detalle.detalle);

		inicio();
	}

	private void inicio() {
		txtC3P302B.requestFocus();
		

	}
	

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
	
	private TextWatcher twFuncionBloqueo = new TextWatcher() {

		@Override
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
		}

		@Override
		public void afterTextChanged(Editable s) {

			if (!Util.esVacio(txtC3P302B) || !Util.esVacio(txtC3P302C)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B) ? 0 : Util.getInt(txtC3P302B.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C) ? 0 : Util.getInt(txtC3P302C.getText().toString())); 
			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 
				
				 if (Util.getInt(txtC3P302B) == OMISION && Util.getInt(txtC3P302C) == OMISION) {
						Log.e ("p" ,"limpia omision");
						txtC3P302A.setReadOnly(false);
					//	txtC3P302A.setText(Util.getText(""));
				    //	txtC3P302A.readOnly(false);
				 }
				 else{
					 Log.e ("p" ,"pone omision");
						txtC3P302A.setText(Util.getText(OMISION));
					//	txtC3P302A.readOnly(true);
						
					 if (Util.getInt(txtC3P302B) != OMISION && Util.getInt(txtC3P302C) != OMISION) {	
						 txtC3P302A.setText( Util.getText(total) ) ;
						// txtC3P302A.readOnly(true);
					 }
				 }
				
			}	else{
				Log.e ("Los","dos son vacios");	
				txtC3P302A.setText("");
				txtC3P302A.setReadOnly(true);				

		}	
	
		}
	};
	
	private void setCalculo() {
//		Log.e ("valor de  301a1x", "xxx" + "");
//		Log.e ("valor de  301a1x", txtC3P302B.getText() + "");
//		Log.e ("valor de  301a2x", txtC3P302C.getText() + "");
//		Log.e ("valor de  301a1", Util.getInt(txtC3P302B) + "");
//		Log.e ("valor de  301a2", Util.getInt(txtC3P302C) + "");
//		if (Util.getInt(txtC3P302B) != OMISION  && Util.getInt(txtC3P302C) != OMISION   ){
//			Log.e ("valor de o 301a1", Util.getInt(txtC3P302B) + "");
//			Log.e ("valor de o 301a2", Util.getInt(txtC3P302C) + "");
//			
//			Calculo<IntegerField> op1 = new Calculo<IntegerField>(caller,
//					txtC3P302A, 0, 0, Util.getListList(txtC3P302B,txtC3P302C));
//			op1.setConfOperacion();		
//		//	txtC3P302A.readOnly(true);
//		}else{
//			Log.e ("alguno es ","omision");
//		//	txtC3P302A.readOnly(false);
//		}

	}	
	
}
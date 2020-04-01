package gob.inei.ene2019v2.fragment.ModIV.Dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.ImageComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_002;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_002.P3Det;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.util.List;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Mod_IV_Fragment_02_01 extends DialogFragmentComponent {
	public interface C002Fragment_001_01Listener {
		void onFinishEditDialog(String inputText);
	}

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField  rgC4P404B;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC4P404C;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField  rgC4P404D;
	@FieldAnnotation(orderIndex = 4)
	public IntegerField txtC4P404E;
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField  rgC4P404F;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField  rgC4P404G;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtC4P404G_ESP;

	@FieldAnnotation(orderIndex = 8)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 9)
	public ButtonComponent btnCancelar;
	public ImageComponent btnNext;
	public ImageComponent btnBack;
	private CuestionarioService cuestionarioService;
	private Caratula bean2;
	private List<P3Det> detalles;
	Integer index;
	private LinearLayout q1, q3, q2, q0, q4, q5, q6, q7, q11, q9, q10;
	private static Mod_IV_Fragment_002 caller;
	private LabelComponent lblTitulo;	
	private LabelComponent lblgrid1, lblgrid2, lblgrid3,lblgrid4, lblgrid5, lblgrid6,lblgrid7, lblgrid8,lblgridn,lblgridi;
	private LabelComponent  lblSubTitulo, lblM4P004, lblM4P005;
	private P3Det detalle;
	public GridComponent2 grdCap01;
	private static Mod_IV_Fragment_02_01 _this;
	int contador = 0;

	public Mod_IV_Fragment_02_01() {
	}

	public interface C1_Cap00Fragment_001_01Listener {
		void onFinishEditDialog(String inputText);
	}

	public static Mod_IV_Fragment_02_01 newInstance(FragmentForm pagina,
			P3Det detalle, List<P3Det> detalles, int index) {
		caller = (Mod_IV_Fragment_002) pagina;
		;
		Mod_IV_Fragment_02_01 f = new Mod_IV_Fragment_02_01();
		f.setParent(pagina);
		Filtros.clear();
		f.detalles = detalles;
		f.index = index;
		Bundle args = new Bundle();
		args.putSerializable("detalle", detalle);
		f.setArguments(args);
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		detalle = (P3Det) getArguments().getSerializable("detalle");
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
		final View rootView = createUI();
		_this = this;
		initObjectsWithoutXML(this, rootView);
		cargarDatos();
		enlazarCajas(this);
		listening();

		return rootView;
	}

	@Override
	protected View createUI() {
		buildFields();

			q1 = createQuestionSection(lblTitulo);
			q2 = createQuestionSection(lblgrid3, rgC4P404B);
			q3 = createQuestionSection(lblgrid4, txtC4P404C);
			q4 = createQuestionSection(lblgrid5, rgC4P404D);
			q5 = createQuestionSection(lblgrid6, txtC4P404E);
			q6 = createQuestionSection(lblgrid7, rgC4P404F);
			q7 = createQuestionSection(lblgrid8, rgC4P404G);
			LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);

			ScrollView contenedor = createForm();
			LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		// ScrollView contenedor = createForm();
		
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
		form.addView(q5);
		form.addView(q6);
		form.addView(q7);
		form.addView(botones);

		return contenedor;
	}

	@Override
	protected void buildFields() {

		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, 700).text(detalle.label)
				.textSize(20).negrita().centrar();

	    rgC4P404B= new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).centrar().callback("bloqueoNacionalB");
	    txtC4P404C = new IntegerField(this.getActivity(), false)
		.size(altoComponente, 130).centrar().hint(R.string.porcentaje);
		
	    rgC4P404D= new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).centrar().callback("bloqueoNacionalD");
	    txtC4P404E= new IntegerField(this.getActivity(), false)
		.size(altoComponente, 130).centrar().hint(R.string.porcentaje);
	    
	    rgC4P404F= new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p404_e1, R.string.c1c100m4p404_e2,R.string.c1c100m4p404_e3,R.string.c1c100m4p404_e4,R.string.c1c100m4p404_e5).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
	    
	    rgC4P404G= new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p404_f1, R.string.c1c100m4p404_f2, R.string.c1c100m4p404_f3, R.string.c1c100m4p404_f4, R.string.c1c100m4p404_f5).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
	    txtC4P404G_ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 255).hint(R.string.especifique)
		.soloTextoNumero();
	    rgC4P404G.agregarEspecifique(4, txtC4P404G_ESP);
	    

		lblgrid3 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(80, 700)
				.text(R.string.c1c100m4p404_b).textSize(16).centrar()
				.negrita();
		lblgrid4 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(80, 700)
				.text(R.string.c1c100m4p404_c).textSize(16).centrar()
				.negrita();
		lblgrid5 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(80, 700)
				.text(R.string.c1c100m4p404_d).textSize(16).centrar()
				.negrita();
		lblgrid6 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(80, 700)
				.text(R.string.c1c100m4p404_e).textSize(16).centrar()
				.negrita();
		lblgrid7 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(80, 700)
				.text(R.string.c1c100m4p404_f).textSize(16).centrar()
				.negrita();
		lblgrid8 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(80, 700)
				.text(R.string.c1c100m4p404_g).textSize(16).centrar()
				.negrita();

		// especifique
//		tabtexto = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
//		tabtexto.addComponent(rgC4P404G_2);
//		tabtexto.addComponent(txtP1_8_00_002_6_O);
//		tabtexto.buildTable();
		// componete principal
		grdCap01 = new GridComponent2(this.getActivity(), 7);
		
		
		grdCap01.addComponent(lblgrid3);
		grdCap01.addComponent(lblgrid4);
		grdCap01.addComponent(lblgrid5);
		grdCap01.addComponent(lblgrid6);
		grdCap01.addComponent(lblgrid7);
		grdCap01.addComponent(lblgrid8);		

		grdCap01.addComponent(rgC4P404B);
		grdCap01.addComponent(txtC4P404C);
		grdCap01.addComponent(rgC4P404D);
		grdCap01.addComponent(txtC4P404E);
		grdCap01.addComponent(rgC4P404F);
		grdCap01.addComponent(rgC4P404G);

	
		
		
		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);

		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				detalle.restoreFromMemento(caretaker.get("antes"));
				// caller.refrescarTabla();
				// caller.setBorder(true);
				Mod_IV_Fragment_02_01.this.dismiss();
			}
		});

		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean flag = grabar();
				if (!flag) {
					return;
				}
				caller.refrescarTabla();
				Mod_IV_Fragment_02_01.this.dismiss();
			}
		});

		Filtros.setFiltro(txtC4P404C, Filtros.TIPO.NUMBER, 3, -1, null, 1,	100);
		Filtros.setFiltro(txtC4P404E, Filtros.TIPO.NUMBER, 3, -1, null, 1,	100);

	//	Filtros.setFiltro(txtM4P080, Filtros.TIPO.NUMBER, 4, -1, null, 1900,	2017, -1, 4);

	}

	private boolean grabar() {
		uiToEntity(detalle);
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
		// if (!isInRange()) {
		// return false;
		// }

		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		/***************************** nacional *****************************/

		if (Util.esVacio(rgC4P404B)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P404B");
			view = rgC4P404B;
			error = true;
			return false;
		}

		if (rgC4P404B.getTagSelected("").toString().equals("1")) {
			if (Util.esVacio(txtC4P404C)) {
				mensaje = preguntaVacia.replace("$", "La pregunta C4P404C");
				view = txtC4P404C;
				error = true;
				return false;
			}
		}

		if (Util.esVacio(rgC4P404D)) {
			mensaje = preguntaVacia.replace("$", "La pregunta C4P404D_1");
			view = rgC4P404D;
			error = true;
			return false;
		}

		if (rgC4P404D.getTagSelected("").toString().equals("1")) {
			if (Util.esVacio(txtC4P404E)) {
				mensaje = preguntaVacia.replace("$", "La pregunta C4P404E_1");
				view = txtC4P404E;
				error = true;
				return false;
			}
			if (Util.esVacio(rgC4P404F)) {
				mensaje = preguntaVacia.replace("$", "La pregunta C4P404F_1");
				view = rgC4P404F;
				error = true;
				return false;
			}

		}

		if (Util.esVacio(rgC4P404G)) {
			mensaje = preguntaVacia.replace("$", "La pregunta C4P404G_1");
			view = rgC4P404G;
			error = true;
			return false;
		}

		if (rgC4P404G.getTagSelected("").toString().equals("5")) {
			if (Util.esVacio(txtC4P404G_ESP)) {
				mensaje = preguntaVacia.replace("$",
						"Especifique no puede estar vacia");
				view = txtC4P404G_ESP;
				error = true;
				return false;
			}
		}

		return true;
	}

	private void cargarDatos() {

		bean2 = App.getInstance().getEmpresa();
		if (bean2 == null) {
			bean2 = new Caratula();
		}

		entityToUI(detalle);
		lblTitulo.setText(detalle.label);
		caretaker.addMemento("antes",
				detalle.saveToMemento(P3Det.class, detalle.label));
		inicio();
	}

	public void onSeleccionadoChangeValue() {
		caller.refrescarTabla();
	}

	private void inicio() {
		rgC4P404B.requestFocus();
			Util.lockView(getActivity(), false, rgC4P404B, txtC4P404C, rgC4P404D,txtC4P404E, rgC4P404F, rgC4P404G);
			bloqueoNacionalB();
			bloqueoNacionalD();
			rgC4P404B.requestFocus();
		
		rgC4P404B.requestFocus();

	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public void bloqueoNacionalB() {
		if (rgC4P404B.getTagSelected("").toString().equals("2")) {
			      Util.cleanAndLockView(getActivity(),txtC4P404C);
			       rgC4P404D.requestFocus() ;
		} else {
		       Util.lockView(getActivity(), false, 
		    		   txtC4P404C
						);
		       txtC4P404C.requestFocus();
		}
	}

	public void bloqueoNacionalD() {
		if (rgC4P404D.getTagSelected("").toString().equals("2")) {
			      Util.cleanAndLockView(getActivity(),txtC4P404E,rgC4P404F);
			      rgC4P404G.requestFocus() ;
		} else {
		       Util.lockView(getActivity(), false, 
		    		   txtC4P404E,rgC4P404F
						);
		       txtC4P404E.requestFocus();
		}
	}
}
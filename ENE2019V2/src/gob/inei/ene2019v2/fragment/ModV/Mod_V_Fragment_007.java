package gob.inei.ene2019v2.fragment.ModV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Modulov02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_V_Fragment_007 extends FragmentForm {

//	@FieldAnnotation(orderIndex = 1)
//	public RadioGroupOtherField rgC5P519;
	
//	@FieldAnnotation(orderIndex = 1)
//	public CheckBoxField chbC5P519_1;
//	@FieldAnnotation(orderIndex = 2)
//	public CheckBoxField chbC5P519_2;
//	@FieldAnnotation(orderIndex = 3)
//	public CheckBoxField chbC5P519_3;
//	@FieldAnnotation(orderIndex = 4)
//	public CheckBoxField chbC5P519_4;
//	@FieldAnnotation(orderIndex = 5)
//	public CheckBoxField chbC5P519_5;
//	@FieldAnnotation(orderIndex = 6)
//	public TextField txtC5P519_5ESP;
//	
//	@FieldAnnotation(orderIndex = 7)
//	public CheckBoxField chbC5P520_1;
//	@FieldAnnotation(orderIndex = 8)
//	public CheckBoxField chbC5P520_2;
//	@FieldAnnotation(orderIndex = 9)
//	public CheckBoxField chbC5P520_3;
//	@FieldAnnotation(orderIndex = 10)
//	public CheckBoxField chbC5P520_4;
//	@FieldAnnotation(orderIndex = 11)
//	public CheckBoxField chbC5P520_5;
	
	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC5P521;
	@FieldAnnotation(orderIndex = 2)
	public TextField txtC5P521_ESP;
	
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC5P522;
	@FieldAnnotation(orderIndex = 4)
	public TextField txtC5P522_ESP;
	
	private CuestionarioService cuestionarioService;
	private Modulov02 bean;
	private LabelComponent lblTitulo, lblsubTitulo;
	private GridComponent2 gcPreg20,gcPreg19;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_V_Fragment_007() {
	}

	public Mod_V_Fragment_007 parent(MasterActivity parent) {
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
		rootView = createUI();
		initObjectsWithoutXML(this, rootView);
		enlazarCajas();
		listening();

		return rootView;
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.CapituloV).textSize(21).centrar().negrita();

		lblsubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.CapV_SecI).textSize(20).centrar().negrita();

//		rgC5P519 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p019_1, R.string.c1c100m5p019_2)
//				.size(WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL)
//				.callback("FuncionRG519");
		
//		chbC5P519_1 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p019_1, "1:0").size(altoComponente, 600);
//		chbC5P519_2 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p019_2, "1:0").size(altoComponente, 600);
//		chbC5P519_3 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p019_3, "1:0").size(altoComponente, 600);
//		chbC5P519_4 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p019_4, "1:0").size(altoComponente, 600);
//		chbC5P519_5 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p019_5, "1:0").size(altoComponente, 150).callback("FuncionCHECK519");
//		txtC5P519_5ESP = new TextField(this.getActivity(), false)
//				.size(altoComponente, 450).hint(R.string.especifique)
//				.soloTextoNumero();
//		
//		
//		chbC5P520_1 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p020_1, "1:0").size(altoComponente, 600);
//		chbC5P520_2 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p020_2, "1:0").size(altoComponente, 600);
//		chbC5P520_3 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p020_3, "1:0").size(altoComponente, 600);
//		chbC5P520_4 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p020_4, "1:0").size(altoComponente, 600);
//		chbC5P520_5 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m5p020_5, "1:0").size(altoComponente, 600);

		rgC5P521 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p021_1, R.string.c1c100m5p021_2,R.string.c1c100m5p021_3,R.string.c1c100m5p021_4)
				.size(WRAP_CONTENT, 600).orientation(ORIENTATION.VERTICAL);
		txtC5P521_ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		rgC5P521.agregarEspecifique(3, txtC5P521_ESP);
		
		rgC5P522 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p022_1, R.string.c1c100m5p022_2,R.string.c1c100m5p022_3,R.string.c1c100m5p022_4,R.string.c1c100m5p022_5).size(
				WRAP_CONTENT, 600).orientation(ORIENTATION.VERTICAL);
		txtC5P522_ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		
		rgC5P522.agregarEspecifique(4, txtC5P522_ESP);
		
		
//		gcPreg19 = new GridComponent2(this.getActivity(), 2)
//		.colorFondo(R.color.transparent);
//		gcPreg19.addComponent(chbC5P519_5);
//		gcPreg19.addComponent(txtC5P519_5ESP);
		

//		Filtros.setFiltro(txtC5P519_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
//		q1 = createQuestionSection(R.string.c1c100m5p019, chbC5P519_1,chbC5P519_2,chbC5P519_3,chbC5P519_4,gcPreg19.component());
//		q2 = createQuestionSection(R.string.c1c100m5p020, chbC5P520_1,
//				chbC5P520_2, chbC5P520_3, chbC5P520_4, chbC5P520_5);
		q3 = createQuestionSection(R.string.c1c100m5p021, rgC5P521);
		q4 = createQuestionSection(R.string.c1c100m5p022, rgC5P522);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
//		form.addView(q1);
//		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
		// form.addView(q5);

		return contenedor;
	}

	@Override
	public boolean grabar() {

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
		uiToEntity(bean);
		String[] extras = null;

	
		try {

			
			if (!getCuestionarioService().saveOrUpdate(bean,
					bean.getSecCap(getListFields(this)))) {
				ToastMessage.msgBox(this.getActivity(),
						"Los datos no se guardaron",
						ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
			}
		} catch (SQLException e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
			return false;
		}

		return true;
	}

	private boolean validar() {
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
	
		
//		if((Util.getInt(bean.c5p518) == 1)){
//			if (!chbC5P519_1.isChecked() && !chbC5P519_2.isChecked()
//					&& !chbC5P519_3.isChecked() && !chbC5P519_4.isChecked()
//					&& !chbC5P519_5.isChecked()) {
//				mensaje = pregunta_no_vacia.replace("$", "La pregunta P519");
//				view = chbC5P519_1;
//				error = true;
//				return false;
//			}
//			
//			if (chbC5P519_5.isChecked()) {
//				if (Util.esVacio(txtC5P519_5ESP)) {
//					mensaje = pregunta_no_vacia.replace("$",
//							"La Preg.519 (Especifique)");
//					view = txtC5P519_5ESP;
//					error = true;
//					return false;
//				} else {
//					if (txtC5P519_5ESP.getText().length() < 3) {
//						mensaje = "Ingrese la información correcta";
//						view = txtC5P519_5ESP;
//						error = true;
//						return false;
//					}
//				}
//			}
//		  }
		
	
//			if (!chbC5P520_1.isChecked() && !chbC5P520_2.isChecked()
//					&& !chbC5P520_3.isChecked() && !chbC5P520_4.isChecked()
//					&& !chbC5P520_5.isChecked()) {
//				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P520";
//				view = chbC5P520_1;
//				error = true;
//				return false;
//			}
		
		
		if (Util.esVacio(rgC5P521)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P521");
			view = rgC5P521;
			error = true;
			return false;
		}
		Integer valor = Integer.parseInt(rgC5P521.getTagSelected("0")
				.toString());
		if (valor == 4) {
			if (Util.esVacio(txtC5P521_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.521 (Especifique)");
				view = txtC5P521_ESP;
				error = true;
				return false;
			} else {
				if (txtC5P521_ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC5P521_ESP;
					error = true;
					return false;
				}
			}
		}
		
		if (Util.esVacio(rgC5P522)) {
			mensaje = pregunta_no_vacia.replace("$", "La Pregunta P522");
			view = rgC5P522;
			error = true;
			return false;
		}
		Integer valor1 = Integer.parseInt(rgC5P522.getTagSelected("0").toString());
		if (valor1 == 5) {
			if (Util.esVacio(txtC5P522_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.522 (Especifique)");
				view = txtC5P522_ESP;
				error = true;
				return false;
			} else {
				if (txtC5P522_ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC5P522_ESP;
					error = true;
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModulov02(
				App.getInstance().getEmpresa(),
				new Modulov02().getSecCap(getListFields(this,
						new String[] { "C5P518","C5P514_4","C5P515" })));
		if (bean == null) {
			bean = new Modulov02();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {		


		//			VERIFICACIÓN	:	Si C5P518 = 2  Pase a C5P520
//        Si C5P518 = 1  Pase a C5P519
		
		
//			if(Util.getInt(bean.c5p518)==2){
//			Util.cleanAndLockView(getActivity(),  chbC5P519_1, chbC5P519_2,
//			chbC5P519_3, chbC5P519_4, chbC5P519_5,txtC5P519_5ESP);
//			chbC5P520_1.requestFocus();
//			}else{
//			
//			Util.lockView(getActivity(), false, chbC5P519_1, chbC5P519_2,
//			chbC5P519_3, chbC5P519_4, chbC5P519_5);
//			chbC5P519_1.requestFocus();
//				}
//				FuncionCHECK519();
			
		rgC5P521.requestFocus();
	
	}


//	public void FuncionCHECK519() {
//		if (chbC5P519_5.isChecked()) {
//			Util.lockView(getActivity(), false, txtC5P519_5ESP);
//			txtC5P519_5ESP.requestFocus();
//		} else {
//			Util.cleanAndLockView(getActivity(), txtC5P519_5ESP);
//		}
//	}



	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	@Override
	public Entity getEntity() {
		return App.getInstance().getEmpresa();
	}
}

package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_009 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC4P431_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC4P431_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P431_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P431_4;
	
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P431_5;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P431_6;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P431_7;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P431_8;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P431_9;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC4P431_10;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC4P431_11;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P431_12;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P431_13;
	@FieldAnnotation(orderIndex = 14)
	public TextField txtC4P431_13ESP;
	
	
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P432_1;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC4P432_2;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC4P432_3;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC4P432_4;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC4P432_5;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC4P432_6;
	@FieldAnnotation(orderIndex = 21)
	public CheckBoxField chbC4P432_7;
	@FieldAnnotation(orderIndex = 22)
	public TextField txtC4P432_7ESP;
	@FieldAnnotation(orderIndex = 23)
	public CheckBoxField chbC4P432_8;
	@FieldAnnotation(orderIndex = 24)
	public RadioGroupOtherField rgC4P432A;

	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private LabelComponent lblTitulo, lblSubTitulo;
	private GridComponent grEspe030, grEspe01,grEspe02;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_009() {
	}

	public Mod_IV_Fragment_009 parent(MasterActivity parent) {
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
				.text(R.string.c1c100m400p).textSize(21).centrar().negrita();
		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m4p_2)
				.textSize(20).centrar().negrita();
		

		
		chbC4P431_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		
		chbC4P431_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_7, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_8, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_9, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_10, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_11, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_12, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP431");
		chbC4P431_13 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p432_13, "1:0").size(WRAP_CONTENT,140).callback("FuncionP431").callback("FuncionP431esp");
		
		txtC4P431_13ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		
		
		chbC4P432_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP432x");
		chbC4P432_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP432x");
		chbC4P432_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP432x");
		chbC4P432_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP432x");
		chbC4P432_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP432x");
		chbC4P432_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP432x");
		chbC4P432_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_7, "1:0").size(WRAP_CONTENT, 140).callback("FuncionP432x");
		chbC4P432_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p431_8, "1:0").callback("FuncionP432").size(
				WRAP_CONTENT, WRAP_CONTENT);
		txtC4P432_7ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		rgC4P432A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p432A_1, R.string.c1c100m4p432A_2,
				R.string.c1c100m4p432A_3).size(WRAP_CONTENT, WRAP_CONTENT).orientation(
				ORIENTATION.HORIZONTAL);

		grEspe01 = new GridComponent(this.getActivity(), 2);
		grEspe01.colorFondo(android.R.color.transparent);
		grEspe01.addComponent(chbC4P432_7);
		grEspe01.addComponent(txtC4P432_7ESP);
		
		grEspe02 = new GridComponent(this.getActivity(), 2);
		grEspe02.colorFondo(android.R.color.transparent);
		grEspe02.addComponent(chbC4P431_13);
		grEspe02.addComponent(txtC4P431_13ESP);
		
		Filtros.setFiltro(txtC4P432_7ESP, Filtros.TIPO.ALFAN_U, 300, null);

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		
		q2 = createQuestionSection(R.string.c1c100m4p431, Gravity.START, chbC4P431_1, chbC4P431_2, chbC4P431_3, chbC4P431_4,chbC4P431_5, chbC4P431_6, chbC4P431_7, chbC4P431_8,
				chbC4P431_9, chbC4P431_10, chbC4P431_11, chbC4P431_12,grEspe02.component());
		
		q3 = createQuestionSection(R.string.c1c100m4p432, Gravity.START, chbC4P432_1, chbC4P432_2,
				chbC4P432_3, chbC4P432_4, chbC4P432_5,chbC4P432_6,
				grEspe01.component(), chbC4P432_8);
		q4 = createQuestionSection(R.string.c1c100m4p432A, rgC4P432A);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
		
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

		if (!isInRange())
			return false;
		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
	
		if (Util.getInt(bean.c4p429a) == 5) {
			if (!chbC4P432_1.isChecked() && !chbC4P432_2.isChecked()
					&& !chbC4P432_3.isChecked() && !chbC4P432_4.isChecked()
					&& !chbC4P432_6.isChecked() && !chbC4P432_5.isChecked()
					&& !chbC4P432_7.isChecked() && !chbC4P432_8.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P432";
				view = chbC4P432_1;
				error = true;
				return false;
			}

			if (chbC4P432_7.isChecked()) {
				if (Util.esVacio(txtC4P432_7ESP)) {
					mensaje = preguntaVacia.replace("$",
							"La Preg.432 (Especifique)");
					view = txtC4P432_7ESP;
					error = true;
					return false;
				} else {
					if (txtC4P432_7ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P432_7ESP;
						error = true;
						return false;
					}
				}
			}
		}else{
			if (!chbC4P431_1.isChecked() && !chbC4P431_2.isChecked()
					&& !chbC4P431_3.isChecked() && !chbC4P431_4.isChecked()&&
					!chbC4P431_5.isChecked() && !chbC4P431_6.isChecked()
					&& !chbC4P431_7.isChecked() && !chbC4P431_8.isChecked()&&
					!chbC4P431_9.isChecked() && !chbC4P431_10.isChecked()
					&& !chbC4P431_11.isChecked() && !chbC4P431_12.isChecked()
					&& !chbC4P431_13.isChecked()
					) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P431";
				view = chbC4P431_1;
				error = true;
				return false;
			}
		}

		if (Util.esVacio(rgC4P432A)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P432A");
			view = rgC4P432A;
			error = true;
			return false;
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv01(
				App.getInstance().getEmpresa(),
				new Moduloiv01().getSecCap(getListFields(this,
						new String[] { "C4P429A","C4P430A" })));
		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {

		
		    // FuncionP431();
		if (Util.getInt(bean.c4p430a) == 2) {
			Util.cleanAndLockView(getActivity(),  chbC4P431_1, chbC4P431_2,
					chbC4P431_3, chbC4P431_4,chbC4P431_5, chbC4P431_6,
					chbC4P431_7, chbC4P431_8,chbC4P431_9, chbC4P431_10,
					chbC4P431_11, chbC4P431_12, chbC4P431_13, chbC4P432_1, chbC4P432_2,
					chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
					chbC4P432_7, chbC4P432_8
					
					);
			      Util.lockView(getActivity(), false,rgC4P432A);
			      rgC4P432A.requestFocus();
		}else {
			Util.lockView(getActivity(), false,   chbC4P431_1, chbC4P431_2,
					chbC4P431_3, chbC4P431_4,chbC4P431_5, chbC4P431_6,
					chbC4P431_7, chbC4P431_8,chbC4P431_9, chbC4P431_10,
					chbC4P431_11, chbC4P431_12, chbC4P431_13, chbC4P432_1, chbC4P432_2,
					chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
					chbC4P432_7, chbC4P432_8
						
					);
			/////
			if (Util.getInt(bean.c4p429a) == 5) {
				Util.cleanAndLockView(getActivity(),  chbC4P431_1, chbC4P431_2,
						chbC4P431_3, chbC4P431_4,chbC4P431_5, chbC4P431_6,
						chbC4P431_7, chbC4P431_8,chbC4P431_9, chbC4P431_10,
						chbC4P431_11, chbC4P431_12, chbC4P431_13
						);
				   
				Util.lockView(getActivity(), false, chbC4P432_1, chbC4P432_2,
						chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
						chbC4P432_7, chbC4P432_8);
				FuncionP432();
				chbC4P432_1.requestFocus();
				
			} else {
				Util.lockView(getActivity(), false, chbC4P431_1, chbC4P431_2,
						chbC4P431_3, chbC4P431_4,chbC4P431_5, chbC4P431_6,
						chbC4P431_7, chbC4P431_8,chbC4P431_9, chbC4P431_10,
						chbC4P431_11, chbC4P431_12, chbC4P431_13
						
						);
				       FuncionP431esp();
				       //bloquea 432
//				Util.cleanAndLockView(getActivity(), chbC4P432_1, chbC4P432_2,
//						chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
//						chbC4P432_7, txtC4P432_7ESP, chbC4P432_8);
		
				if (chbC4P431_4.isChecked()){
					chbC4P431_4.requestFocus();
				} else{
					chbC4P431_1.requestFocus();
				}
			}
			////
			        FuncionP431();
			       FuncionP431esp();
		}
	//	Log.e("Estoy aqui....................: ", "" + bean.c4p430a );

	}
	public void FuncionP431esp() {
	
		if (chbC4P431_13.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P431_13ESP);
			txtC4P431_13ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P431_13ESP);
		}
	}
	public void FuncionP431() {
		if (chbC4P431_1.isChecked()||chbC4P431_2.isChecked()||chbC4P431_3.isChecked()||chbC4P431_4.isChecked()||chbC4P431_5.isChecked()||chbC4P431_6.isChecked()
				||chbC4P431_7.isChecked()||chbC4P431_8.isChecked()||chbC4P431_9.isChecked()||chbC4P431_10.isChecked()||chbC4P431_11.isChecked()||chbC4P431_12.isChecked()
				||chbC4P431_13.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P432_1, chbC4P432_2,
					chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
					chbC4P432_7, chbC4P432_8,txtC4P432_7ESP);
			         rgC4P432A.requestFocus();
		} else {
			Util.lockView(getActivity(), false,  chbC4P432_1, chbC4P432_2,
					chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
					chbC4P432_7, chbC4P432_8);
		}
	}
//	
//	public void FuncionP431x() {
//		if (chbC4P431_1.isChecked() || chbC4P431_2.isChecked()
//				|| chbC4P431_3.isChecked()) {
//			Util.cleanAndLockView(getActivity(), chbC4P431_4);
//		} else {
//			Util.lockView(getActivity(), false, chbC4P431_4);
//		}
//	}

	public void FuncionP432() {
		if (chbC4P432_8.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P432_1, chbC4P432_2,
					chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
					txtC4P432_7ESP, chbC4P432_7);
		} else {
			Util.lockView(getActivity(), false, chbC4P432_1, chbC4P432_2,
					chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_6,
					chbC4P432_7);
			FuncionP432x();
		}
	}

	public void FuncionP432x() {
		if (chbC4P432_1.isChecked() || chbC4P432_2.isChecked()
				|| chbC4P432_3.isChecked() || chbC4P432_4.isChecked()
				|| chbC4P432_5.isChecked() || chbC4P432_6.isChecked()
				|| chbC4P432_7.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P432_8);
		} else {
			Util.lockView(getActivity(), false, chbC4P432_8);
		}

		if (chbC4P432_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P432_7ESP);
			txtC4P432_7ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P432_7ESP);
		}


		if (chbC4P432_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P432_1,chbC4P432_2, chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_7,chbC4P432_8 );
		} else {
			Util.lockView(getActivity(), false, chbC4P432_1,chbC4P432_2, chbC4P432_3, chbC4P432_4, chbC4P432_5, chbC4P432_7,chbC4P432_8);
		}
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	@Override
	public Caratula getEntity() {
		return App.getInstance().getEmpresa();
	}
}

package gob.inei.ene2019v2.fragment.ModVII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Modulovii01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VII_Fragment_004 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC7P705_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC7P705_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC7P705_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC7P705_4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC7P705_5;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC7P705_6;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC7P705_7;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC7P705_8;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC7P705_9;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC7P705_10;
	@FieldAnnotation(orderIndex = 11)
	public TextField txtC7P705_10ESP;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC7P705_11;
	@FieldAnnotation(orderIndex = 13)
	public RadioGroupOtherField rgC7P706;
	@FieldAnnotation(orderIndex = 14)
	public RadioGroupOtherField rgC7P707;

	private CuestionarioService cuestionarioService;
	private Modulovii01 bean;
	private LabelComponent lblTitulo,lblTitulo1,lblTitulo2,lblTitulo3;
	private List<View> lst708;
	private GridComponent2 gcPreg9;
	private Caratula caratula;
	
	public Mod_VII_Fragment_004() {
	}

	public Mod_VII_Fragment_004 parent(MasterActivity parent) {
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
				.text(R.string.lbl_modvii_titlecap_1).textSize(22).centrar()
				.negrita();
		lblTitulo1 = new LabelComponent(getActivity())
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text("Sólo para Micro, Pequeña y Mediana  Empresa  (Pregunta 706 ).").textSize(17).centrar()
		.negrita().colorFondo(R.color.amarillo);
		lblTitulo2 = new LabelComponent(getActivity())
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text("Sólo para Micro, Pequeña y Mediana  Empresa  (Pregunta 706A ).").textSize(17).centrar()
		.negrita().colorFondo(R.color.amarillo);
		lblTitulo3 = new LabelComponent(getActivity())
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text("Sólo  para Mediana  y gran Empresa (Pregunta 708 ).").textSize(17).centrar()
		.negrita().colorFondo(R.color.amarillo);
	
		chbC7P705_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_1, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_2, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_3, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_4, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_5, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_6, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_7, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_8, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_9, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		chbC7P705_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_10, "1:0").size(WRAP_CONTENT, 150).callback("FuncionP8").callback("onM3P008_5ChangeValue");
		
		chbC7P705_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m7p009_11, "1:0").size(WRAP_CONTENT, 600).callback("FuncionP8");
		
		txtC7P705_10ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 450).hint(R.string.especifique).soloTextoNumero();
		
		rgC7P706 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p010_1, R.string.c1c100m7p010_2).size(
				WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL);
	
		rgC7P707 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p011_1, R.string.c1c100m7p011_2).size(
				WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL);
		

		gcPreg9 = new GridComponent2(this.getActivity(), 2)
				.colorFondo(R.color.transparent);
		gcPreg9.addComponent(chbC7P705_10);
		gcPreg9.addComponent(txtC7P705_10ESP);
		
		Filtros.setFiltro(txtC7P705_10ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */

		LinearLayout q0 = createQuestionSection(lblTitulo);

		LinearLayout q2 = createQuestionSection(R.string.c1c100m7p009_title,
				chbC7P705_1, chbC7P705_2, chbC7P705_3, chbC7P705_4,
				chbC7P705_5, chbC7P705_6, chbC7P705_7, chbC7P705_8,
				chbC7P705_9, gcPreg9.component() , chbC7P705_11);
		LinearLayout q4 = createQuestionSection(R.string.c1c100m7p010, rgC7P706);
		LinearLayout q5 = createQuestionSection(R.string.c1c100m7p011, rgC7P707);

		// ///////////////////////////
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		/* Aca agregamos las preguntas a la pantalla */
		form.addView(q0);		
		form.addView(q2);
		form.addView(q4);
		form.addView(q5);
		
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
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		String especifique_no_vacio = getString(R.string.pregunta_especifique);
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		// if (rgC7P704.getTagSelected("").toString().equals("1")) {
		if (!chbC7P705_1.isChecked() && !chbC7P705_1.isChecked()
				&& !chbC7P705_2.isChecked() && !chbC7P705_3.isChecked()
				&& !chbC7P705_4.isChecked() && !chbC7P705_5.isChecked()
				&& !chbC7P705_6.isChecked() && !chbC7P705_7.isChecked()
				&& !chbC7P705_8.isChecked() && !chbC7P705_9.isChecked()
				&& !chbC7P705_10.isChecked() && !chbC7P705_11.isChecked()) {
			mensaje = "Debe seleccionar al menos una alternativa";
			view = chbC7P705_1;
			return !(error = true);
		}

		if (chbC7P705_10.isChecked()) {
			if (Util.esVacio(txtC7P705_10ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.705_10 (Especifique)");
				view = txtC7P705_10ESP;
				error = true;
				return false;
			}
			if (txtC7P705_10ESP.getText().toString().trim().length() < 3) {
				mensaje = "Ingrese la información correcta";
				view = txtC7P705_10ESP;
				return !(error = true);
			}
		}
		// }

		// if (Util.esVacio(rgC7P704)) {
		// mensaje = pregunta_no_vacia.replace("$", "La pregunta P704");
		// view = rgC7P704;
		// error = true;
		// return false;
		// }

		if (Util.esVacio(rgC7P706)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P706");
			view = rgC7P706;
			error = true;
			return false;
		}

		if (Util.esVacio(rgC7P707)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P707");
			view = rgC7P707;
			error = true;
			return false;
		}

		return true;
	}

	@Override
	public void cargarDatos() {
	
		bean = getCuestionarioService().getModulovii01(
				App.getInstance().getEmpresa(),
				new Modulovii01().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Modulovii01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		caratula = getCuestionarioService().getCaratula(
				App.getInstance().getEmpresa(),
				new Caratula().getSecCap(Util.getListList("P25")));
		
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		chbC7P705_1.requestFocus();
		FuncionP8();
		chbC7P705_1.requestFocus();
		
	}
	
	public void FuncionP8() {
		if (chbC7P705_1.isChecked() || chbC7P705_2.isChecked()
				|| chbC7P705_3.isChecked() || chbC7P705_4.isChecked() || chbC7P705_5.isChecked()
				|| chbC7P705_6.isChecked() || chbC7P705_7.isChecked() || chbC7P705_8.isChecked()
				|| chbC7P705_9.isChecked() || chbC7P705_10.isChecked() 
				) {
			Util.cleanAndLockView(getActivity(), chbC7P705_11);
		} else {
			Util.lockView(getActivity(), false, chbC7P705_11);
		}

		if (chbC7P705_11.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC7P705_1, chbC7P705_2,
					chbC7P705_3, chbC7P705_4, chbC7P705_5 , chbC7P705_6,chbC7P705_7,chbC7P705_8,chbC7P705_9,chbC7P705_10, txtC7P705_10ESP);
		} else {
			Util.lockView(getActivity(), false,  chbC7P705_1, chbC7P705_2,
					chbC7P705_3, chbC7P705_4, chbC7P705_5 , chbC7P705_6,chbC7P705_7,chbC7P705_8,chbC7P705_9,chbC7P705_10);
			onM3P008_5ChangeValue();
		}
	}

	public void onM3P008_5ChangeValue() {
		if (chbC7P705_10.isChecked()) {
			Util.lockView(getActivity(), false, txtC7P705_10ESP);
			txtC7P705_10ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC7P705_10ESP);
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
	public Entity getEntity() {
		return bean;
	}
}

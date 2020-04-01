package gob.inei.ene2019v2.fragment.ModVI;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
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
import gob.inei.ene2019v2.model.Modulovi01;
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

public class Mod_VI_Fragment_004 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC6P610;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC6P611_1;
	@FieldAnnotation(orderIndex = 3)
	public IntegerField txtC6P611_1A;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC6P611_2;
	@FieldAnnotation(orderIndex = 5)
	public IntegerField txtC6P611_2A;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC6P611_3;
	@FieldAnnotation(orderIndex = 7)
	public IntegerField txtC6P611_3A;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC6P611_4;
	@FieldAnnotation(orderIndex = 9)
	public IntegerField txtC6P611_4A;
	@FieldAnnotation(orderIndex = 10)	
	public CheckBoxField chbC6P611_5;
	@FieldAnnotation(orderIndex = 11)
	public TextField txtC6P611_5ESP;
	@FieldAnnotation(orderIndex = 12)
	public IntegerField txtC6P611_5A;
	@FieldAnnotation(orderIndex = 13)
	public RadioGroupOtherField rgC6P612;

	private CuestionarioService cuestionarioService;
	private Modulovi01 bean;
	private LabelComponent lblTitulo, lblSubTitulo, lblvacio, lblNumero;
	private GridComponent2 grP611;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_VI_Fragment_004() {
	}

	public Mod_VI_Fragment_004 parent(MasterActivity parent) {
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
				.text(R.string.moduloVI).textSize(21).centrar().negrita();
		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m6p_2)
				.textSize(20).centrar().negrita();

		lblvacio = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 400).text("VEHICULOS").textSize(17)
				.centrar();
		lblNumero = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, WRAP_CONTENT).text(R.string.c1c100m6_num)
				.size(altoComponente, 150).centrar();

		rgC6P610 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p010_1, R.string.c1c100m6p010_2)
				.size(WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL)
				.centrar().callback("FuncionRG610");

		chbC6P611_1 = new CheckBoxField(this.getActivity(),
				R.string.mod06_l11_1, "1:0").size(WRAP_CONTENT, 400).callback(
				"FuncionCHECK611");

		txtC6P611_1A = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();

		chbC6P611_2 = new CheckBoxField(this.getActivity(),
				R.string.mod06_l11_2, "1:0").size(WRAP_CONTENT, 400).callback(
				"FuncionCHECK611");
		txtC6P611_2A = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();

		chbC6P611_3 = new CheckBoxField(this.getActivity(),
				R.string.mod06_l11_3, "1:0").size(WRAP_CONTENT, 400).callback(
				"FuncionCHECK611");
		txtC6P611_3A = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();

		chbC6P611_4 = new CheckBoxField(this.getActivity(),
				R.string.mod06_l11_4, "1:0").size(WRAP_CONTENT, 400).callback(
				"FuncionCHECK611");
		
		
		
		txtC6P611_4A = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		
		chbC6P611_5 = new CheckBoxField(this.getActivity(),
				R.string.mod06_l11_5, "1:0").size(WRAP_CONTENT, 400).callback(
				"FuncionCHECK611");

		txtC6P611_5ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 250).hint(R.string.especifique)
				.soloTextoNumero();
		txtC6P611_5A = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();

		rgC6P612 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p012_1, R.string.c1c100m6p012_2,
				R.string.c1c100m6p012_3, R.string.c1c100m6p012_4).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);

		grP611 = new GridComponent2(this.getActivity(), 2);
		grP611.addComponent(lblvacio);
		grP611.addComponent(lblNumero);
		grP611.addComponent(chbC6P611_1);
		grP611.addComponent(txtC6P611_1A);
		grP611.addComponent(chbC6P611_2);
		grP611.addComponent(txtC6P611_2A);
		grP611.addComponent(chbC6P611_3);
		grP611.addComponent(txtC6P611_3A);
		grP611.addComponent(chbC6P611_4);
		grP611.addComponent(txtC6P611_4A);
		
		grP611.addComponent(chbC6P611_5);
		grP611.addComponent(txtC6P611_5A);
		grP611.addComponent(txtC6P611_5ESP, 2);

		Filtros.setFiltro(txtC6P611_1A, Filtros.TIPO.NUMBER, 3, -1, null, 1,
				998);
		Filtros.setFiltro(txtC6P611_2A, Filtros.TIPO.NUMBER, 3, -1, null, 1,
				998);
		Filtros.setFiltro(txtC6P611_3A, Filtros.TIPO.NUMBER, 3, -1, null, 1,
				998);
		Filtros.setFiltro(txtC6P611_4A, Filtros.TIPO.NUMBER, 3, -1, null, 1,
				998);
		
		Filtros.setFiltro(txtC6P611_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC6P611_5A, Filtros.TIPO.NUMBER, 3, -1, null, 1,
				998);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c1c100m6p010, rgC6P610);
		q2 = createQuestionSection(R.string.c1c100m6p011, grP611.component());
		q3 = createQuestionSection(R.string.c1c100m6p012, rgC6P612);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);

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

		if (Util.esVacio(rgC6P610)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P610");
			view = rgC6P610;
			error = true;
			return false;
		}

		if (rgC6P610.isTagSelected(1)) {
			if (!chbC6P611_1.isChecked() && !chbC6P611_2.isChecked()
					&& !chbC6P611_3.isChecked() && !chbC6P611_4.isChecked() && !chbC6P611_5.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P611";
				view = chbC6P611_1;
				error = true;
				return false;
			}
			if (chbC6P611_1.isChecked()) {
				if (Util.esVacio(txtC6P611_1A)) {
					mensaje = preguntaVacia
							.replace("$", "La pregunta 1.Número");
					view = txtC6P611_1A;
					error = true;
					return false;
				}
			}
			if (chbC6P611_2.isChecked()) {
				if (Util.esVacio(txtC6P611_2A)) {
					mensaje = preguntaVacia
							.replace("$", "La pregunta 2.Número");
					view = txtC6P611_2A;
					error = true;
					return false;
				}
			}
			if (chbC6P611_3.isChecked()) {
				if (Util.esVacio(txtC6P611_3A)) {
					mensaje = preguntaVacia
							.replace("$", "La pregunta 3.Número");
					view = txtC6P611_3A;
					error = true;
					return false;
				}
			}
			if (chbC6P611_4.isChecked()) {
				if (Util.esVacio(txtC6P611_4A)) {
					mensaje = preguntaVacia
							.replace("$", "La pregunta 4.Número");
					view = txtC6P611_4A;
					error = true;
					return false;
				}
			}
			if(chbC6P611_5.isChecked()){
				if (Util.esVacio(txtC6P611_5A)) {
					mensaje = preguntaVacia
							.replace("$", "La pregunta 5.Número");
					view = txtC6P611_5A;
					error = true;
					return false;
				}
				if (Util.esVacio(txtC6P611_5ESP)) {
					mensaje = preguntaVacia.replace("$", "La Preg.611 (Especifique)");
					view = txtC6P611_5ESP;
					error = true;
					return false;
				}else{
					if (txtC6P611_5ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC6P611_5ESP;
						error = true;
						return false;
					}
				}

			}
			if (Util.esVacio(rgC6P612)) {
				mensaje = preguntaVacia.replace("$", "La pregunta P612");
				view = rgC6P612;
				error = true;
				return false;
			}
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModulovi01(
				App.getInstance().getEmpresa(),
				new Modulovi01().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Modulovi01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		FuncionCHECK611();
		FuncionRG610();
		rgC6P610.requestFocus();

	}

	public void FuncionRG610() {
		int valor = Integer.parseInt(rgC6P610.getTagSelected("0").toString());
		if (valor == 2) {
			Util.cleanAndLockView(getActivity(), chbC6P611_1, chbC6P611_2,
					chbC6P611_3, chbC6P611_4, chbC6P611_5, txtC6P611_1A, txtC6P611_2A,
					txtC6P611_3A, txtC6P611_4A, txtC6P611_5A, txtC6P611_5ESP, rgC6P612);
		} else {
			Util.lockView(getActivity(), false, chbC6P611_1, chbC6P611_2,
					chbC6P611_3, chbC6P611_4, chbC6P611_5, rgC6P612);
			chbC6P611_1.requestFocus();
		}
	}
	

	
	public void FuncionCHECK611() {
		if (chbC6P611_1.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P611_1A);
			txtC6P611_1A.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P611_1A);
		}

		if (chbC6P611_2.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P611_2A);
			txtC6P611_2A.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P611_2A);
		}

		if (chbC6P611_3.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P611_3A);
			txtC6P611_3A.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P611_3A);
		}

		if (chbC6P611_4.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P611_4A);
			txtC6P611_4A.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P611_4A);
		}

		
		if (chbC6P611_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P611_5A, txtC6P611_5ESP);
			txtC6P611_5A.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P611_5A, txtC6P611_5ESP);
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

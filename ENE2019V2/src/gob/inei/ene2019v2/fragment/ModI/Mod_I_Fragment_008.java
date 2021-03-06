package gob.inei.ene2019v2.fragment.ModI;

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
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_I_Fragment_008 extends FragmentForm {

	
	
	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC1P122_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC1P122_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC1P122_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC1P122_4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC1P122_5;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC1P122_6;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC1P122_7;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC1P122_8;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC1P122_9;
	@FieldAnnotation(orderIndex = 10)
	public TextField txtC1P122_9ESP;
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC1P123;

	private CuestionarioService cuestionarioService;
	private Moduloi bean;
	private LabelComponent lblTitulo, lblTitulo1;
	private GridComponent2 grEspe;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_I_Fragment_008() {
	}

	public Mod_I_Fragment_008 parent(MasterActivity parent) {
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
				.text(R.string.moduloI).textSize(21).centrar().negrita();
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m1p015_).textSize(20).centrar().negrita();


		rgC1P123 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m1p023_1, R.string.c1c100m1p023_2)
				.size(WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL);
	
		chbC1P122_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_1, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_2, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_3, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_4, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_5, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_6, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_7, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_8, "1:0").size(WRAP_CONTENT, 600);
		chbC1P122_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p022_9, "1:0").size(WRAP_CONTENT, 150)
				.callback("FuncionCheckP122");

		txtC1P122_9ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		grEspe = new GridComponent2(this.getActivity(), 2);
		grEspe.addComponent(chbC1P122_9);
		grEspe.addComponent(txtC1P122_9ESP);
		grEspe.colorFondo(R.color.transparent);

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m1p022, chbC1P122_1,
				chbC1P122_2, chbC1P122_3, chbC1P122_4, chbC1P122_5,
				chbC1P122_6, chbC1P122_7, chbC1P122_8, grEspe.component());
		q2 = createQuestionSection(R.string.c1c100m1p023, rgC1P123);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);
		form.addView(q2);

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
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (!chbC1P122_1.isChecked() && !chbC1P122_2.isChecked()
				&& !chbC1P122_3.isChecked() && !chbC1P122_4.isChecked()
				&& !chbC1P122_5.isChecked() && !chbC1P122_6.isChecked()
				&& !chbC1P122_7.isChecked() && !chbC1P122_8.isChecked()
				&& !chbC1P122_9.isChecked()) {
			mensaje = "�Error: Debe seleccionar al menos una alternativa 122�";
			view = chbC1P122_1;
			error = true;
			return false;
		}
		if (chbC1P122_9.isChecked()) {
			if (Util.esVacio(txtC1P122_9ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.122 (Especifique)");
				view = txtC1P122_9ESP;
				error = true;
				return false;
			} else {
				if (txtC1P122_9ESP.getText().length() < 3) {
					mensaje = "Ingrese la informaci�n correcta";
					view = txtC1P122_9ESP;
					error = true;
					return false;
				}
			}
		}


//		int ch01 = chbC1P122_1.isChecked() ? 1 : 0;
//		int ch02 = chbC1P122_2.isChecked() ? 1 : 0;
//		int ch03 = chbC1P122_3.isChecked() ? 1 : 0;
//		int ch04 = chbC1P122_4.isChecked() ? 1 : 0;
//		int ch05 = chbC1P122_5.isChecked() ? 1 : 0;
//		int ch06 = chbC1P122_6.isChecked() ? 1 : 0;
//		int ch07 = chbC1P122_7.isChecked() ? 1 : 0;
//		int ch08 = chbC1P122_8.isChecked() ? 1 : 0;
//		int ch09 = chbC1P122_9.isChecked() ? 1 : 0;
//
//		int total = ch01 + ch02 + ch03 + ch04 + ch05 + ch06 + ch07 + ch08 + ch09;
//		if (/*total < 2  ||*/ total > 2) {
//			mensaje = "Debe existir como maximo 2 �tems seleccionados en P122";
//			view = chbC1P122_1;
//			error = true;
//			return false;
//		}
		
		// }
		if (Util.esVacio(rgC1P123)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P123");
			view = rgC1P123;
			error = true;
			return false;
		}


		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloi(
				App.getInstance().getEmpresa(),
				new Moduloi().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloi();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		chbC1P122_1.requestFocus();
		FuncionCheckP122();
		chbC1P122_1.requestFocus();
		// }
	}


	public void FuncionCheckP122() {
		if (chbC1P122_9.isChecked()) {
			Util.lockView(getActivity(), false, txtC1P122_9ESP);
			txtC1P122_9ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC1P122_9ESP);
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

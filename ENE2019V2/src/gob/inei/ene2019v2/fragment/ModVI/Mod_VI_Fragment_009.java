package gob.inei.ene2019v2.fragment.ModVI;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
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
import gob.inei.ene2019v2.model.Modulovi01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VI_Fragment_009 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC6P629;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC6P630_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC6P630_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC6P630_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC6P630_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC6P630_5;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtC6P630_5ESP;
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC6P631;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC6P632_1;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC6P632_2;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC6P632_3;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC6P632_4;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC6P632_5;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC6P632_6;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC6P632_7;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC6P632_8;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC6P632_9;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC6P632_10;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC6P632_11;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC6P632_12;
	@FieldAnnotation(orderIndex = 21)
	public TextField txtC6P632_12ESP;

	private CuestionarioService cuestionarioService;
	private Modulovi01 bean;
	private LabelComponent lblTitulo, lblSubTitulo;
	private GridComponent grP630, grP632;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_VI_Fragment_009() {
	}

	public Mod_VI_Fragment_009 parent(MasterActivity parent) {
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
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m6p_4)
				.textSize(20).centrar().negrita();
		rgC6P629 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p024_1, R.string.c1c100m6p024_2)
				.size(WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL)
				.callback("FuncionRG629");

		chbC6P630_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p030_1, "1:0").size(WRAP_CONTENT, 600);
		chbC6P630_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p030_2, "1:0").size(WRAP_CONTENT, 600);
		chbC6P630_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p030_3, "1:0").size(WRAP_CONTENT, 600);
		chbC6P630_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p030_4, "1:0").size(WRAP_CONTENT, 600);
		chbC6P630_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p030_5, "1:0").size(WRAP_CONTENT, 150)
				.callback("FuncionCHECK630");
		txtC6P630_5ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();

		rgC6P631 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, 180)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionRG631");

		chbC6P632_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_1, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_2, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_3, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_4, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_5, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_6, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_7, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_8, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_9, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_10, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_11, "1:0").size(WRAP_CONTENT, 750);
		chbC6P632_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p032_12, "1:0").size(WRAP_CONTENT, 170)
				.callback("FuncionCHECK632");
		txtC6P632_12ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 580).hint(R.string.especifique)
				.soloTextoNumero();

		grP630 = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
		grP630.addComponent(chbC6P630_5);
		grP630.addComponent(txtC6P630_5ESP);

		grP632 = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
		grP632.addComponent(chbC6P632_12);
		grP632.addComponent(txtC6P632_12ESP);

		
		Filtros.setFiltro(txtC6P630_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC6P632_12ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c1c100m6p029, rgC6P629);
		q2 = createQuestionSection(R.string.c1c100m6p030, chbC6P630_1,
				chbC6P630_2, chbC6P630_3, chbC6P630_4, grP630.component());
		q3 = createQuestionSection(R.string.c1c100m6p031, rgC6P631);
		q4 = createQuestionSection(R.string.c1c100m6p032, chbC6P632_1,
				chbC6P632_2, chbC6P632_3, chbC6P632_4, chbC6P632_5,
				chbC6P632_6, chbC6P632_7, chbC6P632_8, chbC6P632_9,
				chbC6P632_10, chbC6P632_11, grP632.component());
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
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
		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (Util.esVacio(rgC6P629)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P629");
			view = rgC6P629;
			error = true;
			return false;
		}
		if (rgC6P629.isTagSelected(1)) {

			if (!chbC6P630_1.isChecked() && !chbC6P630_2.isChecked()
					&& !chbC6P630_3.isChecked() && !chbC6P630_4.isChecked()
					&& !chbC6P630_5.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P630";
				view = chbC6P630_1;
				error = true;
				return false;
			}
			if (chbC6P630_5.isChecked()) {
				if (Util.esVacio(txtC6P630_5ESP)) {
					mensaje = preguntaVacia.replace("$",
							"La Preg.630 (Especifique)");
					view = txtC6P630_5ESP;
					error = true;
					return false;
				} else {
					if (txtC6P630_5ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC6P630_5ESP;
						error = true;
						return false;
					}
				}
			}
		}
		if (Util.esVacio(rgC6P631)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P631");
			view = rgC6P631;
			error = true;
			return false;
		}
		if (rgC6P631.isTagSelected(1)) {
			if (!chbC6P632_1.isChecked() && !chbC6P632_2.isChecked()
					&& !chbC6P632_3.isChecked() && !chbC6P632_4.isChecked()
					&& !chbC6P632_5.isChecked() && !chbC6P632_6.isChecked()
					&& !chbC6P632_7.isChecked() && !chbC6P632_8.isChecked()
					&& !chbC6P632_9.isChecked() && !chbC6P632_10.isChecked()
					&& !chbC6P632_11.isChecked() && !chbC6P632_12.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P632";
				view = chbC6P632_1;
				error = true;
				return false;
			}

			if (chbC6P632_12.isChecked()) {
				if (Util.esVacio(txtC6P632_12ESP)) {
					mensaje = preguntaVacia.replace("$",
							"La Preg.632 (Especifique)");
					view = txtC6P632_12ESP;
					error = true;
					return false;
				} else {
					if (txtC6P632_12ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC6P632_12ESP;
						error = true;
						return false;
					}
				}
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
		FuncionRG629();
		rgC6P629.requestFocus();
	}

	public void FuncionRG629() {
		int valor = Integer.parseInt(rgC6P629.getTagSelected("0").toString());
		if (valor == 2) {
			Util.cleanAndLockView(this.getActivity(), chbC6P630_1, chbC6P630_2,
					chbC6P630_3, chbC6P630_4, chbC6P630_5, txtC6P630_5ESP);
			rgC6P631.requestFocus();
		} else {
			Util.lockView(getActivity(), false, chbC6P630_1, chbC6P630_2,
					chbC6P630_3, chbC6P630_4, chbC6P630_5);
			FuncionCHECK630();
			FuncionRG631();
			chbC6P630_1.requestFocus();
		}
	}

	public void FuncionCHECK630() {
		if (chbC6P630_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P630_5ESP);
			txtC6P630_5ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P630_5ESP);
		}
	}

	public void FuncionRG631() {
		int x = Integer.parseInt(rgC6P631.getTagSelected("0").toString());
		if (x == 2) {
			Util.cleanAndLockView(this.getActivity(), chbC6P632_1, chbC6P632_2,
					chbC6P632_3, chbC6P632_4, chbC6P632_5, chbC6P632_6,
					chbC6P632_7, chbC6P632_8, chbC6P632_9, chbC6P632_10,
					chbC6P632_11, chbC6P632_12, txtC6P632_12ESP);
		} else {
			Util.lockView(this.getActivity(), false, chbC6P632_1, chbC6P632_2,
					chbC6P632_3, chbC6P632_4, chbC6P632_5, chbC6P632_6,
					chbC6P632_7, chbC6P632_8, chbC6P632_9, chbC6P632_10,
					chbC6P632_11, chbC6P632_12);
			FuncionCHECK632();
			chbC6P632_1.requestFocus();
		}
	}

	public void FuncionCHECK632() {
		if (chbC6P632_12.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P632_12ESP);
			txtC6P632_12ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P632_12ESP);
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

package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv02;
import gob.inei.ene2019v2.model.Moduloiv03;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_022 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P471;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC4P472;
	@FieldAnnotation(orderIndex = 3)
	public TextField txtC4P472_ESP;
//	@FieldAnnotation(orderIndex = 4)
//	public RadioGroupOtherField rgC4P473;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC4P474;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P475_1;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P475_2;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P475_3;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P475_4;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P475_5;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC4P475_6;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC4P475_7;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P475_8;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P475_9;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC4P475_10;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P475_11;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC4P475_12;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC4P475_13;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC4P475_14;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC4P475_15;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC4P475_16;
	@FieldAnnotation(orderIndex = 21)
	public CheckBoxField chbC4P475_17;
	@FieldAnnotation(orderIndex = 22)
	public TextField txtC4P475_17ESP;

	private CuestionarioService cuestionarioService;
	private Moduloiv02 bean;
	private Caratula caratula;
	private LabelComponent lblTitulo, lblTitulo2,lblTitulo3;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent grEspe;
	SeccionCapitulo[] Mod04;

	public Mod_IV_Fragment_022() {
	}

	public Mod_IV_Fragment_022 parent(MasterActivity parent) {
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
		lblTitulo2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m4p067_title).textSize(20).centrar()
				.negrita();

		lblTitulo3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m4p067_title2).textSize(20).centrar()
				.negrita();

		rgC4P471 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p471_1, R.string.c1c100m4p471_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP72");

		rgC4P472 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p472_1, R.string.c1c100m4p472_2,
				R.string.c1c100m4p472_3, R.string.c1c100m4p472_4,
				R.string.c1c100m4p472_5, R.string.c1c100m4p472_6,
				R.string.c1c100m4p472_7).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
		txtC4P472_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		rgC4P472.agregarEspecifique(6, txtC4P472_ESP);
//		rgC4P473 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m4p473_1, R.string.c1c100m4p473_2).size(
//				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);
		rgC4P474 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p474_1, R.string.c1c100m4p474_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP474");

		chbC4P475_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_1, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_2, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_3, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_4, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_5, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_6, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_7, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_8, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_9, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_10, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_11, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_12, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_13 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_13, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_14 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_14, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_15 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_15, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_16 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_16, "1:0").size(WRAP_CONTENT, 550)
				.callback("FuncionCheckT");
		chbC4P475_17 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075_17, "1:0").size(
				LayoutParams.WRAP_CONTENT, 140).callback("FuncionCheck");

		txtC4P475_17ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();

		grEspe = new GridComponent(this.getActivity(), 2);
		grEspe.colorFondo(android.R.color.transparent);
		grEspe.addComponent(chbC4P475_17);
		grEspe.addComponent(txtC4P475_17ESP);

		Filtros.setFiltro(txtC4P475_17ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.c1c100m4p471, rgC4P471);
		q2 = createQuestionSection(R.string.c1c100m4p472, rgC4P472);
//		q3 = createQuestionSection(R.string.c1c100m4p473, rgC4P473);
		q4 = createQuestionSection(lblTitulo3);
		q5 = createQuestionSection(R.string.c1c100m4p474, rgC4P474);
		q6 = createQuestionSection(R.string.c1c100m4p475, chbC4P475_1,
				chbC4P475_2, chbC4P475_3, chbC4P475_4, chbC4P475_5,
				chbC4P475_6, chbC4P475_7, chbC4P475_8, chbC4P475_9,
				chbC4P475_10, chbC4P475_11, chbC4P475_12, chbC4P475_13,
				chbC4P475_14, chbC4P475_15, chbC4P475_16, grEspe.component());

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
//		form.addView(q3);
		form.addView(q4);
		form.addView(q5);
		form.addView(q6);

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

		if (Util.esVacio(rgC4P471)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P471");
			view = rgC4P471;
			error = true;
			return false;
		}

		if (rgC4P471.getTagSelected("").toString().equals("1")) {
			if (Util.esVacio(rgC4P472)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P472");
				view = rgC4P472;
				error = true;
				return false;
			}
			if (rgC4P472.getTagSelected("").toString().equals("7")) {
				if (Util.esVacio(txtC4P472_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.472 (Especifique)");
					view = txtC4P472_ESP;
					error = true;
					return false;
				} else {
					if (txtC4P472_ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P472_ESP;
						error = true;
						return false;
					}
				}
			}
		}
//		if (Util.esVacio(rgC4P473)) {
//			mensaje = pregunta_no_vacia.replace("$", "La pregunta P473");
//			view = rgC4P473;
//			error = true;
//			return false;
//		}

		if (Util.esVacio(rgC4P474)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P474");
			view = rgC4P474;
			error = true;
			return false;
		}

		if (rgC4P474.isTagSelected(1)) {
			if (!chbC4P475_1.isChecked() && !chbC4P475_2.isChecked()
					&& !chbC4P475_3.isChecked() && !chbC4P475_4.isChecked()
					&& !chbC4P475_5.isChecked() && !chbC4P475_6.isChecked()
					&& !chbC4P475_7.isChecked() && !chbC4P475_8.isChecked()
					&& !chbC4P475_9.isChecked() && !chbC4P475_10.isChecked()
					&& !chbC4P475_11.isChecked() && !chbC4P475_12.isChecked()
					&& !chbC4P475_13.isChecked() && !chbC4P475_14.isChecked()
					&& !chbC4P475_15.isChecked() && !chbC4P475_16.isChecked()
					&& !chbC4P475_17.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P475";
				view = chbC4P475_1;
				error = true;
				return false;
			}

			if (chbC4P475_17.isChecked()) {
				if (Util.esVacio(txtC4P475_17ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.475 (Especifique)");
					view = txtC4P475_17ESP;
					error = true;
					return false;
				} else {
					if (txtC4P475_17ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P475_17ESP;
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
		bean = getCuestionarioService().getModuloiv02(
				App.getInstance().getEmpresa(),
				new Moduloiv02().getSecCap(getListFields(this)));
		caratula = getCuestionarioService().getCaratula(
				App.getInstance().getEmpresa(),
				new Caratula().getSecCap(Util.getListList("P25")));

		// caratula = App.getInstance().getEmpresa();
		if (bean == null) {
			bean = new Moduloiv02();
			bean.id = App.getInstance().getEmpresa().id;
		}
		if (caratula == null) {
			caratula = new Caratula();
		}

		// bean3.id = App.getInstance().getEmpresa().id;
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		FuncionP72();
		FuncionP474();
		FuncionCheck();
		// FuncionCheckT();
		rgC4P471.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public void FuncionP72() {
		if (rgC4P471.getTagSelected("").toString().equals("2")) {
			Util.cleanAndLockView(getActivity(), rgC4P472, txtC4P472_ESP);
			rgC4P474.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC4P472);
			rgC4P472.requestFocus();
		}
	}

	public void FuncionCheck() {
		if (!chbC4P475_17.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC4P475_17ESP);
		} else {
			Util.lockView(getActivity(), false, txtC4P475_17ESP);
			txtC4P475_17ESP.requestFocus();
		}
	}

	// public void FuncionCheckT() {
	// if (chbC4P475_1.isChecked() || chbC4P475_2.isChecked()
	// || chbC4P475_3.isChecked() || chbC4P475_4.isChecked()
	// || chbC4P475_5.isChecked() || chbC4P475_6.isChecked()
	// || chbC4P475_7.isChecked() || chbC4P475_8.isChecked()
	// || chbC4P475_9.isChecked() || chbC4P475_10.isChecked()
	// || chbC4P475_11.isChecked() || chbC4P475_12.isChecked()
	// || chbC4P475_13.isChecked() || chbC4P475_14.isChecked()
	// || chbC4P475_15.isChecked()) {
	// Util.cleanAndLockView(getActivity(), chbC4P475_16);
	// } else {
	// Util.lockView(getActivity(), false, chbC4P475_16);
	// }
	//
	// if (chbC4P475_16.isChecked()) {
	// Util.cleanAndLockView(getActivity(), chbC4P475_1, chbC4P475_2,
	// chbC4P475_3, chbC4P475_4, chbC4P475_5, chbC4P475_6,
	// chbC4P475_7, chbC4P475_8, chbC4P475_9, chbC4P475_10,
	// chbC4P475_11, chbC4P475_12, chbC4P475_13, chbC4P475_14,
	// chbC4P475_15, txtC4P475_15ESP);
	// } else {
	// Util.lockView(getActivity(), false, chbC4P475_1, chbC4P475_2,
	// chbC4P475_3, chbC4P475_4, chbC4P475_5, chbC4P475_6,
	// chbC4P475_7, chbC4P475_8, chbC4P475_9, chbC4P475_10,
	// chbC4P475_11, chbC4P475_12, chbC4P475_13, chbC4P475_14,
	// chbC4P475_15);
	// }
	//
	// }

	public void FuncionP474() {
		if (rgC4P474.isTagSelected(2)) {
			Util.cleanAndLockView(getActivity(), chbC4P475_1, chbC4P475_2,
					chbC4P475_3, chbC4P475_4, chbC4P475_5, chbC4P475_6,
					chbC4P475_7, chbC4P475_8, chbC4P475_9, chbC4P475_10,
					chbC4P475_11, chbC4P475_12, chbC4P475_13, chbC4P475_14,
					chbC4P475_15, chbC4P475_16, chbC4P475_17, txtC4P475_17ESP);
		} else {
			Util.lockView(getActivity(), false, chbC4P475_1, chbC4P475_2,
					chbC4P475_3, chbC4P475_4, chbC4P475_5, chbC4P475_6,
					chbC4P475_7, chbC4P475_8, chbC4P475_9, chbC4P475_10,
					chbC4P475_11, chbC4P475_12, chbC4P475_13, chbC4P475_14,
					chbC4P475_15, chbC4P475_16, chbC4P475_17);
		}
	}

	@Override
	public Caratula getEntity() {
		return App.getInstance().getEmpresa();
	}
}

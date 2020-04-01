package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv01;
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

public class Mod_IV_Fragment_006 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P420;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC4P421_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P421_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P421_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P421_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P421_5;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtC4P421_5ESP;
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC4P422;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC4P423;
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgC4P424;

	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private LabelComponent lblTitulo, lblSubTitulo;
	private GridComponent grEspe01;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_006() {
	}

	public Mod_IV_Fragment_006 parent(MasterActivity parent) {
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
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m4p_1)
				.textSize(21).centrar().negrita();

		rgC4P420 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p420_1, R.string.c1c100m4p420_2,
				R.string.c1c100m4p420_3, R.string.c1c100m4p420_4,
				R.string.c1c100m4p420_5, R.string.c1c100m4p420_6,
				R.string.c1c100m4p420_7, R.string.c1c100m4p420_8,
				R.string.c1c100m4p420_9).size(WRAP_CONTENT, 200).orientation(
				ORIENTATION.VERTICAL);
		chbC4P421_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p421_1, "1:0").size(WRAP_CONTENT, 590);
		chbC4P421_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p421_2, "1:0").size(WRAP_CONTENT, 590);
		chbC4P421_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p421_3, "1:0").size(WRAP_CONTENT, 590);
		chbC4P421_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p421_4, "1:0").size(WRAP_CONTENT, 590);
		chbC4P421_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p421_5, "1:0").callback("bloqueo_M4P020")
				.size(LayoutParams.WRAP_CONTENT, 140);
		txtC4P421_5ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		grEspe01 = new GridComponent(this.getActivity(), 2);
		grEspe01.colorFondo(android.R.color.transparent);
		grEspe01.addComponent(chbC4P421_5);
		grEspe01.addComponent(txtC4P421_5ESP);

		rgC4P422 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p422_1, R.string.c1c100m4p422_2)
				.size(WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL)
				.callback("onChangeP422");
		rgC4P423 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p423_1, R.string.c1c100m4p423_2)
				.size(WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL)
				.callback("onChangeP423");

		rgC4P424 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p424_1, R.string.c1c100m4p424_2,
				R.string.c1c100m4p424_3, R.string.c1c100m4p424_4,
				R.string.c1c100m4p424_5).size(WRAP_CONTENT, 250).orientation(
				ORIENTATION.VERTICAL);

		Filtros.setFiltro(txtC4P421_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.c1c100m4p420, Gravity.START, rgC4P420);
		q2 = createQuestionSection(R.string.c1c100m4p421, Gravity.START, chbC4P421_1, chbC4P421_2,
				chbC4P421_3, chbC4P421_4, grEspe01.component());
		q3 = createQuestionSection(R.string.c1c100m4p422, rgC4P422);
		q4 = createQuestionSection(R.string.c1c100m4p423, rgC4P423);
		q5 = createQuestionSection(R.string.c1c100m4p424, Gravity.START, rgC4P424);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
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

		if (Util.esVacio(rgC4P420)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P420");
			view = rgC4P420;
			error = true;
			return false;
		}

		if (!chbC4P421_1.isChecked() && !chbC4P421_2.isChecked()
				&& !chbC4P421_3.isChecked() && !chbC4P421_4.isChecked()
				&& !chbC4P421_5.isChecked()) {
			mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P421";
			view = chbC4P421_1;
			error = true;
			return false;
		}
		if (chbC4P421_5.isChecked()) {
			if (Util.esVacio(txtC4P421_5ESP)) {
				mensaje = preguntaVacia.replace("$",
						"La Preg.421 (Especifique)");
				view = txtC4P421_5ESP;
				error = true;
				return false;
			} else {
				if (txtC4P421_5ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC4P421_5ESP;
					error = true;
					return false;
				}
			}
		}

	//2310
		if (Util.getInt(bean.c4p418) == 1 ) {
			if (Util.esVacio(rgC4P422)) {
				mensaje = preguntaVacia.replace("$", "La pregunta P422");
				view = rgC4P422;
				error = true;
				return false;
			}

			if (rgC4P422.isTagSelected(1)) {

				if (Util.esVacio(rgC4P423)) {
					mensaje = preguntaVacia.replace("$", "La pregunta P423");
					view = rgC4P423;
					error = true;
					return false;
				}
			}

			if (rgC4P423.isTagSelected(1)) {
				if (Util.esVacio(rgC4P424)) {
					mensaje = preguntaVacia.replace("$", "La pregunta P424");
					view = rgC4P424;
					error = true;
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv01(
				App.getInstance().getEmpresa(),
				new Moduloiv01().getSecCap(getListFields(this, new String[] {
						 "C4P418" })));
		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		rgC4P420.requestFocus();
		bloqueo_M4P020();
		onChangeP422();
		//2310
//		if (Util.getInt(bean.c4p408) == 1 && Util.getInt(bean.c4p418) == 1) {
//			Util.lockView(getActivity(), false, rgC4P422, rgC4P423, rgC4P424);
//			onChangeP422();
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC4P422, rgC4P423, rgC4P424);
//		}

		rgC4P420.requestFocus();
	}

	public void bloqueo_M4P020() {
		if (chbC4P421_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P421_5ESP);
			txtC4P421_5ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P421_5ESP);
		}
	}

	public void onChangeP422() {
		Integer valor = Integer.parseInt(rgC4P422.getTagSelected("0")
				.toString());

		if (valor == 1) {
			Util.lockView(getActivity(), false, rgC4P423, rgC4P424);
			onChangeP423();
			rgC4P423.requestFocus();

		} else {
			Util.cleanAndLockView(getActivity(), rgC4P423, rgC4P424);
			if (rgC4P422.isPressed()) {
				if (rgC4P422.getTagSelected("").toString().equals("2")) {
				//	parent.nextFragment(CuestionarioFragmentActivity.MODULO_IV+6);
				}
			}
		}
	}

	public void onChangeP423() {
		Integer valor = Integer.parseInt(rgC4P423.getTagSelected("0")
				.toString());
		if (valor == 1) {
			Util.lockView(getActivity(), false, rgC4P424);
			rgC4P424.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), rgC4P424);
			if (rgC4P423.isPressed()) {
				if (rgC4P423.getTagSelected("").toString().equals("2")) {
			//		parent.nextFragment(CuestionarioFragmentActivity.MODULO_IV+6);
				}
			}
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

package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
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

public class Mod_IV_Fragment_007 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC4P425A_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC4P425A_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P425A_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P426_1;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P426_2;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P426_3;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P426_4;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P426_5;
	@FieldAnnotation(orderIndex = 9)
	public TextField txtC4P426_5ESP;
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgC4P427;

	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private LabelComponent lblTitulo, lblSubTitulo;
	private GridComponent grEspe01;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_007() {
	}

	public Mod_IV_Fragment_007 parent(MasterActivity parent) {
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

		chbC4P425A_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p425a_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP425Ax");
		chbC4P425A_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p425a_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP425Ax");
		chbC4P425A_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p425a_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("FuncionP425A");

		chbC4P426_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p426_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P426_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p426_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P426_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p426_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P426_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p426_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P426_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p426_5, "1:0").callback("FuncionCheck").size(
				LayoutParams.WRAP_CONTENT, 140);
		txtC4P426_5ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 450).hint(R.string.especifique);

		grEspe01 = new GridComponent(this.getActivity(), 2);
		grEspe01.colorFondo(android.R.color.transparent);
		grEspe01.addComponent(chbC4P426_5);
		grEspe01.addComponent(txtC4P426_5ESP);

		rgC4P427 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p427_1, R.string.c1c100m4p427_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL).callback("saltoP427");

		Filtros.setFiltro(txtC4P426_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c1c100m4p425a, Gravity.START, chbC4P425A_1,
				chbC4P425A_2, chbC4P425A_3);
		q2 = createQuestionSection(R.string.c1c100m4p426, Gravity.START, chbC4P426_1, chbC4P426_2,
				chbC4P426_3, chbC4P426_4, grEspe01.component());
		q3 = createQuestionSection(R.string.c1c100m4p427, rgC4P427);

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
		String[] extras = null;
		if (chbC4P425A_3.isChecked()) {

			extras = new String[] { "C4P428_1", "C4P428_2", "C4P428_3",
					"C4P428_4", "C4P428_5", "C4P428_6", "C4P428_7",
					"C4P428_7ESP", "C4P429A_1", "C4P429A_2", "C4P429A_3",
					"C4P429A_4", "C4P429A_5", "C4P429A_4ESP", "C4P430_1",
					"C4P430_2", "C4P430_3", "C4P430_4", "C4P430_5",
					"C4P430_5ESP", "C4P431_1", "C4P431_2", "C4P431_3", "C4P431_4", "C4P432_1", "C4P432_2", "C4P432_3",
					"C4P432_4", "C4P432_5", "C4P432_6", "C4P432_7ESP",
					"C4P432_7", "C4P432_8",  "C4P432A" };
		}

		try {

			if (!getCuestionarioService().saveOrUpdate(bean,
					bean.getSecCap(getListFields(this, extras)))) {
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
		String especifique_no_vacio = getString(R.string.pregunta_especifique);
		error = false;

		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (!chbC4P425A_1.isChecked() && !chbC4P425A_2.isChecked()
				&& !chbC4P425A_3.isChecked()) {
			mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P425A";
			view = chbC4P425A_1;
			error = true;
			return false;
		}

		if (chbC4P425A_1.isChecked() || chbC4P425A_2.isChecked()) {
			if (!chbC4P426_1.isChecked() && !chbC4P426_2.isChecked()
					&& !chbC4P426_3.isChecked() && !chbC4P426_4.isChecked()
					&& !chbC4P426_5.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P426";
				view = chbC4P426_1;
				error = true;
				return false;
			}
			if (chbC4P426_5.isChecked()) {
				if (Util.esVacio(txtC4P426_5ESP)) {
					mensaje = preguntaVacia.replace("$",
							"La Preg.426 (Especifique)");
					view = txtC4P426_5ESP;
					error = true;
					return false;
				} else {
					if (txtC4P426_5ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P426_5ESP;
						error = true;
						return false;
					}
				}
			}
			if (Util.esVacio(rgC4P427)) {
				mensaje = preguntaVacia.replace("$", "La pregunta P427");
				view = rgC4P427;
				error = true;
				return false;
			}
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv01(
				App.getInstance().getEmpresa(),
				new Moduloiv01().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		if (chbC4P425A_3.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P425A_1, chbC4P425A_2,
					chbC4P426_1, chbC4P426_2, chbC4P426_3, chbC4P426_4,
					chbC4P426_5, txtC4P426_5ESP, rgC4P427);
		} else {
			Util.lockView(getActivity(), false, chbC4P425A_1, chbC4P425A_2);
		}
		if (chbC4P425A_1.isChecked() || chbC4P425A_2.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P425A_3);
			Util.lockView(getActivity(), false, chbC4P426_1, chbC4P426_2,
					chbC4P426_3, chbC4P426_4, chbC4P426_5, rgC4P427);
		} else {
			Util.lockView(getActivity(), false, chbC4P425A_3);
		}
		if (chbC4P426_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P426_5ESP);
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P426_5ESP);
		}
		if (chbC4P425A_3.isChecked())
			chbC4P425A_3.requestFocus();
		else
			chbC4P425A_1.requestFocus();
	}

	public void FuncionP425Ax() {
		if (chbC4P425A_1.isChecked() || chbC4P425A_2.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P425A_3);
			Util.lockView(getActivity(), false, chbC4P426_1, chbC4P426_2,
					chbC4P426_3, chbC4P426_4, chbC4P426_5, rgC4P427);
//			FuncionCheck();
		} else {
			Util.lockView(getActivity(), false, chbC4P425A_3);
		}
	}

	public void FuncionP425A() {
		if (chbC4P425A_3.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P425A_1, chbC4P425A_2,
					chbC4P426_1, chbC4P426_2, chbC4P426_3, chbC4P426_4,
					chbC4P426_5, txtC4P426_5ESP, rgC4P427);
		} else {
			Util.lockView(getActivity(), false, chbC4P425A_1, chbC4P425A_2);
//			FuncionP425Ax();
		}
	}

	public void FuncionCheck() {
		if (chbC4P426_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P426_5ESP);
			txtC4P426_5ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P426_5ESP);
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
	
	public void saltoP427(){
		if (rgC4P427.isPressed()) {
			if (rgC4P427.getTagSelected("").toString().equals("2")) {
			//	parent.nextFragment(CuestionarioFragmentActivity.MODULO_IV+7);
			}
		}
	}
}

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
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_010 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P433;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC4P434_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P434_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P434_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P434_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P434_5;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P434_6;
	@FieldAnnotation(orderIndex = 8)
	public TextField txtC4P434_6ESP;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC4P435;

	Caratula caratula;
	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private LabelComponent lblTitulo, lblTitulo1;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent grEspe;

	public Mod_IV_Fragment_010() {
	}

	public Mod_IV_Fragment_010 parent(MasterActivity parent) {
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

		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.ProcesoProductivo).textSize(20).centrar().negrita();

		rgC4P433 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p433_1, R.string.c1c100m4p433_2,
				R.string.c1c100m4p433_3, R.string.c1c100m4p433_4,
				R.string.c1c100m4p433_5).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
		chbC4P434_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p434_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P434_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p434_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P434_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p434_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P434_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p434_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P434_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p434_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P434_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p434_6, "1:0").size(LayoutParams.WRAP_CONTENT,
				140).callback("FuncionCheckP33");
		txtC4P434_6ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		rgC4P435 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p435_1, R.string.c1c100m4p435_2,
				R.string.c1c100m4p435_3, R.string.c1c100m4p435_4,
				R.string.c1c100m4p435_5, R.string.c1c100m4p435_6).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);

		grEspe = new GridComponent(this.getActivity(), 2);
		grEspe.colorFondo(android.R.color.transparent);
		grEspe.addComponent(chbC4P434_6);
		grEspe.addComponent(txtC4P434_6ESP);

		Filtros.setFiltro(txtC4P434_6ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m4p433, Gravity.START,rgC4P433);
		q2 = createQuestionSection(R.string.c1c100m4p434, Gravity.START, chbC4P434_1,
				chbC4P434_2, chbC4P434_3, chbC4P434_4, chbC4P434_5,
				grEspe.component());

		q3 = createQuestionSection(R.string.c1c100m4p435, Gravity.START, rgC4P435);

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
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

//		int valor = Integer.parseInt(caratula.ciiu_cd.toString()
//				.substring(0, 2));
//		if (valor >= 10 && valor <= 33) {
			if (Util.esVacio(rgC4P433)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P433");
				view = rgC4P433;
				error = true;
				return false;
			}
//		}

		if (!chbC4P434_1.isChecked() && !chbC4P434_2.isChecked()
				&& !chbC4P434_3.isChecked() && !chbC4P434_4.isChecked()
				&& !chbC4P434_5.isChecked() && !chbC4P434_6.isChecked()) {
			mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P434";
			view = chbC4P434_1;
			error = true;
			return false;
		}
		if (chbC4P434_6.isChecked()) {
			if (Util.esVacio(txtC4P434_6ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.434 (Especifique)");
				view = txtC4P434_6ESP;
				error = true;
				return false;
			} else {
				if (txtC4P434_6ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC4P434_6ESP;
					error = true;
					return false;
				}
			}
		}
		if (Util.esVacio(rgC4P435)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P435");
			view = rgC4P435;
			error = true;
			return false;
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv01(
				App.getInstance().getEmpresa(),
				new Moduloiv01().getSecCap(getListFields(this, new String[] {
						"C4P425A"})));
		caratula = App.getInstance().getEmpresa();

		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {

//		int valor = Integer.parseInt(caratula.ciiu_cd.toString()
//				.substring(0, 2));
		FuncionCheckP33();
//		if (valor >= 10 && valor <= 33) {
//			Util.lockView(getActivity(), false, rgC4P433);
//			rgC4P433.requestFocus();
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC4P433);
//			chbC4P434_1.requestFocus();
//		}
		rgC4P433.requestFocus();
	}

	public void FuncionCheckP33() {
		if (!chbC4P434_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC4P434_6ESP);
		} else {
			Util.lockView(getActivity(), false, txtC4P434_6ESP);
			txtC4P434_6ESP.requestFocus();
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

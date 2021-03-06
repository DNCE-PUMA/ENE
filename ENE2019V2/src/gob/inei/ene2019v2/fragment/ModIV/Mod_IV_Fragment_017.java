package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
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
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_017 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P456;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC4P457;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P457_1;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P458_1;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P458_2;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P458_3;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P458_4;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P458_5;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P458_6;
	
	@FieldAnnotation(orderIndex = 10)
	public TextField txtC4P458_6ESP;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC4P459_1;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P459_2;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P459_3;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC4P460_1;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P460_2;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC4P460_3;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC4P460_4;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC4P460_5;
	@FieldAnnotation(orderIndex = 19)
	public TextField txtC4P460_5ESP;

	private CuestionarioService cuestionarioService;
	private Moduloiv02 bean;
	private LabelComponent lblTitulo, lblTitulo1, lbltitle, lblC4P457;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent grEspe, grEspe2, grEspe3;

	public Mod_IV_Fragment_017() {
	}

	public Mod_IV_Fragment_017 parent(MasterActivity parent) {
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
				.text(R.string.Capitulo04).textSize(20).centrar().negrita();

		rgC4P456 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p056_1, R.string.c1c100m4p056_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP456");

		txtC4P457 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().hint(R.string.porcentaje)
				.negrita();
		
		txtC4P457.addTextChangedListener(twP457);
		chbC4P457_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p404A, "1:0").size(WRAP_CONTENT, 200)
				.callback("FuncionCheck457");
		
		lblC4P457 = new LabelComponent(this.getActivity()).size(35, 100)
				.text(R.string.c1c100m4p004_1).textSize(14).centrar().negrita();

		chbC4P458_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p458_1, "1:0").size(WRAP_CONTENT, 550);
		chbC4P458_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p458_2, "1:0").size(WRAP_CONTENT, 550);
		chbC4P458_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p458_3, "1:0").size(WRAP_CONTENT, 550);
		chbC4P458_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p458_4, "1:0").size(WRAP_CONTENT, 550);
		chbC4P458_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p458_5, "1:0").size(WRAP_CONTENT, 550);
		chbC4P458_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p458_6, "1:0").size(LayoutParams.WRAP_CONTENT,140).callback("FuncionCheck458");
		txtC4P458_6ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
//		chbC4P458_6 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p458_4, "1:0").size(WRAP_CONTENT, 550);
		
		chbC4P459_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p459_1, "1:0").size(WRAP_CONTENT, 550);
		chbC4P459_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p459_2, "1:0").size(WRAP_CONTENT, 550);
		chbC4P459_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p459_3, "1:0").size(WRAP_CONTENT, 550);

		chbC4P460_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p460_1, "1:0").size(WRAP_CONTENT, 550);
		chbC4P460_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p460_2, "1:0").size(WRAP_CONTENT, 550);
		chbC4P460_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p460_3, "1:0").size(WRAP_CONTENT, 550);
		chbC4P460_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p460_4, "1:0").size(WRAP_CONTENT, 550);
		
		chbC4P460_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p460_5, "1:0").size(LayoutParams.WRAP_CONTENT,
				140).callback("FuncionCheck460");

		txtC4P460_5ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();

		grEspe = new GridComponent(this.getActivity(), 2);
		grEspe.colorFondo(android.R.color.transparent);
		grEspe.addComponent(chbC4P458_6);
		grEspe.addComponent(txtC4P458_6ESP);

		grEspe2 = new GridComponent(this.getActivity(), 1);
		grEspe2.addComponent(txtC4P457);
		grEspe2.addComponent(lblC4P457);
		grEspe2.colorFondo(R.color.transparent);

		grEspe3 = new GridComponent(this.getActivity(), 2);
		grEspe3.addComponent(chbC4P460_5);
		grEspe3.addComponent(txtC4P460_5ESP);
		grEspe3.colorFondo(R.color.transparent);

		Filtros.setFiltro(txtC4P457, Filtros.TIPO.NUMBER, 3, -1, null, 1, 100);
		Filtros.setFiltro(txtC4P458_6ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q8 = createQuestionSection(R.string.c1c100m4p456, rgC4P456);
		q1 = createQuestionSection(R.string.c1c100m4p457, grEspe2.component(),
				chbC4P457_1);
		q2 = createQuestionSection(R.string.c1c100m4p458, chbC4P458_1,
				chbC4P458_2, chbC4P458_3, chbC4P458_4,chbC4P458_5, grEspe.component());

		q3 = createQuestionSection(R.string.c1c100m4p459, chbC4P459_1,
				chbC4P459_2, chbC4P459_3);
		q4 = createQuestionSection(R.string.c1c100m4p460, chbC4P460_1,
				chbC4P460_2, chbC4P460_3, chbC4P460_4 , grEspe3.component());

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q8);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);

		return contenedor;
	}

	@Override
	public boolean grabar() {
		uiToEntity(bean);
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

		if (Util.esVacio(rgC4P456)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P456");
			view = rgC4P456;
			error = true;
			return false;
		}
		if (rgC4P456.getTagSelected("").toString().equals("1")) {

			if (Util.esVacio(txtC4P457) && !chbC4P457_1.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P457");
				view = txtC4P457;
				error = true;
				return false;

			}
			if (!chbC4P458_1.isChecked() && !chbC4P458_2.isChecked()
					&& !chbC4P458_3.isChecked() && !chbC4P458_4.isChecked()
					&& !chbC4P458_5.isChecked() && !chbC4P458_6.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P458";
				view = chbC4P458_1;
				error = true;
				return false;
			}
			if (chbC4P458_6.isChecked()) {
				if (Util.esVacio(txtC4P458_6ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.458 (Especifique)");
					view = txtC4P458_6ESP;
					error = true;
					return false;
				} else {
					if (txtC4P458_6ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P458_6ESP;
						error = true;
						return false;
					}
				}
			}

			if (!chbC4P459_1.isChecked() && !chbC4P459_2.isChecked()
					&& !chbC4P459_3.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P459";
				view = chbC4P459_1;
				error = true;
				return false;
			}

			if (!chbC4P460_1.isChecked() && !chbC4P460_2.isChecked()
					&& !chbC4P460_3.isChecked() && !chbC4P460_4.isChecked() && !chbC4P460_5.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P460";
				view = chbC4P460_1;
				error = true;
				return false;
			}
			if (chbC4P460_5.isChecked()) {

				if (Util.esVacio(txtC4P460_5ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.460 (Especifique)");
					view = txtC4P460_5ESP;
					error = true;
					return false;
				} else {
					if (txtC4P460_5ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P460_5ESP;
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
		if (bean == null) {
			bean = new Moduloiv02();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		FuncionP456();

		rgC4P456.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public void FuncionP456() {
		if (rgC4P456.getTagSelected("").toString().equals("2")) {
			Util.cleanAndLockView(getActivity(), txtC4P457, chbC4P457_1,
					chbC4P458_1, chbC4P458_2, chbC4P458_3, chbC4P458_4,
					chbC4P458_6, txtC4P458_6ESP, chbC4P459_1, chbC4P459_2,
					chbC4P459_3, chbC4P460_1, chbC4P460_2, chbC4P460_3,
					chbC4P460_4,chbC4P460_5, txtC4P460_5ESP);
		} else {
			Util.lockView(getActivity(), false, txtC4P457, chbC4P457_1,
					chbC4P458_1, chbC4P458_2, chbC4P458_3, chbC4P458_4,
					chbC4P458_6, chbC4P459_1, chbC4P459_2, chbC4P459_3,
					chbC4P460_1, chbC4P460_2, chbC4P460_3, chbC4P460_4,chbC4P460_5,
					txtC4P460_5ESP);
			FuncionCheck457();
			FuncionCheck458();
			FuncionCheck460();
			txtC4P457.requestFocus();
		}
	}

	public void FuncionCheck457() {
		if (rgC4P456.isTagSelected(1)) {
			if (chbC4P457_1.isChecked()) {
				Util.cleanAndLockView(getActivity(), txtC4P457);
			} else {
				Util.lockView(getActivity(), false, txtC4P457);
			}
		}
	}

	public void FuncionCheck458() {
		if (!chbC4P458_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC4P458_6ESP);
		} else {
			Util.lockView(getActivity(), false, txtC4P458_6ESP);
			txtC4P458_6ESP.requestFocus();
		}
	}

	public void FuncionCheck460() {
		if (!chbC4P460_5.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC4P460_5ESP);
		} else {
			Util.lockView(getActivity(), false, txtC4P460_5ESP);
			txtC4P460_5ESP.requestFocus();
		}
	}

	private TextWatcher twP457 = new TextWatcher() {

		@Override
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
		}

		@Override
		public void afterTextChanged(Editable s) {

			if (Util.getInt(txtC4P457) > 0 && Util.getInt(txtC4P457) <= 100) {
				Util.cleanAndLockView(getActivity(), chbC4P457_1);
			} else if (Util.esVacio(txtC4P457) && rgC4P456.isTagSelected(1)) {
				Util.lockView(getActivity(), false, chbC4P457_1);
			}

		}

	};

	@Override
	public Caratula getEntity() {
		return App.getInstance().getEmpresa();
	}

}

package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
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
import gob.inei.ene2019v2.model.Moduloiv02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_015 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P449;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC4P450;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P450_1;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P454_1;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P454_2;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P454_3;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P454_4;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P454_5;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P454_6;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC4P454_7;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC4P454_8;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P454_9;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P454_10;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC4P454_11;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P454_12;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC4P454_13;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC4P454_14;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC4P454_15;
	@FieldAnnotation(orderIndex = 19)
	public TextField txtC4P454_15ESP;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC4P454_16;	
	@FieldAnnotation(orderIndex = 21)
	public RadioGroupOtherField rgC4P455;
	@FieldAnnotation(orderIndex = 22)
	public TextField txtC4P455_ESP;
	@FieldAnnotation(orderIndex = 23)
	public CheckBoxField chbC4P455A_1;
	@FieldAnnotation(orderIndex = 24)
	public CheckBoxField chbC4P455A_2;
	@FieldAnnotation(orderIndex = 25)
	public CheckBoxField chbC4P455A_3;
	@FieldAnnotation(orderIndex = 26)
	public CheckBoxField chbC4P455A_4;
	@FieldAnnotation(orderIndex = 27)
	public CheckBoxField chbC4P455A_5;
	@FieldAnnotation(orderIndex = 28)
	public CheckBoxField chbC4P455A_6;
	@FieldAnnotation(orderIndex = 29)
	public TextField txtC4P455A_6ESP;
	@FieldAnnotation(orderIndex = 30)
	public CheckBoxField chbC4P455A_7;
	@FieldAnnotation(orderIndex = 31)
	public RadioGroupOtherField rgC4P4551;
	@FieldAnnotation(orderIndex = 32)
	public RadioGroupOtherField rgC4P455B;
	@FieldAnnotation(orderIndex = 33)
	public RadioGroupOtherField rgC4P455C;
	@FieldAnnotation(orderIndex = 34)
	public TextField txtC4P455C_ESP;

	private CuestionarioService cuestionarioService;
	private Moduloiv02 bean;
	private LabelComponent lblTitulo, lblTitulo1;
	public LabelComponent lblvacio1, lblvacio2, lbl450b, lbl450bitem1,
			lblC4P450, lbl450bitem2, lbl450bitem3;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent2 grEspe, grp450, grEspe1;
	GridComponent grEspe2;

	public Mod_IV_Fragment_015() {
	}

	public Mod_IV_Fragment_015 parent(MasterActivity parent) {
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

		rgC4P449 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p449_1, R.string.c1c100m4p449_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);

		txtC4P450 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().hint(R.string.porcentaje)
				.negrita();
		txtC4P450.addTextChangedListener(twP450);
		chbC4P450_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p404A, "1:0").size(WRAP_CONTENT, 200)
				.callback("FUNCION450");
		lblC4P450 = new LabelComponent(this.getActivity()).size(35, 100)
				.text(R.string.c1c100m4p004_1).textSize(14).centrar().negrita();

		grEspe2 = new GridComponent(this.getActivity(), 1);
		grEspe2.addComponent(txtC4P450);
		grEspe2.addComponent(lblC4P450);
		grEspe2.colorFondo(R.color.transparent);

		chbC4P454_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_1, "1:0").size(WRAP_CONTENT, 550)
				.callback("FUNCION454");
		chbC4P454_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_2, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_3, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_4, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_5, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_6, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_7, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_8, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_9, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_10, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_11, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_12, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_13 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_13, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_14 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_14, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION454");
		chbC4P454_15 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_15, "1:0").size(
				LayoutParams.WRAP_CONTENT, 140).callback("FUNCION454");

		txtC4P454_15ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		chbC4P454_16 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p454_16, "1:0").size(
				LayoutParams.WRAP_CONTENT, 140).callback("FUNCION454");
		
		rgC4P455 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p455_1, R.string.c1c100m4p455_2,
				R.string.c1c100m4p455_3, R.string.c1c100m4p455_4,
				R.string.c1c100m4p455_5, R.string.c1c100m4p455_6).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);
		txtC4P455_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		rgC4P455.agregarEspecifique(5, txtC4P455_ESP);

		chbC4P455A_1 = new CheckBoxField(this.getActivity(),
				R.string.c4c400m4p454A_1, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION455A_1");
		chbC4P455A_2 = new CheckBoxField(this.getActivity(),
				R.string.c4c400m4p454A_2, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION455A_1");
		chbC4P455A_3 = new CheckBoxField(this.getActivity(),
				R.string.c4c400m4p454A_3, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION455A_1");
		chbC4P455A_4 = new CheckBoxField(this.getActivity(),
				R.string.c4c400m4p454A_4, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION455A_1");
		chbC4P455A_5 = new CheckBoxField(this.getActivity(),
				R.string.c4c400m4p454A_5, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION455A_1");
		chbC4P455A_6 = new CheckBoxField(this.getActivity(),
				R.string.c4c400m4p454A_6, "1:0").size(
				LayoutParams.WRAP_CONTENT, 140).callback("FUNCION455A").callback("FUNCION455A_1");
		txtC4P455A_6ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		chbC4P455A_7 = new CheckBoxField(this.getActivity(),
				R.string.c4c400m4p454A_7, "1:0").size(WRAP_CONTENT, 550).callback("FUNCION455A_2");

		grEspe1 = new GridComponent2(this.getActivity(), 2);
		grEspe1.colorFondo(android.R.color.transparent);
		grEspe1.addComponent(chbC4P455A_6);
		grEspe1.addComponent(txtC4P455A_6ESP);
		grEspe1.colorFondo(R.color.transparent);

		rgC4P4551 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL);
		
		rgC4P455B = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FUNCION455B");

		rgC4P455C = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p455C_1, R.string.c1c100m4p455C_2,
				R.string.c1c100m4p455C_3, R.string.c1c100m4p455C_4,
				R.string.c1c100m4p455C_5, R.string.c1c100m4p455C_6).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
		txtC4P455C_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		rgC4P455C.agregarEspecifique(5, txtC4P455C_ESP);

		grEspe = new GridComponent2(this.getActivity(), 2);
		grEspe.colorFondo(android.R.color.transparent);
		grEspe.addComponent(chbC4P454_15);
		grEspe.addComponent(txtC4P454_15ESP);
		grEspe.colorFondo(R.color.transparent);

		lblvacio1 = new LabelComponent(this.getActivity(), App.ESTILO).size(
				altoComponente, 280);
		lblvacio2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 150).text("¿Realizó:").textSize(17);
		lbl450b = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 250).text(R.string.c1c100m4p450b)
				.textSize(17);

		lbl450bitem1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 40, 280).text(R.string.c1c100m4p450A1)
				.textSize(16);

		lbl450bitem2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 40, 280).text(R.string.c1c100m4p450A2)
				.textSize(16);
		lbl450bitem3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 40, 280).text(R.string.c1c100m4p450A3)
				.textSize(16);

		Filtros.setFiltro(txtC4P454_15ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC4P455_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		// Filtros.setFiltro(txtC4P455A_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC4P450, Filtros.TIPO.NUMBER, 3, -1, null, 1, 100);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m4p449, rgC4P449);
		q2 = createQuestionSection(R.string.c1c100m4p450a, grEspe2.component(),
				chbC4P450_1);
		q3 = createQuestionSection(R.string.c1c100m4p454, chbC4P454_1,
				chbC4P454_2, chbC4P454_3, chbC4P454_4, chbC4P454_5,
				chbC4P454_6, chbC4P454_7, chbC4P454_8, chbC4P454_9,
				chbC4P454_10, chbC4P454_11, chbC4P454_12, chbC4P454_13,
				chbC4P454_14, grEspe.component(), chbC4P454_16);
		q4 = createQuestionSection(R.string.c1c100m4p455, rgC4P455);
		q5 = createQuestionSection(R.string.c1c100m4p455A, chbC4P455A_1,
				chbC4P455A_2, chbC4P455A_3, chbC4P455A_4, chbC4P455A_5,
				grEspe1.component(), chbC4P455A_7);
		
		
		q8 = createQuestionSection(R.string.c1c100m4p4551, rgC4P4551);
		q6 = createQuestionSection(R.string.c1c100m4p455B, rgC4P455B);
		q7 = createQuestionSection(R.string.c1c100m4p455C, rgC4P455C);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
		form.addView(q5);
		form.addView(q8);
		form.addView(q6);
		form.addView(q7);
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

		if (Util.esVacio(rgC4P449)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P449");
			view = rgC4P449;
			error = true;
			return false;
		}

		if (Util.esVacio(txtC4P450) && !chbC4P450_1.isChecked()) {
			mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P450";
			view = txtC4P450;
			error = true;
			return false;
		}

		if (!chbC4P454_1.isChecked() && !chbC4P454_2.isChecked()
				&& !chbC4P454_3.isChecked() && !chbC4P454_4.isChecked()
				&& !chbC4P454_5.isChecked() && !chbC4P454_6.isChecked()
				&& !chbC4P454_7.isChecked() && !chbC4P454_8.isChecked()&& !chbC4P454_9.isChecked()
				&& !chbC4P454_10.isChecked() && !chbC4P454_11.isChecked()
				&& !chbC4P454_11.isChecked() && !chbC4P454_12.isChecked()
				&& !chbC4P454_13.isChecked() && !chbC4P454_14.isChecked()
				&& !chbC4P454_15.isChecked() && !chbC4P454_16.isChecked() ) {
			mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P454";
			view = chbC4P454_1;
			error = true;
			return false;
		}

		if (chbC4P454_15.isChecked()) {
			if (Util.esVacio(txtC4P454_15ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.454 (Especifique)");
				view = txtC4P454_15ESP;
				error = true;
				return false;
			} else {
				if (txtC4P454_15ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC4P454_15ESP;
					error = true;
					return false;
				}
			}
		}
		if (chbC4P454_1.isChecked() || chbC4P454_2.isChecked()) {
			if (Util.esVacio(rgC4P455)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P455");
				view = rgC4P455;
				error = true;
				return false;
			}

			if (rgC4P455.getTagSelected("").toString().equals("6")) {
				if (Util.esVacio(txtC4P455_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.455 (Especifique)");
					view = txtC4P455_ESP;
					error = true;
					return false;
				}
			}
		}
		if (Util.esVacio(rgC4P4551)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P455_1");
			view = rgC4P4551;
			error = true;
			return false;
		}
		
		
		if (!chbC4P455A_1.isChecked() && !chbC4P455A_2.isChecked()
				&& !chbC4P455A_3.isChecked()
				&& !chbC4P455A_4.isChecked()
				&& !chbC4P455A_5.isChecked()
				&& !chbC4P455A_6.isChecked()
				&& !chbC4P455A_7.isChecked()) {
			mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P455A";
			view = chbC4P455A_1;
			error = true;
			return false;
		}

		if (chbC4P455A_6.isChecked()) {
			if (Util.esVacio(txtC4P455A_6ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.455A (Especifique)");
				view = txtC4P455A_6ESP;
				error = true;
				return false;
			} else {
				if (txtC4P455A_6ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC4P455A_6ESP;
					error = true;
					return false;
				}
			}
		}
		
		
		
		if (Util.esVacio(rgC4P455B)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P455B");
			view = rgC4P455B;
			error = true;
			return false;
		}
		if (!rgC4P455B.getTagSelected("").toString().equals("1")) {
			if (Util.esVacio(rgC4P455C)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P445C");
				view = rgC4P455C;
				error = true;
				return false;
			}
		}
		if (rgC4P455C.getTagSelected("").toString().equals("7")) {
			if (Util.esVacio(txtC4P455C_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.455C (Especifique)");
				view = txtC4P455C_ESP;
				error = true;
				return false;
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
		FUNCION450();
		FUNCION454();
		FUNCION455A();
		FUNCION455A_1();
		FUNCION455A_2();
		FUNCION455B();
		rgC4P449.requestFocus();
	}

	public void FUNCION450() {
		if (chbC4P450_1.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC4P450);
		} else {
			Util.lockView(getActivity(), false, txtC4P450);
			txtC4P450.requestFocus();
		}
	}
//VERIFICACIÓN	:	Si C4P454_15= 1 and (C4P454_1=1  Pase a C4P454_15ESP, luego a C4P455
//                  Si C4P454_15 = 0 and (C4P454_1=1   Pase a C4P454_16, luego a C4P455
	
//                  Si C4P454_15= 1 and C4P454_1=0  Pase a C4P454_15ESP, luego a C4P455A_1
//                  Si C4P454_15 = 0 and C4P454_1=0   Pase a C4P454_16, luego a C4P455A_1

	public void FUNCION454() {
		if (chbC4P454_1.isChecked()/* || chbC4P454_2.isChecked()*/) {
			Util.lockView(getActivity(), false, rgC4P455);
			rgC4P455.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), rgC4P455);
			chbC4P455A_1.requestFocus();
		}
		if (chbC4P454_15.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P454_15ESP);
			txtC4P454_15ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P454_15ESP);
		}

		if (chbC4P454_1.isChecked() || chbC4P454_2.isChecked()
				|| chbC4P454_3.isChecked() || chbC4P454_4.isChecked()
				|| chbC4P454_5.isChecked() || chbC4P454_6.isChecked()
				|| chbC4P454_7.isChecked() || chbC4P454_8.isChecked()
				|| chbC4P454_8.isChecked() || chbC4P454_10.isChecked()
				|| chbC4P454_11.isChecked() || chbC4P454_12.isChecked()
				|| chbC4P454_13.isChecked() || chbC4P454_14.isChecked()
				|| chbC4P454_15.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P454_16);
		} else {
			Util.lockView(getActivity(), false, chbC4P454_16);
		}

		if (chbC4P454_16.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P454_1, chbC4P454_2,
					chbC4P454_3, chbC4P454_4, chbC4P454_5, chbC4P454_6,
					chbC4P454_7, chbC4P454_8, chbC4P454_9, chbC4P454_10,
					chbC4P454_11, chbC4P454_12, chbC4P454_13, chbC4P454_14,
					chbC4P454_15, txtC4P454_15ESP);
		} else {
			Util.lockView(getActivity(), false, chbC4P454_1, chbC4P454_2,
					chbC4P454_3, chbC4P454_4, chbC4P454_5, chbC4P454_6,
					chbC4P454_7, chbC4P454_8, chbC4P454_9, chbC4P454_10,
					chbC4P454_11, chbC4P454_12, chbC4P454_13, chbC4P454_14,
					chbC4P454_15);
		}
	}

	public void FUNCION455A() {
		if (chbC4P455A_6.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P455A_6ESP);
			txtC4P455A_6ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P455A_6ESP);
		}
	}
	
	public void FUNCION455A_1() {
		if (chbC4P455A_1.isChecked() || chbC4P455A_2.isChecked() || chbC4P455A_3.isChecked()|| chbC4P455A_4.isChecked() || chbC4P455A_5.isChecked() || chbC4P455A_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P455A_7);
		} else {
			Util.lockView(getActivity(), false, chbC4P455A_7);
		}
	}
	
	public void FUNCION455A_2() {
		if (chbC4P455A_7.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P455A_1,chbC4P455A_2,chbC4P455A_3,chbC4P455A_4,chbC4P455A_5,chbC4P455A_6,txtC4P455A_6ESP);
			rgC4P455B.requestFocus();
		} else {
			Util.lockView(getActivity(), false, chbC4P455A_1,chbC4P455A_2,chbC4P455A_3,chbC4P455A_4,chbC4P455A_5,chbC4P455A_6);
		}
	}

	public void FUNCION455B() {

		Integer valor = Integer.parseInt(rgC4P455B.getTagSelected("0")
				.toString());
		if (valor == 1) {
			Util.cleanAndLockView(getActivity(), rgC4P455C);
		} else {
			Util.lockView(getActivity(), false, rgC4P455C);
			rgC4P455B.requestFocus();
		}
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	private TextWatcher twP450 = new TextWatcher() {

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

			if (Util.getInt(txtC4P450) > 0 && Util.getInt(txtC4P450) <= 100) {
				Util.cleanAndLockView(getActivity(), chbC4P450_1);
			} else if (Util.esVacio(txtC4P450)) {
				Util.lockView(getActivity(), false, chbC4P450_1);
			}
		}

	};

	@Override
	public Caratula getEntity() {
		return App.getInstance().getEmpresa();
	}
}

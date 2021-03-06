package gob.inei.ene2019v2.fragment.ModIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiii02;
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

public class Mod_III_Fragment_012 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC3P333;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC3P333A_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC3P333A_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC3P333A_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC3P333A_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC3P333A_5;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC3P333A_6;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC3P333A_7;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC3P333A_8;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC3P333A_9;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC3P333A_10;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC3P333A_11;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC3P333A_12;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC3P333A_13;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC3P333A_14;
	@FieldAnnotation(orderIndex = 16)
	public TextField txtC3P333A_14ESP;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC3P333B_1;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC3P333B_2;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC3P333B_3;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC3P333B_4;
	@FieldAnnotation(orderIndex = 21)
	public CheckBoxField chbC3P333B_5;
	@FieldAnnotation(orderIndex = 22)
	public CheckBoxField chbC3P333B_6;
	@FieldAnnotation(orderIndex = 23)
	public CheckBoxField chbC3P333B_7;
	@FieldAnnotation(orderIndex = 24)
	public CheckBoxField chbC3P333B_8;
	@FieldAnnotation(orderIndex = 25)
	public CheckBoxField chbC3P333B_9;
	@FieldAnnotation(orderIndex = 26)
	public CheckBoxField chbC3P333B_10;
	@FieldAnnotation(orderIndex = 27)
	public TextField txtC3P333B_10ESP;
	@FieldAnnotation(orderIndex = 28)
	public CheckBoxField chbC3P333C_1;
	@FieldAnnotation(orderIndex = 29)
	public CheckBoxField chbC3P333C_2;
	@FieldAnnotation(orderIndex = 30)
	public CheckBoxField chbC3P333C_3;
	@FieldAnnotation(orderIndex = 31)
	public CheckBoxField chbC3P333C_4;
	@FieldAnnotation(orderIndex = 32)
	public CheckBoxField chbC3P333C_5;
	@FieldAnnotation(orderIndex = 33)
	public CheckBoxField chbC3P333C_6;
	@FieldAnnotation(orderIndex = 34)
	public CheckBoxField chbC3P333C_7;
	@FieldAnnotation(orderIndex = 35)
	public CheckBoxField chbC3P333C_8;
	@FieldAnnotation(orderIndex = 36)
	public CheckBoxField chbC3P333C_9;
	@FieldAnnotation(orderIndex = 37)
	public CheckBoxField chbC3P333C_10;
	@FieldAnnotation(orderIndex = 38)
	public CheckBoxField chbC3P333C_11;
	@FieldAnnotation(orderIndex = 39)
	public CheckBoxField chbC3P333C_12;
	@FieldAnnotation(orderIndex = 40)
	public CheckBoxField chbC3P333C_13;
	@FieldAnnotation(orderIndex = 41)
	public TextField txtC3P333C_13ESP;
	@FieldAnnotation(orderIndex = 42)
	public CheckBoxField chbC3P333C_14;
	

	private CuestionarioService cuestionarioService;
	private Moduloiii02 bean;
	Caratula caratula;
	private LabelComponent lblTitulo, lblTitulo1;
	private GridComponent gridP34_6A, gridP34_6, gridP34_6_2;
	LinearLayout q0, q1, q2, q3, q4;

	public Mod_III_Fragment_012() {
	}

	public Mod_III_Fragment_012 parent(MasterActivity parent) {
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
				.text(R.string.mod3_titulo).textSize(21).centrar().negrita();
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod3_subtitulo1).textSize(20).centrar().negrita();
		
		rgC3P333 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m3p031_1, R.string.c1c100m3p031_2)
				.size(WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL).callback("FuncionP333");

		chbC3P333A_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_7, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_8, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_9, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_10, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_11, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_12, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_13 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_13, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333A_14 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033A_14, "1:0").size(WRAP_CONTENT, 140).callback("FuncionCheckA");
		txtC3P333A_14ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 350).hint(R.string.especifique)
		.soloTextoNumero();
		
		gridP34_6A = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
		gridP34_6A.addComponent(chbC3P333A_14);
		gridP34_6A.addComponent(txtC3P333A_14ESP);
		
		chbC3P333B_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_7, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_8, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_9, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC3P333B_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033B_10, "1:0").size(WRAP_CONTENT, 140).callback("FuncionCheck2");
		txtC3P333B_10ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 350).hint(R.string.especifique)
				.soloTextoNumero();
		
		chbC3P333C_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_7, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_8, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_9, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_10, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_11, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_12, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		chbC3P333C_13 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_13, "1:0").size(WRAP_CONTENT, 140).callback("FuncionCheck");
		chbC3P333C_14 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p033C_14, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionCheck");
		txtC3P333C_13ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 350).hint(R.string.especifique)
		.soloTextoNumero();
		
		gridP34_6 = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
		gridP34_6.addComponent(chbC3P333B_10);
		gridP34_6.addComponent(txtC3P333B_10ESP);
		
		gridP34_6_2 = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
		gridP34_6_2.addComponent(chbC3P333C_13);
		gridP34_6_2.addComponent(txtC3P333C_13ESP);

		Filtros.setFiltro(txtC3P333A_14ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC3P333B_10ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC3P333C_13ESP, Filtros.TIPO.ALFAN_U, 300, null);

	}
	
	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m3p033, rgC3P333);
		q2 = createQuestionSection(R.string.c1c100m3p033A,Gravity.START, chbC3P333A_1,
				chbC3P333A_2, chbC3P333A_3, chbC3P333A_4, chbC3P333A_5,
				chbC3P333A_6, chbC3P333A_7,chbC3P333A_8,chbC3P333A_9,chbC3P333A_10,chbC3P333A_11,chbC3P333A_12,chbC3P333A_13,gridP34_6A.component());
		q3 = createQuestionSection(R.string.c1c100m3p033B,Gravity.START, chbC3P333B_1,
				chbC3P333B_2, chbC3P333B_3, chbC3P333B_4, chbC3P333B_5,chbC3P333B_6,chbC3P333B_7,chbC3P333B_8,chbC3P333B_9,
			 gridP34_6.component());
		q4 = createQuestionSection(R.string.c1c100m3p033C,Gravity.START, chbC3P333C_1,
				chbC3P333C_2, chbC3P333C_3, chbC3P333C_4, chbC3P333C_5,
				chbC3P333C_6, chbC3P333C_7,chbC3P333C_8,chbC3P333C_9,chbC3P333C_10,chbC3P333C_11,chbC3P333C_12,gridP34_6_2.component(),chbC3P333C_14);

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
		uiToEntity(bean);
	//	llenarBean();
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
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
		
	//	if (!Util.esDiferente(bean.c3p320, 1) || (!Util.esDiferente(bean.c3p320, 2) && !Util.esDiferente(bean.c3p330, 1))) {
			if (Util.esVacio(rgC3P333)) {
				mensaje = pregunta_no_vacia
						.replace("$", "La pregunta P333");
				view = rgC3P333;
				error = true;
				return false;
			}
			
			if (rgC3P333.isTagSelected(1)) {
				if (!chbC3P333A_1.isChecked() && !chbC3P333A_2.isChecked()
						&& !chbC3P333A_3.isChecked()
						&& !chbC3P333A_4.isChecked()
						&& !chbC3P333A_5.isChecked()
						&& !chbC3P333A_6.isChecked()
						&& !chbC3P333A_7.isChecked()
						&& !chbC3P333A_8.isChecked() && !chbC3P333A_9.isChecked()
						&& !chbC3P333A_10.isChecked()
						&& !chbC3P333A_11.isChecked()
						&& !chbC3P333A_12.isChecked()
						&& !chbC3P333A_13.isChecked()
						&& !chbC3P333A_14.isChecked()) {
					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P333A";
					view = chbC3P333A_1;
					error = true;
					return false;
				}

				if (chbC3P333A_14.isChecked()) {
					if (Util.esVacio(txtC3P333A_14ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.333A-14 (Especifique)");
						view = txtC3P333A_14ESP;
						error = true;
						return false;
					}else {
						if (txtC3P333A_14ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC3P333A_14ESP;
							error = true;
							return false;
						}
					}
				}
				if (!chbC3P333B_1.isChecked() && !chbC3P333B_2.isChecked()
						&& !chbC3P333B_3.isChecked() && !chbC3P333B_4.isChecked()
						&& !chbC3P333B_5.isChecked() && !chbC3P333B_6.isChecked()
						&& !chbC3P333B_7.isChecked() && !chbC3P333B_8.isChecked()
						&& !chbC3P333B_9.isChecked() && !chbC3P333B_10.isChecked()) {
					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P333B";
					view = chbC3P333B_1;
					error = true;
					return false;
				}

				if (chbC3P333B_10.isChecked()) {
					if (Util.esVacio(txtC3P333B_10ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.333B (Especifique)");
						view = txtC3P333B_10ESP;
						error = true;
						return false;
					}else {
						if (txtC3P333B_10ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC3P333B_10ESP;
							error = true;
							return false;
						}
					}
				}
				if (!chbC3P333C_1.isChecked() && !chbC3P333C_2.isChecked()
						&& !chbC3P333C_3.isChecked()
						&& !chbC3P333C_4.isChecked()
						&& !chbC3P333C_5.isChecked()
						&& !chbC3P333C_6.isChecked()
						&& !chbC3P333C_7.isChecked()
						&& !chbC3P333C_8.isChecked() && !chbC3P333C_9.isChecked()
						&& !chbC3P333C_10.isChecked()
						&& !chbC3P333C_11.isChecked()
						&& !chbC3P333C_12.isChecked()
						&& !chbC3P333C_13.isChecked()
						&& !chbC3P333C_14.isChecked()) {
					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P333C";
					view = chbC3P333C_1;
					error = true;
					return false;
				}

				if (chbC3P333C_13.isChecked()) {
					if (Util.esVacio(txtC3P333C_13ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.333C-13 (Especifique)");
						view = txtC3P333C_13ESP;
						error = true;
						return false;
					}else {
						if (txtC3P333C_13ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC3P333C_13ESP;
							error = true;
							return false;
						}
					}
				}	
				
				
			}
			
		//2310
//		if (Util.between(caratula.p25, 1, 2)) {
//			if (Util.getInt(bean.c3p332) == 2 && rgC3P333.isTagSelected(2) ) {
//				if (!chbC3P333B_1.isChecked() && !chbC3P333B_2.isChecked()
//						&& !chbC3P333B_3.isChecked()
//						&& !chbC3P333B_4.isChecked()
//						&& !chbC3P333B_5.isChecked()
//						&& !chbC3P333B_6.isChecked()
//						&& !chbC3P333B_7.isChecked()) {
//					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P333B";
//					view = chbC3P333B_1;
//					error = true;
//					return false;
//				}
//
//				if (chbC3P333B_6.isChecked()) {
//					if (Util.esVacio(txtC3P333B_6ESP)) {
//						mensaje = pregunta_no_vacia.replace("$",
//								"La Preg.333B (Especifique)");
//						view = txtC3P333B_6ESP;
//						error = true;
//						return false;
//					}
//				}
//			} else {
//
//				if (Util.esVacio(rgC3P333)) {
//					mensaje = pregunta_no_vacia
//							.replace("$", "La pregunta P333");
//					view = rgC3P333;
//					error = true;
//					return false;
//				}
//
//				if (rgC3P333.isTagSelected(1)) {
//					if (Util.esVacio(rgC3P333A)) {
//						mensaje = pregunta_no_vacia.replace("$",
//								"La pregunta P333A");
//						view = rgC3P333A;
//						error = true;
//						return false;
//					}
//
//				} else {
//					if (!chbC3P333B_1.isChecked() && !chbC3P333B_2.isChecked()
//							&& !chbC3P333B_3.isChecked()
//							&& !chbC3P333B_4.isChecked()
//							&& !chbC3P333B_5.isChecked()
//							&& !chbC3P333B_6.isChecked()
//							&& !chbC3P333B_7.isChecked()) {
//						mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P333B";
//						view = chbC3P333B_1;
//						error = true;
//						return false;
//					}
//
//					if (chbC3P333B_6.isChecked()) {
//						if (Util.esVacio(txtC3P333B_6ESP)) {
//							mensaje = pregunta_no_vacia.replace("$",
//									"La Preg.333B (Especifique)");
//							view = txtC3P333B_6ESP;
//							error = true;
//							return false;
//						} else {
//							if (txtC3P333B_6ESP.getText().length() < 3) {
//								mensaje = "Ingrese la información correcta";
//								view = txtC3P333B_6ESP;
//								error = true;
//								return false;
//							}
//						}
//					}
//
//				}
//
//				int cont = 0;
//				for (int i = 0; i < detalles.size(); i++) {
//					P3Det cc = (P3Det) detalles.get(i);
//					if (!Util.esDiferente(cc.p334a, 1)) {
//						cont += 1;
//
//						if (!Util.esVacio(rgC3P333A) && (Util.getInt(bean.c3p332a) == 0 && i == 0)) {  //332 es 2
//							mensaje = "No cuenta con Prácticas de Gestión Empresarial, no corresponde información";
//							error = true;
//							view = tcMP334;
//							return false;
//						}
//
//						//
//						if (!Util.esVacio(bean.c3p332a) 
//								&& (Util.esVacio(rgC3P333A) && i == 1)) { //332  = 1
//							mensaje = "No cuenta con Temas Productivos, no corresponde información";
//							view = tcMP334;
//							error = true;
//							return false;
//						}
//					}
//
//					if (Util.esVacio(cc.p334_3) && !Util.esVacio(bean.c3p332a) && i == 0) {   //332 es 1
//						ToastMessage.msgBox(this.getActivity(),
//								"Falta ingresar información en "
//										+ "GESTIÓN EMPRESARIAL",
//								ToastMessage.MESSAGE_INFO,
//								ToastMessage.DURATION_LONG);
//						return false;
//					}
//					if (Util.esVacio(cc.p334_3) && !Util.esVacio(rgC3P333A) 
//							&& i == 1) {  //333a > 0 
//						ToastMessage.msgBox(this.getActivity(),
//								"Falta ingresar información en "
//										+ "TEMAS PRODUCTIVOS",
//								ToastMessage.MESSAGE_INFO,
//								ToastMessage.DURATION_LONG);
//						return false;
//					}
//
//				}
//
//				if (cont == 0) {
//					mensaje = "Debe ingresar al menos una opción en P334";
//					view = tcMP334;
//					error = true;
//					return false;
//				}
//			}
//		}
		return true;
	}

	@Override
	public void cargarDatos() {
		caratula = App.getInstance().getEmpresa();
//		Moduloiii02 mod2 = new Moduloiii02();

		bean = getCuestionarioService().getModuloiii02(
				App.getInstance().getEmpresa(),
				new Moduloiii02().getSecCap(getListFields(this,
						new String[] { "C3P320","C3P330"})));

		if (bean == null) {
			bean = new Moduloiii02();
			bean.id = App.getInstance().getEmpresa().id;
		}

	//	llenarUI();
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
//		if (Util.between(caratula.p25, 3, 4)) {
//			Util.cleanAndLockView(getActivity(),
//					chbC3P333B_1, chbC3P333B_2, chbC3P333B_3, chbC3P333B_4,
//					chbC3P333B_5, chbC3P333B_6, chbC3P333B_7, txtC3P333B_10ESP);
//		} else {
//			FuncionP333();
//		}
		
		FuncionP333();
		
		if (Util.getInt(bean.c3p333)==1){
			FuncionCheckA();
			FuncionCheck2();
			FuncionCheck();
		}
		
		
		
		rgC3P333.requestFocus();
	}
	
	public void FuncionP333() {
		RadioGroupOtherField crg = ((RadioGroupOtherField) rgC3P333);
		if (crg.getTagSelected("0").toString().equals("1")) {
			Util.lockView(getActivity(), false, 
					chbC3P333A_1, chbC3P333A_2,
					chbC3P333A_3, chbC3P333A_4, chbC3P333A_5, chbC3P333A_6,
					chbC3P333A_7, chbC3P333A_8, chbC3P333A_9, chbC3P333A_10,chbC3P333A_11,chbC3P333A_12,chbC3P333A_13,chbC3P333A_14, 
					chbC3P333B_1, chbC3P333B_2,
					chbC3P333B_3, chbC3P333B_4, chbC3P333B_5, chbC3P333B_6,
					chbC3P333B_7, chbC3P333B_8, chbC3P333B_9, chbC3P333B_10,
					//NUEVO 2020
					chbC3P333C_1,chbC3P333C_2,chbC3P333C_3,chbC3P333C_4,chbC3P333C_5,chbC3P333C_6,chbC3P333C_7,chbC3P333C_8,chbC3P333C_9,chbC3P333C_10,
					chbC3P333C_11,chbC3P333C_12,chbC3P333C_13,chbC3P333C_14
					
					);
		}else{
			Util.cleanAndLockView(getActivity(), chbC3P333A_1, chbC3P333A_2,
					chbC3P333A_3, chbC3P333A_4, chbC3P333A_5, chbC3P333A_6,
					chbC3P333A_7, chbC3P333A_8, chbC3P333A_9, chbC3P333A_10,chbC3P333A_11,chbC3P333A_12,chbC3P333A_13,chbC3P333A_14,txtC3P333A_14ESP, 
					chbC3P333B_1, chbC3P333B_2,
					chbC3P333B_3, chbC3P333B_4, chbC3P333B_5, chbC3P333B_6,
					chbC3P333B_7, chbC3P333B_8, chbC3P333B_9, chbC3P333B_10, txtC3P333B_10ESP,
					//NUEVO 2020
					chbC3P333C_1,chbC3P333C_2,chbC3P333C_3,chbC3P333C_4,chbC3P333C_5,chbC3P333C_6,chbC3P333C_7,chbC3P333C_8,chbC3P333C_9,chbC3P333C_10,
					chbC3P333C_11,chbC3P333C_12,chbC3P333C_13,chbC3P333C_14,txtC3P333C_13ESP
					);
			chbC3P333C_1.requestFocus();
		}
	}


//	public void FuncionP333() {

//		if (valor == 1) {
//			Util.cleanAndLockView(getActivity(), chbC3P333B_1, chbC3P333B_2,
//					chbC3P333B_3, chbC3P333B_4, chbC3P333B_5, chbC3P333B_6,
//					chbC3P333B_7,txtC3P333B_6ESP);
//		}else if (valor == 2) {
//			Util.lockView(getActivity(), false, chbC3P333B_1, chbC3P333B_2,
//					chbC3P333B_3, chbC3P333B_4, chbC3P333B_5, chbC3P333B_6,
//					chbC3P333B_7);
//			FuncionCheck();
//		}
		
		//2310
//		if (Util.getInt(bean.c3p332) == 2 && valor == 2) {			
//			Util.cleanAndLockView(getActivity(), rgC3P333A, tcMP334);
//			FuncionCheck();
//			LimpiarTCP334();
//			chbC3P333B_1.requestFocus();
//		} else {
//			if (valor == 2 && Util.getInt(bean.c3p332) == 1) {
//				Util.cleanAndLockView(getActivity(), rgC3P333A);
//				Util.lockView(getActivity(), false, tcMP334);
//				
//				chbC3P333B_1.requestFocus();
//			} else {
//				Util.lockView(getActivity(), false, rgC3P333A);				
//				rgC3P333A.requestFocus();
//			}
//		}
//	}

	public void FuncionP333A() {
//		if (valor == 1 || valor == 2) {
//			Util.cleanAndLockView(getActivity(), chbC3P333B_1, chbC3P333B_2,
//					chbC3P333B_3, chbC3P333B_4, chbC3P333B_5, chbC3P333B_6,
//					chbC3P333B_7, txtC3P333B_6ESP);
//		}
	}
	
	public void FuncionCheckA() {
		if (chbC3P333A_14.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P333A_14ESP);
			txtC3P333A_14ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P333A_14ESP);
		}
	}

	public void FuncionCheck() {
		if (chbC3P333C_1.isChecked() || chbC3P333C_2.isChecked()
				|| chbC3P333C_3.isChecked() || chbC3P333C_4.isChecked()
				|| chbC3P333C_5.isChecked() || chbC3P333C_6.isChecked()
				|| chbC3P333C_7.isChecked() || chbC3P333C_8.isChecked()
				|| chbC3P333C_9.isChecked() || chbC3P333C_10.isChecked()
				|| chbC3P333C_11.isChecked() || chbC3P333C_12.isChecked()
				|| chbC3P333C_13.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P333C_14);
		} else {
			Util.lockView(getActivity(), false, chbC3P333C_14);
		}

		if (chbC3P333C_14.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P333C_1, chbC3P333C_2,
					chbC3P333C_3, chbC3P333C_4, chbC3P333C_5, chbC3P333C_6,
					chbC3P333C_7, chbC3P333C_8, chbC3P333C_9, chbC3P333C_10,
					chbC3P333C_11, chbC3P333C_12, chbC3P333C_13,
					txtC3P333C_13ESP);
		} else {
			Util.lockView(getActivity(), false, chbC3P333C_1, chbC3P333C_2,
					chbC3P333C_3, chbC3P333C_4, chbC3P333C_5, chbC3P333C_6,
					chbC3P333C_7, chbC3P333C_8, chbC3P333C_9, chbC3P333C_10,
					chbC3P333C_11, chbC3P333C_12, chbC3P333C_13);
		}

		if (chbC3P333C_13.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P333C_13ESP);
			txtC3P333C_13ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P333C_13ESP);
		}
	}

	public void FuncionCheck2() {
		if (chbC3P333B_10.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P333B_10ESP);
			txtC3P333B_10ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P333B_10ESP);
		}
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

}

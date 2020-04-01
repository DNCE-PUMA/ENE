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
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv01;
import gob.inei.ene2019v2.model.Moduloiv02;
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

public class Mod_IV_Fragment_011 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P436A;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC4P437A_A_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P437A_B_1;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P437A_C_1;	
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC4P437A_A_2;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P437A_B_2;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P437A_C_2;	
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC4P437A_A_3;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P437A_B_3;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC4P437A_C_3;	
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC4P437A_A_4;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P437A_B_4;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P437A_C_4;	
	@FieldAnnotation(orderIndex = 14)
	public RadioGroupOtherField rgC4P437A_A_5;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P437A_B_5;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC4P437A_C_5;	
	@FieldAnnotation(orderIndex = 17)
	public RadioGroupOtherField rgC4P437A_A_6;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC4P437A_B_6;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC4P437A_C_6;	
	@FieldAnnotation(orderIndex = 20)
	public RadioGroupOtherField rgC4P437A_A_7;
	@FieldAnnotation(orderIndex = 21)
	public CheckBoxField chbC4P437A_B_7;
	@FieldAnnotation(orderIndex = 22)
	public CheckBoxField chbC4P437A_C_7;	
	@FieldAnnotation(orderIndex = 23)
	public RadioGroupOtherField rgC4P437A_A_8;
	@FieldAnnotation(orderIndex = 24)
	public CheckBoxField chbC4P437A_B_8;
	@FieldAnnotation(orderIndex = 25)
	public CheckBoxField chbC4P437A_C_8;	
	@FieldAnnotation(orderIndex = 26)
	public RadioGroupOtherField rgC4P437A_A_9;
	@FieldAnnotation(orderIndex = 27)
	public CheckBoxField chbC4P437A_B_9;
	@FieldAnnotation(orderIndex = 28)
	public CheckBoxField chbC4P437A_C_9;	
	@FieldAnnotation(orderIndex = 29)
	public RadioGroupOtherField rgC4P437A_A_10;
	@FieldAnnotation(orderIndex = 30)
	public CheckBoxField chbC4P437A_B_10;
	@FieldAnnotation(orderIndex = 31)
	public CheckBoxField chbC4P437A_C_10;	
	@FieldAnnotation(orderIndex = 32)
	public RadioGroupOtherField rgC4P437A_A_11;
	@FieldAnnotation(orderIndex = 33)
	public TextField txtC4P437A_A_11ESP;
	@FieldAnnotation(orderIndex = 34)
	public CheckBoxField chbC4P437A_B_11;
	@FieldAnnotation(orderIndex = 35)
	public CheckBoxField chbC4P437A_C_11;	
//	@FieldAnnotation(orderIndex = 25)
//	public TextField txtC4P437A_B_11ESP;
	@FieldAnnotation(orderIndex = 36)
	public RadioGroupOtherField rgC4P438;
	@FieldAnnotation(orderIndex = 37)
	public CheckBoxField chbC4P439_1;
	@FieldAnnotation(orderIndex = 38)
	public CheckBoxField chbC4P439_2;
	@FieldAnnotation(orderIndex = 39)
	public CheckBoxField chbC4P439_3;
	@FieldAnnotation(orderIndex = 40)
	public CheckBoxField chbC4P439_4;
	@FieldAnnotation(orderIndex = 41)
	public TextField txtC4P439_4ESP;

	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private Moduloiv02 bean2;
	private Caratula caratula;
	private LabelComponent lblTitulo, lblTitulo1, lblC4P437v;
	private LabelComponent lblC4P437A_1, lblC4P437A_2, lblC4P437A_3,
			lblC4P437A_4, lblC4P437A_5, lblC4P437A_6, lblC4P437A_7,
			lblC4P437A_8, lblC4P437A_9, lblC4P437A_10, lblC4P437A_11, lblflag;
	private LabelComponent lblC4P437t_1, lblC4P437t_2, lblC4P437t3,
			lblC4P437t_4;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent grEspe, grEspe2;
	public GridComponent grP437A;

	public Mod_IV_Fragment_011() {
	}

	public Mod_IV_Fragment_011 parent(MasterActivity parent) {
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

		rgC4P436A = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP436A");

		lblC4P437v = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(35, 350).text(R.string.c1c100m4p437a_cab1).textSize(17).centrar()
				.negrita();

		lblC4P437t_1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 40, 300)
				.text("").textSize(17).centrar()
				.negrita();
		lblC4P437t_2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 40, 440)
				.text(R.string.c1c100m4p437a_cab2).textSize(17).centrar()
				.negrita();
		lblC4P437t3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 30, 440)
				.text(R.string.c1c100m4p437a_cab3).textSize(17).centrar()
				.negrita();

		lblC4P437A_1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_1)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_2)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_3)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_4)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_5 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_5)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_6 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 45, 220).text(R.string.c1c100m4p437a_6)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_7 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 45, 220).text(R.string.c1c100m4p437a_7)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_8 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_8)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_9 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_9)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_10 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 45, 220).text(R.string.c1c100m4p437a_10)
				.textSize(14).alinearIzquierda().negrita();
		lblC4P437A_11 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 220).text(R.string.c1c100m4p437a_11)
				.textSize(14).alinearIzquierda().negrita();

		lblflag = new LabelComponent(this.getActivity()).size(altoComponente,
				250).colorFondo(R.color.transparent);


		chbC4P437A_B_1 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_1 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_2 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_2 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);
		
		chbC4P437A_B_3 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_3 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_4 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_4 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_5 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_5 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_6 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_6 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_7 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_7 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_8 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_8 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_9 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_9 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_10 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_10 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

		chbC4P437A_B_11 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				170).text(R.string.c1c100m4p437a_na);

		chbC4P437A_C_11 = new CheckBoxField(this.getActivity(), "1:0").size(50,
				190).text(R.string.c1c100m4p437a_ext);

	
		rgC4P437A_A_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_4 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_5 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_6 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_7 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_8 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_9 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_10 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");

		rgC4P437A_A_11 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(100, 140)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChangeP437");
		

		txtC4P437A_A_11ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 150).hint(R.string.especifique)
				.soloTextoNumero();

//		txtC4P437A_B_11ESP = new TextField(this.getActivity(), false)
//				.size(altoComponente, 150).hint(R.string.especifique)
//				.soloTextoNumero();

	
		rgC4P438 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p438_1, R.string.c1c100m4p438_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP438");

		chbC4P439_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p439_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P439_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p439_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P439_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p439_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P439_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p439_4, "1:0").size(LayoutParams.WRAP_CONTENT,
				140).callback("FuncionCheck");
		txtC4P439_4ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();

		grP437A = new GridComponent(this.getActivity(), 4);
		grP437A.addComponent(lblC4P437t_1,2);
		grP437A.addComponent(lblC4P437t_2,2);
		grP437A.addComponent(lblC4P437v,2);
		grP437A.addComponent(lblC4P437t3,2);
		
		grP437A.addComponent(lblC4P437A_1);
		grP437A.addComponent(rgC4P437A_A_1);
		grP437A.addComponent(chbC4P437A_B_1);
		grP437A.addComponent(chbC4P437A_C_1);
		grP437A.addComponent(lblC4P437A_2);
		grP437A.addComponent(rgC4P437A_A_2);
		grP437A.addComponent(chbC4P437A_B_2);
		grP437A.addComponent(chbC4P437A_C_2);
		grP437A.addComponent(lblC4P437A_3);
		grP437A.addComponent(rgC4P437A_A_3);
		grP437A.addComponent(chbC4P437A_B_3);
		grP437A.addComponent(chbC4P437A_C_3);
		grP437A.addComponent(lblC4P437A_4);
		grP437A.addComponent(rgC4P437A_A_4);
		grP437A.addComponent(chbC4P437A_B_4);
		grP437A.addComponent(chbC4P437A_C_4);
		grP437A.addComponent(lblC4P437A_5);
		grP437A.addComponent(rgC4P437A_A_5);
		grP437A.addComponent(chbC4P437A_B_5);
		grP437A.addComponent(chbC4P437A_C_5);
		grP437A.addComponent(lblC4P437A_6);
		grP437A.addComponent(rgC4P437A_A_6);
		grP437A.addComponent(chbC4P437A_B_6);
		grP437A.addComponent(chbC4P437A_C_6);
		grP437A.addComponent(lblC4P437A_7);
		grP437A.addComponent(rgC4P437A_A_7);
		grP437A.addComponent(chbC4P437A_B_7);
		grP437A.addComponent(chbC4P437A_C_7);
		grP437A.addComponent(lblC4P437A_8);
		grP437A.addComponent(rgC4P437A_A_8);
		grP437A.addComponent(chbC4P437A_B_8);
		grP437A.addComponent(chbC4P437A_C_8);
		grP437A.addComponent(lblC4P437A_9);
		grP437A.addComponent(rgC4P437A_A_9);
		grP437A.addComponent(chbC4P437A_B_9);
		grP437A.addComponent(chbC4P437A_C_9);
		grP437A.addComponent(lblC4P437A_10);
		grP437A.addComponent(rgC4P437A_A_10);
		grP437A.addComponent(chbC4P437A_B_10);
		grP437A.addComponent(chbC4P437A_C_10);
		grP437A.addComponent(lblC4P437A_11);
		grP437A.addComponent(rgC4P437A_A_11);
		grP437A.addComponent(chbC4P437A_B_11);
		grP437A.addComponent(chbC4P437A_C_11);
		grP437A.addComponent(txtC4P437A_A_11ESP,4);
//		grP437A.addComponent(txtC4P437A_B_11ESP);
		grP437A.colorFondo(R.color.transparent);

		grEspe2 = new GridComponent(this.getActivity(), 2);
		grEspe2.colorFondo(android.R.color.transparent);
		grEspe2.addComponent(chbC4P439_4);
		grEspe2.addComponent(txtC4P439_4ESP);

		Filtros.setFiltro(txtC4P437A_A_11ESP, Filtros.TIPO.ALFAN_U, 300, null);
//		Filtros.setFiltro(txtC4P437A_B_11ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC4P439_4ESP, Filtros.TIPO.ALFAN_U, 300, null);

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m4p436A, rgC4P436A);
		q2 = createQuestionSection(R.string.c1c100m4p437a, grP437A.component());
		q4 = createQuestionSection(R.string.c1c100m4p438, rgC4P438);
		q5 = createQuestionSection(R.string.c1c100m4p439, Gravity.START,chbC4P439_1,
				chbC4P439_2, chbC4P439_3, grEspe2.component());

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
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
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		String especifique_no_vacio = getString(R.string.pregunta_especifique);
		String preguntaVacia = this.getResources().getString(R.string.pregunta_no_vacia);

		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (Util.esVacio(rgC4P436A)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P436A");
			view = rgC4P436A;
			error = true;
			return false;
		}

		if (rgC4P436A.isTagSelected(1)) {
//			for (int i = 1; i <= 11; i++) {
//				RadioGroupOtherField x = ((RadioGroupOtherField) getView("chbC4P437A_A_"
//						+ (i)));
//				if (Util.esVacio(x)) {
//					mensaje = pregunta_no_vacia.replace("$",
//							"Empresa Nacional P437A ");
//					view = x;
//					return !(error = true);
//				}
//				RadioGroupOtherField y = ((RadioGroupOtherField) getView("chbC4P437A_B_"
//						+ (i)));
//				if (Util.esVacio(y)) {
//					mensaje = pregunta_no_vacia.replace("$",
//							"Empresa Internacional P437B");
//					view = y;
//					return !(error = true);
//				}
//			}
//		}
			if (rgC4P437A_A_1.isTagSelected(2)
					&& rgC4P437A_A_2.isTagSelected(2)
					&& rgC4P437A_A_3.isTagSelected(2)
					&& rgC4P437A_A_4.isTagSelected(2)
					&& rgC4P437A_A_5.isTagSelected(2)
					&& rgC4P437A_A_6.isTagSelected(2)
					&& rgC4P437A_A_7.isTagSelected(2)
					&& rgC4P437A_A_8.isTagSelected(2)
					&& rgC4P437A_A_9.isTagSelected(2)
					&& rgC4P437A_A_10.isTagSelected(2)
					&& rgC4P437A_A_11.isTagSelected(2)) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA .";
				view = rgC4P437A_A_1;
				error = true;
				return false;
			}
	
		
		if (Util.esVacio(rgC4P437A_A_1)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -1 ");
			view = rgC4P437A_A_1;
			error = true;
			return false;
		}
			
			
		if (rgC4P437A_A_1.isTagSelected(1) &&  ( !chbC4P437A_B_1.isChecked() && !chbC4P437A_C_1.isChecked() ) ) {
			mensaje = pregunta_no_vacia.replace("$", "Empresa Internacional P437B");
			view = chbC4P437A_B_1;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_2)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -2 ");
			view = rgC4P437A_A_2;
			error = true;
			return false;
		}
		
		if (rgC4P437A_A_2.isTagSelected(1)  &&  ( !chbC4P437A_B_2.isChecked() && !chbC4P437A_C_2.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_2;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_3)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -3 ");
			view = rgC4P437A_A_3;
			error = true;
			return false;
		}
		
		if (rgC4P437A_A_3.isTagSelected(1)  &&   ( !chbC4P437A_B_3.isChecked() && !chbC4P437A_C_3.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_3;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_4)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -4 ");
			view = rgC4P437A_A_4;
			error = true;
			return false;
		}
		
		if (rgC4P437A_A_4.isTagSelected(1)  &&   ( !chbC4P437A_B_4.isChecked() && !chbC4P437A_C_4.isChecked() )) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_4;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_5)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -5 ");
			view = rgC4P437A_A_5;
			error = true;
			return false;
		}
		
		if (rgC4P437A_A_5.isTagSelected(1)  &&   ( !chbC4P437A_B_5.isChecked() && !chbC4P437A_C_5.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_5;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_6)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -6 ");
			view = rgC4P437A_A_6;
			error = true;
			return false;
		}
		if (rgC4P437A_A_6.isTagSelected(1)  &&   ( !chbC4P437A_B_6.isChecked() && !chbC4P437A_C_6.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_6;
			error = true;
			return false;
		}
		
		
		if (Util.esVacio(rgC4P437A_A_7)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -7 ");
			view = rgC4P437A_A_7;
			error = true;
			return false;
		}
		if (rgC4P437A_A_7.isTagSelected(1)  &&   ( !chbC4P437A_B_7.isChecked() && !chbC4P437A_C_7.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_7;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_8)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -8 ");
			view = rgC4P437A_A_8;
			error = true;
			return false;
		}
		if (rgC4P437A_A_8.isTagSelected(1)  &&   ( !chbC4P437A_B_8.isChecked() && !chbC4P437A_C_8.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_8;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_9)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -9 ");
			view = rgC4P437A_A_9;
			error = true;
			return false;
		}
		
		if (rgC4P437A_A_9.isTagSelected(1)  &&   ( !chbC4P437A_B_9.isChecked() && !chbC4P437A_C_9.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_9;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_10)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -10 ");
			view = rgC4P437A_A_10;
			error = true;
			return false;
		}
		if (rgC4P437A_A_10.isTagSelected(1)  &&   ( !chbC4P437A_B_10.isChecked() && !chbC4P437A_C_10.isChecked()  ) ) {
			mensaje = pregunta_no_vacia.replace("$",
					"Empresa Internacional P437B");
			view = chbC4P437A_B_10;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC4P437A_A_11)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P437A -11 ");
			view = rgC4P437A_A_11;
			error = true;
			return false;
		}

		if (rgC4P437A_A_11.isTagSelected(1) ) {
			if ( ( !chbC4P437A_B_11.isChecked() && !chbC4P437A_C_11.isChecked())  ) {
				mensaje = pregunta_no_vacia.replace("$",
						"Empresa Internacional P437B");
				view = chbC4P437A_B_11;
				error = true;
				return false;
			}
			
			if (Util.esVacio(txtC4P437A_A_11ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.437B (Especifique)");
				view = txtC4P437A_A_11ESP;
				error = true;
				return false;
			}
			if (txtC4P437A_A_11ESP.getText().length() < 3) {
				mensaje = "Ingrese la información correcta Preg.437B";
				view = txtC4P437A_A_11ESP;
				error = true;
				return false;
			}
			
		}

	}


		if (Util.esVacio(rgC4P438)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P438");
			view = rgC4P438;
			error = true;
			return false;
		}
		if (rgC4P438.isTagSelected(1)) {
			if (!chbC4P439_1.isChecked() && !chbC4P439_2.isChecked()
					&& !chbC4P439_3.isChecked() && !chbC4P439_4.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P439";
				view = chbC4P439_1;
				error = true;
				return false;
			}
			if (chbC4P439_4.isChecked()) {
				if (Util.esVacio(txtC4P439_4ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.439 (Especifique)");
					view = txtC4P439_4ESP;
					error = true;
					return false;
				} else {
					if (txtC4P439_4ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P439_4ESP;
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

		bean = getCuestionarioService().getModuloiv01(
				App.getInstance().getEmpresa(),
				new Moduloiv01().getSecCap(getListFields(this)));

		caratula = App.getInstance().getEmpresa();

		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		FuncionP436A();
		FuncionP438();
		rgC4P436A.requestFocus();
	}

	public void FuncionP436A() {
		Integer valor = Integer.parseInt(rgC4P436A.getTagSelected("0").toString());
		if (valor == 1) {
			Util.lockView(getActivity(), false, rgC4P437A_A_1, rgC4P437A_A_2,
					rgC4P437A_A_3, rgC4P437A_A_4, rgC4P437A_A_5, rgC4P437A_A_6,
					rgC4P437A_A_7, rgC4P437A_A_8, rgC4P437A_A_9,
					rgC4P437A_A_10, rgC4P437A_A_11);
			//Util.cleanAndLockView(getActivity(), chbC4P437B);
			onChangeP437();
			rgC4P437A_A_1.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), rgC4P437A_A_1, rgC4P437A_A_2,
					rgC4P437A_A_3, rgC4P437A_A_4, rgC4P437A_A_5, rgC4P437A_A_6,
					rgC4P437A_A_7, rgC4P437A_A_8, rgC4P437A_A_9,
					rgC4P437A_A_10, rgC4P437A_A_11, txtC4P437A_A_11ESP,
					chbC4P437A_B_1, chbC4P437A_B_2, chbC4P437A_B_3, chbC4P437A_B_4,
					chbC4P437A_B_5, chbC4P437A_B_6, chbC4P437A_B_7, chbC4P437A_B_8,
					chbC4P437A_B_9, chbC4P437A_B_10, chbC4P437A_B_11,
					chbC4P437A_C_1, chbC4P437A_C_2, chbC4P437A_C_3, chbC4P437A_C_4,
					chbC4P437A_C_5, chbC4P437A_C_6, chbC4P437A_C_7, chbC4P437A_C_8,
					chbC4P437A_C_9, chbC4P437A_C_10, chbC4P437A_C_11);
		//	Util.lockView(getActivity(), false, chbC4P437B);
			rgC4P438.requestFocus();
		}
	}


	public void FuncionP438() {
		Integer valor = Integer.parseInt(rgC4P438.getTagSelected("0")
				.toString());

		if (valor == 1) {
			Util.lockView(getActivity(), false, chbC4P439_1, chbC4P439_2,
					chbC4P439_3, chbC4P439_4);
			FuncionCheck();
			chbC4P439_1.requestFocus();

		} else {
			Util.cleanAndLockView(getActivity(), chbC4P439_1, chbC4P439_2,
					chbC4P439_3, chbC4P439_4, txtC4P439_4ESP);
			
			if (rgC4P438.isPressed()) {
				if (rgC4P438.getTagSelected("").toString().equals("2")) {
				//	parent.nextFragment(CuestionarioFragmentActivity.MODULO_IV+11);
				}
			}
		}
	}
	
	
	 
	public void onChangeP437() {
		if (rgC4P437A_A_1.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_1,chbC4P437A_C_1);
			chbC4P437A_B_1.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_1,chbC4P437A_C_1);
		}
		if (rgC4P437A_A_2.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_2,chbC4P437A_C_2);
			chbC4P437A_B_2.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_2,chbC4P437A_C_2);
		}

		if (rgC4P437A_A_3.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_3,chbC4P437A_C_3);
			chbC4P437A_B_3.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_3,chbC4P437A_C_3);
		}

		if (rgC4P437A_A_4.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_4,chbC4P437A_C_4);
			chbC4P437A_B_4.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_4,chbC4P437A_C_4);
		}

		if (rgC4P437A_A_5.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_5,chbC4P437A_C_5);
			chbC4P437A_B_5.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_5,chbC4P437A_C_5);
		}

		if (rgC4P437A_A_6.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_6,chbC4P437A_C_6);
			chbC4P437A_B_6.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_6,chbC4P437A_C_6);
		}

		if (rgC4P437A_A_7.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_7,chbC4P437A_C_7);
			chbC4P437A_B_7.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_7,chbC4P437A_C_7);
		}

		if (rgC4P437A_A_8.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_8,chbC4P437A_C_8);
			chbC4P437A_B_8.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_8,chbC4P437A_C_8);
		}

		if (rgC4P437A_A_9.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_9,chbC4P437A_C_9);
			chbC4P437A_B_9.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_9,chbC4P437A_C_9);
		}

		if (rgC4P437A_A_10.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_10,chbC4P437A_C_10);
			chbC4P437A_B_10.requestFocus();	
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_10,chbC4P437A_C_10);
		}

		if (rgC4P437A_A_11.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC4P437A_B_11,chbC4P437A_C_11,
					txtC4P437A_A_11ESP);
			chbC4P437A_B_11.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC4P437A_B_11,chbC4P437A_C_11,
					txtC4P437A_A_11ESP);
		}

	}
	
	
	public void FuncionCheck() {
		if (chbC4P439_4.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P439_4ESP);
			txtC4P439_4ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P439_4ESP);

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

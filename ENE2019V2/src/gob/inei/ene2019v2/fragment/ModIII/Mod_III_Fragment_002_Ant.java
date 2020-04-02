package gob.inei.ene2019v2.fragment.ModIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.DialogComponent.TIPO_DIALOGO;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.ImageComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Calculo;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.ModuloIII_det;
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.List;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_III_Fragment_002_Ant extends FragmentForm implements
Respondible {

	

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC3P302_1;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC3P302A_1;
	@FieldAnnotation(orderIndex = 3)
	public IntegerField txtC3P302B_1;
	@FieldAnnotation(orderIndex = 4)
	public IntegerField txtC3P302C_1;

	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC3P302_2;
	@FieldAnnotation(orderIndex = 6)
	public IntegerField txtC3P302A_2;
	@FieldAnnotation(orderIndex = 7)
	public IntegerField txtC3P302B_2;
	@FieldAnnotation(orderIndex = 8)
	public IntegerField txtC3P302C_2;
	
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC3P302_3;
	@FieldAnnotation(orderIndex = 10)
	public IntegerField txtC3P302A_3;
	@FieldAnnotation(orderIndex = 11)
	public IntegerField txtC3P302B_3;
	@FieldAnnotation(orderIndex = 12)
	public IntegerField txtC3P302C_3;

	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC3P302_4;
	@FieldAnnotation(orderIndex = 14)
	public IntegerField txtC3P302A_4;
	@FieldAnnotation(orderIndex = 15)
	public IntegerField txtC3P302B_4;
	@FieldAnnotation(orderIndex = 16)
	public IntegerField txtC3P302C_4;

	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC3P302_5;
	@FieldAnnotation(orderIndex = 18)
	public IntegerField txtC3P302A_5;
	@FieldAnnotation(orderIndex = 19)
	public IntegerField txtC3P302B_5;
	@FieldAnnotation(orderIndex = 20)
	public IntegerField txtC3P302C_5;

	@FieldAnnotation(orderIndex = 21)
	public CheckBoxField chbC3P302_6;
	@FieldAnnotation(orderIndex = 22)
	public IntegerField txtC3P302A_6;
	@FieldAnnotation(orderIndex = 23)
	public IntegerField txtC3P302B_6;
	@FieldAnnotation(orderIndex = 24)
	public IntegerField txtC3P302C_6;
	
	@FieldAnnotation(orderIndex = 25)
	public CheckBoxField chbC3P302_7;
	@FieldAnnotation(orderIndex = 26)
	public IntegerField txtC3P302A_7;
	@FieldAnnotation(orderIndex = 27)
	public IntegerField txtC3P302B_7;
	@FieldAnnotation(orderIndex = 28)
	public IntegerField txtC3P302C_7;
	

	@FieldAnnotation(orderIndex = 29)
	public IntegerField txtC3P302A_8;
	@FieldAnnotation(orderIndex = 30)
	public IntegerField txtC3P302B_8;
	@FieldAnnotation(orderIndex = 31)
	public IntegerField txtC3P302C_8;

	@FieldAnnotation(orderIndex = 32)
	public CheckBoxField chbC3P302A_A1; // Nuevo Ini c3p302a_a1
	@FieldAnnotation(orderIndex = 33)
	public CheckBoxField chbC3P302A_A2;
	@FieldAnnotation(orderIndex = 34)
	public CheckBoxField chbC3P302A_A3;
	@FieldAnnotation(orderIndex = 35)
	public CheckBoxField chbC3P302A_A4;
	@FieldAnnotation(orderIndex = 36)
	public CheckBoxField chbC3P302A_A5;
	@FieldAnnotation(orderIndex = 37)
	public CheckBoxField chbC3P302A_A6;
	@FieldAnnotation(orderIndex = 38)
	public TextField txtC3P302A_A6ESP;// Nuevo fin

	@FieldAnnotation(orderIndex = 39)
	public RadioGroupOtherField rgC3P303;
	
	@FieldAnnotation(orderIndex = 40)
	public IntegerField txtC3P303_A_1;
	@FieldAnnotation(orderIndex = 41)
	public IntegerField txtC3P303_A_2;
	@FieldAnnotation(orderIndex = 42)
	public IntegerField txtC3P303_A_3;
	@FieldAnnotation(orderIndex = 43)
	public IntegerField txtC3P303_T;	
	
	private static int OMISION = 99999;
	public ImageComponent btnOmisionH1;
	public ImageComponent btnOmisionM1;
	public ImageComponent btnOmisionH2;
	public ImageComponent btnOmisionM2;
	public ImageComponent btnOmisionH3;
	public ImageComponent btnOmisionM3;
	public ImageComponent btnOmisionH4;
	public ImageComponent btnOmisionM4;
	public ImageComponent btnOmisionH5;
	public ImageComponent btnOmisionM5;
	public ImageComponent btnOmisionH6;
	public ImageComponent btnOmisionM6;
	public ImageComponent btnOmisionH7;
	public ImageComponent btnOmisionM7;
	
	private CuestionarioService cuestionarioService;
	private Moduloiii01 bean;
	private Caratula caratula;
	private boolean paraVerificar1;
	private LabelComponent lblTitulo, lblTitulo1,lblSubTitulo3, lblCab1, lblCab2, lblCab3,
			lblNiv1, lblNiv2, lblNiv3, lblNiv4, lblNiv5, lblNiv6, lblNiv7,
			lblNiv8, lblFile1, lblFile2, lblFile3, lblFile4, lblFile5,
			lblFile6, lblFile7, lblFile8, lblmod3_1, lblmod4_1, lblmod4_2,
			lblmod4_3, lblTotal, lblHombrs, lblMujeres, lblTitulop, lblTitulot,
			lblTituloh, lblTitulom, lblTitulota, lblTituloha, lblTituloma;
	private GridComponent2 grP301, grEspe, grP303, grP304, grP303A;
	private GridComponent grP302, grP302A;
	LinearLayout q0, q1, q2, q3, q4, q5;
	private boolean error1;
	private boolean error2;
	private boolean error3;
	private boolean error4,error5,error6;
	
	private boolean avance1 ;
	private boolean avance2;	
	private boolean avance3;
	private boolean avance4,avance5,avance6;
	enum ACTION {
		EJECUTAR_VER1, EJECUTAR_VER2, EJECUTAR_VER3,EJECUTAR_VER4,EJECUTAR_VER5,EJECUTAR_VER6
	}
	private ACTION action;
	SeccionCapitulo[] campos;
	private List<ModuloIII_det> lstDetalle;
	Integer p301_05 = 0;
	Integer p301_05m = 0;
	Integer p301_12 = 0;
	Integer p301_13 = 0;
	Integer p301_12h = 0;
	Integer p301_12m = 0;
	Integer p301_13h = 0;
	Integer p301_13m = 0;
	public Boolean flag1 = false ;
	
	
	public Mod_III_Fragment_002_Ant() {
	}

	public Mod_III_Fragment_002_Ant parent(MasterActivity parent) {
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
		executeEvents();
	//	confSumatorias();
		enlazarCajas();
		listening();
		setCalculo();
		campos = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C3P301_ID", "C3P301_ID_ETIQ", "C3P301A", "C3P301A_1",
				"C3P301A_2", "C3P301A_TOT", "C3P301E_1") };
		return rootView;
	}

	private void confSumatorias() {
		
		Calculo<IntegerField> op1 = new Calculo<IntegerField>(this,
				txtC3P302A_1, 0, 0,Util.getListList(txtC3P302B_1, txtC3P302C_1));
		op1.setConfOperacion(false, true);

		Calculo<IntegerField> op2 = new Calculo<IntegerField>(this,
				txtC3P302A_2, 0, 0,
				Util.getListList(txtC3P302B_2, txtC3P302C_2));
		op2.setConfOperacion(false, true);

		Calculo<IntegerField> op3 = new Calculo<IntegerField>(this,
				txtC3P302A_3, 0, 0,
				Util.getListList(txtC3P302B_3, txtC3P302C_3));
		op3.setConfOperacion(false, true);

		Calculo<IntegerField> op4 = new Calculo<IntegerField>(this,
				txtC3P302A_4, 0, 0,
				Util.getListList(txtC3P302B_4, txtC3P302C_4));
		op4.setConfOperacion(false, true);

		Calculo<IntegerField> op5 = new Calculo<IntegerField>(this,
				txtC3P302A_5, 0, 0,
				Util.getListList(txtC3P302B_5, txtC3P302C_5));
		op5.setConfOperacion(false, true);

		Calculo<IntegerField> op6 = new Calculo<IntegerField>(this,
				txtC3P302A_6, 0, 0,
				Util.getListList(txtC3P302B_6, txtC3P302C_6));
		op6.setConfOperacion(false, true);

		Calculo<IntegerField> op7 = new Calculo<IntegerField>(this,
				txtC3P302A_7, 0, 0,
				Util.getListList(txtC3P302B_7, txtC3P302C_7));
		op7.setConfOperacion(false, true);

		Calculo<IntegerField> op8 = new Calculo<IntegerField>(this,
				txtC3P302A_8, 0, 0, Util.getListList(txtC3P302A_1,
						txtC3P302A_2, txtC3P302A_3, txtC3P302A_4, txtC3P302A_5,
						txtC3P302A_6, txtC3P302A_7));
		op8.setConfOperacion(false, true);

		Calculo<IntegerField> opHO = new Calculo<IntegerField>(this,
				txtC3P302B_8, 0, 0, Util.getListList(txtC3P302B_1,
						txtC3P302B_2, txtC3P302B_3, txtC3P302B_4, txtC3P302B_5,
						txtC3P302B_6, txtC3P302B_7));
		opHO.setConfOperacion(false, true);

		Calculo<IntegerField> opMu = new Calculo<IntegerField>(this,
				txtC3P302C_8, 0, 0, Util.getListList(txtC3P302C_1,
						txtC3P302C_2, txtC3P302C_3, txtC3P302C_4, txtC3P302C_5,
						txtC3P302C_6, txtC3P302C_7));
		opMu.setConfOperacion(false, true);

	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod3_titulo).textSize(21).centrar().negrita();
		lblTitulo1 = new LabelComponent(getActivity())
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod3_titulo1).textSize(17).centrar().negrita()
				.colorFondo(R.color.amarillo);
		
		lblSubTitulo3 = new LabelComponent(this.getActivity())
		.size(MATCH_PARENT, MATCH_PARENT)
		.text(R.string.c1c100m3p002a_0).textSize(18).negrita()
		.colorFondo(R.color.amarillo);

//		LabelComponent real_preg = new LabelComponent(getActivity())
//				.text(R.string.c1c100m3p002a_0).size(altoComponente, 250)
//				.colorFondo(R.color.amarillo);

		lblTitulop = new LabelComponent(getActivity())
				.size(altoComponente, 250).text("Pregunta 301").textSize(17)
				.centrar().negrita().colorFondo(R.color.celesteclaro);
		lblTitulot = new LabelComponent(getActivity())
				.size(altoComponente, 200).text("Total").textSize(17).centrar()
				.negrita().colorFondo(R.color.celesteclaro);
		lblTituloh = new LabelComponent(getActivity())
				.size(altoComponente, 200).text("Hombres").textSize(17)
				.centrar().negrita().colorFondo(R.color.celesteclaro);
		lblTitulom = new LabelComponent(getActivity())
				.size(altoComponente, 200).text("Mujeres").textSize(17)
				.centrar().negrita().colorFondo(R.color.celesteclaro);

		lblTitulota = new LabelComponent(getActivity())
				.size(altoComponente, 200).text("").textSize(17).centrar()
				.negrita().colorFondo(R.color.celesteclaro);
		lblTituloha = new LabelComponent(getActivity())
				.size(altoComponente, 200).text("").textSize(17).centrar()
				.negrita().colorFondo(R.color.celesteclaro);
		lblTituloma = new LabelComponent(getActivity())
				.size(altoComponente, 200).text("").textSize(17).centrar()
				.negrita().colorFondo(R.color.celesteclaro);

		txtC3P302A_1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().negrita();
		txtC3P302A_1.addTextChangedListener(twFuncionBloqueo8A);
		txtC3P302A_2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().negrita();
		txtC3P302A_2.addTextChangedListener(twFuncionBloqueo8A);
		txtC3P302A_3 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().negrita();
		txtC3P302A_3.addTextChangedListener(twFuncionBloqueo8A);
		txtC3P302A_4 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().negrita();
		txtC3P302A_4.addTextChangedListener(twFuncionBloqueo8A);
		txtC3P302A_5 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().negrita();
		txtC3P302A_5.addTextChangedListener(twFuncionBloqueo8A);
		txtC3P302A_6 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().negrita();
		txtC3P302A_6.addTextChangedListener(twFuncionBloqueo8A);
		txtC3P302A_7 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().negrita();
		txtC3P302A_7.addTextChangedListener(twFuncionBloqueo8A);
		txtC3P302A_8 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 115).centrar().readOnly().negrita();

		txtC3P302B_1 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302B_1.addTextChangedListener(twFuncionBloqueo1);
		txtC3P302B_1.addTextChangedListener(twFuncionBloqueo8B);
		
		txtC3P302B_2 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302B_2.addTextChangedListener(twFuncionBloqueo2);
		txtC3P302B_2.addTextChangedListener(twFuncionBloqueo8B);
		
		txtC3P302B_3 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302B_3.addTextChangedListener(twFuncionBloqueo3);
		txtC3P302B_3.addTextChangedListener(twFuncionBloqueo8B);
		
		txtC3P302B_4 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302B_4.addTextChangedListener(twFuncionBloqueo4);
		txtC3P302B_4.addTextChangedListener(twFuncionBloqueo8B);
		
		txtC3P302B_5 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302B_5.addTextChangedListener(twFuncionBloqueo5);
		txtC3P302B_5.addTextChangedListener(twFuncionBloqueo8B);
		
		txtC3P302B_6 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302B_6.addTextChangedListener(twFuncionBloqueo6);
		txtC3P302B_6.addTextChangedListener(twFuncionBloqueo8B);
		
		txtC3P302B_7 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302B_7.addTextChangedListener(twFuncionBloqueo7);
		txtC3P302B_7.addTextChangedListener(twFuncionBloqueo8B);
		
		txtC3P302B_8 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		

		txtC3P302C_1 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302C_1.addTextChangedListener(twFuncionBloqueo1);
		txtC3P302C_1.addTextChangedListener(twFuncionBloqueo8C);
		
		txtC3P302C_2 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302C_2.addTextChangedListener(twFuncionBloqueo2);
		txtC3P302C_2.addTextChangedListener(twFuncionBloqueo8C);
		
		txtC3P302C_3 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302C_3.addTextChangedListener(twFuncionBloqueo3);
		txtC3P302C_3.addTextChangedListener(twFuncionBloqueo8C);
		
		txtC3P302C_4 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302C_4.addTextChangedListener(twFuncionBloqueo4);
		txtC3P302C_4.addTextChangedListener(twFuncionBloqueo8C);
		
		txtC3P302C_5 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302C_5.addTextChangedListener(twFuncionBloqueo5);
		txtC3P302C_5.addTextChangedListener(twFuncionBloqueo8C);
		
		txtC3P302C_6 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302C_6.addTextChangedListener(twFuncionBloqueo6);
		txtC3P302C_6.addTextChangedListener(twFuncionBloqueo8C);
		
		txtC3P302C_7 = new IntegerField(this.getActivity(), false).size(altoComponente, 100).centrar();
		txtC3P302C_7.addTextChangedListener(twFuncionBloqueo7);
		txtC3P302C_7.addTextChangedListener(twFuncionBloqueo8C);
		
		txtC3P302C_8 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();

		chbC3P302A_A1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p302a_1, "1:0").size(WRAP_CONTENT, 600);
		chbC3P302A_A2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p302a_2, "1:0").size(WRAP_CONTENT, 600);
		chbC3P302A_A3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p302a_3, "1:0").size(WRAP_CONTENT, 600);
		chbC3P302A_A4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p302a_4, "1:0").size(WRAP_CONTENT, 600);
		chbC3P302A_A5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p302a_5, "1:0").size(WRAP_CONTENT, 600);
		chbC3P302A_A6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p302a_6, "1:0").size(WRAP_CONTENT, 150)
				.callback("FuncionCheck");
		txtC3P302A_A6ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
	
		rgC3P303 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m3p003_2, R.string.c1c100m3p003_3,
				R.string.c1c100m3p003_4).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL).callback("FuncionRGP303");

//		rgC3P303_1 = new RadioGroupOtherField(this.getActivity(), R.string.si,
//				R.string.no).size(WRAP_CONTENT, 200).callback("FuncionRGP303")
//				.orientation(ORIENTATION.HORIZONTAL).centrar();
//		rgC3P303_2 = new RadioGroupOtherField(this.getActivity(), R.string.si,
//				R.string.no).size(WRAP_CONTENT, 200).callback("FuncionRGP303")
//				.orientation(ORIENTATION.HORIZONTAL).centrar();
//		rgC3P303_3 = new RadioGroupOtherField(this.getActivity(), R.string.si,
//				R.string.no).size(WRAP_CONTENT, 200).callback("FuncionRGP303")
//				.orientation(ORIENTATION.HORIZONTAL).centrar();

		txtC3P303_A_1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC3P303_A_2 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC3P303_A_3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		
		txtC3P303_T = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar().readOnly();
		
		lblCab1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 260).centrar()
				.text(R.string.c1c100m3p002a_cab1).textSize(15).negrita();
		lblCab2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 80).centrar()
				.text(R.string.c1c100m3p002a_cab2).textSize(17).negrita();
		lblCab3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 20, 400).centrar()
				.text(R.string.c1c100m3p002a_cab3).textSize(15).negrita();

		lblTotal = new LabelComponent(this.getActivity())
				.size(altoComponente, 125).text("TOTAL").textSize(15).negrita()
				.centrar();
		lblHombrs = new LabelComponent(this.getActivity())
				.size(altoComponente, 125).text("Hombres").textSize(15)
				.negrita().centrar();
		lblMujeres = new LabelComponent(this.getActivity())
				.size(altoComponente, 125).text("Mujeres").textSize(15)
				.negrita().centrar();

		lblNiv1 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_1)
				.textSize(14).negrita().alinearIzquierda();
		lblNiv2 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_2)
				.textSize(14).negrita().alinearIzquierda();
		lblNiv3 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_3)
				.textSize(14).negrita().alinearIzquierda();
		lblNiv4 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_4)
				.textSize(14).negrita().alinearIzquierda();
		lblNiv5 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_5)
				.textSize(14).negrita().alinearIzquierda();
		lblNiv6 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_6)
				.textSize(14).negrita().alinearIzquierda();
		lblNiv7 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_7)
				.textSize(14).negrita().alinearIzquierda();
		lblNiv8 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 10, 70).text(R.string.c1c100m3p002b_8)
				.textSize(14).negrita().alinearIzquierda();

		lblFile1 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c1)
				.textSize(15).negrita().centrar();
		lblFile2 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c2)
				.textSize(15).negrita().centrar();
		lblFile3 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c3)
				.textSize(15).negrita().centrar();
		lblFile4 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c4)
				.textSize(15).negrita().centrar();
		lblFile5 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c5)
				.textSize(15).negrita().centrar();
		lblFile6 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c6)
				.textSize(15).negrita().centrar();
		lblFile7 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c7)
				.textSize(15).negrita().centrar();
		lblFile8 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p002a_c8)
				.textSize(15).negrita().centrar();

		LabelComponent lblvacio = new LabelComponent(this.getActivity())
				.size(altoComponente, 250).text("").textSize(15).negrita()
				.centrar();
		LabelComponent lblp303_1 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("1. Un turno?")
				.textSize(15).negrita().alinearIzquierda();
		LabelComponent lblp303_2 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("2. Dos turnos?")
				.textSize(15).negrita().alinearIzquierda();
		LabelComponent lblp303_3 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("3. Tres turnos?")
				.textSize(15).negrita().alinearIzquierda();
		
		LabelComponent lblsino = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("SI/NO")
				.textSize(15).negrita().centrar();

		LabelComponent lblc = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("�Cu�ntas horas de trabajo fueron�?")
				.textSize(15).negrita().centrar();
		
		LabelComponent lbltotalxx = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("Total")
				.textSize(15).negrita().centrar();
		
		LabelComponent lblp303_1A = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("1. Un turno?")
				.textSize(15).negrita().alinearIzquierda();
		LabelComponent lblp303_2A = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("2. Dos turnos?")
				.textSize(15).negrita().alinearIzquierda();
		LabelComponent lblp303_3A = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("3. Tres turnos?")
				.textSize(15).negrita().alinearIzquierda();
		
		LabelComponent lblNHoras1 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("N�mero de horas")
				.textSize(15).negrita().alinearIzquierda();
		LabelComponent lblNHoras2 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("N�mero de horas")
				.textSize(15).negrita().alinearIzquierda();
		LabelComponent lblNHoras3 = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("N�mero de horas")
				.textSize(15).negrita().alinearIzquierda();

		chbC3P302_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p002a_c1, "1:0").size(WRAP_CONTENT, 85).callback("FuncionCheck302_1");
		chbC3P302_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p002a_c2, "1:0").size(WRAP_CONTENT, 85).callback("FuncionCheck302_2");
		chbC3P302_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p002a_c3, "1:0").size(WRAP_CONTENT, 85).callback("FuncionCheck302_3");
		chbC3P302_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p002a_c4, "1:0").size(WRAP_CONTENT, 85).callback("FuncionCheck302_4");
		chbC3P302_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p002a_c5, "1:0").size(WRAP_CONTENT, 85).callback("FuncionCheck302_5");
		chbC3P302_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p002a_c6, "1:0").size(WRAP_CONTENT, 85).callback("FuncionCheck302_6");
		chbC3P302_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p002a_c7, "1:0").size(WRAP_CONTENT, 85).callback("FuncionCheck302_7");
		
		
		lblmod3_1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 10, 150).text(R.string.c1c100m3p003_1)
				.textSize(13).negrita().centrar();
		lblmod4_1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 10, 150).text(R.string.c1c100m3p004_1)
				.textSize(13).negrita().centrar();
		lblmod4_2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 10, 150).text(R.string.c1c100m3p004_2)
				.textSize(13).negrita().centrar();
		lblmod4_3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 10, 150).text(R.string.c1c100m3p004_3)
				.textSize(13).negrita().centrar();
		
		
		btnOmisionH1 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B_1.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM1 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C_1.setText(Util.getText(OMISION));
			}
		});
		
		
		btnOmisionH2 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B_2.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM2 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C_2.setText(Util.getText(OMISION));
			}
		});
		
		
		btnOmisionH3 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B_3.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM3 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C_3.setText(Util.getText(OMISION));
			}
		});
		
		
		btnOmisionH4 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B_4.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM4 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C_4.setText(Util.getText(OMISION));
			}
		});
		
		
		btnOmisionH5 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B_5.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM5 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C_5.setText(Util.getText(OMISION));
			}
		});
		
		
		btnOmisionH6 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B_6.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM6 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C_6.setText(Util.getText(OMISION));
			}
		});
		
		
		btnOmisionH7 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionH7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302B_7.setText(Util.getText(OMISION));
			}
		});
		
		btnOmisionM7 = new ImageComponent(getActivity(), R.drawable.seteo,
				R.drawable.seteo).size(50,
				LayoutParams.WRAP_CONTENT);

		btnOmisionM7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				txtC3P302C_7.setText(Util.getText(OMISION));
			}
		});
							

		grP301 = new GridComponent2(this.getActivity(),
				Gravity.CENTER_VERTICAL, 3);
		grP301.addComponent(lblTitulop, 3);
		grP301.addComponent(lblTitulot);
		grP301.addComponent(lblTituloh);
		grP301.addComponent(lblTitulom);
		grP301.addComponent(lblTitulota);
		grP301.addComponent(lblTituloha);
		grP301.addComponent(lblTituloma);
		
		
//		grP302A = new GridComponent(this.getActivity(),	Gravity.CENTER_VERTICAL, 5);
//		grP302A.addComponent(lblCab3,5);
//		grP302A.addComponent(lblTotal, 1);		
//		grP302A.addComponent(lblHombrs,2);
//		grP302A.addComponent(lblMujeres,2);

		grP302 = new GridComponent(this.getActivity(),	Gravity.CENTER_VERTICAL, 7);
		grP302.addComponent(/*1, 2, */lblCab1);
		grP302.addComponent(/*1, 2, */lblCab2);
		grP302.addComponent(lblCab3,5);
		
		grP302.addComponent( new LabelComponent(getActivity()));
		grP302.addComponent( new LabelComponent(getActivity()));
		grP302.addComponent(lblTotal, 1);		
		grP302.addComponent(lblHombrs,2);
		grP302.addComponent(lblMujeres,2);
		
		grP302.addComponent(lblNiv1);
		grP302.addComponent(chbC3P302_1);		
		grP302.addComponent(txtC3P302A_1);
		grP302.addComponent(txtC3P302B_1);
		grP302.addComponent(btnOmisionH1);
		grP302.addComponent(txtC3P302C_1);
		grP302.addComponent(btnOmisionM1);
		
		grP302.addComponent(lblNiv2);
		grP302.addComponent(chbC3P302_2);
		grP302.addComponent(txtC3P302A_2);
		grP302.addComponent(txtC3P302B_2);
		grP302.addComponent(btnOmisionH2);
		grP302.addComponent(txtC3P302C_2);
		grP302.addComponent(btnOmisionM2);
		
		grP302.addComponent(lblNiv3);
		grP302.addComponent(chbC3P302_3);
		grP302.addComponent(txtC3P302A_3);
		grP302.addComponent(txtC3P302B_3);
		grP302.addComponent(btnOmisionH3);
		grP302.addComponent(txtC3P302C_3);
		grP302.addComponent(btnOmisionM3);
		
		grP302.addComponent(lblNiv4);
		grP302.addComponent(chbC3P302_4);
		grP302.addComponent(txtC3P302A_4);
		grP302.addComponent(txtC3P302B_4);
		grP302.addComponent(btnOmisionH4);
		grP302.addComponent(txtC3P302C_4);
		grP302.addComponent(btnOmisionM4);
		
		grP302.addComponent(lblNiv5);
		grP302.addComponent(chbC3P302_5);
		grP302.addComponent(txtC3P302A_5);
		grP302.addComponent(txtC3P302B_5);
		grP302.addComponent(btnOmisionH5);
		grP302.addComponent(txtC3P302C_5);
		grP302.addComponent(btnOmisionM5);
		
		grP302.addComponent(lblNiv6);
		grP302.addComponent(chbC3P302_6);
		grP302.addComponent(txtC3P302A_6);
		grP302.addComponent(txtC3P302B_6);
		grP302.addComponent(btnOmisionH6);
		grP302.addComponent(txtC3P302C_6);
		grP302.addComponent(btnOmisionM6);
		
		grP302.addComponent(lblNiv7);
		grP302.addComponent(chbC3P302_7);
		grP302.addComponent(txtC3P302A_7);
		grP302.addComponent(txtC3P302B_7);
		grP302.addComponent(btnOmisionH7);
		grP302.addComponent(txtC3P302C_7);
		grP302.addComponent(btnOmisionM7);
		
		grP302.addComponent(lblNiv8);
		grP302.addComponent(lblFile8);
		grP302.addComponent(txtC3P302A_8);
		grP302.addComponent(txtC3P302B_8,2);
		grP302.addComponent(txtC3P302C_8,2);
		grP302.colorFondo(FragmentForm.COLOR_LINEA_SECCION_PREGUNTA);

		grEspe = new GridComponent2(this.getActivity(), 2);
		grEspe.addComponent(chbC3P302A_A6);
		grEspe.addComponent(txtC3P302A_A6ESP);
		grEspe.colorFondo(R.color.transparent);

//		grP303 = new GridComponent2(this.getActivity(),
//				Gravity.CENTER_VERTICAL, 2);
//		grP303.addComponent(lblvacio);
//		grP303.addComponent(lblsino);
		//grP303.addComponent(lblc);
//		grP303.addComponent(lblp303_1);
//		grP303.addComponent(rgC3P303_1);
		//grP303.addComponent(txtC3P303_A_1);
//		grP303.addComponent(lblp303_2);
//		grP303.addComponent(rgC3P303_2);
		//grP303.addComponent(txtC3P303_A_2);
//		grP303.addComponent(lblp303_3);
//		grP303.addComponent(rgC3P303_3);
	//	grP303.addComponent(txtC3P303_A_3);
	//	grP303.addComponent(lbltotalxx,2);
	//	grP303.addComponent(txtC3P303_T);
		
		grP303A = new GridComponent2(this.getActivity(),
				Gravity.CENTER_VERTICAL, 3);
		grP303A.addComponent(lblp303_1A);
		grP303A.addComponent(lblp303_2A);
		grP303A.addComponent(lblp303_3A);
		
		grP303A.addComponent(txtC3P303_A_1);
		grP303A.addComponent(txtC3P303_A_2);
		grP303A.addComponent(txtC3P303_A_3);

		grP303A.addComponent(lblNHoras1);
		grP303A.addComponent(lblNHoras2);
		grP303A.addComponent(lblNHoras3);
		
		Filtros.setFiltro(txtC3P302A_1, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302A_2, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302A_3, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302A_4, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302A_5, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302A_6, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302A_7, Filtros.TIPO.NUMBER, 5, -1, null, 0,59998, 99999);
		Filtros.setFiltro(txtC3P302A_8, Filtros.TIPO.NUMBER, 6, -1, null, 0,599998, 999999);
		
		
		Filtros.setFiltro(txtC3P302B_1, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302B_2, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302B_3, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302B_4, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302B_5, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302B_6, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302B_7, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		
		Filtros.setFiltro(txtC3P302C_1, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302C_2, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302C_3, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302C_4, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302C_5, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302C_6, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		Filtros.setFiltro(txtC3P302C_7, Filtros.TIPO.NUMBER, 5, -1, null, 0,30000,99999);
		
		
		Filtros.setFiltro(txtC3P303_A_1, Filtros.TIPO.NUMBER, 2, -1, null, 1, 24);
		Filtros.setFiltro(txtC3P303_A_2, Filtros.TIPO.NUMBER, 2, -1, null, 1, 24);
		Filtros.setFiltro(txtC3P303_A_3, Filtros.TIPO.NUMBER, 1, -1, null, 1, 24);


	}

	
	private void executeEvents() {
//		txtC3P302A_1.addTextChangedListener(new twFuncionBloqueo1(txtC3P302A_1));  
//		txtC3P302B_1.addTextChangedListener(new twFuncionBloqueo1(txtC3P302A_1));  
//		txtC3P302C_1.addTextChangedListener(new twFuncionBloqueo1(txtC3P302A_1));			
}
	
	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(lblSubTitulo3);
		q2 = createQuestionSection(R.string.c1c100m3p002a, grP302.component());
		q3 = createQuestionSection(R.string.c1c100m3p302a, chbC3P302A_A1,
				chbC3P302A_A2, chbC3P302A_A3, chbC3P302A_A4, chbC3P302A_A5,
				grEspe.component());
		q4 = createQuestionSection(R.string.c1c100m3p003,rgC3P303 );
		
		q5 = createQuestionSection(R.string.c1c100m3p003A, grP303A.component());
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

			if (Util.esVacio(bean.c3p302b_1))
				bean.c3p302b_1 = 0;
			if (Util.esVacio(bean.c3p302b_2))
				bean.c3p302b_2 = 0;
			if (Util.esVacio(bean.c3p302b_3))
				bean.c3p302b_3 = 0;
			if (Util.esVacio(bean.c3p302b_4))
				bean.c3p302b_4 = 0;
			if (Util.esVacio(bean.c3p302b_5))
				bean.c3p302b_5 = 0;
			if (Util.esVacio(bean.c3p302b_6))
				bean.c3p302b_6 = 0;
			if (Util.esVacio(bean.c3p302b_7))
				bean.c3p302b_7 = 0;
			if (Util.esVacio(bean.c3p302b_8))
				bean.c3p302b_8 = 0;

			if (Util.esVacio(bean.c3p302c_1))
				bean.c3p302c_1 = 0;
			if (Util.esVacio(bean.c3p302c_2))
				bean.c3p302c_2 = 0;
			if (Util.esVacio(bean.c3p302c_3))
				bean.c3p302c_3 = 0;
			if (Util.esVacio(bean.c3p302c_4))
				bean.c3p302c_4 = 0;
			if (Util.esVacio(bean.c3p302c_5))
				bean.c3p302c_5 = 0;
			if (Util.esVacio(bean.c3p302c_6))
				bean.c3p302c_6 = 0;
			if (Util.esVacio(bean.c3p302c_7))
				bean.c3p302c_7 = 0;
			if (Util.esVacio(bean.c3p302c_8))
				bean.c3p302c_8 = 0;

			
			if (Util.getInt(bean.c3p302a_8) == OMISION){
				bean.c3p302_omi = 9;
			}else{
				bean.c3p302_omi = 1;
			}
				
			
			if (!getCuestionarioService().saveOrUpdate(bean,
					bean.getSecCap(getListFields(this, new String[] {"C3P302_OMI"} )))) {
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

		// for (int i = 1; i <= 7; i++) {
		// IntegerField x = ((IntegerField) getView("txtC3P302B_" + (i)));
		// if (Util.esVacio(x)) {
		// mensaje = pregunta_no_vacia.replace("$", "N� de Trabajadores.");
		// view = x;
		// return !(error = true);
		// }
		// IntegerField y = ((IntegerField) getView("txtC3P302C_" + (i)));
		// if (Util.esVacio(y)) {
		// mensaje = pregunta_no_vacia.replace("$", "N� de Trabajadores.");
		// view = y;
		// return !(error = true);
		// }
		// }
		
		if (!chbC3P302_1.isChecked() && !chbC3P302_2.isChecked()
				&& !chbC3P302_3.isChecked() && !chbC3P302_4.isChecked()
				&& !chbC3P302_5.isChecked() && !chbC3P302_6.isChecked()
				&& !chbC3P302_7.isChecked()) {
			mensaje = "Debe seleccionar una alternativa en P302";
			view = chbC3P302_1;
			error = true;
			return false;
		}
		
		if (chbC3P302_1.isChecked()) {
			if (Util.esVacio(txtC3P302B_1) ||  Util.esVacio(txtC3P302C_1)  ) {
				mensaje = "Ingrese la informaci�n ";
				view = txtC3P302B_1;
				error = true;
				return false;
			}
			

			
			
			if (Util.getInt(txtC3P302A_1)  == 0 ){
				mensaje = "Error: La suma de hombres y mujeres no puede ser 0";
				view = txtC3P302B_1;
				error = true;
				return false;
			}
		}
		
		if (chbC3P302_2.isChecked()) {
			if (Util.esVacio(txtC3P302B_2) ||  Util.esVacio(txtC3P302C_2)  ) {
				mensaje = "Ingrese la informaci�n ";
				view = txtC3P302B_2;
				error = true;
				return false;
			}
			if (Util.getInt(txtC3P302A_2)  == 0 ){
				mensaje = "Error: La suma de hombres y mujeres no puede ser 0";
				view = txtC3P302B_2;
				error = true;
				return false;
			}
		}
		// VERIFICACI�N 1
//VERIFICACI�N	:	  Si C3P302A_A2=1 and P25<>1  Verificar
//                Si C3P302A_A3=1 and P25<>2   Verificar
//   MENSAJE	:	�Error: R�gimen de contrato laboral no se relaciona con P25�

		 error1 = false;
		if (caratula.p25 != 1 && chbC3P302A_A2.isChecked()) {
			error1 = true;
		}
		if (error1 && !avance1) {
			action = ACTION.EJECUTAR_VER1;
			DialogComponent dlg = new DialogComponent(
					getActivity(),
					(Respondible) this,
					TIPO_DIALOGO.YES_NO,
					getResources().getString(R.string.app_name),
					"Verificar: R�gimen de contrato laboral no se relaciona con P25�");
			dlg.showDialog();
			return false;
		}
		
		 error2 = false;
			if (caratula.p25 != 2 && chbC3P302A_A3.isChecked()) {
				error2 = true;
			}
			if (error2 && !avance2) {
				action = ACTION.EJECUTAR_VER2;
				DialogComponent dlg = new DialogComponent(
						getActivity(),
						(Respondible) this,
						TIPO_DIALOGO.YES_NO,
						getResources().getString(R.string.app_name),
						"Verificar: R�gimen de contrato laboral no se relaciona con P25�");
				dlg.showDialog();
				return false;
			}
		///


				if (chbC3P302_3.isChecked()) {
			if (Util.esVacio(txtC3P302B_3) ||  Util.esVacio(txtC3P302C_3)  ) {
				mensaje = "Ingrese la informaci�n";
				view = txtC3P302B_3;
				error = true;
				return false;
			}
			if (Util.getInt(txtC3P302A_3)  == 0 ){
				mensaje = "Error: La suma de hombres y mujeres no puede ser 0";
				view = txtC3P302B_3;
				error = true;
				return false;
			}
		}
		
		if (chbC3P302_4.isChecked()) {
			if (Util.esVacio(txtC3P302B_4) ||  Util.esVacio(txtC3P302C_4)  ) {
				mensaje = "Ingrese la informaci�n";
				view = txtC3P302B_4;
				error = true;
				return false;
			}
			if (Util.getInt(txtC3P302A_4)  == 0 ){
				mensaje = "Error: La suma de hombres y mujeres no puede ser 0";
				view = txtC3P302B_4;
				error = true;
				return false;
			}
		}
		
		if (chbC3P302_5.isChecked()) {
			if (Util.esVacio(txtC3P302B_5) ||  Util.esVacio(txtC3P302C_5)  ) {
				mensaje = "Ingrese la informaci�n";
				view = txtC3P302B_5;
				error = true;
				return false;
			}
			if (Util.getInt(txtC3P302A_5)  == 0 ){
				mensaje = "Error: La suma de hombres y mujeres no puede ser 0";
				view = txtC3P302B_5;
				error = true;
				return false;
			}
		}
		
		if (chbC3P302_6.isChecked()) {
			if (Util.esVacio(txtC3P302B_6) ||  Util.esVacio(txtC3P302C_6)  ) {
				mensaje = "Ingrese la informaci�n";
				view = txtC3P302B_6;
				error = true;
				return false;
			}
			if (Util.getInt(txtC3P302A_6)  == 0 ){
				mensaje = "Error: La suma de hombres y mujeres no puede ser 0";
				view = txtC3P302B_6;
				error = true;
				return false;
			}
		}
		
		if (chbC3P302_7.isChecked()) {
			if (Util.esVacio(txtC3P302B_7) ||  Util.esVacio(txtC3P302C_7)  ) {
				mensaje = "Ingrese la informaci�n";
				view = txtC3P302B_7;
				error = true;
				return false;
			}
			if (Util.getInt(txtC3P302A_7)  == 0 ){
				mensaje = "Error: La suma de hombres y mujeres no puede ser 0";
				view = txtC3P302B_7;
				error = true;
				return false;
			}
		}

		
		if (p301_05 > 0) {
			if (!chbC3P302A_A1.isChecked() && !chbC3P302A_A2.isChecked()
					&& !chbC3P302A_A3.isChecked() && !chbC3P302A_A4.isChecked()
					&& !chbC3P302A_A5.isChecked() && !chbC3P302A_A6.isChecked()) {
				mensaje = "Debe seleccionar una alternativa en P302A";
				view = chbC3P302A_A1;
				error = true;
				return false;
			}

			if (chbC3P302A_A6.isChecked()) {
				if (Util.esVacio(txtC3P302A_A6ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg. 302A (Especifique");
					view = txtC3P302A_A6ESP;
					error = true;
					return false;
				} else {
					if (txtC3P302A_A6ESP.getText().length() < 3) {
						mensaje = "Ingrese la informaci�n correcta";
						view = txtC3P302A_A6ESP;
						error = true;
						return false;
					}
				}
			}
		}
		
		if (Util.getInt(bean.c3p302a_8) == OMISION || Util.getInt(bean.c3p302b_8) == OMISION || Util.getInt(bean.c3p302c_8) == OMISION ){
			bean.c3p302_omi = 9;
		}else{
			bean.c3p302_omi = 1;
		}
			
		
	//	Log.e ("bean.c3p302a_8", bean.c3p302a_8 +"");
	//	Log.e ("bean.c3p302_omi", bean.c3p302_omi +"");
		
		
		int Total = Util.getInt(bean.c3p301 );
		int Total302 = Integer.parseInt(txtC3P302A_8.getText().toString());
		int Total302H = Integer.parseInt(txtC3P302B_8.getText().toString());
		int Total302M = Integer.parseInt(txtC3P302C_8.getText().toString());
		int SumGeneA = p301_12 + p301_13;
		int SumGeneB = p301_12h + p301_13h;
		int SumGeneC = p301_12m + p301_13m;
		//RETIRADO
//		if (Util.getInt(bean.c3p302_omi )==1){								
//			if ( Util.getInt(Total) != Total302) {
//			//	mensaje = "Error: N�mero de personas que laboran en la empresa debe coincidir a la suma de trabajadores por NIVEL EDUCATIVO";
//				ToastMessage.msgBox(this.getActivity(), "Verificar: N�mero de personas que laboran en la empresa debe coincidir a la suma de trabajadores por NIVEL EDUCATIVO",
//						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);	
//				//view = txtC3P302A_8;
//				//return !(error = true);
//			}		
//		}		
		
		if (Util.getInt(bean.c3p301_omi )==1  &&  Util.getInt(bean.c3p302_omi )==1){			
			if ( Util.getInt(Total302) != SumGeneA) {
				//mensaje = "Error: No concuerda total de trabajadores seg�n categor�a ocupacional con total de trabajadores seg�n nivel  educativo";
				ToastMessage.msgBox(this.getActivity(), "Verificar: No concuerda total de trabajadores seg�n categor�a ocupacional con total de trabajadores seg�n nivel  educativo",
						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);	
			//	view = txtC3P302A_8;
			//	return !(error = true);	
			}	
			//RETIRADO
//			if ( Util.getInt(Total302) != SumGeneA) {
//				ToastMessage.msgBox(this.getActivity(),
//						"VERIFICAR: No concuerda total de trabajadores P301 Y P302",
//						ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
//			}	
			
			if ( Util.getInt(Total302M) != SumGeneC) {
			//	mensaje = "Error: No concuerda total de trabajadores (Mujeres) seg�n categor�a ocupacional con total de trabajadores (Mujeres) seg�n nivel educativo";
				ToastMessage.msgBox(this.getActivity(), "Verificar: No concuerda total de trabajadores (Mujeres) seg�n categor�a ocupacional con total de trabajadores (Mujeres) seg�n nivel educativo",
						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);	
			//	view = txtC3P302B_8;
			//	return !(error = true);	
			}	
			
			if ( Util.getInt(Total302H) != SumGeneB) {
			//	mensaje = "Error: No concuerda total de trabajadores (Hombres) seg�n categor�a ocupacional con total de trabajadores (Hombres) seg�n nivel educativo";
				ToastMessage.msgBox(this.getActivity(), "Verificar: No concuerda total de trabajadores (Hombres) seg�n categor�a ocupacional con total de trabajadores (Hombres) seg�n nivel educativo",
						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);	
			//	view = txtC3P302C_8;
			//	return !(error = true);	
			}	
		}
							
		
		if (Util.esVacio(rgC3P303)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P303");
			view = rgC3P303;
			return !(error = true);
		}
//		if (Util.esVacio(rgC3P303_2)) {
//			mensaje = pregunta_no_vacia.replace("$", "La pregunta P303-2");
//			view = rgC3P303_2;
//			return !(error = true);
//		}
//		if (Util.esVacio(rgC3P303_3)) {
//			mensaje = pregunta_no_vacia.replace("$", "La pregunta P303-3");
//			view = rgC3P303_3;
//			return !(error = true);
//		}
		
//		if ((rgC3P303_1.isTagSelected(2) && rgC3P303_2.isTagSelected(2) && rgC3P303_3.isTagSelected(2))) {
//			mensaje = "Error: Debe tener al menos un turno de trabajo";
//			view = rgC3P303_1;
//			error = true;
//			return false;
//		}
		
//		if ((rgC3P303_1.isTagSelected(1) && rgC3P303_2.isTagSelected(2) && rgC3P303_3.isTagSelected(1))
//				|| (rgC3P303_1.isTagSelected(1) && rgC3P303_2.isTagSelected(1))
//				|| (rgC3P303_1.isTagSelected(1) && rgC3P303_3.isTagSelected(1))
//				|| (rgC3P303_2.isTagSelected(1) && rgC3P303_3.isTagSelected(1))) {
//			mensaje = "Solo se debe seleccionar �Si� a uno de los tres turnos";
//			view = rgC3P303_1;
//			error = true;
//			return false;
//		}
		
		if (rgC3P303.isTagSelected(1) ) {
			if (Util.getInt(txtC3P303_A_1) >19 ){
				mensaje = "Error: Un turno de trabajo con 20 a m�s horas laborales";
				view = txtC3P303_A_1;
				error = true;
				return false;
			}			
		}

		
		
		if (rgC3P303.isTagSelected(1) ) {
			if (Util.getInt(txtC3P303_A_2) >15 ){
				mensaje = "Error: Un turno de trabajo con 15 a m�s horas laborales";
				view = txtC3P303_A_1;
				error = true;
				return false;
			}			
		}
		
		if (rgC3P303.isTagSelected(1) ) {
			if (Util.getInt(txtC3P303_A_3) >10 ){
				mensaje = "Error: Un turno de trabajo con 10 a m�s horas laborales";
				view = txtC3P303_A_1;
				error = true;
				return false;
			}			
		}
		
			
		if ( Util.esVacio(txtC3P303_A_1)   &&   Util.esVacio(txtC3P303_A_2)   &&   Util.esVacio(txtC3P303_A_3)  ){
			mensaje = "Error: Debe seleccionar algun turno";
			view = txtC3P303_A_1;
			return !(error = true);
		}
		
//		VERIFICACI�N 2	:	Si C3P303 =1 and C3P303A>10   Verificar
//      Si C3P303 =2 and C3P303A>9   Verificar
//      Si C3P303 =3 and C3P303A>7   Verificar
//   MENSAJE	:	�Verificar: Horas de trabajo por turno �
		
		 error3 = false;
		int valor1 = Integer.parseInt(txtC3P303_A_1.getText().toString());
		 if (rgC3P303.getTagSelected("").toString().equals("2")&& valor1 >9) {
			error3 = true;
		}
		if (error3 && !avance3) {
			action = ACTION.EJECUTAR_VER3;
			DialogComponent dlg = new DialogComponent(
					getActivity(),
					(Respondible) this,
					TIPO_DIALOGO.YES_NO,
					getResources().getString(R.string.app_name),
					"Verificar: Horas de trabajo por turno");
			dlg.showDialog();
			return false;
		}
		 error4 = false;
		int valor2 = Integer.parseInt(txtC3P303_A_1.getText().toString());
		 if (rgC3P303.getTagSelected("").toString().equals("3")&& valor2 >7) {
			error4 = true;
		}
		if (error4 && !avance4) {
			action = ACTION.EJECUTAR_VER4;
			DialogComponent dlg = new DialogComponent(
					getActivity(),
					(Respondible) this,
					TIPO_DIALOGO.YES_NO,
					getResources().getString(R.string.app_name),
					"Verificar: Horas de trabajo por turno");
			dlg.showDialog();
			return false;
		}
//		VERIFICACI�N	:	Si C3P303 =1 and C3P303A>18  Error
//                Si C3P303 =2 and C3P303A>14   Error
//                Si C3P303 =3 and C3P303A>9   Error
//MENSAJE	:	�Verificar: Horas de trabajo por turno �
		 error5 = false;
		int valor5 = Integer.parseInt(txtC3P303_A_1.getText().toString());
		 if (rgC3P303.getTagSelected("").toString().equals("2")&& valor5 >14) {
			error5 = true;
		}
		if (error5 && !avance5) {
			action = ACTION.EJECUTAR_VER5;
			DialogComponent dlg = new DialogComponent(
					getActivity(),
					(Respondible) this,
					TIPO_DIALOGO.YES_NO,
					getResources().getString(R.string.app_name),
					"Verificar: Horas de trabajo por turno");
			dlg.showDialog();
			return false;
		}
		
		 error6 = false;
		int valor6 = Integer.parseInt(txtC3P303_A_1.getText().toString());
		 if (rgC3P303.getTagSelected("").toString().equals("2")&& valor6 >14) {
			error6 = true;
		}
		if (error6 && !avance6) {
			action = ACTION.EJECUTAR_VER6;
			DialogComponent dlg = new DialogComponent(
					getActivity(),
					(Respondible) this,
					TIPO_DIALOGO.YES_NO,
					getResources().getString(R.string.app_name),
					"Verificar: Horas de trabajo por turno");
			dlg.showDialog();
			return false;
		}
		
		
	
//		if (Util.getInt(bean.c3p302a_8) == OMISION){
//			bean.c3p302_omi = 9;
//		}else{
//			bean.c3p302_omi = 1;
//		}
		



		// Log.e ("", Total + "");
		// Log.e ("Util.getInt(bean.c3p301a_t2)", Util.getInt(bean.c3p301a_t2) +
		// "");
		// Log.e ("Util.getInt(bean.c3p301a_11)", Util.getInt(bean.c3p301a_11) +
		// "");

//		int Total2 = Integer.parseInt(txtC3P302B_8.getText().toString());
//		int SumGeneB = p301_12;
//		if (Total2 < Util.getInt(SumGeneB)) {
//			mensaje = "Verificar cantidad de trabajadores por nivel educativo menor a total por ocupaci�n";
//			view = txtC3P302B_8;
//		//	return !(error = true);
//		}
		 
		
//		if (rgC3P303_1.isTagSelected(1)) {
//			if (Util.esVacio(txtC3P303_A_1)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"N�mero de horas de trabajo");
//				view = txtC3P303_A_1;
//				return !(error = true);
//			}
//		}
//
//		if (rgC3P303_2.isTagSelected(1)) {
//			if (Util.esVacio(txtC3P303_A_1)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"N�mero de horas de trabajo");
//				view = txtC3P303_A_1;
//				return !(error = true);
//			}
//
//			if (Util.esVacio(txtC3P303_A_2)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"N�mero de horas de trabajo");
//				view = txtC3P303_A_2;
//				return !(error = true);
//			}
//		}
//
//		if ((rgC3P303_1.isTagSelected(1) && rgC3P303_2.isTagSelected(2) && rgC3P303_3
//				.isTagSelected(3))
//				|| (rgC3P303_1.isTagSelected(1) && rgC3P303_2.isTagSelected(1))
//				|| (rgC3P303_1.isTagSelected(1) && rgC3P303_3.isTagSelected(1))
//				|| (rgC3P303_2.isTagSelected(1) && rgC3P303_3.isTagSelected(1))) {
//			mensaje = "Solo se debe seleccionar �Si� a uno de los tres turnos";
//			view = rgC3P303_1;
//			error = true;
//			return false;
//		}
//
//		if ((rgC3P303_1.isTagSelected(2) && rgC3P303_2.isTagSelected(2) && rgC3P303_3
//				.isTagSelected(2))) {
//			mensaje = "Error: Debe tener al menos un turno de trabajo";
//			view = rgC3P303_1;
//			error = true;
//			return false;
//		}
//
//		if (rgC3P303_3.isTagSelected(1)) {
//			if (Util.esVacio(txtC3P303_A_1)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"N�mero de horas de trabajo");
//				view = txtC3P303_A_1;
//				return !(error = true);
//			}
//
//			if (Util.esVacio(txtC3P303_A_2)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"N�mero de horas de trabajo");
//				view = txtC3P303_A_2;
//				return !(error = true);
//			}
//
//			if (Util.esVacio(txtC3P303_A_3)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"N�mero de horas de trabajo");
//				view = txtC3P303_A_3;
//				return !(error = true);
//			}
//
//			// int x1, x2, x3;
//			// x1 = Integer.parseInt(txtC3P303_A_1.getText().toString());
//			// x2 = Integer.parseInt(txtC3P303_A_2.getText().toString());
//			// x3 = Integer.parseInt(txtC3P303_A_3.getText().toString());
//			// int suma = x1 + x2 + x3;
//			//
//			// if (suma > 24) {
//			// mensaje =
//			// "�VERIFICAR: La suma de los tres turnos supera las 24 horas�";
//			// view = txtC3P303_A_3;
//			// error = true;
//			// return false;
//			// }
//
//		}

		return true;
	}

	@Override
	public void cargarDatos() {
		avance1 = false;
		avance2 = false;
		bean = getCuestionarioService().getModuloiii01(
				App.getInstance().getEmpresa(),
				new Moduloiii01().getSecCap(getListFields(this, new String[] {
						"C3P301" , "C3P301_OMI", "C3P302_OMI" })));
		if (bean == null) {
			bean = new Moduloiii01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		//caratula
		   caratula  = App.getInstance().getEmpresa();
		
		lstDetalle = getCuestionarioService().getModuloIII_det(bean, campos);
		entityToUI(bean);
		flag1 = true;
		inicio();
		flag1 = false;
	}

	private void inicio() {
		txtC3P302B_1.requestFocus();
		Log.e("que paso aquiiiiiiii p25: ", "" +caratula.p25 );
		Integer valor1 =   Util.getInt(txtC3P302B_1.getText().toString()); 
		Integer valor2 =   Util.getInt(txtC3P302C_1.getText().toString());
		Integer valora =   Util.getInt(txtC3P302A_1.getText().toString());	
		
//		if (Util.getInt(txtC3P302B_2) == OMISION	&& Util.getInt(txtC3P302C_2) == OMISION) {
//			txtC3P302A_1.setText(Util.getText(valora));
//		}
		
		// int total301 = Util.getInt(bean.c3p301a_t2) +
		// Util.getInt(bean.c3p301a_11);
		// int total301h = Util.getInt(bean.c3p301b_t2) +
		// Util.getInt(bean.c3p301b_11);
		// int total301m = Util.getInt(bean.c3p301c_t2) +
		// Util.getInt(bean.c3p301c_11);
		// lblTitulota.setText(Util.getText(total301));
		// lblTituloha.setText(Util.getText(total301h));
		// lblTituloma.setText(Util.getText(total301m));
		FuncionRGP303();
		FuncionCheck();
				
		if (chbC3P302_1.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_1, txtC3P302C_1,btnOmisionH1, btnOmisionM1);

		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_1, txtC3P302C_1,btnOmisionH1, btnOmisionM1);

		}

		if (chbC3P302_2.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_2, txtC3P302C_2,btnOmisionH2, btnOmisionM2);

		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_2, txtC3P302C_2,btnOmisionH2, btnOmisionM2);

		}

		if (chbC3P302_3.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_3, txtC3P302C_3,btnOmisionH3, btnOmisionM3);

		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_3, txtC3P302C_3,btnOmisionH3, btnOmisionM3);

		}

		if (chbC3P302_4.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_4, txtC3P302C_4,btnOmisionH4, btnOmisionM4);

		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_4, txtC3P302C_4,btnOmisionH4, btnOmisionM4);

		}

		if (chbC3P302_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_5, txtC3P302C_5,btnOmisionH5, btnOmisionM5);

		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_5, txtC3P302C_5,btnOmisionH5, btnOmisionM5);

		}

		if (chbC3P302_6.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_6, txtC3P302C_6,btnOmisionH6, btnOmisionM6);

		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_6, txtC3P302C_6,btnOmisionH6, btnOmisionM6);

		}

		if (chbC3P302_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_7, txtC3P302C_7,btnOmisionH7, btnOmisionM7);

		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_7, txtC3P302C_7,btnOmisionH7, btnOmisionM7);

		}
		
	

		for (int x = 0; x < lstDetalle.size(); x++) {
			p301_05 = Util.getInt(lstDetalle.get(5).c3p301a_tot);
			p301_05m = Util.getInt(lstDetalle.get(5).c3p301a_2);
			p301_12 = Util.getInt(lstDetalle.get(12).c3p301a_tot);
			p301_13 = Util.getInt(lstDetalle.get(13).c3p301a_tot);
			
			
			p301_12h = Util.getInt(lstDetalle.get(12).c3p301a_1);
			p301_12m = Util.getInt(lstDetalle.get(12).c3p301a_2);
			p301_13h = Util.getInt(lstDetalle.get(13).c3p301a_1);
			p301_13m = Util.getInt(lstDetalle.get(13).c3p301a_2);			
		}

		Log.e("p301_05", p301_05 + "");
		Log.e("p301_12", p301_12 + "");
		
		Log.e("p301_12h", p301_12h + "");
		Log.e("p301_12m", p301_12m + "");
		Log.e("p301_13h", p301_13h + "");
		Log.e("p301_13m", p301_13m + "");

		if (p301_05 == 0) {
			Util.cleanAndLockView(getActivity(), chbC3P302A_A1, chbC3P302A_A2,
					chbC3P302A_A3, chbC3P302A_A4, chbC3P302A_A5, chbC3P302A_A6,
					txtC3P302A_A6ESP);
			rgC3P303.requestFocus();
		}

		// txtC3P302B_1.setValue(Util.esVacio(txtC3P302B_1) ? 0 :
		// txtC3P302B_1.getText().toString());
		// txtC3P302B_2.setValue(Util.esVacio(txtC3P302B_2) ? 0 :
		// txtC3P302B_2.getText().toString());
		// txtC3P302B_3.setValue(Util.esVacio(txtC3P302B_3) ? 0 :
		// txtC3P302B_3.getText().toString());
		// txtC3P302B_4.setValue(Util.esVacio(txtC3P302B_4) ? 0 :
		// txtC3P302B_4.getText().toString());
		// txtC3P302B_5.setValue(Util.esVacio(txtC3P302B_5) ? 0 :
		// txtC3P302B_5.getText().toString());
		// txtC3P302B_6.setValue(Util.esVacio(txtC3P302B_6) ? 0 :
		// txtC3P302B_6.getText().toString());
		// txtC3P302B_7.setValue(Util.esVacio(txtC3P302B_7) ? 0 :
		// txtC3P302B_7.getText().toString());
		// txtC3P302B_8.setValue(Util.esVacio(txtC3P302B_8) ? 0 :
		// txtC3P302B_8.getText().toString());
		//
		// txtC3P302C_1.setValue(Util.esVacio(txtC3P302C_1) ? 0 :
		// txtC3P302C_1.getText().toString());
		// txtC3P302C_2.setValue(Util.esVacio(txtC3P302C_2) ? 0 :
		// txtC3P302C_2.getText().toString());
		// txtC3P302C_3.setValue(Util.esVacio(txtC3P302C_3) ? 0 :
		// txtC3P302C_3.getText().toString());
		// txtC3P302C_4.setValue(Util.esVacio(txtC3P302C_4) ? 0 :
		// txtC3P302C_4.getText().toString());
		// txtC3P302C_5.setValue(Util.esVacio(txtC3P302C_5) ? 0 :
		// txtC3P302C_5.getText().toString());
		// txtC3P302C_6.setValue(Util.esVacio(txtC3P302C_6) ? 0 :
		// txtC3P302C_6.getText().toString());
		// txtC3P302C_7.setValue(Util.esVacio(txtC3P302C_7) ? 0 :
		// txtC3P302C_7.getText().toString());
		// txtC3P302C_8.setValue(Util.esVacio(txtC3P302C_8) ? 0 :
		// txtC3P302C_8.getText().toString());
		txtC3P302B_1.requestFocus();

	}

	public void FuncionRGP303() {
		Integer valor1 = Integer.parseInt(rgC3P303.getTagSelected("0").toString());
//		Integer valor2 = Integer.parseInt(rgC3P303_2.getTagSelected("0").toString());
//		Integer valor3 = Integer.parseInt(rgC3P303_3.getTagSelected("0").toString());
		
		if (valor1 == 1){
			Util.lockView(getActivity(), false, txtC3P303_A_1);
			txtC3P303_A_1.requestFocus();
		}else{
			Util.cleanAndLockView(getActivity(),txtC3P303_A_1);
			txtC3P303_A_2.requestFocus();
		}
		
		if (valor1 == 2){
			Util.lockView(getActivity(), false, txtC3P303_A_2);
			txtC3P303_A_2.requestFocus();
		}else{
			Util.cleanAndLockView(getActivity(),txtC3P303_A_2);
			txtC3P303_A_3.requestFocus();
		}
		
		if (valor1 == 3){
			Util.lockView(getActivity(), false, txtC3P303_A_3);
			txtC3P303_A_3.requestFocus();
		}else{
			Util.cleanAndLockView(getActivity(),txtC3P303_A_3);
		}

//		if (valor1 == 1 && valor2 == 1 && valor3 == 1) {
//			Util.lockView(getActivity(), false, txtC3P303_A_1, txtC3P303_A_2,
//					txtC3P303_A_3);
//			txtC3P303_A_1.requestFocus();
//
//		} else if (valor1 == 1 && (valor2 == 2 && valor3 == 2)) {
//			Util.lockView(getActivity(), false, txtC3P303_A_1);
//			Util.cleanAndLockView(getActivity(), txtC3P303_A_2, txtC3P303_A_3);
//			txtC3P303_A_1.requestFocus();
//
//		} else if (valor1 == 1 && (valor2 == 1 && valor3 == 2)) {
//			Util.lockView(getActivity(), false, txtC3P303_A_1, txtC3P303_A_2);
//			Util.cleanAndLockView(getActivity(), txtC3P303_A_3);
//			txtC3P303_A_1.requestFocus();
//
//		} else if (valor2 == 1 && valor3 == 2) {
//			Util.lockView(getActivity(), false, txtC3P303_A_1, txtC3P303_A_2);
//			Util.cleanAndLockView(getActivity(), txtC3P303_A_3);
//			txtC3P303_A_1.requestFocus();
//		} else if (valor2 == 1 && valor3 == 1) {
//			Util.lockView(getActivity(), false, txtC3P303_A_1, txtC3P303_A_2,
//					txtC3P303_A_3);
//			txtC3P303_A_1.requestFocus();
//
//		} else if (valor2 == 2 && valor3 == 1) {
//			Util.lockView(getActivity(), false, txtC3P303_A_1, txtC3P303_A_2,
//					txtC3P303_A_3);
//			txtC3P303_A_1.requestFocus();
//
//		} else if (valor1 == 2 && valor2 == 2 && valor3 == 2) {
//			Util.cleanAndLockView(getActivity(), txtC3P303_A_1, txtC3P303_A_2,
//					txtC3P303_A_3);
//			txtC3P303_A_1.requestFocus();
//		}

	}

	public void FuncionCheck() {
		if (chbC3P302A_A6.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302A_A6ESP);
			txtC3P302A_A6ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302A_A6ESP);
		}
	}

	public void FuncionCheck302_1() {
		if (chbC3P302_1.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_1, txtC3P302C_1,btnOmisionH1, btnOmisionM1);
			txtC3P302B_1.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_1, txtC3P302C_1,btnOmisionH1, btnOmisionM1);
			chbC3P302_2.requestFocus();
		}
	}

	public void FuncionCheck302_2() {
		if (chbC3P302_2.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_2, txtC3P302C_2,btnOmisionH2, btnOmisionM2);
			txtC3P302B_2.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_2, txtC3P302C_2,btnOmisionH2, btnOmisionM2);
			chbC3P302_3.requestFocus();
		}
	}

	public void FuncionCheck302_3() {
		if (chbC3P302_3.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_3, txtC3P302C_3,btnOmisionH3, btnOmisionM3);
			txtC3P302B_3.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_3, txtC3P302C_3,btnOmisionH3, btnOmisionM3);
			chbC3P302_4.requestFocus();
		}
	}

	public void FuncionCheck302_4() {
		if (chbC3P302_4.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_4, txtC3P302C_4,btnOmisionH4, btnOmisionM4);
			txtC3P302B_4.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_4, txtC3P302C_4,btnOmisionH4, btnOmisionM4);
			chbC3P302_5.requestFocus();
		}
	}

	public void FuncionCheck302_5() {
		if (chbC3P302_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_5, txtC3P302C_5,btnOmisionH5, btnOmisionM5);
			txtC3P302B_5.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_5, txtC3P302C_5,btnOmisionH5, btnOmisionM5);
			chbC3P302_6.requestFocus();
		}
	}

	public void FuncionCheck302_6() {
		if (chbC3P302_6.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_6, txtC3P302C_6,btnOmisionH6, btnOmisionM6);
			txtC3P302B_6.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_6, txtC3P302C_6,btnOmisionH6, btnOmisionM6);
			chbC3P302_7.requestFocus();
		}
	}

	public void FuncionCheck302_7() {
		if (chbC3P302_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P302B_7, txtC3P302C_7,btnOmisionH7, btnOmisionM7);
			txtC3P302B_7.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P302B_7, txtC3P302C_7,btnOmisionH7, btnOmisionM7);
			chbC3P302A_A1.requestFocus();
		}
	}
	
	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	
	private TextWatcher twFuncionBloqueo1 = new TextWatcher() {
		private View view;
		
//		public twFuncionBloqueo1(View view) {
//			this.view = view;
//		}

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
			if (!Util.esVacio(txtC3P302B_1) || !Util.esVacio(txtC3P302C_1)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B_1) ? 0 : Util.getInt(txtC3P302B_1.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C_1) ? 0 : Util.getInt(txtC3P302C_1.getText().toString()));			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 

				if (Util.getInt(txtC3P302B_1) == OMISION && Util.getInt(txtC3P302C_1) == OMISION) {
					txtC3P302A_1.setReadOnly(false);
				} else {
					txtC3P302A_1.setText(Util.getText(OMISION));

					if (Util.getInt(txtC3P302B_1) != OMISION	&& Util.getInt(txtC3P302C_1) != OMISION) {
						txtC3P302A_1.setText(Util.getText(total));
					}
				}				
			} else {
			//	Log.e("Los", "dos son vacios");
				txtC3P302A_1.setText("");
				txtC3P302A_1.setReadOnly(true);
			}
		}
	};
	
	private TextWatcher twFuncionBloqueo2 = new TextWatcher() {
		@Override
		public void onTextChanged(CharSequence s, int start, int before,int count) {
		}
		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,int after) {
		}

		@Override
		public void afterTextChanged(Editable s) {

			if (!Util.esVacio(txtC3P302B_2) || !Util.esVacio(txtC3P302C_2)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B_2) ? 0 : Util.getInt(txtC3P302B_2.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C_2) ? 0 : Util.getInt(txtC3P302C_2.getText().toString()));			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 

				if (Util.getInt(txtC3P302B_2) == OMISION && Util.getInt(txtC3P302C_2) == OMISION) {
					txtC3P302A_2.setReadOnly(false);
				} else {
					txtC3P302A_2.setText(Util.getText(OMISION));

					if (Util.getInt(txtC3P302B_2) != OMISION	&& Util.getInt(txtC3P302C_2) != OMISION) {
						txtC3P302A_2.setText(Util.getText(total));
					}
				}				
			} else {
			//	Log.e("Los", "dos son vacios");
				txtC3P302A_2.setText("");
				txtC3P302A_2.setReadOnly(true);
			}
		}
	};	
	
	private TextWatcher twFuncionBloqueo3 = new TextWatcher() {

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

			if (!Util.esVacio(txtC3P302B_3) || !Util.esVacio(txtC3P302C_3)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B_3) ? 0 : Util.getInt(txtC3P302B_3.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C_3) ? 0 : Util.getInt(txtC3P302C_3.getText().toString()));			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 

				if (Util.getInt(txtC3P302B_3) == OMISION && Util.getInt(txtC3P302C_3) == OMISION) {
					txtC3P302A_3.setReadOnly(false);
				} else {
					txtC3P302A_3.setText(Util.getText(OMISION));

					if (Util.getInt(txtC3P302B_3) != OMISION	&& Util.getInt(txtC3P302C_3) != OMISION) {
						txtC3P302A_3.setText(Util.getText(total));
					}
				}				
			} else {
			//	Log.e("Los", "dos son vacios");
				txtC3P302A_3.setText("");
				txtC3P302A_3.setReadOnly(true);
			}
		}
	};
	
	private TextWatcher twFuncionBloqueo4 = new TextWatcher() {

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

			if (!Util.esVacio(txtC3P302B_4) || !Util.esVacio(txtC3P302C_4)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B_4) ? 0 : Util.getInt(txtC3P302B_4.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C_4) ? 0 : Util.getInt(txtC3P302C_4.getText().toString()));			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 

				if (Util.getInt(txtC3P302B_4) == OMISION && Util.getInt(txtC3P302C_4) == OMISION) {
					txtC3P302A_4.setReadOnly(false);
				} else {
					txtC3P302A_4.setText(Util.getText(OMISION));

					if (Util.getInt(txtC3P302B_4) != OMISION	&& Util.getInt(txtC3P302C_4) != OMISION) {
						txtC3P302A_4.setText(Util.getText(total));
					}
				}				
			} else {
			//	Log.e("Los", "dos son vacios");
				txtC3P302A_4.setText("");
				txtC3P302A_4.setReadOnly(true);
			}
		}
	};
	
	private TextWatcher twFuncionBloqueo5 = new TextWatcher() {

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

			if (!Util.esVacio(txtC3P302B_5) || !Util.esVacio(txtC3P302C_5)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B_5) ? 0 : Util.getInt(txtC3P302B_5.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C_5) ? 0 : Util.getInt(txtC3P302C_5.getText().toString()));			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 

				if (Util.getInt(txtC3P302B_5) == OMISION && Util.getInt(txtC3P302C_5) == OMISION) {
					txtC3P302A_5.setReadOnly(false);
				} else {
					txtC3P302A_5.setText(Util.getText(OMISION));

					if (Util.getInt(txtC3P302B_5) != OMISION	&& Util.getInt(txtC3P302C_5) != OMISION) {
						txtC3P302A_5.setText(Util.getText(total));
					}
				}				
			} else {
			//	Log.e("Los", "dos son vacios");
				txtC3P302A_5.setText("");
				txtC3P302A_5.setReadOnly(true);
			}	
		}
	};
	
	private TextWatcher twFuncionBloqueo6 = new TextWatcher() {

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

			if (!Util.esVacio(txtC3P302B_6) || !Util.esVacio(txtC3P302C_6)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B_6) ? 0 : Util.getInt(txtC3P302B_6.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C_6) ? 0 : Util.getInt(txtC3P302C_6.getText().toString()));			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 

				if (Util.getInt(txtC3P302B_6) == OMISION && Util.getInt(txtC3P302C_6) == OMISION) {
					txtC3P302A_6.setReadOnly(false);
				} else {
					txtC3P302A_6.setText(Util.getText(OMISION));

					if (Util.getInt(txtC3P302B_6) != OMISION	&& Util.getInt(txtC3P302C_6) != OMISION) {
						txtC3P302A_6.setText(Util.getText(total));
					}
				}				
			} else {
			//	Log.e("Los", "dos son vacios");
				txtC3P302A_6.setText("");
				txtC3P302A_6.setReadOnly(true);
			}	
		}
	};
	
	private TextWatcher twFuncionBloqueo7 = new TextWatcher() {

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

			if (!Util.esVacio(txtC3P302B_7) || !Util.esVacio(txtC3P302C_7)) {
				Integer valor1 =   (Util.esVacio(txtC3P302B_7) ? 0 : Util.getInt(txtC3P302B_7.getText().toString())); 
				Integer valor2 =   (Util.esVacio(txtC3P302C_7) ? 0 : Util.getInt(txtC3P302C_7.getText().toString()));			
				
				int total = Util.getInt(valor1) + Util.getInt(valor2); 

				if (Util.getInt(txtC3P302B_7) == OMISION && Util.getInt(txtC3P302C_7) == OMISION) {
					txtC3P302A_7.setReadOnly(false);
				} else {
					txtC3P302A_7.setText(Util.getText(OMISION));

					if (Util.getInt(txtC3P302B_7) != OMISION	&& Util.getInt(txtC3P302C_7) != OMISION) {
						txtC3P302A_7.setText(Util.getText(total));
					}
				}				
			} else {
			//	Log.e("Los", "dos son vacios");
				txtC3P302A_7.setText("");
				txtC3P302A_7.setReadOnly(true);
			}	
		}
	};
	
	
	private TextWatcher twFuncionBloqueo8A = new TextWatcher() {

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
			
			int total;
		//	if (!Util.esVacio(txtC3P302A_1) || !Util.esVacio(txtC3P302A_1)) {
				Integer valor1 =   Util.getInt(txtC3P302A_1) ; 
				Integer valor2 =   Util.getInt(txtC3P302A_2) ;
				Integer valor3 =   Util.getInt(txtC3P302A_3) ;
				Integer valor4 =   Util.getInt(txtC3P302A_4) ;
				Integer valor5 =   Util.getInt(txtC3P302A_5) ;
				Integer valor6 =   Util.getInt(txtC3P302A_6) ;
				Integer valor7 =   Util.getInt(txtC3P302A_7) ;		
				
				if (valor1 == OMISION || valor2 == OMISION || valor3 == OMISION|| valor4 == OMISION|| valor5 == OMISION || valor6 == OMISION || valor7 == OMISION ) {
					total = OMISION;
				}else{
					total = Util.getInt(valor1) + Util.getInt(valor2)
							+ Util.getInt(valor3) + Util.getInt(valor4)
							+ Util.getInt(valor5) + Util.getInt(valor6)
							+ Util.getInt(valor7); 		
				}			
					
				txtC3P302A_8.setText(Util.getText(Util.getInt(total) ));	
		//	}
		}
	};
	
	
	private TextWatcher twFuncionBloqueo8B = new TextWatcher() {

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
			
			int totBl;
		//	if (!Util.esVacio(txtC3P302B_1) || !Util.esVacio(txtC3P302B_1)) {
				Integer vBlor1 =   Util.getInt(txtC3P302B_1) ; 
				Integer vBlor2 =   Util.getInt(txtC3P302B_2) ;
				Integer vBlor3 =   Util.getInt(txtC3P302B_3) ;
				Integer vBlor4 =   Util.getInt(txtC3P302B_4) ;
				Integer vBlor5 =   Util.getInt(txtC3P302B_5) ;
				Integer vBlor6 =   Util.getInt(txtC3P302B_6) ;
				Integer vBlor7 =   Util.getInt(txtC3P302B_7) ;		
					
				if (vBlor1 == OMISION || vBlor2 == OMISION || vBlor3 == OMISION|| vBlor4 == OMISION|| vBlor5 == OMISION || vBlor6 == OMISION || vBlor7 == OMISION ) {
					totBl = OMISION;
				}else{
					totBl = Util.getInt(vBlor1) + Util.getInt(vBlor2)
							+ Util.getInt(vBlor3) + Util.getInt(vBlor4)
							+ Util.getInt(vBlor5) + Util.getInt(vBlor6)
							+ Util.getInt(vBlor7); 			
				}			
					
				txtC3P302B_8.setText(Util.getText(Util.getInt(totBl) ));	
		//	}
		}
	};
	
	
	private TextWatcher twFuncionBloqueo8C = new TextWatcher() {

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
			
			
			int total;
		//	if (!Util.esVacio(txtC3P302C_1) || !Util.esVacio(txtC3P302C_1)) {
				Integer valor1 =   Util.getInt(txtC3P302C_1) ; 
				Integer valor2 =   Util.getInt(txtC3P302C_2) ;
				Integer valor3 =   Util.getInt(txtC3P302C_3) ;
				Integer valor4 =   Util.getInt(txtC3P302C_4) ;
				Integer valor5 =   Util.getInt(txtC3P302C_5) ;
				Integer valor6 =   Util.getInt(txtC3P302C_6) ;
				Integer valor7 =   Util.getInt(txtC3P302C_7) ;		
					
				
				if (valor1 == OMISION || valor2 == OMISION || valor3 == OMISION|| valor4 == OMISION|| valor5 == OMISION || valor6 == OMISION || valor7 == OMISION ) {
					total = OMISION;
				}else{
					 total = Util.getInt(valor1) + Util.getInt(valor2)
							+ Util.getInt(valor3) + Util.getInt(valor4)
							+ Util.getInt(valor5) + Util.getInt(valor6)
							+ Util.getInt(valor7); 	
				}						
					
				txtC3P302C_8.setText(Util.getText(Util.getInt(total) ));	
		//	}
		}
	};
	
	
	private void setCalculo() {
		Calculo<IntegerField> op1 = new Calculo<IntegerField>(this,
				txtC3P303_T, 0, 0, Util.getListList(txtC3P303_A_1,
						txtC3P303_A_2, txtC3P303_A_3));
		op1.setConfOperacion();
//		op1.setCallback("onResult");
	}
	

	public void onResult(Integer result) {
		Integer resp = Util.getInt(txtC3P302B_1) + Util.getInt(txtC3P302C_1) ;
		
//		Log.e ("result xx ", result + "");
//		Log.e ("resp", resp + "");
		txtC3P302A_1.setText(result == null ? "0" : String.valueOf(resp));
	}
	@Override
	public void onCancel() {
//		if (action == ACTION.EJECUTAR_VER1) {
//			return;
//		}	
	}
	@Override
	public void onAccept() {
		// TODO Auto-generated method stub
		if (action == ACTION.EJECUTAR_VER1) avance1 = true;
		else if (action == ACTION.EJECUTAR_VER2) avance2 = true;
    	else if (action == ACTION.EJECUTAR_VER3) avance3 = true;
		else if (action == ACTION.EJECUTAR_VER4) avance4 = true;
		else if (action == ACTION.EJECUTAR_VER5) avance5 = true;
		else if (action == ACTION.EJECUTAR_VER6) avance6 = true;
		

	}

}

package gob.inei.ene2019v2.fragment.ModIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.ImageComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.IDetailEntityComponent;
import gob.inei.dnce.util.Calculo;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_001_.DETALLES;
import gob.inei.ene2019v2.fragment.ModIII.dialog.Mod_III_Fragment_02_det;
import gob.inei.ene2019v2.model.ModuloIII_det;
import gob.inei.ene2019v2.model.ModuloIII_det2;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

@SuppressLint("ResourceAsColor") public class Mod_III_Fragment_002 extends FragmentForm {
	
	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC3P302A_A1; // Nuevo Ini c3p302a_a1
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC3P302A_A2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC3P302A_A3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC3P302A_A4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC3P302A_A5;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC3P302A_A6;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtC3P302A_A6ESP;// Nuevo fin

	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC3P303;
	
//	@FieldAnnotation(orderIndex = 9)
//	public RadioGroupOtherField rgC3P303_2;
//	@FieldAnnotation(orderIndex = 10)
//	public RadioGroupOtherField rgC3P303_3;
	
	@FieldAnnotation(orderIndex = 9)
	public IntegerField txtC3P303_A_1;
	@FieldAnnotation(orderIndex = 10)
	public IntegerField txtC3P303_A_2;
	@FieldAnnotation(orderIndex = 11)
	public IntegerField txtC3P303_A_3;
	@FieldAnnotation(orderIndex = 12)
	public IntegerField txtC3P303_T;	
	
	
	public TableComponent tcCAP1_1;
	private List<DETALLES> lstData;
	private List<ModuloIII_det2> lstDetalle;
	private List<ModuloIII_det> lstDetalle301;
	private List<String> data = new ArrayList<String>();
	private static int OMISION = 99999;	
	public GridComponent grid2;

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
	private LabelComponent lblTitulo, lblTitulo1,lblSubTitulo3, lblCab1, lblCab2, lblCab3,
			lblNiv1, lblNiv2, lblNiv3, lblNiv4, lblNiv5, lblNiv6, lblNiv7,
			lblNiv8, lblFile1, lblFile2, lblFile3, lblFile4, lblFile5,
			lblFile6, lblFile7, lblFile8, lblmod3_1, lblmod4_1, lblmod4_2,
			lblmod4_3, lblTotal, lblHombrs, lblMujeres, lblTitulop, lblTitulot,
			lblTituloh, lblTitulom, lblTitulota, lblTituloha, lblTituloma;
	private GridComponent2 grP301, grEspe, grP303, grP304;
	private GridComponent grP302, grP302A;
	LinearLayout q0, q1, q2, q3, q4, q5;
	P3_1ClickListener adapter;
	
	SeccionCapitulo[] campos,campos301;

	//////////////////////////////////////////
	int valortotal1 = 0, valorhombre1 = 0, valormujer1 = 0;
	int valortotal2 = 0, valorhombre2 = 0, valormujer2 = 0;
	int valortotal3 = 0, valorhombre3 = 0, valormujer3 = 0;
	int valortotal4 = 0, valorhombre4 = 0, valormujer4 = 0;
	int valortotal5 = 0, valorhombre5 = 0, valormujer5 = 0;

	int valortotal7 = 0, valorhombre7 = 0, valormujer7 = 0;
	int valortotal8 = 0, valorhombre8 = 0, valormujer8 = 0;
	int valortotal9 = 0, valorhombre9 = 0, valormujer9 = 0;
	int valortotal10 = 0, valorhombre10 = 0, valormujer10 = 0;
	int valortotal11 = 0, valorhombre11 = 0, valormujer11 = 0;

	int valortotal14 = 0, valorhombre14 = 0, valormujer14 = 0;

	int total01_05 = 0, total01_05h = 0, total01_05m = 0;

	int total07_11 = 0, total07_11h = 0, total07_11m = 0;

	int total06_12 = 0, total06_12h = 0, total06_12m = 0;
	//////////////////////////////////////////
	

	Integer p301_05 = 0;
	Integer p301_05m = 0;
	Integer p301_12 = 0;
	Integer p301_13 = 0;
	Integer p301_12h = 0;
	Integer p301_12m = 0;
	Integer p301_13h = 0;
	Integer p301_13m = 0;
	public Boolean flag1 = false ;
	

	public Mod_III_Fragment_002() {
	}

	public Mod_III_Fragment_002 parent(MasterActivity parent) {
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
	
	//	confSumatorias();
		enlazarCajas();
		listening();
		adapter = new P3_1ClickListener();
		tcCAP1_1.getListView().setOnItemClickListener(adapter);
		setCalculo();
		campos = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C3P302_ID", "C3P302_ID_ETIQ", "C3P302", "C3P302A",  "C3P302B",
				"C3P302C") };
		
		campos301 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C3P301_ID", "C3P301_ID_ETIQ", "C3P301A", "C3P301A_1",
				"C3P301A_2", "C3P301A_TOT", "C3P301E_1") };
		return rootView;
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
	
		tcCAP1_1 = new TableComponent(getActivity(),  this,App.ESTILO, true).size(640, 740);
		tcCAP1_1.addHeader(R.string.c1c302_1, 2.4f,TableComponent.ALIGN.LEFT);
		tcCAP1_1.addHeader(R.string.c1c302_3, 0.38f,CheckBoxField.class);
//		tcCAP1_1.addHeader(R.string.c1c302_4, 1f);
//		tcCAP1_1.addHeader(R.string.c1c302_5, 1f);
//		tcCAP1_1.addHeader(R.string.c1c302_6, 1f);
		tcCAP1_1.addCallback(2, "tcFuncionRegantes");
		tcCAP1_1.addCallback(3, "tcFuncionRegantes");
//		tcCAP1_1.addCallback(2, "tcFuncionRegantes");
//		tcCAP1_1.addCallback(3, "tcFuncionRegantes");
//		tcCAP1_1.addCallback(4, "tcFuncionRegantes");
		tcCAP1_1.setHeaderHeight(altoComponente + 32);
		tcCAP1_1.setDataColumHeight(altoComponente + 10);
		
		grid2 = new GridComponent(this.getActivity(), Gravity.CENTER, 1);
		grid2.addComponent(tcCAP1_1.getTableView());
		grid2.colorFondo(R.color.transparent);
		grid2.component();
		

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
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);

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
				App.ESTILO).size(altoComponente, 250).text("303A. En el a�o 2018, �en promedio cu�ntas horas de trabajo fueron en:")
				.textSize(15).negrita().centrar();
		
		LabelComponent lbltotalxx = new LabelComponent(this.getActivity(),
				App.ESTILO).size(altoComponente, 250).text("Total")
				.textSize(15).negrita().centrar();

		
		
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


		grEspe = new GridComponent2(this.getActivity(), 2);
		grEspe.addComponent(chbC3P302A_A6);
		grEspe.addComponent(txtC3P302A_A6ESP);
		grEspe.colorFondo(R.color.transparent);

//		grP303 = new GridComponent2(this.getActivity(),
//				Gravity.CENTER_VERTICAL, 3);
//		grP303.addComponent(lblvacio);
//		grP303.addComponent(lblsino);
//		grP303.addComponent(lblc);
//		grP303.addComponent(lblp303_1);
//		grP303.addComponent(rgC3P303_1);
//		grP303.addComponent(txtC3P303_A_1);
//		grP303.addComponent(lblp303_2);
//		grP303.addComponent(rgC3P303_2);
//		grP303.addComponent(txtC3P303_A_2);
//		grP303.addComponent(lblp303_3);
//		grP303.addComponent(rgC3P303_3);
//		grP303.addComponent(txtC3P303_A_3);
//		grP303.addComponent(lbltotalxx,2);
//		grP303.addComponent(txtC3P303_T);

		// grP304 = new GridComponent2(this.getActivity(),
		// Gravity.CENTER_VERTICAL, 5);
		// grP304.addComponent(lblmod4_1);
		// grP304.addComponent(new LabelComponent(this.getActivity()).size(
		// altoComponente + 10, 20));
		// grP304.addComponent(lblmod4_2);
		// grP304.addComponent(new LabelComponent(this.getActivity()).size(
		// altoComponente + 10, 20));
		// grP304.addComponent(lblmod4_3);
		// grP304.addComponent(txtC3P303_A_1);
		// grP304.addComponent(new LabelComponent(this.getActivity()).size(
		// altoComponente + 10, 20));
		// grP304.addComponent(txtC3P303_A_2);
		// grP304.addComponent(new LabelComponent(this.getActivity()).size(
		// altoComponente + 10, 20));
		// grP304.addComponent(txtC3P303_A_3);
		// grP304.addComponent(new LabelComponent(this.getActivity())
		// .size(altoComponente + 10, 150).text(R.string.c1c100m3p004_123)
		// .textSize(13));
		// grP304.addComponent(new LabelComponent(this.getActivity()).size(
		// altoComponente + 10, 20));
		// grP304.addComponent(new LabelComponent(this.getActivity())
		// .size(altoComponente + 10, 150).text(R.string.c1c100m3p004_123)
		// .textSize(13));
		// grP304.addComponent(new LabelComponent(this.getActivity()).size(
		// altoComponente + 10, 20));
		// grP304.addComponent(new LabelComponent(this.getActivity())
		// .size(altoComponente + 10, 150).text(R.string.c1c100m3p004_123)
		// .textSize(13));
		// grP304.colorFondo(R.color.WhiteSmoke);
	
		
		Filtros.setFiltro(txtC3P303_A_1, Filtros.TIPO.NUMBER, 2, -1, null, 1, 24);
		Filtros.setFiltro(txtC3P303_A_2, Filtros.TIPO.NUMBER, 2, -1, null, 1, 24);
		Filtros.setFiltro(txtC3P303_A_3, Filtros.TIPO.NUMBER, 1, -1, null, 1, 24);


	}

	
	@SuppressLint("ResourceAsColor")
	public void tcFuncionRegantes(Object entity, Integer row, Integer opcion)
			throws SQLException {
		if (entity != null) {
			DETALLES tmp = lstData.get(row);
			Log.e ("opcion" , opcion + "");

			if (!Util.esDiferente(opcion, 1)) {
				tmp.detalle.c3p302 = opcion;
				// tmp.detalle.p102_2 = tmp.nombre;
				getCuestionarioService().saveOrUpdate(tmp.detalle, campos);
				refrescarTabla();
			} else {
				// dismissDialog(row);
				tmp.detalle.c3p302 = opcion;
				tmp.detalle.c3p302a = null;
				tmp.detalle.c3p302b = null;				
				tmp.detalle.c3p302c = null;
				// tmp.detalle.p102_2 = tmp.nombre;
				getCuestionarioService().saveOrUpdate(tmp.detalle, campos);
				refrescarTabla();
				// se graba el check cuando se marca NO::
//				seccionesGrabadoCheck = new SeccionCapitulo[] { new SeccionCapitulo(
//						-1, -1, -1, "DDOC_04_001_INI19", "DDOC_04_002_INI19") };
//				
//				getCuestionarioService().saveOrUpdate(bean,	seccionesGrabadoCheck);

			}
		}
	}

		
	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(lblSubTitulo3);
		q2 = createQuestionSection(R.string.c1c100m3p002a, grid2);
		q3 = createQuestionSection(R.string.c1c100m3p302a, chbC3P302A_A1,
				chbC3P302A_A2, chbC3P302A_A3, chbC3P302A_A4, chbC3P302A_A5,
				grEspe.component());
		q4 = createQuestionSection(R.string.c1c100m3p003,rgC3P303 );

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

//			if (Util.esVacio(bean.c3p302b_1))
//				bean.c3p302b_1 = 0;
//			if (Util.esVacio(bean.c3p302b_2))
//				bean.c3p302b_2 = 0;
//			if (Util.esVacio(bean.c3p302b_3))
//				bean.c3p302b_3 = 0;
//			if (Util.esVacio(bean.c3p302b_4))
//				bean.c3p302b_4 = 0;
//			if (Util.esVacio(bean.c3p302b_5))
//				bean.c3p302b_5 = 0;
//			if (Util.esVacio(bean.c3p302b_6))
//				bean.c3p302b_6 = 0;
//			if (Util.esVacio(bean.c3p302b_7))
//				bean.c3p302b_7 = 0;
//			if (Util.esVacio(bean.c3p302b_8))
//				bean.c3p302b_8 = 0;
//
//			if (Util.esVacio(bean.c3p302c_1))
//				bean.c3p302c_1 = 0;
//			if (Util.esVacio(bean.c3p302c_2))
//				bean.c3p302c_2 = 0;
//			if (Util.esVacio(bean.c3p302c_3))
//				bean.c3p302c_3 = 0;
//			if (Util.esVacio(bean.c3p302c_4))
//				bean.c3p302c_4 = 0;
//			if (Util.esVacio(bean.c3p302c_5))
//				bean.c3p302c_5 = 0;
//			if (Util.esVacio(bean.c3p302c_6))
//				bean.c3p302c_6 = 0;
//			if (Util.esVacio(bean.c3p302c_7))
//				bean.c3p302c_7 = 0;
//			if (Util.esVacio(bean.c3p302c_8))
//				bean.c3p302c_8 = 0;

			
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
		
		int valor1 = 0;

		for (int x = 0; x < lstData.size(); x++) {
	//		if (!Util.esDiferente(lstData.get(x).detalle.c3p301_id, 1, 2, 3, 4,	5, 6)) {
//				if (Util.esVacio(lstData.get(x).detalle.c3p302)) {
//					ToastMessage.msgBox(this.getActivity(),
//							"�Ingresar Informaci�n Correspondiente a la Pregunta:�"
//									+ "\n" + lstData.get(x).nombre,
//							ToastMessage.MESSAGE_INFO,
//							ToastMessage.DURATION_LONG);
//					view = tcCAP1_1;
//					error = true;
//					return false;
//				}
				if (!Util.esDiferente(lstData.get(x).detalle.c3p302, 1)) {
					if (Util.esVacio(lstData.get(x).detalle.c3p302b)) {
						ToastMessage.msgBox(this.getActivity(),
								"Ingresar Informaci�n en el Item : "    
										+ "\n"  +  lstData.get(x).codigo  + " - " + lstData.get(x).nombre,
								ToastMessage.MESSAGE_INFO,
								ToastMessage.DURATION_LONG);
						view = tcCAP1_1;
						error = true;
						return false;
					}
				}

				if (Util.esDiferente(lstData.get(x).detalle.c3p302, 1)) {
					valor1++;
				}

	//		}
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
			
		
		Log.e ("bean.c3p302a_8", bean.c3p302a_8 +"");
		Log.e ("bean.c3p302_omi", bean.c3p302_omi +"");
		
		
		int Total = Util.getInt(bean.c3p301 );
		//2310
	//	int Total302 = Integer.parseInt(txtC3P302A_8.getText().toString());
	//	int Total302H = Integer.parseInt(txtC3P302B_8.getText().toString());
	//	int Total302M = Integer.parseInt(txtC3P302C_8.getText().toString());
		int SumGeneA = p301_12 + p301_13;
		int SumGeneB = p301_12h + p301_13h;
		int SumGeneC = p301_12m + p301_13m;
		
		if (Util.getInt(bean.c3p302_omi )==1){					

			//2310			
//			if ( Util.getInt(Total) != Total302) {
//				mensaje = "Error: N�mero de personas que laboran en la empresa debe coincidir a la suma de trabajadores por NIVEL EDUCATIVO";
//				view = txtC3P302A_8;
//				return !(error = true);
//			}		
		}		
		
		//2310
//		if (Util.getInt(bean.c3p301_omi )==1  &&  Util.getInt(bean.c3p302_omi )==1){			
//			if ( Util.getInt(Total302) != SumGeneA) {
//				mensaje = "Error: No concuerda total de trabajadores seg�n categor�a ocupacional con total de trabajadores seg�n nivel  educativo";
//				view = txtC3P302A_8;
//				return !(error = true);	
//			}	
//			
////			if ( Util.getInt(Total302) != SumGeneA) {
////				ToastMessage.msgBox(this.getActivity(),
////						"VERIFICAR: No concuerda total de trabajadores P301 Y P302",
////						ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
////			}	
//			
//			if ( Util.getInt(Total302M) != SumGeneC) {
//				mensaje = "Error: No concuerda total de trabajadores (Mujeres) seg�n categor�a ocupacional con total de trabajadores (Mujeres) seg�n nivel educativo";
//				view = txtC3P302B_8;
//				return !(error = true);	
//			}	
//			
//			if ( Util.getInt(Total302H) != SumGeneB) {
//				mensaje = "Error: No concuerda total de trabajadores (Hombres) seg�n categor�a ocupacional con total de trabajadores (Hombres) seg�n nivel educativo";
//				view = txtC3P302C_8;
//				return !(error = true);	
//			}	
//		}
				
				
		
		if (Util.esVacio(rgC3P303)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P303-1");
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
		
		
		int x1, x2, x3;
		 x1 = Integer.parseInt(txtC3P303_A_1.getText().toString());
		 x2 = Integer.parseInt(txtC3P303_A_2.getText().toString());
		 x3 = Integer.parseInt(txtC3P303_A_3.getText().toString());
		 int suma = 0;
		suma = x1 + x2 + x3;
		 
		if (suma<1 ){
			mensaje = "Error: Debe seleccionar algun turno";
			view = txtC3P303_A_1;
			return !(error = true);
		}
		Log.e ("suma" , "sss" +"");		
		Log.e ("suma" , suma +"");
		
		
		if (Util.esVacio(rgC3P303)
				/*(rgC3P303.isTagSelected(2) /*&& rgC3P303_2.isTagSelected(2) && rgC3P303_3.isTagSelected(2))*/) {
			mensaje = "Error: Debe tener al menos un turno de trabajo";
			view = rgC3P303;
			error = true;
			return false;
		}
				
	
	
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
		

	
		
//		if (Util.getInt(bean.c3p302a_8) == OMISION){
//			bean.c3p302_omi = 9;
//		}else{
//			bean.c3p302_omi = 1;
//		}
		



		// Log.e ("", Total + "");
		// Log.e ("Util.getInt(bean.c3p302_t2)", Util.getInt(bean.c3p302_t2) +
		// "");
		// Log.e ("Util.getInt(bean.c3p302b1)", Util.getInt(bean.c3p302b1) +
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

	private class P3_1ClickListener implements OnItemClickListener {

		public P3_1ClickListener() {
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// C2_Cap02_04_det c = (C2_Cap02_04_det) lstDetalle.get(arg2);
			DETALLES c = (DETALLES) lstData.get(arg2);
			
		
			if ( Util.esDiferente(c.detalle.c3p302, 1) ) {
			//	return;
			}
			Log.e ("detalle.arg2" ,arg2+"");
			Log.e ("detalle.c3p302" , c.detalle.c3p302 +"");
			//Log.e ("el arg2" , arg2 +"");
			abrirDetalle(arg2);
		}
	}

	private void abrirDetalle(int index) {
		FragmentManager fm = getFragmentManager();
		Mod_III_Fragment_02_det aperturaDialog = Mod_III_Fragment_02_det
				.newInstance(this, (DETALLES) lstData.get(index), index,bean);
		aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		aperturaDialog.show(fm, "aperturaDialog");
	}

	
	@Override
	public void cargarDatos() {
	
		bean = getCuestionarioService().getModuloiii01(
				App.getInstance().getEmpresa(),
				new Moduloiii01().getSecCap(getListFields(this , new String[] {
						"C3P301" , "C3P301_OMI", "C3P302_OMI" })));
		
		if (bean == null) {
			bean = new Moduloiii01();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		
		lstDetalle = getCuestionarioService().getModuloIII_det2(
				bean, campos);		
		lstDetalle301 = getCuestionarioService().getModuloIII_det(bean, campos301);
		
		// carga array
		data = Arrays.asList(getResources().getStringArray(
				R.array.c1c302trabajadores_item));

		lstData = new ArrayList<Mod_III_Fragment_002.DETALLES>();

		List<DETALLES> lste = new ArrayList<DETALLES>();
		boolean flag = false;
		for (int x = 0, i = 0; x < data.size() && i < 7; i++, x++) {
			if (lstDetalle != null && lstDetalle.size() > 0) {
				flag = false;
				for (ModuloIII_det2 ac : lstDetalle) {
					if (Util.getInt(ac.c3p302_id_etiq, 0) == x + 1) {
						lste.add(new DETALLES(i + 1, x + 1, data.get(x), ac));
						flag = true;
						break;
					}
				}
				if (!flag) {
					lste.add(new DETALLES(i + 1, x + 1, data.get(x),
							new ModuloIII_det2(
									App.getInstance().getEmpresa().id,
									 i + 1, x + 1)));
				}
			} else {
				lste.add(new DETALLES(i + 1, x + 1, data.get(x),
						new ModuloIII_det2(App.getInstance().getEmpresa().id,
								 i + 1, x + 1)));
			}
		}
		lstData.addAll(lste);
		
		
		inicio();
		refrescarTabla();
	}

	private void inicio() {
	
		
//		if (Util.getInt(txtC3P302B_2) == OMISION	&& Util.getInt(txtC3P302C_2) == OMISION) {
//			txtC3P302A_1.setText(Util.getText(valora));
//		}
		
		// int total301 = Util.getInt(bean.c3p302_t2) +
		// Util.getInt(bean.c3p302b1);
		// int total301h = Util.getInt(bean.c3p301b_t2) +
		// Util.getInt(bean.c3p301b_11);
		// int total301m = Util.getInt(bean.c3p301c_t2) +
		// Util.getInt(bean.c3p301c_11);
		// lblTitulota.setText(Util.getText(total301));
		// lblTituloha.setText(Util.getText(total301h));
		// lblTituloma.setText(Util.getText(total301m));
		FuncionRGP303();
		FuncionCheck();
				

		for (int x = 0; x < lstDetalle301.size(); x++) {
			p301_05 = Util.getInt(lstDetalle301.get(5).c3p301a_tot);
			p301_05m = Util.getInt(lstDetalle301.get(5).c3p301a_2);
			p301_12 = Util.getInt(lstDetalle301.get(12).c3p301a_tot);
			p301_13 = Util.getInt(lstDetalle301.get(13).c3p301a_tot);
			
			
			p301_12h = Util.getInt(lstDetalle301.get(12).c3p301a_1);
			p301_12m = Util.getInt(lstDetalle301.get(12).c3p301a_2);
			p301_13h = Util.getInt(lstDetalle301.get(13).c3p301a_1);
			p301_13m = Util.getInt(lstDetalle301.get(13).c3p301a_2);			
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
	

	}
	
	
	public void reloadData() {
		tcCAP1_1.reloadData();
		// setBorder();
	}

	public void refrescarTabla() {
		tcCAP1_1.setData(lstData, "getNombre", "getOpcion"  /*, "geta", "getb", "getc"  */ );
//		setBorder();
		registerForContextMenu(tcCAP1_1.getListView());
	}
	
	
	private void setBorder() {
		for (int x = 0; x < lstData.size(); x++) {
			DETALLES detalles = lstData.get(x);
			// if (!Util.esDiferente(detalles.orden, 1, 2, 5, 8, 9, 11)) {
			// if (!Util.esDiferente(detalles.orden, 1, 2, 5, 8, 9,10, 11)) {
	//		Log.e("bb", x + " - " +   lstData.get(x).detalle.c3p302 + "");
	//		Log.e("cc", x + " - " +   lstData.get(x).detalle.c3p302b + "");
		//	Log.e("cc", lstData.get(x).detalle.c3p302b + "");
			
			if (!Util.esDiferente(lstData.get(x).detalle.c3p302, 1)
					&& !Util.esVacio(lstData.get(x).detalle.c3p302b)) {
				tcCAP1_1.setBorderRow(x);
			} else if (!Util.esDiferente(lstData.get(x).detalle.c3p302, 1)
					&& Util.esVacio(lstData.get(x).detalle.c3p302b)) {
				tcCAP1_1.setBorderRow(x, false);
			} else if (Util.esDiferente(lstData.get(x).detalle.c3p302, 1)){
				tcCAP1_1.setBorderRow(x, false);
			}
					
		}
	}
	
	public class DETALLES extends Entity implements IDetailEntityComponent {
		private static final long serialVersionUID = 1L;
		public int codigo;
		public int orden;
		public String nombre;
		public ModuloIII_det2 detalle;

		public DETALLES() {
			// TODO Auto-generated constructor stub
		}

		public DETALLES(Integer codigo, Integer orden, String nombre,
				ModuloIII_det2 detalle) {
			this.codigo = codigo;
			this.orden = orden;
			this.nombre = nombre;
			this.detalle = detalle;
		}

		public DETALLES(Integer orden, String nombre, ModuloIII_det2 detalle) {
			this.orden = orden;
			this.nombre = nombre;
			this.detalle = detalle;
		}

		public String getNombre() {
			return nombre == null ? "" : nombre;
		}
		
		public String geta() {
			return (detalle.c3p302a == null ? "0" : String.valueOf(detalle.c3p302a));
		}
		
		public String getb() {
			return (detalle.c3p302b == null ? "0" : String.valueOf(detalle.c3p302b));
		}
		
		public String getc() {
			return (detalle.c3p302c == null ? "0" : String.valueOf(detalle.c3p302c));
		}

		
		
		@Override
		public boolean isTitle() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void cleanEntity() {
			detalle.c3p302 = null;
			detalle.c3p302b = null;
			detalle.c3p302c = null;
			detalle.c3p302a = null;
		}
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
//		
//		if (valor2 == 1){
//			Util.lockView(getActivity(), false, txtC3P303_A_2);
//			txtC3P303_A_2.requestFocus();
//		}else{
//			Util.cleanAndLockView(getActivity(),txtC3P303_A_2);
//			txtC3P303_A_3.requestFocus();
//		}
//		
//		if (valor3 == 1){
//			Util.lockView(getActivity(), false, txtC3P303_A_3);
//			txtC3P303_A_3.requestFocus();
//		}else{
//			Util.cleanAndLockView(getActivity(),txtC3P303_A_3);
//		}

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

	
	
	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	

	private void setCalculo() {
		Calculo<IntegerField> op1 = new Calculo<IntegerField>(this,
				txtC3P303_T, 0, 0, Util.getListList(txtC3P303_A_1,
						txtC3P303_A_2, txtC3P303_A_3));
		op1.setConfOperacion();
//		op1.setCallback("onResult");
	}
	



}
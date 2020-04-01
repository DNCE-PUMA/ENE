package gob.inei.ene2019v2.fragment.ModIX;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Calculo;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloix;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IX_Fragment_005 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public IntegerField txtC9P905_1;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC9P905_2;
	@FieldAnnotation(orderIndex = 3)
	public IntegerField txtC9P905_3;
	@FieldAnnotation(orderIndex = 4)
	public IntegerField txtC9P905_4;
	@FieldAnnotation(orderIndex = 5)
	public IntegerField txtC9P905_5;
	@FieldAnnotation(orderIndex = 6)
	public IntegerField txtC9P905_6;
	@FieldAnnotation(orderIndex = 7)
	public IntegerField txtC9P905_7;
	@FieldAnnotation(orderIndex = 8)
	public IntegerField txtC9P905_8;
	@FieldAnnotation(orderIndex = 9)
	public IntegerField txtC9P905_9;
	@FieldAnnotation(orderIndex = 10)
	public IntegerField txtC9P905_10;
	@FieldAnnotation(orderIndex = 11)
	public IntegerField txtC9P905_11;
	@FieldAnnotation(orderIndex = 12)
	public IntegerField txtC9P905_12;
	@FieldAnnotation(orderIndex = 13)
	public IntegerField txtC9P905_13;
	@FieldAnnotation(orderIndex = 14)
	public IntegerField txtC9P905_14;
	@FieldAnnotation(orderIndex = 15)
	public IntegerField txtC9P905_15;
	@FieldAnnotation(orderIndex = 16)
	public IntegerField txtC9P905_16;
	@FieldAnnotation(orderIndex = 17)
	public IntegerField txtC9P905_17;
	@FieldAnnotation(orderIndex = 18)
	public IntegerField txtC9P905_18;
	@FieldAnnotation(orderIndex = 19)
	public IntegerField txtC9P905_19;
	@FieldAnnotation(orderIndex = 20)
	public IntegerField txtC9P905_20;
	@FieldAnnotation(orderIndex = 21)
	public IntegerField txtC9P905_21;
	@FieldAnnotation(orderIndex = 22)
	public IntegerField txtC9P905_22;
	@FieldAnnotation(orderIndex = 23)
	public IntegerField txtC9P905_23;
	@FieldAnnotation(orderIndex = 24)
	public IntegerField txtC9P905_24;
	@FieldAnnotation(orderIndex = 25)
	public IntegerField txtC9P905_25;
	@FieldAnnotation(orderIndex = 26)
	public IntegerField txtC9P905_26;
	@FieldAnnotation(orderIndex = 27)
	public IntegerField txtC9P905_27;
	
	private CuestionarioService cuestionarioService;
	private Moduloix bean;
	private LabelComponent lblTitulo;
	private GridComponent2 grd1;
	LinearLayout q0, q1, q2, q3, q4, q5;
	private Moduloiii01 bean1;

	public Mod_IX_Fragment_005() {
	}

	public Mod_IX_Fragment_005 parent(MasterActivity parent) {
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
		confSumatorias();
		enlazarCajas();
		listening();

		return rootView;
	}

	private void confSumatorias() {
		Calculo<IntegerField> op1 = new Calculo<IntegerField>(this,
				txtC9P905_2, 0, 0, Util.getListList(txtC9P905_3, txtC9P905_4,
						txtC9P905_5, txtC9P905_6, txtC9P905_7, txtC9P905_8));
		op1.setConfOperacion(false, true);
		Calculo<IntegerField> op2 = new Calculo<IntegerField>(this,
				txtC9P905_9, 0, 0, Util.getListList(txtC9P905_10, txtC9P905_11,
						txtC9P905_12, txtC9P905_13, txtC9P905_14, txtC9P905_15,
						txtC9P905_17, txtC9P905_18, txtC9P905_19));
		op2.setConfOperacion(false, true);
		Calculo<IntegerField> op3 = new Calculo<IntegerField>(this,
				txtC9P905_21, 0, 0, Util.getListList(txtC9P905_22,
						txtC9P905_23, txtC9P905_24, txtC9P905_25));
		op3.setConfOperacion(false, true);
		
		Calculo<IntegerField> op4 = new Calculo<IntegerField>(this,
				txtC9P905_27, 0, 0, Util.getListList(txtC9P905_1,txtC9P905_2,
						txtC9P905_9, txtC9P905_20,txtC9P905_21, txtC9P905_26));
		op4.setConfOperacion(false, true);

	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.Capitulo900).textSize(21).centrar().negrita();
		txtC9P905_1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().readOnly().negrita();
		txtC9P905_3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_4 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_5 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_6 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_7 = new IntegerField(this.getActivity(), false).size(
				altoComponente +20, 150).centrar();
		txtC9P905_8 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_9 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().readOnly().negrita();
		txtC9P905_10 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_11 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_12 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_13 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_14 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_15 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_16 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_17 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_18 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_19 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_20 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_21 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().readOnly().negrita();
		txtC9P905_22 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_23 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_24 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_25 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		txtC9P905_26 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
	
		txtC9P905_27 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).centrar();
		

		LabelComponent lblt1 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p005_cab1).size(altoComponente+90, 120)
				.centrar();
		LabelComponent lblt2 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p005_cab2).size(altoComponente+90, 400)
				.centrar();
		LabelComponent lblt3 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p005_cab3).size(altoComponente+90, 80)
				.centrar();
		LabelComponent lblt4 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p005_cab4).size(altoComponente+90, 150)
				.centrar();

		grd1 = new GridComponent2(this.getActivity(), 4);
		grd1.addComponent(lblt1);
		grd1.addComponent(lblt2);
		grd1.addComponent(lblt3);
		grd1.addComponent(lblt4);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c1).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_1).size(altoComponente + 40, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n1).centrar());
		grd1.addComponent(txtC9P905_1);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c2).centrar());
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_2)
				.size(altoComponente, 120).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n2).centrar());
		grd1.addComponent(txtC9P905_2);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c3).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_3).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n3).centrar());
		grd1.addComponent(txtC9P905_3);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c4).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_4).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n4).centrar());
		grd1.addComponent(txtC9P905_4);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c5).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_5).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n5).centrar());
		grd1.addComponent(txtC9P905_5);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c6).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_6).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n6).centrar());
		grd1.addComponent(txtC9P905_6);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c7).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_7).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n7).centrar());
		grd1.addComponent(txtC9P905_7);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c8).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_8).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n8).centrar());
		grd1.addComponent(txtC9P905_8);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c9).centrar());
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_9)
				.size(altoComponente + 15, 120).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n9).centrar());
		grd1.addComponent(txtC9P905_9);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c10).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_10).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n10).centrar());
		grd1.addComponent(txtC9P905_10);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c11).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_11).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n11).centrar());
		grd1.addComponent(txtC9P905_11);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c12).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_12).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n12).centrar());
		grd1.addComponent(txtC9P905_12);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c13).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_13).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n13).centrar());
		grd1.addComponent(txtC9P905_13);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c14).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_14).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n14).centrar());
		grd1.addComponent(txtC9P905_14);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c15).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_15).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n15).centrar());
		grd1.addComponent(txtC9P905_15);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c16).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_16).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n16).centrar());
		grd1.addComponent(txtC9P905_16);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c17).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_17).size(altoComponente + 20, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n17).centrar());
		grd1.addComponent(txtC9P905_17);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c18).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_18).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n18).centrar());
		grd1.addComponent(txtC9P905_18);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c19).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_19).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n19).centrar());
		grd1.addComponent(txtC9P905_19);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c20).centrar());
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_20)
				.size(altoComponente, 120).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n20).centrar());
		grd1.addComponent(txtC9P905_20);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c21).centrar());
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_21)
				.size(altoComponente, 120).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n21).centrar());
		grd1.addComponent(txtC9P905_21);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c22).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_22).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n22).centrar());
		grd1.addComponent(txtC9P905_22);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c23).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_23).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n23).centrar());
		grd1.addComponent(txtC9P905_23);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c24).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_24).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n24).centrar());
		grd1.addComponent(txtC9P905_24);
		grd1.addComponent(new LabelComponent(getActivity(), App.ESTILO)
				.negrita().text(R.string.c2c100m9p005_c25).centrar()
				.size(altoComponente + 40, 120));
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_25).size(altoComponente, 120)
				.alinearIzquierda());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n25).centrar());
		grd1.addComponent(txtC9P905_25);
		grd1.addComponent(
				new LabelComponent(getActivity(), App.ESTILO).negrita()
						.text(R.string.c2c100m9p005_26)
						.size(altoComponente, 120).centrar(), 2);
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n26).centrar());
		grd1.addComponent(txtC9P905_26);
	//	grd1.component();
		
		grd1.addComponent(
				new LabelComponent(getActivity(), App.ESTILO).negrita()					
						.size(altoComponente, 120).centrar());		
		grd1.addComponent(
				new LabelComponent(getActivity(), App.ESTILO).negrita()
						.text(R.string.c2c100m9p005_27)
						.size(altoComponente, 120).centrar());
		grd1.addComponent(new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p005_n27).centrar());
		grd1.addComponent(txtC9P905_27);
		grd1.component();
		
		Filtros.setFiltro(txtC9P905_1, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_2, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_3, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_4, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_5, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_6, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_7, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_8, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_9, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_10, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_11, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_12, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_13, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_14, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_15, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_16, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_17, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_18, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_19, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_20, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_21, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_22, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_23, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_24, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_25, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		Filtros.setFiltro(txtC9P905_26, Filtros.TIPO.NUMBER, 8, -1, null, 0,
				99999998);
		
//		Filtros.setFiltro(txtC9P905_27, Filtros.TIPO.NUMBER, 8, -1, null, 0,
//				99999998);

	}

	@Override
	protected View createUI() {
		buildFields();
		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.c2c100m9p905, grd1);
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);

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
		
//		if (Util.esVacio(bean.c9p905_1))
//			bean.c9p905_1=0;		
//		if (Util.esVacio(bean.c9p905_3))
//			bean.c9p905_3=0;	
//		if (Util.esVacio(bean.c9p905_4))
//			bean.c9p905_4=0;
//		if (Util.esVacio(bean.c9p905_5))
//			bean.c9p905_5=0;
//		if (Util.esVacio(bean.c9p905_6))
//			bean.c9p905_6=0;
//		if (Util.esVacio(bean.c9p905_7))
//			bean.c9p905_7=0;
//		if (Util.esVacio(bean.c9p905_8))
//			bean.c9p905_8=0;
//		if (Util.esVacio(bean.c9p905_10))
//			bean.c9p905_10=0;
//		if (Util.esVacio(bean.c9p905_11))
//			bean.c9p905_11=0;
//		if (Util.esVacio(bean.c9p905_12))
//			bean.c9p905_12=0;
//		if (Util.esVacio(bean.c9p905_13))
//			bean.c9p905_13=0;
//		if (Util.esVacio(bean.c9p905_14))
//			bean.c9p905_14=0;
//		if (Util.esVacio(bean.c9p905_15))
//			bean.c9p905_15=0;
//		if (Util.esVacio(bean.c9p905_16))
//			bean.c9p905_16=0;
//		if (Util.esVacio(bean.c9p905_17))
//			bean.c9p905_17=0;
//		if (Util.esVacio(bean.c9p905_18))
//			bean.c9p905_18=0;
//		if (Util.esVacio(bean.c9p905_19))
//			bean.c9p905_19=0;
//		if (Util.esVacio(bean.c9p905_20))
//			bean.c9p905_20=0;
//		if (Util.esVacio(bean.c9p905_22))
//			bean.c9p905_22=0;
//		if (Util.esVacio(bean.c9p905_23))
//			bean.c9p905_23=0;
//		if (Util.esVacio(bean.c9p905_24))
//			bean.c9p905_24=0;
//		if (Util.esVacio(bean.c9p905_25))
//			bean.c9p905_25=0;
//		if (Util.esVacio(bean.c9p905_26))
//			bean.c9p905_26=0;
		
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

//		for (int i = 1; i <= 26; i++) {
//			IntegerField x = ((IntegerField) getView("txtC9P905_" + (i)));
//			if (Util.esVacio(x)) {
//				mensaje = pregunta_no_vacia.replace("$", "TOTAL");
//				view = x;
//				return !(error = true);
//			}
//		}
		Integer xd = Util.getInt(txtC9P905_3.getText().toString());
		Integer c9p905_27 = Util.getInt(txtC9P905_27.getText().toString());
		                
		if (c9p905_27 > Util.getInt(bean.c9p904_7)) {
			ToastMessage.msgBox(this.getActivity(), "Verificar: Total egresos no debe ser mayor al total ingresos",
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);			
		}
		
		

//		if (Util.getInt(bean1.c3p301a_t2) > 0 && xd == 0) {
//			mensaje = "Si tiene trabajadores el Monto de Remuneraciones no puede ser 0";
//			view = txtC9P905_3;
//			error = true;
//			return false;
//		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloix(
				App.getInstance().getEmpresa(),
				new Moduloix().getSecCap(getListFields(this, new String[] { "C9P904_7" })));
		
//		bean1 = getCuestionarioService().getModuloiii01(
//				App.getInstance().getEmpresa(),
//				new Moduloiii01().getSecCap(getListFields(this,
//						new String[] { "C3P301A_T2" })));

		if (bean == null) {
			bean = new Moduloix();
			bean.id = App.getInstance().getEmpresa().id;
		}
		if (bean1 == null) {
			bean1 = new Moduloiii01();
			bean1.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		// rgP10_5.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
}

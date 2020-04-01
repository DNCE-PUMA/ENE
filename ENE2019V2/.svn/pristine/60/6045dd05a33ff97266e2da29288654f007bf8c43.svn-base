package gob.inei.ene2019v2.fragment.ModVIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.SpinnerField;
import gob.inei.dnce.components.TextBoxField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Modulov01;
import gob.inei.ene2019v2.model.Modulovi01;
import gob.inei.ene2019v2.model.Moduloviii;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VIII_Fragment_012 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC8P846_1;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC8P846A_1;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC8P846_2;
	@FieldAnnotation(orderIndex = 4)
	public IntegerField txtC8P846A_2;
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC8P846_3;
	@FieldAnnotation(orderIndex = 6)
	public IntegerField txtC8P846A_3;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC8P846_4;
	@FieldAnnotation(orderIndex = 8)
	public IntegerField txtC8P846A_4;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC8P846_5;
	@FieldAnnotation(orderIndex = 10)
	public IntegerField txtC8P846A_5;
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC8P846_6;
	@FieldAnnotation(orderIndex = 12)
	public IntegerField txtC8P846A_6;
	@FieldAnnotation(orderIndex = 13)
	public RadioGroupOtherField rgC8P846_7;
	@FieldAnnotation(orderIndex = 14)
	public IntegerField txtC8P846A_7;
	@FieldAnnotation(orderIndex = 15)
	public RadioGroupOtherField rgC8P846_8;
	@FieldAnnotation(orderIndex = 16)
	public IntegerField txtC8P846A_8;
	@FieldAnnotation(orderIndex = 17)
	public RadioGroupOtherField rgC8P846_9;
	@FieldAnnotation(orderIndex = 18)
	public IntegerField txtC8P846A_9;
	@FieldAnnotation(orderIndex = 19)
	public RadioGroupOtherField rgC8P846_10;
	@FieldAnnotation(orderIndex = 20)
	public IntegerField txtC8P846A_10;
	@FieldAnnotation(orderIndex = 21)
	public RadioGroupOtherField rgC8P846_11;
	@FieldAnnotation(orderIndex = 22)
	public IntegerField txtC8P846A_11;
	@FieldAnnotation(orderIndex = 23)
	public RadioGroupOtherField rgC8P846_12;
	@FieldAnnotation(orderIndex = 24)
	public IntegerField txtC8P846A_12;
	@FieldAnnotation(orderIndex = 25)
	public RadioGroupOtherField rgC8P846_13;
	@FieldAnnotation(orderIndex = 26)
	public IntegerField txtC8P846A_13;
	@FieldAnnotation(orderIndex = 27)
	public RadioGroupOtherField rgC8P846_14;
	@FieldAnnotation(orderIndex = 28)
	public IntegerField txtC8P846A_14;
	@FieldAnnotation(orderIndex = 29)
	public RadioGroupOtherField rgC8P846_15;
	@FieldAnnotation(orderIndex = 30)
	public IntegerField txtC8P846A_15;
	@FieldAnnotation(orderIndex = 31)
	public RadioGroupOtherField rgC8P846_16;
	@FieldAnnotation(orderIndex = 32)
	public IntegerField txtC8P846A_16;
	@FieldAnnotation(orderIndex = 33)
	public RadioGroupOtherField rgC8P846_17;
	@FieldAnnotation(orderIndex = 34)
	public IntegerField txtC8P846A_17;
	@FieldAnnotation(orderIndex = 35)
	public RadioGroupOtherField rgC8P846_18;
	@FieldAnnotation(orderIndex = 36)
	public IntegerField txtC8P846A_18;
	@FieldAnnotation(orderIndex = 37)
	public RadioGroupOtherField rgC8P846_19;
	@FieldAnnotation(orderIndex = 38)
	public IntegerField txtC8P846A_19;
	@FieldAnnotation(orderIndex = 39)
	public RadioGroupOtherField rgC8P846_20;
	@FieldAnnotation(orderIndex = 40)
	public IntegerField txtC8P846A_20;
	@FieldAnnotation(orderIndex = 41)
	public RadioGroupOtherField rgC8P846_21;
	@FieldAnnotation(orderIndex = 42)
	public IntegerField txtC8P846A_21;
	@FieldAnnotation(orderIndex = 43)
	public RadioGroupOtherField rgC8P846_22;
	@FieldAnnotation(orderIndex = 44)
	public IntegerField txtC8P846A_22;
	@FieldAnnotation(orderIndex = 45)
	public RadioGroupOtherField rgC8P846_23;
	@FieldAnnotation(orderIndex = 46)
	public IntegerField txtC8P846A_23;
	@FieldAnnotation(orderIndex = 47)
	public RadioGroupOtherField rgC8P846_24;
	@FieldAnnotation(orderIndex = 48)
	public IntegerField txtC8P846A_24;

	private CuestionarioService cuestionarioService;
	private Moduloviii bean;
	private Modulovi01  bean600;
	private LabelComponent lblTitulo, lblSubTitulo,lblvacio,  lblPrioridad,lblPrioridad1,lblPrioridad2,lblPrioridad3, lblfactores,lblseleccion;
	public LabelComponent lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9,
			lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17, lbl18,
			lbl19, lbl20, lbl21, lbl22, lbl23, lbl24,lbl25,lbl26;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent2 grFactores,grFactores2;
	private GridComponent grEspe;
	private int contChecks;
	private int contUno, contDos, contTres;
	private View viewP3;
	
	public Mod_VIII_Fragment_012() {
	}

	public Mod_VIII_Fragment_012 parent(MasterActivity parent) {
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
		
		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8_Factores).textSize(18).centrar()
				.negrita();

		lblfactores = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 500)
				.text(R.string.c2c100m8p053a_Factores).textSize(17).centrar();
		lblPrioridad = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 150)
				.text(R.string.c2c100m8p053a_Prioridad).textSize(17).centrar();
		lblseleccion = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(altoComponente, 100)
		.text(R.string.c2c100m8p053a_Seleccion).textSize(17).centrar();
		

		
		lbl1  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_1).textSize(17).alinearIzquierda();
		lbl2  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_2).textSize(17).alinearIzquierda();
		lbl3  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_3).textSize(17).alinearIzquierda();
		lbl4  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_4).textSize(17).alinearIzquierda();
		lbl5  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_5).textSize(17).alinearIzquierda();
		lbl6  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_6).textSize(17).alinearIzquierda();
		lbl7  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_7).textSize(17).alinearIzquierda();
		lbl8  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_8).textSize(17).alinearIzquierda();
		lbl9  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_9).textSize(17).alinearIzquierda();
		lbl10  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_10).textSize(17).alinearIzquierda();
		lbl11  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_11).textSize(17).alinearIzquierda();
		lbl12  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_12).textSize(17).alinearIzquierda();
		lbl13  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_13).textSize(17).alinearIzquierda();
		lbl14  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_14).textSize(17).alinearIzquierda();
		lbl15  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_15).textSize(17).alinearIzquierda();
		lbl16  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_16).textSize(17).alinearIzquierda();
		lbl17  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_17).textSize(17).alinearIzquierda();
		lbl18  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_18).textSize(17).alinearIzquierda();
		lbl19  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_19).textSize(17).alinearIzquierda();
		lbl20  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_20).textSize(17).alinearIzquierda();
		lbl21  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_21).textSize(17).alinearIzquierda();
		lbl22  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_22).textSize(17).alinearIzquierda();
		lbl23  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_23).textSize(17).alinearIzquierda();
		lbl24  = new LabelComponent(this.getActivity()).size(altoComponente + 10 , 500).text(R.string.c2c100m8p846a_24).textSize(17).alinearIzquierda();
						

		rgC8P846_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_2 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_3 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_4 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_5 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_6 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_7 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_8 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_9 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_10 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_11 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_12 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_13 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_14 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_15 = new RadioGroupOtherField(this.getActivity(),
			 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_16 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();

		rgC8P846_17 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_18 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_19 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_20 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_21 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_22 = new RadioGroupOtherField(this.getActivity(),
				 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_23 = new RadioGroupOtherField(this.getActivity(),
			 R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();
		rgC8P846_24 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(WRAP_CONTENT, 160)
				.callback("FuncionCHECK846").centrar();


		txtC8P846A_1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_2 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();		

		txtC8P846A_4 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_5 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_6 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_7 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_8 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_9 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_10 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_11 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_12 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_13 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_14 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_15 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_16 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_17 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_18 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_19 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_20 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_21 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_22 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_23 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();
		txtC8P846A_24 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 120).centrar();

		grEspe = new GridComponent(this.getActivity(), 1);
	//	grEspe.addComponent(rgC8P846_27);
//		grEspe.addComponent(txtC8P846_27ESP);
		grEspe.colorFondo(R.color.transparent);
		


		grFactores = new GridComponent2(this.getActivity(),3);
		grFactores.addComponent(lblfactores);
		grFactores.addComponent(lblseleccion,2);
		grFactores.addComponent(lbl1);
		grFactores.addComponent(rgC8P846_1);
		grFactores.addComponent(txtC8P846A_1);
		grFactores.addComponent(lbl2);
		grFactores.addComponent(rgC8P846_2);
		grFactores.addComponent(txtC8P846A_2);
		grFactores.addComponent(lbl3);
		grFactores.addComponent(rgC8P846_3);
		grFactores.addComponent(txtC8P846A_3);
		grFactores.addComponent(lbl4);
		grFactores.addComponent(rgC8P846_4);
		grFactores.addComponent(txtC8P846A_4);
		grFactores.addComponent(lbl5);
		grFactores.addComponent(rgC8P846_5);
		grFactores.addComponent(txtC8P846A_5);
		grFactores.addComponent(lbl6);
		grFactores.addComponent(rgC8P846_6);
		grFactores.addComponent(txtC8P846A_6);
		grFactores.addComponent(lbl7);
		grFactores.addComponent(rgC8P846_7);
		grFactores.addComponent(txtC8P846A_7);
		grFactores.addComponent(lbl8);
		grFactores.addComponent(rgC8P846_8);
		grFactores.addComponent(txtC8P846A_8);
		grFactores.addComponent(lbl9);
		grFactores.addComponent(rgC8P846_9);
		grFactores.addComponent(txtC8P846A_9);
		grFactores.addComponent(lbl10);
		grFactores.addComponent(rgC8P846_10);
		grFactores.addComponent(txtC8P846A_10);
		grFactores.addComponent(lbl11);
		grFactores.addComponent(rgC8P846_11);
		grFactores.addComponent(txtC8P846A_11);
		grFactores.addComponent(lbl12);
		grFactores.addComponent(rgC8P846_12);
		grFactores.addComponent(txtC8P846A_12);
		grFactores.addComponent(lbl13);
		grFactores.addComponent(rgC8P846_13);
		grFactores.addComponent(txtC8P846A_13);
		grFactores.addComponent(lbl14);
		grFactores.addComponent(rgC8P846_14);
		grFactores.addComponent(txtC8P846A_14);
		grFactores.addComponent(lbl15);
		grFactores.addComponent(rgC8P846_15);
		grFactores.addComponent(txtC8P846A_15);
		grFactores.addComponent(lbl16);
		grFactores.addComponent(rgC8P846_16);
		grFactores.addComponent(txtC8P846A_16);
		grFactores.addComponent(lbl17);
		grFactores.addComponent(rgC8P846_17);
		grFactores.addComponent(txtC8P846A_17);
		grFactores.addComponent(lbl18);
		grFactores.addComponent(rgC8P846_18);
		grFactores.addComponent(txtC8P846A_18);
		grFactores.addComponent(lbl19);
		grFactores.addComponent(rgC8P846_19);
		grFactores.addComponent(txtC8P846A_19);
		grFactores.addComponent(lbl20);
		grFactores.addComponent(rgC8P846_20);
		grFactores.addComponent(txtC8P846A_20);
		grFactores.addComponent(lbl21);
		grFactores.addComponent(rgC8P846_21);
		grFactores.addComponent(txtC8P846A_21);
		grFactores.addComponent(lbl22);
		grFactores.addComponent(rgC8P846_22);
		grFactores.addComponent(txtC8P846A_22);
		grFactores.addComponent(lbl23);
		grFactores.addComponent(rgC8P846_23);
		grFactores.addComponent(txtC8P846A_23);
		grFactores.addComponent(lbl24);
		grFactores.addComponent(rgC8P846_24);
		grFactores.addComponent(txtC8P846A_24);

		Filtros.setFiltro(txtC8P846A_1, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_2, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_3, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_4, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_5, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_6, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_7, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_8, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_9, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_10, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_11, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_12, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_13, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_14, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_15, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_16, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_17, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_18, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_19, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_20, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_21, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_22, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_23, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
		Filtros.setFiltro(txtC8P846A_24, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
//		Filtros.setFiltro(txtC8P846A_25, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
//		Filtros.setFiltro(txtC8P846A_26, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
//		Filtros.setFiltro(txtC8P846A_27, Filtros.TIPO.NUMBER, 1, -1, null, 1, 3);
//		Filtros.setFiltro(txtC8P846_27ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(/*lblTitulo,*/ lblSubTitulo);
		q1 = createQuestionSection(R.string.c2c100m8p846,
				grFactores.component());

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
		

//		if (!validarP846(rgC8P846_1, txtC8P846A_1))
//			return false;
//		if (!validarP846(rgC8P846_2, txtC8P846A_2))
//			return false;
//		if (!validarP846(rgC8P846_3, txtC8P846A_3))
//			return false;		
//		if (!validarP846(rgC8P846_4, txtC8P846A_4))
//			return false;
//		if (!validarP846(rgC8P846_5, txtC8P846A_5))
//			return false;
//		if (!validarP846(rgC8P846_8, txtC8P846A_8))
//			return false;
//		if (!validarP846(rgC8P846_9, txtC8P846A_9))
//			return false;
//		if (!validarP846(rgC8P846_10, txtC8P846A_10))
//			return false;
//		if (!validarP846(rgC8P846_11, txtC8P846A_11))
//			return false;
//		if (!validarP846(rgC8P846_12, txtC8P846A_12))
//			return false;
//		if (!validarP846(rgC8P846_13, txtC8P846A_13))
//			return false;
//		if (!validarP846(rgC8P846_14, txtC8P846A_14))
//			return false;
//		if (!validarP846(rgC8P846_15, txtC8P846A_15))
//			return false;
//		if (!validarP846(rgC8P846_16, txtC8P846A_16))
//			return false;
//		if (!validarP846(rgC8P846_17, txtC8P846A_17))
//			return false;
//		if (!validarP846(rgC8P846_18, txtC8P846A_18))
//			return false;
//		if (!validarP846(rgC8P846_19, txtC8P846A_19))
//			return false;
//		if (!validarP846(rgC8P846_20, txtC8P846A_20))
//			return false;
//		if (!validarP846(rgC8P846_21, txtC8P846A_21))
//			return false;
//		if (!validarP846(rgC8P846_22, txtC8P846A_22))
//			return false;
//		if (!validarP846(rgC8P846_23, txtC8P846A_23))
//			return false;
//		if (!validarP846(rgC8P846_24, txtC8P846A_24))
//			return false;
//		if (!validarP846(rgC8P846_25, txtC8P846A_25))
//			return false;
//		if (!validarP846(rgC8P846_26, txtC8P846A_26))
//			return false;
//		if (rgC8P846_27.isChecked() && Util.esVacio(txtC8P846_27ESP)) {
//			mensaje = pregunta_no_vacia.replace("$",
//					"La Preg.846 (Especifique)");
//			view = txtC8P846_27ESP;
//			return !(error = true);
//		}
//		if (!validarP846(rgC8P846_27, txtC8P846A_27))
//			return false;

		
		
		
		
		IntegerField foco = (IntegerField) getView("txtC8P846A_1");
//		for (int i = 1; i <= 27; i++) {
//			RadioGroupOtherField x = (RadioGroupOtherField) getView("rgC8P846_" + (i));
//			if (x.isChecked()){
//				flag +=1; 
//			}
//			
//			if (i != 6 || i != 7) {
//				// continue;
//				// } else {
//				Log.e("MIRAAAAAAAAAA  ", "" + Util.getInt(x));
//				if (Util.getInt(x,0) == 1) {
//					IntegerField y = ((IntegerField) getView("txtC8P846A_"
//							+ (i)));
//
//					if (!Util.esVacio(y)) {
//						cont += 1;
//						sum = sum + Integer.parseInt(y.getText().toString());
//						foco = y;
//					}
//				}
//			}
//		}

		int contador =0;
		int contador1 =0;
		int contador2 =0;
		int contador3 =0;
		int contador4=0;
		int radiosi =0;
		for (int x = 1; x<= 24; x++) {
				View VRgCAP10_P1 = getView("rgC8P846_" + x);
				if (Util.esVacio((RadioGroupOtherField) VRgCAP10_P1)) {
					mensaje = pregunta_no_vacia.replace("$", "La preg. " + x);
					view = VRgCAP10_P1;
					return !(error = true);
				}		
				
				if(((RadioGroupOtherField) VRgCAP10_P1).isTagSelected(2)){
					contador4=contador4+2;
				}
				if(((RadioGroupOtherField) VRgCAP10_P1).isTagSelected(4)){
					contador4=contador4+1;
				}
				if (((RadioGroupOtherField) VRgCAP10_P1).isTagSelected(1)) {
					radiosi++;					
				}
				
				View VRgCAP10_P1A = getView("txtC8P846A_" + x);
				if (!Util.esVacio((IntegerField) VRgCAP10_P1A)) {
					contador++;					
				}
				if (Util.getInt((IntegerField) VRgCAP10_P1A) == 1) {
					contador1++;
				}
				if (Util.getInt((IntegerField) VRgCAP10_P1A) == 2) {
					contador2++;
				}
				if (Util.getInt((IntegerField) VRgCAP10_P1A) == 3) {
					contador3++;
				}
				
				if(((RadioGroupOtherField) VRgCAP10_P1).isTagSelected(1) && ((IntegerField) VRgCAP10_P1A).getText().toString().length()==0){
					mensaje = pregunta_no_vacia.replace("$", "La preg. " + x);
					view = VRgCAP10_P1A;
					return !(error = true);
				}
		}
		
		if(contador4==48){
			ToastMessage.msgBox(getActivity(),"Verificar: Indica que no tuvo factores que limitaron el crecimiento de su empresa", ToastMessage.MESSAGE_INFO,ToastMessage.DURATION_LONG);
		}
		
		
		if (contador1 > 1 || contador2 > 1 || contador3 > 1) {
			mensaje = "El orden de prioridad no debe repetirse”";
			view = foco;
			return !(error = true);
		}		
		
		if (contador3==1 && contador2==0 && contador1==0 ){
			mensaje = "El orden de prioridad debe ser correlativo ";
			view = foco;
			return !(error = true);
		}
		
		if (contador3==1 && contador2==0 && contador1==1 ){
			mensaje = "El orden de prioridad debe ser correlativo ";
			view = foco;
			return !(error = true);
		}
		
		if (contador2==1 &&  contador1==0 ){
			mensaje = "El orden de prioridad debe ser correlativo ";
			view = foco;
			return !(error = true);
		}
		
		if (contador1 < 1 ) {
			mensaje = " Debe ingresar por lo menos 1 factor.";
			view = foco;
			return !(error = true);
		}
		
		
		Log.e ("contador", contador + "");	  
		
		
//		 if (a == b || b == c  || a==c) {
//				mensaje = "DUPLICÓ  LA PRIORIDAD";
//				view = spnC8P846A_1;
//				return !(error = true);
//		 }
		  
			//si es true pasa
//			if (!validarCheck()) {
//				mensaje = "Sólo se debe afirmar 3 factores";
//				view = foco;
//				return !(error = true);
//			}
			
//			contChecks=0;
//			for (int i = 1; i <= 27; i++) {
//				if (i != 6 && i != 7 && i != 27 ) {
//					viewP3 = getView("rgC8P846_" + i );
//					if (((RadioGroupOtherField) viewP3).isChecked()) {
//						contChecks++;
//					}
//				}
//			}
						
//			if (contChecks > 3) {
//				mensaje = "Sólo se debe afirmar 3 factores";
//				view = foco;
//				return !(error = true);
//			}
			
//			if (contChecks < 3) {
//				mensaje = "DEBE SELECCIONAR COMO MÍNIMO (3 FACTORES) A EN P846";
//				view = rgC8P846_1;
//				return !(error = true);
//			}
			
//			if (!validarP846()) {
//				mensaje = "DUPLICÓ  Y/O MAL ENUMERADO, EL NÚMERO DE ORDEN";
//				view = foco;
//				return !(error = true);
//			}
		
			
			
			
			List<Integer> valores846 = new ArrayList<Integer>();
			int cont = 0;

//			valores846.add(Util.getInt(txtC8P846A_1.getText()));
//			valores846.add(Util.getInt(txtC8P846A_2.getText()));
//			valores846.add(Util.getInt(txtC8P846A_3.getText()));
//			valores846.add(Util.getInt(txtC8P846A_4.getText()));
//			valores846.add(Util.getInt(txtC8P846A_5.getText()));
//			valores846.add(Util.getInt(txtC8P846A_8.getText()));
//			valores846.add(Util.getInt(txtC8P846A_9.getText()));
//			valores846.add(Util.getInt(txtC8P846A_10.getText()));
//			valores846.add(Util.getInt(txtC8P846A_11.getText()));
//			valores846.add(Util.getInt(txtC8P846A_12.getText()));
//			valores846.add(Util.getInt(txtC8P846A_13.getText()));
//			valores846.add(Util.getInt(txtC8P846A_14.getText()));
//			valores846.add(Util.getInt(txtC8P846A_15.getText()));
//			valores846.add(Util.getInt(txtC8P846A_16.getText()));
//			valores846.add(Util.getInt(txtC8P846A_17.getText()));
//			valores846.add(Util.getInt(txtC8P846A_18.getText()));
//			valores846.add(Util.getInt(txtC8P846A_19.getText()));
//			valores846.add(Util.getInt(txtC8P846A_20.getText()));
//			valores846.add(Util.getInt(txtC8P846A_21.getText()));
//			valores846.add(Util.getInt(txtC8P846A_22.getText()));
//			valores846.add(Util.getInt(txtC8P846A_23.getText()));
//			valores846.add(Util.getInt(txtC8P846A_24.getText()));
//			valores846.add(Util.getInt(txtC8P846A_25.getText()));
//			valores846.add(Util.getInt(txtC8P846A_26.getText()));
//		//	valores846.add(Util.getInt(txtC8P846A_27.getText()));
			

//			int uno=0; int dos=0; int tres=0;		
//			
////			if (valores846.contains(1)) {
////				uno++;			
////			}
////			if (valores846.contains(2)) {
////				dos++;			
////			}
////			
////			if (valores846.contains(3)) {
////				tres++; 
////			}
//			
//			
//			Log.e ("uno", uno + "");
//			Log.e ("dos", dos + "");
//			Log.e ("tres", tres + "");
			
			
//			int unox=0; int dosx=0; int tresx=0; 

			
//			for (int i = 1; i <= 27; i++) {
//				if (i != 6 && i != 7 && i !=27 ) {					
//					
//					if (valores846.equals(1)){
//						unox++;
//					}
////					if (valores846.contains(1)) {
////						unox++;			
////					}
////					if (valores846.contains(2)) {
////						dosx++;			
////					}
////					
////					if (valores846.contains(3)) {
////						tresx++; 
////					}
//				}
//		
//			}
			
			
			
//			
//			Log.e ("indica unoxxx", unox + "");
			
//			if (uno > 1 || dos > 1 || tres > 1) {
//				mensaje = "El orden de prioridad no debe repetirse”";
//				view = foco;
//				return !(error = true);
//			}
//			
//			
//			if (tres==1 && dos==0 && uno==0 ){
//				mensaje = "El orden de prioridad debe ser correlativo ";
//				view = foco;
//				return !(error = true);
//			}
//			
//			if (tres==1 && dos==0 && uno==1 ){
//				mensaje = "El orden de prioridad debe ser correlativo ";
//				view = foco;
//				return !(error = true);
//			}
//			
//			if (dos==1 &&  uno==0 ){
//				mensaje = "El orden de prioridad debe ser correlativo ";
//				view = foco;
//				return !(error = true);
//			}
			
		
			
		if (rgC8P846_19.isTagSelected(1) &&  Util.getInt(bean600.c6p601,0)==2) {
			mensaje = "Error: En Preg. 601 indica que no fue víctima de hechos delictivos pero en Preg. 846_17 los menciona como un factor que limito el crecimiento de su empresa";
			view = rgC8P846_19;
			error = true;
			return false;
		}
		
		return true;
	}
	
	
//	private boolean validarP846() {
//		List<Integer> valores846 = new ArrayList<Integer>();
//		int cont = 0;
//
//		for (int i = 1; i <= 27; i++) {
//			if (i != 6 && i != 7  && i != 27  ) {
//				viewP3 = getView("rgC8P846_" + i );
//				if (((RadioGroupOtherField) viewP3).isChecked()) {
//					cont++;
//				}
//			}
//		}
//		
//		valores846.add(Util.getInt(txtC8P846A_1.getText()));
//		valores846.add(Util.getInt(txtC8P846A_2.getText()));
//		valores846.add(Util.getInt(txtC8P846A_3.getText()));
//		valores846.add(Util.getInt(txtC8P846A_4.getText()));
//		valores846.add(Util.getInt(txtC8P846A_5.getText()));
//		valores846.add(Util.getInt(txtC8P846A_8.getText()));
//		valores846.add(Util.getInt(txtC8P846A_9.getText()));
//		valores846.add(Util.getInt(txtC8P846A_10.getText()));
//		valores846.add(Util.getInt(txtC8P846A_11.getText()));
//		valores846.add(Util.getInt(txtC8P846A_12.getText()));
//		valores846.add(Util.getInt(txtC8P846A_13.getText()));
//		valores846.add(Util.getInt(txtC8P846A_14.getText()));
//		valores846.add(Util.getInt(txtC8P846A_15.getText()));
//		valores846.add(Util.getInt(txtC8P846A_16.getText()));
//		valores846.add(Util.getInt(txtC8P846A_17.getText()));
//		valores846.add(Util.getInt(txtC8P846A_18.getText()));
//		valores846.add(Util.getInt(txtC8P846A_19.getText()));
//		valores846.add(Util.getInt(txtC8P846A_20.getText()));
//		valores846.add(Util.getInt(txtC8P846A_21.getText()));
//		valores846.add(Util.getInt(txtC8P846A_22.getText()));
//		valores846.add(Util.getInt(txtC8P846A_23.getText()));
//		valores846.add(Util.getInt(txtC8P846A_24.getText()));
//		valores846.add(Util.getInt(txtC8P846A_25.getText()));
//		valores846.add(Util.getInt(txtC8P846A_26.getText()));
////		valores846.add(Util.getInt(txtC8P846A_27.getText()));
//		
//		boolean flag = true;
//		for (int x = 0; x < cont && flag; x++) {
//			boolean flag2 = false;
//			for (int x1 = 0; x1 < valores846.size(); x1++) {
//				if (x + 1 == valores846.get(x1)) {
//					flag2 = true;
//					break;
//				}
//			}
//			if (!flag2) {
//				flag = false;
//				break;
//			}
//		}
//
//		return flag;
//	}


//	public boolean validarCheck() {
//		boolean flag = true;
//		contChecks = 0;
//		for (int i = 1; i <= 27; i++) {
//			if (i != 6 && i != 7) {
//				viewP3 = getView("rgC8P846_" + i );
//				if (((RadioGroupOtherField) viewP3).isChecked()) {
//					contChecks++;
//				}
//			}
//		}
//		if (contChecks > 3) {
//			flag = false;
//		}
//		return flag;
//	}

	
	
	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloviii(
				App.getInstance().getEmpresa(),
				new Moduloviii().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloviii();
			bean.id = App.getInstance().getEmpresa().id;
		}
		
		bean600 = getCuestionarioService().getModulovi01(
				App.getInstance().getEmpresa(),
				new Modulovi01().getSecCap(Util.getListList("C6P601")));
		
		if (bean600 == null) {
			bean600 = new Modulovi01();
			bean600.id = App.getInstance().getEmpresa().id;
		}
		
		
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		lockP53(rgC8P846_1, txtC8P846A_1);
		lockP53(rgC8P846_2, txtC8P846A_2);
		lockP53(rgC8P846_3, txtC8P846A_3);
		lockP53(rgC8P846_4, txtC8P846A_4);
		lockP53(rgC8P846_5, txtC8P846A_5);
		lockP53(rgC8P846_6, txtC8P846A_6);
		lockP53(rgC8P846_7, txtC8P846A_7);
		lockP53(rgC8P846_8, txtC8P846A_8);
		lockP53(rgC8P846_9, txtC8P846A_9);
		lockP53(rgC8P846_10, txtC8P846A_10);
		lockP53(rgC8P846_11, txtC8P846A_11);
		lockP53(rgC8P846_12, txtC8P846A_12);
		lockP53(rgC8P846_13, txtC8P846A_13);
		lockP53(rgC8P846_14, txtC8P846A_14);
		lockP53(rgC8P846_15, txtC8P846A_15);
		lockP53(rgC8P846_16, txtC8P846A_16);
		lockP53(rgC8P846_17, txtC8P846A_17);
		lockP53(rgC8P846_18, txtC8P846A_18);
		lockP53(rgC8P846_19, txtC8P846A_19);
		lockP53(rgC8P846_20, txtC8P846A_20);
		lockP53(rgC8P846_21, txtC8P846A_21);
		lockP53(rgC8P846_22, txtC8P846A_22);
		lockP53(rgC8P846_23, txtC8P846A_23);
		lockP53(rgC8P846_24, txtC8P846A_24);
//		lockP53(rgC8P846_25, txtC8P846A_25);
//		lockP53(rgC8P846_26, txtC8P846A_26);
//	//	lockP53(rgC8P846_27, txtC8P846A_27 /*, txtC8P846_27ESP*/);
		rgC8P846_1.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	@Override
	public Entity getEntity() {
		return bean;
	}

	private boolean validarP846(RadioGroupOtherField rg, TextBoxField txt) {
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);

		if (Util.esVacio(rg)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P846");
			view = rg;
			return !(error = true);
		}
//		if (rg.isChecked() && Util.esVacio(txt)) {
//			mensaje = "Cantidad no puede estar vacio.";
//			view = txt;
//			return !(error = true);
//		}

		return true;
	}

	public void FuncionCHECK846(FieldComponent component) {
		RadioGroupOtherField rg = (RadioGroupOtherField) component;
		if (rg.isPressed()) {
			if (rg.equals(rgC8P846_1))
				lockP53(rg, txtC8P846A_1);
			else if (rg.equals(rgC8P846_2))
				lockP53(rg, txtC8P846A_2);
			else if (rg.equals(rgC8P846_3))
				lockP53(rg, txtC8P846A_3);
			else if (rg.equals(rgC8P846_4))
				lockP53(rg, txtC8P846A_4);
			else if (rg.equals(rgC8P846_5))
				lockP53(rg, txtC8P846A_5);
			else if (rg.equals(rgC8P846_6))
				lockP53(rg, txtC8P846A_6);
			else if (rg.equals(rgC8P846_7))
				lockP53(rg, txtC8P846A_7);
			else if (rg.equals(rgC8P846_8))
				lockP53(rg, txtC8P846A_8);
			else if (rg.equals(rgC8P846_9))
				lockP53(rg, txtC8P846A_9);
			else if (rg.equals(rgC8P846_10))
				lockP53(rg, txtC8P846A_10);
			else if (rg.equals(rgC8P846_11))
				lockP53(rg, txtC8P846A_11);
			else if (rg.equals(rgC8P846_12))
				lockP53(rg, txtC8P846A_12);
			else if (rg.equals(rgC8P846_13))
				lockP53(rg, txtC8P846A_13);
			else if (rg.equals(rgC8P846_14))
				lockP53(rg, txtC8P846A_14);
			else if (rg.equals(rgC8P846_15))
				lockP53(rg, txtC8P846A_15);//
			else if (rg.equals(rgC8P846_16))
				lockP53(rg, txtC8P846A_16);
			else if (rg.equals(rgC8P846_17))
				lockP53(rg, txtC8P846A_17);
			else if (rg.equals(rgC8P846_18))
				lockP53(rg, txtC8P846A_18);
			else if (rg.equals(rgC8P846_19))
				lockP53(rg, txtC8P846A_19);
			else if (rg.equals(rgC8P846_20))
				lockP53(rg, txtC8P846A_20);
			else if (rg.equals(rgC8P846_21))
				lockP53(rg, txtC8P846A_21);
			else if (rg.equals(rgC8P846_22))
				lockP53(rg, txtC8P846A_22);
			else if (rg.equals(rgC8P846_23))
				lockP53(rg, txtC8P846A_23);
			else if (rg.equals(rgC8P846_24))
				lockP53(rg, txtC8P846A_24);
//			else if (rg.equals(rgC8P846_25))
//				lockP53(rg, txtC8P846A_25);
//			else if (rg.equals(rgC8P846_26))
//				lockP53(rg, txtC8P846A_26);
////			else if (rg.equals(rgC8P846_27))
////				lockP53(rg, txtC8P846A_27 /*, txtC8P846_27ESP */);
			setNextFocusRequest(rg);
		}
	}

	private void lockP53(RadioGroupOtherField rg, View... views) {
		if (rg.isTagSelected(1)) {
			lockView(false, views);
		} else {
			cleanAndLockView(views);
		}
	}

}

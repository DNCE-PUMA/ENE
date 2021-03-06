	package gob.inei.ene2019v2.fragment.ModIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.ModuloIII_det;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloiii02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.List;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_III_Fragment_009 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC3P323;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC3P324;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC3P325;

	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC3P326_1;
	@FieldAnnotation(orderIndex = 5)
	public IntegerField txtC3P326_A1;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC3P326_B1;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC3P326_C1;

	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC3P326_2;
	@FieldAnnotation(orderIndex = 9)
	public IntegerField txtC3P326_A2;
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgC3P326_B2;
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC3P326_C2;

	@FieldAnnotation(orderIndex = 12)
	public RadioGroupOtherField rgC3P326_3;
	@FieldAnnotation(orderIndex = 13)
	public IntegerField txtC3P326_A3;
	@FieldAnnotation(orderIndex = 14)
	public RadioGroupOtherField rgC3P326_B3;
	@FieldAnnotation(orderIndex = 15)
	public RadioGroupOtherField rgC3P326_C3;

	@FieldAnnotation(orderIndex = 16)
	public RadioGroupOtherField rgC3P326_4;
	@FieldAnnotation(orderIndex = 17)
	public IntegerField txtC3P326_A4;
	@FieldAnnotation(orderIndex = 18)
	public RadioGroupOtherField rgC3P326_B4;
	@FieldAnnotation(orderIndex = 19)
	public RadioGroupOtherField rgC3P326_C4;

	@FieldAnnotation(orderIndex = 20)
	public RadioGroupOtherField rgC3P326_5;
	@FieldAnnotation(orderIndex = 21)
	public IntegerField txtC3P326_A5;
	@FieldAnnotation(orderIndex = 22)
	public RadioGroupOtherField rgC3P326_B5;
	@FieldAnnotation(orderIndex = 23)
	public RadioGroupOtherField rgC3P326_C5;

	@FieldAnnotation(orderIndex = 24)
	public RadioGroupOtherField rgC3P326_6;
	@FieldAnnotation(orderIndex = 25)
	public IntegerField txtC3P326_A6;
	@FieldAnnotation(orderIndex = 26)
	public RadioGroupOtherField rgC3P326_B6;
	@FieldAnnotation(orderIndex = 27)
	public RadioGroupOtherField rgC3P326_C6;

	@FieldAnnotation(orderIndex = 28)
	public RadioGroupOtherField rgC3P326_7;
	@FieldAnnotation(orderIndex = 29)
	public IntegerField txtC3P326_A7;
	@FieldAnnotation(orderIndex = 30)
	public RadioGroupOtherField rgC3P326_B7;
	@FieldAnnotation(orderIndex = 31)
	public RadioGroupOtherField rgC3P326_C7;

	@FieldAnnotation(orderIndex = 32)
	public RadioGroupOtherField rgC3P326_8;
	@FieldAnnotation(orderIndex = 33)
	public IntegerField txtC3P326_A8;
	@FieldAnnotation(orderIndex = 34)
	public RadioGroupOtherField rgC3P326_B8;
	@FieldAnnotation(orderIndex = 35)
	public RadioGroupOtherField rgC3P326_C8;

	@FieldAnnotation(orderIndex = 36)
	public RadioGroupOtherField rgC3P326_9;
	@FieldAnnotation(orderIndex = 37)
	public IntegerField txtC3P326_A9;
	@FieldAnnotation(orderIndex = 38)
	public RadioGroupOtherField rgC3P326_B9;
	@FieldAnnotation(orderIndex = 39)
	public RadioGroupOtherField rgC3P326_C9;

	@FieldAnnotation(orderIndex = 40)
	public RadioGroupOtherField rgC3P326_10;
	@FieldAnnotation(orderIndex = 41)
	public TextField txtC3P326_10ESP;
	@FieldAnnotation(orderIndex = 42)
	public IntegerField txtC3P326_A10;
	@FieldAnnotation(orderIndex = 43)
	public RadioGroupOtherField rgC3P326_B10;
	@FieldAnnotation(orderIndex = 44)
	public RadioGroupOtherField rgC3P326_C10;

	private CuestionarioService cuestionarioService;
	private Moduloiii01 bean1;
	private Moduloiii02 bean;
	private LabelComponent lblTitulo, lblTitulo1, lblCab1, lblCab2, lblCab3,
			lblCab4,lblCab5;
	private GridComponent grP326, grEspe;
	private LabelComponent lblFile1, lblFile2, lblFile3, lblFile4, lblFile5,
			lblFile6, lblFile7, lblFile8, lblFile9x, lblFile10x;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	SeccionCapitulo[] campos;
	private List<ModuloIII_det> lstDetalle;
	public Mod_III_Fragment_009() {
	}

	public Mod_III_Fragment_009 parent(MasterActivity parent) {
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
		// confSumatorias();
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
				.text(R.string.mod3_subtitulo).textSize(20).centrar().negrita();
		rgC3P323 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m3p023_1, R.string.c1c100m3p023_2).size(
				WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL);
		rgC3P324 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m3p024_1, R.string.c1c100m3p024_2,
				R.string.c1c100m3p024_3).size(WRAP_CONTENT, 600)
				.orientation(ORIENTATION.HORIZONTAL).centrar();
		rgC3P325 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m3p025_1, R.string.c1c100m3p025_2).size(
				WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL);

		rgC3P326_1 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_2 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL).centrar()
				;
		rgC3P326_3 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_4 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_5 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_6 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar()
				;
		rgC3P326_7 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_8 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();

		rgC3P326_9 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, 160).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_10 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, 160).callback("FuncionRGP326")
				.orientation(ORIENTATION.HORIZONTAL)
				.centrar();

		txtC3P326_10ESP = new TextField(this.getActivity(), false)
				.size(altoComponente + 10, 100).hint(R.string.especifique)
				.soloTextoNumero();

		txtC3P326_A1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A2 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A4 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A5 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A6 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A7 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A8 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A9 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();
		txtC3P326_A10 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 75).centrar();


		rgC3P326_B1 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B2 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B3 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B4 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B5 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B6 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B7 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B8 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B9 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_B10 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		
		rgC3P326_C1 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C2 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C3 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C4 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C5 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C6 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C7 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C8 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C9 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();
		rgC3P326_C10 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL)
				.centrar();

		lblFile1 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p026_1)
				.textSize(15).negrita().alinearIzquierda();
		lblFile2 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p026_2)
				.textSize(15).negrita().alinearIzquierda();
		lblFile3 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p026_3)
				.textSize(15).negrita().alinearIzquierda();
		lblFile4 = new LabelComponent(this.getActivity())
				.size(altoComponente + 40, 80).text(R.string.c1c100m3p026_4)
				.textSize(15).negrita().alinearIzquierda();
		lblFile5 = new LabelComponent(this.getActivity())
				.size(altoComponente + 35, 80).text(R.string.c1c100m3p026_5)
				.textSize(15).negrita().alinearIzquierda();
		lblFile6 = new LabelComponent(this.getActivity())
				.size(altoComponente + 75, 80).text(R.string.c1c100m3p026_6)
				.textSize(15).negrita().alinearIzquierda();
		lblFile7 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p026_7)
				.textSize(15).negrita().alinearIzquierda();
		lblFile8 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p026_8)
				.textSize(15).negrita().alinearIzquierda();
		lblFile9x = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 80).text(R.string.c1c100m3p026_9x)
				.textSize(15).negrita().alinearIzquierda();
		lblFile10x = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 100).text(R.string.c1c100m3p026_10x)
				.textSize(15).negrita().alinearIzquierda();

		lblCab1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 100, 230)
				.text(R.string.c1c100m3p026_cab1).textSize(15).negrita()
				.centrar();
		lblCab2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 100, 150)
				.text(R.string.c1c100m3p026_cab2).textSize(15).negrita()
				.centrar();
		lblCab3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 100, 75)
				.text(R.string.c1c100m3p026_cab3).textSize(15).negrita()
				.centrar();
		lblCab4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 100, 150)
				.text(R.string.c1c100m3p026_cab4).textSize(15).negrita()
				.centrar();
		lblCab5 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 100, 150)
				.text(R.string.c1c100m3p026_cab5).textSize(15).negrita()
				.centrar();

		grEspe = new GridComponent(this.getActivity(), Gravity.CENTER_VERTICAL,
				2);
		grEspe.addComponent(lblFile10x);
		grEspe.addComponent(txtC3P326_10ESP);
		grEspe.colorFondo(R.color.WhiteSmoke);
		grEspe.component();

		grP326 = new GridComponent(this.getActivity(), Gravity.CENTER_VERTICAL,
				5);
		grP326.addComponent(lblCab1);
		grP326.addComponent(lblCab2);
		grP326.addComponent(lblCab3);
		grP326.addComponent(lblCab4);
		grP326.addComponent(lblCab5);

		grP326.addComponent(lblFile1);
		grP326.addComponent(rgC3P326_1);
		grP326.addComponent(txtC3P326_A1);
		grP326.addComponent(rgC3P326_B1);
		grP326.addComponent(rgC3P326_C1);
		grP326.addComponent(lblFile2);
		grP326.addComponent(rgC3P326_2);
		grP326.addComponent(txtC3P326_A2);
		grP326.addComponent(rgC3P326_B2);
		grP326.addComponent(rgC3P326_C2);
		grP326.addComponent(lblFile3);
		grP326.addComponent(rgC3P326_3);
		grP326.addComponent(txtC3P326_A3);
		grP326.addComponent(rgC3P326_B3);
		grP326.addComponent(rgC3P326_C3);
		grP326.addComponent(lblFile4);
		grP326.addComponent(rgC3P326_4);
		grP326.addComponent(txtC3P326_A4);
		grP326.addComponent(rgC3P326_B4);
		grP326.addComponent(rgC3P326_C4);
		grP326.addComponent(lblFile5);
		grP326.addComponent(rgC3P326_5);
		grP326.addComponent(txtC3P326_A5);
		grP326.addComponent(rgC3P326_B5);
		grP326.addComponent(rgC3P326_C5);
		grP326.addComponent(lblFile6);
		grP326.addComponent(rgC3P326_6);
		grP326.addComponent(txtC3P326_A6);
		grP326.addComponent(rgC3P326_B6);
		grP326.addComponent(rgC3P326_C6);
		grP326.addComponent(lblFile7);
		grP326.addComponent(rgC3P326_7);
		grP326.addComponent(txtC3P326_A7);
		grP326.addComponent(rgC3P326_B7);
		grP326.addComponent(rgC3P326_C7);

		grP326.addComponent(lblFile8);
		grP326.addComponent(rgC3P326_8);
		grP326.addComponent(txtC3P326_A8);
		grP326.addComponent(rgC3P326_B8);
		grP326.addComponent(rgC3P326_C8);

		grP326.addComponent(lblFile9x);
		grP326.addComponent(rgC3P326_9);
		grP326.addComponent(txtC3P326_A9);
		grP326.addComponent(rgC3P326_B9);
		grP326.addComponent(rgC3P326_C9);
		grP326.addComponent(grEspe);
		grP326.addComponent(rgC3P326_10);
		grP326.addComponent(txtC3P326_A10);
		grP326.addComponent(rgC3P326_B10);
		grP326.addComponent(rgC3P326_C10);


		Filtros.setFiltro(txtC3P326_10ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC3P326_A1, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				9998, 1, 4);
		Filtros.setFiltro(txtC3P326_A2, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				9998, 1, 4);
		Filtros.setFiltro(txtC3P326_A3, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				9998, 1, 4);
		Filtros.setFiltro(txtC3P326_A4, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				9998, 1, 4);
		Filtros.setFiltro(txtC3P326_A5, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				9998, 1, 4);
		Filtros.setFiltro(txtC3P326_A6, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				9998, 1, 4);
		Filtros.setFiltro(txtC3P326_A7, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				998, 1, 4);
		Filtros.setFiltro(txtC3P326_A8, Filtros.TIPO.NUMBER, 4, -1, null, 1,
				9998, 1, 4);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m3p023, rgC3P323);
		q2 = createQuestionSection(R.string.c1c100m3p024, rgC3P324);
		q3 = createQuestionSection(R.string.c1c100m3p025, rgC3P325);
		q4 = createQuestionSection(R.string.c1c100m3p026, grP326.component());
//		q5 = createQuestionSection(R.string.c1c100m3p026A, rgC3P326A);
//		q6 = createQuestionSection(R.string.c1c100m3p026B, rgC3P326B);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
//		form.addView(q5);
//		form.addView(q6);

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
			if (rgC3P326_2.isTagSelected(2) && rgC3P326_6.isTagSelected(2)) {
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C3P326A_A_1", "C3P326A_A_2", "C3P326A_A_3",
								"C3P326A_A_4", "C3P326A_A_5", "C3P326A_A_6",
								"C3P326A_A_7", "C3P326A_A_7ESP", "C3P326A_A_8",
								"C3P326A_A_9", "C3P326A_A_10", "C3P326A_A_11",
								"C3P326A_A_12", "C3P326A_A_13",
								"C3P326A_A_13ESP", "C3P326A_A_14",
								"C3P326A_A_14ESP"})))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			}else{
				if (!getCuestionarioService().saveOrUpdate(bean,
						bean.getSecCap(getListFields(this)))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
				}
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

		if (Util.esVacio(rgC3P323)) {
			mensaje = pregunta_no_vacia.replace("$", "La  pregunta P323");
			view = rgC3P323;
			return !(error = true);
		}

		if (Util.esVacio(rgC3P324)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P324");
			view = rgC3P324;
			return !(error = true);
		}

		if (Util.esVacio(rgC3P325)) {
			mensaje = pregunta_no_vacia.replace("$", " La pregunta P325");
			view = rgC3P325;
			return !(error = true);
		}

		if (!validarp1(rgC3P326_1, txtC3P326_A1, rgC3P326_B1, rgC3P326_C1, "P326.1"))
			return false;
		else if (!validarp1(rgC3P326_2, txtC3P326_A2, rgC3P326_B2, rgC3P326_C2, "P326.2"))
			return false;
		else if (!validarp1(rgC3P326_3, txtC3P326_A3, rgC3P326_B3, rgC3P326_C3, "P326.3"))
			return false;
		else if (!validarp1(rgC3P326_4, txtC3P326_A4, rgC3P326_B4, rgC3P326_C4, "P326.4"))
			return false;
		else if (!validarp1(rgC3P326_5, txtC3P326_A5, rgC3P326_B5, rgC3P326_C5, "P326.5"))
			return false;
		else if (!validarp1(rgC3P326_6, txtC3P326_A6, rgC3P326_B6, rgC3P326_C6, "P326.6"))
			return false;
		else if (!validarp1(rgC3P326_7, txtC3P326_A7, rgC3P326_B7, rgC3P326_C7, "P326.7"))
			return false;
		else if (!validarp1(rgC3P326_8, txtC3P326_A8, rgC3P326_B8, rgC3P326_C8, "P326.8"))
			return false;
		else if (!validarp1(rgC3P326_9, txtC3P326_A9, rgC3P326_B9, rgC3P326_C9, "P326.9"))
			return false;
		else if (!validarp1(rgC3P326_10, txtC3P326_A10, rgC3P326_B10, rgC3P326_C10,
				"P326.10", txtC3P326_10ESP))
			return false;

//		VERIFICACIÓN	:	Si C3P301_ID=15(C3P301A_TOT)  < C3P326_A1  Error
//		MENSAJE	:	“Error: La cantidad de trabajadores que participaron en la capacitación de Idiomas supera la cantidad 
//		                                            de trabajadores indicados en la pregunta 301”
//int a1 = Util.getInt(lstDetalle.get(5).c3p301a_tot);
//int b1 = Integer.parseInt(txtC3P326_A1.getText().toString());
//if ( a1<b1) {
//	mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Idiomas supera la cantidad de trabajadores indicados en la pregunta 301";
//	view = txtC3P326_A1;
//	error = true;
//	return false;
//}

		/* TOTAL DE TRABAJADORES CON TOTAL P626 */
		
		if (rgC3P326_1.isTagSelected(2) && rgC3P326_2.isTagSelected(2)
				&& rgC3P326_3.isTagSelected(2) && rgC3P326_4.isTagSelected(2)
				&& rgC3P326_5.isTagSelected(2) && rgC3P326_6.isTagSelected(2)
				&& rgC3P326_7.isTagSelected(2) && rgC3P326_8.isTagSelected(2)
				&& rgC3P326_9.isTagSelected(2) && rgC3P326_10.isTagSelected(2)) {
			mensaje = "Error: Si indica que si recibió capacitación entonces debe haber realizado al menos una capacitación";
			view = rgC3P326_1;
			error = true;
			return false;
		}

		
		int totA1 = Util.getInt(txtC3P326_A1.getText().toString());
		int totA2 = Util.getInt(txtC3P326_A2.getText().toString());
		int totA3 = Util.getInt(txtC3P326_A3.getText().toString());
		int totA4 = Util.getInt(txtC3P326_A4.getText().toString());
		int totA5 = Util.getInt(txtC3P326_A5.getText().toString());
		int totA6 = Util.getInt(txtC3P326_A6.getText().toString());
		int totA7 = Util.getInt(txtC3P326_A7.getText().toString());
		int totA8 = Util.getInt(txtC3P326_A8.getText().toString());
		int totA9 = Util.getInt(txtC3P326_A9.getText().toString());
		int totA10 = Util.getInt(txtC3P326_A10.getText().toString());

		int SumaTOT = totA1 + totA2 + totA3 + totA4 + totA5 + totA6 + totA7 + totA8 + totA9 + totA10;
		
	//	int total301  = /* Util.getInt(bean1.c3p301a_t1) +*/ Util.getInt(bean1.c3p301a_t2) + Util.getInt(bean1.c3p301a_11);

		/* TOTAL P626 CONTRA TRABAJADORES CAPACITADOS */

//		if (total301 < totA1) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Idiomas supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A1;
//			error = true;
//			return false;
//		}
//		if (total301 < totA2) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Gestión empresarial supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A2;
//			error = true;
//			return false;
//		}
//		if (total301 < totA3) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Seguridad y salud ocupacional supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A3;
//			error = true;
//			return false;
//		}
//		if (total301 < totA4) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Tecnología de información y Comunicaciones supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A4;
//			error = true;
//			return false;
//		}
//		if (total301 < totA5) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Habilidades socio-emocionales supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A5;
//			error = true;
//			return false;
//		}
//		if (total301 < totA6) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Temas técnicos productivos supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A6;
//			error = true;
//			return false;
//		}
//		if (total301 < totA7) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Marketing supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A7;
//			error = true;
//			return false;
//		}
//
//		if (total301 < totA8) {
//			mensaje = "Error: La cantidad de tra0bajadores que participaron en la capacitación de Atención al cliente supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A8;
//			error = true;
//			return false;
//		}
//
//		if (total301 < totA9) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de Gestión ambiental supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A9;
//			error = true;
//			return false;
//		}
//
//		if (total301 < totA10) {
//			mensaje = "Error: La cantidad de trabajadores que participaron en la capacitación de otros temas supera la cantidad de trabajadores indicados en la pregunta 301";
//			view = txtC3P326_A10;
//			error = true;
//			return false;
//		}
		
//		int tot26a = Util.getInt(txtC3P326_A_TOT.getText().toString());
//		if (tot26a > Util.getInt(bean1.c3p301a_t2)) {
//			ToastMessage
//					.msgBox(this.getActivity(),
//							"“VERIFICAR: Personal capacitado es MAYOR al total de trabajadores por categoría ocupacional”",
//							ToastMessage.MESSAGE_INFO,
//							ToastMessage.DURATION_LONG);
//		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiii02(
				App.getInstance().getEmpresa(),
				new Moduloiii02().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloiii02();
			bean.id = App.getInstance().getEmpresa().id;
		}
		bean1 = getCuestionarioService().getModuloiii01(
				App.getInstance().getEmpresa(),
				new Moduloiii01().getSecCap(getListFields(this, new String[] {
						"C3P301" })));
		if (bean1 == null) {
			bean1 = new Moduloiii01();
			bean1.id = App.getInstance().getEmpresa().id;
		}
	//	lstDetalle = getCuestionarioService().getModuloIII_det(bean1, campos);

//		bean1 = getCuestionarioService().getModuloiii01(
//				App.getInstance().getEmpresa(),			
//				new Moduloiii01().getSecCap(Util.getListList("C3P301A_T1", "C3P301A_T2" , "C3P301A_11")));
//		if (bean1 == null) {
//			bean1 = new Moduloiii01();
//			bean1.id = App.getInstance().getEmpresa().id;
//		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		onchbP1pChanged(rgC3P326_1, txtC3P326_A1, rgC3P326_B1, rgC3P326_C1);
		onchbP1pChanged(rgC3P326_2, txtC3P326_A2, rgC3P326_B2, rgC3P326_C2);
		onchbP1pChanged(rgC3P326_3, txtC3P326_A3, rgC3P326_B3, rgC3P326_C3);
		onchbP1pChanged(rgC3P326_4, txtC3P326_A4, rgC3P326_B4, rgC3P326_C4);
		onchbP1pChanged(rgC3P326_5, txtC3P326_A5, rgC3P326_B5, rgC3P326_C5);
		onchbP1pChanged(rgC3P326_6, txtC3P326_A6, rgC3P326_B6, rgC3P326_C6);
		onchbP1pChanged(rgC3P326_7, txtC3P326_A7, rgC3P326_B7, rgC3P326_C7);
		onchbP1pChanged(rgC3P326_8, txtC3P326_A8, rgC3P326_B8, rgC3P326_C8);
		onchbP1pChanged(rgC3P326_9, txtC3P326_A9, rgC3P326_B9, rgC3P326_C9);
		onchbP1pChanged(rgC3P326_10, txtC3P326_A10, rgC3P326_B10, rgC3P326_C10,
				txtC3P326_10ESP);
//		FuncionRGP326Extra();
		FuncioneEXTRA();
		rgC3P323.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public void FuncionRGP326(FieldComponent component) {
		RadioGroupOtherField rg = (RadioGroupOtherField) component;
		if (rg.isPressed()) {
			if (rg.equals(rgC3P326_1))
				onchbP1pChanged(rg, txtC3P326_A1, rgC3P326_B1,rgC3P326_C1);
			else if (rg.equals(rgC3P326_2))
				onchbP1pChanged(rg, txtC3P326_A2, rgC3P326_B2,rgC3P326_C2);
			else if (rg.equals(rgC3P326_3))
				onchbP1pChanged(rg, txtC3P326_A3, rgC3P326_B3,rgC3P326_C3);
			else if (rg.equals(rgC3P326_4))
				onchbP1pChanged(rg, txtC3P326_A4, rgC3P326_B4,rgC3P326_C4);
			else if (rg.equals(rgC3P326_5))
				onchbP1pChanged(rg, txtC3P326_A5, rgC3P326_B5,rgC3P326_C5);
			else if (rg.equals(rgC3P326_6))
				onchbP1pChanged(rg, txtC3P326_A6, rgC3P326_B6,rgC3P326_C6);
			else if (rg.equals(rgC3P326_7))
				onchbP1pChanged(rg, txtC3P326_A7, rgC3P326_B7,rgC3P326_C7);
			else if (rg.equals(rgC3P326_8))
				onchbP1pChanged(rg, txtC3P326_A8, rgC3P326_B8,rgC3P326_C8);
			else if (rg.equals(rgC3P326_9))
				onchbP1pChanged(rg, txtC3P326_A9, rgC3P326_B9,rgC3P326_C9);
			else if (rg.equals(rgC3P326_10))
				onchbP1pChanged(rg, txtC3P326_A10, rgC3P326_B10,rgC3P326_C10,
						txtC3P326_10ESP);
			setNextFocusRequest(rg);
		}
	}

	public void onchbP1pChanged(RadioGroupOtherField rg, View... views) {
		int valor = rg.getTagSelectedInteger(-1);
		if (valor == 1) {
			lockView(false, views);
		} else {
			cleanAndLockView(views);
		}
	}

	public boolean validarp1(RadioGroupOtherField rg, IntegerField txt1,
			RadioGroupOtherField txt2, RadioGroupOtherField txt3, String msg) {
		return validarp1(rg, txt1, txt2, txt3, msg, null);
	}

	public boolean validarp1(RadioGroupOtherField rg, IntegerField txt1,
			RadioGroupOtherField txt2,RadioGroupOtherField txt3, String msg, TextField otro) {
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		error = false;

		if (Util.esVacio(rg)) {
			mensaje = pregunta_no_vacia.replace("$", msg + ".(Si/No)");
			view = rg;
			return !(error = true);
		}
		if (rg.isTagSelected(1)) {
			if (otro != null && Util.esVacio(otro)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.326 (Especifique)");
				view = otro;
				return !(error = true);
			}
			if(!Util.esVacio(otro) && otro.getText().length() < 3) {
				mensaje = "Ingrese la información correcta";
				view = otro;
				error = true;
				return false;
			}
			if (Util.esVacio(txt1)) {
				mensaje = pregunta_no_vacia.replace("$", msg
						+ ".(Personas capacitadas)");
				view = txt1;
				return !(error = true);
			}
			if (Util.esVacio(txt2)) {
				mensaje = pregunta_no_vacia.replace("$", msg
						+ ".(Participó conductor)");
				view = txt2;
				return !(error = true);
			}
			if (Util.esVacio(txt3)) {
				mensaje = pregunta_no_vacia.replace("$", msg
						+ ".(Se entregaron certificados)");
				view = txt3;
				return !(error = true);
			}
		}

		return true;
	}

//	public void FuncionRGP326Extra() {
//		Integer valor1 = Integer.parseInt(rgC3P326_2.getTagSelected("0")
//				.toString());
//		Integer valor2 = Integer.parseInt(rgC3P326_6.getTagSelected("0")
//				.toString());
//		if (valor1 == 1) {
//			Util.lockView(getActivity(), false, rgC3P326A);
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC3P326A);
//		}
//
//		if (valor2 == 1) {
//			Util.lockView(getActivity(), false, rgC3P326B);
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC3P326B);
//		}
//
//	}

	public void FuncioneEXTRA() {
		if (rgC3P326_1.isTagSelected(2) && rgC3P326_2.isTagSelected(2)
				&& rgC3P326_3.isTagSelected(2) && rgC3P326_4.isTagSelected(2)
				&& rgC3P326_5.isTagSelected(2) && rgC3P326_6.isTagSelected(2)
				&& rgC3P326_7.isTagSelected(2) && rgC3P326_8.isTagSelected(2)
				&& rgC3P326_9.isTagSelected(2) && rgC3P326_10.isTagSelected(2)) {
		//	Util.cleanAndLockView(getActivity(), txtC3P326_A_TOT);
		} else {
		//	Util.lockView(getActivity(), false, txtC3P326_A_TOT);
		}
	}

	public void onM3P025ChangeValue() {
		RadioGroupOtherField crg = ((RadioGroupOtherField) rgC3P325);
		if (crg.getTagSelected("0").toString().equals("1")) {
			Util.lockView(getActivity(), false, rgC3P326_1, rgC3P326_2,
					rgC3P326_3, rgC3P326_4, rgC3P326_5, rgC3P326_6, rgC3P326_7,
					rgC3P326_8, rgC3P326_9, rgC3P326_10);
			rgC3P326_1.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), rgC3P326_1, rgC3P326_2,
					rgC3P326_3, rgC3P326_4, rgC3P326_5, rgC3P326_6, rgC3P326_7,
					rgC3P326_8, rgC3P326_9, rgC3P326_10, txtC3P326_10ESP,
					 txtC3P326_A1, txtC3P326_A2, txtC3P326_A3,
					txtC3P326_A4, txtC3P326_A5, txtC3P326_A6, txtC3P326_A7,
					txtC3P326_A8);
			if (crg.getCheckedRadioButtonId() != -1
					&& crg.findViewById(crg.getCheckedRadioButtonId())
							.isPressed()) {
				if (!grabar()) {
					return;
				}
				parent.nextFragment(CuestionarioFragmentActivity.MODULO_III + 8);// revisar
			}
		}
	}

}

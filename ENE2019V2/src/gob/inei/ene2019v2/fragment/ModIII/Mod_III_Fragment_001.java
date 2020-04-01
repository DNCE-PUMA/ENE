package gob.inei.ene2019v2.fragment.ModIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
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
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloiii02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_III_Fragment_001 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public IntegerField txtC3P301A_1;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC3P301B_1;
	@FieldAnnotation(orderIndex = 3)
	public IntegerField txtC3P301C_1;
	@FieldAnnotation(orderIndex = 4)
	public IntegerField txtC3P301D_1;

	@FieldAnnotation(orderIndex = 5)
	public IntegerField txtC3P301A_2;
	@FieldAnnotation(orderIndex = 6)
	public IntegerField txtC3P301B_2;
	@FieldAnnotation(orderIndex = 7)
	public IntegerField txtC3P301C_2;
	@FieldAnnotation(orderIndex = 8)
	public IntegerField txtC3P301D_2;

	@FieldAnnotation(orderIndex = 9)
	public IntegerField txtC3P301A_3;
	@FieldAnnotation(orderIndex = 10)
	public IntegerField txtC3P301B_3;
	@FieldAnnotation(orderIndex = 11)
	public IntegerField txtC3P301C_3;
	@FieldAnnotation(orderIndex = 12)
	public IntegerField txtC3P301D_3;

	@FieldAnnotation(orderIndex = 13)
	public IntegerField txtC3P301A_4;
	@FieldAnnotation(orderIndex = 14)
	public IntegerField txtC3P301B_4;
	@FieldAnnotation(orderIndex = 15)
	public IntegerField txtC3P301C_4;
	@FieldAnnotation(orderIndex = 16)
	public IntegerField txtC3P301D_4;

	@FieldAnnotation(orderIndex = 17)
	public IntegerField txtC3P301A_5;
	@FieldAnnotation(orderIndex = 18)
	public IntegerField txtC3P301B_5;
	@FieldAnnotation(orderIndex = 19)
	public IntegerField txtC3P301C_5;
	@FieldAnnotation(orderIndex = 20)
	public IntegerField txtC3P301D_5;

	@FieldAnnotation(orderIndex = 21)
	public IntegerField txtC3P301A_T1;
	@FieldAnnotation(orderIndex = 22)
	public IntegerField txtC3P301B_T1;//
	@FieldAnnotation(orderIndex = 23)
	public IntegerField txtC3P301C_T1;//
	@FieldAnnotation(orderIndex = 24)
	public IntegerField txtC3P301D_T1;

	@FieldAnnotation(orderIndex = 25)
	public IntegerField txtC3P301A_6;
	@FieldAnnotation(orderIndex = 26)
	public IntegerField txtC3P301B_6;
	@FieldAnnotation(orderIndex = 27)
	public IntegerField txtC3P301C_6;

	@FieldAnnotation(orderIndex = 28)
	public IntegerField txtC3P301A_7;
	@FieldAnnotation(orderIndex = 29)
	public IntegerField txtC3P301B_7;
	@FieldAnnotation(orderIndex = 30)
	public IntegerField txtC3P301C_7;

	@FieldAnnotation(orderIndex = 31)
	public IntegerField txtC3P301A_8;
	@FieldAnnotation(orderIndex = 32)
	public IntegerField txtC3P301B_8;
	@FieldAnnotation(orderIndex = 33)
	public IntegerField txtC3P301C_8;

	@FieldAnnotation(orderIndex = 34)
	public IntegerField txtC3P301A_9;
	@FieldAnnotation(orderIndex = 35)
	public IntegerField txtC3P301B_9;
	@FieldAnnotation(orderIndex = 36)
	public IntegerField txtC3P301C_9;

	@FieldAnnotation(orderIndex = 37)
	public IntegerField txtC3P301A_10;
	@FieldAnnotation(orderIndex = 38)
	public IntegerField txtC3P301B_10;
	@FieldAnnotation(orderIndex = 39)
	public IntegerField txtC3P301C_10;

	@FieldAnnotation(orderIndex = 40)
	public IntegerField txtC3P301A_T2;
	@FieldAnnotation(orderIndex = 41)
	public IntegerField txtC3P301B_T2;
	@FieldAnnotation(orderIndex = 42)
	public IntegerField txtC3P301C_T2;

	@FieldAnnotation(orderIndex = 43)
	public IntegerField txtC3P301A_11;
	@FieldAnnotation(orderIndex = 44)
	public IntegerField txtC3P301B_11;
	@FieldAnnotation(orderIndex = 45)
	public IntegerField txtC3P301C_11;
	@FieldAnnotation(orderIndex = 46)
	public IntegerField txtTOTAL;
	private static int pad;
	private static Drawable unFocus;
	
	private CuestionarioService cuestionarioService;
	private Moduloiii01 bean;
	private Moduloiii02 bean2;
	private Caratula caratula;
	private LabelComponent lblTitulo, lblCab1, lblCab2, lblCab3, lblCabTot,
			lblCabH, lblCabM, lblCabTotD, lblCabHD, lblCabMD, lblCab3D,
			lblFile1, lblFile2, lblFile3, lblFile4, lblFile5, lblFile6,
			lblFile7, lblFile8, lblFile9, lblFile10, lblFile11, lblFile12,
			lblFile13;
	private GridComponent2 gridmod3;
	SeccionCapitulo[] seccionesGrabado2, campos;
	SeccionCapitulo[] seccionesCargado2;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_III_Fragment_001() {
	}

	public Mod_III_Fragment_001 parent(MasterActivity parent) {
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
		seccionesCargado2 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1,
				-1, "ID") };
		return rootView;
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod3_titulo).textSize(21).centrar().negrita();
		txtC3P301A_1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		//txtC3P301A_1.addTextChangedListener(twFuncionBloqueo);
		txtC3P301A_2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		//txtC3P301A_2.addTextChangedListener(twFuncionBloqueo);
		txtC3P301A_3 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		//txtC3P301A_3.addTextChangedListener(twFuncionBloqueo);
		txtC3P301A_4 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		//txtC3P301A_4.addTextChangedListener(twFuncionBloqueo);
		txtC3P301A_5 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		//txtC3P301A_5.addTextChangedListener(twFuncionBloqueo);
		txtC3P301A_T1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301A_6 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301A_7 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301A_8 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301A_9 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301A_10 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301A_T2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301A_11 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301B_1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_2 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_4 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_5 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_T1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301B_6 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_7 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_8 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_9 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_10 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301B_T2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301B_11 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_2 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_4 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_5 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_T1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301C_6 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_7 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_8 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_9 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_10 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301C_T2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();
		txtC3P301C_11 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301D_1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301D_2 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301D_3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301D_4 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301D_5 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtC3P301D_T1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();

		txtTOTAL = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 100).centrar().readOnly().negrita();

		lblCab1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente * 2 + 40, 300).text(R.string.mod3_cab1)
				.textSize(15).negrita().centrar();
		lblCab2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 300).text(R.string.mod3_cab2)
				.textSize(15).negrita().centrar();
		lblCab3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente * 2, 150).text(R.string.mod3_cab3)
				.textSize(15).negrita().centrar();
		lblCab3D = new LabelComponent(this.getActivity()).size(40, 150)
				.text(R.string.mod3_cab3d).textSize(13).negrita().centrar()
				.colorFondo(R.color.griscabece);
		lblCabTot = new LabelComponent(this.getActivity())
				.size(altoComponente, 100).text(R.string.mod3_cab_tot)
				.textSize(15).negrita().centrar()
				.colorFondo(R.color.griscabece);
		lblCabTotD = new LabelComponent(this.getActivity()).size(40, 100)
				.text(R.string.mod3_cab_totd).textSize(13).negrita().centrar()
				.colorFondo(R.color.griscabece);

		lblCabH = new LabelComponent(this.getActivity())
				.size(altoComponente, 100).text(R.string.mod3_cab_h)
				.textSize(15).negrita().centrar()
				.colorFondo(R.color.griscabece);
		lblCabHD = new LabelComponent(this.getActivity()).size(40, 100)
				.text(R.string.mod3_cab_hd).textSize(13).negrita().centrar()
				.colorFondo(R.color.griscabece);
		lblCabM = new LabelComponent(this.getActivity())
				.size(altoComponente, 100).text(R.string.mod3_cab_m)
				.textSize(15).negrita().centrar()
				.colorFondo(R.color.griscabece);
		lblCabMD = new LabelComponent(this.getActivity()).size(40, 100)
				.text(R.string.mod3_cab_md).textSize(13).negrita().centrar()
				.colorFondo(R.color.griscabece);
		lblFile1 = new LabelComponent(this.getActivity())
				.size(altoComponente + 40, 300).text(R.string.mod3_file1)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile2 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file2)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile3 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file3)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile4 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file4)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile5 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file5)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile6 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 10, 300).text(R.string.mod3_file6)
				.textSize(15).negrita().alinearIzquierda();
		lblFile7 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file7)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile8 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file8)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile9 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file9)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile10 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file10)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile11 = new LabelComponent(this.getActivity())
				.size(altoComponente + 10, 300).text(R.string.mod3_file11)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);
		lblFile12 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 10, 300).text(R.string.mod3_file12)
				.textSize(15).negrita().alinearIzquierda();
		lblFile13 = new LabelComponent(this.getActivity())
				.size(altoComponente + 50, 300).text(R.string.mod3_file13)
				.textSize(15).negrita().alinearIzquierda()
				.colorFondo(R.color.WhiteSmoke);

		gridmod3 = new GridComponent2(this.getActivity(),
				Gravity.CENTER_VERTICAL, 5);
		gridmod3.addComponent(1, 3, lblCab1);
		gridmod3.addComponent(3, 1, lblCab2);
		gridmod3.addComponent(1, 3, lblCab3);
		gridmod3.addComponent(lblCabTot);
		gridmod3.addComponent(lblCabH);
		gridmod3.addComponent(lblCabM);
		gridmod3.addComponent(lblCabTotD);
		gridmod3.addComponent(lblCabHD);
		gridmod3.addComponent(lblCabMD);
		// gridmod3.addComponent(lblCab3D);
		gridmod3.addComponent(lblFile1);
		gridmod3.addComponent(txtC3P301A_1);
		gridmod3.addComponent(txtC3P301B_1);
		gridmod3.addComponent(txtC3P301C_1);
		gridmod3.addComponent(txtC3P301D_1);
		gridmod3.addComponent(lblFile2);
		gridmod3.addComponent(txtC3P301A_2);
		gridmod3.addComponent(txtC3P301B_2);
		gridmod3.addComponent(txtC3P301C_2);
		gridmod3.addComponent(txtC3P301D_2);
		gridmod3.addComponent(lblFile3);
		gridmod3.addComponent(txtC3P301A_3);
		gridmod3.addComponent(txtC3P301B_3);
		gridmod3.addComponent(txtC3P301C_3);
		gridmod3.addComponent(txtC3P301D_3);
		gridmod3.addComponent(lblFile4);
		gridmod3.addComponent(txtC3P301A_4);
		gridmod3.addComponent(txtC3P301B_4);
		gridmod3.addComponent(txtC3P301C_4);
		gridmod3.addComponent(txtC3P301D_4);
		gridmod3.addComponent(lblFile5);
		gridmod3.addComponent(txtC3P301A_5);
		gridmod3.addComponent(txtC3P301B_5);
		gridmod3.addComponent(txtC3P301C_5);
		gridmod3.addComponent(txtC3P301D_5);
		gridmod3.addComponent(lblFile6);
		gridmod3.addComponent(txtC3P301A_T1);
		gridmod3.addComponent(txtC3P301B_T1);
		gridmod3.addComponent(txtC3P301C_T1);
		gridmod3.addComponent(txtC3P301D_T1);
		gridmod3.addComponent(lblFile7);
		gridmod3.addComponent(txtC3P301A_6);
		gridmod3.addComponent(txtC3P301B_6);
		gridmod3.addComponent(txtC3P301C_6);
		gridmod3.addComponent(new LabelComponent(this.getActivity()).size(
				altoComponente, 100).colorFondo(R.color.griscabece));
		gridmod3.addComponent(lblFile8);
		gridmod3.addComponent(txtC3P301A_7);
		gridmod3.addComponent(txtC3P301B_7);
		gridmod3.addComponent(txtC3P301C_7);
		gridmod3.addComponent(new LabelComponent(this.getActivity()).size(
				altoComponente, 100).colorFondo(R.color.griscabece));
		gridmod3.addComponent(lblFile9);
		gridmod3.addComponent(txtC3P301A_8);
		gridmod3.addComponent(txtC3P301B_8);
		gridmod3.addComponent(txtC3P301C_8);
		gridmod3.addComponent(new LabelComponent(this.getActivity()).size(
				altoComponente, 100).colorFondo(R.color.griscabece));
		gridmod3.addComponent(lblFile10);
		gridmod3.addComponent(txtC3P301A_9);
		gridmod3.addComponent(txtC3P301B_9);
		gridmod3.addComponent(txtC3P301C_9);
		gridmod3.addComponent(new LabelComponent(this.getActivity()).size(
				altoComponente, 100).colorFondo(R.color.griscabece));
		gridmod3.addComponent(lblFile11);
		gridmod3.addComponent(txtC3P301A_10);
		gridmod3.addComponent(txtC3P301B_10);
		gridmod3.addComponent(txtC3P301C_10);
		gridmod3.addComponent(new LabelComponent(this.getActivity()).size(
				altoComponente, 100).colorFondo(R.color.griscabece));
		gridmod3.addComponent(lblFile12);
		gridmod3.addComponent(txtC3P301A_T2);
		gridmod3.addComponent(txtC3P301B_T2);
		gridmod3.addComponent(txtC3P301C_T2);
		gridmod3.addComponent(new LabelComponent(this.getActivity()).size(
				altoComponente, 100).colorFondo(R.color.griscabece));
		gridmod3.addComponent(lblFile13);
		gridmod3.addComponent(txtC3P301A_11);
		gridmod3.addComponent(txtC3P301B_11);
		gridmod3.addComponent(txtC3P301C_11);
		gridmod3.addComponent(new LabelComponent(this.getActivity()).size(
				altoComponente, 100).colorFondo(R.color.griscabece));
		gridmod3.component();

//		Filtros.setFiltro(txtC3P301A_1, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_2, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_3, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_4, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_5, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_T1, Filtros.TIPO.NUMBER, 6, -1, null, 0,
//				299990);
//		Filtros.setFiltro(txtC3P301A_6, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_7, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_8, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_9, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_10, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301A_T2, Filtros.TIPO.NUMBER, 6, -1, null, 0,
//				299990);
//		Filtros.setFiltro(txtC3P301A_11, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//
//		Filtros.setFiltro(txtC3P301B_1, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_2, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_3, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_4, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_5, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_T1, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301B_6, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_7, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_8, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_9, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_10, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301B_T2, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301B_11, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_1, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_2, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_3, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_4, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_5, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_T1, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301C_6, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_7, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_8, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_9, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_10, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301C_T2, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				59998);
//		Filtros.setFiltro(txtC3P301C_11, Filtros.TIPO.NUMBER, 5, -1, null, 0,
//				29999);
//		Filtros.setFiltro(txtC3P301D_1, Filtros.TIPO.NUMBER, 5, -1, null, 750,
//				59998, -1, 3);
//		Filtros.setFiltro(txtC3P301D_2, Filtros.TIPO.NUMBER, 5, -1, null, 300,
//				59998, -1, 3);
//		Filtros.setFiltro(txtC3P301D_3, Filtros.TIPO.NUMBER, 5, -1, null, 300,
//				59998, -1, 3);
//		Filtros.setFiltro(txtC3P301D_4, Filtros.TIPO.NUMBER, 5, -1, null, 300,
//				59998, -1, 3);
//		Filtros.setFiltro(txtC3P301D_5, Filtros.TIPO.NUMBER, 5, -1, null, 300,
//				59998, -1, 3);
//		Filtros.setFiltro(txtC3P301D_T1, Filtros.TIPO.NUMBER, 6, -1, null, 0,
//				299990);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.mod3_preg1, gridmod3);
		q2 = createQuestionSection(txtTOTAL);
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
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
		String[] extras = null;
		try {
			int TOTGeneral = Util.getInt(txtTOTAL.getText().toString())+ Util.getInt(txtC3P301A_11.getText().toString());
			
//			if (Util.esVacio(bean.c3p301b_1))
//				bean.c3p301b_1=0;
//			if (Util.esVacio(bean.c3p301b_2))
//				bean.c3p301b_2=0;	
//			if (Util.esVacio(bean.c3p301b_3))
//				bean.c3p301b_3=0;	
//			if (Util.esVacio(bean.c3p301b_4))
//				bean.c3p301b_4=0;
//			if (Util.esVacio(bean.c3p301b_5))
//				bean.c3p301b_5=0;
//			if (Util.esVacio(bean.c3p301b_6))
//				bean.c3p301b_6=0;
//			if (Util.esVacio(bean.c3p301b_7))
//				bean.c3p301b_7=0;
//			if (Util.esVacio(bean.c3p301b_8))
//				bean.c3p301b_8=0;
//			if (Util.esVacio(bean.c3p301b_9))
//				bean.c3p301b_9=0;
//			if (Util.esVacio(bean.c3p301b_10))
//				bean.c3p301b_10=0;
//			if (Util.esVacio(bean.c3p301b_11))
//				bean.c3p301b_11=0;
//			
//			if (Util.esVacio(bean.c3p301c_1))
//				bean.c3p301c_1=0;
//			if (Util.esVacio(bean.c3p301c_2))
//				bean.c3p301c_2=0;	
//			if (Util.esVacio(bean.c3p301c_3))
//				bean.c3p301c_3=0;	
//			if (Util.esVacio(bean.c3p301c_4))
//				bean.c3p301c_4=0;
//			if (Util.esVacio(bean.c3p301c_5))
//				bean.c3p301c_5=0;
//			if (Util.esVacio(bean.c3p301c_6))
//				bean.c3p301c_6=0;
//			if (Util.esVacio(bean.c3p301c_7))
//				bean.c3p301c_7=0;
//			if (Util.esVacio(bean.c3p301c_8))
//				bean.c3p301c_8=0;
//			if (Util.esVacio(bean.c3p301c_9))
//				bean.c3p301c_9=0;
//			if (Util.esVacio(bean.c3p301c_10))
//				bean.c3p301c_10=0;
//			if (Util.esVacio(bean.c3p301c_11))
//				bean.c3p301c_11=0;
			
//			if (Util.getInt(txtTOTAL.getText().toString()) > 1) { //Actualizado 2019
			if (Util.getInt(TOTGeneral) > 1) {			
			//	Log.e("ENTROOOOOOOOOOO X1", "" + TOTGeneral);
				
			//	txtC3P301B_1.setValue(Util.esVacio(txtC3P301B_1) ? 0 : txtC3P301B_1.getText().toString());
			 // 	Util.esVacio(bean.c3p301b_1)  ?  0  : txtC3P301B_1.getText().toString(); 

				
				if (!getCuestionarioService().saveOrUpdate(bean,
						bean.getSecCap(getListFields(this)))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (Util.getInt(TOTGeneral) < 2
					&& Util.getInt(caratula.p25) < 3) { 
			//	Log.e("ENTROOOOOOOOOOO X2", "" + TOTGeneral);
				if (!getCuestionarioService().saveOrUpdate(
						bean, 
						bean.getSecCap(getListFields(this, new String[] {
								"C3P302A_1", "C3P302A_2", "C3P302A_3",
								"C3P302A_4", "C3P302A_5", "C3P302A_6",
								"C3P302A_7", "C3P302A_8", "C3P302B_1",
								"C3P302B_2", "C3P302B_3", "C3P302B_4",
								"C3P302B_5", "C3P302B_6", "C3P302B_7",
								"C3P302B_8", "C3P302C_1", "C3P302C_2",
								"C3P302C_3", "C3P302C_4", "C3P302C_5",
								"C3P302C_6", "C3P302C_7", "C3P302C_8",
								"C3P302A_A1", "C3P302A_A2", "C3P302A_A3",
								"C3P302A_A4", "C3P302A_A5", "C3P302A_A6",
								"C3P302A_A6ESP", "C3P303_1", "C3P303_2",
								"C3P303_3", "C3P304_1", "C3P304_2", "C3P304_3",
								"C3P305", "C3P306", "C3P307", "C3P308_1",
								"C3P308_2", "C3P308_3", "C3P308_4", "C3P308_5", "C3P308_1A",
								"C3P308_5ESP", "C3P309", "C3P310_1",
								"C3P310_2", "C3P310_3", "C3P310_4", "C3P310_5",
								"C3P310_6", "C3P310_7", "C3P310_8",
								"C3P310_8ESP", "C3P311_1", "C3P311_2",
								"C3P311_3", "C3P311_4", "C3P311_5", "C3P311_6",
								"C3P311_7", "C3P311_8", "C3P311_8ESP",
								"C3P312", "C3P313", "C3P314_1", "C3P314_2",
								"C3P314_3", "C3P314_4", "C3P314_5", "C3P314_6",
								"C3P314_7", "C3P314_8", "C3P314_9",
								"C3P314_10",  "C3P314_10ESP",
								"C3P314A_1", "C3P314A_2", "C3P314A_3",
								"C3P314A_4", "C3P314A_5", "C3P314A_6",
								"C3P314A_7",  "C3P314A_7ESP" , "C3P314A_8" })))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
				extras = new String[] { "C3P315_1", "C3P315_2", "C3P315_3",
						"C3P315_4", "C3P315_5", "C3P316",  "C3P318",
						"C3P319", "C3P319_ESP", "C3P320", "C3P321_1",
						"C3P321_2", "C3P321_3", "C3P321_4", "C3P321_5",
						"C3P321_6", "C3P321_7", "C3P321_8", "C3P321_9",
						"C3P321_10", "C3P321_11", "C3P321_12", "C3P321_13",
						"C3P321_14", "C3P321_14ESP",  "C3P322",
						"C3P323", "C3P324", "C3P325", "C3P326_1", "C3P326_2",
						"C3P326_3", "C3P326_4", "C3P326_5", "C3P326_6",
						"C3P326_7", "C3P326_8", "C3P326_9", "C3P326_10",
						"C3P326_10ESP", "C3P326_A1", "C3P326_A2", "C3P326_A3",
						"C3P326_A4", "C3P326_A5", "C3P326_A6", "C3P326_A7",
						"C3P326_A8", "C3P326_A9", "C3P326_A10", "C3P326_A_TOT",
						"C3P326_B1", "C3P326_B2", "C3P326_B3", "C3P326_B4",
						"C3P326_B5", "C3P326_B6", "C3P326_B7", "C3P326_B8",
						"C3P326_B9", "C3P326_B10", "C3P326A", "C3P326B",
						"C3P327", "C3P329", "C3P329_ESP", "C3P329A", "C3P330",
						"C3P331" };
				if (!getCuestionarioService().saveOrUpdate(bean2,
						bean2.getSecCap(getListFields(this, extras)))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (Util.getInt(TOTGeneral) < 2
					&& Util.getInt(caratula.p25) > 2) { // Va a 400
			//	Log.e("ENTROOOOOOOOOOO X3", "" + TOTGeneral);
				getCuestionarioService().borrarModuloiii02(caratula.id);
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C3P302A_1", "C3P302A_2", "C3P302A_3",
								"C3P302A_4", "C3P302A_5", "C3P302A_6",
								"C3P302A_7", "C3P302A_8", "C3P302B_1",
								"C3P302B_2", "C3P302B_3", "C3P302B_4",
								"C3P302B_5", "C3P302B_6", "C3P302B_7",
								"C3P302B_8", "C3P302C_1", "C3P302C_2",
								"C3P302C_3", "C3P302C_4", "C3P302C_5",
								"C3P302C_6", "C3P302C_7", "C3P302C_8",
								"C3P302A_A1", "C3P302A_A2", "C3P302A_A3",
								"C3P302A_A4", "C3P302A_A5", "C3P302A_A6",
								"C3P302A_A6ESP", "C3P303_1", "C3P303_2",
								"C3P303_3", "C3P304_1", "C3P304_2", "C3P304_3",
								"C3P305", "C3P306", "C3P307", "C3P308_1",
								"C3P308_2", "C3P308_3", "C3P308_4", "C3P308_5",
								"C3P308_5ESP", "C3P309", "C3P310_1",
								"C3P310_2", "C3P310_3", "C3P310_4", "C3P310_5",
								"C3P310_6", "C3P310_7", "C3P310_8",
								"C3P310_8ESP", "C3P311_1", "C3P311_2",
								"C3P311_3", "C3P311_4", "C3P311_5", "C3P311_6",
								"C3P311_7", "C3P311_8", "C3P311_8ESP",
								"C3P312", "C3P313", "C3P314_1", "C3P314_2",
								"C3P314_3", "C3P314_4", "C3P314_5", "C3P314_6",
								"C3P314_7", "C3P314_8", "C3P314_9",
								"C3P314_10",  "C3P314_10ESP",
								"C3P314A_1", "C3P314A_2", "C3P314A_3",
								"C3P314A_4", "C3P314A_5", "C3P314A_6",
								"C3P314A_7",  "C3P314A_7ESP" , "C3P314A_8" })))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
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

//		for (int i = 1; i <= 11; i++) {
//			IntegerField x = ((IntegerField) getView("txtC3P301B_" + (i)));
//			if (Util.esVacio(x)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"Promedio Anual de Personal Ocupado");
//				view = x;
//				return !(error = true);
//			}
//			IntegerField y = ((IntegerField) getView("txtC3P301C_" + (i)));
//			if (Util.esVacio(y)) {
//				mensaje = pregunta_no_vacia.replace("$",
//						"Promedio Anual de Personal Ocupado");
//				view = y;
//				return !(error = true);
//			}
//		}

		if (Util.getInt(txtC3P301A_1.getText().toString()) > 0) {
			if (Util.esVacio(txtC3P301D_1)) {
				mensaje = pregunta_no_vacia.replace("$",
						"Remuneración Promedio Mensual");
				view = txtC3P301D_1;
				return !(error = true);
			}
		}
		
		if (Util.getInt(txtC3P301D_1.getText().toString()) > 0) {
			if (Util.getInt(txtC3P301A_1.getText().toString()) == 0  ) {
				mensaje = "Si no tiene personal (0), no debe tener promedio de remuneracion mensual";
				view = txtC3P301D_1;
				return !(error = true);
			}
		}
		
		
		if (Util.getInt(txtC3P301A_1.getText().toString()) > 0 && 
			( Util.getInt(txtC3P301D_1.getText().toString()) < 1000 || Util.getInt(txtC3P301D_1.getText().toString()) > 50000	 )
		 ) {
			mensaje = "Verificar: Ítem 1 - El promedio del sueldo mensual es menor a 1000 soles o mayor a 50000 soles";
			view = txtC3P301D_1;
			return !(error = true);			
		}
		
		
		if (Util.getInt(txtC3P301A_2.getText().toString()) > 0) {
			if (Util.esVacio(txtC3P301D_2)) {
				mensaje = pregunta_no_vacia.replace("$",
						"Remuneración Promedio Mensual");
				view = txtC3P301D_2;
				return !(error = true);
			}
		}

		if (Util.getInt(txtC3P301D_2.getText().toString()) > 0) {
			if (Util.getInt(txtC3P301A_2.getText().toString()) == 0  ) {
				mensaje = "Promedio mensual inconsistente";
				view = txtC3P301D_2;
				return !(error = true);
			}
		}
		
		if (Util.getInt(txtC3P301A_2.getText().toString()) > 0 && 
				( Util.getInt(txtC3P301D_2.getText().toString()) < 400   || Util.getInt(txtC3P301D_2.getText().toString()) > 15000	 )
			 ) {
				mensaje = "Verificar: Ítem 2 - El promedio del sueldo mensual es menor a 400 soles o mayor a 15000 soles ";
				view = txtC3P301D_2;
				return !(error = true);				
		}
		
		
		if (Util.getInt(txtC3P301A_3.getText().toString()) > 0) {
			if (Util.esVacio(txtC3P301D_3)) {
				mensaje = pregunta_no_vacia.replace("$",
						"Remuneración Promedio Mensual");
				view = txtC3P301D_3;
				return !(error = true);
			}
		}
		
		if (Util.getInt(txtC3P301A_3.getText().toString()) > 0 && 
				( Util.getInt(txtC3P301D_3.getText().toString()) < 400  || Util.getInt(txtC3P301D_3.getText().toString()) > 15000	 )
			 ) {
				mensaje = "Verificar: Ítem 3 - El promedio del sueldo mensual es menor a 400 soles o mayor a 15000 soles  ";
				view = txtC3P301D_3;
				return !(error = true);				
		}
		
		if (Util.getInt(txtC3P301A_4.getText().toString()) > 0) {
			if (Util.esVacio(txtC3P301D_4)) {
				mensaje = pregunta_no_vacia.replace("$",
						"Remuneración Promedio Mensual");
				view = txtC3P301D_4;
				return !(error = true);
			}
		}
		if (Util.getInt(txtC3P301D_4.getText().toString()) > 0) {
			if (Util.getInt(txtC3P301A_4.getText().toString()) == 0  ) {
				mensaje = "Promedio mensual inconsistente";
				view = txtC3P301D_4;
				return !(error = true);
			}
		}
		if (Util.getInt(txtC3P301A_4.getText().toString()) > 0 && 
				( Util.getInt(txtC3P301D_4.getText().toString()) < 400 || Util.getInt(txtC3P301D_4.getText().toString()) > 15000	 )
			 ) {
				mensaje = "Verificar: Ítem 4 - El promedio del sueldo mensual es menor a 400 soles o mayor a 15000 soles ";
				view = txtC3P301D_4;
				return !(error = true);				
		}
		
		
		if (Util.getInt(txtC3P301A_5.getText().toString()) > 0) {
			if (Util.esVacio(txtC3P301D_5)) {
				mensaje = pregunta_no_vacia.replace("$",
						"Remuneración Promedio Mensual");
				view = txtC3P301D_5;
				return !(error = true);
			}
		}
		
		if (Util.getInt(txtC3P301D_5.getText().toString()) > 0) {
			if (Util.getInt(txtC3P301A_5.getText().toString()) == 0  ) {
				mensaje = "Promedio mensual inconsistente";
				view = txtC3P301D_5;
				return !(error = true);
			}
		}
		
		if (Util.getInt(txtC3P301A_5.getText().toString()) > 0 && 
				( Util.getInt(txtC3P301D_5.getText().toString()) < 400 || Util.getInt(txtC3P301D_5.getText().toString()) > 15000	 )
			 ) {
				mensaje = "Verificar: Ítem 5 - El promedio del sueldo mensual es menor a 400 soles o mayor a 15000 soles  ";
				view = txtC3P301D_4;
				return !(error = true);				
		}
		
		
		int Total = Util.getInt(txtC3P301A_T1.getText().toString()) + Util.getInt(txtC3P301A_T2.getText().toString()) + Util.getInt(txtC3P301A_11.getText().toString());
		if (Util.getInt(Total) == 0) {
			mensaje = "Debe registrar al menos un Trabajador en P301.";
			view = txtC3P301A_T2;
			error = true;
			return false;
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		caratula = App.getInstance().getEmpresa();

		bean = getCuestionarioService().getModuloiii01(
				App.getInstance().getEmpresa(),
				new Moduloiii01().getSecCap(getListFields(this)));
		bean2 = getCuestionarioService().getModuloiii02(
				App.getInstance().getEmpresa(), seccionesCargado2);

		if (bean == null) {
			bean = new Moduloiii01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		if (bean2 == null) {
			bean2 = new Moduloiii02();
			bean2.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		q2.setVisibility(view.GONE);
		
		txtC3P301B_1.requestFocus();			
//		txtC3P301B_1.setValue(Util.esVacio(txtC3P301B_1) ? 0 : txtC3P301B_1.getText().toString());
//		txtC3P301B_2.setValue(Util.esVacio(txtC3P301B_2) ? 0 : txtC3P301B_2.getText().toString());
//		txtC3P301B_3.setValue(Util.esVacio(txtC3P301B_3) ? 0 : txtC3P301B_3.getText().toString());
//		txtC3P301B_4.setValue(Util.esVacio(txtC3P301B_4) ? 0 : txtC3P301B_4.getText().toString());
//		txtC3P301B_5.setValue(Util.esVacio(txtC3P301B_5) ? 0 : txtC3P301B_5.getText().toString());
//		txtC3P301B_6.setValue(Util.esVacio(txtC3P301B_6) ? 0 : txtC3P301B_6.getText().toString());
//		txtC3P301B_7.setValue(Util.esVacio(txtC3P301B_7) ? 0 : txtC3P301B_7.getText().toString());
//		txtC3P301B_8.setValue(Util.esVacio(txtC3P301B_8) ? 0 : txtC3P301B_8.getText().toString());
//		txtC3P301B_9.setValue(Util.esVacio(txtC3P301B_9) ? 0 : txtC3P301B_9.getText().toString());
//		txtC3P301B_10.setValue(Util.esVacio(txtC3P301B_10) ? 0 : txtC3P301B_10.getText().toString());
//		txtC3P301B_11.setValue(Util.esVacio(txtC3P301B_11) ? 0 : txtC3P301B_11.getText().toString());		
//		
//		txtC3P301C_1.setValue(Util.esVacio(txtC3P301C_1) ? 0 : txtC3P301C_1.getText().toString());
//		txtC3P301C_2.setValue(Util.esVacio(txtC3P301C_2) ? 0 : txtC3P301C_2.getText().toString());
//		txtC3P301C_3.setValue(Util.esVacio(txtC3P301C_3) ? 0 : txtC3P301C_3.getText().toString());
//		txtC3P301C_4.setValue(Util.esVacio(txtC3P301C_4) ? 0 : txtC3P301C_4.getText().toString());
//		txtC3P301C_5.setValue(Util.esVacio(txtC3P301C_5) ? 0 : txtC3P301C_5.getText().toString());
//		txtC3P301C_6.setValue(Util.esVacio(txtC3P301C_6) ? 0 : txtC3P301C_6.getText().toString());
//		txtC3P301C_7.setValue(Util.esVacio(txtC3P301C_7) ? 0 : txtC3P301C_7.getText().toString());
//		txtC3P301C_8.setValue(Util.esVacio(txtC3P301C_8) ? 0 : txtC3P301C_8.getText().toString());
//		txtC3P301C_9.setValue(Util.esVacio(txtC3P301C_9) ? 0 : txtC3P301C_9.getText().toString());
//		txtC3P301C_10.setValue(Util.esVacio(txtC3P301C_10) ? 0 : txtC3P301C_10.getText().toString());
//		txtC3P301C_11.setValue(Util.esVacio(txtC3P301C_11) ? 0 : txtC3P301C_11.getText().toString());		
		txtC3P301B_1.requestFocus();	
	}


	
	private void confSumatorias() {
		Calculo<IntegerField> op1 = new Calculo<IntegerField>(this,
				txtC3P301A_1, 0, 0,
				Util.getListList(txtC3P301B_1, txtC3P301C_1));
		op1.setConfOperacion(false, true);

		Calculo<IntegerField> op2 = new Calculo<IntegerField>(this,
				txtC3P301A_2, 0, 0,
				Util.getListList(txtC3P301B_2, txtC3P301C_2));
		op2.setConfOperacion(false, true);
		Calculo<IntegerField> op3 = new Calculo<IntegerField>(this,
				txtC3P301A_3, 0, 0,
				Util.getListList(txtC3P301B_3, txtC3P301C_3));
		op3.setConfOperacion(false, true);
		Calculo<IntegerField> op4 = new Calculo<IntegerField>(this,
				txtC3P301A_4, 0, 0,
				Util.getListList(txtC3P301B_4, txtC3P301C_4));
		op4.setConfOperacion(false, true);
		Calculo<IntegerField> op5 = new Calculo<IntegerField>(this,
				txtC3P301A_5, 0, 0,
				Util.getListList(txtC3P301B_5, txtC3P301C_5));
		op5.setConfOperacion(false, true);

		Calculo<IntegerField> opA_T1 = new Calculo<IntegerField>(this,
				txtC3P301A_T1, 0, 0, Util.getListList(txtC3P301A_1,
						txtC3P301A_2, txtC3P301A_3, txtC3P301A_4, txtC3P301A_5));
		opA_T1.setConfOperacion(false, true);

		Calculo<IntegerField> opB_T1 = new Calculo<IntegerField>(this,
				txtC3P301B_T1, 0, 0, Util.getListList(txtC3P301B_1,
						txtC3P301B_2, txtC3P301B_3, txtC3P301B_4, txtC3P301B_5));
		opB_T1.setConfOperacion(false, true);

		Calculo<IntegerField> opC_T1 = new Calculo<IntegerField>(this,
				txtC3P301C_T1, 0, 0, Util.getListList(txtC3P301C_1,
						txtC3P301C_2, txtC3P301C_3, txtC3P301C_4, txtC3P301C_5));
		opC_T1.setConfOperacion(false, true);

		Calculo<IntegerField> op6 = new Calculo<IntegerField>(this,
				txtC3P301A_6, 0, 0,
				Util.getListList(txtC3P301B_6, txtC3P301C_6));
		op6.setConfOperacion(false, true);
		Calculo<IntegerField> op7 = new Calculo<IntegerField>(this,
				txtC3P301A_7, 0, 0,
				Util.getListList(txtC3P301B_7, txtC3P301C_7));
		op7.setConfOperacion(false, true);
		Calculo<IntegerField> op8 = new Calculo<IntegerField>(this,
				txtC3P301A_8, 0, 0,
				Util.getListList(txtC3P301B_8, txtC3P301C_8));
		op8.setConfOperacion(false, true);
		Calculo<IntegerField> op9 = new Calculo<IntegerField>(this,
				txtC3P301A_9, 0, 0,
				Util.getListList(txtC3P301B_9, txtC3P301C_9));
		op9.setConfOperacion(false, true);
		Calculo<IntegerField> op10 = new Calculo<IntegerField>(this,
				txtC3P301A_10, 0, 0, Util.getListList(txtC3P301B_10,
						txtC3P301C_10));
		op10.setConfOperacion(false, true);

		Calculo<IntegerField> opA_T2 = new Calculo<IntegerField>(this,
				txtC3P301A_T2, 0, 0, Util.getListList( txtC3P301A_T1, 
						txtC3P301A_6, txtC3P301A_7, txtC3P301A_8, txtC3P301A_9,
						txtC3P301A_10));
		opA_T2.setConfOperacion(false, true);

		Calculo<IntegerField> opB_T2 = new Calculo<IntegerField>(this,
				txtC3P301B_T2, 0, 0, Util.getListList(  txtC3P301B_T1, 
						txtC3P301B_6, txtC3P301B_7, txtC3P301B_8, txtC3P301B_9,
						txtC3P301B_10));
		opB_T2.setConfOperacion(false, true);

		Calculo<IntegerField> opC_T2 = new Calculo<IntegerField>(this,
				txtC3P301C_T2, 0, 0, Util.getListList( txtC3P301C_T1, 
						txtC3P301C_6, txtC3P301C_7, txtC3P301C_8, txtC3P301C_9,
						txtC3P301C_10));
		opC_T2.setConfOperacion(false, true);

		Calculo<IntegerField> op11 = new Calculo<IntegerField>(this,
				txtC3P301A_11, 0, 0, Util.getListList(txtC3P301B_11,
						txtC3P301C_11));
		op11.setConfOperacion(false, true);

		Calculo<IntegerField> opD_T1 = new Calculo<IntegerField>(this,
				txtC3P301D_T1, 0, 0, Util.getListList(txtC3P301D_1,
						txtC3P301D_2, txtC3P301D_3, txtC3P301D_4, txtC3P301D_5));
		opD_T1.setConfOperacion(false, true);

		Calculo<IntegerField> TOTALES = new Calculo<IntegerField>(this,
				txtTOTAL, 0, 0,
				Util.getListList( txtC3P301A_T1 , txtC3P301A_6, txtC3P301A_7,
						txtC3P301A_8, txtC3P301A_9, txtC3P301A_10));
		TOTALES.setConfOperacion(false, true);

	}

	private TextWatcher twFuncionBloqueo = new TextWatcher() {

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

			if (!Util.esVacio(txtC3P301A_1)) {
				if ((Util.getInt(txtC3P301A_1) == 0)) {
					Util.cleanAndLockView(getActivity(), txtC3P301D_1);
				} else {
					Util.lockView(getActivity(), false, txtC3P301D_1);
				}
			}
			if (!Util.esVacio(txtC3P301A_2)) {
				if ((Util.getInt(txtC3P301A_2) == 0)) {
					Util.cleanAndLockView(getActivity(), txtC3P301D_2);
				} else {
					Util.lockView(getActivity(), false, txtC3P301D_2);
				}
			}
			if (!Util.esVacio(txtC3P301A_3)) {
				if ((Util.getInt(txtC3P301A_3) == 0)) {
					Util.cleanAndLockView(getActivity(), txtC3P301D_3);
				} else {
					Util.lockView(getActivity(), false, txtC3P301D_3);
				}
			}
			if (!Util.esVacio(txtC3P301A_4)) {
				if ((Util.getInt(txtC3P301A_4) == 0)) {
					Util.cleanAndLockView(getActivity(), txtC3P301D_4);
				} else {
					Util.lockView(getActivity(), false, txtC3P301D_4);
				}
			}

			if (!Util.esVacio(txtC3P301A_5)) {
				if ((Util.getInt(txtC3P301A_5) == 0)) {
					Util.cleanAndLockView(getActivity(), txtC3P301D_5);
				} else {
					Util.lockView(getActivity(), false, txtC3P301D_5);
				}
			}

		}
	};

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
}

package gob.inei.ene2019v2.fragment.ModVIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.ModuloIII_det;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloviii;
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

public class Mod_VIII_Fragment_002 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public IntegerField txtC8P804_1;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC8P804_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC8P804_N;
//	@FieldAnnotation(orderIndex = 2)
//	public RadioGroupOtherField rgC8P805;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC8P806;
//	@FieldAnnotation(orderIndex = 4)
//	public RadioGroupOtherField rgC8P807;
//	@FieldAnnotation(orderIndex = 5)
//	public CheckBoxField chbC8P807_1;
//	@FieldAnnotation(orderIndex = 6)
//	public RadioGroupOtherField rgC8P808;
//	@FieldAnnotation(orderIndex = 7)
//	public CheckBoxField chbC8P808_1;
//	
	
	private Caratula caratula;
	private CuestionarioService cuestionarioService;
	private Moduloviii bean;
	private Moduloiii01 bean1;
	private List<ModuloIII_det> bean2;
	public GridComponent2 gridpreg807,gridpreg808;
	private LabelComponent lblTitulo, lblTitulox, lblP4,lblP5, lblTitulo1,lblTitulo301,lblTitulo301x;
	private GridComponent gridP4,gridP4x;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_VIII_Fragment_002() {
	}

	public Mod_VIII_Fragment_002 parent(MasterActivity parent) {
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
				.text(R.string.c2c100m8).textSize(21).centrar().negrita();
		lblTitulox = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8_sub1).textSize(20).centrar().negrita();
		lblTitulo1 = new LabelComponent(getActivity())
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8_comentario).textSize(17).centrar()
				.negrita().colorFondo(R.color.amarillo);
		lblTitulo301 = new LabelComponent(getActivity())
				.size(altoComponente +20, 200)
				.text("Total de Empleados Cap. 301").textSize(14).centrar().negrita().colorFondo(R.color.celesteclaro);
		
		lblTitulo301x = new LabelComponent(getActivity())
				.size(altoComponente +20, 200)
				.text("").textSize(14).centrar().negrita().colorFondo(R.color.celesteclaro);
		
		txtC8P804_1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().negrita();
		txtC8P804_2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().negrita().readOnly();
		chbC8P804_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p004_lbl3, "1:0").callback("FuncionCHECK804")
				.size(WRAP_CONTENT, 180);
		txtC8P804_1.addTextChangedListener(twP804);
//		rgC8P805 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c2c100m8p007_1, R.string.c2c100m8p007_2,
//				R.string.c2c100m8p007_3).size(WRAP_CONTENT, 450).orientation(
//				ORIENTATION.HORIZONTAL);
		rgC8P806 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p008_1, R.string.c2c100m8p008_2)
				.size(WRAP_CONTENT, 250).orientation(ORIENTATION.HORIZONTAL);

//		rgC8P807 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
//				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
//				R.string.c2c100m8p002_5, R.string.c2c100m8p002_6,
//				R.string.c2c100m8p002_7).size(WRAP_CONTENT, 350).orientation(
//				ORIENTATION.HORIZONTAL);
//		rgC8P808 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
//				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
//				R.string.c2c100m8p002_5, R.string.c2c100m8p002_6,
//				R.string.c2c100m8p002_7).size(WRAP_CONTENT, 350).orientation(
//				ORIENTATION.HORIZONTAL);
//		
//		chbC8P807_1 = new CheckBoxField(this.getActivity(),
//				R.string.c2c100m8p002_8, "1:0").size(WRAP_CONTENT, 600).callback("OnChangeCheckP807");
//		chbC8P808_1 = new CheckBoxField(this.getActivity(),
//				R.string.c2c100m8p002_8, "1:0").size(WRAP_CONTENT, 600).callback("OnChangeCheckP808");

//		gridpreg807 = new GridComponent2(this.getActivity(),Gravity.CENTER_VERTICAL, 1);
//		gridpreg807.addComponent(rgC8P807);
//		gridpreg807.addComponent(chbC8P807_1);
//		gridpreg807.colorFondo(R.color.WhiteSmoke);
		
//		gridpreg808 = new GridComponent2(this.getActivity(),Gravity.CENTER_VERTICAL, 1);
//		gridpreg808.addComponent(rgC8P808);
//		gridpreg808.addComponent(chbC8P808_1);
//		gridpreg808.colorFondo(R.color.WhiteSmoke);
		
		lblP4 = new LabelComponent(this.getActivity()).size(60, 200)
				.text(R.string.c2c100m8p004_lbl1).textSize(14).centrar();
		lblP5 = new LabelComponent(this.getActivity()).size(60, 200)
				.text(R.string.c2c100m8p004_lbl2).textSize(14).centrar();
		

		gridP4 = new GridComponent(getActivity(), 2);
		gridP4.addComponent(lblP4);
		gridP4.addComponent(txtC8P804_1);
		gridP4.addComponent(lblP5);
		gridP4.addComponent(txtC8P804_2);
		gridP4.addComponent(lblTitulo301);
		gridP4.addComponent(lblTitulo301x);
		gridP4.colorFondo(R.color.transparent);
		
//		gridP4x = new GridComponent(getActivity(), 2);
//		gridP4x.addComponent(lblTitulo301);
//		gridP4x.addComponent(lblTitulo301x);
//		gridP4x.colorFondo(R.color.transparent);
		

		Filtros.setFiltro(txtC8P804_1, Filtros.TIPO.NUMBER, 4, -1, null, 0, 9998);
		Filtros.setFiltro(txtC8P804_2, Filtros.TIPO.NUMBER, 3, -1, null, 0, 100);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulox);
		q1 = createQuestionSection(R.string.c2c100m8p004, gridP4.component(),chbC8P804_N);
//		q2 = createQuestionSection(R.string.c2c100m8p007, rgC8P805);
		q3 = createQuestionSection(R.string.c2c100m8p008, rgC8P806);
//		q4 = createQuestionSection(lblTitulo1);
//		q5 = createQuestionSection(R.string.c2c100m8p005, Gravity.CENTER, LinearLayout.HORIZONTAL, gridpreg807.component());
//		q6 = createQuestionSection(R.string.c2c100m8p006, Gravity.CENTER, LinearLayout.HORIZONTAL, gridpreg808.component());

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
//		form.addView(q2);
		form.addView(q3);
//		form.addView(q4);
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

//		if (Util.esVacio(txtC8P804_1)) {
//			mensaje = pregunta_no_vacia.replace("$", "La pregunta P804");
//			view = txtC8P804_1;
//			return !(error = true);
//		}
		if (Util.esVacio(txtC8P804_1) && !chbC8P804_N.isChecked()) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P626");
			view = txtC8P804_1;
			error = true;
			return false;
		}
		
		//int cont_1=0,cont_2=0;
		for(ModuloIII_det c: bean2){
		//	if(Util.getInt(c.c3p301_id)==2 || Util.getInt(c.c3p301_id)==3)cont_1=cont_1+Util.getInt(c.c3p301a_tot);
		//	if(!Util.esDiferente(c.c3p301_id,2,3,4,5))cont_2=cont_2+Util.getInt(c.c3p301a_tot);
		}
//		Log.e("XXXXXXXXXXXXXXXXXXXXXXXXX", "YYYYYYYYYYYYYYYYYY "+cont_1+" "+cont_2);
//		if((cont_1>Util.getInt(txtC8P804_1.getText())) || (cont_2>0 && Util.getInt(txtC8P804_1.getText())==0) || (cont_2==0 && Util.getInt(txtC8P804_1.getText())>0)){
//			mensaje = "Error: El promedio de trabajadores permanentes (obreros, empleados) debe guardar relación con la Pgta. 804";
//			view = txtC8P804_1;
//			error = true;
//			return false;
//		}
//		Si C8P804_1 > C3P301 Error
//		Si C3P301>0 and C8P804_1=0 Error

		int suma = Util.getInt(bean1.c3p301);
		
		if ( Util.getInt(txtC8P804_1.getText())>suma) {
			mensaje = "Error: El promedio de trabajadores permanentes (obreros, empleados) debe guardar relación con la Pgta. 804";
			view = txtC8P804_1;
			error = true;
			return false;
		}
		
		if (suma > 0 &&  Util.getInt(txtC8P804_1.getText()) == 0 ) {
			mensaje = "Error: El promedio de trabajadores permanentes (obreros, empleados) debe guardar relación con la Pgta. 804";
			view = txtC8P804_1;
			error = true;
			return false;
		}
		
		
		if (bean.c8p801==8 &&   Util.getInt(txtC8P804_1) > 0) {
			mensaje = "Error: La empresa no usó contratos, pero tuvo trabajadores bajo la modalidad “Contrato” (2017)";
			view = txtC8P804_1;
			error = true;
			return false;
		}
		
		if (bean.c8p801==7 &&   Util.getInt(txtC8P804_1) == 0) {
			mensaje = "Error: En Preg.801 indica que había contratos indefinidos, pero en Preg.804 dice que no tenía trabajadores con contrato a plazo indeterminado (2017)";
			view = txtC8P804_1;
			error = true;
			return false;
		}
		
		
		if (bean.c8p801==8 &&   Util.getInt(txtC8P804_1) > 0) {
			mensaje = "La empresa no usó contratos, pero tuvo trabajadores bajo la modalidad “Contrato” (2017)";
			view = txtC8P804_1;
			error = true;
			return false;
		}
		

		if (Util.esVacio(rgC8P806)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P806");
			view = rgC8P806;
			return !(error = true);
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		caratula = App.getInstance().getEmpresa();
		bean = getCuestionarioService().getModuloviii(
				App.getInstance().getEmpresa(),
				new Moduloviii().getSecCap(getListFields(this, new String[] { "C8P801"})));
		if (bean == null) {
			bean = new Moduloviii();
			bean.id = App.getInstance().getEmpresa().id;
		}
		bean1 = getCuestionarioService().getModuloiii01(
				App.getInstance().getEmpresa(),
				new Moduloiii01().getSecCap(Util.getListList("ID","C3P301")));
		if (bean1 == null) {
			bean1 = new Moduloiii01();
			bean1.id = App.getInstance().getEmpresa().id;
		}
		
		
		bean2 = getCuestionarioService().getModuloIII_det(bean1,new ModuloIII_det().getSecCap(Util.getListList("C3P301_ID","C3P301A_TOT")));
//		if (bean2 == null) {
//			bean2 = new ModuloIII_det();
//			bean2.id = App.getInstance().getEmpresa().id;
//		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
	//	Log.e ("total301",total301 + "" );
		lblTitulo301x.setText(Util.getText(Util.getInt(bean1.c3p301)));
//		salto_P8();
//		if (Util.getInt(caratula.p25) > 2) {
//			OnChangeCheckP807();
//			OnChangeCheckP808();
//		}
		FuncionCHECK804();
		txtC8P804_1.requestFocus();
	}
	
	public void FuncionCHECK804() {
		if (chbC8P804_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC8P804_1,txtC8P804_2);
		} else {
			Util.lockView(getActivity(), false, txtC8P804_1,txtC8P804_2);
			txtC8P804_2.readOnly();
			txtC8P804_1.requestFocus();
		}
	}
	
	private TextWatcher twP804 = new TextWatcher() {

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
			if(txtC8P804_1.getText().length()!=0){
				if(Util.getInt(txtC8P804_1.getText())<=Util.getInt(bean1.c3p301)){
					try{
						txtC8P804_2.setText(Math.round((Util.getInt(txtC8P804_1.getText())*1.0/Util.getInt(bean1.c3p301))*100)+"");
					}catch(Exception e){
						
					}
					if (Util.getInt(txtC8P804_2) > 0 && Util.getInt(txtC8P804_2) <= 100) {
						Util.cleanAndLockView(getActivity(), chbC8P804_N);
					} else if (Util.esVacio(txtC8P804_2)) {
						Util.lockView(getActivity(), false, chbC8P804_N);
					}
				}else{
					txtC8P804_1.setText("");
					txtC8P804_2.setText("");
				}
			}else{
				txtC8P804_2.setText("");
				Util.lockView(getActivity(), false, chbC8P804_N);
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

	@Override
	public Entity getEntity() {
		return bean;
	}
}

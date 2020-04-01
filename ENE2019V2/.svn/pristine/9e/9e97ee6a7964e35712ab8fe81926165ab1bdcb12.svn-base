package gob.inei.ene2019v2.fragment.ModVIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Moduloviii;
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

public class Mod_VIII_Fragment_004 extends FragmentForm {
	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC8P812_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC8P812_1_N;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC8P812_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC8P812_2_N;
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC8P812_3;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC8P812_3_N;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC8P812_4;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC8P812_4_N;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC8P812_5;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC8P812_5_N;
//	@FieldAnnotation(orderIndex = 3)
//	public RadioGroupOtherField rgC8P813;
//	@FieldAnnotation(orderIndex = 4)
//	public CheckBoxField chbC8P813_1;
//	@FieldAnnotation(orderIndex = 5)
//	public CheckBoxField chbC8P813_2;
	
	private CuestionarioService cuestionarioService;
	private Moduloviii bean;
	public GridComponent2 gridpreg813;
	public GridComponent gridpreg812,gridpreg1,gridpreg2,gridpreg3,gridpreg4,gridpreg5;
	private LabelComponent lblTitulo, lblTitulox,lblp1,lblp2,lblp3,lblp4,lblp5;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_VIII_Fragment_004() {
	}

	public Mod_VIII_Fragment_004 parent(MasterActivity parent) {
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
//		rgC8P812 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
//				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
//				R.string.c2c100m8p002_5, R.string.c2c100m8p002_6,
//				R.string.c2c100m8p002_7).size(WRAP_CONTENT, 350).orientation(
//				ORIENTATION.HORIZONTAL);
//		chbC8P812_1 = new CheckBoxField(this.getActivity(),
//				R.string.c2c100m8p002_8, "1:0").size(WRAP_CONTENT, 600).callback("OnChangeCheckP812");
		
		lblp1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8p012_a).textSize(15).negrita().size(altoComponente+80, 400);
		lblp2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8p012_b).textSize(15).negrita().size(altoComponente+80, 400);
		lblp3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8p012_c).textSize(15).negrita().size(altoComponente+120, 400);
		lblp4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8p012_d).textSize(15).negrita().size(altoComponente+100, 400);
		lblp5 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8p012_e).textSize(15).negrita().size(altoComponente+80, 400);
		
		rgC8P812_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(altoComponente, 350).orientation(
				ORIENTATION.HORIZONTAL);
		chbC8P812_1_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_6a, "1:0").size(altoComponente, 350).callback("OnChangeCheckP812_1");
		
		rgC8P812_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(altoComponente, 350).orientation(
				ORIENTATION.HORIZONTAL);
		chbC8P812_2_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_6a, "1:0").size(altoComponente, 350).callback("OnChangeCheckP812_2");
		
		rgC8P812_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(altoComponente, 350).orientation(
				ORIENTATION.HORIZONTAL);
		chbC8P812_3_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_6a, "1:0").size(altoComponente, 350).callback("OnChangeCheckP812_3");
		
		rgC8P812_4 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(altoComponente, 350).orientation(
				ORIENTATION.HORIZONTAL);
		chbC8P812_4_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_6a, "1:0").size(altoComponente, 350).callback("OnChangeCheckP812_4");
		
		
		rgC8P812_5 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(altoComponente, 350).orientation(
				ORIENTATION.HORIZONTAL);
		chbC8P812_5_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_6a, "1:0").size(altoComponente, 350).callback("OnChangeCheckP812_5");
		
		gridpreg1  = new GridComponent(this.getActivity(), 1);
		gridpreg1.addComponent(rgC8P812_1);
		gridpreg1.addComponent(chbC8P812_1_N);
		gridpreg1.colorFondo(R.color.WhiteSmoke);
		
		gridpreg2  = new GridComponent(this.getActivity(), 1);
		gridpreg2.addComponent(rgC8P812_2);
		gridpreg2.addComponent(chbC8P812_2_N);
		gridpreg2.colorFondo(R.color.WhiteSmoke);
		
		gridpreg3  = new GridComponent(this.getActivity(), 1);
		gridpreg3.addComponent(rgC8P812_3);
		gridpreg3.addComponent(chbC8P812_3_N);
		gridpreg3.colorFondo(R.color.WhiteSmoke);
		
		gridpreg4  = new GridComponent(this.getActivity(), 1);
		gridpreg4.addComponent(rgC8P812_4);
		gridpreg4.addComponent(chbC8P812_4_N);
		gridpreg4.colorFondo(R.color.WhiteSmoke);
		
		gridpreg5  = new GridComponent(this.getActivity(), 1);
		gridpreg5.addComponent(rgC8P812_5);
		gridpreg5.addComponent(chbC8P812_5_N);
		gridpreg5.colorFondo(R.color.WhiteSmoke);
		
		
		gridpreg812 = new GridComponent(this.getActivity(),Gravity.CENTER_HORIZONTAL, 2);
		gridpreg812.addComponent(lblp1);
		gridpreg812.addComponent(gridpreg1.component());
		gridpreg812.addComponent(lblp2);
		gridpreg812.addComponent(gridpreg2.component());
		gridpreg812.addComponent(lblp3);
		gridpreg812.addComponent(gridpreg3.component());
		gridpreg812.addComponent(lblp4);
		gridpreg812.addComponent(gridpreg4.component());
		gridpreg812.addComponent(lblp5);
		gridpreg812.addComponent(gridpreg5.component());
		gridpreg812.colorFondo(R.color.plomo);
		
		
	
		
		
//		rgC8P813 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
//				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
//				R.string.c2c100m8p002_5, R.string.c2c100m8p002_6,
//				R.string.c2c100m8p002_7).size(WRAP_CONTENT, 350).orientation(
//				ORIENTATION.HORIZONTAL).callback("OnChangeCheckP813");
//		chbC8P813_1 = new CheckBoxField(this.getActivity(),
//				R.string.c2c100m8p002_8, "1:0").size(WRAP_CONTENT, 600).callback("OnChangeCheckP813_1");
//		chbC8P813_2 = new CheckBoxField(this.getActivity(),
//				R.string.c2c100m8p002_9, "1:0").size(WRAP_CONTENT, 600).callback("OnChangeCheckP813_1");
		
//		gridpreg813 = new GridComponent2(this.getActivity(),Gravity.CENTER_VERTICAL, 1);
//		gridpreg813.addComponent(rgC8P813);
//		gridpreg813.addComponent(chbC8P813_1);
//		gridpreg813.addComponent(chbC8P813_2);
//		gridpreg813.colorFondo(R.color.WhiteSmoke);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulox);
		q1 = createQuestionSection(R.string.c2c100m8p012, Gravity.CENTER, LinearLayout.HORIZONTAL, gridpreg812.component());
//		q2 = createQuestionSection(R.string.c2c100m8p011, Gravity.CENTER, LinearLayout.HORIZONTAL, gridpreg813.component());

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
//		form.addView(q2);

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

		if (Util.esVacio(rgC8P812_1)) {
			if (!chbC8P812_1_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P812 (A)");
				view = rgC8P812_1;
				return !(error = true);
			}
		}
		
		if (Util.esVacio(rgC8P812_2)) {
			if (!chbC8P812_2_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P812 (B)");
				view = rgC8P812_2;
				return !(error = true);
			}
		}
		
		if (Util.esVacio(rgC8P812_3)) {
			if (!chbC8P812_3_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P812 (C)");
				view = rgC8P812_3;
				return !(error = true);
			}
		}
		
		if (Util.esVacio(rgC8P812_4)) {
			if (!chbC8P812_4_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P812 (D)");
				view = rgC8P812_4;
				return !(error = true);
			}
		}
		
		if (Util.esVacio(rgC8P812_5)) {
			if (!chbC8P812_5_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P812 (E)");
				view = rgC8P812_5;
				return !(error = true);
			}
		}
//		if (Util.esVacio(rgC8P813)) {
//			if (!(chbC8P813_1.isChecked() || chbC8P813_2.isChecked())) {
//				mensaje = pregunta_no_vacia.replace("$", "La pregunta P813");
//				view = rgC8P813;
//				return !(error = true);
//			}
//		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloviii(
				App.getInstance().getEmpresa(),
				new Moduloviii().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloviii();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		OnChangeCheckP812_1();
		OnChangeCheckP812_2();
		OnChangeCheckP812_3();
		OnChangeCheckP812_4();
		OnChangeCheckP812_5();
//		OnChangeCheckP813();
//		OnChangeCheckP813_1();
	//OnChangeCheckP813_2();
		rgC8P812_1.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
	
	public void OnChangeCheckP812_1(){
		if (chbC8P812_1_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P812_1);
			rgC8P812_2.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P812_1);
			rgC8P812_1.requestFocus();
		}
	}
	public void OnChangeCheckP812_2(){
		if (chbC8P812_2_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P812_2);
			rgC8P812_3.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P812_2);
			rgC8P812_2.requestFocus();
		}
	}
	public void OnChangeCheckP812_3(){
		if (chbC8P812_3_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P812_3);
			rgC8P812_4.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P812_3);
			rgC8P812_3.requestFocus();
		}
	}
	public void OnChangeCheckP812_4(){
		if (chbC8P812_4_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P812_4);
			rgC8P812_5.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P812_4);
			rgC8P812_4.requestFocus();
		}
	}
	public void OnChangeCheckP812_5(){
		if (chbC8P812_5_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P812_5);
		} else {
			Util.lockView(getActivity(), false, rgC8P812_5);
			rgC8P812_5.requestFocus();
		}
	}
//	public void OnChangeCheckP813_1(){
//		if (chbC8P813_1.isChecked()) {
//			Util.cleanAndLockView(getActivity(), rgC8P813);
//			chbC8P813_2.setChecked(false);
//		}else{
//			if (chbC8P813_2.isChecked()) {
//				Util.cleanAndLockView(getActivity(), rgC8P813);
//				chbC8P813_1.setChecked(false);
//			}else{
//				Util.lockView(getActivity(), false, rgC8P813);
//				rgC8P813.requestFocus();
//			}
//		}
//		
//		
//		
////		if (chbC8P813_1.isChecked()) {
////			Util.cleanAndLockView(getActivity(), rgC8P813);
////			chbC8P813_2.setChecked(false);
////		} else 	if (!chbC8P813_1.isChecked()) {
////			Util.lockView(getActivity(), false, rgC8P813);
////			rgC8P813.requestFocus();
////		}
//	}
//	public void OnChangeCheckP813_2(){
//		if (chbC8P813_2.isChecked()) {
//			Util.cleanAndLockView(getActivity(), rgC8P813);
//			chbC8P813_1.setChecked(false);
//		} else 	if (!chbC8P813_2.isChecked()) {
//			Util.lockView(getActivity(), false, rgC8P813);
//			rgC8P813.requestFocus();
//		}
//	}
//	public void OnChangeCheckP813(){
//		if (!Util.esVacio(rgC8P813)) {
//			chbC8P813_1.setChecked(false);
//			chbC8P813_2.setChecked(false);
//		}
//	}
	
	@Override
	public Entity getEntity() {
		return bean;
	}
}

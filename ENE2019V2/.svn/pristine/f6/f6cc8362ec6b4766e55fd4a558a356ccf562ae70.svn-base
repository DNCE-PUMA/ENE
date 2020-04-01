package gob.inei.ene2019v2.fragment.ModVIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
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
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VIII_Fragment_001 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC8P801;
//	@FieldAnnotation(orderIndex = 2)
//	public RadioGroupOtherField rgC8P802;
//	@FieldAnnotation(orderIndex = 3)
//	public CheckBoxField chbC8P802_1;
//	@FieldAnnotation(orderIndex = 4)
//	public RadioGroupOtherField rgC8P803;
//	@FieldAnnotation(orderIndex = 5)
//	public CheckBoxField chbC8P803_1;
	
	private CuestionarioService cuestionarioService;
	private Moduloviii bean;
	public GridComponent2 gridpreg802,gridpreg803;
	private LabelComponent lblTitulo, lblTituloa, lblTitulo1;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_VIII_Fragment_001() {
	}

	public Mod_VIII_Fragment_001 parent(MasterActivity parent) {
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

		lblTituloa = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text("Se le van a hacer un conjunto de preguntas para conocer su opinión en relación a cómo la normatividad vigente y trámites asociados pueden afectar el funcionamiento y las operaciones de su empresa.")
				.textSize(21).centrar().negrita();

		
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8_sub1).textSize(20).centrar().negrita();

		rgC8P801 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p001_1, R.string.c2c100m8p001_2,
				R.string.c2c100m8p001_3, R.string.c2c100m8p001_4,
				R.string.c2c100m8p001_5, R.string.c2c100m8p001_6,
				R.string.c2c100m8p001_7, R.string.c2c100m8p001_8).size(
				WRAP_CONTENT, 350).orientation(ORIENTATION.VERTICAL);
		
//		rgC8P802 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
//				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
//				R.string.c2c100m8p002_5, R.string.c2c100m8p002_6,
//				R.string.c2c100m8p002_7).size(
//				WRAP_CONTENT, 800).orientation(ORIENTATION.HORIZONTAL).callback("OnChangep802");
//		
//		chbC8P802_1 = new CheckBoxField(this.getActivity(),
//				R.string.c2c100m8p002_8, "1:0").size(WRAP_CONTENT, 600).callback("OnChangep802_1");
		
		

//		gridpreg802 = new GridComponent2(this.getActivity(),Gravity.CENTER_VERTICAL, 1);
//		gridpreg802.addComponent(rgC8P802);
//		gridpreg802.addComponent(chbC8P802_1);
//		gridpreg802.colorFondo(R.color.WhiteSmoke);
		
//		rgC8P803 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
//				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
//				R.string.c2c100m8p002_5, R.string.c2c100m8p002_6,
//				R.string.c2c100m8p002_7).size(WRAP_CONTENT, 350).orientation(
//				ORIENTATION.HORIZONTAL);
//		chbC8P803_1 = new CheckBoxField(this.getActivity(),
//				R.string.c2c100m8p002_8, "1:0").size(WRAP_CONTENT, 600).callback("OnChangep803_1");
//		
//		gridpreg803 = new GridComponent2(this.getActivity(),Gravity.CENTER_VERTICAL, 1);
//		gridpreg803.addComponent(rgC8P803);
//		gridpreg803.addComponent(chbC8P803_1);
//		gridpreg803.colorFondo(R.color.WhiteSmoke);
	}


	
	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTituloa, lblTitulo1);
		q2 = createQuestionSection(R.string.c2c100m8p001, rgC8P801);
//		q3 = createQuestionSection(R.string.c2c100m8p002, Gravity.CENTER, LinearLayout.HORIZONTAL, gridpreg802.component());
//		q4 = createQuestionSection(R.string.c2c100m8p003, Gravity.CENTER, LinearLayout.HORIZONTAL, gridpreg803.component());

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q2);
//		form.addView(q3);
//		form.addView(q4);

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
		if (Util.esVacio(rgC8P801)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P801");
			view = rgC8P801;
			return !(error = true);
		}
//		if (Util.esVacio(rgC8P802)) {
//			if(!chbC8P802_1.isChecked()){
//				mensaje = pregunta_no_vacia.replace("$", "La pregunta P802");
//				view = rgC8P802;
//				return !(error = true);
//			}
//		}
//		if (Util.esVacio(rgC8P803)) {
//			if(!chbC8P803_1.isChecked()){
//				mensaje = pregunta_no_vacia.replace("$", "La pregunta P803");
//				view = rgC8P803;
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
		OnChangep802_1();
		OnChangep803_1();
		rgC8P801.requestFocus();
	}

	public void OnChangep802() {
//		RadioGroupOtherField crg = ((RadioGroupOtherField) rgC8P802);
//		if (crg.getCheckedRadioButtonId() != -1	&& crg.findViewById(crg.getCheckedRadioButtonId()).isPressed()) {
//			if (!chbC8P803_1.isChecked()) {
//				rgC8P803.requestFocus();
//			} else {
//				chbC8P803_1.requestFocus();
//			}
//
//		}
	}
	
	
	public void OnChangep802_1() {
//		if (chbC8P802_1.isChecked()) {
//			Util.cleanAndLockView(getActivity(), rgC8P802);
//			rgC8P803.requestFocus();
//		} else {
//			Util.lockView(getActivity(), false, rgC8P802);
//			rgC8P802.requestFocus();
//		}
	}
	public void OnChangep803_1() {
//		if (chbC8P803_1.isChecked()) {
//			Util.cleanAndLockView(getActivity(), rgC8P803);
//		} else {
//			Util.lockView(getActivity(), false, rgC8P803);
//			rgC8P803.requestFocus();
//		}
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
}

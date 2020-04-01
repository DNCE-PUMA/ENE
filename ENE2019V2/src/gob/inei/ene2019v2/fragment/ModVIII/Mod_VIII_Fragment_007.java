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

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VIII_Fragment_007 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC8P822_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC8P822_1_N;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC8P822_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC8P822_2_N;
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC8P822_3;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC8P822_3_N;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC8P822_4;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC8P822_4_N;
	private CuestionarioService cuestionarioService;
	private Moduloviii bean;
	public GridComponent2 gridpreg822,gridpreg823,gridpreg824;
	public GridComponent grid1,grid2,grid3,grid4,grid5;
	private LabelComponent lblTitulo, lblSubTitulo;
	public LabelComponent lblNiv, lblNiv1, lblNiv2,lblNiv3,lblNiv4,lblNiv5;
	LinearLayout q0, q1, q2, q3;

	public Mod_VIII_Fragment_007() {
	}

	public Mod_VIII_Fragment_007 parent(MasterActivity parent) {
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
		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m6p_81)
				.textSize(21).centrar().negrita();
	
		lblNiv = new LabelComponent(this.getActivity())
		.size(altoComponente + 10, 540).text("REGULACIONES EN MATERIA TRIBUTARIA  ")
		.textSize(15).negrita().alinearIzquierda();

		lblNiv1 = new LabelComponent(this.getActivity())
		.size(altoComponente + 100, 440).text("1. Los procedimientos para el cumplimiento de sus obligaciones (pago, declaraciones, otros) respecto de los impuestos nacionales (IR, IGV, ISC, etc.)? En la escala del 1 al 5 donde (1. Muy sencillo, 5.Muy complicado)– TARJETA N°4")
		.textSize(15).negrita().alinearIzquierda();
		lblNiv2 = new LabelComponent(this.getActivity())
				.size(altoComponente + 70, 440).text("2. Los procedimientos para el pago de los tributos municipales (predial, alcabala, vehicular, arbitrios, etc.)? En la escala del 1 al 5 donde (1. Muy sencillo, 5.Muy complicado)– TARJETA N°4")
				.textSize(15).negrita().alinearIzquierda();
		lblNiv3 = new LabelComponent(this.getActivity())
				.size(altoComponente + 70, 440).text("3. Las actividades de fiscalización y sanción de la SUNAT en materia de tributos nacionales? En la escala del 1 al 5 donde (1. Muy escasa, 5.Muy excesiva)-TARJETA N°6.")
				.textSize(15).negrita().alinearIzquierda();
		lblNiv4 = new LabelComponent(this.getActivity())
				.size(altoComponente + 70, 440).text("4. El nuevo régimen tributario MYPE? En la escala del 1 al 5 donde (1. Muy malo, 5. Muy bueno)– TARJETA N°2")
				.textSize(15).negrita().alinearIzquierda();
	
		
		rgC8P822_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(30, 320).orientation(
				ORIENTATION.HORIZONTAL);		
		
		chbC8P822_1_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_8, "1:0").size(30, 320).callback("OnChangeCheckP822_1");
				
		
		rgC8P822_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(30, 320).orientation(
				ORIENTATION.HORIZONTAL);		
		
		chbC8P822_2_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_8, "1:0").size(30, 320).callback("OnChangeCheckP822_2");
		
		rgC8P822_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(30, 320).orientation(
				ORIENTATION.HORIZONTAL);		
		
		chbC8P822_3_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_8, "1:0").size(30, 320).callback("OnChangeCheckP822_3");
		
		rgC8P822_4 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(30, 320).orientation(
				ORIENTATION.HORIZONTAL);		
		
		chbC8P822_4_N = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_8, "1:0").size(30, 320).callback("OnChangeCheckP822_4");
		
		grid1  = new GridComponent(this.getActivity(), 1);
		grid1.addComponent(rgC8P822_1);
		grid1.addComponent(chbC8P822_1_N);
		grid1.colorFondo(R.color.WhiteSmoke);
		
		grid2  = new GridComponent(this.getActivity(), 1);
		grid2.addComponent(rgC8P822_2);
		grid2.addComponent(chbC8P822_2_N);
		grid2.colorFondo(R.color.WhiteSmoke);
		
		grid3  = new GridComponent(this.getActivity(), 1);
		grid3.addComponent(rgC8P822_3);
		grid3.addComponent(chbC8P822_3_N);
		grid3.colorFondo(R.color.WhiteSmoke);
		
		grid4  = new GridComponent(this.getActivity(), 1);
		grid4.addComponent(rgC8P822_4);
		grid4.addComponent(chbC8P822_4_N);
		grid4.colorFondo(R.color.WhiteSmoke);
		
		gridpreg822 = new GridComponent2(this.getActivity(),Gravity.CENTER,2);
		gridpreg822.addComponent(lblNiv,2);
		
		gridpreg822.addComponent(lblNiv1);
		gridpreg822.addComponent(grid1.component());
		gridpreg822.addComponent(lblNiv2);
		gridpreg822.addComponent(grid2.component());
		gridpreg822.addComponent(lblNiv3);
		gridpreg822.addComponent(grid3.component());
		gridpreg822.addComponent(lblNiv4);
		gridpreg822.addComponent(grid4.component());
	

		
		gridpreg822.colorFondo(FragmentForm.COLOR_LINEA_SECCION_PREGUNTA);
				
	
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c2c100m8p020, Gravity.CENTER, LinearLayout.HORIZONTAL, gridpreg822.component());

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
		String especifique_no_vacio = getString(R.string.pregunta_especifique);
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
		if (Util.esVacio(rgC8P822_1)) {
			if (!chbC8P822_1_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P822_1 (B)");
				view = rgC8P822_1;
				return !(error = true);
			}
		}
		if (Util.esVacio(rgC8P822_2)) {
			if (!chbC8P822_2_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P822_2 (B)");
				view = rgC8P822_2;
				return !(error = true);
			}
		}
		if (Util.esVacio(rgC8P822_3)) {
			if (!chbC8P822_3_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P822_3 (B)");
				view = rgC8P822_3;
				return !(error = true);
			}
		}
		if (Util.esVacio(rgC8P822_4)) {
			if (!chbC8P822_4_N.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P822_4 (B)");
				view = rgC8P822_4;
				return !(error = true);
			}
		}

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
	
		OnChangeCheckP822_1();
		OnChangeCheckP822_2();
		OnChangeCheckP822_3();
		OnChangeCheckP822_4();
		rgC8P822_1.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService; 
	}
	public void OnChangeCheckP822_1(){
		if (chbC8P822_1_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P822_1);
			rgC8P822_1.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P822_1);
			rgC8P822_1.requestFocus();
		}
	}
	public void OnChangeCheckP822_2(){
		if (chbC8P822_2_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P822_2);
			rgC8P822_2.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P822_2);
			rgC8P822_2.requestFocus();
		}
	}
	public void OnChangeCheckP822_3(){
		if (chbC8P822_3_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P822_3);
			rgC8P822_3.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P822_3);
			rgC8P822_3.requestFocus();
		}
	}
	public void OnChangeCheckP822_4(){
		if (chbC8P822_4_N.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P822_4);
			rgC8P822_4.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC8P822_4);
			rgC8P822_4.requestFocus();
		}
	}
	
	
	@Override
	public Entity getEntity() {
		return bean;
	}
}

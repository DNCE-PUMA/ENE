package gob.inei.ene2019v2.fragment.ModV;

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
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Modulov02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_V_Fragment_008 extends FragmentForm {
	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC5P523_1;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC5P523_2;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC5P523_3;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC5P523_4;
	
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC5P524_1;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC5P524_2;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC5P524_3;
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC5P524_4;
	
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC5P525_A_1;
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgC5P525_A_2;
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC5P525_A_3;
	@FieldAnnotation(orderIndex = 12)
	public RadioGroupOtherField rgC5P525_A_4;
	
	@FieldAnnotation(orderIndex = 13)
	public RadioGroupOtherField rgC5P525_B_1;

	@FieldAnnotation(orderIndex = 14)
	public RadioGroupOtherField rgC5P525_C_1;
	@FieldAnnotation(orderIndex = 15)
	public RadioGroupOtherField rgC5P525_C_2;
	@FieldAnnotation(orderIndex = 16)
	public RadioGroupOtherField rgC5P525_C_3;
	
	@FieldAnnotation(orderIndex = 17)
	public RadioGroupOtherField rgC5P525_D_1;
	@FieldAnnotation(orderIndex = 18)
	public RadioGroupOtherField rgC5P525_D_2;
	
	@FieldAnnotation(orderIndex = 19)
	public RadioGroupOtherField rgC5P525_E_1;
	
	private LabelComponent lbl1,lbl2,lbl3,lbl4,lbl24_1,lbl24_2,lbl24_3,lbl24_4,lbl25_t1,lbl25_t2,lbl25_t3,lbl25_t4,lbl25_t5,
	lbl25_1,lbl25_2,lbl25_3,lbl25_4,lbl25_5,lbl25_6,lbl25_7,lbl25_8,lbl25_9,lbl25_10,lbl25_11;
	private GridComponent gcPreg23,gcPreg24;
	private GridComponent2 gcPreg25;
	private CuestionarioService cuestionarioService;
	private Modulov02 bean;
	private LabelComponent lblTitulo, lblsubTitulo, lblDesc;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_V_Fragment_008() {
	}

	public Mod_V_Fragment_008 parent(MasterActivity parent) {
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
				.text(R.string.CapituloV).textSize(21).centrar().negrita();

		lblsubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.CapV_SecI).textSize(20).centrar().negrita();
		rgC5P523_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p023_1_1, R.string.c1c100m5p023_1_2, R.string.c1c100m5p023_1_3, R.string.c1c100m5p023_1_4, R.string.c1c100m5p023_1_5)
				.size(altoComponente + 80, 670).orientation(ORIENTATION.HORIZONTAL);
		rgC5P523_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p023_1_1, R.string.c1c100m5p023_1_2, R.string.c1c100m5p023_1_3, R.string.c1c100m5p023_1_4, R.string.c1c100m5p023_1_5)
				.size(altoComponente + 80, 670).orientation(ORIENTATION.HORIZONTAL);
		rgC5P523_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p023_1_1, R.string.c1c100m5p023_1_2, R.string.c1c100m5p023_1_3, R.string.c1c100m5p023_1_4, R.string.c1c100m5p023_1_5)
				.size(altoComponente + 80, 670).orientation(ORIENTATION.HORIZONTAL);
		rgC5P523_4 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p023_1_1, R.string.c1c100m5p023_1_2, R.string.c1c100m5p023_1_3, R.string.c1c100m5p023_1_4, R.string.c1c100m5p023_1_5)
				.size(altoComponente + 80, 670).orientation(ORIENTATION.HORIZONTAL);
		//24
		rgC5P524_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p024_1_1, R.string.c1c100m5p024_1_2, R.string.c1c100m5p024_1_3, R.string.c1c100m5p024_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P524_2= new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p024_1_1, R.string.c1c100m5p024_1_2, R.string.c1c100m5p024_1_3, R.string.c1c100m5p024_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P524_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p024_1_1, R.string.c1c100m5p024_1_2, R.string.c1c100m5p024_1_3, R.string.c1c100m5p024_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P524_4 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p024_1_1, R.string.c1c100m5p024_1_2, R.string.c1c100m5p024_1_3, R.string.c1c100m5p024_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		//25
		rgC5P525_A_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		rgC5P525_A_2= new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		
		rgC5P525_A_3  = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		rgC5P525_A_4  = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		
		rgC5P525_B_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		
		rgC5P525_A_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		rgC5P525_C_1  = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		rgC5P525_C_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		rgC5P525_C_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		
		rgC5P525_D_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		rgC5P525_D_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		
		rgC5P525_E_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p025_1_1, R.string.c1c100m5p025_1_2, R.string.c1c100m5p025_1_3, R.string.c1c100m5p025_1_4, R.string.c1c100m5p024_1_5)
				.size(WRAP_CONTENT, 580).orientation(ORIENTATION.VERTICAL);
		
		lbl1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p023_1).size(altoComponente + 80, 120)
				.textSize(16).alinearIzquierda().negrita();
		lbl2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p023_2).size(altoComponente + 80, 120)
				.textSize(16).alinearIzquierda().negrita();
		lbl3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p023_3).size(altoComponente + 80, 120)
				.textSize(16).alinearIzquierda().negrita();
		lbl4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p023_4).size(altoComponente + 80, 120)
				.textSize(16).alinearIzquierda().negrita();
		
		lbl24_1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p024_1).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl24_2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p024_2).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl24_3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p024_3).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl24_4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p024_4).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		
		lbl25_t1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_1a).size(altoComponente + 30, 300)
				.textSize(18).alinearIzquierda().negrita().centrar();
		lbl25_t2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_1b).size(altoComponente + 30, 300)
				.textSize(18).alinearIzquierda().negrita();
		lbl25_t3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_1c).size(altoComponente + 30, 300)
				.textSize(18).alinearIzquierda().negrita();
		lbl25_t4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_1d).size(altoComponente + 30, 300)
				.textSize(18).alinearIzquierda().negrita();
		lbl25_t5 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_1e).size(altoComponente + 30, 300)
				.textSize(18).alinearIzquierda().negrita();
		
		lbl25_1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_a1).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl25_2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_a2).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl25_3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_a3).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl25_4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_a4).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		
		lbl25_5 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_b1).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		
		lbl25_6 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_c1).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl25_7 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_c2).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl25_8 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_c3).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		
		lbl25_9 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_d1).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl25_10 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_d2).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
		
		lbl25_11 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p025_e1).size(altoComponente + 170, 300)
				.textSize(16).alinearIzquierda().negrita();
				
		gcPreg23 = new GridComponent(this.getActivity(), 2)
		.colorFondo(R.color.blanco);
		gcPreg23.addComponent(lbl1);
		gcPreg23.addComponent(rgC5P523_1);
		gcPreg23.addComponent(lbl2);
		gcPreg23.addComponent(rgC5P523_2);
		gcPreg23.addComponent(lbl3);
		gcPreg23.addComponent(rgC5P523_3);
		gcPreg23.addComponent(lbl4);
		gcPreg23.addComponent(rgC5P523_4);
		
		gcPreg24 = new GridComponent(this.getActivity(), 2)
		.colorFondo(R.color.blanco);
		gcPreg24.addComponent(lbl24_1);
		gcPreg24.addComponent(rgC5P524_1);
		gcPreg24.addComponent(lbl24_2);
		gcPreg24.addComponent(rgC5P524_2);
		gcPreg24.addComponent(lbl24_3);
		gcPreg24.addComponent(rgC5P524_3);
		gcPreg24.addComponent(lbl24_4);
		gcPreg24.addComponent(rgC5P524_4);
		
		gcPreg25 = new GridComponent2(this.getActivity(), 2)
		.colorFondo(R.color.blanco);
		gcPreg25.addComponent(lbl25_t1,2);
		
		gcPreg25.addComponent(lbl25_1);
		gcPreg25.addComponent(rgC5P525_A_1);
		gcPreg25.addComponent(lbl25_2);
		gcPreg25.addComponent(rgC5P525_A_2);
		gcPreg25.addComponent(lbl25_3);
		gcPreg25.addComponent(rgC5P525_A_3);
		gcPreg25.addComponent(lbl25_4);
		gcPreg25.addComponent(rgC5P525_A_4);
		
		gcPreg25.addComponent(lbl25_t2,2);
		gcPreg25.addComponent(lbl25_5);
		gcPreg25.addComponent(rgC5P525_B_1);
		
	    gcPreg25.addComponent(lbl25_t3,2);
		gcPreg25.addComponent(lbl25_6);
		gcPreg25.addComponent(rgC5P525_C_1);
		gcPreg25.addComponent(lbl25_7);
		gcPreg25.addComponent(rgC5P525_C_2);
		gcPreg25.addComponent(lbl25_8);
		gcPreg25.addComponent(rgC5P525_C_3);
		
		gcPreg25.addComponent(lbl25_t4,2);
		gcPreg25.addComponent(lbl25_9);
		gcPreg25.addComponent(rgC5P525_D_1);
		gcPreg25.addComponent(lbl25_10);
		gcPreg25.addComponent(rgC5P525_D_2);
		
		gcPreg25.addComponent(lbl25_t5,2);
		gcPreg25.addComponent(lbl25_11);
		gcPreg25.addComponent(rgC5P525_E_1);

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
		q1 = createQuestionSection(R.string.c1c100m5p023,gcPreg23.component());
	    q3 = createQuestionSection(R.string.c1c100m5p024,gcPreg24.component());
	    q4 = createQuestionSection(R.string.c1c100m5p025,gcPreg25.component());
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
    	form.addView(q1);
		form.addView(q3);
		form.addView(q4);

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

//		if (Util.getInt(bean.c5p522) == 1) {
//			if (!chbC5P523_1.isChecked() && !chbC5P523_2.isChecked()
//					&& !chbC5P523_3.isChecked() && !chbC5P523_4.isChecked()
//					&& !chbC5P523_5.isChecked() && !chbC5P523_6.isChecked()) {
//				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P523";
//				view = chbC5P523_1;
//				return !(error = true);
//			}
//			
//			if (chbC5P523_6.isChecked()) {
//				if (Util.esVacio(txtC5P523_6ESP)) {
//					mensaje = pregunta_no_vacia.replace("$", "La Preg.523 (Especifique)");
//					view = txtC5P523_6ESP;
//					error = true;
//					return false;
//				}else{
//					if (txtC5P523_6ESP.getText().length() < 3) {
//						mensaje = "Ingrese la información correcta";
//						view = txtC5P523_6ESP;
//						error = true;
//						return false;
//					}
//				}
//			}
//
//		}

		if (Util.esVacio(rgC5P523_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P523_1");
			view = rgC5P523_1;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P523_2)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P523_2");
			view = rgC5P523_2;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P523_3)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P523_3");
			view = rgC5P523_3;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P523_4)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P523_4");
			view = rgC5P523_4;
			error = true;
			return false;
		}
		/************************************/
		if (Util.esVacio(rgC5P524_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P524_1");
			view = rgC5P524_1;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P524_2)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P524_2");
			view = rgC5P524_2;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P524_3)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P524_3");
			view = rgC5P524_3;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P524_4)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P524_4");
			view = rgC5P524_4;
			error = true;
			return false;
		}
		/*************************************************/
		if (Util.esVacio(rgC5P525_A_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_A_1");
			view = rgC5P525_A_1;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P525_A_2)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_A_2");
			view = rgC5P525_A_2;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P525_A_3)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_A_3");
			view = rgC5P525_A_3;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P525_A_4)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_A_4");
			view = rgC5P525_A_4;
			error = true;
			return false;
		}
		/******************************************/
		if (Util.esVacio(rgC5P525_B_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_B_1");
			view = rgC5P525_B_1;
			error = true;
			return false;
		}
		/**********************************************/
		if (Util.esVacio(rgC5P525_C_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_C_1");
			view = rgC5P525_C_1;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P525_C_2)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_C_2");
			view = rgC5P525_C_2;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P525_C_3)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_C_3");
			view = rgC5P525_C_3;
			error = true;
			return false;
		}
		/*********************************************/
		if (Util.esVacio(rgC5P525_D_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_D_1");
			view = rgC5P525_D_1;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P525_D_2)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_D_2");
			view = rgC5P525_D_2;
			error = true;
			return false;
		}
		/**********************************/
		if (Util.esVacio(rgC5P525_E_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P525_E_1");
			view = rgC5P525_E_1;
			error = true;
			return false;
		}
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModulov02(
				App.getInstance().getEmpresa(),
				new Modulov02().getSecCap(getListFields(this, new String[] {
						"C5P521", "C5P522" })));
		if (bean == null) {
			bean = new Modulov02();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		
		rgC5P523_1.requestFocus();
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
		return App.getInstance().getEmpresa();
	}
}

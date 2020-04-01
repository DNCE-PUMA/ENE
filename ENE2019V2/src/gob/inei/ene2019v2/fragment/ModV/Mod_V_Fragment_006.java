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
import gob.inei.ene2019v2.model.Modulov01;
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

public class Mod_V_Fragment_006 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC5P516_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC5P516_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC5P516_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC5P516_4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC5P516_5;
//	@FieldAnnotation(orderIndex = 6)
//	public RadioGroupOtherField rgC5P517_1;
//	@FieldAnnotation(orderIndex = 7)
//	public RadioGroupOtherField rgC5P517_2;
//	@FieldAnnotation(orderIndex = 8)
//	public RadioGroupOtherField rgC5P517_3;
//	@FieldAnnotation(orderIndex = 9)
//	public RadioGroupOtherField rgC5P517_4;
//	@FieldAnnotation(orderIndex = 10)
//	public RadioGroupOtherField rgC5P517_5;
//	@FieldAnnotation(orderIndex = 11)
//	public RadioGroupOtherField rgC5P517_6;
//	@FieldAnnotation(orderIndex = 12)
//	public RadioGroupOtherField rgC5P517_7;
//	@FieldAnnotation(orderIndex = 13)
//	public RadioGroupOtherField rgC5P517_8;
//	@FieldAnnotation(orderIndex = 14)
//	public RadioGroupOtherField rgC5P517_9;
//	@FieldAnnotation(orderIndex = 15)
//	public TextField txtC5P517_9ESP;
//	
//	@FieldAnnotation(orderIndex = 16)
//	public RadioGroupOtherField rgC5P518;
	
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC5P521;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtC5P521_ESP;
	
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC5P522;
	@FieldAnnotation(orderIndex = 9)
	public TextField txtC5P522_ESP;

	private CuestionarioService cuestionarioService;
	private Modulov02 bean;
	private Modulov01 bean1;
	private LabelComponent lblTitulo, lblsubTitulo,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9;
	private GridComponent2 gcPreg16, gcPreg17;
	private GridComponent gcPreg1;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_V_Fragment_006() {
	}

	public Mod_V_Fragment_006 parent(MasterActivity parent) {
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
				.text(R.string.CapV_SecII).textSize(20).centrar().negrita();

		chbC5P516_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p016_1, "1:0").size(altoComponente, 600);
		chbC5P516_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p016_2, "1:0").size(altoComponente, 600);
		chbC5P516_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p016_3, "1:0").size(altoComponente, 600);
		chbC5P516_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p016_4, "1:0").size(altoComponente, 600);
		chbC5P516_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p016_5, "1:0").size(altoComponente, 600).callback("FuncionpP516");
		
		
		rgC5P521 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p021_1, R.string.c1c100m5p021_2,R.string.c1c100m5p021_3,R.string.c1c100m5p021_4)
				.size(WRAP_CONTENT, 600).orientation(ORIENTATION.VERTICAL);
		txtC5P521_ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		rgC5P521.agregarEspecifique(3, txtC5P521_ESP);
		
		rgC5P522 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p022_1, R.string.c1c100m5p022_2,R.string.c1c100m5p022_3,R.string.c1c100m5p022_4,R.string.c1c100m5p022_5).size(
				WRAP_CONTENT, 600).orientation(ORIENTATION.VERTICAL);
		txtC5P522_ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		
		rgC5P522.agregarEspecifique(4, txtC5P522_ESP);

//		rgC5P517_1 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//			
//		rgC5P517_2  = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//		
//		rgC5P517_3  = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//		rgC5P517_4 =  new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//		rgC5P517_5 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//		rgC5P517_6 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//		
//		rgC5P517_7  =  new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//		
//		rgC5P517_8 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
//		rgC5P517_9 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p017_1_1, R.string.c1c100m5p017_1_2, R.string.c1c100m5p017_1_3, R.string.c1c100m5p017_1_4)
//				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL).callback("FuncionCHECK517");
//		txtC5P517_9ESP = new TextField(this.getActivity(), false)
//		.size(altoComponente, 400).hint(R.string.especifique)
//		.soloTextoNumero();
//		rgC5P518 = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m5p018_1, R.string.c1c100m5p018_2).size(
//				WRAP_CONTENT, 250).orientation(ORIENTATION.HORIZONTAL);
		
//		lbl1 = new LabelComponent(this.getActivity(), App.ESTILO)
//		.text(R.string.c1c100m5p017_1).size(altoComponente + 120, 220)
//		.textSize(16).alinearIzquierda().negrita();
//		lbl2 = new LabelComponent(this.getActivity(), App.ESTILO)
//				.text(R.string.c1c100m5p017_2).size(altoComponente + 120, 220)
//				.textSize(16).alinearIzquierda().negrita();
//		lbl3 = new LabelComponent(this.getActivity(), App.ESTILO)
//				.text(R.string.c1c100m5p017_3).size(altoComponente + 120, 220)
//				.textSize(16).alinearIzquierda().negrita();
//		lbl4 = new LabelComponent(this.getActivity(), App.ESTILO)
//				.text(R.string.c1c100m5p017_4).size(altoComponente + 120, 220)
//				.textSize(16).alinearIzquierda().negrita();
//		lbl5 = new LabelComponent(this.getActivity(), App.ESTILO)
//				.text(R.string.c1c100m5p017_5).size(altoComponente + 120, 220)
//				.textSize(16).alinearIzquierda().negrita();
//		lbl6 = new LabelComponent(this.getActivity(), App.ESTILO)
//				.text(R.string.c1c100m5p017_6).size(altoComponente + 120, 220)
//				.textSize(16).alinearIzquierda().negrita();
//		lbl7 = new LabelComponent(this.getActivity(), App.ESTILO)
//				.text(R.string.c1c100m5p017_7).size(altoComponente + 120, 220)
//				.textSize(16).alinearIzquierda().negrita();
//		lbl8 = new LabelComponent(this.getActivity(), App.ESTILO)
//				.text(R.string.c1c100m5p017_8).size(altoComponente + 120, 220)
//				.textSize(16).alinearIzquierda().negrita();
//		lbl9 = new LabelComponent(this.getActivity(), App.ESTILO)
//		.text(R.string.c1c100m5p017_9).size(altoComponente + 120, 220)
//		.textSize(16).alinearIzquierda().negrita();
		
		
//		gcPreg1 = new GridComponent(this.getActivity(), 2)
//		.colorFondo(R.color.blanco);
//		gcPreg1.addComponent(lbl1);
//		gcPreg1.addComponent(rgC5P517_1);
//		gcPreg1.addComponent(lbl2);
//		gcPreg1.addComponent(rgC5P517_2);
//		gcPreg1.addComponent(lbl3);
//		gcPreg1.addComponent(rgC5P517_3);
//		gcPreg1.addComponent(lbl4);
//		gcPreg1.addComponent(rgC5P517_4);
//		gcPreg1.addComponent(lbl5);
//		gcPreg1.addComponent(rgC5P517_5);
//		gcPreg1.addComponent(lbl6);
//		gcPreg1.addComponent(rgC5P517_6);
//		gcPreg1.addComponent(lbl7);
//		gcPreg1.addComponent(rgC5P517_7);
//		gcPreg1.addComponent(lbl8);
//		gcPreg1.addComponent(rgC5P517_8);
//		gcPreg1.addComponent(lbl9);
//		gcPreg1.addComponent(rgC5P517_9);
//		gcPreg1.addComponent(txtC5P517_9ESP, 2);


//		Filtros.setFiltro(txtC5P516_6ESP, Filtros.TIPO.ALFAN_U, 300, null);
		
//		Filtros.setFiltro(txtC5P517_9ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
		q1 = createQuestionSection(R.string.c1c100m5p016, chbC5P516_1,
				chbC5P516_2, chbC5P516_3, chbC5P516_4, chbC5P516_5);
		q2 = createQuestionSection(R.string.c1c100m5p021, rgC5P521);
		q3 = createQuestionSection(R.string.c1c100m5p022, rgC5P522);
//		q2 = createQuestionSection(R.string.c1c100m5p017,gcPreg1.component() );
		
//		q3 = createQuestionSection(R.string.c1c100m5p018, rgC5P518);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);

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
			
			//Integer valor = Integer.parseInt(rgC5P518.getTagSelected("0").toString());
//		if (Util.getInt(bean.c5p518)==2) {
//				if (!getCuestionarioService().saveOrUpdate(
//						bean,
//						bean.getSecCap(getListFields(this, new String[] {
//								"C5P519_1", "C5P519_2", "C5P519_3", "C5P519_4",
//								"C5P519_5", "C5P519_5ESP" })))) {
//					ToastMessage.msgBox(this.getActivity(),
//							"Los datos no se guardaron",
//							ToastMessage.MESSAGE_ERROR,
//							ToastMessage.DURATION_LONG);
//				}
//			}
			
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
//		  2           Si C5P515 =2 and C5P501_7A=1 Pase a C5P517_1
//      Si C5P515 =2 and C5P501_7A=2 Pase a C5P518
	if((Util.getInt(bean.c5p515)==1)||((Util.getInt(bean.c5p514_4)!=1 )&&Util.getInt(bean.c5p515)==0 )){
	
		if (!chbC5P516_1.isChecked() && !chbC5P516_2.isChecked()
				&& !chbC5P516_3.isChecked() && !chbC5P516_4.isChecked()
				&& !chbC5P516_5.isChecked() ) {
			mensaje = "DEBE SELECCIONAR UNA ALTERNATIVA EN P516";
			view = chbC5P516_1;
			error = true;
			return false;
		}
	}
//	VERIFICACIÓN 1	:	Si C5P514_4= 1 and C5P501_7A=1 Pase a C5P517_1
//			            Si C5P514_4= 1 and C5P501_7A=2 Pase a C5P518
	
//	  2           Si C5P515 =2 and C5P501_7A=1 Pase a C5P517_1
//               Si C5P515 =2 and C5P501_7A=2 Pase a C5P518

                   //517
/*	if (( Util.getInt(bean.c5p515)==2 && Util.getInt(bean1.c5p501_7a)==1)||
			( Util.getInt(bean1.c5p501_7a)==1 && (Util.getInt(bean.c5p514_4)==1)))
    	{
		if (Util.esVacio(rgC5P517_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_1");
			view = rgC5P517_1;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC5P517_2)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_2");
			view = rgC5P517_2;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P517_3)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_3");
			view = rgC5P517_3;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P517_4)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_4");
			view = rgC5P517_4;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC5P517_5)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_5");
			view = rgC5P517_5;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC5P517_6)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_6");
			view = rgC5P517_6;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC5P517_7)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_7");
			view = rgC5P517_7;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC5P517_8)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_8");
			view = rgC5P517_8;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC5P517_9)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P517_9");
			view = rgC5P517_9;
			error = true;
			return false;
		}
		
		
		if (rgC5P517_9.isTagSelectedBetween(2,4)) {
			if (Util.esVacio(txtC5P517_9ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.517 (Especifique)");
				view = txtC5P517_9ESP;
				error = true;
				return false;
			} else {
				if (txtC5P517_9ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC5P517_9ESP;
					error = true;
					return false;
				}
			}
		}
    }
		
		if (Util.esVacio(rgC5P518)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P518");
			view = rgC5P518;
			error = true;
			return false;
		}
*/
	
		if (Util.esVacio(rgC5P521)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P521");
			view = rgC5P521;
			error = true;
			return false;
		}
		Integer valor = Integer.parseInt(rgC5P521.getTagSelected("0")
				.toString());
		if (valor == 4) {
			if (Util.esVacio(txtC5P521_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.521 (Especifique)");
				view = txtC5P521_ESP;
				error = true;
				return false;
			} else {
				if (txtC5P521_ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC5P521_ESP;
					error = true;
					return false;
				}
			}
		}

		if (Util.esVacio(rgC5P522)) {
			mensaje = pregunta_no_vacia.replace("$", "La Pregunta P522");
			view = rgC5P522;
			error = true;
			return false;
		}
		Integer valor1 = Integer.parseInt(rgC5P522.getTagSelected("0")
				.toString());
		if (valor1 == 5) {
			if (Util.esVacio(txtC5P522_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.522 (Especifique)");
				view = txtC5P522_ESP;
				error = true;
				return false;
			} else {
				if (txtC5P522_ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC5P522_ESP;
					error = true;
					return false;
				}
			}
		}
		
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModulov02(
				App.getInstance().getEmpresa(),
				new Modulov02().getSecCap(getListFields(this, new String[] {
						"C5P510", "C5P514", "C5P515","C5P514_4"})));
		bean1 = getCuestionarioService().getModulov01(
				App.getInstance().getEmpresa(),
				new Modulov01().getSecCap(Util.getListList("C5P503",
						"C5P501_1A", "C5P501_2A", "C5P501_3A","C5P501_7A")));

		if (bean == null) {
			bean = new Modulov02();
			bean.id = App.getInstance().getEmpresa().id;
		}
		if (bean1 == null) {
			bean1 = new Modulov01();
			bean1.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();

	}

	private void inicio() {	
//		VERIFICACIÓN	:	Si C5P515 =1 Pase a C5P516_1
//        Si C5P515 =2 and C5P501_7A=1 Pase a C5P517_1
//        Si C5P515 =2 and C5P501_7A=2 Pase a C5P518

//		VERIFICACIÓN	:	
		  //Si C5P514_4= 1 and C5P501_7A=1 Pase a C5P517_1
//		    Si C5P514_4= 1 and C5P501_7A=2 Pase a C5P518
//			Si C5P514_4 = 0  Pase a C5P514A_1

		/*
		if ((Util.getInt(bean.c5p515) == 2)|| (Util.getInt(bean.c5p514_4) == 1)) {
			if (Util.getInt(bean1.c5p501_7a) == 1) {
				Util.cleanAndLockView(getActivity(), chbC5P516_1, chbC5P516_2,
						chbC5P516_3, chbC5P516_4, chbC5P516_5);
				rgC5P517_1.requestFocus();
			} else {
					Util.lockView(getActivity(), false, chbC5P516_1,
							chbC5P516_2, chbC5P516_3, chbC5P516_4, chbC5P516_5);
			
				if (Util.getInt(bean1.c5p501_7a) == 2) {
					Util.cleanAndLockView(getActivity(), chbC5P516_1,
							chbC5P516_2, chbC5P516_3, chbC5P516_4, chbC5P516_5,
							rgC5P517_1, rgC5P517_2, rgC5P517_3, rgC5P517_4,
							rgC5P517_5, rgC5P517_6, rgC5P517_7, rgC5P517_8,
							rgC5P517_9, txtC5P517_9ESP);
					rgC5P518.requestFocus();
				} else {
					Util.lockView(getActivity(), false, chbC5P516_1,
							chbC5P516_2, chbC5P516_3, chbC5P516_4, chbC5P516_5,
							rgC5P517_1, rgC5P517_2, rgC5P517_3, rgC5P517_4,
							rgC5P517_5, rgC5P517_6, rgC5P517_7, rgC5P517_8,
							rgC5P517_9, txtC5P517_9ESP);
					rgC5P517_1.requestFocus();
					if (Util.getInt(bean.c5p515) == 1) {
						Util.lockView(getActivity(), false, chbC5P516_1,
								chbC5P516_2, chbC5P516_3, chbC5P516_4,
								chbC5P516_5, rgC5P517_1, rgC5P517_2,
								rgC5P517_3, rgC5P517_4, rgC5P517_5, rgC5P517_6,
								rgC5P517_7, rgC5P517_8, rgC5P517_9,
								txtC5P517_9ESP);

						chbC5P516_1.requestFocus();
					}
				}

			}
		}else{
			Util.lockView(getActivity(), false, chbC5P516_1,
					chbC5P516_2, chbC5P516_3, chbC5P516_4, chbC5P516_5,
					rgC5P517_1, rgC5P517_2, rgC5P517_3, rgC5P517_4,
					rgC5P517_5, rgC5P517_6, rgC5P517_7, rgC5P517_8,
					rgC5P517_9, txtC5P517_9ESP);
		}
				Log.e("aquuiiiii voy:c5p515:" + bean.c5p515, "aquiiiiiiiiiii");
				Log.e("aquuiiiii voy:c5p501_7a: " + bean1.c5p501_7a, "aquiiiiiiiiiii");
				Log.e("aquuiiiii voy:c5p518: " + bean.c5p518, "aquiiiiiiiiiii");
				Log.e("aquuiiiii voy:c5p514:" + bean.c5p514_4, "aquiiiiiiiiiii");
						chbC5P516_1.requestFocus();
						FuncionCHECK517();
						*/
						chbC5P516_1.requestFocus();
	}

	
//	VERIFICACIÓN	:	Si C5P517_9 >1  Pase a C5P517_9ESP, Luego a C5P18
//	Si C5P517_9 = 1  Pase a C5P518

/*	public void FuncionCHECK517() {
		Integer valor = Integer.parseInt(rgC5P517_9.getTagSelected("0").toString());
		if (valor>1) {
			Util.lockView(getActivity(), false, txtC5P517_9ESP);
			txtC5P517_9ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P517_9ESP);
		}
	}
//	VERIFICACIÓN	: Si C5P516_5<> VACIO and C5P501_7A=1 Pase C5P517_1
//			          Si C5P516_5<> VACIO and C5P501_7A=0Pase C5P518
	public void FuncionpP516() {
		if ((Util.getInt(bean1.c5p501_7a) == 1) && (!chbC5P516_5.isChecked())) {
			Util.cleanAndLockView(getActivity(), rgC5P517_1, rgC5P517_2,
					rgC5P517_3, rgC5P517_4, rgC5P517_5, rgC5P517_6, rgC5P517_7,
					rgC5P517_8, rgC5P517_9, txtC5P517_9ESP);
			rgC5P518.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC5P517_1, rgC5P517_2,
					rgC5P517_3, rgC5P517_4, rgC5P517_5, rgC5P517_6, rgC5P517_7,
					rgC5P517_8, rgC5P517_9, txtC5P517_9ESP);
			rgC5P517_1.requestFocus();
		}

	}*/
//	VERIFICACIÓN	:	Si C5P518 = 2  Pase a C5P520
//			Si C5P518 = 1  Pase a C5P519

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

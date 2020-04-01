package gob.inei.ene2019v2.fragment.ModV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
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
import gob.inei.ene2019v2.model.Caratula;
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

public class Mod_V_Fragment_005 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC5P512;
	
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC5P512_1;
	
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC5P512A;
	@FieldAnnotation(orderIndex = 4)
	public TextField txtC5P512A_ESP;
	
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC5P513;
	@FieldAnnotation(orderIndex = 6)
	public TextField txtC4P513_ESP;
	
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC5P513A_1;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC5P513A_2;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC5P513A_3;
	@FieldAnnotation(orderIndex = 10)
	public TextField txtC5P513A_3ESP;
	
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC5P513B;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC5P513C_1;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC5P513C_2;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC5P513C_3;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC5P513C_4;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC5P513C_5;
	
//	@FieldAnnotation(orderIndex = 6)
//	public RadioGroupOtherField rgC5P514;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC5P514_1;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC5P514_2;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC5P514_3;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC5P514_4;
	@FieldAnnotation(orderIndex = 21)
	public TextField txtC5P514_3ESP;
	
	@FieldAnnotation(orderIndex = 22)
	public CheckBoxField chbC5P514A_1;
	@FieldAnnotation(orderIndex = 23)
	public CheckBoxField chbC5P514A_2;
	@FieldAnnotation(orderIndex = 24)
	public CheckBoxField chbC5P514A_3;
	@FieldAnnotation(orderIndex = 25)
	public CheckBoxField chbC5P514A_4;
	@FieldAnnotation(orderIndex = 26)
	public CheckBoxField chbC5P514A_5;
	@FieldAnnotation(orderIndex = 27)
	public CheckBoxField chbC5P514A_6;
	@FieldAnnotation(orderIndex = 28)
	public CheckBoxField chbC5P514A_7;
	@FieldAnnotation(orderIndex = 29)
	public TextField txtC5P514A_7ESP;
	
	@FieldAnnotation(orderIndex = 30)
	public RadioGroupOtherField rgC5P515;
	private CuestionarioService cuestionarioService;
	private Modulov02 bean;
	private Modulov01 bean1;
	private Caratula bean2;
	private LabelComponent lblTitulo, lblsubTitulo,lblSubTitulo3;
	private GridComponent2 gcPreg13a,gcPreg14a,gcPreg14, gcPreg15;
	LinearLayout q0, q1, q1_1, q2, q3, q4, q5, q6, q6_1, q6_2, q7;

	public Mod_V_Fragment_005() {
	}

	public Mod_V_Fragment_005 parent(MasterActivity parent) {
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
		lblSubTitulo3 = new LabelComponent(this.getActivity())
				.size(MATCH_PARENT, MATCH_PARENT)
				.text(R.string.textoamarillop012).textSize(18).negrita()
				.colorFondo(R.color.amarillo);
	
		rgC5P512 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.c1c100_No
				).size(WRAP_CONTENT, 400)
				.orientation(ORIENTATION.HORIZONTAL);
		
		rgC5P512_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.c1c100_No
				).size(WRAP_CONTENT, 400)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionRG512");
		
		rgC5P512A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p012_1, R.string.c1c100m5p012_2,R.string.c1c100m5p012_3, R.string.c1c100m5p012_4,
				R.string.c1c100m5p012_5,R.string.c1c100m5p012_6).size(WRAP_CONTENT, 600)
				.orientation(ORIENTATION.VERTICAL);
		txtC5P512A_ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		
		rgC5P512A.agregarEspecifique(4, txtC5P512A_ESP);
		
		rgC5P513 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p013_1, R.string.c1c100m5p013_2,R.string.c1c100m5p013_3, R.string.c1c100m5p013_4,R.string.c1c100m5p013_5,
				R.string.c1c100m5p013_6).size(WRAP_CONTENT, 600)
				.orientation(ORIENTATION.VERTICAL).callback("FuncionRG513");
		txtC4P513_ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		rgC5P513.agregarEspecifique(4, txtC4P513_ESP);
		
		chbC5P513A_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013a_1, "1:0").size(altoComponente, 600);
		chbC5P513A_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013a_2, "1:0").size(altoComponente, 600);
		chbC5P513A_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013a_3, "1:0").size(altoComponente, 150).callback("FuncionCHECK513a");
		txtC5P513A_3ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		rgC5P513B = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.c1c100_No
				).size(WRAP_CONTENT, 400)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionRG513B");
		chbC5P513C_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013c_1, "1:0").size(altoComponente, 700);
		chbC5P513C_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013c_2, "1:0").size(altoComponente, 700);
		chbC5P513C_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013c_3, "1:0").size(altoComponente, 700);
		chbC5P513C_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013c_4, "1:0").size(altoComponente, 700);
		chbC5P513C_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p013c_5, "1:0").size(altoComponente, 700);
		
		chbC5P514_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014_1, "1:0").size(altoComponente, 700).callback("Funcion514");
		chbC5P514_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014_2, "1:0").size(altoComponente, 700).callback("Funcion514");
		chbC5P514_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014_3, "1:0").size(altoComponente, 350).callback("FuncionCHECK514").callback("Funcion514");
		chbC5P514_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014_4, "1:0").size(altoComponente, 700).callback("Funcion514");
		txtC5P514_3ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 350).hint(R.string.especifique)
		.soloTextoNumero();
		
		chbC5P514A_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014a_1, "1:0").size(altoComponente, 600);
		chbC5P514A_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014a_2, "1:0").size(altoComponente, 600);
		chbC5P514A_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014a_3, "1:0").size(altoComponente, 600);
		chbC5P514A_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014a_4, "1:0").size(altoComponente, 600);
		chbC5P514A_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014a_5, "1:0").size(altoComponente, 600);
		chbC5P514A_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014a_6, "1:0").size(altoComponente, 600);
		chbC5P514A_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p014a_7, "1:0").size(altoComponente, 150).callback("FuncionCHECK514a");
		txtC5P514A_7ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		

		
		rgC5P515 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.c1c100_No
				).size(WRAP_CONTENT, 400)
				.orientation(ORIENTATION.HORIZONTAL);

		gcPreg13a = new GridComponent2(this.getActivity(), 2)
				.colorFondo(R.color.transparent);
		gcPreg13a.addComponent(chbC5P513A_3);
		gcPreg13a.addComponent(txtC5P513A_3ESP);
		
		gcPreg14 = new GridComponent2(this.getActivity(), 2)
		.colorFondo(R.color.transparent);
		gcPreg14.addComponent(chbC5P514_3);
		gcPreg14.addComponent(txtC5P514_3ESP);

		gcPreg14a = new GridComponent2(this.getActivity(), 2)
				.colorFondo(R.color.transparent);
		gcPreg14a.addComponent(chbC5P514A_7);
		gcPreg14a.addComponent(txtC5P514A_7ESP);
			

//		Filtros.setFiltro(txtC5P513_6ESP, Filtros.TIPO.ALFAN_U, 300, null);
//		Filtros.setFiltro(txtC5P515_6ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
		q1 = createQuestionSection(R.string.c1c100m5p012, rgC5P512);
		q1_1 = createQuestionSection(R.string.c1c100m5p012_1_1, rgC5P512_1);
		q2 = createQuestionSection(R.string.c1c100m5p012a, rgC5P512A);
		q3 = createQuestionSection(R.string.c1c100m5p013, rgC5P513);
		q6 = createQuestionSection(R.string.c1c100m5p013a, chbC5P513A_1,
				chbC5P513A_2,gcPreg13a.component());
		q6_1 = createQuestionSection(R.string.c1c100m5p013b, rgC5P513B);
		q6_2 = createQuestionSection(R.string.c1c100m5p013c, chbC5P513C_1, chbC5P513C_2, chbC5P513C_3, chbC5P513C_4, chbC5P513C_5);
		
		q4 = createQuestionSection(R.string.c1c100m5p014, chbC5P514_1,chbC5P514_2,gcPreg14.component(),chbC5P514_4);
		q7 = createQuestionSection(R.string.c1c100m5p014a, chbC5P514A_1,chbC5P514A_2,chbC5P514A_3,chbC5P514A_4,chbC5P514A_5,chbC5P514A_6,gcPreg14a.component());
		q5 = createQuestionSection(R.string.c1c100m5p015, rgC5P515);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q1_1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q6);
		form.addView(q6_1);
		form.addView(q6_2);
		form.addView(q4);
		form.addView(q7);
		form.addView(q5);

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

			if((Util.getInt(bean.c5p515)==2  )||(Util.getInt(bean.c5p514_4)==1 )){ 
				if ( Util.getInt(bean1.c5p501_7a)==1) {
			
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C5P516_1", "C5P516_2", "C5P516_3", "C5P516_4",
								"C5P516_5"})))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
				
			  }			
			}
			if((Util.getInt(bean.c5p515)==2  )||(Util.getInt(bean.c5p514_4)==1 )){ 
				if ( Util.getInt(bean1.c5p501_7a)==2) {
			
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C5P516_1", "C5P516_2", "C5P516_3", "C5P516_4",
								"C5P516_5", "C5P517_1", "C5P517_2", "C5P517_3", "C5P517_4",
								"C5P517_5", "C5P517_6", "C5P517_7", "C5P517_8", "C5P517_9",
								"C5P517_9ESP"})))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			  }			
			}
			
			Integer valor = Integer.parseInt(rgC5P512_1.getTagSelected("0")
					.toString());
			if (valor == 2 && Util.getInt(bean2.p25) < 3) {
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C5P516_1", "C5P516_2", "C5P516_3", "C5P516_4",
								"C5P516_5", "C5P521", "C5P521_ESP", "C5P522", "C5P522_ESP",
								"C5P523_1", "C5P523_2", "C5P523_3", "C5P523_4", 
								"C5P524_1", "C5P524_2", "C5P524_3", "C5P524_4",
								"C5P525_A_1", "C5P525_A_2", "C5P525_A_3", "C5P525_A_4",
								"C5P525_B_1", "C5P525_C_1", "C5P525_C_2", "C5P525_C_3",
								"C5P525_D_1", "C5P525_D_2", "C5P525_E_1",
								"C5P526_1", "C5P526_2", "C5P526_3", "C5P526_4", "C5P526_5", "C5P526_6",
								"C5P526_7", "C5P526_8", "C5P526_9", "C5P526_9ESP", "C5P527",
								"C5P528_1", "C5P528_2", "C5P528_3", "C5P528_4", "C5P528_4ESP"})))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
				
			}
			
			Integer valor2 = Integer.parseInt(rgC5P513B.getTagSelected("0")
					.toString());
			if (valor2 == 2) {
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C5P516_1", "C5P516_2", "C5P516_3", "C5P516_4",
								"C5P516_5", "C5P521", "C5P521_ESP", "C5P522", "C5P522_ESP",
								"C5P523_1", "C5P523_2", "C5P523_3", "C5P523_4", 
								"C5P524_1", "C5P524_2", "C5P524_3", "C5P524_4",
								"C5P525_A_1", "C5P525_A_2", "C5P525_A_3", "C5P525_A_4",
								"C5P525_B_1", "C5P525_C_1", "C5P525_C_2", "C5P525_C_3",
								"C5P525_D_1", "C5P525_D_2", "C5P525_E_1",
								"C5P526_1", "C5P526_2", "C5P526_3", "C5P526_4", "C5P526_5", "C5P526_6",
								"C5P526_7", "C5P526_8", "C5P526_9", "C5P526_9ESP"})))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
				
			}
			
			
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
	
			
		if(Util.getInt(bean2.p25)< 3 ){	
			if (Util.esVacio(rgC5P512)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P512");
				view = rgC5P512;
				error = true;
				return false;
			}
			
			if (Util.esVacio(rgC5P512_1)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P512_1");
				view = rgC5P512_1;
				error = true;
				return false;
			}
		
		Integer valor2 = Integer.parseInt(rgC5P512_1.getTagSelected("0")
					.toString());
		if (valor2 == 1) {
			
		if (Util.esVacio(rgC5P512A)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P512A");
			view = rgC5P512A;
			error = true;
			return false;
		}
		
		Integer valor = Integer.parseInt(rgC5P512A.getTagSelected("0").toString());
		    if (valor == 5) {
			if (Util.esVacio(txtC5P512A_ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.512A (Especifique)");
						view = txtC5P512A_ESP;
						error = true;
						return false;
					} else {
						if (txtC5P512A_ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC5P512A_ESP;
							error = true;
							return false;
						}
					}
				}
			
		if (Util.esVacio(rgC5P513)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P513");
			view = rgC5P513;
			error = true;
			return false;
		}
				
		Integer valor1 = Integer.parseInt(rgC5P513.getTagSelected("0").toString());
	    if (valor1 == 5) {
		if (Util.esVacio(txtC4P513_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.513(Especifique)");
					view = txtC4P513_ESP;
					error = true;
					return false;
				} else {
					if (txtC4P513_ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P513_ESP;
						error = true;
						return false;
					}
				}
			}	    
        		    
	   if (valor1 ==6){
			 if (!chbC5P513A_1.isChecked() && !chbC5P513A_2.isChecked()
						&& !chbC5P513A_3.isChecked()) {
					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P513A";
					view = chbC5P513A_1;
					error = true;
					return false;
				}		  
		    
			if (chbC5P513A_3.isChecked()) {
				if (Util.esVacio(txtC5P513A_3ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.513A (Especifique)");
					view = txtC5P513A_3ESP;
					error = true;
					return false;
				} else {
					if (txtC5P513A_3ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC5P513A_3ESP;
						error = true;
						return false;
					}
				}
			}		   
	   }
	   
		if (Util.esVacio(rgC5P513B)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P513B");
			view = rgC5P513B;
			error = true;
			return false;
		}
		
				Integer valor3 = Integer.parseInt(rgC5P513B.getTagSelected("0")
						.toString());
				if (valor3 == 1) {
					if (!chbC5P513C_1.isChecked() && !chbC5P513C_2.isChecked()
							&& !chbC5P513C_3.isChecked() && !chbC5P513C_4.isChecked() && !chbC5P513C_5.isChecked()) {
						mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P513C";
						view = chbC5P513C_1;
						error = true;
						return false;
					}
					
					if (!chbC5P514_1.isChecked() && !chbC5P514_2.isChecked()
							&& !chbC5P514_3.isChecked() && !chbC5P514_4.isChecked()) {
						mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P514";
						view = chbC5P514_1;
						error = true;
						return false;
					}
					
					
					if (chbC5P514_3.isChecked()) {
						if (Util.esVacio(txtC5P514_3ESP)) {
							mensaje = pregunta_no_vacia.replace("$",
									"La Preg.514 (Especifique)");
							view = txtC5P514_3ESP;
							error = true;
							return false;
						} else {
							if (txtC5P514_3ESP.getText().length() < 3) {
								mensaje = "Ingrese la información correcta";
								view = txtC5P514_3ESP;
								error = true;
								return false;
							}
						}
					}
					
					if (!chbC5P514_4.isChecked()) {
						if (!chbC5P514A_1.isChecked() && !chbC5P514A_2.isChecked()
								&& !chbC5P514A_3.isChecked() && !chbC5P514A_4.isChecked()
								&& !chbC5P514A_5.isChecked() && !chbC5P514A_6.isChecked()
								&& !chbC5P514A_7.isChecked()) {
							mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P514A";
							view = chbC5P514A_1;
							error = true;
							return false;
						}

						if (chbC5P514A_7.isChecked()) {
							if (Util.esVacio(txtC5P514A_7ESP)) {
								mensaje = pregunta_no_vacia.replace("$",
										"La Preg.514A (Especifique)");
								view = txtC5P514A_7ESP;
								error = true;
								return false;
							} else {
								if (txtC5P514A_7ESP.getText().length() < 3) {
									mensaje = "Ingrese la información correcta";
									view = txtC5P514A_7ESP;
									error = true;
									return false;
								}
							}
						}
						if (Util.esVacio(rgC5P515)) {
							mensaje = pregunta_no_vacia.replace("$", "La Pregunta P515");
							view = rgC5P515;
							error = true;
							return false;
						}
					}
					
				}
		
			}
		
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModulov02(
				App.getInstance().getEmpresa(),
				new Modulov02().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Modulov02();
			bean.id = App.getInstance().getEmpresa().id;
		}
	
		bean1 = getCuestionarioService().getModulov01(
				App.getInstance().getEmpresa(),
				new Modulov01().getSecCap(Util.getListList("C5P511_9","C5P501_7A")));
		if (bean1 == null) {
			bean1 = new Modulov01();
			bean1.id = App.getInstance().getEmpresa().id;
		}
		bean2 = getCuestionarioService().getCaratula(
				App.getInstance().getEmpresa(),
				new Caratula().getSecCap(Util.getListList("P25")));
		if (bean2 == null) {
			bean2 = new Caratula();
			bean2.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
	
		FuncionCHECK513a();
		FuncionCHECK514();
	//	Funcion514_4();    
		FuncionCHECK514a();
		
		FuncionRG512();
		FuncionRG513();
		FuncionRG513B();
		Funcion514();
		
//        Si C5P511_9= 1 and P25=1,2 and C5P503_1=0  Pase a C5P511_9ESP, luego a C5P513
//        Si C5P511_9= 0 and P25=1,2 and C5P503_1=0  Pase a C5P513

//		if ((((Util.getInt(bean1.c5p511_9)==1)&&((Util.getInt(bean2.p25)==1)||(Util.getInt(bean2.p25)==2))))||
//		    ((Util.getInt(bean1.c5p511_9)==0)&&((Util.getInt(bean2.p25)==1)||(Util.getInt(bean2.p25)==2))))
//		{
//			Util.cleanAndLockView(getActivity(),rgC5P512,rgC5P512A );
//		    rgC5P513.requestFocus();
//		}else {
//		   Util.lockView(getActivity(), false,rgC5P512,rgC5P512A);
//		  rgC5P512.requestFocus();
//		}
		
		  rgC5P512.requestFocus();
		
	}
//	VERIFICACIÓN	:	Si C5P513 = 1:5 Pase a C5P514_1
//			Si C5P513 = 6  Pase a C5P513A_1
//			Si C5P513 = 5  Pase a C4P513_ESP, luego pase a C5P514_1

	public void FuncionRG512() {
		Integer valor = Integer.parseInt(rgC5P512_1.getTagSelected("0")
				.toString());
		if (valor == 2 && Util.getInt(bean2.p25) < 3) {
			Util.cleanAndLockView(getActivity(), rgC5P512A,rgC5P513,chbC5P513A_1,chbC5P513A_2,chbC5P513A_3,txtC5P513A_3ESP,
					rgC5P513B, chbC5P513C_1, chbC5P513C_2, chbC5P513C_3, chbC5P513C_4, chbC5P513C_5,
					chbC5P514_1,chbC5P514_2,chbC5P514_3,chbC5P514_4,txtC5P514_3ESP,chbC5P514A_1,chbC5P514A_2,chbC5P514A_3,
					chbC5P514A_4,chbC5P514A_5,chbC5P514A_6,chbC5P514A_7,txtC5P514A_7ESP,rgC5P515);
		} else {
			Util.lockView(getActivity(), false,  rgC5P512A,rgC5P513,chbC5P513A_1,chbC5P513A_2,chbC5P513A_3,
					rgC5P513B, chbC5P513C_1, chbC5P513C_2, chbC5P513C_3, chbC5P513C_4, chbC5P513C_5,
					/*chbC5P514_1,chbC5P514_2,chbC5P514_3,chbC5P514_4,*/chbC5P514A_1,chbC5P514A_2,chbC5P514A_3,
					chbC5P514A_4,chbC5P514A_5,chbC5P514A_6,chbC5P514A_7,rgC5P515);
			rgC5P512A.requestFocus();
		}
	}
	
	public void FuncionRG513() {
		Integer valor = Integer.parseInt(rgC5P513.getTagSelected("0")
				.toString());
		if (valor == 6) {
			Util.lockView(getActivity(), false,  chbC5P513A_1,chbC5P513A_2,chbC5P513A_3);
			chbC5P513A_1.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC5P513A_1,chbC5P513A_2,chbC5P513A_3,txtC5P513A_3ESP);
			rgC5P513B.requestFocus();
		}
	}

	public void FuncionCHECK513a() {
		if (chbC5P513A_3.isChecked()) {
			Util.lockView(getActivity(), false, txtC5P513A_3ESP);
			txtC5P513A_3ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P513A_3ESP);
		}
	}
	public void Funcion513a() {
		if (chbC5P513A_3.isChecked()) {
			Util.lockView(getActivity(), false, txtC5P513A_3ESP);
			txtC5P513A_3ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P513A_3ESP);
		}
	}
	
	public void FuncionRG513B() {
		Integer valor = Integer.parseInt(rgC5P513B.getTagSelected("0")
				.toString());
		if (valor == 1) {
			Util.lockView(getActivity(), false,  chbC5P513C_1,chbC5P513C_2,chbC5P513C_3,chbC5P513C_4,chbC5P513C_5,
					chbC5P514_1,chbC5P514_2,chbC5P514_3,chbC5P514_4,chbC5P514A_1,chbC5P514A_2,
					chbC5P514A_3,chbC5P514A_4,chbC5P514A_5,chbC5P514A_6,chbC5P514A_7,rgC5P515);
			chbC5P513C_1.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC5P513C_1,chbC5P513C_2,chbC5P513C_3,chbC5P513C_4,chbC5P513C_5,
					chbC5P514_1,chbC5P514_2,chbC5P514_3,chbC5P514_4,txtC5P514_3ESP,chbC5P514A_1,chbC5P514A_2,
					chbC5P514A_3,chbC5P514A_4,chbC5P514A_5,chbC5P514A_6,chbC5P514A_7,txtC5P514A_7ESP,rgC5P515);
		}
	}
	
	public void Funcion514() {
		
//		VERIFICACIÓN	:	Si C5P514_4= 1 and C5P501_7A=1 Pase a C5P517_1
//				            Si C5P514_4= 1 and C5P501_7A=2 Pase a C5P518

//		if ((chbC5P514_4.isChecked()&& Util.getInt(bean1.c5p501_7a)==1)||(chbC5P514_4.isChecked()&& Util.getInt(bean1.c5p501_7a)==2)) {
//			Util.cleanAndLockView(getActivity(),chbC5P514_1,chbC5P514_2,chbC5P514_3, chbC5P514A_1,chbC5P514A_2,chbC5P514A_3,chbC5P514A_4,chbC5P514A_5,chbC5P514A_6,chbC5P514A_7, txtC5P514A_7ESP,rgC5P515);
//			//salta 517 y 518
//			
//		} else {
//			Util.lockView(getActivity(), false,chbC5P514_1,chbC5P514_2,chbC5P514_3, chbC5P514A_1,chbC5P514A_2,chbC5P514A_3,chbC5P514A_4,chbC5P514A_5,chbC5P514A_6,chbC5P514A_7, rgC5P515);
//			chbC5P514A_1.requestFocus();
//
//		}
		
		Integer valor = Integer.parseInt(rgC5P513B.getTagSelected("0")
				.toString());
		if (valor == 1) {
		
			if (!chbC5P514_1.isChecked() && !chbC5P514_2.isChecked()
					&& !chbC5P514_3.isChecked()) {
				Util.lockView(getActivity(), false, chbC5P514_4);

			} else {
				Util.cleanAndLockView(getActivity(), chbC5P514_4);
			}

			if (!chbC5P514_4.isChecked()) {
				Util.lockView(getActivity(), false, chbC5P514_1, chbC5P514_2,
						chbC5P514_3);
			} else {
				Util.cleanAndLockView(getActivity(), chbC5P514_1, chbC5P514_2,
						chbC5P514_3);
			}
			
		}	
		
	}

	public void FuncionCHECK514() {
		if (chbC5P514_3.isChecked()) {
			Util.lockView(getActivity(), false, txtC5P514_3ESP);
			txtC5P514_3ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P514_3ESP);
		}
	}
	public void FuncionCHECK514a() {
		if (chbC5P514A_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC5P514A_7ESP);
			txtC5P514A_7ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P514A_7ESP);
		}
	}
//	VERIFICACIÓN	:	Si C5P515 =1 Pase a C5P516_1
//			   Si C5P515 =2 Pase a C5P521

	public void FuncionRG515() {
		//salta 521
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

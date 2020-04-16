package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv03;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

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

public class Mod_IV_Fragment_024 extends FragmentForm {
	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P483A;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC4P483B;
	@FieldAnnotation(orderIndex = 3)
	public TextField txtC4P483B_4ESP;
	
	@FieldAnnotation(orderIndex = 4)
	public TextField txtC4P484;
//	@FieldAnnotation(orderIndex = 5)
//	public CheckBoxField chbC4P484_1;
	
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC4P484A;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC4P485;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC4P485A;
	
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P485B_1;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P485B_2;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC4P485B_3;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC4P485B_4;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P485B_5;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P485B_6;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC4P485B_7;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P485B_8;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC4P485B_9;
	@FieldAnnotation(orderIndex = 17)
	public TextField txtC4P485B_8ESP;
	
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC4P486_1;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC4P486_2;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC4P486_3;
	@FieldAnnotation(orderIndex = 21)
	public CheckBoxField chbC4P486_4;
	@FieldAnnotation(orderIndex = 22)
	public CheckBoxField chbC4P486_5;
	@FieldAnnotation(orderIndex = 23)
	public CheckBoxField chbC4P486_6;
	@FieldAnnotation(orderIndex = 24)
	public CheckBoxField chbC4P486_7;
	@FieldAnnotation(orderIndex = 25)
	public TextField txtC4P486_6ESP;
	
	@FieldAnnotation(orderIndex = 26)
	public RadioGroupOtherField rgC4P487;
	@FieldAnnotation(orderIndex = 27)
	public RadioGroupOtherField rgC4P488;

	private CuestionarioService cuestionarioService;
	private GridComponent2 grd0, grd,grd1;
	private Moduloiv03 bean;
	private Moduloiv03 bean1;
	SeccionCapitulo[] campos;
	private LabelComponent lblTitulo, lblTitulo1;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_024() {
	}

	public Mod_IV_Fragment_024 parent(MasterActivity parent) {
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
		campos = new SeccionCapitulo[] { new SeccionCapitulo(1, 1, 1,
				"ID", "NIVEL_ID") };
		enlazarCajas();
		listening();

		return rootView;
	}

	@Override
	protected void buildFields() {

		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m400p).textSize(21).centrar().negrita();
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m4p084_title).textSize(20).centrar()
				.negrita();

		txtC4P484 = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.NombreServicio)
				.centrar().negrita().soloTextoNumero();
		
		 //        txtC4P484.addTextChangedListener(twP484);
		   	
		rgC4P483A = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
		
		rgC4P483B = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p483B_1, R.string.c1c100m4p483B_2,R.string.c1c100m4p483B_3,R.string.c1c100m4p483B_4,R.string.c1c100m4p483B_5)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
		
		txtC4P483B_4ESP= new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		
		rgC4P483B.agregarEspecifique(3, txtC4P483B_4ESP);
		
		
		rgC4P484A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p085_1, R.string.c1c100m4p085_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).callback("FuncionP484A");
		
		
		rgC4P484A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p085_1, R.string.c1c100m4p085_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).callback("FuncionP484A");
		rgC4P485 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p085_1, R.string.c1c100m4p085_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).callback("FuncionP485");
		
		rgC4P485A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p485a_1, R.string.c1c100m4p485a_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);
		
		chbC4P485B_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9a");
		
		chbC4P485B_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9a");		
		chbC4P485B_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9a");
		chbC4P485B_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9a");
		chbC4P485B_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9a");
		chbC4P485B_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9a");
		chbC4P485B_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_7, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9a");
		chbC4P485B_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_8, "1:0").size(altoComponente, 180).callback("Funcion485BCheck").callback("Funcion485B_9a");
		chbC4P485B_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p485b_9, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion485B_9");	
		txtC4P485B_8ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
			
		chbC4P486_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p486_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion486a");
		chbC4P486_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p486_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion486a");		
		chbC4P486_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p486_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion486a");
		chbC4P486_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p486_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion486a");
		chbC4P486_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p486_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion486a");
		chbC4P486_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p486_6, "1:0").size(altoComponente, 190).callback("Funcion486Check").callback("Funcion486a");
		chbC4P486_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p486_7, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("Funcion486");
		txtC4P486_6ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
	
		
		rgC4P487 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p087_1, R.string.c1c100m4p087_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP487");
		rgC4P488 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p088_1, R.string.c1c100m4p088_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);
		
		grd0 = new GridComponent2(this.getActivity(), Gravity.CENTER_VERTICAL, 1);
		grd0.addComponent(txtC4P484);
		//grd0.addComponent(chbC4P484_1);
		grd0.colorFondo(R.color.WhiteSmoke);
		grd0.component();
		
		grd = new GridComponent2(this.getActivity(), Gravity.CENTER_VERTICAL, 2);
		grd.addComponent(chbC4P485B_8);
		grd.addComponent(txtC4P485B_8ESP);
		grd.colorFondo(R.color.WhiteSmoke);
		grd.component();
		
		grd1 = new GridComponent2(this.getActivity(), Gravity.CENTER_VERTICAL, 2);
		grd1.addComponent(chbC4P486_6);
		grd1.addComponent(txtC4P486_6ESP);
		grd1.colorFondo(R.color.WhiteSmoke);
		grd1.component();
		
		

		Filtros.setFiltro(txtC4P484, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC4P483B_4ESP, Filtros.TIPO.ALFAN_U, 300, null);
		
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q9 = createQuestionSection(R.string.c1c100m4p483A, rgC4P483A);
		q10 = createQuestionSection(R.string.c1c100m4p483B, rgC4P483B);
		q1 = createQuestionSection(R.string.c1c100m4p484, grd0);
		q2 = createQuestionSection(R.string.c1c100m4p484A, rgC4P484A);
		q3 = createQuestionSection(R.string.c1c100m4p485, rgC4P485);
		q4 = createQuestionSection(R.string.c1c100m4p485a, rgC4P485A);
		
		q5 = createQuestionSection(R.string.c1c100m4p485b, Gravity.START, chbC4P485B_1,
				chbC4P485B_2, chbC4P485B_3, chbC4P485B_4, chbC4P485B_5,
				chbC4P485B_6, chbC4P485B_7, grd, chbC4P485B_9);
		
		q6 = createQuestionSection(R.string.c1c100m4p486, Gravity.START, chbC4P486_1,
				chbC4P486_2, chbC4P486_3, chbC4P486_4, chbC4P486_5,
				 grd1, chbC4P486_7);
		q7 = createQuestionSection(R.string.c1c100m4p487, rgC4P487);
		q8 = createQuestionSection(R.string.c1c100m4p488, rgC4P488);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q9);
		form.addView(q10);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
		form.addView(q5);
		form.addView(q6);
		form.addView(q7);
		form.addView(q8);

		return contenedor;
	}

	@Override
	public boolean grabar() {
		uiToEntity(bean);
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
		
//		String[] extras = null;
//		extras = new String[] { "C4P484", "C4P484A", "C4P485",
//
//		"C4P485A", "C4P485B_1", "C4P485B_2", "C4P485B_3", "C4P485B_4",
//				"C4P485B_5", "C4P485B_6", "C4P485B_7", "C4P485B_8",
//				"C4P485B_8ESP", "C4P485B_9",
//				"C4P486_1", "C4P486_2", "C4P486_3", "C4P486_4", "C4P486_5",
//				"C4P486_6", "C4P486_6ESP",
//				"C4P486_7", "C4P487", "C4P488",
//				"C4P490_1", "C4P490_2", "C4P490_3", "C4P490_4", "C4P490_5",
//				"C4P490_6", "C4P490_7", "C4P490_8", "C4P490_9", "C4P490_10",
//				"C4P490_11", "C4P490_12", "C4P490_13", "C4P490_14",
//				"C4P490_15", "C4P490_16", "C4P490_16ESP",
//				"C4P491_1", "C4P491_2", "C4P491_3", "C4P491_4", "C4P491_5",
//				"C4P491_6", "C4P491_7", "C4P491_7ESP", "C4P492", "C4P493",
//				"C4P494", "C4P495", "C4P495_ESP", "C4P496", "C4P497",
//				"C4P497_ESP", "C4P498", "C4P498_ESP", "C4P498A", "C4P498B",
//				"C4P498B_ESP"
//
//		};
		String[] extras1 = null;
		extras1 = new String[] { "C4P488", "C4P490_1", "C4P490_2", "C4P490_3",
				"C4P490_4", "C4P490_5", "C4P490_6", "C4P490_7", "C4P490_8",
				"C4P490_9", "C4P490_10", "C4P490_11", "C4P490_12", "C4P490_13",
				"C4P490_14", "C4P490_15", "C4P490_16", "C4P490_16ESP",
				"C4P491_1", "C4P491_2", "C4P491_3", "C4P491_4", "C4P491_5",
				"C4P491_6", "C4P491_7", "C4P491_7ESP", "C4P492", "C4P493",
				"C4P494", "C4P495", "C4P495_ESP"

		};
		try {
			
//			if (chbC4P484_1.isChecked()) {			
//				if (!getCuestionarioService()
//						.saveOrUpdate(bean, getSecCap2(extras))) {
//					ToastMessage.msgBox(this.getActivity(),
//							"Los datos no se guardaron X",
//							ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
//				}
//			}
			Integer valor = Integer.parseInt(rgC4P487.getTagSelected("0")
					.toString());
			if (valor == 2) {
				//falta el salto a 496
				if (!getCuestionarioService()
						.saveOrUpdate(bean, getSecCap2(extras1))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron X1",
							ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
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
		String especifique_no_vacio = getString(R.string.pregunta_especifique);
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

// if(!chbC4P484_1.isChecked()){
	 if(((Util.getInt(bean.c4p476)==1)&&(Util.getInt(bean.c4p476a)==1)))	{
		if (Util.esVacio(txtC4P484)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P484");
			view = txtC4P484;
			error = true;
			return false;
		} else {
			if (txtC4P484.getText().length() < 3) {
				mensaje = "Ingrese la información correcta en P484";
				view = txtC4P484;
				error = true;
				return false;
			}
	//	}

		if (Util.esVacio(rgC4P484A)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P484A");
			view = rgC4P484A;
			error = true;
			return false;
		}
	 }
	// if((Util.getInt(bean.c4p476)>1)||(Util.getInt(bean.c4p476a)>1))	{
			if (Util.esVacio(rgC4P484A)) {
				mensaje = pregunta_no_vacia
						.replace("$", "La pregunta P484A");
				view = rgC4P484A;
				error = true;
				return false;
			}
//	 }
	if (rgC4P484A.isTagSelected(1)) {
				if (Util.esVacio(rgC4P485)) {
					mensaje = pregunta_no_vacia
							.replace("$", "La pregunta P485");
					view = rgC4P485;
					error = true;
					return false;
				}

				if (rgC4P485.isTagSelected(1)) {
					if (Util.esVacio(rgC4P485A)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La pregunta P485A");
						view = rgC4P485A;
						error = true;
						return false;
					}
				
				if (!chbC4P485B_1.isChecked() && !chbC4P485B_2.isChecked()
						&& !chbC4P485B_3.isChecked()
						&& !chbC4P485B_4.isChecked()
						&& !chbC4P485B_5.isChecked()
						&& !chbC4P485B_6.isChecked()
						&& !chbC4P485B_7.isChecked()
						&& !chbC4P485B_8.isChecked()
						&& !chbC4P485B_9.isChecked()) {
					mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P485B";
					view = chbC4P485B_1;
					error = true;
					return false;
				}
				if (!chbC4P486_1.isChecked() && !chbC4P486_2.isChecked()
						&& !chbC4P486_3.isChecked() && !chbC4P486_4.isChecked()
						&& !chbC4P486_5.isChecked() && !chbC4P486_6.isChecked()
						&& !chbC4P486_7.isChecked()) {
					mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P486";
					view = chbC4P486_1;
					error = true;
					return false;
				}
			}
		}
	   if (chbC4P485B_8.isChecked()) {
		if (Util.esVacio(txtC4P485B_8ESP)) {
			mensaje = pregunta_no_vacia.replace("$",
					"La Preg.485B (Especifique)");
			view = txtC4P485B_8ESP;
			error = true;
			return false;
		} else {
			if (txtC4P485B_8ESP.getText().length() < 3) {
				mensaje = "Ingrese la información correcta";
				view = txtC4P485B_8ESP;
				error = true;
				return false;
			}
		}
	}
	   if (chbC4P486_6.isChecked()) {
		if (Util.esVacio(txtC4P486_6ESP)) {
			mensaje = pregunta_no_vacia.replace("$",
					"La Preg.486 (Especifique)");
			view = txtC4P486_6ESP;
			error = true;
			return false;
		} else {
			if (txtC4P486_6ESP.getText().length() < 3) {
				mensaje = "Ingrese la información correcta";
				view = txtC4P486_6ESP;
				error = true;
				return false;
			}
		}
	}
//	VERIFICACIÓN	:Si (C4P485B_1=0 and C4P485B_2=0 and C4P485B_3=0 and C4P485B_4=0 and C4P485B_5=0 and 
//			   C4P485B_6=0 and C4P485B_7=0 and C4P485B_8=0 and C4P485B_9=0 )  Error
	
//			  Si sum(C4P485B_1,C4P485B_2,C4P485B_3,C4P485B_4,C4P485B_5,C4P485B_6,C4P485B_7,
//			  C4P485B_8)>0 and C4P485B_9=1 )  Error
//		MENSAJE	:	“Error: Selecciono “No sabe” no debe seleccionar otra alternativa”

	
	

		if (Util.esVacio(rgC4P487)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P487");
			view = rgC4P487;
			error = true;
			return false;
		}

		if (rgC4P487.getTagSelected("").toString().equals("1")) {
			if (Util.esVacio(rgC4P488)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P488");
				view = rgC4P488;
				error = true;
				return false;
			}
		}
 }
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv03(
				App.getInstance().getEmpresa(),
				new Moduloiv03().getSecCap(getListFields(this,new String[] {"C4P476","C4P476A","C4P481_1","C4P481_2","C4P481_3"})));
		if (bean == null) {
			bean = new Moduloiv03();
		}
		bean.id = App.getInstance().getEmpresa().id;
		entityToUI(bean);
		inicio();
	}

	private void inicio() {

//		FuncionP84A();
	//FuncionP487();
		      rgC4P483A.requestFocus();

			 if ((Util.getInt(bean.c4p481_1)==2)||(Util.getInt(bean.c4p481_2)==2)||(Util.getInt(bean.c4p481_3)==2)) {
				 Util.cleanAndLockView(getActivity(),rgC4P483A);
				   rgC4P483B.requestFocus();
				
		    } else {
//			     VERIFICACIÓN	:	Si C4P476 > 1  Pase a C4P484A
//			     VERIFICACIÓN	:	Si C4P476A > 1  Pase a C4P484A

			  if((Util.getInt(bean.c4p476)>1)||(Util.getInt(bean.c4p476a)>1)){
					Util.cleanAndLockView(getActivity(),rgC4P483A, rgC4P483B,txtC4P483B_4ESP,txtC4P484);
					   rgC4P484A.requestFocus();
			  } else {
				Util.lockView(getActivity(), false,txtC4P484, rgC4P484A,rgC4P483A, rgC4P483B,txtC4P484 );
				  rgC4P483A.requestFocus();
			   }
//		    	 Util.lockView(getActivity(), false,rgC4P483A );
  			 rgC4P483A.requestFocus();
		   }
		FuncionP485();
//		if(rgC4P484A.isEnabled()){
//			rgC4P484A.requestFocus();
//		}
		if(rgC4P483A.isEnabled()){
			rgC4P483A.requestFocus();
		}
//		if(chbC4P484_1.isEnabled()){
//			chbC4P484_1.requestFocus();
//		}
		Log.e("aquuiiiii voy: " + bean.c4p476, "aquiiiiiiiiiii");
		Log.e("aquuiiiii voy a: " + bean.c4p476a, "aquiiiiiiiiiii");
	}   

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
//	public void FuncionP484_1() {
////		VERIFICACIÓN	:	Si C4P484_1 =0  Pase a C4P484A
////				Si C4P484_1 =1  Pase a C4P499A_1
//
//	if (chbC4P484_1.isChecked()) {
//		Util.cleanAndLockView(getActivity(),txtC4P484, rgC4P484A,rgC4P485,rgC4P485A,chbC4P485B_1,chbC4P485B_2,chbC4P485B_3
//				,chbC4P485B_4,chbC4P485B_5,chbC4P485B_6,chbC4P485B_7,chbC4P485B_8,txtC4P485B_8ESP,chbC4P485B_9,
//				chbC4P486_1,chbC4P486_2,chbC4P486_3,chbC4P486_4,chbC4P486_5,chbC4P486_6,txtC4P486_6ESP,chbC4P486_7,rgC4P487,rgC4P488);
//		//falta salto a 499A_1
//	} else {
//		Util.lockView(getActivity(), false,txtC4P484, rgC4P484A		
//				);
//		FuncionP484A();
//		FuncionP487();
//		txtC4P484.requestFocus();
//	}
//}
	
//private TextWatcher twP484 = new TextWatcher() {
//
//	@Override
//	public void onTextChanged(CharSequence s, int start, int before,
//			int count) {
//	}
//
//	@Override
//	public void beforeTextChanged(CharSequence s, int start, int count,
//			int after) {
//	}

//	@Override
//	public void afterTextChanged(Editable s) {
//    if((Util.getInt(bean.c4p476)==1)&& (Util.getInt(bean.c4p476a)==1)){
//		if (!Util.esVacio(txtC4P484)) {
//			Util.cleanAndLockView(getActivity(), chbC4P484_1);
//		} else if (Util.esVacio(txtC4P484)) {
//			Util.lockView(getActivity(), false, chbC4P484_1);
//		}
//
//	}
//}
//};
//	VERIFICACIÓN	:	Si C4P483A<>vacio  Pase a C4P484
	 
//	VERIFICACIÓN	:	Si C4P484A =2  Pase a C4P487
//			Si C4P484A =1  Pase a C4P485

	public void FuncionP484A() {
		Integer valor = Integer.parseInt(rgC4P484A.getTagSelected("0").toString());
		
		if (valor == 2) {
			Util.cleanAndLockView(getActivity(), rgC4P485,rgC4P485A,chbC4P485B_1,chbC4P485B_2,chbC4P485B_3
		,chbC4P485B_4,chbC4P485B_5,chbC4P485B_6,chbC4P485B_7,chbC4P485B_8,txtC4P485B_8ESP,chbC4P485B_9,
		chbC4P486_1,chbC4P486_2,chbC4P486_3,chbC4P486_4,chbC4P486_5,chbC4P486_6,txtC4P486_6ESP,chbC4P486_7);
			rgC4P487.requestFocus();
		} else {
			Util.lockView(getActivity(), false,  rgC4P485,rgC4P487 /* ,rgC4P485A,chbC4P485B_1,chbC4P485B_2,chbC4P485B_3
					,chbC4P485B_4,chbC4P485B_5,chbC4P485B_6,chbC4P485B_7,chbC4P485B_8,chbC4P485B_9,
					chbC4P486_1,chbC4P486_2,chbC4P486_3,chbC4P486_4,chbC4P486_5,chbC4P486_6,chbC4P486_7*/);
		    	 FuncionP485();
		    	 Funcion485BCheck();
		    	 Funcion485B_9a() ;
		    	
		    	 
		    	Funcion485B_9();
		    	Funcion486();
		    	Funcion486Check();
		    	Funcion486a();
		
		    	rgC4P485.requestFocus();
		}
	}
//	VERIFICACIÓN	:	Si C4P485=2  Pase a C4P487 
//			Si C4P485=1  Pase a C4P485A

	public void FuncionP485() {
		Integer valor = Integer.parseInt(rgC4P485.getTagSelected("0")
				.toString());
		if (valor == 2) {
			Util.cleanAndLockView(getActivity(),rgC4P485A,chbC4P485B_1,chbC4P485B_2,chbC4P485B_3
					,chbC4P485B_4,chbC4P485B_5,chbC4P485B_6,chbC4P485B_7,chbC4P485B_8,chbC4P485B_9,
					chbC4P486_1,chbC4P486_2,chbC4P486_3,chbC4P486_4,chbC4P486_5,chbC4P486_6,txtC4P486_6ESP,chbC4P486_7);
			rgC4P487.requestFocus();
		} else if (valor == 1) {
			Util.lockView(getActivity(), false,rgC4P485A,chbC4P485B_1,chbC4P485B_2,chbC4P485B_3
					,chbC4P485B_4,chbC4P485B_5,chbC4P485B_6,chbC4P485B_7,chbC4P485B_8,chbC4P485B_9,
					chbC4P486_1,chbC4P486_2,chbC4P486_3,chbC4P486_4,chbC4P486_5,chbC4P486_6,chbC4P486_7);
			Funcion485B_9();
			Funcion485B_9a() ;
			Funcion486();
			Funcion486a();
		
			rgC4P485A.requestFocus();
		}
	}
	


	public void Funcion485B_9() {
		if (chbC4P485B_9.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P485B_1, chbC4P485B_2,
					chbC4P485B_3, chbC4P485B_4, chbC4P485B_5, chbC4P485B_6,
					chbC4P485B_7, chbC4P485B_8,txtC4P485B_8ESP);
			chbC4P486_1.requestFocus();
		} else {
			Util.lockView(getActivity(), false, chbC4P485B_1, chbC4P485B_2,
					chbC4P485B_3, chbC4P485B_4, chbC4P485B_5, chbC4P485B_6,
					chbC4P485B_7, chbC4P485B_8);
			  
			rgC4P485A.requestFocus();
		}
		
	}

	public void Funcion485BCheck() {
		if (!chbC4P485B_8.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC4P485B_8ESP);
		} else {
			Util.lockView(getActivity(), false, txtC4P485B_8ESP);
			txtC4P485B_8ESP.requestFocus();
		}
	}
	public void Funcion485B_9a() {
		if ( chbC4P485B_1.isChecked()|| chbC4P485B_2.isChecked()||
			chbC4P485B_3.isChecked()|| chbC4P485B_4.isChecked()||
			chbC4P485B_5.isChecked()||chbC4P485B_6.isChecked()||
		    chbC4P485B_7.isChecked()|| chbC4P485B_8.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P485B_9);
			chbC4P485B_1.requestFocus();
		} else {
			Util.lockView(getActivity(), false,chbC4P485B_9 );
			//rgC4P485A.requestFocus();
		}
		
	}

	public void Funcion486() {
		if (chbC4P486_7.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P486_1, chbC4P486_2,
					chbC4P486_3, chbC4P486_4, chbC4P486_5, chbC4P486_6,txtC4P486_6ESP);
			rgC4P487.requestFocus();
		} else {
			Util.lockView(getActivity(), false, chbC4P486_1, chbC4P486_2,
					chbC4P486_3, chbC4P486_4, chbC4P486_5, chbC4P486_6);
			chbC4P486_1.requestFocus();
		}
	}
	public void Funcion486a() {
		if (chbC4P486_1.isChecked()|| chbC4P486_2.isChecked()||
				chbC4P486_3.isChecked()|| chbC4P486_4.isChecked()||
				chbC4P486_5.isChecked()|| chbC4P486_6.isChecked()) {
			Util.cleanAndLockView(getActivity(),chbC4P486_7);
			chbC4P486_1.requestFocus();
		} else {
			Util.lockView(getActivity(), false,chbC4P486_7 );
			//chbC4P486_1.requestFocus();
		}
	}

	public void Funcion486Check() {
		if (!chbC4P486_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC4P486_6ESP);
		} else {
			Util.lockView(getActivity(), false, txtC4P486_6ESP);
			txtC4P486_6ESP.requestFocus();
		}
	}		
//	VERIFICACIÓN	:	Si C4P487 = 2 Pase a C4P496
//			Si C4P487 = 1 Pase a C4P488

	public void FuncionP487() {
		Integer valor = Integer.parseInt(rgC4P487.getTagSelected("0")
				.toString());
		if (valor == 2) {
			Util.cleanAndLockView(getActivity(), rgC4P488);
			//falta el salto a 496
		} else {
			Util.lockView(getActivity(), false, rgC4P488);
			rgC4P488.requestFocus();
		}
	}

	@Override
	public Caratula getEntity() {
		return App.getInstance().getEmpresa();
	}
}

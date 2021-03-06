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

public class Mod_V_Fragment_003 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC5P508;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC5P509_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC5P509_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC5P509_4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC5P509_5;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC5P509_7;
	public TextField txtC5P509_7ESP;

	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC5P511_1;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC5P511_2;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC5P511_3;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC5P511_4;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC5P511_5;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC5P511_6;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC5P511_7;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC5P511_8;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC5P511_9;
	@FieldAnnotation(orderIndex = 16)
	public TextField txtC5P511_9ESP;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC5P511_10;
	
	
	private CuestionarioService cuestionarioService;
	private Modulov01 bean;
	private Modulov01 bean2;
	private Caratula bean1;
	private LabelComponent lblTitulo, lblsubTitulo, lblDesc;
	private GridComponent2 grEspe, grEspe2;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_V_Fragment_003() {
	}

	public Mod_V_Fragment_003 parent(MasterActivity parent) {
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
		
		rgC5P508 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p008_1, R.string.c1c100m5p008_2)
				.size(WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL)
				.callback("FuncionRG508");

		chbC5P509_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p009_1, "1:0").size(altoComponente, 600);
		chbC5P509_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p009_2, "1:0").size(altoComponente, 600);
		chbC5P509_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p009_3, "1:0").size(altoComponente, 600);
		chbC5P509_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p009_4, "1:0").size(altoComponente, 600);
		chbC5P509_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p009_5, "1:0").size(altoComponente, 150).callback("FuncionCHECK509");
		txtC5P509_7ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();

		grEspe2 = new GridComponent2(this.getActivity(), 2)
				.colorFondo(R.color.transparent);
		grEspe2.addComponent(chbC5P509_7);
		grEspe2.addComponent(txtC5P509_7ESP);
		
		chbC5P511_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_1, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_2, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_3, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_4, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_5, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_6, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_7, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_8, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		chbC5P511_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_9, "1:0").size(altoComponente, 150).callback("FuncionCHECK511");
		txtC5P511_9ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		chbC5P511_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p011_10, "1:0").size(altoComponente, 600).callback("FuncionCHECK511");
		grEspe = new GridComponent2(this.getActivity(), 2)
				.colorFondo(R.color.transparent);
		grEspe.addComponent(chbC5P511_9);
		grEspe.addComponent(txtC5P511_9ESP);
		Filtros.setFiltro(txtC5P511_9ESP, Filtros.TIPO.ALFAN_U, 300, null);
//		Filtros.setFiltro(txtC5P507_15ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC5P509_7ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
		
		q2 = createQuestionSection(R.string.c1c100m5p008, rgC5P508);
		q3 = createQuestionSection(R.string.c1c100m5p009, chbC5P509_1,
				 chbC5P509_3, chbC5P509_4, chbC5P509_5, grEspe2.component());
		q4 = createQuestionSection(R.string.c1c100m5p011, chbC5P511_1,
				chbC5P511_2, chbC5P511_3, chbC5P511_4, chbC5P511_5,
				chbC5P511_6, chbC5P511_7,chbC5P511_8, grEspe.component(),chbC5P511_10);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
	//	form.addView(q1);
		form.addView(q2);
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
		
			if (Util.getInt(bean1.p25) > 2
					&& (Util.getInt(bean.c5p511_10) == 1)) {
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C5P512", "C5P512A", "C5P512A_ESP", "C5P513",
								"C4P513_ESP", "C5P513A_1", "C5P513A_2",
								"C5P513A_3", "C5P513A_3ESP ", "C5P514_1",
								"C5P514_2", "C5P514_3", "C5P514_4",
								"C5P514_3ESP", "C5P514A_1", "C5P514A_2",
								"C5P514A_3", "C5P514A_4", "C5P514A_5",
								"C5P514A_6", "C5P514A_7", "C5P514A_7ESP",
								"C5P515", "C5P516_1", "C5P516_2", "C5P516_3",
								"C5P516_4", "C5P516_5", "C5P517_1", "C5P517_2",
								"C5P517_3", "C5P517_4", "C5P517_5", "C5P517_6",
								"C5P517_7", "C5P517_8", "C5P517_9",
								"C5P517_9ESP", "C5P518", "C5P519_1",
								"C5P519_2", "C5P519_3", "C5P519_4", "C5P519_5",
								"C5P519_5ESP", "C5P520_1", "C5P520_2",
								"C5P520_3", "C5P520_4", "C5P520_5", "C5P521",
								"C5P521_ESP", "C5P522", "C5P522_ESP",
								"C5P523_1", "C5P523_2", "C5P523_3", "C5P523_4",
								"C5P524_1", "C5P524_2", "C5P524_3", "C5P524_4",
								"C5P525_A_1", "C5P525_A_2", "C5P525_A_3",
								"C5P525_A_4", "C5P525_B_1", "C5P525_C_1",
								"C5P525_C_2", "C5P525_C_3", "C5P525_D_1",
								"C5P525_D_2", "C5P525_E_1" })))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaronxxxxx",
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

	if(Util.getInt(bean.c5p503_4)!=1){
			if (Util.esVacio(rgC5P508)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P508");
				view = rgC5P508;
				error = true;
				return false;
			}
			if (rgC5P508.isTagSelected(1)) {
				if (!chbC5P509_1.isChecked()
						&& !chbC5P509_3.isChecked() && !chbC5P509_4.isChecked()
						&& !chbC5P509_5.isChecked() && !chbC5P509_7.isChecked()) {
					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P509";
					view = chbC5P509_1;
					error = true;
					return false;
				}
				if (chbC5P509_7.isChecked()) {
					if (Util.esVacio(txtC5P509_7ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.509 (Especifique)");
						view = txtC5P509_7ESP;
						error = true;
						return false;
					} else {
						if (txtC5P509_7ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC5P509_7ESP;
							error = true;
							return false;
						}
					}
				}
			}
		 }
	if (!chbC5P511_1.isChecked() && !chbC5P511_2.isChecked()
					&& !chbC5P511_3.isChecked() && !chbC5P511_4.isChecked()
					&& !chbC5P511_5.isChecked() && !chbC5P511_6.isChecked()
					&& !chbC5P511_7.isChecked() && !chbC5P511_8.isChecked() && !chbC5P511_9.isChecked() && !chbC5P511_10.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P511";
				view = chbC5P511_1;
				error = true;
				return false;
			}
	          if (chbC5P511_9.isChecked()/*&&((Util.getInt(bean1.p25)==1)||Util.getInt(bean1.p25)==2)&& Util.getInt(bean.c5p503_1)==1*/) {
				if (Util.esVacio(txtC5P511_9ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.511 (Especifique)");
					view = txtC5P511_9ESP;
					error = true;
					return false;
				} else {
					if (txtC5P511_9ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC5P511_9ESP;
						error = true;
						return false;
					}
				}
			}
		
		return true;
	}

	@Override
	public void cargarDatos() {
		
		bean = getCuestionarioService().getModulov01(
				App.getInstance().getEmpresa(),
				new Modulov01().getSecCap(getListFields(this, new String[] {
						"C5P503_4" })));
		if (bean == null) {
			bean = new Modulov01();
			bean.id = App.getInstance().getEmpresa().id;
		}

		bean1 = getCuestionarioService().getCaratula(
				App.getInstance().getEmpresa(),
				new Caratula().getSecCap(Util.getListList("P25")));
		if (bean1 == null) {
			bean1 = new Caratula();
			bean1.id = App.getInstance().getEmpresa().id;
		}
		
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
	//	FuncionCHECK507();
	//	C5P503_4 = 1  Pase a C5P511_1
	       if (Util.getInt(bean.c5p503_4)==1 && Util.getInt(bean1.p25) < 3) {
	    	   Log.e("ENTRASS", "AQUIII");
	    		Util.cleanAndLockView(getActivity(), rgC5P508,chbC5P509_1,chbC5P509_3,chbC5P509_4,chbC5P509_5,chbC5P509_7,txtC5P509_7ESP, chbC5P511_1, 
	    				chbC5P511_2, chbC5P511_3, chbC5P511_4, chbC5P511_5, chbC5P511_6, chbC5P511_7, chbC5P511_8, chbC5P511_9,chbC5P511_10);
			} else {
				Util.lockView(getActivity(), false,  rgC5P508,chbC5P509_1,chbC5P509_3,chbC5P509_4,chbC5P509_5,chbC5P509_7, chbC5P511_1, 
	    				chbC5P511_2, chbC5P511_3, chbC5P511_4, chbC5P511_5, chbC5P511_6, chbC5P511_7, chbC5P511_8, chbC5P511_9,chbC5P511_10);
			     FuncionRG508();
				FuncionCHECK509();
			}
	       
		FuncionCHECK511();
		
	       if (Util.getInt(bean.c5p503_4)==1 && Util.getInt(bean1.p25) < 3) {
	    		Util.cleanAndLockView(getActivity(), rgC5P508,chbC5P509_1,chbC5P509_3,chbC5P509_4,chbC5P509_5,chbC5P509_7,txtC5P509_7ESP, chbC5P511_1, 
	    				chbC5P511_2, chbC5P511_3, chbC5P511_4, chbC5P511_5, chbC5P511_6, chbC5P511_7, chbC5P511_8, chbC5P511_9,chbC5P511_10);
			} else {
				Util.lockView(getActivity(), false,  rgC5P508,chbC5P509_1,chbC5P509_3,chbC5P509_4,chbC5P509_5,chbC5P509_7, chbC5P511_1, 
	    				chbC5P511_2, chbC5P511_3, chbC5P511_4, chbC5P511_5, chbC5P511_6, chbC5P511_7, chbC5P511_8, chbC5P511_9,chbC5P511_10);
			}
		
		rgC5P508.requestFocus();
	}

//	VERIFICACIÓN	:	Si C5P508 = 2 Pase a C5P511_1
//			Si C5P508 = 1  Pase a C5P509_1

	public void FuncionRG508() {
		Integer valor = Integer.parseInt(rgC5P508.getTagSelected("0")
				.toString());
		if (valor == 2) {
			Util.cleanAndLockView(getActivity(), chbC5P509_1, 
					chbC5P509_3, chbC5P509_4, chbC5P509_5,
					chbC5P509_7, txtC5P509_7ESP);
			chbC5P511_1.requestFocus();
		} else {

			Util.lockView(getActivity(), false, chbC5P509_1, 
					chbC5P509_3, chbC5P509_4, chbC5P509_5, 
					chbC5P509_7);
			chbC5P509_1.requestFocus();
		}
	}

	public void FuncionCHECK509() {
		if (chbC5P509_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC5P509_7ESP);
			txtC5P509_7ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P509_7ESP);
		}
	}
	//VERIFICACIÓN2	:	Si C5P511_9= 1 and P25=1,2 and C5P503_1=1  Pase a C5P511_9ESP, luego a C5P512
	public void FuncionRG510() {
		if (chbC5P511_9.isChecked()
				/*&& ((Util.getInt(bean1.p25) == 1) || Util.getInt(bean1.p25) == 2)*/) {
			Util.lockView(getActivity(), false, txtC5P511_9ESP);
			txtC5P511_9ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P511_9ESP);
		}
	}
	
	public void FuncionCHECK511() {		
		if (chbC5P511_1.isChecked() || chbC5P511_2.isChecked()
				|| chbC5P511_3.isChecked() || chbC5P511_4.isChecked()
				|| chbC5P511_5.isChecked() || chbC5P511_6.isChecked()
				|| chbC5P511_7.isChecked() || chbC5P511_8.isChecked() || chbC5P511_9.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC5P511_10);
		} else {
			Util.lockView(getActivity(), false, chbC5P511_10);
		}

		if (chbC5P511_10.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC5P511_1, chbC5P511_2,
					chbC5P511_3, chbC5P511_4, chbC5P511_5, chbC5P511_6,
					chbC5P511_7, chbC5P511_8, txtC5P511_9ESP, chbC5P511_9);
		} else {
			Util.lockView(getActivity(), false, chbC5P511_1, chbC5P511_2,
					chbC5P511_3, chbC5P511_4, chbC5P511_5, chbC5P511_6,
					chbC5P511_7, chbC5P511_8, chbC5P511_9);
			FuncionRG510();
						
		}
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

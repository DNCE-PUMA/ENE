package gob.inei.ene2019v2.fragment.ModV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.DialogComponent.TIPO_DIALOGO;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Modulov01;
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

public class Mod_V_Fragment_002 extends FragmentForm implements Respondible{

//	@FieldAnnotation(orderIndex = 1)
//	public RadioGroupOtherField rgC5P503;
	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC5P503_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC5P503_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC5P503_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC5P503_4;
	
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC5P504_1;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC5P504_2;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC5P504_3;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC5P504_4;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC5P504_5;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC5P504_6;
	@FieldAnnotation(orderIndex = 11)
	public TextField txtC5P504_6ESP;
	@FieldAnnotation(orderIndex = 12)
	public RadioGroupOtherField  rgC5P505;

//	@FieldAnnotation(orderIndex = 10)
//	public IntegerField txtC5P506;

	private CuestionarioService cuestionarioService;
	private Modulov01 bean;
	private Caratula bean1;
	private LabelComponent lblTitulo, lblsubTitulo, lblRED, lblp1, lblp2,
			lblp3, lblPortal, lblsino, lblsino2, lblp1_1, lblp2_1, lblp3_1,lblp4_1, lblp5_1, lblp6_1,
			lblporcentaje;
	private GridComponent2 grd504e;
	LinearLayout q0, q1, q2, q3, q4, q5;
	enum ACTION {
		EJECUTAR_VER1, EJECUTAR_VER2;
	}
	private DialogComponent dialog;
	private ACTION action;
	private boolean error1;
	private boolean avance1;
	public Mod_V_Fragment_002() {
	}

	public Mod_V_Fragment_002 parent(MasterActivity parent) {
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
		lblporcentaje = new LabelComponent(this.getActivity()).size(50, 250)
				.text(R.string.c1c100m4p004_1).textSize(14).centrar().negrita();
		lblRED = new LabelComponent(this.getActivity(), App.ESTILO)
				.text("REDES").size(altoComponente, 250).textSize(16).centrar()
				.negrita();
		lblsino = new LabelComponent(this.getActivity(), App.ESTILO)
				.text("SI/NO").size(altoComponente, 250).textSize(16).centrar()
				.negrita();
		lblp1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.modv_preg3_1).size(altoComponente, 250)
				.textSize(16).alinearIzquierda().negrita();
		lblp2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.modv_preg3_2).size(altoComponente, 250)
				.textSize(16).alinearIzquierda().negrita();
		lblp3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.modv_preg3_3).size(altoComponente, 250)
				.textSize(16).alinearIzquierda().negrita();
		lblPortal = new LabelComponent(this.getActivity(), App.ESTILO)
				.text("PORTALES").size(altoComponente, 250).textSize(16)
				.centrar().negrita();
		lblsino2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text("SI/NO").size(altoComponente, 250).textSize(16).centrar()
				.negrita();
		chbC5P503_1 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg3_1, "1:0").size(altoComponente, 600).callback("bloqueosP503_4");
		chbC5P503_2 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg3_2, "1:0").size(altoComponente, 600).callback("bloqueosP503_4");
		chbC5P503_3 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg3_3, "1:0").size(altoComponente, 600).callback("bloqueosP503_4");
		chbC5P503_4 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg3_4, "1:0").size(altoComponente, 600).callback("FuncionP503").callback("bloqueosP503_4");

		chbC5P504_1 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg4_1, "1:0").size(altoComponente, 600);
		chbC5P504_2 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg4_2, "1:0").size(altoComponente, 600);
		chbC5P504_3 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg4_3, "1:0").size(altoComponente, 600);
		chbC5P504_4 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg4_4, "1:0").size(altoComponente, 600);
		chbC5P504_5 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg4_5, "1:0").size(altoComponente, 600);
		chbC5P504_6 = new CheckBoxField(this.getActivity(),
				R.string.modv_preg4_6, "1:0").size(altoComponente, 150).callback("onC3P504ChangeValue");
		 txtC5P504_6ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();
		
		rgC5P505  = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p005_1, R.string.c1c100m5p005_2,R.string.c1c100m5p005_3,R.string.c1c100m5p005_4)
				.size(WRAP_CONTENT, 250).orientation(ORIENTATION.VERTICAL);
	
		grd504e = new GridComponent2(this.getActivity(), Gravity.CENTER_VERTICAL, 2);
		grd504e.addComponent(chbC5P504_6);
		grd504e.addComponent(txtC5P504_6ESP);
		grd504e.colorFondo(R.color.WhiteSmoke);
		grd504e.component();	
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
	    q1 = createQuestionSection(R.string.c1c100m5p003n, chbC5P503_1,chbC5P503_2,chbC5P503_3,chbC5P503_4 );
		q2 = createQuestionSection(R.string.c1c100m5p004,chbC5P504_1,chbC5P504_2,chbC5P504_3,chbC5P504_4,chbC5P504_5,grd504e);
		q3 = createQuestionSection(R.string.c1c100m5p005, rgC5P505);
//		q4 = createQuestionSection(R.string.c1c100m5p006, txtC5P506,	lblporcentaje);
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
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
		String[] extras = null;
		try {
			if (chbC5P503_4.isChecked() && Util.getInt(bean1.p25) < 3) {
				extras = new String[] { "C5P508", "C5P509_1","C5P509_3", "C5P509_4","C5P509_5", "C5P509_7", "C5P511_1", 
						"C5P511_2", "C5P511_3", "C5P511_4", "C5P511_5", "C5P511_6", "C5P511_7", "C5P511_8", "C5P511_9", "C5P511_10",};
				
				if (!getCuestionarioService().saveOrUpdate(bean,
						bean.getSecCap(getListFields(this, extras))) ) {
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
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
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
	if (!chbC5P503_1.isChecked()&&!chbC5P503_2.isChecked()&&!chbC5P503_3.isChecked()&&!chbC5P503_4.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P503");
				view = chbC5P503_1;
				error = true;
				return false;
		}
	
	if (!chbC5P503_4.isChecked()) {
		if (!chbC5P504_1.isChecked()&&(!chbC5P504_2.isChecked())&&(!chbC5P504_3.isChecked())&&(!chbC5P504_4.isChecked())&&
				(!chbC5P504_5.isChecked())&&(!chbC5P504_6.isChecked())) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P504");
			view = chbC5P504_1;
			error = true;
			return false;
	}
		
			if (!chbC5P504_1.isChecked() && !chbC5P504_2.isChecked()
					&& !chbC5P504_3.isChecked() && !chbC5P504_4.isChecked()
					&& !chbC5P504_5.isChecked() && !chbC5P504_6.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P504";
				view = chbC5P504_1;
				error = true;
				return false;
			}
			if (chbC5P504_6.isChecked()) {
				if (Util.esVacio(txtC5P504_6ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.504 (Especifique)");
					view = txtC5P504_6ESP;
					return !(error = true);
				} else {
					if (txtC5P504_6ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC5P504_6ESP;
						error = true;
						return false;
					}
				}
			}
		if (Util.esVacio(rgC5P505)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P505");
			view = rgC5P505;
			error = true;
			return false;
		}
	}
//	VERIFICACIÓN	:	Si C5P503=4 and P25=2,3 Verificar
//			MENSAJE	:	“Verificar: No tiene internet y es empresa grande”
	
	  error1 = false;
	if (chbC5P503_4.isChecked() && (Util.getInt(bean1.p25,0) ==3 ||Util.getInt(bean1.p25,0) ==4)) { 
		error1 = true;
	}

	if (error1 && !avance1) {
		action = ACTION.EJECUTAR_VER1;
		DialogComponent dlg = new DialogComponent(
				getActivity(),
				(Respondible) this,
				TIPO_DIALOGO.YES_NO,
				getResources().getString(R.string.app_name),
				"“Verificar: No tiene internet y es empresa grande”");
		dlg.showDialog();
		return false;
	}
	
	
	
	
//	if (chbC5P503_4.isChecked() && (Util.getInt(bean1.p25,0) ==2 ||Util.getInt(bean1.p25,0) ==2)) {
//		ToastMessage.msgBox(this.getActivity(),
//				"“Verificar: No tiene internet y es empresa grande”", ToastMessage.MESSAGE_INFO,
//				ToastMessage.DURATION_LONG);
//	}

//		if(rgC5P504_1.getTagSelectedInteger(2)==2 && rgC5P504_2.getTagSelectedInteger(2)==2 && rgC5P504_3.getTagSelectedInteger(2)==2){
//			mensaje = "Debe seleccionar algúna alternativa si selecciono en la P503 = Si";
//			view = grP504;
//			error = true;
//			return false;
//		}
		
//		if (!chbC5P505_1.isChecked() && !chbC5P505_2.isChecked()
//				&& !chbC5P505_3.isChecked() && !chbC5P505_4.isChecked()
//				&& !chbC5P505_5.isChecked() ) {
//			mensaje = "Debe seleccionar al menos una alternativa en P505";
//			view = chbC5P505_1;
//			error = true;
//			return false;
//		}
//		
//		if (chbC5P505_1.isChecked() || chbC5P505_2.isChecked()
//				|| chbC5P505_3.isChecked() || chbC5P505_4.isChecked()
//				){ 
//			if(chbC5P505_5.isChecked()) {
//				mensaje = "Si se selecciono la opcion 'No sabe' en P505, no puede seleccionar otra opcion";
//				view = chbC5P505_1;
//				error = true;
//				return false;
//			}
//		}

		
		return true;
	}

	@Override
	public void cargarDatos() {
		avance1 = false;
		error1 = false;
		bean = getCuestionarioService().getModulov01(
				App.getInstance().getEmpresa(),
				new Modulov01().getSecCap(getListFields(this)));
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
	//	onM3P505_6ChangeValue();
		bloqueosP503_4();
		FuncionP503();
		onC3P504ChangeValue();
		chbC5P503_1.requestFocus();
	     Log.e("aquuiiiii voy:25 " + bean1.p25, "aquiiiiiiiiiii");
	}

	public void FuncionP503() {
		
//		VERIFICACIÓN	:	C5P503_4 = 0  Pase a C5P504_1
//				C5P503_4 = 1 Pase a C5P511_1

		if (chbC5P503_4.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC5P504_1, chbC5P504_2,
					chbC5P504_3,chbC5P504_4,chbC5P504_5,chbC5P504_6,rgC5P505,txtC5P504_6ESP);
			//SALTO A C5P511_1
		} else {
			Util.lockView(getActivity(), false,chbC5P504_1, chbC5P504_2,
					chbC5P504_3,chbC5P504_4,chbC5P504_5,chbC5P504_6,rgC5P505);
		//	onM3P505_6ChangeValue();
			 bloqueosP503_4();
			 chbC5P504_1.requestFocus();
		}
	}

	public void bloqueosP503_4() {

		if (chbC5P503_1.isChecked() || chbC5P503_2.isChecked()
				|| chbC5P503_3.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC5P503_4);
		} else {
			Util.lockView(getActivity(), false, chbC5P503_4);
		}

		if (chbC5P503_4.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC5P503_1, chbC5P503_2,
					chbC5P503_3);
		} else {
			Util.lockView(getActivity(), false, chbC5P503_1, chbC5P503_2,
					chbC5P503_3);
		}

	}
//	VERIFICACIÓN	:	C5P504_6 = 0  Pase a C5P505
//	C5P504_6= 1  Pase a C5P504_6ESP, luego pase a C5P505
	 public void onC3P504ChangeValue() {
		if (chbC5P504_6.isChecked()) {
			Util.lockView(getActivity(), false, txtC5P504_6ESP);
			txtC5P504_6ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P504_6ESP);
		}
	}

//	public void onM3P505_6ChangeValue() {
//
//		if (chbC5P505_1.isChecked() || chbC5P505_2.isChecked()
//				|| chbC5P505_3.isChecked() || chbC5P505_4.isChecked() ) {
//			Util.cleanAndLockView(getActivity(), chbC5P505_5);
//		} else {
//			Util.lockView(getActivity(), false, chbC5P505_5);
//		}
//
//	if (chbC5P505_5.isChecked()) {
//		Util.cleanAndLockView(getActivity(), chbC5P505_1, chbC5P505_2, chbC5P505_3,  chbC5P505_4);
//	} else {
//			Util.lockView(getActivity(), false, chbC5P505_1, chbC5P505_2, chbC5P505_3,  chbC5P505_4	);
//		}
//
//	}
	
	
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
	@Override
	public void onCancel() {
		if (action == ACTION.EJECUTAR_VER1) {
			return;
		}
	}

	@Override
	public void onAccept() {
		// TODO Auto-generated method stub
		if (action == ACTION.EJECUTAR_VER1) {
			avance1 = true;
			parent.nextFragment(CuestionarioFragmentActivity.MODULO_V + 2);
		
		}

	}
}

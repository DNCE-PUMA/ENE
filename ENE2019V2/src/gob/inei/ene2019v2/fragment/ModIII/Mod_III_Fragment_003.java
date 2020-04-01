package gob.inei.ene2019v2.fragment.ModIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
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
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloiii02;
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

public class Mod_III_Fragment_003 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC3P308_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC3P308_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC3P308_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC3P308_4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC3P308_5;
	@FieldAnnotation(orderIndex = 6)
	public TextField txtC3P308_5ESP;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC3P308_6;

	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC3P310_1;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC3P310_2;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC3P310_3;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC3P310_4;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC3P310_5;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC3P310_6;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC3P310_7;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC3P310_8;
	@FieldAnnotation(orderIndex = 16)
	public TextField txtC3P310_8ESP;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC3P310_9;
	
	private CuestionarioService cuestionarioService;
	private Moduloiii01 bean;
	private Moduloiii02 bean2;
	private LabelComponent lblTitulo, lblEsp;
	private GridComponent2 gridmod3 , gridmod9;
	SeccionCapitulo[] seccionesCargado;
	SeccionCapitulo[] seccionesGrabado;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10,q11;

	public Mod_III_Fragment_003() {
	}

	public Mod_III_Fragment_003 parent(MasterActivity parent) {
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
		seccionesCargado = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1,
				-1, "ID", "C3P315_1", "C3P315_2", "C3P315_3", "C3P315_4",
				"C3P315_5", "C3P316", "C3P316_ESP" , "C3P319",	"C3P319_ESP" ) };
//		seccionesGrabado = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1,
//				-1, "C3P315_1", "C3P315_2", "C3P315_3", "C3P315_4", "C3P315_5",
//				"C3P316") };
		return rootView;
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod3_titulo).textSize(21).centrar().negrita();
		lblEsp = new LabelComponent(this.getActivity())
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m3p007_not1).textSize(13).centrar()
				.negrita();
	
	
		chbC3P308_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p008_1, "1:0").size(altoComponente, 590).callback("FuncionP8");
		chbC3P308_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p008_2, "1:0").size(altoComponente, 590).callback("FuncionP8");
		chbC3P308_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p008_3, "1:0").size(altoComponente, 590).callback("FuncionP8");
		chbC3P308_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p008_4, "1:0").size(altoComponente, 590).callback("FuncionP8");
				
		chbC3P308_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p008_5, "1:0").size(altoComponente, 190)
				.callback("onM3P008_5ChangeValue").callback("FuncionP8");
		
		txtC3P308_5ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		
		chbC3P308_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p008_6, "1:0").size(altoComponente, 590).callback("FuncionP8");
		
		
		chbC3P310_1 = new CheckBoxField(this.getActivity(),
			R.string.c1c100m3p009_1, "1:0").size(altoComponente, 590).callback("FuncionP9");
		chbC3P310_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_2, "1:0").size(altoComponente, 590).callback("FuncionP9");
		chbC3P310_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_3, "1:0").size(altoComponente, 590).callback("FuncionP9");
		chbC3P310_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_4, "1:0").size(altoComponente, 590).callback("FuncionP9");
		chbC3P310_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_5, "1:0").size(altoComponente, 590).callback("FuncionP9");
		chbC3P310_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_6, "1:0").size(altoComponente, 590).callback("FuncionP9");
		chbC3P310_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_7, "1:0").size(altoComponente, 590).callback("FuncionP9");
		chbC3P310_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_8, "1:0").size(altoComponente, 190).callback("FuncionP9");
		chbC3P310_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p009_9, "1:0").size(altoComponente, 590).callback("FuncionP9");	
		
		txtC3P310_8ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 400).hint(R.string.especifique)
		.soloTextoNumero();
		
				

		gridmod3 = new GridComponent2(this.getActivity(),
				Gravity.CENTER_VERTICAL, 2);
		gridmod3.addComponent(chbC3P308_5);
		gridmod3.addComponent(txtC3P308_5ESP);
		gridmod3.colorFondo(R.color.WhiteSmoke);
		gridmod3.component();
		
		gridmod9 = new GridComponent2(this.getActivity(),
				Gravity.CENTER_VERTICAL, 2);
		gridmod9.addComponent(chbC3P310_8);
		gridmod9.addComponent(txtC3P310_8ESP);
		gridmod9.colorFondo(R.color.WhiteSmoke);
		gridmod9.component();
		
		Filtros.setFiltro(txtC3P308_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC3P310_8ESP, Filtros.TIPO.ALFAN_U, 300, null);
		
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.c1c100m3p008, chbC3P308_1,
				chbC3P308_2, chbC3P308_3, chbC3P308_4, gridmod3, chbC3P308_6);
		q2 = createQuestionSection(R.string.c1c100m3p009, chbC3P310_1,
				chbC3P310_2, chbC3P310_3, chbC3P310_4,chbC3P310_5, chbC3P310_6, chbC3P310_7,  gridmod9, chbC3P310_9);
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		
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
			String[] extras = null;
			String[] extras2 = null;
			
			extras = new String[] { "C3P311_1", "C3P311_2", "C3P311_3",
					"C3P311_4", "C3P311_5", "C3P311_6", "C3P311_7", "C3P311_8",
					"C3P311_9", "C3P311_9ESP", "C3P312", "C3P314_1",
					"C3P314_2", "C3P314_3", "C3P314_4", "C3P314_5", "C3P314_6",
					"C3P314_7", "C3P314_8", "C3P314_9", "C3P314_10",
					"C3P314_11", "C3P314_11ESP", "C3P314_12", "C3P314A_1",
					"C3P314A_2", "C3P314A_3", "C3P314A_4", "C3P314A_5",
					"C3P314A_6", "C3P314A_7", "C3P314A_7ESP", "C3P314A_8"};			

			extras2 = new String[] { 
					"C3P315_1", "C3P315_2", "C3P315_3", "C3P315_4", "C3P315_5",
					"C3P316", "C3P316_ESP", "C3P319", "C3P319_ESP" };
			
			if (Util.getInt(bean.c3p310_9) == 1 ) {			
				if (!getCuestionarioService()
						.saveOrUpdate(bean, getSecCap2(extras))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron X",
							ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
				}
				
				bean2.c3p315_1 = bean2.c3p315_2 = bean2.c3p315_3 =bean2.c3p315_4 = bean2.c3p315_5 = bean2.c3p316 = bean2.c3p319 = null;
				bean2.c3p316_esp = bean2.c3p319_esp = null;
				if (!getCuestionarioService()
						.saveOrUpdate(bean2, getSecCap2( false, extras2))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron Y",
							ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
				}
			}
			
				if (!getCuestionarioService().saveOrUpdate(bean,
						bean.getSecCap(getListFields(this)))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron U",
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


			if (!chbC3P308_1.isChecked() && !chbC3P308_2.isChecked()
					&& !chbC3P308_3.isChecked() && !chbC3P308_4.isChecked()
					&& !chbC3P308_5.isChecked() && !chbC3P308_6.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P308";
				view = chbC3P308_1;
				return !(error = true);
			}
			if (chbC3P308_5.isChecked()) {
				if (Util.esVacio(txtC3P308_5ESP)) {
					mensaje = pregunta_no_vacia.replace("$", "La Preg.308 (Especifique)");
					view = txtC3P308_5ESP;
					return !(error = true);
				}else{
					if (txtC3P308_5ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC3P308_5ESP;
						error = true;
						return false;
					}
				}
			}
//VERIFICACIÓN	:	Si sum(C3P308_1: C3P308_6)=0 Error
//					Si sum(C3P308_1:C3P308_5)>0 AND C3P308_6=1  Error
//			MENSAJE	:	“Error: Si selecciono “No dio premios ni incentivos” no debe marcar otra alternativa”
                                         //* se valida con bloqueo*//
			
			if (!chbC3P310_1.isChecked() && !chbC3P310_2.isChecked()
					&& !chbC3P310_3.isChecked() && !chbC3P310_4.isChecked()
					&& !chbC3P310_5.isChecked() && !chbC3P310_6.isChecked() && !chbC3P310_7.isChecked() && !chbC3P310_8.isChecked() && !chbC3P310_9.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P309";
				view = chbC3P310_1;
				return !(error = true);
			}
			if (chbC3P310_8.isChecked()) {
				if (Util.esVacio(txtC3P310_8ESP)) {
					mensaje = pregunta_no_vacia.replace("$", "La Preg.309 (Especifique)");
					view = txtC3P310_8ESP;
					return !(error = true);
				}else{
					if (txtC3P310_8ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC3P310_8ESP;
						error = true;
						return false;
					}
				}
			}
	

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiii01(
				App.getInstance().getEmpresa(),
				new Moduloiii01().getSecCap(getListFields(this)));
		bean2 = getCuestionarioService().getModuloiii02(
				App.getInstance().getEmpresa(), seccionesCargado);
		if (bean == null) {
			bean = new Moduloiii01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		if (bean2 == null) {
			bean2 = new Moduloiii02();
			bean2.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();

	}

	private void inicio() {
		chbC3P308_1.requestFocus();
		onM3P008_5ChangeValue();
		FuncionP8();
		FuncionP9();
		chbC3P308_1.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	

	public void onM3P008_5ChangeValue() {
		if (chbC3P308_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P308_5ESP);
			txtC3P308_5ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P308_5ESP);
		}
	}
	
	
	public void FuncionP8() {
		if (chbC3P308_1.isChecked() || chbC3P308_2.isChecked()
				|| chbC3P308_3.isChecked() || chbC3P308_4.isChecked() || chbC3P308_5.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P308_6);
		} else {
			Util.lockView(getActivity(), false, chbC3P308_6);
		}

		if (chbC3P308_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P308_1, chbC3P308_2,
					chbC3P308_3, chbC3P308_4, chbC3P308_5);
		} else {
			Util.lockView(getActivity(), false, chbC3P308_1, chbC3P308_2,
					chbC3P308_3, chbC3P308_4, chbC3P308_5);
			onM3P008_5ChangeValue();
		}
	}
	

	public void FuncionP9() {
		if (chbC3P310_1.isChecked() || chbC3P310_2.isChecked()
				|| chbC3P310_3.isChecked() || chbC3P310_4.isChecked()
				|| chbC3P310_5.isChecked() || chbC3P310_6.isChecked()
				|| chbC3P310_7.isChecked() || chbC3P310_8.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P310_9);
		} else {
			Util.lockView(getActivity(), false, chbC3P310_9);
		}

		if (chbC3P310_9.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P310_1, chbC3P310_2,
					chbC3P310_3, chbC3P310_4, chbC3P310_5, chbC3P310_6,
					chbC3P310_7, chbC3P310_8, txtC3P310_8ESP);
		} else {
			Util.lockView(getActivity(), false, chbC3P310_1, chbC3P310_2,
					chbC3P310_3, chbC3P310_4, chbC3P310_5, chbC3P310_6,
					chbC3P310_7, chbC3P310_8);
			if (!chbC3P310_8.isChecked()) {
				Util.cleanAndLockView(getActivity(), txtC3P310_8ESP);
			} else {
				Util.lockView(getActivity(), false, txtC3P310_8ESP);
				txtC3P310_8ESP.requestFocus();
			}
		}
		
//		if (chbC3P310_9.isPressed()) {
//			if (!grabar()) {
//				return;
//			}
//			// parent.nextFragment(CuestionarioFragmentActivity.CAP00);
//			parent.nextFragment(parent.getCurPage() + 4);
//		}
	}
	
//	public void onM3P009ChangeValue() {
//		RadioGroupOtherField crg = ((RadioGroupOtherField) rgC3P310);
//		if (crg.getTagSelected("0").toString().equals("1")) {
//		} else {
//			// salto a preg 17
//			if (crg.getCheckedRadioButtonId() != -1
//					&& crg.findViewById(crg.getCheckedRadioButtonId())
//							.isPressed()) {
//				if (!grabar()) {
//					return;
//				}
//				parent.nextFragment(CuestionarioFragmentActivity.MODULO_III + 5);
//			}
//		}
//	}

}

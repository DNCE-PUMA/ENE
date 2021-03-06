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
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloiii02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.Arrays;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_III_Fragment_005 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC3P312;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC3P314_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC3P314_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC3P314_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC3P314_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC3P314_5;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC3P314_6;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC3P314_7;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC3P314_8;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC3P314_9;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC3P314_10;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC3P314_11;
	@FieldAnnotation(orderIndex = 13)
	public TextField txtC3P314_11ESP;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC3P314_12;

	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC3P314A_1; // Nuevo Ini
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC3P314A_2;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC3P314A_3;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC3P314A_4;
	@FieldAnnotation(orderIndex = 19)
	public CheckBoxField chbC3P314A_5;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC3P314A_6;
	@FieldAnnotation(orderIndex = 21)
	public CheckBoxField chbC3P314A_7;
	@FieldAnnotation(orderIndex = 22)	
	public TextField txtC3P314A_7ESP; 
	@FieldAnnotation(orderIndex = 23)
	public CheckBoxField chbC3P314A_8;// Nuevo Fin 

	private CuestionarioService cuestionarioService;	
	SeccionCapitulo[] seccionesCargado;
	private Moduloiii01 bean;
	private Moduloiii02 bean2;
	private LabelComponent lblTitulo;
	private GridComponent2 gridpreg14, grEspe;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_III_Fragment_005() {
	}

	public Mod_III_Fragment_005 parent(MasterActivity parent) {
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
		return rootView;
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod3_titulo).textSize(21).centrar().negrita();

		rgC3P312 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m3p012_1, R.string.c1c100m3p012_2).size(
				WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL);
	
		chbC3P314_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_1, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_2, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_3, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_4, "1:0").size(altoComponente + 40, 600).callback("FuncionP114");
		chbC3P314_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_5, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_6, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_7, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_8, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_9, "1:0").size(altoComponente, 600).callback("FuncionP114");
		chbC3P314_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_10, "1:0").size(altoComponente, 600).callback("FuncionP114");
		
		chbC3P314_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_11, "1:0").size(altoComponente, 150).callback("FuncionP114");
		
		txtC3P314_11ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		
		chbC3P314_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014_12, "1:0").size(altoComponente, 600).callback("FuncionP114");
		
		chbC3P314A_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_1, "1:0").size(altoComponente, 600).callback("FuncionP114A");
		chbC3P314A_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_2, "1:0").size(altoComponente, 600).callback("FuncionP114A");
		chbC3P314A_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_3, "1:0").size(altoComponente, 600).callback("FuncionP114A");
		chbC3P314A_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_4, "1:0").size(altoComponente, 600).callback("FuncionP114A");
		chbC3P314A_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_5, "1:0").size(altoComponente, 600).callback("FuncionP114A");
		chbC3P314A_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_6, "1:0").size(altoComponente, 600).callback("FuncionP114A");
		chbC3P314A_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_7, "1:0").size(altoComponente, 150).callback("FuncionP114A").callback("FuncionP114A_ESP");
		txtC3P314A_7ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 450).hint(R.string.especifique)
		.soloTextoNumero();

		chbC3P314A_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m3p014A_8, "1:0").size(altoComponente, 600).callback("FuncionP114A");	
		
		Filtros.setFiltro(txtC3P314_11ESP, Filtros.TIPO.ALFAN_U, 300, null);

		gridpreg14 = new GridComponent2(this.getActivity(),
				Gravity.CENTER_VERTICAL, 2);
		gridpreg14.addComponent(chbC3P314_11);
		gridpreg14.addComponent(txtC3P314_11ESP);
		gridpreg14.colorFondo(R.color.WhiteSmoke);
		gridpreg14.component();

		grEspe = new GridComponent2(this.getActivity(), 2);
		grEspe.addComponent(chbC3P314A_7);
		grEspe.addComponent(txtC3P314A_7ESP);
		grEspe.colorFondo(R.color.transparent);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.c1c100m3p012, rgC3P312);
		q3 = createQuestionSection(R.string.c1c100m3p014, chbC3P314_1,
				chbC3P314_2, chbC3P314_3, chbC3P314_4, chbC3P314_5,
				chbC3P314_6, chbC3P314_7, chbC3P314_8, chbC3P314_9,chbC3P314_10,
				 gridpreg14 , chbC3P314_12) ;
		q4 = createQuestionSection(R.string.c1c100m3p014A, chbC3P314A_1,
				chbC3P314A_2, chbC3P314A_3, chbC3P314A_4, chbC3P314A_5,
				chbC3P314A_6, grEspe.component() ,chbC3P314A_8);

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
		
		String[] extras = null;

		extras = new String[] { "C3P315_1", "C3P315_2", "C3P315_3", "C3P315_4",
				"C3P315_5", "C3P316", "C3P316_ESP" };
		try {
			
			if (Util.getInt(bean.c3p314_12) == 1 ) {
				Log.e("xx","ytttt");
				bean2.c3p315_1 = bean2.c3p315_2 = bean2.c3p315_3 =bean2.c3p315_4 = bean2.c3p315_5 = bean2.c3p316  = null;
				bean2.c3p316_esp  = null;
				getCuestionarioService().saveOrUpdate(bean2,
						bean2.getSecCap(Arrays.asList(extras)));
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

		if (Util.esVacio(rgC3P312)) {
			mensaje = pregunta_no_vacia.replace("$", "Pregunta 312");
			view = rgC3P312;
			return !(error = true);
		}

			if (!chbC3P314_1.isChecked() && !chbC3P314_2.isChecked()
					&& !chbC3P314_3.isChecked() && !chbC3P314_4.isChecked()
					&& !chbC3P314_5.isChecked() && !chbC3P314_6.isChecked()
					&& !chbC3P314_7.isChecked() && !chbC3P314_8.isChecked()
					&& !chbC3P314_9.isChecked() && !chbC3P314_10.isChecked() && !chbC3P314_11.isChecked() && !chbC3P314_12.isChecked()
					) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P314";
				view = chbC3P314_1;
				return !(error = true);
			}

			if (chbC3P314_11.isChecked()) {
				if (Util.esVacio(txtC3P314_11ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.314 (Especifique)");
					view = txtC3P314_11ESP;
					return !(error = true);
				}else{
					if (txtC3P314_11ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC3P314_11ESP;
						error = true;
						return false;
					}
				}
			}

			if (!chbC3P314_12.isChecked()) {
				if (!chbC3P314A_1.isChecked() && !chbC3P314A_2.isChecked()
						&& !chbC3P314A_3.isChecked() && !chbC3P314A_4.isChecked()
						&& !chbC3P314A_5.isChecked() && !chbC3P314A_6.isChecked()
						&& !chbC3P314A_7.isChecked() && !chbC3P314A_8.isChecked()) {
					mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P314A";
					view = chbC3P314A_1;
					return !(error = true);
				}
	
				if (chbC3P314A_7.isChecked()) {
					if (Util.esVacio(txtC3P314A_7ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.314A (Especifique)");
						view = txtC3P314A_7ESP;
						return !(error = true);
					}else{
						if (txtC3P314A_7ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC3P314A_7ESP;
							error = true;
							return false;
						}
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
		
		FuncionP114();
		
		rgC3P312.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}



	public void onM3P014_11ChangeValue() {
		if (chbC3P314_11.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P314_11ESP);
			txtC3P314_11ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P314_11ESP);
		}
	}

	

	public void FuncionP114() {
		if (chbC3P314_1.isChecked() || chbC3P314_2.isChecked()
				|| chbC3P314_3.isChecked() || chbC3P314_4.isChecked()
				|| chbC3P314_5.isChecked() || chbC3P314_6.isChecked()
				|| chbC3P314_7.isChecked() || chbC3P314_8.isChecked()
				|| chbC3P314_9.isChecked() || chbC3P314_10.isChecked()
				|| chbC3P314_11.isChecked() ) {
			Util.cleanAndLockView(getActivity(), chbC3P314_12);
		} else {
			Util.lockView(getActivity(), false, chbC3P314_12);
		}

		if (chbC3P314_12.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P314_1, chbC3P314_2,
					chbC3P314_3, chbC3P314_4, chbC3P314_5, chbC3P314_6,
					chbC3P314_7, chbC3P314_8 ,  chbC3P314_9  ,  chbC3P314_10 ,  chbC3P314_11, txtC3P314_11ESP);
			
			Util.cleanAndLockView(getActivity(), chbC3P314A_1, chbC3P314A_2,
					chbC3P314A_3, chbC3P314A_4, chbC3P314A_5, chbC3P314A_6,
					chbC3P314A_7, txtC3P314A_7ESP,chbC3P314A_8);
			
		} else {
			
			Util.lockView(getActivity(), false, chbC3P314_1, chbC3P314_2,
					chbC3P314_3, chbC3P314_4, chbC3P314_5, chbC3P314_6,
					chbC3P314_7, chbC3P314_8,  chbC3P314_9  ,  chbC3P314_10 ,  chbC3P314_11);
			if (!chbC3P314_11.isChecked()) {
				Util.cleanAndLockView(getActivity(), txtC3P314_11ESP);
			} else {
				Util.lockView(getActivity(), false, txtC3P314_11ESP);
				txtC3P314_11ESP.requestFocus();
			}
			FuncionP114A();
		}
	}
	
	
	public void FuncionP114A() {
		if (chbC3P314A_1.isChecked() || chbC3P314A_2.isChecked()
				|| chbC3P314A_3.isChecked() || chbC3P314A_4.isChecked()
				|| chbC3P314A_5.isChecked() || chbC3P314A_6.isChecked()
				|| chbC3P314A_7.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P314A_8);
		} else {
			Util.lockView(getActivity(), false, chbC3P314A_8);
		}

		if (chbC3P314A_8.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC3P314A_1, chbC3P314A_2,
					chbC3P314A_3, chbC3P314A_4, chbC3P314A_5, chbC3P314A_6,
					chbC3P314A_7, txtC3P314A_7ESP);
		} else {
			Util.lockView(getActivity(), false, chbC3P314A_1, chbC3P314A_2,
					chbC3P314A_3, chbC3P314A_4, chbC3P314A_5, chbC3P314A_6,
					chbC3P314A_7);
			FuncionP114A_ESP();
		}

	}
	
	public void FuncionP114A_ESP() {
		if (chbC3P314A_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC3P314A_7ESP);
			txtC3P314A_7ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC3P314A_7ESP);
		}
	}

}

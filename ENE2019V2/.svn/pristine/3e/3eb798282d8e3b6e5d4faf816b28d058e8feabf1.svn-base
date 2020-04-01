package gob.inei.ene2019v2.fragment.ModII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.IntegerField;
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
import gob.inei.ene2019v2.model.Moduloii;
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

public class Mod_II_Fragment_006 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC2P219;
	@FieldAnnotation(orderIndex = 2)
	public TextField txtC2P219_ESP;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC2P221_1;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC2P221_2;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC2P221_3;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC2P221_4;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC2P221_5;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC2P221_6;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC2P221_7;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC2P221_8;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC2P221_9;
	@FieldAnnotation(orderIndex = 12)
	public TextField txtC2P221_9ESP;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC2P221_10;
	@FieldAnnotation(orderIndex = 14)
	public IntegerField txtC2P222;

	private CuestionarioService cuestionarioService;
	private Moduloii bean;
	private LabelComponent lblTitulo, lblTitulo1, lblHora, lblNota;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent grEspe, grhora;

	public Mod_II_Fragment_006() {
	}

	public Mod_II_Fragment_006 parent(MasterActivity parent) {
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
				.text(R.string.mod02_title).textSize(21).centrar().negrita();
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod02_subtitle3).textSize(20).centrar()
				.negrita();
		lblHora = new LabelComponent(this.getActivity())
				.size(altoComponente, 200).negrita().centrar()
				.text(R.string.mod02_Numhoras).textSize(16);

		lblNota = new LabelComponent(this.getActivity())
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod02_nota2).textSize(17).alinearIzquierda()
				.negrita().colorFondo(R.color.amarillo);

		rgC2P219 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p019_1, R.string.c1c100m2p019_2,
				R.string.c1c100m2p019_3, R.string.c1c100m2p019_4, R.string.c1c100m2p019_5).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL).callback("FuncionP19");
		txtC2P219_ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 400).hint(R.string.especifique212).soloTextoNumero();
		rgC2P219.agregarEspecifique(3, txtC2P219_ESP);
//		txtC2P219_ESP = new TextField(this.getActivity(), false)
//				.size(altoComponente, 400).hint(R.string.especifique212)
//				.soloTextoNumero();
		//rgC2P219.agregarEspecifique(3, txtC2P219_ESP);
		
		chbC2P221_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_1, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_2, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_3, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_4, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_5, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_6, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_7, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_8, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		chbC2P221_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_9, "1:0")
				.size(LayoutParams.WRAP_CONTENT, 140)
				.callback("FuncionP21Check").callback("FuncionP21").callback("FuncionP21AA");
		chbC2P221_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m2p021_10, "1:0").size(WRAP_CONTENT, 750)
				.callback("FuncionP21Check").callback("FuncionP21AA");
		txtC2P221_9ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 600).hint(R.string.especifique)
				.soloTextoNumero();
		txtC2P222 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().hint(R.string.horas)
				.negrita();
		
		grEspe = new GridComponent(this.getActivity(), 2);
		grEspe.colorFondo(android.R.color.transparent);
		grEspe.addComponent(chbC2P221_9);
		grEspe.addComponent(txtC2P221_9ESP);

		grhora = new GridComponent(this.getActivity(), 1);
		grhora.colorFondo(android.R.color.transparent);
		grhora.addComponent(txtC2P222);
		grhora.addComponent(lblHora);

		Filtros.setFiltro(txtC2P219_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC2P221_9ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC2P222, Filtros.TIPO.NUMBER, 3, -1, null, 1, 998,999);

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.mod02_preg19, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P219);
		q2 = createQuestionSection(R.string.mod02_preg21, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, chbC2P221_1, chbC2P221_2,
				chbC2P221_3, chbC2P221_4, chbC2P221_5, chbC2P221_6,
				chbC2P221_7, chbC2P221_8, grEspe.component(), chbC2P221_10);
		// q9 = createQuestionSection(lblNota);
		q3 = createQuestionSection(R.string.mod02_preg22, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, grhora.component());

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


			if (Util.esVacio(rgC2P219)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P219");
				view = rgC2P219;
				error = true;
				return false;
			}
			if (rgC2P219.isTagSelected(4)) {
				if (Util.esVacio(txtC2P219_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.219 (Especifique)");
					view = txtC2P219_ESP;
					error = true;
					return false;
				} else {
					if (txtC2P219_ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC2P219_ESP;
						error = true;
						return false;
					}
				}
			}
			
			if (!Util.esDiferente(bean.c2p202,2,3,5,6,7)  && rgC2P219.isTagSelected(3)) {
				ToastMessage.msgBox(this.getActivity(),
						"VERIFICAR: No corresponde el tipo de medidor con el lugar predominante del negocio", ToastMessage.MESSAGE_INFO,
						ToastMessage.DURATION_LONG);
//				mensaje = "VERIFICAR: No corresponde el tipo de medidor con el lugar predominante del negocio";
//				view = rgC2P219;
//				error = true;
//				return false;
			}
		
		
		if (!rgC2P219.isTagSelected(5)) {
			if (!chbC2P221_1.isChecked() && !chbC2P221_2.isChecked()
					&& !chbC2P221_3.isChecked() && !chbC2P221_4.isChecked()
					&& !chbC2P221_5.isChecked() && !chbC2P221_6.isChecked()
					&& !chbC2P221_7.isChecked() && !chbC2P221_8.isChecked()
					&& !chbC2P221_9.isChecked() && !chbC2P221_10.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P221";
				view = chbC2P221_1;
				error = true;
				return false;
			}
			if (chbC2P221_9.isChecked()) {
				if (Util.esVacio(txtC2P221_9ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.221 (Especifique)");
					view = txtC2P221_9ESP;
					error = true;
					return false;
				} else {
					if (txtC2P221_9ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC2P221_9ESP;
						error = true;
						return false;
					}
				}
			}
			if (chbC2P221_1.isChecked() || chbC2P221_2.isChecked() ) {
				if (Util.esVacio(txtC2P222)) {
					mensaje = pregunta_no_vacia
							.replace("$", "La pregunta P222");
					view = txtC2P222;
					error = true;
					return false;
				}

				if (Util.getInt(txtC2P222) > 72) {
					ToastMessage.msgBox(this.getActivity(),
							"VERIFICAR: Está indicando que el último corte de agua duró "
							+ txtC2P222.getText().toString() + " horas ", ToastMessage.MESSAGE_INFO,
							ToastMessage.DURATION_LONG);
//					mensaje = "VERIFICAR: Está indicando que el último corte de agua duró "
//							+ txtC2P222.getText().toString() + " horas ";
//					view = txtC2P222;
//					error = true;
//					return false;
				}
			}
		}
		
		return true;
	}

	@Override
	public void cargarDatos() {
		
		
		bean = getCuestionarioService().getModuloii(
				App.getInstance().getEmpresa(),
				new Moduloii().getSecCap(getListFields(this, new String[] {"C2P202","C2P219","C2P219_ESP","C2P221_1","C2P221_2","C2P221_3","C2P221_4","C2P221_5","C2P221_6","C2P221_7","C2P221_8","C2P221_9","C2P221_9ESP",
						"C2P221_10","C2P222"})));
		if (bean == null) {
			bean = new Moduloii();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {

	
		FuncionP19();
		FuncionP21AA();
		FuncionP21Check();
		if (rgC2P219.getTagSelected("").toString().equals("5")) {
			Util.cleanAndLockView(getActivity(),chbC2P221_1, chbC2P221_2,chbC2P221_3, chbC2P221_4, chbC2P221_5, chbC2P221_6, chbC2P221_7, chbC2P221_8,chbC2P221_9,chbC2P221_10, txtC2P222 );
		}
		rgC2P219.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}


	
	public void FuncionP19() {

		if (rgC2P219.getTagSelected("").toString().equals("5")) {
			Util.cleanAndLockView(getActivity(), chbC2P221_1, chbC2P221_2,
					chbC2P221_3, chbC2P221_4, chbC2P221_5, chbC2P221_6,
					chbC2P221_7, chbC2P221_8, chbC2P221_9, chbC2P221_10,
					txtC2P222);
			if (rgC2P219.isPressed()) {
				if (!grabar()) {
					return;
				}
				// parent.nextFragment(CuestionarioFragmentActivity.CAP00);
				parent.nextFragment(parent.getCurPage() + 1);
			}
		} else {
			FuncionP21AA();
			// Util.lockView(getActivity(), false, chbC2P221_1,
			// chbC2P221_2,chbC2P221_3, chbC2P221_4, chbC2P221_5, chbC2P221_6,
			// chbC2P221_7, chbC2P221_8,chbC2P221_9, txtC2P222);
			chbC2P221_1.requestFocus();
		}

	}

	public void FuncionP21() {
		if (!chbC2P221_9.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC2P221_9ESP);
		} else {
			Util.lockView(getActivity(), false, txtC2P221_9ESP);
			txtC2P221_9ESP.requestFocus();
		}
	}

	public void FuncionP21Check() {
		if (chbC2P221_1.isChecked() || chbC2P221_2.isChecked() ) {
		//	Util.cleanAndLockView(getActivity(), rgC2P223);
			Util.lockView(getActivity(), false, txtC2P222);
		//	txtC2P222.requestFocus();
		} else if ( chbC2P221_3.isChecked() || chbC2P221_4.isChecked()
				|| chbC2P221_5.isChecked() || chbC2P221_6.isChecked()
				|| chbC2P221_7.isChecked() || chbC2P221_8.isChecked()
				|| chbC2P221_9.isChecked() || chbC2P221_10.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC2P222);
		}
	}
	
	

	public void FuncionP21AA() {
		if (chbC2P221_1.isChecked() || chbC2P221_2.isChecked()
				|| chbC2P221_3.isChecked() || chbC2P221_4.isChecked()
				|| chbC2P221_5.isChecked() || chbC2P221_6.isChecked()
				|| chbC2P221_7.isChecked() || chbC2P221_8.isChecked()
				|| chbC2P221_9.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC2P221_10);
		} else {
			Util.lockView(getActivity(), false, chbC2P221_10);
		}

		if (chbC2P221_10.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC2P221_1, chbC2P221_2,
					chbC2P221_3, chbC2P221_4, chbC2P221_5, chbC2P221_6,
					chbC2P221_7, chbC2P221_8, chbC2P221_9);
		} else {
			Util.lockView(getActivity(), false, chbC2P221_1, chbC2P221_2,
					chbC2P221_3, chbC2P221_4, chbC2P221_5, chbC2P221_6,
					chbC2P221_7, chbC2P221_8, chbC2P221_9);
			FuncionP21();
		}
		
	
		
	}
	

	@Override
	public Entity getEntity() {
		return bean;
	}
}

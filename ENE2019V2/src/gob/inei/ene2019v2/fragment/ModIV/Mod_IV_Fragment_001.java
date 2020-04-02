package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_001 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P401;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC4P401A_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P401A_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P401A_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P401A_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P401A_5;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P401A_6;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P401A_7;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P401A_8;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC4P401A_9;
	@FieldAnnotation(orderIndex = 11)
	public TextField txtC4P401A_9ESP;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P401A_10;
	@FieldAnnotation(orderIndex = 13)
	public RadioGroupOtherField rgC4P402A;
	@FieldAnnotation(orderIndex = 14)
	public TextField txtC4P402A_ESP;
//	@FieldAnnotation(orderIndex = 15)
//	public RadioGroupOtherField rgC4P402B;
//	@FieldAnnotation(orderIndex = 16)
//	public TextField txtC4P402B_ESP;
//	@FieldAnnotation(orderIndex = 17)
//	public RadioGroupOtherField rgC4P402C;
	@FieldAnnotation(orderIndex = 15)
	public RadioGroupOtherField rgC4P403;

	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private GridComponent2 grd;
	private LabelComponent lblTitulo, lblSubTitulo;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_001() {
	}

	public Mod_IV_Fragment_001 parent(MasterActivity parent) {
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
				.text(R.string.c1c100m400p).textSize(21).centrar().negrita();
		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m4p_1)
				.textSize(20).centrar().negrita();

		rgC4P401 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p001_1, R.string.c1c100m4p001_2,
				R.string.c1c100m4p001_3).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
		chbC4P401A_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_saltoChangeValue").callback("onC3P401A_10ChangeValue");
		chbC4P401A_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_saltoChangeValue").callback("onC3P401A_10ChangeValue");
				
		chbC4P401A_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_10ChangeValue");
		chbC4P401A_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_10ChangeValue");
		chbC4P401A_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_10ChangeValue");
		chbC4P401A_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_10ChangeValue");
		chbC4P401A_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_7, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_10ChangeValue");
		chbC4P401A_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_8, "1:0").size(WRAP_CONTENT, WRAP_CONTENT).callback("onC3P401A_10ChangeValue");
		chbC4P401A_9 = new CheckBoxField(this.getActivity(),R.string.c1c100m4p402_9, "1:0").size(altoComponente, 145)
				.callback("C3P401A_9Especifique").callback("onC3P401A_10ChangeValue");
		chbC4P401A_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p402_10, "1:0").size(WRAP_CONTENT, WRAP_CONTENT)
				.callback("onC3P401A_10ChangeValue");
		txtC4P401A_9ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		grd = new GridComponent2(this.getActivity(), Gravity.CENTER_VERTICAL, 2);
		grd.addComponent(chbC4P401A_9);
		grd.addComponent(txtC4P401A_9ESP);
		grd.colorFondo(R.color.WhiteSmoke);
		grd.component();

		rgC4P402A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100C4P402_1, R.string.c1c100C4P402_2,
				R.string.c1c100C4P402_3, R.string.c1c100C4P402_4,
				R.string.c1c100C4P402_5, R.string.c1c100C4P402_6).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL).callback("C3P401A_9Especifique");
		txtC4P402A_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		rgC4P402A.agregarEspecifique(5, txtC4P402A_ESP);
		rgC4P403 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p403_1, R.string.c1c100m4p403_2,
				R.string.c1c100m4p403_3, R.string.c1c100m4p403_4).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);

		Filtros.setFiltro(txtC4P401A_9ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c1c100m4p401, Gravity.START, rgC4P401);
		q2 = createQuestionSection(R.string.c1c100m4p401A, Gravity.START, chbC4P401A_1,
				chbC4P401A_2, chbC4P401A_3, chbC4P401A_4, chbC4P401A_5,
				chbC4P401A_6, chbC4P401A_7, chbC4P401A_8, grd, chbC4P401A_10);
		q4 = createQuestionSection(R.string.c1c100m4p002a, Gravity.START, rgC4P402A);

		q6 = createQuestionSection(R.string.c1c100m4p403, Gravity.START, rgC4P403);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q4);
		form.addView(q6);

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
			if (!getCuestionarioService().saveOrUpdate(bean,
					bean.getSecCap(getListFields(this, extras)))) {
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

		if (!isInRange())
			return false;
		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (Util.esVacio(rgC4P401)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P401");
			view = rgC4P401;
			error = true;
			return false;
		}
		
//		if (rgC4P401.isTagSelected(1) || rgC4P401.isTagSelected(2)){
			if (!chbC4P401A_1.isChecked() && !chbC4P401A_2.isChecked()
					&& !chbC4P401A_3.isChecked() && !chbC4P401A_4.isChecked()
					&& !chbC4P401A_5.isChecked() && !chbC4P401A_6.isChecked()
					&& !chbC4P401A_7.isChecked() && !chbC4P401A_8.isChecked()
					&& !chbC4P401A_9.isChecked() && !chbC4P401A_10.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P401A";
				view = chbC4P401A_1;
				return !(error = true);
			}
			if (chbC4P401A_9.isChecked()) {
				if (Util.esVacio(txtC4P401A_9ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.401A (Especifique)");
					view = txtC4P401A_9ESP;
					return !(error = true);
				} else {
					if (txtC4P401A_9ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P401A_9ESP;
						error = true;
						return false;
					}
				}
			}

			if (chbC4P401A_1.isChecked()||chbC4P401A_2.isChecked()) {
				if (Util.esVacio(rgC4P402A)) {
					mensaje = preguntaVacia.replace("$", "La pregunta P402A");
					view = rgC4P402A;
					error = true;
					return false;
				}

				if (rgC4P402A.isTagSelected(6)) {
					if (Util.esVacio(txtC4P402A_ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.402A (Especifique)");
						view = txtC4P402A_ESP;
						error = true;
						return false;
					} else {
						if (txtC4P402A_ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC4P402A_ESP;
							error = true;
							return false;
						}
					}
				}
			}
				if (Util.esVacio(rgC4P403)) {
					mensaje = preguntaVacia.replace("$", "La pregunta P403");
					view = rgC4P403;
					error = true;
					return false;
				}
//			}
//		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv01(
				App.getInstance().getEmpresa(),
				new Moduloiv01().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		C3P401A_9Especifique();
	//	onRgChangedValue(rgC4P401);
		if (rgC4P401.isTagSelected(1) || rgC4P401.isTagSelected(2)){
		
			onC3P401A_10ChangeValue();
	
		}
	
	Log.e("que paso aquiiiiiiii: ", "" +bean.c4p403);

		rgC4P401.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	 public void C3P401A_9Especifique() {
		if (chbC4P401A_9.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P401A_9ESP);
			txtC4P401A_9ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P401A_9ESP);
		}
	}

	public void onC3P401A_10ChangeValue() {

		if (chbC4P401A_10.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P401A_1, chbC4P401A_2,
					chbC4P401A_3, chbC4P401A_4, chbC4P401A_5, chbC4P401A_6,
					chbC4P401A_7, chbC4P401A_8, chbC4P401A_9,txtC4P401A_9ESP);
		} else {
			Util.lockView(getActivity(), false, chbC4P401A_1, chbC4P401A_2,
					chbC4P401A_3, chbC4P401A_4, chbC4P401A_5, chbC4P401A_6,
					chbC4P401A_7, chbC4P401A_8, chbC4P401A_9);
			       C3P401A_9Especifique();
		}

		       if (chbC4P401A_1.isChecked() || chbC4P401A_2.isChecked()
				|| chbC4P401A_3.isChecked() || chbC4P401A_4.isChecked()
				|| chbC4P401A_5.isChecked() || chbC4P401A_6.isChecked()
				|| chbC4P401A_7.isChecked() || chbC4P401A_8.isChecked()
				|| chbC4P401A_9.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P401A_10);
		} else {
			Util.lockView(getActivity(), false, chbC4P401A_10);
		}

	}
//	public void onC3P401A_saltoChangeValue() {
//		if (chbC4P401A_1.isChecked()||chbC4P401A_2.isChecked()) {
//		     Util.lockView(getActivity(), false, rgC4P402A);
//		     rgC4P402A.requestFocus();
//	} else {
//		Util.cleanAndLockView(getActivity(), rgC4P402A);
//		rgC4P403.requestFocus();
//		
//	}
 //Si C4P401A_9 = 1 AND C4P401A_2=1  Pase a C4P401A_9ESP, luego a C4P402A
//	Si C4P401A_9 = 0 AND C4P401A_2=1  Pase a C4P402A
	
// Si C4P401A_9 = 1 AND C4P401A_2=0  Pase a C4P401A_9ESP, luego a C4P403
//	Si C4P401A_9 = 0 AND C4P401A_2=0  Pase a C4P403
	


	public void onC3P401A_saltoChangeValue() {
		
	if ((chbC4P401A_2.isChecked()&& chbC4P401A_9.isChecked())||(chbC4P401A_2.isChecked()&& !chbC4P401A_9.isChecked())) {
		Util.lockView(getActivity(), false, rgC4P402A);
		//rgC4P402A.requestFocus();
	} else {
		Util.cleanAndLockView(getActivity(), rgC4P402A);
		  rgC4P403.requestFocus();
	}
//	if ((!chbC4P401A_2.isChecked()&& chbC4P401A_9.isChecked())||(!chbC4P401A_2.isChecked()&& !chbC4P401A_9.isChecked())) {
//		     Util.cleanAndLockView(getActivity(), rgC4P402A);
//		     Util.lockView(getActivity(), false, rgC4P403);
//		     rgC4P403.requestFocus();
//		     
//	} 

	}
	@Override
	public Caratula getEntity() {
		return App.getInstance().getEmpresa();
	}

}

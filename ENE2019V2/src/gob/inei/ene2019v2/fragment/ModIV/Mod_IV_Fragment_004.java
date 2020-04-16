package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
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
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv01;
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

public class Mod_IV_Fragment_004 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P415;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC4P415A;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P415B_1;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P415B_2;
//	@FieldAnnotation(orderIndex = 5)
//	public CheckBoxField chbC4P415B_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P415B_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P415B_5;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P415B_6;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P415B_7;
	@FieldAnnotation(orderIndex = 9)
	public TextField txtC4P415B_7ESP;

	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private LabelComponent lblTitulo, lblSubTitulo;
	private GridComponent grEspe01, grEspe02;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_004() {
	}

	public Mod_IV_Fragment_004 parent(MasterActivity parent) {
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


		rgC4P415 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p415_1, R.string.c1c100m4p415_2,
				R.string.c1c100m4p415_3).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("onChange415");

		rgC4P415A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p415a_1, R.string.c1c100m4p415a_2)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).callback("onChange415").callback("onChange415a");

		chbC4P415B_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p415b_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P415B_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p415b_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
//		chbC4P415B_3 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p415b_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P415B_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p415b_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P415B_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p415b_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P415B_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p415b_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P415B_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p415b_7, "1:0").size(
				LayoutParams.WRAP_CONTENT, 140).callback("bloqueo_M4P015b");

		txtC4P415B_7ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();

		grEspe02 = new GridComponent(this.getActivity(), 2);
		grEspe02.colorFondo(android.R.color.transparent);
		grEspe02.addComponent(chbC4P415B_7);
		grEspe02.addComponent(txtC4P415B_7ESP);

		Filtros.setFiltro(txtC4P415B_7ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c1c100m4p415, rgC4P415);
		q2 = createQuestionSection(R.string.c1c100m4p415a, Gravity.START, rgC4P415A);
		q3 = createQuestionSection(R.string.c1c100m4p415b, Gravity.START, chbC4P415B_1, chbC4P415B_2,
				/*chbC4P415B_3, */chbC4P415B_4, chbC4P415B_5, chbC4P415B_6, grEspe02.component() );

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
//		String[] extras = null;
//		if ((rgC4P415.isTagSelected(2) || rgC4P415.isTagSelected(3) || rgC4P415A.isTagSelected(1))) {
//			bean.c4p417 = null;
//			bean.c4p417_esp = null;
//			extras = new String[] { "C4P417","C4P417_ESP"};
//		}
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
		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);

		if (!isInRange())
			return false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
//2310
//		if (!Util.esDiferente(bean.c4p411, 1) && (Util.esVacio(rgC4P413))) {
//			mensaje = preguntaVacia.replace("$", "La pregunta P413");
//			view = rgC4P413;
//			error = true;
//			return false;
//		}



		if (Util.esVacio(rgC4P415)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P415");
			view = rgC4P415;
			error = true;
			return false;
		}

		if (rgC4P415.isTagSelected(1)) {
			if (Util.esVacio(rgC4P415A)) {
				mensaje = preguntaVacia.replace("$", "La pregunta P415A");
				view = rgC4P415A;
				error = true;
				return false;
			}
		}

	//	if ( ( rgC4P415.isTagSelected(2) || rgC4P415.isTagSelected(3)  ) || rgC4P415A.isTagSelected(2)) {
			if ( rgC4P415.isTagSelected(1)&& rgC4P415A.isTagSelected(2)) {
				
		    	if (!chbC4P415B_1.isChecked() && !chbC4P415B_2.isChecked()
					&&/* !chbC4P415B_3.isChecked() && */!chbC4P415B_4.isChecked()
					&& !chbC4P415B_5.isChecked() && !chbC4P415B_6.isChecked()&& !chbC4P415B_7.isChecked() ) {
				
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P415B";
				view = chbC4P415B_1;
				error = true;
				return false;
			}
			if (chbC4P415B_7.isChecked()) {
				if (Util.esVacio(txtC4P415B_7ESP)) {
					mensaje = preguntaVacia.replace("$",
							"La Preg.415B (Especifique)");
					view = txtC4P415B_7ESP;
					error = true;
					return false;
				} else {
					if (txtC4P415B_7ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P415B_7ESP;
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
		bean = getCuestionarioService().getModuloiv01(
				App.getInstance().getEmpresa(),
				new Moduloiv01().getSecCap(getListFields(this, new String[] { })));
		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		rgC4P415.requestFocus();		
	//	onChange415a();
		bloqueo_M4P015b();
		onChange415a();
		onChange415();
		//2310
//		if (!Util.esDiferente(bean.c4p411, 2)) {
//			Util.cleanAndLockView(this.getActivity(), rgC4P413);
//			chbC4P414_1.requestFocus();
//		} else {
//			Util.lockView(this.getActivity(), false, rgC4P413);
//			rgC4P413.requestFocus();
//		}

		
		rgC4P415.requestFocus();
	}

//	public void onChange415() {
//		if (rgC4P415.isTagSelected(1)) {
//			Util.lockView(getActivity(), false, rgC4P415A);	
//			rgC4P415A.requestFocus();			
//			if (rgC4P415A.isTagSelected(2)) {
//				Util.lockView(getActivity(), false, chbC4P415B_1, chbC4P415B_2,
//						chbC4P415B_3, chbC4P415B_4, chbC4P415B_5, chbC4P415B_6, chbC4P415B_7);	
//			}
//			
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC4P415A);
//			Util.lockView(getActivity(), false, chbC4P415B_1, chbC4P415B_2,
//					chbC4P415B_3, chbC4P415B_4, chbC4P415B_5, chbC4P415B_6, chbC4P415B_7);	
//			chbC4P415B_1.requestFocus();	
//		}
//	}
	public void onChange415() {
	if (rgC4P415.isTagSelected(1)) {
		Util.lockView(getActivity(), false, rgC4P415A);	
		rgC4P415A.requestFocus();			
		if (rgC4P415A.isTagSelected(2)) {
			Util.lockView(getActivity(), false, chbC4P415B_1, chbC4P415B_2,
					/*chbC4P415B_3,*/ chbC4P415B_4, chbC4P415B_5, chbC4P415B_6, chbC4P415B_7);	
		}
		
	} else {
		Util.cleanAndLockView(getActivity(), rgC4P415A, chbC4P415B_1, chbC4P415B_2,
				/*chbC4P415B_3,*/ chbC4P415B_4, chbC4P415B_5, chbC4P415B_6, chbC4P415B_7);
		
//		Util.lockView(getActivity(), false, chbC4P415B_1, chbC4P415B_2,
//				chbC4P415B_3, chbC4P415B_4, chbC4P415B_5, chbC4P415B_6, chbC4P415B_7);	
//		chbC4P415B_1.requestFocus();	
	}
}

	public void onChange415a() {
		if (rgC4P415A.isTagSelected(1)) {
			Util.cleanAndLockView(getActivity(), chbC4P415B_1, chbC4P415B_2,
					/*chbC4P415B_3,*/ chbC4P415B_4, chbC4P415B_5, chbC4P415B_6,
					txtC4P415B_7ESP, chbC4P415B_7);
			if (rgC4P415A.isPressed()) {
				if (rgC4P415A.getTagSelected("").toString().equals("1")) {
			//		parent.nextFragment(CuestionarioFragmentActivity.MODULO_IV+4);
				}
			}			
		} else {
			Util.lockView(getActivity(), false, chbC4P415B_1, chbC4P415B_2,
					/*chbC4P415B_3,*/ chbC4P415B_4, chbC4P415B_5, chbC4P415B_6, chbC4P415B_7);
			chbC4P415B_1.requestFocus();
		}
	}


	public void bloqueo_M4P015b() {
		if (chbC4P415B_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P415B_7ESP);
			txtC4P415B_7ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P415B_7ESP);
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
	public Caratula getEntity() {
		return App.getInstance().getEmpresa();
	}

}

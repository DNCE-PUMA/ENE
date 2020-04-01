package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.GridComponent;
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
import gob.inei.ene2019v2.model.Moduloiv01;
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

public class Mod_IV_Fragment_008 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC4P428_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC4P428_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P428_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P428_4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P428_5;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P428_6;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P428_7;
	@FieldAnnotation(orderIndex = 8)
	public TextField txtC4P428_7ESP;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC4P429A;
	@FieldAnnotation(orderIndex = 10)
	public TextField txtC4P429A_ESP;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC4P430_1;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC4P430_2;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P430_3;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC4P430_4;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P430_5;
	@FieldAnnotation(orderIndex = 16)
	public TextField txtC4P430_5ESP;
	@FieldAnnotation(orderIndex = 17)
	public RadioGroupOtherField rgC4P430A;

	private CuestionarioService cuestionarioService;
	private Moduloiv01 bean;
	private LabelComponent lblTitulo, lblSubTitulo;
	private GridComponent grEspe01, grEspe02, grEspe02P;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_008() {
	}

	public Mod_IV_Fragment_008 parent(MasterActivity parent) {
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
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m4p_2)
				.textSize(20).centrar().negrita();

		chbC4P428_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p428_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P428_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p428_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P428_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p428_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P428_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p428_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P428_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p428_5, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P428_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p428_6, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P428_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p428_7, "1:0").callback("FuncionCheck").size(
				LayoutParams.WRAP_CONTENT, 140);

		txtC4P428_7ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();

		grEspe01 = new GridComponent(this.getActivity(), 2);
		grEspe01.colorFondo(android.R.color.transparent);
		grEspe01.addComponent(chbC4P428_7);
		grEspe01.addComponent(txtC4P428_7ESP);

		rgC4P429A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p429a_1, R.string.c1c100m4p429a_2,
				R.string.c1c100m4p429a_3 ,R.string.c1c100m4p429a_4 , R.string.c1c100m4p429a_5 ).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).callback("FuncionP429");		
	
		txtC4P429A_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		rgC4P429A.agregarEspecifique(3, txtC4P429A_ESP);

		chbC4P430_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p430_1, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P430_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p430_2, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P430_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p430_3, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P430_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p430_4, "1:0").size(WRAP_CONTENT, WRAP_CONTENT);
		chbC4P430_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p430_5, "1:0").callback("FuncionP430").size(
				LayoutParams.WRAP_CONTENT, 140);
		txtC4P430_5ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();

		rgC4P430A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p427_1, R.string.c1c100m4p427_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL).centrar();	

		grEspe02 = new GridComponent(this.getActivity(), 2);
		grEspe02.colorFondo(android.R.color.transparent);
		grEspe02.addComponent(chbC4P430_5);
		grEspe02.addComponent(txtC4P430_5ESP);

		Filtros.setFiltro(txtC4P429A_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC4P428_7ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC4P430_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);

		q1 = createQuestionSection(R.string.c1c100m4p428, Gravity.START, chbC4P428_1, chbC4P428_2,
				chbC4P428_3, chbC4P428_4, chbC4P428_5, chbC4P428_6,
				grEspe01.component());
		q2 = createQuestionSection(R.string.c1c100m4p429a, Gravity.START, rgC4P429A);

		q3 = createQuestionSection(R.string.c1c100m4p430, Gravity.START, chbC4P430_1, chbC4P430_2,
				chbC4P430_3, chbC4P430_4, grEspe02.component());
		q4 = createQuestionSection(R.string.c1c100m4p430a, Gravity.START, rgC4P430A);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
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

		if (Util.getInt(bean.c4p427) == 1) {
			if (!chbC4P428_1.isChecked() && !chbC4P428_2.isChecked()
					&& !chbC4P428_3.isChecked() && !chbC4P428_4.isChecked()
					&& !chbC4P428_5.isChecked() && !chbC4P428_6.isChecked()
					&& !chbC4P428_7.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P428";
				view = chbC4P428_1;
				error = true;
				return false;
			}
			if (chbC4P428_7.isChecked()) {
				if (Util.esVacio(txtC4P428_7ESP)) {
					mensaje = preguntaVacia.replace("$",
							"La Preg.428 (Especifique)");
					view = txtC4P428_7ESP;
					error = true;
					return false;
				} else {
					if (txtC4P428_7ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P428_7ESP;
						error = true;
						return false;
					}
				}
			}
		}

		if (Util.esVacio(rgC4P429A)) {
			mensaje = "DEBE INGRESAR INFORMACION EN P429A";
			view = rgC4P429A;
			error = true;
			return false;
		}

		if (rgC4P429A.isTagSelected(4) ) {
			if (Util.esVacio(txtC4P429A_ESP)) {
				mensaje = preguntaVacia.replace("$",
						"La Preg.P429A (Especifique)");
				view = txtC4P429A_ESP;
				error = true;
				return false;
			} else {
				if (txtC4P429A_ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC4P429A_ESP;
					error = true;
					return false;
				}
			}
		}
		if (rgC4P429A.isTagSelectedBetween(1, 4) ) {
			if (!chbC4P430_1.isChecked() && !chbC4P430_2.isChecked()
					&& !chbC4P430_3.isChecked() && !chbC4P430_4.isChecked()
					&& !chbC4P430_5.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P430";
				view = chbC4P430_1;
				error = true;
				return false;
			}

			if (chbC4P430_5.isChecked()) {
				if (Util.esVacio(txtC4P430_5ESP)) {
					mensaje = preguntaVacia.replace("$",
							"La Preg.430 (Especifique)");
					view = txtC4P430_5ESP;
					error = true;
					return false;
				} else {
					if (txtC4P430_5ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC4P430_5ESP;
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
				new Moduloiv01().getSecCap(getListFields(this,
						new String[] { "C4P427" })));
		if (bean == null) {
			bean = new Moduloiv01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {

		FuncionP429();
		if (Util.getInt(bean.c4p427) == 2) {
			Util.cleanAndLockView(this.getActivity(), chbC4P428_1, chbC4P428_2,
					chbC4P428_3, chbC4P428_4, chbC4P428_5, chbC4P428_6,
					chbC4P428_7, txtC4P428_7ESP);
			
				rgC4P429A.requestFocus();
		} else {
			Util.lockView(this.getActivity(), false, chbC4P428_1, chbC4P428_2,
					chbC4P428_3, chbC4P428_4, chbC4P428_5, chbC4P428_6,
					chbC4P428_7, txtC4P428_7ESP);
			FuncionCheck();
			chbC4P428_1.requestFocus();
		}

	}

	public void FuncionCheck() {
		if (chbC4P428_7.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P428_7ESP);
			txtC4P428_7ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P428_7ESP);
		}
	}

	public void FuncionP429() {
		if (rgC4P429A.isTagSelected(5)) {
			Util.cleanAndLockView(getActivity(), chbC4P430_1,
					chbC4P430_2, chbC4P430_3, chbC4P430_4, chbC4P430_5,
					txtC4P430_5ESP,rgC4P430A);
		} else {
			Util.lockView(getActivity(), false, chbC4P430_1, chbC4P430_2,
					chbC4P430_3, chbC4P430_4, chbC4P430_5,rgC4P430A);
			
			FuncionP430();
			rgC4P429A.requestFocus();
		}
	}


	public void FuncionP430() {
		if (chbC4P430_5.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P430_5ESP);
			txtC4P430_5ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC4P430_5ESP);
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

package gob.inei.ene2019v2.fragment.ModVI;

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
import gob.inei.ene2019v2.model.Modulovi01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VI_Fragment_003 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC6P607_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC6P607_2;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC6P607_3;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC6P607_4;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC6P607_5;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC6P607_6;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC6P607_7;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC6P607_8;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC6P607_9;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC6P607_10;
	@FieldAnnotation(orderIndex = 11)
	public TextField txtC6P607_9ESP;
	@FieldAnnotation(orderIndex = 12)
	public RadioGroupOtherField rgC6P608;
	@FieldAnnotation(orderIndex = 13)
	public IntegerField txtC6P609;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC6P609_1;

	private CuestionarioService cuestionarioService;
	private Modulovi01 bean;
	private LabelComponent lblTitulo, lblSubTitulo, lblporcentaje;
	private GridComponent gridPVI_7, griP609;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_VI_Fragment_003() {
	}

	public Mod_VI_Fragment_003 parent(MasterActivity parent) {
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
				.text(R.string.moduloVI).textSize(21).centrar().negrita();
		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m6p_1)
				.textSize(21).centrar().negrita();
		lblporcentaje = new LabelComponent(this.getActivity()).size(35, 180)
				.text(R.string.c1c100m4p004_1).textSize(14).centrar().negrita();
		chbC6P607_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_1, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_2, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_3, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_4, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_5, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_6, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_7, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_8, "1:0").size(WRAP_CONTENT, 600);
		chbC6P607_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_9, "1:0").callback("FuncionCHECK607")
				.size(WRAP_CONTENT, 150);
		txtC6P607_9ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		chbC6P607_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p007_10, "1:0").callback("FuncionCHECK607_10")
				.size(WRAP_CONTENT, 600);
		
		rgC6P608 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p008_1, R.string.c1c100m6p008_2).size(
				WRAP_CONTENT, 700).orientation(ORIENTATION.HORIZONTAL);
		txtC6P609 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().negrita()
				.hint(R.string.porcentaje);
		txtC6P609.addTextChangedListener(twP609);
		chbC6P609_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p009_1, "1:0").callback("FuncionCHECK609")
				.size(WRAP_CONTENT, 180);

		gridPVI_7 = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
		gridPVI_7.addComponent(chbC6P607_9);
		gridPVI_7.addComponent(txtC6P607_9ESP);
		gridPVI_7.colorFondo(R.color.transparent);

		griP609 = new GridComponent(this.getActivity(), 1);
		griP609.addComponent(txtC6P609);
		griP609.addComponent(lblporcentaje);
		griP609.colorFondo(R.color.transparent);

		Filtros.setFiltro(txtC6P607_9ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC6P609, Filtros.TIPO.NUMBER, 3, -1, null, 1, 100);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c1c100m6p007, chbC6P607_1,
				chbC6P607_2, chbC6P607_3, chbC6P607_4, chbC6P607_5,
				chbC6P607_6, chbC6P607_7, chbC6P607_8, gridPVI_7.component(),chbC6P607_10);
		q2 = createQuestionSection(R.string.c1c100m6p008, rgC6P608);
		q3 = createQuestionSection(R.string.c1c100m6p009, griP609.component(),
				chbC6P609_1);

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
		if (!chbC6P607_1.isChecked() && !chbC6P607_2.isChecked()
				&& !chbC6P607_3.isChecked() && !chbC6P607_4.isChecked()
				&& !chbC6P607_5.isChecked() && !chbC6P607_6.isChecked()
				&& !chbC6P607_7.isChecked() && !chbC6P607_8.isChecked()
				&& !chbC6P607_9.isChecked() && !chbC6P607_10.isChecked()) {
			mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P607";
			view = chbC6P607_1;
			error = true;
			return false;
		}
		if (chbC6P607_9.isChecked()) {
			if (Util.esVacio(txtC6P607_9ESP)) {
				mensaje = preguntaVacia.replace("$",
						"La Preg.607 (Especifique)");
				view = txtC6P607_9ESP;
				error = true;
				return false;
			}else{
				if (txtC6P607_9ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC6P607_9ESP;
					error = true;
					return false;
				}
			}
		}
		if (!chbC6P607_10.isChecked()) {
			if (Util.esVacio(rgC6P608)) {
				mensaje = preguntaVacia.replace("$", "La pregunta P608");
				view = rgC6P608;
				error = true;
				return false;
			}
	
			if (Util.esVacio(txtC6P609) && !chbC6P609_1.isChecked()) {
				mensaje = preguntaVacia.replace("$", "La pregunta P609");
				view = txtC6P609;
				error = true;
				return false;
			}
		}
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModulovi01(
				App.getInstance().getEmpresa(),
				new Modulovi01().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Modulovi01();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		FuncionCHECK607();
		FuncionCHECK609();
		FuncionCHECK607_10();
		chbC6P607_1.requestFocus();
	}

	public void FuncionCHECK607() {
		if (chbC6P607_9.isChecked()) {
			Util.lockView(getActivity(), false, txtC6P607_9ESP);
			txtC6P607_9ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC6P607_9ESP);
		}
	}
	
	public void FuncionCHECK607_10() {
		if (chbC6P607_10.isChecked()) {
			Util.cleanAndLockView(getActivity(),txtC6P607_9ESP,chbC6P607_1,chbC6P607_2,chbC6P607_3,chbC6P607_4,chbC6P607_5,chbC6P607_6,chbC6P607_7,chbC6P607_8,chbC6P607_9,rgC6P608,txtC6P609,chbC6P609_1);
		} else {
			Util.lockView(getActivity(), false,chbC6P607_1,chbC6P607_2,chbC6P607_3,chbC6P607_4,chbC6P607_5,chbC6P607_6,chbC6P607_7,chbC6P607_8,chbC6P607_9,rgC6P608,txtC6P609,chbC6P609_1);
		}
	}

	public void FuncionCHECK609() {
		if (chbC6P609_1.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC6P609);
		} else {
			Util.lockView(getActivity(), false, txtC6P609);
			txtC6P609.requestFocus();
		}
	}

	private TextWatcher twP609 = new TextWatcher() {

		@Override
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
		}

		@Override
		public void afterTextChanged(Editable s) {
			if(!chbC6P607_10.isChecked()){
				if (Util.getInt(txtC6P609) > 0 && Util.getInt(txtC6P609) <= 100) {
					Util.cleanAndLockView(getActivity(), chbC6P609_1);
				} else if (Util.esVacio(txtC6P609)) {
					Util.lockView(getActivity(), false, chbC6P609_1);
				}
			}
		}

	};

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	@Override
	public Entity getEntity() {
		return bean;
	}
}

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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VI_Fragment_008 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC6P624;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC6P624_A;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC6P625;
	@FieldAnnotation(orderIndex = 4)
	public IntegerField txtC6P626;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC6P626_1;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC6P627;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC6P628;

	private CuestionarioService cuestionarioService;
	private Modulovi01 bean;
	private LabelComponent lblTitulo, lblSubTitulo, lblporcentaje;
	LinearLayout q0, q1, q2, q3, q4, q5, q6;
	private GridComponent griP626;

	public Mod_VI_Fragment_008() {
	}

	public Mod_VI_Fragment_008 parent(MasterActivity parent) {
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
				.size(MATCH_PARENT, MATCH_PARENT).text(R.string.c1c100m6p_4)
				.textSize(20).centrar().negrita();
		lblporcentaje = new LabelComponent(this.getActivity()).size(35, 150)
				.text(R.string.c1c100m4p004_1).textSize(14).centrar().negrita();
		rgC6P624 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p024_1, R.string.c1c100m6p024_2)
				.size(WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL)
				.callback("FuncionRG624");
		rgC6P624_A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p024_1, R.string.c1c100m6p024_2)
				.size(WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL)
				/*.callback("FuncionRG624A")*/;
		rgC6P625 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p025_1, R.string.c1c100m6p025_2,
				R.string.c1c100m6p025_3, R.string.c1c100m6p025_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL)
				/*.callback("FuncionRG625")*/;
		txtC6P626 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().negrita()
				.hint(R.string.porcentaje);
		txtC6P626.addTextChangedListener(twP626);
		chbC6P626_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p009_1, "1:0").callback("FuncionCHECK626")
				.size(WRAP_CONTENT, 180);

		rgC6P627 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p027_1, R.string.c1c100m6p027_2).size(
				WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL);
		rgC6P628 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m6p028_1, R.string.c1c100m6p028_2).size(
				WRAP_CONTENT, 180).orientation(ORIENTATION.HORIZONTAL);

		griP626 = new GridComponent(this.getActivity(), 1);
		griP626.addComponent(txtC6P626);
		griP626.addComponent(lblporcentaje);
		griP626.colorFondo(R.color.transparent);

		Filtros.setFiltro(txtC6P626, Filtros.TIPO.NUMBER, 3, -1, null, 1, 100);

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c1c100m6p024, rgC6P624);
		q2 = createQuestionSection(R.string.c1c100m6p024_A, rgC6P624_A);
		q3 = createQuestionSection(R.string.c1c100m6p025, rgC6P625);
		q4 = createQuestionSection(R.string.c1c100m6p026, griP626.component(),
				chbC6P626_1);
		q5 = createQuestionSection(R.string.c1c100m6p027, rgC6P627);
		q6 = createQuestionSection(R.string.c1c100m6p028, rgC6P628);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
		form.addView(q5);
		form.addView(q6);
		
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

		try {
			if (rgC6P624.isTagSelected(2)) {
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C6P629", "C6P630_1", "C6P630_2", "C6P630_3",
								"C6P630_4", "C6P630_5", "C6P630_5ESP",
								"C6P631", "C6P632_1", "C6P632_2", "C6P632_3",
								"C6P632_4", "C6P632_5", "C6P632_6", "C6P632_7",
								"C6P632_8", "C6P632_9", "C6P632_10",
								"C6P632_11", "C6P632_12", "C6P632_12ESP" })))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else {
				if (!getCuestionarioService().saveOrUpdate(bean,
						bean.getSecCap(getListFields(this)))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
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

		if (Util.esVacio(rgC6P624)) {
			mensaje = preguntaVacia.replace("$", "La pregunta P624");
			view = rgC6P624;
			error = true;
			return false;
		}

		if (rgC6P624.isTagSelected(1)) {
			if (Util.esVacio(rgC6P624_A)) {
				mensaje = preguntaVacia.replace("$", "La pregunta P624A");
				view = rgC6P624_A;
				error = true;
				return false;
			}
//			if (rgC6P624.isTagSelected(1) || rgC6P624_A.isTagSelected(1)) {
				if (Util.esVacio(rgC6P625)) {
					mensaje = preguntaVacia.replace("$", "La pregunta P625");
					view = rgC6P625;
					error = true;
					return false;
				}
	
//				if (rgC6P625.isTagSelected(1)) {
					if (Util.esVacio(txtC6P626) && !chbC6P626_1.isChecked()) {
						mensaje = preguntaVacia.replace("$", "La pregunta P626");
						view = txtC6P626;
						error = true;
						return false;
					}
					if (Util.esVacio(rgC6P627)) {
						mensaje = preguntaVacia.replace("$", "La pregunta P627");
						view = rgC6P627;
						error = true;
						return false;
					}
					if (Util.esVacio(rgC6P628)) {
						mensaje = preguntaVacia.replace("$", "La pregunta P628");
						view = rgC6P628;
						error = true;
						return false;
					}
//				}
//			}
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
	
//		FUNCIONRG624A();
//		FUNCIONRG625();
		FuncionCHECK626();
		FuncionRG624();
		rgC6P624.requestFocus();
	}

	public void FuncionRG624() {
		int x = Integer.parseInt(rgC6P624.getTagSelected("0").toString());
		if (x == 2) {
			Util.cleanAndLockView(getActivity(), rgC6P624_A,rgC6P625,txtC6P626,chbC6P626_1, rgC6P627,rgC6P628);
		} else {
			Util.lockView(getActivity(), false, rgC6P624_A,rgC6P625,txtC6P626,chbC6P626_1, rgC6P627,rgC6P628);
			rgC6P624_A.requestFocus();
		}
	}



	public void FuncionCHECK626() {
		if (chbC6P626_1.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC6P626);
		} else {
			Util.lockView(getActivity(), false, txtC6P626);
			txtC6P626.requestFocus();
		}
	}

	private TextWatcher twP626 = new TextWatcher() {

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

			if (rgC6P624.isTagSelected(1)) {
				if (Util.getInt(txtC6P626) > 0 && Util.getInt(txtC6P626) <= 100) {
					Util.cleanAndLockView(getActivity(), chbC6P626_1);
				} else if (Util.esVacio(txtC6P626)) {
					Util.lockView(getActivity(), false, chbC6P626_1);
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

package gob.inei.ene2019v2.fragment.ModI;

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
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_I_Fragment_009 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC1P125;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC1P126_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC1P126_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC1P126_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC1P126_4;	
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC1P126_5;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtC1P126_5ESP;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC1P126_6;
	
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC1P127_1;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC1P127_2;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC1P127_3;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC1P127_4;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC1P127_5;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC1P127_6;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC1P127_7;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC1P127_8;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC1P127_9;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC1P127_11;
	@FieldAnnotation(orderIndex = 19)
	public TextField txtC1P127_11ESP;
	@FieldAnnotation(orderIndex = 20)
	public CheckBoxField chbC1P127_12;
	private CuestionarioService cuestionarioService;
	private Moduloi bean;
	private LabelComponent lblTitulo, lblTitulo1;
	private GridComponent2 grEspe1, grEspe2;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_I_Fragment_009() {
	}

	public Mod_I_Fragment_009 parent(MasterActivity parent) {
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
				.text(R.string.moduloI).textSize(21).centrar().negrita();
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m1p015_).textSize(20).centrar().negrita();
		rgC1P125 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.c1c100_No).size(WRAP_CONTENT, 180)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP125");
		chbC1P126_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p026_1, "1:0").size(WRAP_CONTENT, 600).callback("FuncionCheckP126");
		chbC1P126_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p026_2, "1:0").size(WRAP_CONTENT, 600).callback("FuncionCheckP126");
		chbC1P126_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p026_3, "1:0").size(WRAP_CONTENT, 600).callback("FuncionCheckP126");
		chbC1P126_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p026_4, "1:0").size(WRAP_CONTENT, 600).callback("FuncionCheckP126");
		chbC1P126_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p026_5, "1:0").size(WRAP_CONTENT, 150)
				.callback("FuncionCheckP126").callback("FuncionCheckP126");
		txtC1P126_5ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		chbC1P126_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p026_6, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP126");
		
		grEspe1 = new GridComponent2(this.getActivity(), 2);
		grEspe1.addComponent(chbC1P126_5);
		grEspe1.addComponent(txtC1P126_5ESP);
		grEspe1.colorFondo(R.color.transparent);

		chbC1P127_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_1, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_2, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_3, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_4, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_5, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_6, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_7, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_8, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_9, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		chbC1P127_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_10, "1:0").size(WRAP_CONTENT, 200)
				.callback("FuncionCheckP127");
		txtC1P127_11ESP = new TextField(this.getActivity(), false)
		.size(altoComponente, 400).hint(R.string.especifique)
		.soloTextoNumero();
		chbC1P127_12 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p027_11, "1:0").size(WRAP_CONTENT, 600)
				.callback("FuncionCheckP127");
		
	
		grEspe2 = new GridComponent2(this.getActivity(), 2);
		grEspe2.addComponent(chbC1P127_11);
		grEspe2.addComponent(txtC1P127_11ESP);
		grEspe2.colorFondo(R.color.transparent);

		Filtros.setFiltro(txtC1P126_5ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC1P127_11ESP, Filtros.TIPO.ALFAN_U, 300, null);
	} 

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m1p025, rgC1P125);
		q2 = createQuestionSection(R.string.c1c100m1p026, chbC1P126_1,
				chbC1P126_2, chbC1P126_3, chbC1P126_4, grEspe1.component(), chbC1P126_6);
		q3 = createQuestionSection(R.string.c1c100m1p027, chbC1P127_1,
				chbC1P127_2, chbC1P127_3, chbC1P127_4, chbC1P127_5,
				chbC1P127_6, chbC1P127_7, chbC1P127_8, chbC1P127_9,
				 grEspe2.component(), chbC1P127_12);

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

		if (Util.getInt(bean.c1p116) == 1) {
			if (Util.esVacio(rgC1P125)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P125");
				view = rgC1P125;
				error = true;
				return false;
			}

			if (rgC1P125.isTagSelected(1)) {
				if (!chbC1P126_1.isChecked() && !chbC1P126_2.isChecked()
						&& !chbC1P126_3.isChecked() && !chbC1P126_4.isChecked()
						&& !chbC1P126_5.isChecked()&& !chbC1P126_6.isChecked() ) {
					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P126";
					view = chbC1P126_1;
					error = true;
					return false;
				}
				if (chbC1P126_5.isChecked()) {
					if (Util.esVacio(txtC1P126_5ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.126 (Especifique)");
						view = txtC1P126_5ESP;
						error = true;
						return false;
					}else{
						if (txtC1P126_5ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC1P126_5ESP;
							error = true;
							return false;
						}
					}
				}
			}
		} else {
			if (!chbC1P127_1.isChecked() && !chbC1P127_2.isChecked()
					&& !chbC1P127_3.isChecked() && !chbC1P127_4.isChecked()
					&& !chbC1P127_5.isChecked() && !chbC1P127_6.isChecked()
					&& !chbC1P127_7.isChecked() && !chbC1P127_8.isChecked()
					&& !chbC1P127_9.isChecked() && !chbC1P127_11.isChecked()
					&& !chbC1P127_12.isChecked() ) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P127";
				view = chbC1P127_1;
				error = true;
				return false;
			}
			if (chbC1P127_11.isChecked()) {
				if (Util.esVacio(txtC1P127_11ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.127 (Especifique)");
					view = txtC1P127_11ESP;
					error = true;
					return false;
				}else{
					if (txtC1P127_11ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC1P127_11ESP;
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
		bean = getCuestionarioService().getModuloi(
				App.getInstance().getEmpresa(),
				new Moduloi().getSecCap(getListFields(this,
						new String[] { "C1P116" })));
		if (bean == null) {
			bean = new Moduloi();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {

		if (Util.getInt(bean.c1p116) == 2) {
			Util.cleanAndLockView(getActivity(), rgC1P125, chbC1P126_1,
					chbC1P126_2, chbC1P126_3, chbC1P126_4, chbC1P126_5,
					txtC1P126_5ESP , chbC1P126_6);
			chbC1P127_1.requestFocus();
			FuncionCheckP127();
		} else {
		//	Util.lockView(getActivity(), false, rgC1P125, chbC1P126_1,
		//			chbC1P126_2, chbC1P126_3, chbC1P126_4, chbC1P126_5 , chbC1P126_6);
			FuncionP125();
			//FuncionCheckP126();
			rgC1P125.requestFocus();
		}

	}

	public void FuncionP125() {
		Integer valor = Integer.parseInt(rgC1P125.getTagSelected("0").toString());
		if (valor == 1) {
			Util.lockView(getActivity(), false, chbC1P126_1, chbC1P126_2,
					chbC1P126_3, chbC1P126_4, chbC1P126_5, chbC1P126_6);
			Util.cleanAndLockView(getActivity(), chbC1P127_1, chbC1P127_2,
					chbC1P127_3, chbC1P127_4, chbC1P127_5, chbC1P127_6,
					chbC1P127_7, chbC1P127_8, chbC1P127_9, chbC1P127_11,
					chbC1P127_12, txtC1P127_11ESP );
			chbC1P126_1.requestFocus();
			FuncionCheckP126();
		} else {
			Util.cleanAndLockView(getActivity(), chbC1P126_1, chbC1P126_2,
					chbC1P126_3, chbC1P126_4, chbC1P126_5, txtC1P126_5ESP, chbC1P126_6,
					chbC1P127_1, chbC1P127_2, chbC1P127_3, chbC1P127_4,
					chbC1P127_5, chbC1P127_6, chbC1P127_7, chbC1P127_8,
					chbC1P127_9, chbC1P127_11, chbC1P127_12, txtC1P127_11ESP);
		}
	}

	public void FuncionCheckP126() {
		if (chbC1P126_1.isChecked() || chbC1P126_2.isChecked()
				|| chbC1P126_3.isChecked() || chbC1P126_4.isChecked()
				|| chbC1P126_5.isChecked() ) {
			Util.cleanAndLockView(getActivity(), chbC1P126_6);
		} else {
			Util.lockView(getActivity(), false, chbC1P126_6);
		}

		if (chbC1P126_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC1P126_1, chbC1P126_2,
					chbC1P126_3, chbC1P126_4, chbC1P126_5 , txtC1P126_5ESP);
		} else {
			
			if (chbC1P126_5.isChecked()) {
				Util.lockView(getActivity(), false, txtC1P126_5ESP);
				txtC1P126_5ESP.requestFocus();
			} else {
				Util.cleanAndLockView(getActivity(), txtC1P126_5ESP);
			}
			Util.lockView(getActivity(), false, chbC1P126_1, chbC1P126_2,
					chbC1P126_3, chbC1P126_4, chbC1P126_5);
		}
		
		
		
	}
	
	

	public void FuncionCheckP127() {

		if (chbC1P127_1.isChecked() || chbC1P127_2.isChecked()
				|| chbC1P127_3.isChecked() || chbC1P127_4.isChecked()
				|| chbC1P127_5.isChecked() || chbC1P127_6.isChecked()
				|| chbC1P127_7.isChecked() || chbC1P127_8.isChecked()
				|| chbC1P127_9.isChecked() || chbC1P127_11.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC1P127_12);
		} else {
			Util.lockView(getActivity(), false, chbC1P127_12);
		}

		if (chbC1P127_12.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC1P127_1, chbC1P127_2,
					chbC1P127_3, chbC1P127_4, chbC1P127_5, chbC1P127_6,
					chbC1P127_7, chbC1P127_8, chbC1P127_9, chbC1P127_11 , txtC1P127_11ESP);
		} else {
			
			if (chbC1P127_11.isChecked()) {
				Util.lockView(getActivity(), false, txtC1P127_11ESP);
				txtC1P127_11ESP.requestFocus();
			} else {
				Util.cleanAndLockView(getActivity(), txtC1P127_11ESP);
			}
			Util.lockView(getActivity(), false, chbC1P127_1, chbC1P127_2,
					chbC1P127_3, chbC1P127_4, chbC1P127_5, chbC1P127_6,
					chbC1P127_7, chbC1P127_8, chbC1P127_9, chbC1P127_11);
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
		return bean;
	}
}

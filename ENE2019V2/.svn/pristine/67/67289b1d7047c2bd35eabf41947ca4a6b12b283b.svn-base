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
import gob.inei.ene2019v2.model.Caratula;
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

public class Mod_I_Fragment_001 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC1P101A_1;
	@FieldAnnotation(orderIndex = 2)
	public TextField txtC1P101A_8ESP;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC1P101B_1;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC1P101B_2;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC1P101B_3;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC1P101B_4;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC1P101B_5;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC1P101B_6;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC1P101B_7;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC1P101B_8;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC1P101B_9;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC1P101B_10;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC1P101B_11;	
	@FieldAnnotation(orderIndex = 14)
	public TextField txtC1P101B_11ESP;

	private Caratula caratula;
	private CuestionarioService cuestionarioService;
	private Moduloi bean;
	private LabelComponent lblTitulo, lblTitulo1;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	public GridComponent2 grEspe, grEspe2;
	
	public Mod_I_Fragment_001() {
	}

	public Mod_I_Fragment_001 parent(MasterActivity parent) {
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
				.text(R.string.moduloI_3).textSize(20).centrar().negrita();

		rgC1P101A_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m1p101a_1, R.string.c1c100m1p101a_2,
				R.string.c1c100m1p101a_3, R.string.c1c100m1p101a_4,
				R.string.c1c100m1p101a_5, R.string.c1c100m1p101a_6,
				R.string.c1c100m1p101a_7, R.string.c1c100m1p101a_8)
				.size(450, 580).orientation(ORIENTATION.VERTICAL)
				.callback("FuncionCheckP101A");

		txtC1P101A_8ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		rgC1P101A_1.agregarEspecifique(7, txtC1P101A_8ESP);
	
		
		chbC1P101B_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_1, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_2, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_3, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_4, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_5, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_6, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_7, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_8, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_9, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_10, "1:0").size(WRAP_CONTENT, 600);
		chbC1P101B_11 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p101b_11, "1:0").size(WRAP_CONTENT, 200).callback("FuncionCheckP101B");
				
		txtC1P101B_11ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();

		grEspe2 = new GridComponent2(this.getActivity(), 2);
		grEspe2.addComponent(chbC1P101B_11);
		grEspe2.addComponent(txtC1P101B_11ESP);
		grEspe2.colorFondo(R.color.transparent);


		Filtros.setFiltro(txtC1P101A_8ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC1P101B_11ESP, Filtros.TIPO.ALFAN_U, 300, null);

	} 

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);	
		q1 = createQuestionSection(R.string.c1c100m1p001A, rgC1P101A_1);
		q2 = createQuestionSection(R.string.c1c100m1p101b, chbC1P101B_1,
				chbC1P101B_2, chbC1P101B_3, chbC1P101B_4, chbC1P101B_5,
				chbC1P101B_6, chbC1P101B_7, chbC1P101B_8, chbC1P101B_9,
				chbC1P101B_10,grEspe2.component());

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
		String[] extras = null;

		extras = new String[] { "C1P101A_1", "C1P101A_8ESP", "C1P101B_1", "C1P101B_2",
				"C1P101B_3", "C1P101B_4", "C1P101B_5", "C1P101B_6",
				"C1P101B_7", "C1P101B_8", "C1P101B_9", "C1P101B_10",
				"C1P101B_11", "C1P101B_11ESP" };

		try {

			if (!getCuestionarioService()
					.saveOrUpdate(bean, getSecCap2(extras))) {
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
		  // solo valida cuando p30 es igual a 1
	  if (Util.getInt(caratula.p30)==1) {
		if (Util.esVacio(rgC1P101A_1)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P101A");
			view = rgC1P101A_1;
			error = true;
			return false;
		}
		if (rgC1P101A_1.isTagSelected(8)) {
			if (Util.esVacio(txtC1P101A_8ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.101A (Especifique)");
				view = txtC1P101A_8ESP;
				return !(error = true);
			} else {
				if (txtC1P101A_8ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC1P101A_8ESP;
					error = true;
					return false;
				}
			}
		}
		
     }
		if (!rgC1P101A_1.isTagSelected(2)) {
			if (!chbC1P101B_1.isChecked() && !chbC1P101B_2.isChecked()
					&& !chbC1P101B_3.isChecked() && !chbC1P101B_4.isChecked()
					&& !chbC1P101B_5.isChecked() && !chbC1P101B_6.isChecked()
					&& !chbC1P101B_7.isChecked() && !chbC1P101B_8.isChecked()
					&& !chbC1P101B_9.isChecked() && !chbC1P101B_10.isChecked()
					&& !chbC1P101B_11.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P101B.";
				view = chbC1P101B_1;
				error = true;
				return false;
			}
			if (chbC1P101B_11.isChecked()) {
				if (Util.esVacio(txtC1P101B_11ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.101B (Especifique)");
					view = txtC1P101B_11ESP;
					error = true;
					return false;
				} else {
					if (txtC1P101B_11ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC1P101B_11ESP;
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
				new Moduloi().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloi();
			bean.id = App.getInstance().getEmpresa().id;
		}

		caratula = App.getInstance().getEmpresa();
		if (caratula == null) {
			caratula = new Caratula(App.getInstance().getEmpresa().id);
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		// bloquea si  la pregunta 30 es mayor a 1
		if (Util.getInt(caratula.p30)==1) {
			Util.lockView(getActivity(), false, rgC1P101A_1);
			rgC1P101A_1.requestFocus();
					
			} else {
			 Util.cleanAndLockView(getActivity(), rgC1P101A_1);
		}
		rgC1P101A_1.requestFocus();
		FuncionCheckP101A();
		FuncionCheckP101B();

		rgC1P101A_1.requestFocus();

	}

	public void FuncionCheckP101A() {

		if (rgC1P101A_1.getTagSelected("").toString().equals("2")) {
//			Util.cleanAndLockView(getActivity(), chbC1P101B_1, chbC1P101B_2,
//					chbC1P101B_3, chbC1P101B_4, chbC1P101B_5, chbC1P101B_6,
//					chbC1P101B_7, chbC1P101B_8, chbC1P101B_9, chbC1P101B_10,
//					chbC1P101B_11);
//			if (rgC1P101A_1.isPressed()) {
//				if (!grabar()) {
//					return;
//				}
//				parent.nextFragment(parent.getCurPage() + 5);
//			}
			chbC1P101B_1.requestFocus();
		} else {
			Util.lockView(getActivity(), false, chbC1P101B_1, chbC1P101B_2,
					chbC1P101B_3, chbC1P101B_4, chbC1P101B_5, chbC1P101B_6,
					chbC1P101B_7, chbC1P101B_8, chbC1P101B_9, chbC1P101B_10,
					chbC1P101B_11);
			chbC1P101B_1.requestFocus();

		}

	}

	

	public void FuncionCheckP101B() {
		if (chbC1P101B_11.isChecked()) {
			Util.lockView(getActivity(), false, txtC1P101B_11ESP);
			txtC1P101B_11ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC1P101B_11ESP);
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

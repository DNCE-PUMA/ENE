package gob.inei.ene2019v2.fragment.ModV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
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
import gob.inei.ene2019v2.model.Modulov01;
import gob.inei.ene2019v2.model.Modulov02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_V_Fragment_009 extends FragmentForm {
	
	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC5P526_1;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC5P526_2;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC5P526_3;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC5P526_4;
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC5P526_5;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC5P526_6;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC5P526_7;
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC5P526_8;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC5P526_9;
	@FieldAnnotation(orderIndex = 10)
	public TextField txtC5P526_9ESP;
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC5P527;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC5P528_1;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC5P528_2;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC5P528_3;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC5P528_4;
	@FieldAnnotation(orderIndex = 16)
	public TextField txtC5P528_4ESP;
	
	private LabelComponent lbl26_1,lbl26_2,lbl26_3,lbl26_4,lbl26_5,lbl26_6,lbl26_7,lbl26_8,lbl26_9;
	private GridComponent gcPreg26;
	private GridComponent2 gcPreg28;
	private CuestionarioService cuestionarioService;
	private Modulov02 bean;
	private Modulov01 bean1;
	private LabelComponent lblTitulo, lblsubTitulo;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_V_Fragment_009() {
	}

	public Mod_V_Fragment_009 parent(MasterActivity parent) {
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
				.text(R.string.CapituloV).textSize(21).centrar().negrita();

		lblsubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.CapV_SecI).textSize(20).centrar().negrita();
		
		rgC5P526_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P526_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);;
		rgC5P526_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P526_4 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P526_5 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P526_6 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P526_7 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P526_8 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL);
		rgC5P526_9 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m5p026_1_1, R.string.c1c100m5p026_1_2, R.string.c1c100m5p026_1_3, R.string.c1c100m5p026_1_4)
				.size(WRAP_CONTENT, 450).orientation(ORIENTATION.VERTICAL).callback("FuncionBTN526");
		
		txtC5P526_9ESP = new TextField(this.getActivity(), false)
			.size(altoComponente, 400).hint(R.string.especifique)
			.soloTextoNumero();
		
		rgC5P527 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.c1c100_No
				).size(WRAP_CONTENT, 400)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionBTN527");
		
		chbC5P528_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p028_1, "1:0").size(altoComponente, 600);
		chbC5P528_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p028_2, "1:0").size(altoComponente, 600);
		chbC5P528_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p028_3, "1:0").size(altoComponente, 600);
		chbC5P528_4 =  new CheckBoxField(this.getActivity(),
				R.string.c1c100m5p028_4, "1:0").size(altoComponente, 150).callback("FuncionCHECK528");
		txtC5P528_4ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		
		gcPreg28 = new GridComponent2(this.getActivity(), 2)
		.colorFondo(R.color.transparent);
		gcPreg28.addComponent(chbC5P528_4);
		gcPreg28.addComponent(txtC5P528_4ESP);
		
		
		lbl26_1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_1).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_2).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_3 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_3).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_4 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_4).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_5 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_5).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_6 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_6).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_7 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_7).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_8 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_8).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		lbl26_9 = new LabelComponent(this.getActivity(), App.ESTILO)
				.text(R.string.c1c100m5p026_9).size(altoComponente + 150, 300)
				.textSize(16).alinearIzquierda().negrita();
		
		gcPreg26 = new GridComponent(this.getActivity(), 2)
		.colorFondo(R.color.blanco);
		gcPreg26.addComponent(lbl26_1);
		gcPreg26.addComponent(rgC5P526_1);
		gcPreg26.addComponent(lbl26_2);
		gcPreg26.addComponent(rgC5P526_2);
		gcPreg26.addComponent(lbl26_3);
		gcPreg26.addComponent(rgC5P526_3);
		gcPreg26.addComponent(lbl26_4);
		gcPreg26.addComponent(rgC5P526_4);
		gcPreg26.addComponent(lbl26_5);
		gcPreg26.addComponent(rgC5P526_5);
		gcPreg26.addComponent(lbl26_6);
		gcPreg26.addComponent(rgC5P526_6);
		gcPreg26.addComponent(lbl26_7);
		gcPreg26.addComponent(rgC5P526_7);
		gcPreg26.addComponent(lbl26_8);
		gcPreg26.addComponent(rgC5P526_8);
		gcPreg26.addComponent(lbl26_9);
		gcPreg26.addComponent(rgC5P526_9);
		gcPreg26.addComponent(txtC5P526_9ESP, 2);
		
		Filtros.setFiltro(txtC5P526_9ESP, Filtros.TIPO.ALFAN_U, 300, null);
		
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblsubTitulo);
		q1 = createQuestionSection(R.string.c1c100m5p026,gcPreg26.component());
		q2 = createQuestionSection(R.string.c1c100m5p027, rgC5P527);
		q3 = createQuestionSection(R.string.c1c100m5p028, chbC5P528_1,chbC5P528_2,chbC5P528_3,gcPreg28.component());
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
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
		
		if (Util.getInt(bean.c5p513b) == 1) {

			if (Util.getInt(bean1.c5p501_7a) == 1) {

				for (int i = 1; i <= 9; i++) {
					View v = getView("rgC5P526_" + i);
					if (Util.esVacio(((RadioGroupOtherField) v))) {
						mensaje = pregunta_no_vacia.replace("$",
								"La pregunta 526_" + i);
						view = v;
						error = true;
						return false;
					}
				}

				if (!rgC5P526_9.getTagSelected("").toString().equals("1")) {
					if (Util.esVacio(txtC5P526_9ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.526_9 (Especifique)");
						view = txtC5P526_9ESP;
						error = true;
						return false;
					} else {
						if (txtC5P526_9ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC5P526_9ESP;
							error = true;
							return false;
						}
					}
				}

			}

		}
		
		if (Util.esVacio(rgC5P527)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P527");
			view = rgC5P527;
			error = true;
			return false;
		}
		
		if (rgC5P527.getTagSelected("").toString().equals("1")) {

			if (!chbC5P528_1.isChecked() && !chbC5P528_2.isChecked()
					&& !chbC5P528_3.isChecked() && !chbC5P528_4.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P528";
				view = chbC5P528_1;
				error = true;
				return false;
			}

			if (chbC5P528_4.isChecked()) {
				if (Util.esVacio(txtC5P528_4ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.528 (Especifique)");
					view = txtC5P528_4ESP;
					error = true;
					return false;
				} else {
					if (txtC5P528_4ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC5P528_4ESP;
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
		
		bean = getCuestionarioService().getModulov02(
				App.getInstance().getEmpresa(),
				new Modulov02().getSecCap(getListFields(this, new String[] {
						"C5P513B", "C5P523_4", "C5P524_4", "C5P525_C_3", "C5P525_D_2", "C5P525_E_1" })));
		if (bean == null) {
			bean = new Modulov02();
			bean.id = App.getInstance().getEmpresa().id;
		}
		
		bean1 = getCuestionarioService().getModulov01(
				App.getInstance().getEmpresa(),
				new Modulov01().getSecCap(Util.getListList("C5P501_7A")));
		
		if (bean1 == null) {
			bean1 = new Modulov01();
			bean1.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		
		if (Util.getInt(bean.c5p513b) == 2) {
			Util.cleanAndLockView(getActivity(), rgC5P526_1,rgC5P526_2,rgC5P526_3,rgC5P526_4,
					rgC5P526_5,rgC5P526_6,rgC5P526_7,rgC5P526_8,rgC5P526_9,txtC5P526_9ESP);
			rgC5P527.requestFocus();
		} else {
			Util.lockView(getActivity(), false,  rgC5P526_1,rgC5P526_2,rgC5P526_3,rgC5P526_4,
					rgC5P526_5,rgC5P526_6,rgC5P526_7,rgC5P526_8,rgC5P526_9);
			rgC5P526_1.requestFocus();
		}
		
		if (Util.getInt(bean1.c5p501_7a) == 2) {
			Util.cleanAndLockView(getActivity(), rgC5P526_1,rgC5P526_2,rgC5P526_3,rgC5P526_4,
					rgC5P526_5,rgC5P526_6,rgC5P526_7,rgC5P526_8,rgC5P526_9,txtC5P526_9ESP);
			rgC5P527.requestFocus();
		}
		
		FuncionBTN526();
		FuncionBTN527();
		FuncionCHECK528();
		
		rgC5P526_1.requestFocus();
	}
	
	public void FuncionCHECK528() {
		if (chbC5P528_4.isChecked()) {
			Util.lockView(getActivity(), false, txtC5P528_4ESP);
			txtC5P528_4ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P528_4ESP);
		}
	}
	
	public void FuncionBTN526() {
		
		if (rgC5P526_9.getTagSelected("").toString().equals("2") || rgC5P526_9.getTagSelected("").toString().equals("3") 
				||	rgC5P526_9.getTagSelected("").toString().equals("4")) {
			Util.lockView(getActivity(), false, txtC5P526_9ESP);
			txtC5P526_9ESP.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), txtC5P526_9ESP);
			rgC5P527.requestFocus();
		}
	}
	
	public void FuncionBTN527() {
		
		if (rgC5P527.getTagSelected("").toString().equals("1")) {
			Util.lockView(getActivity(), false, chbC5P528_1, chbC5P528_2, chbC5P528_3, chbC5P528_4);
			chbC5P528_1.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), chbC5P528_1, chbC5P528_2, chbC5P528_3, chbC5P528_4, txtC5P528_4ESP);
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
		return App.getInstance().getEmpresa();
	}
}

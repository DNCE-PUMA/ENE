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
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_I_Fragment_003 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC1P105;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC1P106_1;
	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC1P106_2;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC1P106_3;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC1P106_4;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC1P106_5;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC1P106_6;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC1P106_7;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC1P106_8;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC1P106_9;	
	@FieldAnnotation(orderIndex = 11)
	public TextField txtC1P106_ESP;

	private CuestionarioService cuestionarioService;
	private Moduloi bean;
	private Caratula caratula;
	public GridComponent2 grEspex;
	private LabelComponent lblTitulo, lblTitulo1, lblTituloC, lblTitulo2;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_I_Fragment_003() {
	}

	public Mod_I_Fragment_003 parent(MasterActivity parent) {
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
		lblTitulo2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.Seccion8A).textSize(20).centrar().negrita();
		lblTituloC = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text("CONTINUIDAD DE LA EMPRESA").textSize(20).centrar().negrita();
		rgC1P105 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m1p005_1, R.string.c1c100m1p005_2)
				.size(WRAP_CONTENT, 200).orientation(ORIENTATION.HORIZONTAL)
				.centrar().callback("FuncionP105");
		
		chbC1P106_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_1, "1:0").size(WRAP_CONTENT, 600);
		chbC1P106_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_2, "1:0").size(WRAP_CONTENT, 600);
		chbC1P106_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_3, "1:0").size(WRAP_CONTENT, 600);
		chbC1P106_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_4, "1:0").size(WRAP_CONTENT, 600);
		chbC1P106_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_5, "1:0").size(WRAP_CONTENT, 600);
		chbC1P106_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_6, "1:0").size(WRAP_CONTENT, 600);
		chbC1P106_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_7, "1:0").size(WRAP_CONTENT, 600);
		chbC1P106_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_8, "1:0").size(WRAP_CONTENT, 600);
		
		chbC1P106_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m1p006_9, "1:0").size(WRAP_CONTENT, 200)
				.callback("FuncionCheck");
		
		txtC1P106_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		
		grEspex = new GridComponent2(this.getActivity(), 2);
		grEspex.addComponent(chbC1P106_9);
		grEspex.addComponent(txtC1P106_ESP);
		grEspex.colorFondo(R.color.transparent);
		


		Filtros.setFiltro(txtC1P106_ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m1p005, rgC1P105);
		q2 = createQuestionSection(R.string.c1c100m1p006, chbC1P106_1,
				chbC1P106_2, chbC1P106_3, chbC1P106_4, chbC1P106_5,
				chbC1P106_6, chbC1P106_7,chbC1P106_8, grEspex.component());

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

//2310		
	if (Util.getInt(caratula.p29_a) == 1 &&  Util.getInt(caratula.p25) < 3) {
			if (Util.esVacio(rgC1P105)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P105");
				view = rgC1P105;
				return !(error = true);
			}

			if (rgC1P105.isTagSelected(1)) {
				if (!chbC1P106_1.isChecked() && !chbC1P106_2.isChecked()
						&& !chbC1P106_3.isChecked() && !chbC1P106_4.isChecked()
						&& !chbC1P106_5.isChecked() && !chbC1P106_6.isChecked()
						&& !chbC1P106_7.isChecked() && !chbC1P106_8.isChecked()
						&& !chbC1P106_9.isChecked()
						) {
					mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P106";
					view = chbC1P106_1;
					error = true;
					return false;
				}

				if (chbC1P106_9.isChecked()) {
					if (Util.esVacio(txtC1P106_ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.117 (Especifique)");
						view = txtC1P106_ESP;
						error = true;
						return false;
					} else {
						if (txtC1P106_ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC1P106_ESP;
							error = true;
							return false;
						}
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
				new Moduloi().getSecCap(getListFields(this, new String[] { })));
		caratula = App.getInstance().getEmpresa();
		if (bean == null) {
			bean = new Moduloi();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		rgC1P105.requestFocus();
	//2310
		if ( Util.getInt(caratula.p29_a) == 1 &&  Util.getInt(caratula.p25) < 3) {
			Util.lockView(getActivity(), false, rgC1P105, chbC1P106_1,
					chbC1P106_2, chbC1P106_3, chbC1P106_4, chbC1P106_5,
					chbC1P106_6, chbC1P106_7, chbC1P106_8, 
					chbC1P106_9);
			FuncionCheck();
			FuncionP105();
			
		}else{
			Util.cleanAndLockView(getActivity(), rgC1P105);			
			FuncionCheck();
			chbC1P106_1.requestFocus();
		}
		
		rgC1P105.requestFocus();	
	}
			
	

	public void FuncionP105() {
		Integer valor = Integer.parseInt(rgC1P105.getTagSelected("0")
				.toString());

		if (valor == 2) {
			Util.cleanAndLockView(getActivity(), chbC1P106_1,
					chbC1P106_2, chbC1P106_3, chbC1P106_4, chbC1P106_5,
					chbC1P106_6, chbC1P106_7, chbC1P106_8, 
					chbC1P106_9,txtC1P106_ESP);

		} else {
			Util.lockView(getActivity(), false, chbC1P106_1,
					chbC1P106_2, chbC1P106_3, chbC1P106_4, chbC1P106_5,
					chbC1P106_6, chbC1P106_7, chbC1P106_8, 
					chbC1P106_9);
			chbC1P106_1.requestFocus();
		}
	}

	
	public void FuncionCheck() {
		if (chbC1P106_9.isChecked()) {
			Util.lockView(getActivity(), false, txtC1P106_ESP);
			txtC1P106_ESP.requestFocus();

		} else {
			Util.cleanAndLockView(getActivity(), txtC1P106_ESP);
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

package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.TextField;
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
import gob.inei.ene2019v2.model.Moduloiv02;
import gob.inei.ene2019v2.model.Moduloiv03;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_022_02 extends FragmentForm {

	
	@FieldAnnotation(orderIndex = 1)
	public CheckBoxField chbC4P475C_1;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC4P475C_2;

	@FieldAnnotation(orderIndex = 3)
	public CheckBoxField chbC4P475C_3;

	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC4P475C_4;

	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC4P475C_5;

	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC4P475C_6;

	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC4P475C_7;

	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC4P475C_8;

	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC4P475C_9;

	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC4P475C_10;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC4P475C_11;
	
	@FieldAnnotation(orderIndex = 12)
	public TextField txtC4P475C_11ESP;

	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC4P475D_A_1;
	@FieldAnnotation(orderIndex = 14)
	public CheckBoxField chbC4P475D_A_2;
	@FieldAnnotation(orderIndex = 15)
	public CheckBoxField chbC4P475D_A_3;
	@FieldAnnotation(orderIndex = 16)
	public CheckBoxField chbC4P475D_A_4;
	@FieldAnnotation(orderIndex = 17)
	public CheckBoxField chbC4P475D_A_5;
	@FieldAnnotation(orderIndex = 18)
	public CheckBoxField chbC4P475D_A_6;
	private GridComponent2 grP475C;
	private CuestionarioService cuestionarioService;
	private Moduloiv02 bean;
	private Caratula caratula;
	private LabelComponent lblTitulo, lblTitulo2, lbl01, lbl02, lbl03, lbl04,
			lbl05, lbl06, lbl07, lbl08, lbl09, lbl10, lbl2016x, lblvaciox,lblvacioy,
			lblvacio2x, lbl2017x,lblvacio,lblvacio2;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent grEspe;
	SeccionCapitulo[] Mod04;

	public Mod_IV_Fragment_022_02() {
	}

	public Mod_IV_Fragment_022_02 parent(MasterActivity parent) {
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
		lblTitulo2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m4p075sec).textSize(20).centrar()
				.negrita();
		lblvaciox = new LabelComponent(this.getActivity(), App.ESTILO).size(
				altoComponente, 420);
		lblvacioy = new LabelComponent(this.getActivity(), App.ESTILO).size(
				altoComponente, 50);
		lblvacio2x = new LabelComponent(this.getActivity(), App.ESTILO).size(
				altoComponente, 320);
		lbl2016x = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 150).text("2016").textSize(16).centrar();
		lbl2017x = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 150).text("2017").textSize(16).centrar();
		
				
		chbC4P475C_1 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_1")*/.text(R.string.c1c100m4p075C_1);
		chbC4P475C_2 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_2")*/.text(R.string.c1c100m4p075C_2);
		chbC4P475C_3 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_3")*/.text(R.string.c1c100m4p075C_3);
		chbC4P475C_4 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_4")*/.text(R.string.c1c100m4p075C_4);
		chbC4P475C_5 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_5")*/.text(R.string.c1c100m4p075C_5);
		chbC4P475C_6 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_6")*/.text(R.string.c1c100m4p075C_6);
		chbC4P475C_7 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_7")*/.text(R.string.c1c100m4p075C_7);
		chbC4P475C_8 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_8")*/.text(R.string.c1c100m4p075C_8);
		chbC4P475C_9 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_9")*/.text(R.string.c1c100m4p075C_9);
		chbC4P475C_10 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 500)/*.callback("FuncionP475C_10")*/.text(R.string.c1c100m4p075C_10);
		chbC4P475C_11 = new CheckBoxField(this.getActivity(), "1:0").size(
				WRAP_CONTENT, 280).callback("FuncionP475C_11").text(R.string.c1c100m4p075C_11);
					
		txtC4P475C_11ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 220).hint(R.string.especifique)
				.soloTextoNumero();
	
		chbC4P475D_A_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075D_1, "1:0").size(WRAP_CONTENT, 500)
				.callback("FuncionP475D");
		chbC4P475D_A_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075D_2, "1:0").size(WRAP_CONTENT, 500)
				.callback("FuncionP475D");
		chbC4P475D_A_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075D_3, "1:0").size(WRAP_CONTENT, 500)
				.callback("FuncionP475D");
		chbC4P475D_A_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075D_4, "1:0").size(WRAP_CONTENT, 500)
				.callback("FuncionP475D");
		chbC4P475D_A_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075D_5, "1:0").size(WRAP_CONTENT, 500)
				.callback("FuncionP475D");
		chbC4P475D_A_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m4p075D_6, "1:0").size(WRAP_CONTENT, 500)
				.callback("FuncionP475D");
		
		lblvacio = new LabelComponent(this.getActivity(), App.ESTILO).size(
				altoComponente, 300);
		lblvacio2 = new LabelComponent(this.getActivity(), App.ESTILO).size(
				altoComponente, 50).text("Indique el a�o en que recibi� los servicios").textSize(14);
		
		grEspe = new GridComponent(this.getActivity(), 2);
		grEspe.colorFondo(android.R.color.transparent);
		grEspe.addComponent(chbC4P475C_11);
		grEspe.addComponent(txtC4P475C_11ESP);
		

		Filtros.setFiltro(txtC4P475C_11ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC4P475C_11ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo2);
		q1 = createQuestionSection(R.string.c1c100m4p075C, chbC4P475C_1,chbC4P475C_2,chbC4P475C_3,chbC4P475C_4,chbC4P475C_5,chbC4P475C_6,chbC4P475C_7,chbC4P475C_8,chbC4P475C_9,chbC4P475C_10,grEspe.component());
		q2 = createQuestionSection(R.string.c1c100m4p075D, chbC4P475D_A_1,
				chbC4P475D_A_2, chbC4P475D_A_3, chbC4P475D_A_4, chbC4P475D_A_5,
				chbC4P475D_A_6);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);

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

		if (Util.getInt(bean.c4p475a) == 1) {
			if (!chbC4P475C_1.isChecked() && !chbC4P475C_2.isChecked()
					&& !chbC4P475C_3.isChecked()
					&& !chbC4P475C_4.isChecked()
					&& !chbC4P475C_5.isChecked()
					&& !chbC4P475C_6.isChecked()
					&& !chbC4P475C_7.isChecked()
					&& !chbC4P475C_8.isChecked()
					&& !chbC4P475C_9.isChecked()
					&& !chbC4P475C_10.isChecked()
					&& !chbC4P475C_11.isChecked()) {
				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA .";
				view = chbC4P475C_1;
				error = true;
				return false;
			}	
			
			
				
			if (chbC4P475C_11.isChecked()) {
				if (Util.esVacio(txtC4P475C_11ESP)) {
					mensaje = pregunta_no_vacia.replace("$", "La Preg. P475C (especifique)");
					view = txtC4P475C_11ESP;
					error = true;
					return false;
				} else {
					if (txtC4P475C_11ESP.getText().length() < 3) {
						mensaje = "Ingrese la informaci�n correcta";
						view = txtC4P475C_11ESP;
						error = true;
						return false;
					}
				}
			}
		}

		if (!chbC4P475D_A_1.isChecked() && !chbC4P475D_A_2.isChecked()
				&& !chbC4P475D_A_3.isChecked() && !chbC4P475D_A_4.isChecked()
				&& !chbC4P475D_A_5.isChecked() && !chbC4P475D_A_6.isChecked()) {
			mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN  475D..";
			view = chbC4P475D_A_1;
			error = true;
			return false;
		}
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv02(
				App.getInstance().getEmpresa(),
				new Moduloiv02().getSecCap(getListFields(this,
						new String[] { "C4P475A" })));
		caratula = getCuestionarioService().getCaratula(
				App.getInstance().getEmpresa(),
				new Caratula().getSecCap(Util.getListList("P25")));

		if (bean == null) {
			bean = new Moduloiv02();
			bean.id = App.getInstance().getEmpresa().id;
		}
		if (caratula == null) {
			caratula = new Caratula();
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {

		if (Util.getInt(bean.c4p475a) == 2) {
			Util.cleanAndLockView(getActivity(), chbC4P475C_1, chbC4P475C_2,
					chbC4P475C_3, chbC4P475C_4, chbC4P475C_5, chbC4P475C_6,
					chbC4P475C_7, chbC4P475C_8, chbC4P475C_9, chbC4P475C_10,chbC4P475C_11,
					chbC4P475D_A_1,chbC4P475D_A_2,chbC4P475D_A_3,chbC4P475D_A_4,chbC4P475D_A_5,
					chbC4P475D_A_6, txtC4P475C_11ESP);
			chbC4P475D_A_1.requestFocus();
		} else {
			Util.lockView(getActivity(), false, chbC4P475C_1, chbC4P475C_2,
					chbC4P475C_3, chbC4P475C_4, chbC4P475C_5, chbC4P475C_6,
					chbC4P475C_7, chbC4P475C_8, chbC4P475C_9, chbC4P475C_10,chbC4P475C_11,
					chbC4P475D_A_1,chbC4P475D_A_2,chbC4P475D_A_3,chbC4P475D_A_4,chbC4P475D_A_5,
					chbC4P475D_A_6);

			FuncionP475C_11();
			chbC4P475C_1.requestFocus();
		}
		FuncionP475D();
	}
	public void FuncionP475C_11() {
		if (chbC4P475C_11.isChecked()) {
			Util.lockView(getActivity(), false, txtC4P475C_11ESP);
			txtC4P475C_11ESP.requestFocus();
		}else{
			Util.cleanAndLockView(getActivity(), txtC4P475C_11ESP);
		}	
	}
	
	
	public void FuncionP475D() {
		
		if (chbC4P475D_A_1.isChecked() || chbC4P475D_A_2.isChecked()
				|| chbC4P475D_A_3.isChecked() || chbC4P475D_A_4.isChecked()
				|| chbC4P475D_A_5.isChecked() ) {
			Util.cleanAndLockView(getActivity(), chbC4P475D_A_6);
		} else {
			Util.lockView(getActivity(), false, chbC4P475D_A_6);
		}

		
		if (chbC4P475D_A_6.isChecked()) {
			Util.cleanAndLockView(getActivity(), chbC4P475D_A_1,
					chbC4P475D_A_2, chbC4P475D_A_3, chbC4P475D_A_4,
					chbC4P475D_A_5);
		} else {
			Util.lockView(getActivity(), false, chbC4P475D_A_1, chbC4P475D_A_2,
					chbC4P475D_A_3, chbC4P475D_A_4, chbC4P475D_A_5);
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
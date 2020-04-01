package gob.inei.ene2019v2.fragment.ModII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
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
import gob.inei.ene2019v2.model.Moduloii;
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

public class Mod_II_Fragment_003 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC2P208;
	@FieldAnnotation(orderIndex = 2)
	public TextField txtC2P208_ESP;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC2P209;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC2P209A;
	@FieldAnnotation(orderIndex = 5)
	public TextField txtC2P209A_ESP;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC2P210;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC2P212;
	@FieldAnnotation(orderIndex = 8)
	public TextField txtC2P212_ESP;

	private CuestionarioService cuestionarioService;
	private Moduloii bean;
	private Caratula caratula;
	private LabelComponent lblTitulo, lblSubTitulo, lblSubTitulo2;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7;

	public Mod_II_Fragment_003() {
	}

	public Mod_II_Fragment_003 parent(MasterActivity parent) {
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
				.text(R.string.mod02_title).textSize(21).centrar().negrita();

		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod02_subtitle).textSize(20).centrar().negrita();

		lblSubTitulo2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod02_subtitle2).textSize(20).centrar()
				.negrita();

		rgC2P208 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p008_1, R.string.c1c100m2p008_2,
				R.string.c1c100m2p008_3, R.string.c1c100m2p008_4,
				R.string.c1c100m2p008_5, R.string.c1c100m2p008_6,
				R.string.c1c100m2p008_7).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL);
		txtC2P208_ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 400).hint(R.string.especifique).soloTextoNumero();
		rgC2P208.agregarEspecifique(5, txtC2P208_ESP);
		
		rgC2P209 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p009_1, R.string.c1c100m2p009_2, R.string.c1c100m2p009_3).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL).callback("FuncionP9");
		rgC2P209A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p009A_1, R.string.c1c100m2p009A_2, R.string.c1c100m2p009A_3, R.string.c1c100m2p009A_4).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);
		txtC2P209A_ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 400).hint(R.string.especifique).soloTextoNumero();
		rgC2P209A.agregarEspecifique(3, txtC2P209A_ESP);
		
		
		rgC2P210 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);

		rgC2P212 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p012_1, R.string.c1c100m2p012_2,
				R.string.c1c100m2p012_3, R.string.c1c100m2p012_4, R.string.c1c100m2p012_5).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);
		txtC2P212_ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 400).hint(R.string.especifique212).soloTextoNumero();
		rgC2P212.agregarEspecifique(3, txtC2P212_ESP);
		
	

		Filtros.setFiltro(txtC2P208_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC2P212_ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.mod02_preg08, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P208);
		q2 = createQuestionSection(R.string.mod02_preg09, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P209);
		q3 = createQuestionSection(R.string.c1c100m2p009A, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P209A);
		q4 = createQuestionSection(R.string.mod02_preg10, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P210);
		q5 = createQuestionSection(lblSubTitulo2);
		q6 = createQuestionSection(R.string.mod02_preg12, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P212);

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

		extras = new String[] { "C2P212", "C2P212_ESP", "C2P217", "C2P219",
				"C2P219_ESP", "C2P221_1", "C2P221_2", "C2P221_3", "C2P221_4",
				"C2P221_5", "C2P221_6", "C2P221_7", "C2P221_8", "C2P221_9",
				"C2P221_9ESP", "C2P221_10", "C2P222" };

		try {
//			if (Util.getInt(caratula.p25) == 1 || Util.getInt(caratula.p25) == 2) {			
//				if (!getCuestionarioService()
//						.saveOrUpdate(bean, getSecCap2(extras))) {
//					ToastMessage.msgBox(this.getActivity(),
//							"Los datos no se guardaron",
//							ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
//				}
//			}
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

		if (Util.esVacio(rgC2P208)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P208");
			view = rgC2P208;
			error = true;
			return false;
		}
		if (rgC2P208.isTagSelected(6)) {
			if (Util.esVacio(txtC2P208_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.208 (Especifique)");
				view = txtC2P208_ESP;
				error = true;
				return false;
			} else {
				if (txtC2P208_ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC2P208_ESP;
					error = true;
					return false;
				}
			}
		}
		
		if (Util.esVacio(rgC2P209)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P209");
			view = rgC2P209;
			error = true;
			return false;
		}
		
		if (rgC2P209.isTagSelected(1)) {		
			if (Util.esVacio(rgC2P209A)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P209A");
				view = rgC2P209A;
				error = true;
				return false;
			}
			
			
			if (rgC2P209A.isTagSelected(4)) {
				if (Util.esVacio(txtC2P209A_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.209A (Especifique)");
					view = txtC2P209A_ESP;
					error = true;
					return false;
				} else {
					if (txtC2P209A_ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC2P209A_ESP;
						error = true;
						return false;
					}
				}
			}
		}
		
		
		if (Util.esVacio(rgC2P210)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P210");
			view = rgC2P210;
			error = true;
			return false;
		}

		
		if (Util.getInt(caratula.p25) == 1 || Util.getInt(caratula.p25) == 2) {		
			if (Util.esVacio(rgC2P212)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P212");
				view = rgC2P212;
				error = true;
				return false;
			}
						
			if (!Util.esDiferente(bean.c2p202, 2,  3, 5, 6, 7) && rgC2P212.isTagSelected(3)) {
				ToastMessage.msgBox(getActivity(), "VERIFICAR: No corresponde el tipo de medidor con el lugar predominante del negocio",
						ToastMessage.MESSAGE_ERROR,
						ToastMessage.DURATION_LONG);
				//mensaje = "VERIFICAR: No corresponde el tipo de medidor con el lugar predominante del negocio";
				//view = rgC2P212;
				//error = true;
				//return false;
			}			
			
			if (Util.getInt(bean.c2p203_3)>2 && Util.getInt(bean.c2p203_3)!=99 && rgC2P212.isTagSelected(5)) {
				ToastMessage.msgBox(getActivity(), "VERIFICAR: No cuenta con energía eléctrica y tiene más de 2 pisos",
						ToastMessage.MESSAGE_ERROR,
						ToastMessage.DURATION_LONG);
				//	mensaje = "VERIFICAR: No cuenta con energía eléctrica y tiene más de 2 pisos";
				//view = rgC2P212;
				//error = true;
				//return false;
			}	
			
			if (rgC2P212.isTagSelected(4)) {
				if (Util.esVacio(txtC2P212_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.212 (Especifique)");
					view = txtC2P212_ESP;
					error = true;
					return false;
				}else{
					if (txtC2P212_ESP.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC2P212_ESP;
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
		bean = getCuestionarioService().getModuloii(
				App.getInstance().getEmpresa(),
				new Moduloii().getSecCap(getListFields(this, new String[]{"C2P202","C2P203_3"} )));
		if (bean == null) {
			bean = new Moduloii();
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
		FuncionP9();
		if (Util.getInt(caratula.p25) == 1 || Util.getInt(caratula.p25) == 2) {			
		}else{
			Util.cleanAndLockView(getActivity(),rgC2P212);
		}
		rgC2P208.requestFocus();
	}
	
	

	public void FuncionP9() {
		Integer valor = Integer.parseInt(rgC2P209.getTagSelected("0")
				.toString());
		if (valor == 1) {
			Util.lockView(getActivity(), false, rgC2P209A);
			rgC2P209A.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(),rgC2P209A);
			rgC2P210.requestFocus();
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

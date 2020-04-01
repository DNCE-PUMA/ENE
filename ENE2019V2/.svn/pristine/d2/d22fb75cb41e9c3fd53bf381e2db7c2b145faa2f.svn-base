package gob.inei.ene2019v2.fragment.ModI;

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

public class Mod_I_Fragment_002 extends FragmentForm {


	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC1P102;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC1P103;
	@FieldAnnotation(orderIndex = 3)
	public TextField txtC1P103_ESP;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC1P104;

	private Caratula caratula;
	private CuestionarioService cuestionarioService;
	private Moduloi bean;
	private LabelComponent lblTitulo, lblTitulo1;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_I_Fragment_002() {
	}

	public Mod_I_Fragment_002 parent(MasterActivity parent) {
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


		rgC1P102 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.c1c100_No).size(WRAP_CONTENT, 200)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP102");
		rgC1P103 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m1p003_1, R.string.c1c100m1p003_2,
				R.string.c1c100m1p003_3, R.string.c1c100m1p003_4,
				R.string.c1c100m1p003_5, R.string.c1c100m1p003_6,
				R.string.c1c100m1p003_7, R.string.c1c100m1p003_8, R.string.c1c100m1p003_9).size(WRAP_CONTENT, 600).orientation(
				ORIENTATION.VERTICAL);
		txtC1P103_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();
		rgC1P103.agregarEspecifique(8, txtC1P103_ESP);

		rgC1P104 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m1p004_1, R.string.c1c100m1p004_2,
				R.string.c1c100m1p004_3).size(WRAP_CONTENT, 550).orientation(
				ORIENTATION.VERTICAL);

		Filtros.setFiltro(txtC1P103_ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);

		q2 = createQuestionSection(R.string.c1c100m1p002, rgC1P102);
		q3 = createQuestionSection(R.string.c1c100m1p003, rgC1P103);
		q4 = createQuestionSection(R.string.c1c100m1p004, rgC1P104);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
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

//			if (
//					//2310
//				//	(Util.getInt(caratula.p26_a) == 2 || Util
//				//	.getInt(caratula.p26_a) == 1)&&
//					Util.getInt(caratula.p30) != 1
//					&& Util.getInt(caratula.p25) < 3) {
//			//	bean.c1p100 = bean.c1p100a = bean.c1p101a = bean.c1p101b = null;
//			//	bean.c1p100_esp = bean.c1p101a_esp = null;
//				if (!getCuestionarioService().saveOrUpdate(
//						bean,
//						bean.getSecCap(getListFields(this, new String[] {
//								"C1P100", "C1P100_ESP", "C1P100A",
//								"C1P100A_ESP", "C1P101A", "C1P101A_ESP",
//								"C1P101B", "C1P101B_ESP" })))) {
//					ToastMessage.msgBox(this.getActivity(),
//							"Los datos no se guardaron",
//							ToastMessage.MESSAGE_ERROR,
//							ToastMessage.DURATION_LONG);
//				}
//			} else {

				if (!getCuestionarioService().saveOrUpdate(bean,
						bean.getSecCap(getListFields(this)))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
		//	}
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
//		if (!Util.esDiferente(caratula.p25, 1)
//				|| !Util.esDiferente(caratula.p25, 2)) {

//2310		
//			if (!Util.esDiferente(bean.c1p101a, 1) ||  !Util.esDiferente(bean.c1p101b, 1)) {
//				if (Util.esVacio(rgC1P101C)) {
//					mensaje = pregunta_no_vacia.replace("$",
//							"La pregunta P101C");
//					view = rgC1P101C;
//					return !(error = true);
//				}
//
//				if (rgC1P101C.isTagSelected(8)) {
//					if (Util.esVacio(txtC1P101C_ESP)) {
//						mensaje = pregunta_no_vacia.replace("$",
//								"La Preg.101B (Especifique)");
//						view = txtC1P101C_ESP;
//						return !(error = true);
//					} else {
//						if (txtC1P101C_ESP.getText().length() < 3) {
//							mensaje = "Ingrese la información correcta";
//							view = txtC1P101C_ESP;
//							error = true;
//							return false;
//						}
//					}
//				}
//			}

			if (Util.esVacio(rgC1P102)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P102");
				view = rgC1P102;
				return !(error = true);
			}

			if (rgC1P102.isTagSelected(1)) {
				if (Util.esVacio(rgC1P103)) {
					mensaje = pregunta_no_vacia
							.replace("$", "La pregunta P103");
					view = rgC1P103;
					return !(error = true);
				}
				if (rgC1P103.isTagSelected(9)) {
					if (Util.esVacio(txtC1P103_ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.103 (Especifique)");
						view = txtC1P103_ESP;
						return !(error = true);
					} else {
						if (txtC1P103_ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC1P103_ESP;
							error = true;
							return false;
						}
					}

				}
			}
			if (Util.esVacio(rgC1P104)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P104");
				view = rgC1P104;
				return !(error = true);
			}

	//	}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloi(
				App.getInstance().getEmpresa(),
				new Moduloi().getSecCap(getListFields(this, new String[] {
						"C1P100", "C1P100A", "C1P101A", "C1P101B" })));
		
		if (bean == null) {
			bean = new Moduloi();
			bean.id = App.getInstance().getEmpresa().id;
		}
		caratula = App.getInstance().getEmpresa();
		if (caratula == null) {
			caratula = new Caratula();
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {

		rgC1P102.requestFocus();
		Util.lockView(this.getActivity(), false, rgC1P102, rgC1P103, rgC1P104);

		FuncionP102();
		rgC1P102.requestFocus();

	}

	public void FuncionP102() {
		Integer valor = Integer.parseInt(rgC1P102.getTagSelected("0").toString());
		if (valor == 2) {
			Util.cleanAndLockView(getActivity(), rgC1P103);
			rgC1P104.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC1P103);
			rgC1P103.requestFocus();
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

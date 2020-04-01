package gob.inei.ene2019v2.fragment.ModII;

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
import gob.inei.ene2019v2.model.Moduloii;
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

public class Mod_II_Fragment_004 extends FragmentForm {


	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC2P217;

	private CuestionarioService cuestionarioService;
	private Moduloii bean;
	private LabelComponent lblTitulo, lblNota, lblHora;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7;
	private GridComponent grEspe, grhora;

	public Mod_II_Fragment_004() {
	}

	public Mod_II_Fragment_004 parent(MasterActivity parent) {
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

		lblNota = new LabelComponent(this.getActivity())
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod02_nota).textSize(17).alinearIzquierda()
				.negrita().colorFondo(R.color.amarillo);

		lblHora = new LabelComponent(this.getActivity())
				.size(altoComponente, 200).negrita().centrar()
				.text(R.string.mod02_Numhoras).textSize(16);

	
		rgC2P217 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p017_1, R.string.c1c100m2p017_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
	
		q5 = createQuestionSection(R.string.c1c100m2p017, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P217);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q5);

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
		Log.e("ACCCCCCCCCCCCCCCCA", "  ACC "+bean.c2p217);
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

	//2310
//		if (!Util.esDiferente(bean.c2p211, 1)
//				&& !Util.esDiferente(bean.c2p213, 1)) {
//
//			if (!chbC2P214_1.isChecked() && !chbC2P214_2.isChecked()
//					&& !chbC2P214_3.isChecked() && !chbC2P214_4.isChecked()
//					&& !chbC2P214_5.isChecked() && !chbC2P214_6.isChecked()
//					&& !chbC2P214_7.isChecked() && !chbC2P214_8.isChecked()) {
//				mensaje = "DEBE SELECCIONAR AL MENOS UNA ALTERNATIVA EN P214";
//				view = chbC2P214_1;
//				error = true;
//				return false;
//			}
//
//			if (chbC2P214_8.isChecked()) {
//				if (Util.esVacio(txtC2P214_8ESP)) {
//					mensaje = pregunta_no_vacia.replace("$",
//							"La Preg.214 (Especifique)");
//					view = txtC2P214_8ESP;
//					error = true;
//					return false;
//				} else {
//					if (txtC2P214_8ESP.getText().length() < 3) {
//						mensaje = "Ingrese la informaci�n correcta";
//						view = txtC2P214_8ESP;
//						error = true;
//						return false;
//					}
//				}
//			}
//
//			if (chbC2P214_1.isChecked() || chbC2P214_2.isChecked()) {
//				if (Util.esVacio(txtC2P215)) {
//					mensaje = pregunta_no_vacia
//							.replace("$", "La pregunta P215");
//					view = txtC2P215;
//					error = true;
//					return false;
//				}
//				
//				if (Util.getInt(txtC2P215 ) > 72 ) {
//					mensaje = "Verificar: Est� indicando que el �ltimo corte de electricidad dur� " + txtC2P215.getText().toString() + " horas ";
//					view = txtC2P215;
//					error = true;
//					return false;
//				}			
//				
//			}
//		}
//
//		if (!Util.esDiferente(bean.c2p211, 2)) {
//			if (Util.esVacio(rgC2P216)) {
//				mensaje = pregunta_no_vacia.replace("$", "La pregunta P216.");
//				view = rgC2P216;
//				error = true;
//				return false;
//			}
//		}

		if (Util.esVacio(rgC2P217)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P217");
			view = rgC2P217;
			error = true;
			return false;
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloii(
				App.getInstance().getEmpresa(),
				new Moduloii().getSecCap(getListFields(this, new String[] {
						/*"C2P211",*/"C2P212"/*, "C2P213"*/,"C2P217" })));
		Log.e("ACCCCCCCCCCCCCCCCA", "  ACC "+bean.c2p217);
		if (bean == null) {
			bean = new Moduloii();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {

		//2310
//		if (Util.getInt(bean.c2p211) == 2) {
//			Util.cleanAndLockView(getActivity(), chbC2P214_1, chbC2P214_2,
//					chbC2P214_3, chbC2P214_4, chbC2P214_5, chbC2P214_6,
//					chbC2P214_7, chbC2P214_8, txtC2P214_8ESP, txtC2P215);
//			Util.lockView(getActivity(), false, rgC2P216);
//			rgC2P216.requestFocus();
//
//		} else {
//			if (Util.getInt(bean.c2p213) == 2) {
//				Util.cleanAndLockView(getActivity(), chbC2P214_1, chbC2P214_2,
//						chbC2P214_3, chbC2P214_4, chbC2P214_5, chbC2P214_6,
//						chbC2P214_7, chbC2P214_8, txtC2P214_8ESP, txtC2P215,
//						rgC2P216);
//				rgC2P217.requestFocus();
//			} else {
//				Util.lockView(getActivity(), false, chbC2P214_1, chbC2P214_2,
//						chbC2P214_3, chbC2P214_4, chbC2P214_5, chbC2P214_6,
//						chbC2P214_7, chbC2P214_8);
//				FuncionP14Check();
//				FuncionP14_8Check();
//				chbC2P214_1.requestFocus();
//			}
//		}

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
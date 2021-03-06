package gob.inei.ene2019v2.fragment.ModIV;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
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
import gob.inei.ene2019v2.model.Moduloiv02;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.app.DownloadManager.Request;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_019 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC4P461;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC4P462;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC4P465;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgC4P466;

	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent grEspe1, grEspe2;
	private CuestionarioService cuestionarioService;
	private Moduloiv02 bean;
	private Caratula caratula;
	private LabelComponent lblTitulo, lblTitulo1, lblDesc;

	public Mod_IV_Fragment_019() {
	}

	public Mod_IV_Fragment_019 parent(MasterActivity parent) {
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
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.Capitulo04).textSize(20).centrar().negrita();

		lblDesc = new LabelComponent(getActivity())
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1c100m4Desc).textSize(17).centrar().negrita()
				.colorFondo(R.color.amarillo);

		rgC4P461 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p461_1, R.string.c1c100m4p461_2,
				R.string.c1c100m4p461_3, R.string.c1c100m4p461_4).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.VERTICAL);
		rgC4P462 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p462_1, R.string.c1c100m4p462_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);

//		chbC4P464_1 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464_1, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464_2 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464_2, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464_3 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464_3, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464_4 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464_4, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464_5 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464_5, "1:0").size(WRAP_CONTENT, 550);

//		chbC4P464_6 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464_6, "1:0").size(LayoutParams.WRAP_CONTENT,
//				140).callback("FuncionCheck");
//		txtC4P464_6ESP = new TextField(this.getActivity(), false)
//				.size(altoComponente, 410).hint(R.string.especifique)
//				.soloTextoNumero();
//		rgC4P464A = new RadioGroupOtherField(this.getActivity(),
//				R.string.c1c100m4p465_1, R.string.c1c100m4p465_2)
//				.size(WRAP_CONTENT, WRAP_CONTENT)
//				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP464A");

//		chbC4P464B_1 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464B1, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464B_2 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464B2, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464B_3 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464B3, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464B_4 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464B4, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464B_5 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464B5, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464B_6 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464B6, "1:0").size(WRAP_CONTENT, 550);
//		chbC4P464B_7 = new CheckBoxField(this.getActivity(),
//				R.string.c1c100m4p464B7, "1:0").size(LayoutParams.WRAP_CONTENT,
//				140).callback("Funcion464BCheck");
//		txtC4P464B_7ESP = new TextField(this.getActivity(), false)
//				.size(altoComponente, 410).hint(R.string.especifique)
//				.soloTextoNumero();

		rgC4P465 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p465_1, R.string.c1c100m4p465_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);

		rgC4P466 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m4p466_1, R.string.c1c100m4p466_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);

//		grEspe1 = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
//		grEspe1.addComponent(chbC4P464_6);
//		grEspe1.addComponent(txtC4P464_6ESP);
//
//		grEspe2 = new GridComponent(this.getActivity(), Gravity.CENTER, 2, 0);
//		grEspe2.addComponent(chbC4P464B_7);
//		grEspe2.addComponent(txtC4P464B_7ESP);
//
//		Filtros.setFiltro(txtC4P464_6ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
		q1 = createQuestionSection(R.string.c1c100m4p461, rgC4P461);
		q2 = createQuestionSection(R.string.c1c100m4p462, rgC4P462);
//		q4 = createQuestionSection(R.string.c1c100m4p464, chbC4P464_1,
//				chbC4P464_2, chbC4P464_3, chbC4P464_4, chbC4P464_5,
//				grEspe1.component());
//		q5 = createQuestionSection(R.string.c1c100m4p464A, rgC4P464A);
//		q6 = createQuestionSection(R.string.c1c100m4p464B, chbC4P464B_1,
//				chbC4P464B_2, chbC4P464B_3, chbC4P464B_4, chbC4P464B_5,
//				chbC4P464B_6, grEspe2.component());
		q7 = createQuestionSection(lblDesc);
		q8 = createQuestionSection(R.string.c1c100m4p465, rgC4P465);
		q9 = createQuestionSection(R.string.c1c100m4p466, rgC4P466);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
//		form.addView(q4);
//		form.addView(q5);
//		form.addView(q6);
		form.addView(q7);
		form.addView(q8);
		form.addView(q9);
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

		if (Util.getInt(bean.c4p456) == 1) {
			if (Util.esVacio(rgC4P461)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P461");
				view = rgC4P461;
				error = true;
				return false;
			}
			if (Util.esVacio(rgC4P462)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P462");
				view = rgC4P462;
				error = true;
				return false;
			}

			// if (rgC4P463.isTagSelected(1)) {
//			if (!chbC4P464_1.isChecked() && !chbC4P464_2.isChecked()
//					&& !chbC4P464_3.isChecked() && !chbC4P464_4.isChecked()
//					&& !chbC4P464_5.isChecked() && !chbC4P464_6.isChecked()) {
//				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P464";
//				view = chbC4P464_1;
//				error = true;
//				return false;
//			}
//			if (chbC4P464_6.isChecked()) {
//				if (Util.esVacio(txtC4P464_6ESP)) {
//					mensaje = pregunta_no_vacia.replace("$",
//							"La Preg.464 (Especifique)");
//					view = txtC4P464_6ESP;
//					error = true;
//					return false;
//				} else {
//					if (txtC4P464_6ESP.getText().length() < 3) {
//						mensaje = "Ingrese la información correcta";
//						view = txtC4P464_6ESP;
//						error = true;
//						return false;
//					}
//				}
//			}
			// }

			// if (rgC4P463.isTagSelected(2)) {
//			if (Util.esVacio(rgC4P464A)) {
//				mensaje = pregunta_no_vacia.replace("$", "La pregunta P464A");
//				view = rgC4P464A;
//				error = true;
//				return false;
//			}

//			if (rgC4P464A.isTagSelected(2)) {
//				if (!chbC4P464B_1.isChecked() && !chbC4P464B_2.isChecked()
//						&& !chbC4P464B_3.isChecked()
//						&& !chbC4P464B_4.isChecked()
//						&& !chbC4P464B_5.isChecked()
//						&& !chbC4P464B_6.isChecked()
//						&& !chbC4P464B_7.isChecked()) {
//					mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P464B";
//					view = chbC4P464B_1;
//					error = true;
//					return false;
//				}
//				if (chbC4P464B_7.isChecked()) {
//					if (Util.esVacio(txtC4P464B_7ESP)) {
//						mensaje = pregunta_no_vacia.replace("$",
//								"La Preg.464B (Especifique)");
//						view = txtC4P464B_7ESP;
//						error = true;
//						return false;
//					} else {
//						if (txtC4P464B_7ESP.getText().length() < 3) {
//							mensaje = "Ingrese la información correcta";
//							view = txtC4P464B_7ESP;
//							error = true;
//							return false;
//						}
//					}
//				}
//			}

			// }
		}
		if (Util.getInt(caratula.p25) < 3) {
			if (Util.esVacio(rgC4P465)) {
				mensaje = pregunta_no_vacia
						.replace("$", "La pregunta P465");
				view = rgC4P465;
				error = true;
				return false;
			}
			if (Util.esVacio(rgC4P466)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P466");
				view = rgC4P466;
				error = true;
				return false;
			}
		}
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloiv02(
				App.getInstance().getEmpresa(),
				new Moduloiv02().getSecCap(getListFields(this,
						new String[] { "C4P456" })));
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
//		FuncionP464A();
//		FuncionCheck();
//		Funcion464BCheck();
		if (Util.getInt(bean.c4p456) == 2) {
			Util.cleanAndLockView(getActivity(), rgC4P461, rgC4P462/*,
					chbC4P464B_1, chbC4P464B_2, chbC4P464B_3, chbC4P464B_4,
					chbC4P464B_5, chbC4P464B_6, chbC4P464B_7, rgC4P464A,
					chbC4P464_1, chbC4P464_2, chbC4P464_3, chbC4P464_4,
					chbC4P464_5, chbC4P464_6*/);
			rgC4P465.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC4P461, rgC4P462/*,
					chbC4P464B_1, chbC4P464B_2, chbC4P464B_3, chbC4P464B_4,
					chbC4P464B_5, chbC4P464B_6, chbC4P464B_7, rgC4P464A,
					chbC4P464_1, chbC4P464_2, chbC4P464_3, chbC4P464_4,
					chbC4P464_5, chbC4P464_6*/);
			rgC4P461.requestFocus();
		}
		FuncionP25();

	}

//	public void FuncionP464A() {
//		Integer valor = Integer.parseInt(rgC4P464A.getTagSelected("0")
//				.toString());
//		Log.e("VALOR ", "" + valor);
//		if (valor == 2) {
//			Util.lockView(getActivity(), false, chbC4P464B_1, chbC4P464B_2,
//					chbC4P464B_3, chbC4P464B_4, chbC4P464B_5, chbC4P464B_6,
//					chbC4P464B_7);
//			chbC4P464B_1.requestFocus();
//		} else {
//			Util.cleanAndLockView(getActivity(), chbC4P464B_1, chbC4P464B_2,
//					chbC4P464B_3, chbC4P464B_4, chbC4P464B_5, chbC4P464B_6,
//					chbC4P464B_7, txtC4P464B_7ESP);
//			if (Util.getInt(caratula.p25) < 3) {
//				rgC4P465.requestFocus();
//			}
//		}
//	}

	public void FuncionP25() {
		if (Util.getInt(caratula.p25) > 2) {
			Util.cleanAndLockView(getActivity(), rgC4P465, rgC4P466);
		} else if (Util.getInt(caratula.p25) < 3) {
			Util.lockView(getActivity(), false, rgC4P465, rgC4P466);
		}
	}

//	public void FuncionCheck() {
//		if (!chbC4P464_6.isChecked()) {
//			Util.cleanAndLockView(getActivity(), txtC4P464_6ESP);
//		} else {
//			Util.lockView(getActivity(), false, txtC4P464_6ESP);
//			txtC4P464_6ESP.requestFocus();
//		}
//	}

//	public void Funcion464BCheck() {
//		if (!chbC4P464B_7.isChecked()) {
//			Util.cleanAndLockView(getActivity(), txtC4P464B_7ESP);
//		} else {
//			Util.lockView(getActivity(), false, txtC4P464B_7ESP);
//			txtC4P464B_7ESP.requestFocus();
//		}
//	}

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

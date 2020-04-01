package gob.inei.ene2019v2.fragment;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextBoxField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Calculo;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
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

public class Caratula_Fragment_004 extends FragmentForm implements Respondible {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgP21;
	@FieldAnnotation(orderIndex = 2)
	public TextField txtP21_ESP;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgP22;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgP23_1;
	@FieldAnnotation(orderIndex = 5)
	public IntegerField txtP23A_1;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgP23_2;
	@FieldAnnotation(orderIndex = 7)
	public IntegerField txtP23A_2;
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgP23_3;
	@FieldAnnotation(orderIndex = 9)
	public IntegerField txtP23A_3;
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgP23_4;
	@FieldAnnotation(orderIndex = 11)
	public IntegerField txtP23A_4;
	@FieldAnnotation(orderIndex = 12)
	public RadioGroupOtherField rgP23_5;
	@FieldAnnotation(orderIndex = 13)
	public IntegerField txtP23A_5;
	@FieldAnnotation(orderIndex = 14)
	public RadioGroupOtherField rgP23_6;
	@FieldAnnotation(orderIndex = 15)
	public TextField txtP23_6ESP;
	@FieldAnnotation(orderIndex = 16)
	public IntegerField txtP23A_6;
	@FieldAnnotation(orderIndex = 17)
	public IntegerField txtP23A_TOTAL;

	private CuestionarioService cuestionarioService;
	private Caratula bean;
	private LabelComponent lblTitulo;
	private GridComponent2 grd1;
	private DialogComponent dc;

	public Caratula_Fragment_004() {
	}

	public Caratula_Fragment_004 parent(MasterActivity parent) {
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
		confSumatorias();
		enlazarCajas();
		listening();

		return rootView;
	}

	private void confSumatorias() {
		Calculo<IntegerField> op1 = new Calculo<IntegerField>(this,
				txtP23A_TOTAL, 0, 0, Util.getListList(txtP23A_1, txtP23A_2,
						txtP23A_3, txtP23A_4,txtP23A_5, txtP23A_6));
		op1.setConfOperacion(true, true);
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c1caratulatit1).textSize(21).centrar().negrita();

		rgP21 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p11_1, R.string.c1c100p11_2,
				R.string.c1c100p11_3, R.string.c1c100p11_4,
				R.string.c1c100p11_5, R.string.c1c100p11_6,
				R.string.c1c100p11_7).size(WRAP_CONTENT, 600).orientation(
				ORIENTATION.VERTICAL);
		txtP21_ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 450).soloTextoNumero().hint(R.string.especifique);
		rgP21.agregarEspecifique(6, txtP21_ESP);
		rgP22 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p12_1, R.string.c1c100p12_2).size(WRAP_CONTENT,
				WRAP_CONTENT).callback("onP13ChangeValue");
		rgP23_1 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p13_1_1, R.string.c1c100p13_1_2)
				.size(WRAP_CONTENT, 170).centrar().callback("onP13ChangeValue");
		rgP23_2 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p13_2_1, R.string.c1c100p13_2_2)
				.size(WRAP_CONTENT, 170).centrar().callback("onP13ChangeValue");
		rgP23_3 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p13_3_1, R.string.c1c100p13_3_2)
				.size(WRAP_CONTENT, 170).centrar().callback("onP13ChangeValue");
		rgP23_4 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p13_4_1, R.string.c1c100p13_4_2)
				.size(WRAP_CONTENT, 170).centrar().callback("onP13ChangeValue");
		rgP23_5 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p13_5_1, R.string.c1c100p13_5_2)
				.size(WRAP_CONTENT, 170).centrar().callback("onP13ChangeValue");
		rgP23_6 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p13_5_1, R.string.c1c100p13_5_2)
				.size(WRAP_CONTENT, 170).centrar().callback("onP13ChangeValue");
		txtP23_6ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 273).soloTextoNumero().hint(R.string.especifique);
		txtP23A_1 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtP23A_2 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtP23A_3 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtP23A_4 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtP23A_5 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtP23A_6 = new IntegerField(this.getActivity(), false).size(
				altoComponente, 100).centrar();
		txtP23A_TOTAL = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 120).centrar().readOnly().negrita();

		LabelComponent lblt1 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p13_1t).size(altoComponente, 360)
				.centrar();
		LabelComponent lblt2 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p13_2t).size(altoComponente, 220)
				.centrar();
		LabelComponent lblt3 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p13_3t).size(altoComponente, 150)
				.centrar();

		LabelComponent lbl1 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c1c100p13a_1).size(altoComponente, 250);
		LabelComponent lbl2 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c1c100p13a_2).size(altoComponente, 250);
		LabelComponent lbl3 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c1c100p13a_3).size(altoComponente, 250);
		LabelComponent lbl4 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c1c100p13a_4).size(altoComponente, 250);
		LabelComponent lbl5 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c1c100p13a_5).size(altoComponente, 250);
		LabelComponent lbl6 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c1c100p13a_6).size(altoComponente, 80);
		LabelComponent lbl7 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p13a_total).size(altoComponente, 250)
				.centrar();

		grd1 = new GridComponent2(this.getActivity(), 3);
		grd1.addComponent(lblt1);
		grd1.addComponent(lblt2);
		grd1.addComponent(lblt3);
		grd1.addComponent(lbl1);
		grd1.addComponent(rgP23_1);
		grd1.addComponent(txtP23A_1);
		grd1.addComponent(lbl2);
		grd1.addComponent(rgP23_2);
		grd1.addComponent(txtP23A_2);
		grd1.addComponent(lbl3);
		grd1.addComponent(rgP23_3);
		grd1.addComponent(txtP23A_3);
		grd1.addComponent(lbl4);
		grd1.addComponent(rgP23_4);
		grd1.addComponent(txtP23A_4);
		grd1.addComponent(lbl5);
		grd1.addComponent(rgP23_5);
		grd1.addComponent(txtP23A_5);
		grd1.addComponent(createLy(LinearLayout.HORIZONTAL, Gravity.LEFT, lbl6,
				txtP23_6ESP));
		grd1.addComponent(rgP23_6);
		grd1.addComponent(txtP23A_6);
		grd1.addComponent(lbl7, 2);
		grd1.addComponent(txtP23A_TOTAL);

		Filtros.setFiltro(txtP21_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtP23_6ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtP23A_1, Filtros.TIPO.NUMBER, 3, -1, null, 1, 998,999);
		Filtros.setFiltro(txtP23A_2, Filtros.TIPO.NUMBER, 3, -1, null, 1, 998,999);
		Filtros.setFiltro(txtP23A_3, Filtros.TIPO.NUMBER, 3, -1, null, 1, 998,999);
		Filtros.setFiltro(txtP23A_4, Filtros.TIPO.NUMBER, 3, -1, null, 1, 998,999);
		Filtros.setFiltro(txtP23A_5, Filtros.TIPO.NUMBER, 3, -1, null, 1, 998,999);
		Filtros.setFiltro(txtP23A_6, Filtros.TIPO.NUMBER, 3, -1, null, 1, 998,999);
		Filtros.setFiltro(txtP23A_TOTAL, Filtros.TIPO.NUMBER, 4, -1, null, 1,9998);
	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */

		LinearLayout q0 = createQuestionSection(lblTitulo);

		LinearLayout q1 = createQuestionSection(R.string.c1c100p11, rgP21);
		LinearLayout q2 = createQuestionSection(R.string.c1c100p12, rgP22);
		LinearLayout q3 = createQuestionSection(R.string.c1c100p13,
				grd1.component());

		// ///////////////////////////
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		/* Aca agregamos las preguntas a la pantalla */
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

//		int _msp = 0;
//		if ((_msp = validaData()) != 0) {
//			dc = new DialogComponent(getActivity(), this, TIPO_DIALOGO.YES_NO,
//					getResources().getString(R.string.app_name), getMsg(_msp));
//			dc.put("clave", _msp);
//			dc.showDialog();
//			return false;
//		} else {
//			return savePag(-1);
//		}
		
		return savePag(1);
	}

//	private int validaData() {
//		if (rgP22.isTagSelected(2) && bean.p24_ccdd != null) {
//			return 1;
//		}
//		return 0;
//	}

	private String getMsg(int cod) {
		switch (cod) {
		case 1:
			return "Ya ha registrado Informacion en la Preg. 24"
					+ "; La informacion de esta Preg. 24 sera eliminada. "
					+ "Esta seguro que desea continuar?";
		default:
			return "";
		}
	}

	private boolean savePag(Integer cod) {
		uiToEntity(bean);
		try {
			if (!getCuestionarioService().saveOrUpdate(bean,
					bean.getSecCap(getListFields(this/*, getExtras(cod)*/)))) {
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

//	private String[] getExtras(int cod) {
//		switch (cod) {
//		case 1:
//			return new String[] { "P24_CCDD", "P24_DD", "P24_CCPP", "P24_PP",
//					"P24_CCDI", "P24_DI", "P24_TIPO", "P24_TIPO_ESP" };
//		default:
//			return null;
//		}
//	}
//
//	private void clearData(int cod) {
//		switch (cod) {
//		case 1:
//			bean.p24_ccdd = bean.p24_dd = bean.p24_ccpp = bean.p24_pp = bean.p24_ccdi = bean.p24_di = bean.p24_tipo_esp = null;
//			bean.p24_tipo = null;
//			break;
//		default:
//			break;
//		}
//	}

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

		if (Util.esVacio(rgP21)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta 21;");
			view = rgP21;
			return !(error = true);
		}
		if (bean.ruc != null
				&& (rgP21.isTagSelectedBetween(2, 6) && (bean.ruc
						.startsWith("10") || bean.ruc.startsWith("15") || bean.ruc
							.startsWith("17")))
				|| (rgP21.isTagSelected(1) && bean.ruc.startsWith("20"))) {
			mensaje = "Error: N\u00B0 de RUC no guarda relación con la organización de la empresa";
			view = rgP21;
			return !(error = true);
		}
		if (rgP21.isTagSelected(7) && Util.esVacio(txtP21_ESP)) {
			mensaje = pregunta_no_vacia.replace("$",
					"La Preg.21 (Especifique)");
			view = txtP21_ESP;
			return !(error = true);
		}

		if (rgP21.isTagSelected(7)) {
			if (txtP21_ESP.getText().toString().trim().length() < 3) {
				mensaje = "Ingrese valor correcto";
				view = txtP21_ESP;
				return !(error = true);
			}
		}
		
		if (Util.esVacio(rgP22)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta 22;");
			view = rgP22;
			return !(error = true);
		}
		if (rgP22.isTagSelected(2)) {
			if (!validarP3(rgP23_1, txtP23A_1, "La pregunta 23.1;"))
				return false;
			if (!validarP3(rgP23_2, txtP23A_2, "La pregunta 23.2;"))
				return false;
			if (!validarP3(rgP23_3, txtP23A_3, "La pregunta 23.3;"))
				return false;
			if (!validarP3(rgP23_4, txtP23A_4, "La pregunta 23.4;"))
				return false;
			if (!validarP3(rgP23_5, txtP23A_5, "La pregunta 23.5;"))
				return false;
			if (!validarP3(rgP23_6, txtP23A_6, "La pregunta 23.6;"))
				return false;
			if (rgP23_6.isTagSelected(1) && Util.esVacio(txtP23_6ESP)) {
				mensaje = pregunta_no_vacia.replace("$","La Preg23.6 (Especifique);");
				view = txtP23_6ESP;
				return !(error = true);
			}
			if (!Util.esVacio(txtP23_6ESP) && txtP23_6ESP.getText().length() < 3) {
				mensaje = "Ingrese la información correcta";
				view = txtP23_6ESP;
				return !(error = true);
			}
			if (Util.esVacio(txtP23A_TOTAL)) {
				mensaje = "Error: Ingrese con cuantos locales conto durante el 2016";
				view = rgP23_1;
				return !(error = true);
			}
			
			if (Util.getInt(txtP23A_TOTAL) != (Util.getInt(txtP23A_1)
					+ Util.getInt(txtP23A_2) + Util.getInt(txtP23A_3)
					+ Util.getInt(txtP23A_4) + Util.getInt(txtP23A_5))
					+ Util.getInt(txtP23A_6))
			{
				mensaje = "Error: No concuerda la suma de la cantidad de locales con el total";
				view = txtP23A_1;
				return !(error = true);
			}
			
			if(Util.getInt(txtP23A_TOTAL) <= 1)
			{
				mensaje = "Error: Total de locales debe ser mayor a 1";
				view = txtP23A_1;
				return !(error = true);
			}
		}	
			return true;
	}

	private boolean validarP3(RadioGroupOtherField rg, TextBoxField txt,
			String msg) {
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);

		if (Util.esVacio(rg)) {
			mensaje = pregunta_no_vacia.replace("$", msg);
			view = rg;
			return !(error = true);
		}
		if (rg.isTagSelected(1) && Util.esVacio(txt)) {
			mensaje = "Cantidad no puede estar vacio.";
			view = txt;
			return !(error = true);
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		// bean =
		// getCuestionarioService().getCaratula(App.getInstance().getEmpresa(),
		// new Caratula().getSecCap(getListFields(this, new String[]{"RUC"})));
		// if (bean == null) {
		// bean = new Caratula();
		// }
		// bean.id = App.getInstance().getEmpresa().id;
		bean = App.getInstance().getEmpresa();
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		if (rgP22.isTagSelected(1)) {
			lockP13(rgP22, rgP23_1, rgP23_2, rgP23_3, rgP23_4, rgP23_5,
					rgP23_6, txtP23A_1, txtP23A_2, txtP23A_3, txtP23A_4,
					txtP23A_5, txtP23A_6, txtP23_6ESP);
		} else {
			lockP13_1(rgP23_1, txtP23A_1);
			lockP13_1(rgP23_2, txtP23A_2);
			lockP13_1(rgP23_3, txtP23A_3);
			lockP13_1(rgP23_4, txtP23A_4);
			lockP13_1(rgP23_5, txtP23A_5);
			lockP13_1(rgP23_6, txtP23A_6, txtP23_6ESP);
		}
		rgP21.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public void onP13ChangeValue(FieldComponent component) {
		RadioGroupOtherField rg = (RadioGroupOtherField) component;
		if (rg.isPressed()) {
			if (rg.equals(rgP22))
				lockP13(rg, rgP23_1, rgP23_2, rgP23_3, rgP23_4, rgP23_5,
						rgP23_6, txtP23A_1, txtP23A_2, txtP23A_3, txtP23A_4,
						txtP23A_5, txtP23A_6, txtP23_6ESP);
			else if (rg.equals(rgP23_1))
				lockP13_1(rg, txtP23A_1);
			else if (rg.equals(rgP23_2))
				lockP13_1(rg, txtP23A_2);
			else if (rg.equals(rgP23_3))
				lockP13_1(rg, txtP23A_3);
			else if (rg.equals(rgP23_4))
				lockP13_1(rg, txtP23A_4);
			else if (rg.equals(rgP23_5))
				lockP13_1(rg, txtP23A_5);
			else if (rg.equals(rgP23_6))
				lockP13_1(rg, txtP23A_6, txtP23_6ESP);
			setNextFocusRequest(rg);
		}
	}

	private void lockP13(RadioGroupOtherField rg, View... views) {
		Integer val = rg.getTagSelectedInteger(-1);
		if (val != -1) {
			if (val == 1) {
				cleanAndLockView(views);
			} else {
				lockView(false, views);
			}
		}
	}

	private void lockP13_1(RadioGroupOtherField rg, View... views) {
		Integer val = rg.getTagSelectedInteger(-1);
		if (val != -1) {
			if (val == 2) {
				cleanAndLockView(views);
			} else {
				lockView(false, views);
			}
		}
	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAccept() {
		Integer cod = (Integer) dc.get("clave");
		if (cod != null) {
			switch (cod) {
			case 1:
//				clearData(cod);
				parent.nextFragment(parent.getCurPage() + 1);
				break;
			default:
				break;
			}
		}
	}
}

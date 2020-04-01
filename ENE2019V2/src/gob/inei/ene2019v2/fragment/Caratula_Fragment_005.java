package gob.inei.ene2019v2.fragment;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogComponent.TIPO_DIALOGO;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.SpinnerField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.model.Ubigeo;
import gob.inei.ene2019v2.service.CuestionarioService;
import gob.inei.ene2019v2.service.UbigeoService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Caratula_Fragment_005 extends FragmentForm implements Respondible {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgP24A;
	@FieldAnnotation(orderIndex = 2)
	public SpinnerField spnP24_CCDD;
	@FieldAnnotation(orderIndex = 3)
	public TextField txtP24_DD;
	@FieldAnnotation(orderIndex = 4)
	public SpinnerField spnP24_CCPP;
	@FieldAnnotation(orderIndex = 5)
	public TextField txtP24_PP;
	@FieldAnnotation(orderIndex = 6)
	public SpinnerField spnP24_CCDI;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtP24_DI;
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgP24_TIPO;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgTIPOVIAB;
	@FieldAnnotation(orderIndex = 10)
	public TextField txtNOMBREVIAB;
	@FieldAnnotation(orderIndex = 11)
	public TextField txtPUERTAB;
	@FieldAnnotation(orderIndex = 12)
	public TextField txtBLOCKB;
	@FieldAnnotation(orderIndex = 13)
	public TextField txtINTERIORB;
	@FieldAnnotation(orderIndex = 14)
	public TextField txtPISOB;
	@FieldAnnotation(orderIndex = 15)
	public TextField txtMANZANAB;
	@FieldAnnotation(orderIndex = 16)
	public TextField txtLOTEB;
	@FieldAnnotation(orderIndex = 17)
	public IntegerField txtKILOMETROB;
	@FieldAnnotation(orderIndex = 18)
	public TextField txtREFERENCIAB;
	@FieldAnnotation(orderIndex = 19)
	public RadioGroupOtherField rgP25;

	private UbigeoService ubigeoService;
	private CuestionarioService cuestionarioService;
	private Caratula bean;
	private LabelComponent lblTitulo;
	private GridComponent grid1;
	private GridComponent2 gridt ,gridd ,gridR, grid2;
	private DialogComponent dc;
	private Moduloi modi;
	private boolean flag;
	private boolean flag2;
	
	public Caratula_Fragment_005() {
	}

	public Caratula_Fragment_005 parent(MasterActivity parent) {
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
				.text(R.string.c1caratulatit1).textSize(21).centrar().negrita();
		rgP24A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p13_5_1, R.string.c1c100p13_5_2).size(altoComponente + 15,
				270).orientation(ORIENTATION.HORIZONTAL);
		txtP24_DD = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
		txtP24_PP = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
		txtP24_DI = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
		spnP24_CCDD = new SpinnerField(getActivity())
				.size(altoComponente + 15, 270)
				.callback("onDepartamentoChangeValue").keyString(); // .title(MyUtil.getVacio("CCDD"));
		Util.llenarItems(getActivity(), spnP24_CCDD, Util
				.getListObject(getUbigeoService().getDepartamentos("99")
						.toArray()), "DEPARTAMENTO", true);
		spnP24_CCPP = new SpinnerField(getActivity())
				.size(altoComponente + 15, 270)
				.callback("onProvinciaChangeValue").keyString(); // .title(MyUtil.getVacio("CCPP"));
		Util.llenarItems(getActivity(), spnP24_CCPP, new ArrayList<Object>(),
				"PROVINCIA", true);
		spnP24_CCDI = new SpinnerField(getActivity())
				.size(altoComponente + 15, 270)
				.callback("onDistritoChangeValue").keyString(); // .title(MyUtil.getVacio("CCDI"));
		Util.llenarItems(getActivity(), spnP24_CCDI, new ArrayList<Object>(),
				"DISTRITO", true);
		
		rgP24_TIPO = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p14_tipo_1, R.string.c1c100p14_tipo_2,
				R.string.c1c100p14_tipo_3, R.string.c1c100p14_tipo_4).size(220,
				500).orientation(ORIENTATION.VERTICAL);

		rgP25 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100p15_1, R.string.c1c100p15_2,
				R.string.c1c100p15_3, R.string.c1c100p15_4)
				.size(WRAP_CONTENT, 400).orientation(ORIENTATION.VERTICAL)
				.callback("onP15ChangeValue");
		LabelComponent lbl0 = new LabelComponent(getActivity(), App.ESTILO)
		.text(R.string.c1c100p14_dir).size(altoComponente, 250);
		LabelComponent lbl1 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p14_dd).size(altoComponente, 250);
		LabelComponent lbl2 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p14_pp).size(altoComponente, 250);
		LabelComponent lbl3 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p14_di).size(altoComponente, 250);

		grid1 = new GridComponent(getActivity(),2)
				.colorFondo(FragmentForm.COLOR_LINEA_SECCION_PREGUNTA);
		
		grid1.addComponent(lbl0);
		grid1.addComponent(rgP24A);
		grid1.addComponent(lbl1);
		grid1.addComponent(spnP24_CCDD);
		grid1.addComponent(lbl2);
		grid1.addComponent(spnP24_CCPP);
		grid1.addComponent(lbl3);
		grid1.addComponent(spnP24_CCDI);

		LabelComponent lbl4 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p14_tipo).size(altoComponente, 150);

		grid2 = new GridComponent2(getActivity(), 2);
		grid2.addComponent(lbl4);
		grid2.addComponent(rgP24_TIPO);
		
		rgTIPOVIAB = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100tipovia_1, R.string.c1c100tipovia_2,
				R.string.c1c100tipovia_3, R.string.c1c100tipovia_4,
				R.string.c1c100tipovia_5, R.string.c1c100tipovia_6).size(290,
				500).orientation(ORIENTATION.VERTICAL);
		// txtTIPOVIA_O = new TextField(this.getActivity(),
		// false).size(altoComponente, 350).hint(R.string.especifique);
		txtNOMBREVIAB = new TextField(this.getActivity(), false).size(
				altoComponente, 320);
		txtPUERTAB = new TextField(this.getActivity(), false).size(
				altoComponente, 200).soloTextoNumero();
		txtBLOCKB = new TextField(this.getActivity(), false).size(
				altoComponente, 200);
		txtINTERIORB = new TextField(this.getActivity(), false).size(
				altoComponente, 200);
		txtPISOB = new TextField(this.getActivity(), false).size(altoComponente,
				200);
		txtMANZANAB = new TextField(this.getActivity(), false).size(
				altoComponente, 200);
		txtLOTEB = new TextField(this.getActivity(), false).size(altoComponente,
				200);
		txtKILOMETROB = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).alinearIzquierda();
		
		
		LabelComponent lblTv = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100tipoviab).size(altoComponente, 245)
				.centrar();
		LabelComponent lblNv = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100nombrevia).size(altoComponente, 245)
				.centrar();

		gridt = new GridComponent2(getActivity(), 2);
		gridt.addComponent(lblTv);
		gridt.addComponent(rgTIPOVIAB);
		gridt.addComponent(lblNv);
		gridt.addComponent(txtNOMBREVIAB);

		LabelComponent lbl1x = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100puerta).size(altoComponente, 175);
		LabelComponent lbl2x = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100block).size(altoComponente, 175);
		LabelComponent lbl3x = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100interior).size(altoComponente, 175);
		LabelComponent lbl4x = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100piso).size(altoComponente, 175);
		LabelComponent lbl5x = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100manzana).size(altoComponente, 175);
		LabelComponent lbl6x = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100lote).size(altoComponente, 175);
		LabelComponent lbl7x = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100kilometro).size(altoComponente, 175);

		gridd = new GridComponent2(getActivity(), 2);
		gridd.addComponent(lbl1x);
		gridd.addComponent(txtPUERTAB);
		gridd.addComponent(lbl2x);
		gridd.addComponent(txtBLOCKB);
		gridd.addComponent(lbl3x);
		gridd.addComponent(txtINTERIORB);
		gridd.addComponent(lbl4x);
		gridd.addComponent(txtPISOB);
		gridd.addComponent(lbl5x);
		gridd.addComponent(txtMANZANAB);
		gridd.addComponent(lbl6x);
		gridd.addComponent(txtLOTEB);
		gridd.addComponent(lbl7x);
		gridd.addComponent(txtKILOMETROB);

		LabelComponent lblRef = new LabelComponent(getActivity(), App.ESTILO)
		.text(R.string.c1c100referenciab).size(altoComponente, 565);
		
		txtREFERENCIAB = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
		
		gridR = new GridComponent2(getActivity(), 1);
		gridR.addComponent(lblRef);
		gridR.addComponent(txtREFERENCIAB);
		
		Filtros.setFiltro(txtP24_DD, Filtros.TIPO.ALFA_U, 70, null);
		Filtros.setFiltro(txtP24_PP, Filtros.TIPO.ALFA_U, 70, null);
		Filtros.setFiltro(txtP24_DI, Filtros.TIPO.ALFA_U, 70, null);
	
		
		Filtros.setFiltro(txtNOMBREVIAB, Filtros.TIPO.ALFAN_U, 150, null);
//		Filtros.setFiltro(txtPUERTAB, Filtros.TIPO.ALFAN_U, 4, null);
		Filtros.setFiltro(txtPUERTAB, Filtros.TIPO.PATRON, 4, -1,null,-1,-1,-1,-1,-1,-1,-1, 
				"(^[0-9][A-Z]?)||(^[A-Z][0-9]?)||(^[A-Z][A-Z][0-9]?)||(^[0-9][0-9][A-Z]?)||(^[A-Z][A-Z][A-Z]?)||(^[0-9][0-9][0-9]?)"
				+ "||(^[A-Z][A-Z][A-Z][A-Z]?)||(^[0-9][0-9][0-9][0-9]?)||(^[A-Z][A-Z][A-Z][0-9]?)||(^[0-9][0-9][0-9][A-Z]?)");
		Filtros.setFiltro(txtBLOCKB, Filtros.TIPO.ALFAN_U, 4, null);
		Filtros.setFiltro(txtINTERIORB, Filtros.TIPO.ALFAN_U, 4, null);
		// Filtros.setFiltro(txtPISOB, Filtros.TIPO.ALFAN_U,2,null);
		Filtros.setFiltro(txtPISOB, Filtros.TIPO.PATRON, 2,
				Filtros.TIPO.ALFAN_U.ordinal(), null, -1, -1, -1, -1, -1, -1,
				-1,	"(^[1-9]?)||(^1[0-9]?)||(^2[0-9]?)||(^30?)||(A)||(S[1-3])||(M)");
		Filtros.setFiltro(txtMANZANAB, Filtros.TIPO.ALFAN_U, 3, null);
		Filtros.setFiltro(txtLOTEB, Filtros.TIPO.ALFAN_U, 3, null);
		Filtros.setFiltro(txtKILOMETROB, Filtros.TIPO.NUMBER, 4, -1, null, 1,5000);
		Filtros.setFiltro(txtREFERENCIAB, Filtros.TIPO.ALFAN_U, 300,  new char[]{'\n','.',',','+','-','*','/','=','(',')'});

	}

	@Override
	protected View createUI() {
		buildFields();

		LinearLayout q0 = createQuestionSection(lblTitulo);

		LinearLayout q1 = createQuestionSection(R.string.c1c100p14,grid1.component());
		LinearLayout q2 = createQuestionSection(grid2.component());
		
		LinearLayout q3 = createQuestionSection(gridt.component());
		LinearLayout q4 = createQuestionSection(gridd.component());	
		LinearLayout q5 = createQuestionSection(gridR.component());
		LinearLayout q6 = createQuestionSection(R.string.c1c100p15, rgP25);

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
		// uiToEntity(bean);
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

		int _msp = 0;
		if ((_msp = validaData()) != 0) {
			dc = new DialogComponent(getActivity(), this, TIPO_DIALOGO.YES_NO,
					getResources().getString(R.string.app_name), getMsg(_msp));
			dc.put("clave", _msp);
			dc.showDialog();
			return false;
		} else {
			return savePag(-1);
		}
	}
//2310
	private int validaData() {
		if ((rgP25.isTagSelected(3) || rgP25.isTagSelected(4)) && modi != null
			 	&& modi.c1p101a_1 != null) {
			return 1;
		}
		return 0;
	}

	private String getMsg(int cod) {
		switch (cod) {
		case 1:
			return "Ya ha registrado Informacion en la Preg. 1 del CAPÍTULO 100."
					+ "; La informacion de estas Preguntas serán eliminadas. "
					+ "Esta seguro que desea continuar?";
		default:
			return "";
		}
	}

	private boolean savePag(Integer cod) {
		uiToEntity(bean);

		if (spnP24_CCDD.getSelectedItemKey() != null) {
			bean.p24_dd = ((Ubigeo) spnP24_CCDD.getSelectedItem()).departamento;
		}
		if (spnP24_CCPP.getSelectedItemKey() != null) {
			bean.p24_pp = ((Ubigeo) spnP24_CCPP.getSelectedItem()).provincia;
		}
		if (spnP24_CCDI.getSelectedItemKey() != null) {
			bean.p24_di = ((Ubigeo) spnP24_CCDI.getSelectedItem()).distrito;
		}
		try {
			if (!getCuestionarioService().saveOrUpdate(bean,
					bean.getSecCap(getListFields(this)))) {
				ToastMessage.msgBox(this.getActivity(),
						"Los datos no se guardaron",
						ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
			} else {
				if (cod > 0) {
					getCuestionarioService().saveOrUpdate(modi,
							modi.getSecCap(Arrays.asList(getExtras(cod))));
				}
			}
		} catch (SQLException e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
			return false;
		}

		return true;
	}


	
	private String[] getExtras(int cod) {
		switch (cod) {
		case 1:
			return new String[] { "C1P101A_1", "C1P101A_8ESP", "C1P101B_1",
					"C1P101B_2", "C1P101B_3", "C1P101B_4", "C1P101B_5",
					"C1P101B_6", "C1P101B_7", "C1P101B_8", "C1P101B_9",
					"C1P101B_10", "C1P101B_11", "C1P101B_11ESP", "C1P102",
					"C1P103", "C1P103_ESP", "C1P104", "C1P105", "C1P106_1",
					"C1P106_2", "C1P106_3", "C1P106_4", "C1P106_5", "C1P106_6",
					"C1P106_7", "C1P106_8", "C1P106_10", "C1P106_10ESP" };
		default:
			return null;
		}
	}
	

	private void clearData(int cod) {
		switch (cod) {
		case 1:
			//2310
			modi.c1p101a_1 = modi.c1p101b_1 = modi.c1p101b_2 = modi.c1p101b_3 = modi.c1p101b_4 = modi.c1p101b_5 = modi.c1p101b_6 = modi.c1p101b_7 = modi.c1p101b_8 = modi.c1p101b_9 = modi.c1p101b_10 = modi.c1p101b_11 = modi.c1p102 = modi.c1p103 = modi.c1p104 = modi.c1p105 = modi.c1p106_1 = modi.c1p106_2 = modi.c1p106_3 = modi.c1p106_4 = modi.c1p106_5 = modi.c1p106_6 = modi.c1p106_7 = modi.c1p106_8  = modi.c1p106_9 = null;
			modi.c1p101a_8esp = modi.c1p101b_11esp = modi.c1p103_esp = modi.c1p106_esp = null;
			break;
		default:
			break;
		}
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

		// if(Util.getInt(bean.p22) == 1){
		if (Util.getInt(bean.p22) == 2) {
			if (spnP24_CCDD.getSelectedItemKey() == null) {
				mensaje = pregunta_no_vacia.replace("$", "Departamento;");
				view = spnP24_CCDD;
				return !(error = true);
			}
			if (spnP24_CCPP.getSelectedItemKey() == null) {
				mensaje = pregunta_no_vacia.replace("$", "Provincia;");
				view = spnP24_CCPP;
				return !(error = true);
			}
			if (spnP24_CCDI.getSelectedItemKey() == null) {
				mensaje = pregunta_no_vacia.replace("$", "Distrito;");
				view = spnP24_CCDI;
				return !(error = true);
			}
		
		
		if (Util.esVacio(rgP24_TIPO)) {
			mensaje = pregunta_no_vacia.replace("$", "Tipo;");
			view = rgP24_TIPO;
			return !(error = true);
		}



		if (Util.esVacio(rgTIPOVIAB)) {
			mensaje = pregunta_no_vacia.replace("$", "Tipo de v\u00eda;");
			view = rgTIPOVIAB;
			return !(error = true);
		}
		// if(rgTIPOVIAB.isTagSelected(6) && Util.esVacio(txtTIPOVIA_O)){
		// mensaje = especifique_no_vacio;
		// view = txtTIPOVIA_O;
		// return !(error = true);
		// }
		if (Util.esVacio(txtNOMBREVIAB)) {
			mensaje = pregunta_no_vacia.replace("$", "Nombre de v\u00eda;");
			view = txtNOMBREVIAB;
			return !(error = true);
		}
		if (Util.esVacio(txtPUERTAB)) {
			mensaje = pregunta_no_vacia.replace("$", "N\u00B0 de Puerta;");
			view = txtPUERTAB;
			return !(error = true);
		}
		
		if (txtPUERTAB.getCurrentTextColor() == Filtros.ERRORCOLOR) {
			mensaje = "Inconsistencia en Datos de Puerta.";
			view = txtPUERTAB;
			return !(error = true);
		}
		
		
		if (Util.esVacio(txtPISOB)) {
			mensaje = pregunta_no_vacia.replace("$", "Piso;");
			view = txtPISOB;
			return !(error = true);
		}
		if (txtPISOB.getCurrentTextColor() == Filtros.ERRORCOLOR) {
			mensaje = "Inconsistencia en el valor de la preg. Piso.";
			view = txtPISOB;
			return !(error = true);
		}
		if ((!Util.esVacio(txtMANZANAB) && Util.esVacio(txtLOTEB))
				|| !Util.esVacio(txtLOTEB) && Util.esVacio(txtMANZANAB)) {
			mensaje = "Error: Debe existir información en lote y manzana";
			view = txtMANZANAB;
			return !(error = true);
		}
		if (rgTIPOVIAB.isTagSelected(5) && Util.esVacio(txtKILOMETROB)) {
			mensaje = "Debe haber información en Kil\u00f3metro";
			view = txtKILOMETROB;
			return !(error = true);
		}
		
		if (Util.esVacio(txtREFERENCIAB)) {
			mensaje = pregunta_no_vacia.replace("$",
					"Referencia de la direcci\u00f3n;");
			view = txtREFERENCIAB;
			return !(error = true);
		}
		String text = Util.getText(txtREFERENCIAB.getText());
		if (text.trim().length() == Util.contDigits(text)
				&& Util.sumDigits(text) == 0) {
			mensaje = "Error: Debe ingresar información correcta";
			view = txtREFERENCIAB;
			return !(error = true);
		}
		if (text.trim().length() < 4) {
			mensaje = "Error: Debe ingresar referencia correcta";
			view = txtREFERENCIAB;
			return !(error = true);
		}

				if ((rgP24_TIPO.isTagSelected(1) && Util.getInt(bean.p23_2) == 2)
					||	(rgP24_TIPO.isTagSelected(2) && Util.getInt(bean.p23_1) == 2)
					||	(rgP24_TIPO.isTagSelected(3) && ( Util.getInt(bean.p23_4) == 2 &&  Util.getInt(bean.p23_5) == 2 ) )
					||	(rgP24_TIPO.isTagSelected(4) && Util.getInt(bean.p23_3) == 2)) {
					mensaje = "Error: No corresponde a los tipos de locales seleccionados en la P23";
					view = rgP24_TIPO;
					return !(error = true);
				}	
				
//			if ((rgP24_TIPO.isTagSelected(2) && Util.getInt(bean.p23a_1) == 0)
//					|| (rgP24_TIPO.isTagSelected(1) && Util.getInt(bean.p23a_2) == 0)
//					|| (rgP24_TIPO.isTagSelected(4) && Util.getInt(bean.p23a_3) == 0)
//					|| (rgP24_TIPO.isTagSelected(3) && Util.getInt(bean.p23a_4) == 0)) {
//				mensaje = "Error: No corresponde a los tipos de locales seleccionados en la P23";
//				view = rgP24_TIPO;
//				return !(error = true);
//			}

	//	}
	}
		if (Util.esVacio(rgP25)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta 25;");
			view = rgP25;
			return !(error = true);
		}
//		VERIFICACIÓN	:	SI EMPRESA_TIPO_CD <> P25  VERIFICAR
//		MENSAJE	:	“verificar: Tipo de empresa de marco no es la misma que la caratula”
//         if(!App.getInstance().getMarco().empresa_tipo_cd.toString().equals(bean.p25)){
// 			DialogComponent dg = new DialogComponent(
//				getActivity(),
//				this,
//				DialogComponent.TIPO_DIALOGO.YES_NO,
//				"Verificar",
//				"Tipo de empresa de marco no es la misma que la caratula");
//		dg.showDialog();
//		return false; 
       //  }
		

	//	Integer valor = Integer.parseInt(rgP25.getTagSelected("0").toString());
	//	Integer tipo = Util.getInt(App.getInstance().getMarco().empresa_tipo_cd);
		
	//	if (Util.esDiferente( tipo, valor)){
//			ToastMessage.msgBox(this.getActivity(),
//					"Verificar, Tipo de empresa de marco no es la misma que la caratula",ToastMessage.MESSAGE_ERROR,
//					ToastMessage.DURATION_LONG);			
	//	}
		

		// verificacion
//		if (flag && valor != tipo) {
//			DialogComponent dg = new DialogComponent(
//					getActivity(),
//					this,
//					DialogComponent.TIPO_DIALOGO.YES_NO,
//					"Verificar",
//					"La pregunta 25 es diferente al valor del marco; Esta seguro que desea continuar?");
//			dg.showDialog();
//			return false;
//		}
	
		return true;
	}

	@Override
	public void cargarDatos() {
		flag = true;
		bean = App.getInstance().getEmpresa();
		if (bean != null) {
			modi = getCuestionarioService().getModuloi(
					bean,
					getSecCap(Moduloi.class, Util.getListList("ID","C1P101A_1",
							"P22","P23_1", "P23_2", "P23_3", "P23_4",
							"P23_5" ,  "P23A_1", "P23A_2", "P23A_3", "P23A_4",
							"P23A_5")));
		}
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
	//	Log.e ("App.getInstance().getMarco().empresa_tipo_cd)", App.getInstance().getMarco().empresa_tipo_cd  + "");
//		if (Util.esVacio(rgP25)){
//			rgP25.setTagSelected((App.getInstance().getMarco().empresa_tipo_cd));	
//		}
		
		
		// if(Util.getInt(bean.p22) == 2){
		// cleanAndLockView(spnP24_CCDD,spnP24_CCPP,spnP24_CCDI,rgP24_TIPO);
		// rgP25.requestFocus();
		// } else {
		// lockView(false, spnP24_CCDD,spnP24_CCPP,spnP24_CCDI,rgP24_TIPO);
		
		if (Util.getInt(bean.p22)==1){
			Util.cleanAndLockView(getActivity(), spnP24_CCDD, spnP24_CCPP,
					spnP24_CCDI, rgP24_TIPO, rgTIPOVIAB, txtNOMBREVIAB,
					txtPUERTAB, txtBLOCKB, txtINTERIORB, txtPISOB, txtMANZANAB,
					txtLOTEB, txtKILOMETROB , txtREFERENCIAB);
			rgP25.requestFocus();
		}else if (Util.getInt(bean.p22)==2){
			Util.lockView(getActivity(), false, spnP24_CCDD, spnP24_CCPP, spnP24_CCDI);
			Util.lockView(getActivity(), false,  rgP24_TIPO, rgTIPOVIAB, txtNOMBREVIAB,
					txtPUERTAB, txtBLOCKB, txtINTERIORB, txtPISOB, txtMANZANAB,
					txtLOTEB, txtKILOMETROB , txtREFERENCIAB);
			if (!Util.esVacio(bean.p24_ccdd)) {
				Util.llenarItems(
						getActivity(),
						spnP24_CCPP,
						Util.getListObject(getUbigeoService().getProvincias("99",
								bean.p24_ccdd).toArray()), "PROVINCIA", true);
				spnP24_CCPP.setSelectionKey(bean.p24_ccpp);
				if (!Util.esVacio(bean.p24_ccpp)) {
					Util.llenarItems(
							getActivity(),
							spnP24_CCDI,
							Util.getListObject(getUbigeoService().getDistritos(
									"99", bean.p24_ccdd, bean.p24_ccpp).toArray()),
							"DISTRITO", true);
					spnP24_CCDI.setSelectionKey(bean.p24_ccdi);
				}
			}
		spnP24_CCDD.requestFocus();
		}
		// }
	}

	public void onP15ChangeValue(FieldComponent component) {
		RadioGroupOtherField rg = (RadioGroupOtherField) component;
		if (rg.isPressed()) {
			if (rg.equals(rgP25)) {
				if (!Util.esDiferente(Util.getInt(bean.resfin), 1, 5, 7, 8)) {
					ToastMessage
							.msgBox(this.getActivity(),
									"Visita Terminada; No puede cambiar el valor de esta Preg.",
									ToastMessage.MESSAGE_ERROR,
									ToastMessage.DURATION_LONG);
					rgP25.setTagSelected(bean.p25);
					return;
				}
			}
		}
	}

	public void onDepartamentoChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField) component;
		if (!spn.isTouched())
			return;
		spn.setTouched(false);
		if (spn.getSelectedItemKey() == null) {
			clearSpinner(spnP24_CCPP, spnP24_CCDI);
			return;
		}

		Ubigeo dpto = (Ubigeo) component.getValue();
		// MyUtil.llenarProvincia(getActivity(), getUbigeoService(),
		// spnIH205_PP, App.getInstance().getUsuario().cod_sede_operativa,
		// dpto.ccdd);
		Util.llenarItems(
				getActivity(),
				spnP24_CCPP,
				Util.getListObject(getUbigeoService().getProvincias("99",
						dpto.ccdd).toArray()), "PROVINCIA", true);
		spnP24_CCPP.requestFocus();
	}

	public void onProvinciaChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField) component;
		if (!spn.isTouched())
			return;
		spn.setTouched(false);
		if (spn.getSelectedItemKey() == null) {
			clearSpinner(spnP24_CCDI);
			return;
		}
		Ubigeo prov = (Ubigeo) component.getValue();
		// MyUtil.llenarDistrito(getActivity(), getUbigeoService(),
		// spnIH205_DIS, App.getInstance().getUsuario().cod_sede_operativa,
		// provincia.ccdd, provincia.ccpp);
		Util.llenarItems(
				getActivity(),
				spnP24_CCDI,
				Util.getListObject(getUbigeoService().getDistritos("99",
						prov.ccdd, prov.ccpp).toArray()), "DISTRITO", true);
		spnP24_CCDI.requestFocus();
	}

	public void onDistritoChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField) component;
		if (!spn.isTouched())
			return;
		spn.setTouched(false);
		rgP24_TIPO.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public UbigeoService getUbigeoService() {
		if (ubigeoService == null) {
			ubigeoService = UbigeoService.getInstance(getActivity());
		}
		return ubigeoService;
	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAccept() {
	
		int _msp = 0;
		if ((_msp = validaData()) != 0) {
			Integer cod = (Integer) dc.get("clave");
			try {
				if (cod != null) {
					
					switch (cod) {
					case 1:
						clearData(cod);
						getCuestionarioService().saveOrUpdate(modi,
								modi.getSecCap(Arrays.asList(getExtras(cod))));
					parent.nextFragment(parent.getCurPage() + 1);
						break;
					default:
						break;
					}
				}
			} catch (SQLException e) {

			}	
		}


		if (flag) {
			flag = false;
			parent.nextFragment(parent.getCurPage() + 1);
		}
	}
}

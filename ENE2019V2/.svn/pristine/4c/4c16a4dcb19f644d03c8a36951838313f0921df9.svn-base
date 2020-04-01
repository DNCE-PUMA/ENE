package gob.inei.ene2019v2.fragment;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.SpinnerField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.components.ui.GPSDialog;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.interfaces.IGPSDialog;
import gob.inei.dnce.util.CapturadorGPS;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Ubigeo;
import gob.inei.ene2019v2.service.CuestionarioService;
import gob.inei.ene2019v2.service.UbigeoService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Caratula_Fragment_002 extends FragmentForm { 

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgTIPOVIA;
	// @FieldAnnotation(orderIndex = 2)
	// public TextField txtTIPOVIA_O;
	@FieldAnnotation(orderIndex = 2)
	public TextField txtNOMBREVIA;
	@FieldAnnotation(orderIndex = 3)
	public TextField txtPUERTA;
	@FieldAnnotation(orderIndex = 4)
	public TextField txtBLOCK;
	@FieldAnnotation(orderIndex = 5)
	public TextField txtINTERIOR;
	@FieldAnnotation(orderIndex = 6)
	public TextField txtPISO;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtMANZANA;
	@FieldAnnotation(orderIndex = 8)
	public TextField txtLOTE;
	@FieldAnnotation(orderIndex = 9)
	public IntegerField txtKILOMETRO;
	
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgP9A;
    @FieldAnnotation(orderIndex = 11)
    public SpinnerField spnCCDD_N; 
    @FieldAnnotation(orderIndex = 12)
    public TextField txtNOMBRECCDD_N;
    @FieldAnnotation(orderIndex = 13)
    public SpinnerField spnCCPP_N;   
    @FieldAnnotation(orderIndex = 14)
    public TextField txtNOMBRECCPP_N;
    @FieldAnnotation(orderIndex = 15)
    public SpinnerField spnCCDI_N; 
    @FieldAnnotation(orderIndex = 16)
    public TextField txtNOMBRECCDI_N;
	
	@FieldAnnotation(orderIndex = 17)
	public TextField txtREFERENCIA;

	 
    private CapturadorGPS tracker;
    
	private CuestionarioService cuestionarioService;
	private UbigeoService ubigeoService;
	private Caratula bean;
	private LabelComponent lblTitulo,lblg,lblp9,lbln1,lbln2,lbln3;
	private GridComponent gridU,grid4;
	private GridComponent2 grid1, grid2, grid3,grid5, grdG;

	public Caratula_Fragment_002() {
	}

	public Caratula_Fragment_002 parent(MasterActivity parent) {
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
				.text(R.string.c1caratulatit).textSize(21).centrar().negrita();
		
		lblg = new LabelComponent(this.getActivity())
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text("10A. Coordenadas geográficas (del local principal)").negrita().textSize(16);
		
		lblp9 = new LabelComponent(this.getActivity())
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text("9A. Confirmar Dirección (Debe confirmar si la dirección de la empresa es la actual))").negrita().textSize(16);
		
		
		rgTIPOVIA = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100tipovia_1, R.string.c1c100tipovia_2,
				R.string.c1c100tipovia_3, R.string.c1c100tipovia_4,
				R.string.c1c100tipovia_5, R.string.c1c100tipovia_6).size(290,
				500).orientation(ORIENTATION.VERTICAL);
		// txtTIPOVIA_O = new TextField(this.getActivity(),
		// false).size(altoComponente, 350).hint(R.string.especifique);
		txtNOMBREVIA = new TextField(this.getActivity(), false).size(
				altoComponente, 320);
		txtPUERTA = new TextField(this.getActivity(), false).size(
				altoComponente, 200).soloTextoNumero();
		txtBLOCK = new TextField(this.getActivity(), false).size(
				altoComponente, 200);
		txtINTERIOR = new TextField(this.getActivity(), false).size(
				altoComponente, 200);
		txtPISO = new TextField(this.getActivity(), false).size(altoComponente,
				200);
		txtMANZANA = new TextField(this.getActivity(), false).size(
				altoComponente, 200);
		txtLOTE = new TextField(this.getActivity(), false).size(altoComponente,
				200);
		txtKILOMETRO = new IntegerField(this.getActivity(), false).size(
				altoComponente, 150).alinearIzquierda();
		//nuevo
		rgP9A = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100_Si, R.string.no).size(50,
				500).orientation(ORIENTATION.HORIZONTAL).centrar().callback("onP9AChangeValue");
		txtNOMBRECCDD_N = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
		txtNOMBRECCPP_N = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
		txtNOMBRECCDI_N = new TextField(this.getActivity(), false).size(
				altoComponente, 450);

		spnCCDD_N = new SpinnerField(getActivity())
		.size(altoComponente + 15, 270)
		.callback("onDepartamentoChangeValue").keyString(); // .title(MyUtil.getVacio("CCDD"));
		Util.llenarItems(getActivity(), spnCCDD_N, Util
		.getListObject(getUbigeoService().getDepartamentos("99")
				.toArray()), "DEPARTAMENTO", true);
		
		spnCCPP_N = new SpinnerField(getActivity())
				.size(altoComponente + 15, 270)
				.callback("onProvinciaChangeValue").keyString(); 
		Util.llenarItems(getActivity(), spnCCPP_N, new ArrayList<Object>(),
				"PROVINCIA", true);
		
		spnCCDI_N = new SpinnerField(getActivity())
				.size(altoComponente + 15, 270)
				.callback("onDistritoChangeValue").keyString(); 
		Util.llenarItems(getActivity(), spnCCDI_N, new ArrayList<Object>(),
				"DISTRITO", true);
		
	
		txtREFERENCIA = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
	
		LabelComponent lblTv = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100tipovia).size(altoComponente, 245)
				.centrar();
		LabelComponent lblNv = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100nombrevia).size(altoComponente, 245)
				.centrar();

		grid1 = new GridComponent2(getActivity(), 2);
		grid1.addComponent(lblTv);
		grid1.addComponent(rgTIPOVIA);
		grid1.addComponent(lblNv);
		grid1.addComponent(txtNOMBREVIA);

		LabelComponent lbl1 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100puerta).size(altoComponente, 175);
		LabelComponent lbl2 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100block).size(altoComponente, 175);
		LabelComponent lbl3 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100interior).size(altoComponente, 175);
		LabelComponent lbl4 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100piso).size(altoComponente, 175);
		LabelComponent lbl5 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100manzana).size(altoComponente, 175);
		LabelComponent lbl6 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100lote).size(altoComponente, 175);
		LabelComponent lbl7 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100kilometro).size(altoComponente, 175);
		
		LabelComponent lbln1 = new LabelComponent(getActivity(), App.ESTILO)
		.text(R.string.c1c100p14_dd).size(altoComponente, 250);
		LabelComponent lbln2 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p14_pp).size(altoComponente, 250);
		LabelComponent lbln3 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100p14_di).size(altoComponente, 250);

		grid2 = new GridComponent2(getActivity(), 2);
		grid2.addComponent(lbl1);
		grid2.addComponent(txtPUERTA);
		grid2.addComponent(lbl2);
		grid2.addComponent(txtBLOCK);
		grid2.addComponent(lbl3);
		grid2.addComponent(txtINTERIOR);
		grid2.addComponent(lbl4);
		grid2.addComponent(txtPISO);
		grid2.addComponent(lbl5);
		grid2.addComponent(txtMANZANA);
		grid2.addComponent(lbl6);
		grid2.addComponent(txtLOTE);
		grid2.addComponent(lbl7);
		grid2.addComponent(txtKILOMETRO);
		
		grid4 = new GridComponent(getActivity(), 2)
		.colorFondo(FragmentForm.COLOR_LINEA_SECCION_PREGUNTA);
		
		grid4.addComponent(lbln1);
		grid4.addComponent(spnCCDD_N);
		grid4.addComponent(lbln2);
		grid4.addComponent(spnCCPP_N);
		grid4.addComponent(lbln3);
		grid4.addComponent(spnCCDI_N);

		LabelComponent lblRef = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100referencia).size(altoComponente, 565);

		grid3 = new GridComponent2(getActivity(), 1);
		grid3.addComponent(lblRef);
		grid3.addComponent(txtREFERENCIA);
		
		Filtros.setFiltro(txtNOMBRECCDD_N, Filtros.TIPO.ALFA_U, 70, null);
		Filtros.setFiltro(txtNOMBRECCPP_N, Filtros.TIPO.ALFA_U, 70, null);
		Filtros.setFiltro(txtNOMBRECCDI_N, Filtros.TIPO.ALFA_U, 70, null);
		

		Filtros.setFiltro(txtNOMBREVIA, Filtros.TIPO.ALFAN_U, 150, null);
//		Filtros.setFiltro(txtPUERTA, Filtros.TIPO.ALFAN_U, 4, null);
		Filtros.setFiltro(txtPUERTA, Filtros.TIPO.PATRON, 4, -1,null,-1,-1,-1,-1,-1,-1,-1, 
				"(^[0-9][A-Z]?)||(^[A-Z][0-9]?)||(^[A-Z][A-Z][0-9]?)||(^[0-9][0-9][A-Z]?)||(^[A-Z][A-Z][A-Z]?)||(^[0-9][0-9][0-9]?)"
				+ "||(^[A-Z][A-Z][A-Z][A-Z]?)||(^[0-9][0-9][0-9][0-9]?)||(^[A-Z][A-Z][A-Z][0-9]?)||(^[0-9][0-9][0-9][A-Z]?)");
		Filtros.setFiltro(txtBLOCK, Filtros.TIPO.ALFAN_U, 4, null);
		Filtros.setFiltro(txtINTERIOR, Filtros.TIPO.ALFAN_U, 4, null);
		// Filtros.setFiltro(txtPISO, Filtros.TIPO.ALFAN_U,2,null);
		Filtros.setFiltro(txtPISO, Filtros.TIPO.PATRON, 2,
				Filtros.TIPO.ALFAN_U.ordinal(), null, -1, -1, -1, -1, -1, -1,
				-1,	"(^[1-9]?)||(^1[0-9]?)||(^2[0-9]?)||(^30?)||(A)||(S[1-3])||(M)");
		Filtros.setFiltro(txtMANZANA, Filtros.TIPO.ALFAN_U, 3, null);
		Filtros.setFiltro(txtLOTE, Filtros.TIPO.ALFAN_U, 3, null);
		Filtros.setFiltro(txtKILOMETRO, Filtros.TIPO.NUMBER, 4, -1, null, 1,5000);
		

		
	//	Filtros.setFiltro(txtREFERENCIA, Filtros.TIPO.ALFAN_U, 300, null); 
		Filtros.setFiltro(txtREFERENCIA, Filtros.TIPO.ALFAN_U, 300,  new char[]{'\n','.',',','+','-','*','/','=','(',')'});

	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */

		LinearLayout q0 = createQuestionSection(lblTitulo);

		LinearLayout q1 = createQuestionSection(grid1.component());
		LinearLayout q2 = createQuestionSection(grid2.component());	
		LinearLayout q3 = createQuestionSection(grid3.component());
		LinearLayout q4 = createQuestionSection(R.string.c1c100cdn,rgP9A);
		LinearLayout q5 = createQuestionSection(q4,grid4.component());
		// ///////////////////////////
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		/* Aca agregamos las preguntas a la pantalla */
		form.addView(q0);

		form.addView(q1);
		form.addView(q2);
		form.addView(q5);
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
			if (spnCCDD_N.getSelectedItemKey() != null) {
				bean.nombreccdd_n = ((Ubigeo) spnCCDD_N.getSelectedItem()).departamento;
			}
			if (spnCCPP_N.getSelectedItemKey() != null) {
				bean.nombreccpp_n = ((Ubigeo) spnCCPP_N.getSelectedItem()).provincia;
			}
			if (spnCCDI_N.getSelectedItemKey() != null) {
				bean.nombreccdi_n = ((Ubigeo) spnCCDI_N.getSelectedItem()).distrito;
			}

			Log.e ("beam" , bean.ccdd_n + "");
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

		if (Util.esVacio(rgTIPOVIA)) {
			mensaje = pregunta_no_vacia.replace("$", "Tipo de v\u00eda;");
			view = rgTIPOVIA;
			return !(error = true);
		}
		// if(rgTIPOVIA.isTagSelected(6) && Util.esVacio(txtTIPOVIA_O)){
		// mensaje = especifique_no_vacio;
		// view = txtTIPOVIA_O;
		// return !(error = true);
		// }
		if (Util.esVacio(txtNOMBREVIA)) {
			mensaje = pregunta_no_vacia.replace("$", "Nombre de v\u00eda;");
			view = txtNOMBREVIA;
			return !(error = true);
		}
		if (Util.esVacio(txtPUERTA)) {
			mensaje = pregunta_no_vacia.replace("$", "N\u00B0 de Puerta;");
			view = txtPUERTA;
			return !(error = true);
		}
		
		if (txtPUERTA.getCurrentTextColor() == Filtros.ERRORCOLOR) {
			mensaje = "Inconsistencia en Datos de Puerta.";
			view = txtPUERTA;
			return !(error = true);
		}
		
		
		if (Util.esVacio(txtPISO)) {
			mensaje = pregunta_no_vacia.replace("$", "Piso;");
			view = txtPISO;
			return !(error = true);
		}
		if (txtPISO.getCurrentTextColor() == Filtros.ERRORCOLOR) {
			mensaje = "Inconsistencia en el valor de la preg. Piso.";
			view = txtPISO;
			return !(error = true);
		}
		if ((!Util.esVacio(txtMANZANA) && Util.esVacio(txtLOTE))
				|| !Util.esVacio(txtLOTE) && Util.esVacio(txtMANZANA)) {
			mensaje = "Error: Debe existir información en lote y manzana";
			view = txtMANZANA;
			return !(error = true);
		}
		if (rgTIPOVIA.isTagSelected(5) && Util.esVacio(txtKILOMETRO)) {
			mensaje = "Debe haber información en Kil\u00f3metro";
			view = txtKILOMETRO;
			return !(error = true);
		}
		
		if (Util.esVacio(rgP9A)) {
			mensaje = pregunta_no_vacia.replace("$",
					"Confirmarla direcci\u00f3n;");
			view = rgP9A;
			return !(error = true);
		}
				
		if (rgP9A.isTagSelected(2)) {
			if (spnCCDD_N.getSelectedItemKey() == null) {
				mensaje = pregunta_no_vacia.replace("$", "Departamento;");
				view = spnCCDD_N;
				return !(error = true);
			}
			if (spnCCPP_N.getSelectedItemKey() == null) {
				mensaje = pregunta_no_vacia.replace("$", "Provincia;");
				view = spnCCPP_N;
				return !(error = true);
			}
			if (spnCCDI_N.getSelectedItemKey() == null) {
				mensaje = pregunta_no_vacia.replace("$", "Distrito;");
				view = spnCCDI_N;
				return !(error = true);
			}
			
		
		if (Util.esVacio(txtREFERENCIA)) {
			mensaje = pregunta_no_vacia.replace("$",
					"Referencia de la direcci\u00f3n;");
			view = txtREFERENCIA;
			return !(error = true);
		}
		String text = Util.getText(txtREFERENCIA.getText());
		if (text.trim().length() == Util.contDigits(text)
				&& Util.sumDigits(text) == 0) {
			mensaje = "Error: Debe ingresar información correcta";
			view = txtREFERENCIA;
			return !(error = true);
		}
		if (text.trim().length() < 4) {
			mensaje = "Error: Debe ingresar referencia correcta";
			view = txtREFERENCIA;
			return !(error = true);
		}
		
		
//		VERIFICACIÓN	:	SI CCDD_N=CCDD and CCPP_N=CCPP and CCDI_N=CCDI P25  ERROR
//				MENSAJE	:	“Error: Ubigeo de la nueva dirección no puede ser el mismo que del marco”
		
			if (rgP9A.isTagSelected(2)) {
				if (!Util.esDiferente(App.getInstance().getMarco().ccdd,spnCCDD_N.getSelectedItem().toString())) {
					if (!Util.esDiferente(App.getInstance().getMarco().ccpp,spnCCPP_N.getSelectedItem().toString())) {
						if (!Util.esDiferente(App.getInstance().getMarco().ccdi, spnCCDI_N.getSelectedItem().toString())) {
							mensaje = "“Error: Ubigeo de la nueva dirección no puede ser el mismo que del marco";
							view = spnCCDI_N;
							return !(error = true);
						}
					}
				}

			}
		
     
	}
  

    	
		return true;
	}

	@Override
	public void cargarDatos() {

//		bean.ccdd = App.getInstance().getMarco().ccdd;
//		bean.ccpp = App.getInstance().getMarco().ccpp;
//		bean.ccdi = App.getInstance().getMarco().ccdi;
		
		// bean =
		// getCuestionarioService().getCaratula(App.getInstance().getEmpresa(),
		// new Caratula().getSecCap(getListFields(this)));
		// if (bean == null) {
		// bean = new Caratula();
		// }
		// bean.id = App.getInstance().getEmpresa().id;
		bean = App.getInstance().getEmpresa();
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
//		Log.e ("App.getInstance().getMarco().empresa_tipo_cdD)",bean.ccdd_n + "");
//		Log.e ("App.getInstance().getMarco().empresa_tipo_cdP)",bean.ccpp_n + "");
//		Log.e ("App.getInstance().getMarco().empresa_tipo_cdI)",bean.ccdi_n + "");
		

		if (bean.tipovia == null) {
			rgTIPOVIA.setTagSelected(Util.getText(App.getInstance().getMarco().m_tipovia_cd));
		}
		if (bean.nombrevia == null) {
			txtNOMBREVIA.setText(Util.getText(App.getInstance().getMarco().m_nombrevia));
		}

		if (bean.puerta == null) {
			txtPUERTA.setText(Util.getText(App.getInstance().getMarco().m_puerta));
		}

		if (bean.piso == null) {
			txtPISO.setText(Util.getText(App.getInstance().getMarco().m_piso));
		}
		
		if (bean.manzana == null) {
			txtMANZANA.setText(Util.getText(App.getInstance().getMarco().m_manzana));
		}
		
		if (bean.piso == null) {
			txtLOTE.setText(Util.getText(App.getInstance().getMarco().m_lote));
		}
		
	if (rgP9A.isTagSelected(1)){
			Util.cleanAndLockView(getActivity(),spnCCDD_N,txtNOMBRECCDD_N,spnCCPP_N,txtNOMBRECCPP_N,spnCCDI_N,txtNOMBRECCDI_N, txtREFERENCIA);
	}else{
	   Util.lockView(getActivity(), false,spnCCDD_N,txtNOMBRECCDD_N,spnCCPP_N,txtNOMBRECCPP_N,spnCCDI_N,txtNOMBRECCDI_N, txtREFERENCIA);
  	
		if (!Util.esVacio(bean.ccdd_n)) {
			Util.llenarItems(
					getActivity(),
					spnCCPP_N,
					Util.getListObject(getUbigeoService().getProvincias("99",
							bean.ccdd_n).toArray()), "PROVINCIA", true);
			spnCCPP_N.setSelectionKey(bean.ccpp_n);
			if (!Util.esVacio(bean.ccpp_n)) {
				Util.llenarItems(
						getActivity(),
						spnCCDI_N,
						Util.getListObject(getUbigeoService().getDistritos(
								"99", bean.ccdd_n, bean.ccpp_n).toArray()),
						"DISTRITO", true);
				spnCCDI_N.setSelectionKey(bean.ccdi_n);
			}
		}
		spnCCDD_N.requestFocus();
	}	
		rgTIPOVIA.requestFocus();
		
		

	}
	public void onDepartamentoChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField) component;
		if (!spn.isTouched())
			return;
		spn.setTouched(false);
		if (spn.getSelectedItemKey() == null) {
			clearSpinner(spnCCPP_N, spnCCDI_N);
			return;
		}

		Ubigeo dpto = (Ubigeo) component.getValue();
		Util.llenarItems(
				getActivity(),
				spnCCPP_N,
				Util.getListObject(getUbigeoService().getProvincias("99",
						dpto.ccdd).toArray()), "PROVINCIA", true);
		spnCCPP_N.requestFocus();
	}
	public void onProvinciaChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField) component;
		if (!spn.isTouched())
			return;
		spn.setTouched(false);
		if (spn.getSelectedItemKey() == null) {
			clearSpinner(spnCCDI_N);
			return;
		}
		Ubigeo prov = (Ubigeo) component.getValue();
		Util.llenarItems(
				getActivity(),
				spnCCDI_N,
				Util.getListObject(getUbigeoService().getDistritos("99",
						prov.ccdd, prov.ccpp).toArray()), "DISTRITO", true);
		spnCCDI_N.requestFocus();
	}
	public void onDistritoChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField) component;
		if (!spn.isTouched())
			return;
		spn.setTouched(false);
		txtREFERENCIA.requestFocus();
	}
	public void onP9AChangeValue() {
		if (rgP9A.isTagSelected(1)){
			Util.cleanAndLockView(getActivity(),spnCCDD_N,txtNOMBRECCDD_N,spnCCPP_N,txtNOMBRECCPP_N,spnCCDI_N,txtNOMBRECCDI_N, txtREFERENCIA);
	}else{
		Util.lockView(getActivity(), false,spnCCDD_N,txtNOMBRECCDD_N,spnCCPP_N,txtNOMBRECCPP_N,spnCCDI_N,txtNOMBRECCDI_N, txtREFERENCIA);
		if (!Util.esVacio(bean.ccdd_n)) {
			Util.llenarItems(
					getActivity(),
					spnCCPP_N,
					Util.getListObject(getUbigeoService().getProvincias("99",
							bean.ccdd_n).toArray()), "PROVINCIA", true);
			
			spnCCPP_N.setSelectionKey(bean.ccpp_n);
			if (!Util.esVacio(bean.ccpp_n)) {
				Util.llenarItems(
						getActivity(),
						spnCCDI_N,
						Util.getListObject(getUbigeoService().getDistritos(
								"99", bean.ccdd_n, bean.ccpp_n).toArray()),
						"DISTRITO", true);
				spnCCDI_N.setSelectionKey(bean.ccdi_n);
			}
		}
	    	spnCCDD_N.requestFocus();
	}
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
	
	


	
	
}

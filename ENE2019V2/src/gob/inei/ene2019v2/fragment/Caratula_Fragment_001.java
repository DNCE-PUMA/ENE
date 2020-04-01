package gob.inei.ene2019v2.fragment; 

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.TextBoxField;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.components.ui.GPSDialog;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.interfaces.IDetailEntityComponent;
import gob.inei.dnce.interfaces.IGPSDialog;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.interfaces.Searchable1;
import gob.inei.dnce.util.CapturadorGPS;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.dnce.util.Util.COMPLETAR;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.ActSecDivGrpClase;
import gob.inei.ene2019v2.model.CCPP;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.List;
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

public class Caratula_Fragment_001 extends FragmentForm implements Searchable1, Respondible, IGPSDialog {

    
    @FieldAnnotation(orderIndex = 1)
    public TextField txtNOMBRECCDD; 
    @FieldAnnotation(orderIndex = 2)
    public TextField txtNOMBRECCPP;
    @FieldAnnotation(orderIndex = 3)
    public TextField txtNOMBRECCDI;    
    @FieldAnnotation(orderIndex = 4)
    public TextField txtGPS_LAT;
    @FieldAnnotation(orderIndex = 5)
    public TextField txtGPS_LON;
    @FieldAnnotation(orderIndex = 6)
	public Button btnGPS;
    @FieldAnnotation(orderIndex = 7)
    public TextField txtSECTOR;
    @FieldAnnotation(orderIndex = 8)
    public TextField txtAREA;
    @FieldAnnotation(orderIndex = 9)
    public TextField txtZONA;
    @FieldAnnotation(orderIndex = 10)
    public TextField txtMZA;
    //@FieldAnnotation(orderIndex = 9)
    public TextField txtNEMPRESA;
    
    
//    @FieldAnnotation(orderIndex = 10)
//    public IntegerField txtFRENTE;
    
    private CuestionarioService cuestionarioService;
    private Caratula bean;
	private LabelComponent lblTitulo,lblSecA,lblg, lblSecB,lblSecC;
	private GridComponent grd1, grd2, grd3;
	public GridComponent2 grdG;
	private int buscado = 0;
	private CapturadorGPS tracker;
	   
    public Caratula_Fragment_001() {} 
    
    public Caratula_Fragment_001 parent(MasterActivity parent) {
    	this.parent = parent;
    	return this;
    } 
    
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
    } 
    
    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
    	rootView = createUI(); 
		initObjectsWithoutXML(this, rootView);
		enlazarCajas();
		listening();
		
		return rootView;
    } 
    
    @Override 
    protected void buildFields() { 
    	lblTitulo=new LabelComponent(this.getActivity(), App.ESTILO).size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
    			.text(R.string.c1caratulatit).textSize(21).centrar().negrita();
    	lblSecA=new LabelComponent(this.getActivity(), App.ESTILO).size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
    			.text(R.string.c1caratulaseca).textSize(20).centrar().negrita();
    	lblSecB=new LabelComponent(this.getActivity(), App.ESTILO).size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
    			.text(R.string.c1caratulasecb).textSize(20).centrar().negrita();
    	lblSecC=new LabelComponent(this.getActivity(), App.ESTILO).size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
    			.text(R.string.c1caratulasecgps).textSize(20).centrar().negrita();

		lblg = new LabelComponent(this.getActivity())
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text("4. Coordenadas geográficas (del local principal)").negrita().textSize(16);
		txtNOMBRECCDD = new TextField(this.getActivity(), false).size(altoComponente, 350).readOnly().negrita();
		txtNOMBRECCPP = new TextField(this.getActivity(), false).size(altoComponente, 350).readOnly().negrita();
		txtNOMBRECCDI = new TextField(this.getActivity(), false).size(altoComponente, 350).readOnly().negrita();
		txtGPS_LAT= new TextField(this.getActivity(), false).size(altoComponente, 250).readOnly();
		txtGPS_LON = new TextField(this.getActivity(), false).size(altoComponente, 250).readOnly();
		
		btnGPS = new ButtonComponent(this.getActivity(), App.ESTILO_BOTON)
		.text(R.string.btnGPS).size(300, altoComponente).centrar();
		
		btnGPS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				capturarGPS();
			}
		});
		
		txtSECTOR = new TextField(this.getActivity(), false).size(altoComponente, 150).centrar().readOnly();
		txtAREA = new TextField(this.getActivity(), false).size(altoComponente, 150).centrar().readOnly();
		txtZONA = new TextField(this.getActivity(), false).size(altoComponente, 150).centrar().readOnly(); //.callbackOnFocus("onFocus_onChange");
		txtMZA = new TextField(this.getActivity(), false).size(altoComponente, 150).centrar().readOnly(); //.callbackOnFocus("onFocus_onChange");
//		txtFRENTE = new IntegerField(this.getActivity(), false).size(altoComponente, 150).centrar().readOnly();
		txtNEMPRESA  = new TextField(this.getActivity(), false).size(altoComponente, 150).centrar().readOnly();
		LabelComponent lbl1 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100nombreccdd).size(altoComponente, 250);
		LabelComponent lbl2 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100nombreccpp).size(altoComponente, 250);
		LabelComponent lbl3 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100nombreccdi).size(altoComponente, 250);
		LabelComponent lbl4 = new LabelComponent(getActivity(), App.ESTILO)
		.text(R.string.c1c100nombrecccp).size(altoComponente, 250);
		
	
		
		grd1 = new GridComponent(this.getActivity(), 2).colorFondo(FragmentForm.COLOR_LINEA_SECCION_PREGUNTA);
		grd1.addComponent(lbl1);
		grd1.addComponent(txtNOMBRECCDD);
		grd1.addComponent(lbl2);
		grd1.addComponent(txtNOMBRECCPP);
		grd1.addComponent(lbl3);
		grd1.addComponent(txtNOMBRECCDI);
		
		LabelComponent lbl6 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100sector).size(altoComponente, 250);
		LabelComponent lbl7 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100area).size(altoComponente, 250);
		LabelComponent lbl8 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100zona).size(altoComponente, 250);
		LabelComponent lbl9 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100mza).size(altoComponente, 250);
		LabelComponent lbl10 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c1c100EMP).size(altoComponente, 250);
		
		grd3 = new GridComponent(this.getActivity(), 2).colorFondo(FragmentForm.COLOR_LINEA_SECCION_PREGUNTA);
		grd3.addComponent(lbl6);
		grd3.addComponent(txtSECTOR);
		grd3.addComponent(lbl7);
		grd3.addComponent(txtAREA);
		grd3.addComponent(lbl8);
		grd3.addComponent(txtZONA);
		grd3.addComponent(lbl9);
		grd3.addComponent(txtMZA);		
		grd3.addComponent(lbl10);
		grd3.addComponent(txtNEMPRESA);
		
		
		LabelComponent lbllat = new LabelComponent(getActivity(), App.ESTILO).text(R.string.epe2018gpslatitude).size(altoComponente, 120).centrar();
		LabelComponent lbllon = new LabelComponent(getActivity(), App.ESTILO).text(R.string.epe2018gpslongitude).size(altoComponente, 120).centrar();
		
		grdG = new GridComponent2(this.getActivity(), 2).colorFondo(R.color.WhiteSmoke);
		grdG.addComponent(lbllat);
		grdG.addComponent(txtGPS_LAT);
		grdG.addComponent(lbllon);
		grdG.addComponent(txtGPS_LON);
		grdG.addComponent(btnGPS,2);
		
		Filtros.setFiltro(txtNOMBRECCDD, Filtros.TIPO.ALFA_U,70,null);
		Filtros.setFiltro(txtNOMBRECCPP, Filtros.TIPO.ALFA_U,70,null);
		Filtros.setFiltro(txtNOMBRECCDI, Filtros.TIPO.ALFA_U,70,null);

		Filtros.setFiltro(txtSECTOR, Filtros.TIPO.ALFAN_U,6,null);
		Filtros.setFiltro(txtAREA, Filtros.TIPO.ALFAN_U,6,null);
		Filtros.setFiltro(txtZONA, Filtros.TIPO.ALFAN_U,10,null);
//		Filtros.setFiltro(txtZONA, Filtros.TIPO.PATRON, 5, -1,null,-1,-1,-1,-1,-1,-1,-1, "^0[0-9][1-9][A-Z]?");
//		Filtros.setFiltro(txtMZA, Filtros.TIPO.PATRON,10,-1,null,-1,-1,-1,-1,-1,-1,-1, "^0[0-9][1-9][A-Z]?");
		Filtros.setFiltro(txtMZA, Filtros.TIPO.ALFAN_U,10,null);
//		Filtros.setFiltro(txtFRENTE, Filtros.TIPO.NUMBER,1,-1,null,0, 9);
		Filtros.setFiltro(txtGPS_LAT, Filtros.TIPO.ALFAN_U,20,new char[]{'-','.'});
		Filtros.setFiltro(txtGPS_LON, Filtros.TIPO.ALFAN_U,20,new char[]{'-','.'});
    } 
	
    @Override 
    protected View createUI() { 
		buildFields(); 

		LinearLayout q0 = createQuestionSection(lblTitulo, lblSecA);
		LinearLayout q1 = createQuestionSection(grd1.component());
		LinearLayout q2 = createQuestionSection(lblg, grdG.component());
		LinearLayout q3 = createQuestionSection(lblSecB);
		LinearLayout q4 = createQuestionSection(grd3.component());

		
		ScrollView contenedor = createForm(); 
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0); 
		
		form.addView(q0); 		
		form.addView(q1);
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
			bean.ccdd = App.getInstance().getMarco().ccdd;
			bean.ccpp = App.getInstance().getMarco().ccpp;
			bean.ccdi = App.getInstance().getMarco().ccdi;
		//	bean.cccp = App.getInstance().getMarco().cccp;
			if(!getCuestionarioService().saveOrUpdate(bean, bean.getSecCap(getListFields(this, new String[]{"CCDD","CCPP","CCDI" })))){
				ToastMessage.msgBox(this.getActivity(), "Los datos no se guardaron",
						ToastMessage.MESSAGE_ERROR,
						ToastMessage.DURATION_LONG);
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

    	if(Filtros.getErrorFiltro()!=null){
            ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro().getValue(),
                         ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
            Filtros.getErrorFiltro().getKey().requestFocus();
            return false;
		}
    	
      	if(Util.esVacio(txtGPS_LON)){
    		mensaje = pregunta_no_vacia.replace("$", "GPS;");
    		view = btnGPS;
    		return !(error = true);
    	}
		
    	
//    	if(Util.esVacio(txtZONA)){
//    		mensaje = pregunta_no_vacia.replace("$", "7. Zona;");
//    		view = txtZONA;
//    		return !(error = true);
//    	}
//    	if(txtZONA.getCurrentTextColor() == Filtros.ERRORCOLOR){
//    		mensaje = "Valor Inconsistente en la Preg. 7. Zona";
//    		view = txtZONA;
//    		return !(error = true);
//    	}
//    	if(Util.esVacio(txtMZA)){
//    		mensaje = pregunta_no_vacia.replace("$", "8. Manzana;");
//    		view = txtMZA;
//    		return !(error = true);
//    	}
//    	if(txtMZA.getCurrentTextColor() == Filtros.ERRORCOLOR){
//    		mensaje = "Valor Inconsistente en la Preg. 8. Manzana";
//    		view = txtMZA;
//    		return !(error = true);
//    	}
//    	if(Util.esVacio(txtFRENTE)){
//    		mensaje = pregunta_no_vacia.replace("$", "9. Frente;");
//    		view = txtFRENTE;
//    		return !(error = true);
//    	}
    	
    	
		return true; 
    } 
     
    @Override 
    public void cargarDatos() { 
    	tracker = new CapturadorGPS(getActivity());
//    	Caratula car = new Caratula(1);
//    	bean = getCuestionarioService().getCaratula(car, 
//    			car.getSecCap(getListFields(car, new String[]{"ID"}), false));
//    	if (bean == null) {
//    		bean = new Caratula();
//		}
//    	bean.id = car.id;
//    	App.getInstance().setEmpresa(bean);
    	bean = App.getInstance().getEmpresa();
    	entityToUI(bean);
		inicio(); 
    } 
    
    private void capturarGPS() {
		FragmentManager fm = this.getFragmentManager();
		GPSDialog gps = GPSDialog.newInstance(this, tracker)
				.estilo(App.ESTILO)
				.estiloBoton(App.ESTILO_BOTON)
				.property(IGPSDialog.ACCURACY);
		gps.setAncho(MATCH_PARENT);
		gps.show(fm, "gpsDialog");
	}
    
    private void inicio() {   
    	Log.e(" flag " , App.getInstance().getMarco().flag  + "");
    	Log.e(" ccpp " , App.getInstance().getMarco().ccpp  + "");
    	
    	Log.e("Zona", "zona" + Util.getText(App.getInstance().getMarco().zona));
    	txtNOMBRECCDD.setText(Util.getText(App.getInstance().getMarco().nombredd));
    	txtNOMBRECCPP.setText(Util.getText(App.getInstance().getMarco().nombrepp));
    	txtNOMBRECCDI.setText(Util.getText(App.getInstance().getMarco().nombredi));
    	txtSECTOR.setText(Util.getText(App.getInstance().getMarco().sector));
//    	txtAREA.setText(Util.getText(App.getInstance().getMarco().area));
    	txtZONA.setText(Util.getText(App.getInstance().getMarco().zona));
    	txtMZA.setText(Util.getText(App.getInstance().getMarco().mza));
    	txtNEMPRESA.setText(Util.getText(App.getInstance().getMarco().nempresa));
//    	txtFRENTE.setText(Util.getText(App.getInstance().getMarco().frente));
    	btnGPS.requestFocus();
    }

    public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
    
    public void onFocus_onChange(FieldComponent component){
		TextBoxField txt = (TextBoxField)component;
		if(txt.getText().toString().trim().length() > 0)
			txt.setText(Util.completarCadena(txt.getText().toString(), "0", 3, COMPLETAR.IZQUIERDA));
	}



	@Override
	public <T extends IDetailEntityComponent> void postResultSearch(
			List<String> resps, T... result) {
		ActSecDivGrpClase s = (ActSecDivGrpClase) result[0];
//		switch (buscado) {
//		case 1:
//			txtCCCP.setText(s.clase);
//			txtCCCP.readOnly();
//			txtNOMBRECCCP.setText(s.descripcion);
//		//	txtNOMBRECCCP.readOnly();
//
//			int codigo = Integer.parseInt(s.clase.toString());
//			if (Util.getInt(s.clase) == 9998) {
//				txtCCCP.setText("9998");
//				txtNOMBRECCCP.requestFocus();
//				txtNOMBRECCCP.requestFocus();
//			}else if (Util.getInt(s.clase) == 9999) {
//				txtCCCP.setText("9999");
//				txtNOMBRECCCP.requestFocus();
//			}				
//
//			break;
//
//		default:
//			break;
//		}
	}


	

	@Override
	public List<Object[]> getFieldsListData(NIVEL nivel) {
		if (nivel == NIVEL.NIVEL1)
			return Util.getListList(new Object[] { "CLASE", "DESCRIPCION" },
					new Object[] { R.string.tr_codigo, R.string.tr_nombre },
					new Object[] { 0.6f, 2f });
		return null;
	}

	@Override
	public <T extends IDetailEntityComponent> boolean getHasEsp(T selecc,
			NIVEL nivel, KEY key) {
		return false;
	}

	@Override
	public NIVEL getNiveles() {
		return NIVEL.NIVEL1;
	}

	@Override
	public void onCancel() {

	}

	@Override
	public void onAccept() {
	
	}

	@Override
	public <T extends IDetailEntityComponent> List<T> getListData(NIVEL nivel,
			T selecc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Fragment getForm() {
		return this;
	}

	@Override
	public void postShow(Map<String, String> properties) {
		String longitud;
		String latitud;
		String altitud;
		if (properties != null) {
			longitud = properties.get(IGPSDialog.LONGITUD);
			latitud = properties.get(IGPSDialog.LATITUD);
			altitud = properties.get(IGPSDialog.ALTURA);		
		} else {
			return;
		}
		
		String lon = Util.getText(txtGPS_LON.getText());
		if(!Util.esVacio(lon) && !lon.equals(App.GPS_OMISION) && 
				(Util.esVacio(longitud) || longitud.equals(App.GPS_OMISION))){
			return;
		} 
		if(!longitud.equals(App.GPS_OMISION)) {
//			boolean existeGPS = getCuestionarioService().existeGPSEst(latitud, longitud);
//			if (existeGPS) {
//				ToastMessage.msgBox(getActivity(),
//						"Punto GPS ya existente, intente tomar otro",
//						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_SHORT);
//				return;
//			}
		}
		
		txtGPS_LAT.setText(latitud);
		txtGPS_LON.setText(longitud);
	}


} 

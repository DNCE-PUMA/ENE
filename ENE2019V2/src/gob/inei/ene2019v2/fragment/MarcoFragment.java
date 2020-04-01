package gob.inei.ene2019v2.fragment;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.SpinnerField;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Equipo;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Periodo;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Ruta;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Sede;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Marco;
import gob.inei.ene2019v2.model.Visita;
import gob.inei.ene2019v2.service.CuestionarioService;
import gob.inei.ene2019v2.service.MarcoService;
import gob.inei.ene2019v2.service.SegmentacionService;
import gob.inei.ene2019v2.service.UbigeoService;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.LinearLayout;
import android.widget.ScrollView;
//import gob.inei.ene2019v2.model.Marco;

public class MarcoFragment extends FragmentForm implements Respondible {

	@FieldAnnotation(orderIndex = 1)
	public SpinnerField spnCODSEDEOPERATIVA;
	@FieldAnnotation(orderIndex = 2)
	public SpinnerField spnEQUIPO;
	@FieldAnnotation(orderIndex = 3)
	public SpinnerField spnRUTA;
	@FieldAnnotation(orderIndex = 4)
	public SpinnerField spnPERIODO;
	
	
	@FieldAnnotation(orderIndex = 5)
	public ButtonComponent btnFWD;
	public ButtonComponent btnBCK;

	private String TAG = MarcoFragment.this.getClass().getSimpleName();

	public static Periodo PERIODO;
	public static Sede CODSEDE;
	public static Equipo EQUIPO;
	public static Ruta RUTA;

	private TableComponent tcMarcoCCCP;
	private LabelComponent lblTitulo;
	private UbigeoService ubigeoService;
	private GridComponent2 grid1;
	private MarcoService service;
	private SegmentacionService segmentacionService;
	private CuestionarioService cuestionarioService;
	private MarcoService marcoService;
	private List<Marco> lstData;

	public MarcoFragment parent(MasterActivity parent) {
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
		setHasOptionsMenu(true);
		registerForContextMenu(tcMarcoCCCP.getListView());
		initObjectsWithoutXML(this, rootView);
		enlazarCajas();
		listening();
		inicio();
		return rootView;
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		
	    if (v.getId() == tcMarcoCCCP.getListView().getId()){
	        menu.setHeaderTitle("Opciones");
//	        menu.add(0, 1, 1, "Aperturar Comisar\u00eda");
	        menu.add(0, 1, 1, "Ir a Caratula");
	        menu.add(0, 2, 2, "Ir a Visitas");
	   //     menu.add(0, 3, 3, "Establecer Plantilla para Calificación");
	        menu.add(0, 5, 5, "Borrar Empresa");
	        menu.add(0, 6, 6, "Editar Empresa");
	        menu.add(0, 7, 7, "Eliminar Empresa");
	    }
	    
		AdapterView.AdapterContextMenuInfo info;
		try {	            
			info = (AdapterView.AdapterContextMenuInfo) menuInfo;
			Marco marco = (Marco)(info.targetView.getTag());
			
			List<Visita> lstV = getCuestionarioService().getVisitas(marco, marco.getSecCap(getListFields(new Visita(),	new String[] { "id" }), false));
			App.getInstance().setVisitas(lstV);

			menu.findItem(5).setVisible(false);
			if(lstV == null || lstV.isEmpty()){
				menu.findItem(2).setVisible(false);
			}
			if( Util.getInt(marco.agregado) == 0 ){
				menu.findItem(6).setVisible(false);
				menu.findItem(7).setVisible(false);
			}
		} 
		catch (ClassCastException e) {}
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		final AdapterContextMenuInfo info = (AdapterContextMenuInfo) item
				.getMenuInfo();
		Marco marco = (Marco) (info.targetView.getTag());
		App.getInstance().setMarco(marco);
		setEmpresa(marco);

		if (item.getItemId() == 1) {
			parent.setEsArrastre(true);
			parent.nextFragment(CuestionarioFragmentActivity.MARCO + 1);
		} else if (item.getItemId() == 2) {
			parent.setEsArrastre(true);
			parent.nextFragment(CuestionarioFragmentActivity.VISITAS);
		}
//		else if (item.getItemId() == 3) {
//			App.getInstance().setPlantilla(App.getInstance().getEmpresa());
//			App.getInstance().setRuc(marco);
//			ToastMessage.msgBox(this.getActivity(),
//					"Plantilla para calificación Establecida",
//					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
//		}

		else if (item.getItemId() == 5) {
			// eliminarCuest(marco, "DEL");
		} else if (item.getItemId() == 6) {
			// agregarComisaria(marco);
		} else if (item.getItemId() == 7) {
			// eliminarComisaria(marco);
		}

		return true;
	}
	
	private void setEmpresa(Marco marco){
		Caratula bean = new Caratula(1);
    	bean = getCuestionarioService().getCaratula(marco, 
    			bean.getSecCap(getListFields(bean, new String[]{"ID"}), false));
    	if (bean == null) {
    		bean = new Caratula(marco.id);
		}
		App.getInstance().setEmpresa(bean);
	}

	@Override
	public void onCancel() {
		
	}

	@Override
	public void onAccept() {
		
	}

	@Override
	protected View createUI() {
		buildFields();
		LinearLayout q0 = createQuestionSection(lblTitulo);
		LinearLayout q1 = createQuestionSection(grid1.component());
		LinearLayout q2 = createQuestionSection(tcMarcoCCCP.getTableView());
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		/* Aca agregamos las preguntas a la pantalla */
		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		// /*Aca agregamos las preguntas a la pantalla*/
		return contenedor;
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(getActivity(), App.ESTILO)
				.size(75, MATCH_PARENT).text(R.string.marco).centrar().textSize(24);
		
		tcMarcoCCCP = new TableComponent(getActivity(), this,
				App.ESTILO, true).size(600, 2000)
				.dataColumHeight(65).headerHeight(60).headerTextSize(15).filter("RUC");
		tcMarcoCCCP.addHeader(R.string.marco_1, 1.2f);
		tcMarcoCCCP.addHeader(R.string.marco_2, 2.5f, TableComponent.ALIGN.LEFT);
		tcMarcoCCCP.addHeader(R.string.marco_3, 1.5f);
		tcMarcoCCCP.addHeader(R.string.marco_4, 1.5f);
		tcMarcoCCCP.addHeader(R.string.marco_5, 1.5f);
		tcMarcoCCCP.addHeader(R.string.marco_6, 0.7f);
		tcMarcoCCCP.addHeader(R.string.marco_7, 1.5f);
		tcMarcoCCCP.addHeader(R.string.marco_8, 0.7f);
		tcMarcoCCCP.addHeader(R.string.marco_9, 0.7f);
		tcMarcoCCCP.addHeader(R.string.marco_10, 0.7f);
		tcMarcoCCCP.setCellColor(-1, 1, true);

		spnCODSEDEOPERATIVA = new SpinnerField(getActivity()).size(
				altoComponente + 15, 250).callback("onCodSedeOperativaChangeValue").keyString();//.title(MyUtil.getVacio("SEDE"));
		spnEQUIPO = new SpinnerField(getActivity()).size(altoComponente + 15,
				250).callback("onEquipoChangeValue").keyString();//.title(MyUtil.getVacio("CCDI"));
		spnRUTA = new SpinnerField(getActivity()).size(
				altoComponente + 15, 250).callback("onRutaChangeValue").keyString();//.title(MyUtil.getVacio("CCPP"));
		spnPERIODO = new SpinnerField(getActivity()).size(altoComponente + 15,
				250).callback("onPeriodoChangeValue").keyString();//.title(MyUtil.getVacioPer("PERIODO"));

		Util.llenarItems(getActivity(), spnCODSEDEOPERATIVA,  Util.getListObject(
				getSegmentacionService().getSedes(App.getInstance().getUsuario().cod_sede_operativa).toArray()), "SEDE OPERATIVA",true);
		if(App.getInstance().getUsuario().cod_sede_operativa != null){
			spnCODSEDEOPERATIVA.setSelectionKey(App.getInstance().getUsuario().cod_sede_operativa);
			spnCODSEDEOPERATIVA.setReadOnly();	
		}
		Util.llenarItems(getActivity(), spnEQUIPO,  Util.getListObject(
				getSegmentacionService().getEquipos(App.getInstance().getUsuario().cod_sede_operativa).toArray()), "EQUIPO",true);
		if(!Equipo.TODOS.equals(App.getInstance().getUsuario().equipo)){
			spnEQUIPO.setSelectionKey(App.getInstance().getUsuario().equipo);
			spnEQUIPO.setReadOnly();	
			Util.llenarItems(getActivity(), spnRUTA,  Util.getListObject(
					getSegmentacionService().getRutas(App.getInstance().getUsuario().cod_sede_operativa, 
							App.getInstance().getUsuario().equipo).toArray()), "RUTA",true);
		} else {
			Util.llenarItems(getActivity(), spnRUTA,  new ArrayList<Object>(), "RUTA",true);
		}
		
		if(!Ruta.TODOS.equals(App.getInstance().getUsuario().ruta)){
			spnRUTA.setSelectionKey(App.getInstance().getUsuario().ruta);
			spnRUTA.setReadOnly();	
			Util.llenarItems(getActivity(), spnPERIODO, Util.getListObject(
					getSegmentacionService().getPeriodos(App.getInstance().getUsuario().cod_sede_operativa, 
							App.getInstance().getUsuario().equipo, App.getInstance().getUsuario().ruta).toArray()), "PERIODO",true);
		} else {
			Util.llenarItems(getActivity(), spnPERIODO,  new ArrayList<Object>(), "PERIODO",true);
		}
		
		grid1 = new GridComponent2(getActivity(), 2);
		grid1.addComponent(spnCODSEDEOPERATIVA);
		grid1.addComponent(spnEQUIPO);
		grid1.addComponent(spnRUTA);
		grid1.addComponent(spnPERIODO);
	}

	private void clearCP(){
		tcMarcoCCCP.setData(null, "");
	}

	public void onPeriodoChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField)component;
		if(!spn.isTouched()) return;
		spn.setTouched(false);
		if(spn.getSelectedItemKey() == null) {
			clearCP();
			return;
		}
		Sede sede = (Sede) spnCODSEDEOPERATIVA.getValue();
		Equipo equipo = (Equipo) spnEQUIPO.getValue();
		Ruta ruta = (Ruta) spnRUTA.getValue();
		Periodo periodo = (Periodo) spnPERIODO.getValue();
		cargarMarco(sede, equipo, ruta, periodo);
	}

	public void onCodSedeOperativaChangeValue(FieldComponent component) {
		
	}

	public void onRutaChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField)component;
		if(!spn.isTouched()) return;
		spn.setTouched(false);
		clearCP();
		if(spn.getSelectedItemKey() == null) {
			clearSpinner(spnPERIODO); 
			return;
		}
		Equipo equipo = (Equipo) spnEQUIPO.getValue();
		Ruta ruta = (Ruta) component.getValue();
		Util.llenarItems(getActivity(), spnPERIODO, Util.getListObject(
				getSegmentacionService().getPeriodos(App.getInstance().getUsuario().cod_sede_operativa, 
						equipo.codigo, ruta.ruta).toArray()), "PERIODO",true);
		spnPERIODO.requestFocus();
	}

	public void onEquipoChangeValue(FieldComponent component) {
		SpinnerField spn = (SpinnerField)component;
		if(!spn.isTouched()) return;
		spn.setTouched(false);
		clearCP();
		clearSpinner(spnRUTA, spnPERIODO); 
		if(spn.getSelectedItemKey() == null) {
			return;
		}
		Equipo equipo = (Equipo) component.getValue();
		Util.llenarItems(getActivity(), spnRUTA,  Util.getListObject(
				getSegmentacionService().getRutas(App.getInstance().getUsuario().cod_sede_operativa, 
						equipo.codigo).toArray()), "RUTA",true);
		spnRUTA.requestFocus();
	}

	public void cargarMarco(Sede sede, Equipo equipo, Ruta ruta, Periodo periodo) {
		if (sede != null && equipo != null && ruta != null && periodo != null) {
			CODSEDE = sede;
			EQUIPO = equipo;
			RUTA = ruta;
			PERIODO = periodo;
			
			lstData  = getMarcoService().getMarco(sede.codigoSede, equipo.codigo, 
					ruta.ruta, periodo.periodo, FragmentForm.OPCION.TWO);
			
			tcMarcoCCCP.setData(lstData, "RUC", "RAZ_SOCIAL_LOCAL", "NOMBREDD", "NOMBREPP", "NOMBREDI", "ANIO_CONSTITUCION", 
					"EMPRESA_TIPO", "CIIU_V3", "CIIU_V4" , "FLAG");//CIIU_V4
			
		}
	}

	@Override
	public boolean grabar() {
		return true;
	}

	@Override
	public void cargarDatos() {
//		if(!isVisible()) return;
//		Log.e("PERIODO", "PERIODO: "+PERIODO);
//		Log.e("CODSEDE", "CODSEDE: "+CODSEDE);
//		Log.e("EQUIPO", "EQUIPO: "+EQUIPO);
//		Log.e("RUTA", "RUTA: "+RUTA);
		App.getInstance().setMarco(null);
		App.getInstance().setUbigeo(null);
		((CuestionarioFragmentActivity) parent).setTitulo(null);
		
		if (PERIODO != null && EQUIPO!=null && CODSEDE != null && RUTA != null) {
			cargarMarco(CODSEDE, EQUIPO, RUTA, PERIODO);
			spnCODSEDEOPERATIVA.setSelectionKey(CODSEDE.codigoSede);
			spnEQUIPO.setSelectionKey(EQUIPO.codigo);
			Util.llenarItems(getActivity(), spnRUTA,  Util.getListObject(
					getSegmentacionService().getRutas(App.getInstance().getUsuario().cod_sede_operativa, 
							EQUIPO.codigo).toArray()), "RUTA",true);
			spnRUTA.setSelectionKey(RUTA.ruta);
			Util.llenarItems(getActivity(), spnPERIODO,  Util.getListObject(
					getSegmentacionService().getPeriodos(App.getInstance().getUsuario().cod_sede_operativa, 
							App.getInstance().getUsuario().equipo, App.getInstance().getUsuario().ruta).toArray()), "PERIODO",true);
			spnPERIODO.setSelectionKey(PERIODO.periodo);
		} else if (CODSEDE != null && EQUIPO!=null && RUTA != null) {
			spnCODSEDEOPERATIVA.setSelectionKey(CODSEDE.codigoSede);
			spnEQUIPO.setSelectionKey(EQUIPO.codigo);
			Util.llenarItems(getActivity(), spnRUTA,  Util.getListObject(
					getSegmentacionService().getRutas(App.getInstance().getUsuario().cod_sede_operativa, 
							EQUIPO.codigo).toArray()), "RUTA",true);
			spnRUTA.setSelectionKey(RUTA.ruta);
		} else if (CODSEDE != null && EQUIPO != null) {
			spnCODSEDEOPERATIVA.setSelectionKey(CODSEDE.codigoSede);
			spnEQUIPO.setSelectionKey(EQUIPO.codigo);
		} else if (CODSEDE != null) {
			spnCODSEDEOPERATIVA.setSelectionKey(CODSEDE.codigoSede);
		}
		if (PERIODO != null) {
			spnPERIODO.setSelectionKey(PERIODO.periodo);
		}
		
		if(spnEQUIPO.isClickable()) spnEQUIPO.requestFocus();
		else if(spnRUTA.isClickable()) spnRUTA.requestFocus();
		else if(spnPERIODO.isClickable()) spnPERIODO.requestFocus();
	}
	
	private void inicio() {
		
	}

	public MarcoService getService() {
		if (service == null) {
			service = MarcoService.getInstance(getActivity());
		}
		return service;
	}

	public SegmentacionService getSegmentacionService() {
		if (segmentacionService == null) {
			segmentacionService = SegmentacionService
					.getInstance(getActivity());
		}
		return segmentacionService;
	}

	public UbigeoService getUbigeoService() {
		if (ubigeoService == null) {
			ubigeoService = UbigeoService.getInstance(getActivity());
		}
		return ubigeoService;
	}

	public MarcoService getMarcoService() {
		if (marcoService == null) {
			marcoService = MarcoService.getInstance(getActivity());
		}
		return marcoService;
	}
	
	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
}

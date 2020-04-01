package gob.inei.ene2019v2.fragment.ModVII;

import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.TableComponent.ALIGN;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.IDetailEntityComponent;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModVII.dialog.Mod_VII_Fragment_001_01;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Modulovii01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VII_Fragment_001 extends FragmentForm implements Respondible {

	Caratula caratula;
	private TableComponent tcSecIII;
	private List<String> data = new ArrayList<String>();
	private List<SP499> lstData;
	private List<Map<Field, Object>> lmap;
	public static int ESPECIFIQUE = 8;
	private DialogComponent dc;
	private SeccionCapitulo[] secCap;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	private CuestionarioService cuestionarioService;
	private Modulovii01 bean;
	private LabelComponent lblTitulo;
	private Caratula bean1;
	public Mod_VII_Fragment_001() {
	}

	public Mod_VII_Fragment_001 parent(MasterActivity parent) {
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
				.text(R.string.lbl_modvii_titlecap_1).textSize(22).centrar()
				.negrita();

		tcSecIII = new TableComponent(getActivity(), this, App.ESTILO)
				.size(790, 740).headerHeight(100).dataColumHeight(85);
		tcSecIII.setHeaderTextSize(15);
		tcSecIII.addHeader(R.string.c1c100m4p701_1, 3.5f, ALIGN.LEFT);
		tcSecIII.addHeader(R.string.lbl_title_modvii_preg1_2, 1f,
				RadioGroupOtherField.class, R.string.c2c300inf302_1_1,
				R.string.c2c300inf302_1_2);
		tcSecIII.setCellColor(-1, 0, true);
		tcSecIII.addCallback(1, "FuncionTable499");

	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */

		LinearLayout q0 = createQuestionSection(lblTitulo);

		LinearLayout q1 = createQuestionSection(R.string.c1c100m7p001_title,
				tcSecIII.getTableView(false));

		event();

		// ///////////////////////////
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		/* Aca agregamos las preguntas a la pantalla */
		form.addView(q0);
		form.addView(q1);

		return contenedor;
	}

	private void event() {
		tcSecIII.getListView().setOnItemClickListener(
				new OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
						SP499 c = (SP499) lstData.get(position);
						if (((Object) 1).equals(c.getValueMap("c7p701_"+ c.orden + "a"))) {
							abrirDetalle(c);
						}
						return;
					}
				});
	}

	public void abrirDetalle(SP499 bean) {
		FragmentManager fm = Mod_VII_Fragment_001.this.getFragmentManager();
		Mod_VII_Fragment_001_01 aperturaDialog = Mod_VII_Fragment_001_01
				.newInstance(this, bean);
		aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		aperturaDialog.show(fm, "aperturaDialog");
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
		String[] extrasx = null;
		extrasx = new String[] { "C7P702_1", "C7P702_2" };
		String[] extrasy = null;
		extrasy = new String[] { "C7P703_1", "C7P703_2", "C7P703_3",
				"C7P703_4", "C7P703_5", "C7P703_6", "C7P703_7", "C7P703_8",
				"C7P703_9", "C7P703_9ESP" };
		
		String[] extrast = null;
		extrast = new String[] { "C7P702_1", "C7P702_2" ,"C7P703_1", "C7P703_2", "C7P703_3",
				"C7P703_4", "C7P703_5", "C7P703_6", "C7P703_7", "C7P703_8",
				"C7P703_9", "C7P703_9ESP" };
		
		try {
//			
//			VERIFICACIÓN    :  Si C7P701_8A = 1  Pase a C7P701_8A_ESP and C7P701_8B=1,2 and sum(C7P701_1A: C7P701_7A)=14 pase Pase a C7P705_1
//					Si C7P701_8A = 1  Pase a C7P701_8A_ESP and C7P701_8B=1,2 and (C7P701_1B=1 or C7P701_2B=1 or C7P701_3B=1 or C7P701_4B=1)  Pase a C7P703_1
//					Si C7P701_8A = 1  Pase a C7P701_8A_ESP and C7P701_8B=1,2 and (C7P701_1B=2,vacio and C7P701_2B=2,vacio and  C7P701_3B=2,vacio and C7P701_4B=2,vacio)  Pase a C7P705_1

					if (Util.getInt(bean.c7p701_8a) == 1) {
						 if (  (Util.getInt(bean.c7p701_8b) == 1 || Util.getInt(bean.c7p701_8b) == 2 ) 
									&&  ( Util.getInt(bean.c7p701_1a)==2
											&& Util.getInt(bean.c7p701_2a) == 2  
											&& Util.getInt(bean.c7p701_3a) == 2 
											&& Util.getInt(bean.c7p701_4a) == 2 
											&& Util.getInt(bean.c7p701_5a) == 2 
											&& Util.getInt(bean.c7p701_6a) == 2 
											&& Util.getInt(bean.c7p701_7a) == 2   ) ) {	
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrast))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron t",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								} 
						 }
						 
						 if (  (Util.getInt(bean.c7p701_8b) == 1 || Util.getInt(bean.c7p701_8b) == 2 ) 
											&& (Util.getInt(bean.c7p701_1b)==1
											|| Util.getInt(bean.c7p701_2b) == 1
										    || Util.getInt(bean.c7p701_3b) == 1
											|| Util.getInt(bean.c7p701_4b) == 1  ) ) {	
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrasx))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron x",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								}								
						 }
						 
						 if ( (Util.getInt(bean.c7p701_8b) == 1 || Util.getInt(bean.c7p701_8b) == 2 ) 
								 && ( (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
											&& (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
										    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
											&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) ) ) {	
							if (!getCuestionarioService().saveOrUpdate(bean,
									getSecCap2(extrast))) {
								ToastMessage.msgBox(this.getActivity(),
										"Los datos no se guardaron t",
										ToastMessage.MESSAGE_ERROR,
										ToastMessage.DURATION_LONG);
							}								
						 }						
//							Si C7P701_8A = 2 and sum(C7P701_1A: C7P701_7A)=14 and P25=1,2  Pase a C7P702_1 luego pase C7P705_1
//									Si C7P701_8A = 2 and sum(C7P701_1A: C7P701_7A)=14 and P25>2 Pase a C7P705_1
//									Si C7P701_8A = 2 and (C7P701_1B=1 or C7P701_2B=1 or C7P701_3B=1 or C7P701_4B=1)  Pase a C7P703_1
//									Si C7P701_8A = 2 and (C7P701_1B=2,vacio and C7P701_2B=2,vacio and  C7P701_3B=2,vacio and C7P701_4B=2,vacio)  Pase a C7P705_1
					} else if (Util.getInt(bean.c7p701_8a) == 2) {
						 if (  (  Util.getInt(bean.c7p701_1a)==2
									&& Util.getInt(bean.c7p701_2a) == 2
								    && Util.getInt(bean.c7p701_3a) == 2
									&& Util.getInt(bean.c7p701_4a) == 2
									&& Util.getInt(bean.c7p701_5a) == 2
									&& Util.getInt(bean.c7p701_6a) == 2
									&& Util.getInt(bean.c7p701_7a) == 2 ) && (Util.getInt(bean1.p25) == 1 || Util.getInt(bean1.p25) == 2 )  ) {	
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrasy))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron y",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								}	 
						 }
						
						 if (  (  Util.getInt(bean.c7p701_1a)==2
									&& Util.getInt(bean.c7p701_2a) == 2
								    && Util.getInt(bean.c7p701_3a) == 2
									&& Util.getInt(bean.c7p701_4a) == 2
									&& Util.getInt(bean.c7p701_5a) == 2
									&& Util.getInt(bean.c7p701_6a) == 2
									&& Util.getInt(bean.c7p701_7a) == 2 ) &&Util.getInt(bean1.p25) >2  ) {	
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrast))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron t",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								}	 
						 }
						 
						 
							if ((Util.getInt(bean.c7p701_1b) == 1
									|| Util.getInt(bean.c7p701_2b) == 1
									|| Util.getInt(bean.c7p701_3b) == 1 
									|| Util.getInt(bean.c7p701_4b) == 1)) {
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrasx))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron x",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								}
							}							
							
							 if (  (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
										&& ( (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
									    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
										&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) ) &&Util.getInt(bean1.p25) >2  ) {	
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrast))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron t",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								}								
							 }	
							 
								if ((Util.getInt(bean.c7p701_1a) == 1
										|| Util.getInt(bean.c7p701_2a) == 1
										|| Util.getInt(bean.c7p701_3a) == 1
										|| Util.getInt(bean.c7p701_4a) == 1)
										&& ( (Util.getInt(bean.c7p701_1b) == 2 ||  Util.getInt(bean.c7p701_1b)==0) 
										&& ( Util.getInt(bean.c7p701_2b) == 2 || Util.getInt(bean.c7p701_2b)==0 )
										&& ( Util.getInt(bean.c7p701_3b) == 2 || Util.getInt(bean.c7p701_3b)==0 )
										&& ( Util.getInt(bean.c7p701_4b) == 2 || Util.getInt(bean.c7p701_4b)==0 )  )
										&& (Util.getInt(bean.c7p701_5a) == 2
												|| Util.getInt(bean.c7p701_6a) == 2 
												|| Util.getInt(bean.c7p701_7a) == 2)
										&& Util.getInt(bean1.p25) < 3) {
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrast))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron t",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								}								
							 }							 
							 
							 
							 if (  (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
										&& ( (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
									    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
										&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) )   
									&&	( ( Util.getInt(bean.c7p701_5a) == 1 )
										||	( Util.getInt(bean.c7p701_6a)==1 )
										|| (Util.getInt(bean.c7p701_7a) == 1 )  )
										&& Util.getInt(bean1.p25) < 3   ) {	
								if (!getCuestionarioService().saveOrUpdate(bean,
										getSecCap2(extrast))) {
									ToastMessage.msgBox(this.getActivity(),
											"Los datos no se guardaron t",
											ToastMessage.MESSAGE_ERROR,
											ToastMessage.DURATION_LONG);
								}								
							 }	
					}					
			
			if (!getCuestionarioService().saveOrUpdate(bean, secCap)) {
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
		error = false;

		if (lstData != null && lstData.size() > 0) {
			for (SP499 e : lstData) {
				Object o = e.getValueMap("c7p701_" + e.orden + "b");
				Object s = e.getValueMap("c7p701_" + e.orden + "a");
				if (o == null && e.getRg().equals("1")) {
					mensaje = "Falta Informacion para: " + e.nombre;
					view = tcSecIII;
					return !(error = true);
				}
				if (s == null) {
					mensaje = "Falta Informacion para: " + e.nombre;
					view = tcSecIII;
					return !(error = true);
				}
			}
		}
		return true;
	}

	@Override
	public void cargarDatos() {
		Modulovii01 mod4 = new Modulovii01();
		caratula = App.getInstance().getEmpresa();
		data = Arrays.asList(getResources().getStringArray(R.array.array_701));
		lstData = new ArrayList<SP499>();
		lmap = new ArrayList<Map<Field, Object>>();

		secCap = mod4.getSecCap(getListFields(mod4, "(_1|_2|_3|_4|_5|_6|_7|_8)", "c7p701",new String[] {"C7P701_8A_ESP"   }), false);
		 	

		bean = getCuestionarioService().getModulovii01(
				App.getInstance().getEmpresa(), secCap);

		if (bean == null) {
			bean = new Modulovii01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		bean1 = getCuestionarioService().getCaratula(
				App.getInstance().getEmpresa(),
				new Caratula().getSecCap(Util.getListList("P25")));
		if (bean1 == null) {
			bean1 = new Caratula();
			bean1.id = App.getInstance().getEmpresa().id;
		}
		Field[] fields = App.fields400Sp != null ? App.fields400Sp : bean
				.getClass().getDeclaredFields();
		for (int y = 1; y <= 8; y++) {
			lmap.add(bean.getGroup(fields, y, y == 8 ? 13 : 12));
		}

		entityToUI(bean);
		recargarLista();
		inicio();
	}

	public void reload() {
		setBorder();
		tcSecIII.reloadData();
	}

	private void recargarLista() {
		recargarLista(false);
	}

	public void recargarLista(boolean refresh) {
		setInfo();
		if (refresh) {
			tcSecIII.reloadAllDataForced(lstData);
		} else {
			tcSecIII.setData(lstData, "getNombre", "getRg");
		}
		setBorder();
	}

	private void setBorder() {
		for (int i = 0; i < lstData.size(); i++) {
			if (lstData.get(i).getRg().equals("2")
					|| (lstData.get(i).getRg().equals("1") && !lstData.get(i)
							.get499B().equals("")))
				tcSecIII.setBorderRow(i);
			else
				tcSecIII.setBorderRow(i, false);
		}
	}

	private void setInfo() {
		lstData.clear();
		for (int i = 0; i < data.size(); i++) {
			lstData.add(new SP499(i + 1, data.get(i), bean, lmap.get(i)));
		}
	}

	private void inicio() {
		tcSecIII.requestFocus();
	}

	public void FuncionTable499(Object entity, Integer row, Integer opcion) {
		if (entity != null) {
			SP499 tmp = (SP499) entity;
			if (opcion == 2 && tmp.getValueMap("c7p701_" + tmp.orden + "b") != null) {
				dc = new DialogComponent(
						getActivity(),
						this,
						DialogComponent.TIPO_DIALOGO.YES_NO,
						"Confirmar",
						"Ud. ya registro informacion para :"
								+ tmp.nombre
								+ "; Esta "
								+ "informacion sera eliminada; esta seguro que desea continuar?");
				dc.put("equipos", tmp);
				dc.showDialog();
			} else {
				// valida307(opcion, tmp.nombre);
				tmp.setValueMap("c7p701_" + tmp.orden + "a", opcion);
				reload();
			}
		}
	}

	public class SP499 extends Entity implements IDetailEntityComponent {
		private static final long serialVersionUID = 1L;
		public int orden;
		public String nombre;
		public Modulovii01 c700;
		public Map<Field, Object> info;

		public SP499() {
			// TODO Auto-generated constructor stub
		}
     
		public SP499(Integer orden, String nombre, Modulovii01 obj,Map<Field, Object> info) {
			this.orden = orden;
			this.nombre = nombre;
			this.c700 = obj;
			this.info = info;
		}

		public String getNombre() {
			return nombre ;
			
//			return nombre == null ? "" : nombre
//					+ (orden == Mod_VII_Fragment_001.ESPECIFIQUE
//							&& c700.c7p701_8h_esp != null ? " [ "
//							+ c700.c7p701_8h_esp + " ]" : "");
		}

		public String getRg() {
			Object val = getValueMap("c7p701_" + orden + "a");
			return val == null ? "" : val.toString();
		}

		public String get499B() {
			Object val = getValueMap("c7p701_" + orden + "b");
			return val == null ? "" : val.toString();
		}

		public Object getValueMap(String field) {
			for (Entry<Field, Object> e : info.entrySet()) {
				if (e.getKey().getName().equals(field))
					return e.getValue();
			}
			return null;
		}

		public void setValueMap(Object value) {
			setValueMap(null, value);
		}

		public void setValueMap(String key, Object value) {
			for (Entry<Field, Object> e : info.entrySet()) {
				Field field = e.getKey();
				if (key == null || field.getName().equals(key)) {
					e.setValue(value);
					try {
						field.set(c700, value);
					} catch (IllegalAccessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IllegalArgumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (key != null)
						break;
				}
			}
		}

		@Override
		public boolean isTitle() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void cleanEntity() {
			// TODO Auto-generated method stub

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
	public void onCancel() {
		SP499 e = (SP499) dc.get("equipos");
		if (e != null) {
			e.setValueMap("c7p701_" + e.orden + "a", 1);
		}
		reload();
	}

	@Override
	public void onAccept() {
		SP499 e = (SP499) dc.get("equipos");
		if (e != null) {
			e.setValueMap(null);
			e.setValueMap("c7p701_" + e.orden + "a", 2);
		}
		reload();
	}

	@Override
	public Entity getEntity() {
		return bean;
	}
}

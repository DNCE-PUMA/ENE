package gob.inei.ene2019v2.fragment.ModIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.IDetailEntityComponent;
import gob.inei.dnce.util.Calculo;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIII.dialog.Mod_III_Fragment_01_det;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.ModuloIII_det;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

@SuppressLint("ResourceAsColor") public class Mod_III_Fragment_001_ extends FragmentForm  {

	@FieldAnnotation(orderIndex = 1)
	public IntegerField txtC3P301;
	
	public TableComponent tcCAP1_1;
	private List<DETALLES> lstData;
	private List<ModuloIII_det> lstDetalle;
	private List<String> data = new ArrayList<String>();
	
	private Moduloiii01 bean;
	private Caratula caratula;

	private static int OMISION = 99999;
	public TableComponent tcTabla1;
	private LabelComponent lblTitulo, lblsubtitulo, lbl1, lblflag1, lblflag2,
			lblflag3, lblflag4, lblflag5, lblflag6, lblflag7, lblflag8,
			lblflag9, lblflag10, lblflag11, lblflag12;
	LinearLayout q0, q1, q2, q3, q4;
	public GridComponent grid, grid2;

	private CuestionarioService cuestionarioService;
	SeccionCapitulo[] seccionesCargadoDocente;

	SeccionCapitulo[] seccionesCargadoTabla2;
	SeccionCapitulo[] seccionesCargado, seccionesGrabadoCheck;
	SeccionCapitulo[] seccionesGrabado, seccionesGrabadoOM , seccionesGrabado2;
	private int contChecks;
	private View viewP3;
	P3_1ClickListener adapter;
	SeccionCapitulo[] campos, camposdelete, secciones;
	// Detalle detalle ;
	private boolean esCargaInicial;

	enum ACTION {
		EJECUTAR_VER1
	}

	private ACTION action;
	private boolean avance1;

	// private List<Integer> desabilita18;

	// Declaracion de variables
	private DialogComponent dc;
	private DialogComponent dialog;

	//////////////////////////////////////////
	int valortotal1 = 0, valorhombre1 = 0, valormujer1 = 0;
	int valortotal2 = 0, valorhombre2 = 0, valormujer2 = 0;
	int valortotal3 = 0, valorhombre3 = 0, valormujer3 = 0;
	int valortotal4 = 0, valorhombre4 = 0, valormujer4 = 0;
	int valortotal5 = 0, valorhombre5 = 0, valormujer5 = 0;

	int valortotal7 = 0, valorhombre7 = 0, valormujer7 = 0;
	int valortotal8 = 0, valorhombre8 = 0, valormujer8 = 0;
	int valortotal9 = 0, valorhombre9 = 0, valormujer9 = 0;
	int valortotal10 = 0, valorhombre10 = 0, valormujer10 = 0;
	int valortotal11 = 0, valorhombre11 = 0, valormujer11 = 0;

	int valortotal14 = 0, valorhombre14 = 0, valormujer14 = 0;

	int total01_05 = 0, total01_05h = 0, total01_05m = 0;

	int total07_11 = 0, total07_11h = 0, total07_11m = 0;

	int total06_12 = 0, total06_12h = 0, total06_12m = 0;
	//////////////////////////////////////////
	
	public Mod_III_Fragment_001_() {
	}

	public Mod_III_Fragment_001_ parent(MasterActivity parent) {
		this.parent = parent;
		return this;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = createUI();
		initObjectsWithoutXML(this, rootView);
		enlazarCajas();
		listening();
		adapter = new P3_1ClickListener();
		tcCAP1_1.getListView().setOnItemClickListener(adapter);

		seccionesCargadoDocente = new SeccionCapitulo[] { new SeccionCapitulo(
				-1, -1, -1, "ID", "NIVEL_ID", "ORDEN_INI", "DET_ID") };

		seccionesCargado = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1,
				-1, "ID", "DET_ID", "DDOC_04_001_INI19", "DDOC_04_002_INI19") };

	
	
		
		seccionesGrabado = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1,
				-1, "C3P301") };
		
		seccionesGrabadoOM = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1,
				-1, "C3P301_OMI") };

		campos = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C3P301_ID", "C3P301_ID_ETIQ", "C3P301A", "C3P301A_1", "C3P301A_2",
				"C3P301A_TOT", "C3P301E_1") };
		

		return rootView;
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text(R.string.mod3_titulo).textSize(21).centrar().negrita();

		txtC3P301 = new IntegerField(this.getActivity(), false)
		.size(altoComponente, 100).centrar().negrita().maxLength(6);
			
		tcCAP1_1 = new TableComponent(getActivity(),  this,App.ESTILO, true).size(1250, 800);
		tcCAP1_1.addHeader(R.string.c1c300categoria, 3.2f,TableComponent.ALIGN.LEFT);
		tcCAP1_1.addHeader(R.string.c1c300trabajadores, 0.38f,CheckBoxField.class);
		tcCAP1_1.addHeader(R.string.c1c302_4, 0.9f,TableComponent.ALIGN.LEFT);
		tcCAP1_1.addHeader(R.string.c1c302_5, 0.9f,TableComponent.ALIGN.LEFT);
		tcCAP1_1.addHeader(R.string.c1c302_6, 0.9f,TableComponent.ALIGN.LEFT);
		
		tcCAP1_1.addCallback(2, "tcFuncionRegantes");
		tcCAP1_1.addCallback(3, "tcFuncionRegantes");
		tcCAP1_1.setHeaderHeight(altoComponente + 32);
		tcCAP1_1.setDataColumHeight(altoComponente + 20);

		grid2 = new GridComponent(this.getActivity(), Gravity.CENTER, 1);
		grid2.addComponent(tcCAP1_1.getTableView());
		grid2.colorFondo(R.color.transparent);
		grid2.component();

	}

	@SuppressLint("ResourceAsColor")
	public void tcFuncionRegantes(Object entity, Integer row, Integer opcion)
			throws SQLException {
		if (entity != null) {
			DETALLES tmp = lstData.get(row);
			Log.e ("opcion" , opcion + "");

			if (!Util.esDiferente(opcion, 1)) {
				tmp.detalle.c3p301a = opcion;
				// tmp.detalle.p102_2 = tmp.nombre;
				getCuestionarioService().saveOrUpdate(tmp.detalle, campos);
				refrescarTabla();
			} else {
				// dismissDialog(row);
				tmp.detalle.c3p301a = opcion;
				tmp.detalle.c3p301a_1 = null;
				tmp.detalle.c3p301a_2 = null;				
				tmp.detalle.c3p301a_tot = null;
				tmp.detalle.c3p301e_1 = null;
				// tmp.detalle.p102_2 = tmp.nombre;
				getCuestionarioService().saveOrUpdate(tmp.detalle, campos);
				refrescarTabla();
				// se graba el check cuando se marca NO::
//				seccionesGrabadoCheck = new SeccionCapitulo[] { new SeccionCapitulo(
//						-1, -1, -1, "DDOC_04_001_INI19", "DDOC_04_002_INI19") };
//				
//				getCuestionarioService().saveOrUpdate(bean,	seccionesGrabadoCheck);

			}
		}
	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */
		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.mod3_preg1, Gravity.CENTER
				| Gravity.CENTER_VERTICAL,txtC3P301, grid2);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		/* Aca agregamos las preguntas a la pantalla */
		form.addView(q0);
		form.addView(q1);
		/* Aca agregamos las preguntas a la pantalla */
		return contenedor;
	}

	@Override
	public boolean grabar() {
		uiToEntity(bean);
		if (!validar()) {
			if (error) {
				if (!mensaje.equals(""))
					ToastMessage.msgBox(this.getActivity(), mensaje,
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				if (view != null)
					view.requestFocus();
			}
			return false;
		}
	
		try {
			int Total301 = Integer.parseInt(txtC3P301.getText().toString());
			if (Total301==0) {
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
//								"C2P203_1",
//								"C2P203_2",
//								"C2P203_3",
//								"C2P204",
//								"C2P204_ESP",
//								"C2P205",
//								"C2P206",
//								"C2P206_ESP",
//								"C2P207",
//								"C2P208",
//								"C2P208_ESP",
//								"C2P209",
//								"C2P209A",
//								"C2P209A_ESP",
//								"C2P210",
//								"C2P212",
//								"C2P212_ESP",
//								"C2P217",
//								"C2P219",
//								"C2P219_ESP",
//								"C2P221_1",
//								"C2P221_2",
//								"C2P221_3",
//								"C2P221_4",
//								"C2P221_5",
//								"C2P221_6",
//								"C2P221_7",
//								"C2P221_8",
//								"C2P221_9",
//								"C2P221_9ESP",
//								"C2P221_10",
//								"C2P222"			
						})))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			}else{
		
				if (!getCuestionarioService().saveOrUpdate(bean,
						seccionesGrabado)) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no pudieron ser guardados.",
							ToastMessage.MESSAGE_INFO,
							ToastMessage.DURATION_SHORT);
					return false;
				}
			}

		} catch (SQLException e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_SHORT);
			return false;
		}
		return true;
	}

	private boolean validar() {
		error = false;
		if (!isInRange())
			return false;

		String preguntaVacia = this.getResources().getString(R.string.pregunta_no_vacia);
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		
		if (Util.esVacio(txtC3P301)) {
		mensaje = pregunta_no_vacia.replace("$", "Pregunta 301");
		view = txtC3P301;
		return !(error = true);
	}
		
		int valor1 = 0;

		for (int x = 0; x < lstData.size(); x++) {

				if (!Util.esDiferente(lstData.get(x).detalle.c3p301a, 1)) {
					if (Util.esVacio(lstData.get(x).detalle.c3p301a_1)) {
						ToastMessage.msgBox(this.getActivity(),
								"Ingresar Informaci�n en el Item : "    
										+ "\n"  +  lstData.get(x).codigo  + " - " + lstData.get(x).nombre,
								ToastMessage.MESSAGE_INFO,
								ToastMessage.DURATION_LONG);
						view = tcCAP1_1;
						error = true;
						return false;
					}
				}

				if (Util.esDiferente(lstData.get(x).detalle.c3p301a, 1)) {
					valor1++;
				}
            
	//		}
		}

		
		int Total301 = Integer.parseInt(txtC3P301.getText().toString());
		if (Util.getInt(bean.c3p301_omi) ==1 ){
			if (Total301 !=  (Util.getInt(total06_12) +  Util.getInt(valortotal14) ) ) {
				mensaje = "Error: N�mero de personas que laboran en la empresa debe coincidir a la suma de trabajadores por CATEGOR�A";
				view = txtC3P301;
				return !(error = true);
			}	
		}

		
		return true;
	}

	private class P3_1ClickListener implements OnItemClickListener {

		public P3_1ClickListener() {
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			DETALLES c = (DETALLES) lstData.get(arg2);
			
			if ( Util.getInt(arg2)==5 || Util.getInt(arg2)==11 || Util.getInt(arg2)==12  )  {
				return;
			}
			
			if ( Util.esDiferente(c.detalle.c3p301a, 1) ) {
				return;
			}
			abrirDetalle(arg2);
		}
	}

	private void abrirDetalle(int index) {
		FragmentManager fm = getFragmentManager();
		Mod_III_Fragment_01_det aperturaDialog = Mod_III_Fragment_01_det
				.newInstance(this, (DETALLES) lstData.get(index), index,bean);
		aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		aperturaDialog.show(fm, "aperturaDialog");
	}

	@Override
	public void cargarDatos() {
				
		caratula = App.getInstance().getEmpresa();

		bean = getCuestionarioService().getModuloiii01(
				App.getInstance().getEmpresa(),
				new Moduloiii01().getSecCap(getListFields(this)));
		
		if (bean == null) {
			bean = new Moduloiii01();
			bean.id = App.getInstance().getEmpresa().id;
		}
		
		entityToUI(bean);

		lstDetalle = getCuestionarioService().getModuloIII_det(
				bean, campos);
		// carga array
		data = Arrays.asList(getResources().getStringArray(
				R.array.c1c300trabajadores_item));

		lstData = new ArrayList<Mod_III_Fragment_001_.DETALLES>();

		List<DETALLES> lste = new ArrayList<DETALLES>();
		boolean flag = false;
		for (int x = 0, i = 0; x < data.size() && i < 14; i++, x++) {
			if (lstDetalle != null && lstDetalle.size() > 0) {
				flag = false;
				for (ModuloIII_det ac : lstDetalle) {
					if (Util.getInt(ac.c3p301_id_etiq, 0) == x + 1) {
						lste.add(new DETALLES(i + 1, x + 1, data.get(x), ac));
						flag = true;
						break;
					}
				}
				if (!flag) {
					lste.add(new DETALLES(i + 1, x + 1, data.get(x),
							new ModuloIII_det(
									App.getInstance().getEmpresa().id,
									 i + 1, x + 1)));
				}
			} else {
				lste.add(new DETALLES(i + 1, x + 1, data.get(x),
						new ModuloIII_det(App.getInstance().getEmpresa().id,
								 i + 1, x + 1)));
			}
		}
		lstData.addAll(lste);
		
		
		inicio();
		refrescarTabla();

	}

	public void reloadData() {
		tcCAP1_1.reloadData();
		// setBorder();
	}

	public void refrescarTabla() {
		tcCAP1_1.setData(lstData, "getNombre", "getOpcion" , "getTotal", "getHombre", "getMujeres");
		tcCAP1_1.setBorderBlock(true,0,5,11,12);
		tcCAP1_1.setBorderBlock(true,1,5,11,12);
		tcCAP1_1.setBorderBlock(true,2,5,11,12);
		tcCAP1_1.setCellColor(5, -1, R.color.celesteclarito, true);
		tcCAP1_1.setCellColor(11, -1, R.color.celesteclarito, true);
		tcCAP1_1.setCellColor(12, -1, R.color.celesteclarito, true);
		setBorder();
		totales();
		registerForContextMenu(tcCAP1_1.getListView());
	}

	public void recarga() {

		lstDetalle = getCuestionarioService().getModuloIII_det(
				bean, campos);
		// carga array
		data = Arrays.asList(getResources().getStringArray(
				R.array.c1c300trabajadores_item));

		lstData = new ArrayList<Mod_III_Fragment_001_.DETALLES>();

		List<DETALLES> lste = new ArrayList<DETALLES>();
		boolean flag = false;
		for (int x = 0, i = 0; x < data.size() && i < 14; i++, x++) {
			if (lstDetalle != null && lstDetalle.size() > 0) {
				flag = false;
				for (ModuloIII_det ac : lstDetalle) {
					if (Util.getInt(ac.c3p301_id_etiq, 0) == x + 1) {
						// Log.e("ac.c3p301_id:::",
						// String.valueOf(ac.c3p301_id));
						lste.add(new DETALLES(i + 1, x + 1, data.get(x), ac));
						flag = true;
						break;
					}
				}
				if (!flag) {
					lste.add(new DETALLES(i + 1, x + 1, data.get(x),
							new ModuloIII_det(
									App.getInstance().getEmpresa().id,
									 i + 1, x + 1)));
				}
			} else {
				lste.add(new DETALLES(i + 1, x + 1, data.get(x),
						new ModuloIII_det(App.getInstance().getEmpresa().id,
								 i + 1, x + 1)));
			}
		}
		lstData.addAll(lste);
	}

	public class DETALLES extends Entity implements IDetailEntityComponent {
		private static final long serialVersionUID = 1L;
		public int codigo;
		public int orden;
		public String nombre;
		public ModuloIII_det detalle;

		public DETALLES() {
			// TODO Auto-generated constructor stub
		}

		public DETALLES(Integer codigo, Integer orden, String nombre,
				ModuloIII_det detalle) {
			this.codigo = codigo;
			this.orden = orden;
			this.nombre = nombre;
			this.detalle = detalle;
		}

		public DETALLES(Integer orden, String nombre, ModuloIII_det detalle) {
			this.orden = orden;
			this.nombre = nombre;
			this.detalle = detalle;
		}

		public String getNombre() {
			return nombre == null ? "" : nombre;
		}
		
		public String getOpcion() {
			return (detalle.c3p301a == null ? "0" : String.valueOf(detalle.c3p301a));
		}
		
		public String getTotal() {
			return (detalle.c3p301a_tot == null ? "0" : String.valueOf(detalle.c3p301a_tot));
		}
		
		public String getHombre() {
			return (detalle.c3p301a_1 == null ? "0" : String.valueOf(detalle.c3p301a_1));
		}
		public String getMujeres() {
			return (detalle.c3p301a_2 == null ? "0" : String.valueOf(detalle.c3p301a_2));
		}

		@Override
		public boolean isTitle() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void cleanEntity() {
			detalle.c3p301a = null;
			detalle.c3p301a_1 = null;
			detalle.c3p301a_2 = null;
			detalle.c3p301a_tot = null;
			detalle.c3p301e_1 = null;
		}
	}

	private void inicio() {
		txtC3P301.requestFocus();
		tcCAP1_1.setBorderBlock(true,0,5,11,12);
		tcCAP1_1.setBorderBlock(true,1,5,11,12);
		tcCAP1_1.setBorderBlock(true,2,5,11,12);
		tcCAP1_1.setCellColor(5, -1, R.color.celesteclarito, true);
		tcCAP1_1.setCellColor(11, -1, R.color.celesteclarito, true);
		tcCAP1_1.setCellColor(12, -1, R.color.celesteclarito, true);
		txtC3P301.requestFocus();
	}

	private void setBorder() {
		for (int x = 0; x < lstData.size(); x++) {
			DETALLES detalles = lstData.get(x);
			// if (!Util.esDiferente(detalles.orden, 1, 2, 5, 8, 9, 11)) {
			// if (!Util.esDiferente(detalles.orden, 1, 2, 5, 8, 9,10, 11)) {
	//		Log.e("bb", x + " - " +   lstData.get(x).detalle.c3p301a + "");
	//		Log.e("cc", x + " - " +   lstData.get(x).detalle.c3p301a_1 + "");
		//	Log.e("cc", lstData.get(x).detalle.c3p301a_1 + "");
			
			if (!Util.esDiferente(lstData.get(x).detalle.c3p301a, 1)
					&& !Util.esVacio(lstData.get(x).detalle.c3p301a_1)) {
				tcCAP1_1.setBorderRow(x);
			} else if (!Util.esDiferente(lstData.get(x).detalle.c3p301a, 1)
					&& Util.esVacio(lstData.get(x).detalle.c3p301a_1)) {
				tcCAP1_1.setBorderRow(x, false);
			} else if (Util.esDiferente(lstData.get(x).detalle.c3p301a, 1)){
				tcCAP1_1.setBorderRow(x, false);
			}
					
		}
	}
	
	
	private void totales() {
		
		for (int x = 0; x < lstData.size(); x++) {
			DETALLES tmp = lstData.get(x);
		//	Log.e ("xxx " , x + "");
		
			valortotal1 =   (Util.getInt(lstData.get(0).detalle.c3p301a_tot)); 
			valortotal2 =   (Util.getInt(lstData.get(1).detalle.c3p301a_tot));
			valortotal3 =   (Util.getInt(lstData.get(2).detalle.c3p301a_tot));
			valortotal4 =   (Util.getInt(lstData.get(3).detalle.c3p301a_tot));
			valortotal5 =   (Util.getInt(lstData.get(4).detalle.c3p301a_tot));
			
			valorhombre1 =   (Util.getInt(lstData.get(0).detalle.c3p301a_1)); 
			valorhombre2 =   (Util.getInt(lstData.get(1).detalle.c3p301a_1));
			valorhombre3 =   (Util.getInt(lstData.get(2).detalle.c3p301a_1));
			valorhombre4 =   (Util.getInt(lstData.get(3).detalle.c3p301a_1));
			valorhombre5 =   (Util.getInt(lstData.get(4).detalle.c3p301a_1));
			
			valormujer1 =   (Util.getInt(lstData.get(0).detalle.c3p301a_2)); 
			valormujer2 =   (Util.getInt(lstData.get(1).detalle.c3p301a_2));
			valormujer3 =   (Util.getInt(lstData.get(2).detalle.c3p301a_2));
			valormujer4 =   (Util.getInt(lstData.get(3).detalle.c3p301a_2));
			valormujer5 =   (Util.getInt(lstData.get(4).detalle.c3p301a_2));
			
			valortotal7 =   (Util.getInt(lstData.get(6).detalle.c3p301a_tot)); 
			valortotal8 =   (Util.getInt(lstData.get(7).detalle.c3p301a_tot));
			valortotal9 =   (Util.getInt(lstData.get(8).detalle.c3p301a_tot));
			valortotal10 =  (Util.getInt(lstData.get(9).detalle.c3p301a_tot));
			valortotal11 =  (Util.getInt(lstData.get(10).detalle.c3p301a_tot));
			
			
			valorhombre7 =   (Util.getInt(lstData.get(6).detalle.c3p301a_1)); 
			valorhombre8 =   (Util.getInt(lstData.get(7).detalle.c3p301a_1));
			valorhombre9 =   (Util.getInt(lstData.get(8).detalle.c3p301a_1));
			valorhombre10 =   (Util.getInt(lstData.get(9).detalle.c3p301a_1));
			valorhombre11 =   (Util.getInt(lstData.get(10).detalle.c3p301a_1));
			
			valormujer7 =   (Util.getInt(lstData.get(6).detalle.c3p301a_2)); 
			valormujer8 =   (Util.getInt(lstData.get(7).detalle.c3p301a_2));
			valormujer9 =   (Util.getInt(lstData.get(8).detalle.c3p301a_2));
			valormujer10 =   (Util.getInt(lstData.get(9).detalle.c3p301a_2));
			valormujer11 =   (Util.getInt(lstData.get(10).detalle.c3p301a_2));
			
			valortotal14 =   (Util.getInt(lstData.get(13).detalle.c3p301a_tot));
			valorhombre14 =   (Util.getInt(lstData.get(13).detalle.c3p301a_1));
			valormujer14 =   (Util.getInt(lstData.get(13).detalle.c3p301a_2));
			
		
			
			if (x  < 5){
				//Log.e ("xx", lstData.get(x).detalle.c3p301a_tot +"");
				if (!Util.esDiferente(lstData.get(x).detalle.c3p301a_tot, OMISION)){
					total01_05 = OMISION;
				//	 break;
				}else{
					if ( Util.getInt(valortotal1)  == OMISION  || Util.getInt(valortotal2)  == OMISION ||  Util.getInt(valortotal3) == OMISION ||  Util.getInt(valortotal4) == OMISION ||  Util.getInt(valortotal5) ==OMISION ){
						total01_05 = OMISION;
					}else{
						total01_05 = Util.getInt(valortotal1) + Util.getInt(valortotal2) + Util.getInt(valortotal3) + Util.getInt(valortotal4)	+ Util.getInt(valortotal5);	
					}			
				}
				
				if (!Util.esDiferente(lstData.get(x).detalle.c3p301a_1, OMISION)){
					total01_05h = OMISION;
					// break;
				}else{
					if ( Util.getInt(valorhombre1)  == OMISION  || Util.getInt(valorhombre2)  == OMISION ||  Util.getInt(valorhombre3) == OMISION ||  Util.getInt(valorhombre4) == OMISION ||  Util.getInt(valorhombre5) ==OMISION ){
						total01_05h = OMISION;
					}else{
						total01_05h = Util.getInt(valorhombre1) + Util.getInt(valorhombre2) + Util.getInt(valorhombre3) + Util.getInt(valorhombre4)	+ Util.getInt(valorhombre5);
					}	
					
				}
				
				if (!Util.esDiferente(lstData.get(x).detalle.c3p301a_2, OMISION)){
					total01_05m = OMISION;
					// break;
				}else{
					if ( Util.getInt(valormujer1)  == OMISION  || Util.getInt(valormujer2)  == OMISION ||  Util.getInt(valormujer3) == OMISION ||  Util.getInt(valormujer4) == OMISION ||  Util.getInt(valormujer5) ==OMISION ){
						total01_05m = OMISION;
					}else{
						total01_05m = Util.getInt(valormujer1) + Util.getInt(valormujer2) + Util.getInt(valormujer3) + Util.getInt(valormujer4)	+ Util.getInt(valormujer5);  
					}
					
				}				
			}
						
			if (x  >= 6  &&  x <= 10){
				//Log.e ("xxx de 6 a 10", x +"");
				//Log.e ("xx", lstData.get(x).detalle.c3p301a_tot +"");
				
				
				if (!Util.esDiferente(lstData.get(x).detalle.c3p301a_tot, OMISION)){
					total07_11 = OMISION;
					//break;
				}else{
					if ( Util.getInt(valortotal7)  == OMISION  || Util.getInt(valortotal8)  == OMISION ||  Util.getInt(valortotal9) == OMISION ||  Util.getInt(valortotal10) == OMISION ||  Util.getInt(valortotal11) ==OMISION ){
						total07_11 = OMISION;							
					}else{
						total07_11 = Util.getInt(valortotal7) + Util.getInt(valortotal8) + Util.getInt(valortotal9) + Util.getInt(valortotal10)	+ Util.getInt(valortotal11);	
					}
					    
				}	
				if (!Util.esDiferente(lstData.get(x).detalle.c3p301a_1, OMISION)){
					total07_11h = OMISION;
					// break;
				}else{
					if ( Util.getInt(valorhombre7)  == OMISION  || Util.getInt(valorhombre8)  == OMISION ||  Util.getInt(valorhombre9) == OMISION ||  Util.getInt(valorhombre10) == OMISION ||  Util.getInt(valorhombre11) ==OMISION ){
						total07_11h = OMISION;							
					}else{
						total07_11h = Util.getInt(valorhombre7) + Util.getInt(valorhombre8) + Util.getInt(valorhombre9) + Util.getInt(valorhombre10)	+ Util.getInt(valorhombre11);
					}						
					
				}
				
				if (!Util.esDiferente(lstData.get(x).detalle.c3p301a_2, OMISION)){
					total07_11m = OMISION;
					// break;
				}else{
					if ( Util.getInt(valormujer7)  == OMISION  || Util.getInt(valormujer8)  == OMISION ||  Util.getInt(valormujer9) == OMISION ||  Util.getInt(valormujer10) == OMISION ||  Util.getInt(valormujer11) ==OMISION ){
						total07_11m = OMISION;							
					}else{
						total07_11m = Util.getInt(valormujer7) + Util.getInt(valormujer8) + Util.getInt(valormujer9) + Util.getInt(valormujer10)	+ Util.getInt(valormujer11);  
					}					
				}				
			}
			
			
			if ( Util.getInt(valorhombre14)  == OMISION  || Util.getInt(valormujer14)  == OMISION  ){
				valortotal14 = OMISION;
			}else{
				valortotal14 = Util.getInt(valorhombre14) + Util.getInt(valormujer14) ;	
			}	
			
			
			if (total01_05 == OMISION || total07_11 == OMISION) {
				total06_12 = OMISION;
				total06_12h = OMISION;
				total06_12m = OMISION;
				// break;
			}else{
				total06_12 = Util.getInt(total01_05) + Util.getInt(total07_11)  ;	
				total06_12h = Util.getInt(total01_05h) + Util.getInt(total07_11h)  ;	
				total06_12m = Util.getInt(total01_05m) + Util.getInt(total07_11m)  ;	
			}

						
			if (x == 5) {
			//Log.e ("entro " ," position 5");
				tmp.detalle.c3p301_id = 6;
				tmp.detalle.c3p301a_tot = total01_05;
				tmp.detalle.c3p301a_1 = total01_05h;
				tmp.detalle.c3p301a_2 = total01_05m;
			}

			if (x== 11) {
				//Log.e ("entro " ," position 11");
				tmp.detalle.c3p301_id = 12;
				tmp.detalle.c3p301a_tot = total07_11;
				tmp.detalle.c3p301a_1 = total07_11h;
				tmp.detalle.c3p301a_2 = total07_11m;
			}

			if (x == 12) {
				//Log.e ("entro " ," position 12");
				tmp.detalle.c3p301_id = 13;
				tmp.detalle.c3p301a_tot = total06_12;
				tmp.detalle.c3p301a_1 = total06_12h;
				tmp.detalle.c3p301a_2 = total06_12m;
				
			}
			
//			if (x == 13) {
//				Log.e ("entro " ," position 13");	
//					tmp.detalle.c3p301_id = 14;
//					tmp.detalle.c3p301a_tot = valortotal14;
//					tmp.detalle.c3p301a_1 = valorhombre14;
//					tmp.detalle.c3p301a_2 = valormujer14;			
//			}
			
			try {
				if (!getCuestionarioService().saveOrUpdate(tmp.detalle, campos)) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron ",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

		}

		try {
			if (total06_12 == OMISION || valortotal14 == OMISION) {
				bean.c3p301_omi = 9;
			} else {
				bean.c3p301_omi = 1;
			}

			if (!getCuestionarioService()
					.saveOrUpdate(bean, seccionesGrabadoOM)) {
				ToastMessage.msgBox(this.getActivity(),
						"Los datos no pudieron ser guardados.",
						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_SHORT);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.e ("total01_05" , total01_05 +"");
		Log.e ("total07_11" , total07_11 +"");
		Log.e ("total06_12" , total06_12 +"");
		
	//	Log.e ("total06_12h" , total06_12h +"");
	//	Log.e ("total06_12m" , total06_12m +"");
		Log.e ("valortotal14" , valortotal14 +"");
		Log.e ("bean omi", bean.c3p301_omi + "");		


	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

	public void onCancel() {
		// TODO Auto-generated method stub
		if (action == ACTION.EJECUTAR_VER1) {
			return;
		}
	}

	public void onAccept() {
		// TODO Auto-generated method stub

	}
	



}

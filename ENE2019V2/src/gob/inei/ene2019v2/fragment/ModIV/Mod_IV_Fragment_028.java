package gob.inei.ene2019v2.fragment.ModIV;

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
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIV.Dialog.Mod_IV_Fragment_028_01;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloiv03;
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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IV_Fragment_028 extends FragmentForm implements Respondible {
  
	private CuestionarioService cuestionarioService;
	private Moduloiv03 bean;
	Caratula caratula;
	private LabelComponent lblTitulo, lblTitulo1;
	private TableComponent tcSecIII;
	private List<String> data = new ArrayList<String>();
	private List<SP499> lstData;
	private List<Map<Field, Object>> lmap;
	public static int ESPECIFIQUE = 6;
	private DialogComponent dc;
	private SeccionCapitulo[] secCap;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_IV_Fragment_028() {
	}

	public Mod_IV_Fragment_028 parent(MasterActivity parent) {
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
				.text(R.string.c1c100m4p499title).textSize(20).centrar()
				.negrita();

		tcSecIII = new TableComponent(getActivity(), this, App.ESTILO)
				.size(600, 740).headerHeight(100).dataColumHeight(75);
		tcSecIII.setHeaderTextSize(15);
		tcSecIII.addHeader(R.string.c1c100m4p499_1, 3.5f, ALIGN.LEFT);
		tcSecIII.addHeader(R.string.c2c300inf313SiNo1, 1f,RadioGroupOtherField.class, R.string.c2c300inf302_1_1,R.string.c2c300inf302_1_2);
		tcSecIII.setCellColor(-1, 0, false);
		tcSecIII.addCallback(1, "FuncionTable499");

	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);

		q2 = createQuestionSection(R.string.c1c100m4p499,tcSecIII.getTableView(false));

		event();

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q2);

		return contenedor;
	}

	private void event() {
		tcSecIII.getListView().setOnItemClickListener(
				new OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> parent, View view,
							int position, long id) {
						SP499 c = (SP499) lstData.get(position);
						if (((Object) 1).equals(c.getValueMap("c4p499a_"+ c.orden))) {
							abrirDetalle(c);
						}
//						if (((Object) 2).equals(c.getValueMap("c4p499a_"
//								+ c.orden))) {
//							 return; //abrirDetalle(c);
//						}
						return;
					}
				});
	}

	public void abrirDetalle(SP499 bean) {
		FragmentManager fm = Mod_IV_Fragment_028.this.getFragmentManager();
		Mod_IV_Fragment_028_01 aperturaDialog = Mod_IV_Fragment_028_01
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

		try {
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

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (lstData != null && lstData.size() > 0) {
			for (SP499 e : lstData) {
				Object o = e.getValueMap("c4p499b_" + e.orden);
				Object s = e.getValueMap("c4p499a_" + e.orden);
				Object x = e.getValueMap("c4p499e_" + e.orden);

				if (s == null) {
					mensaje = "Falta Informacion para: " + e.nombre;
					view = tcSecIII;
					return !(error = true);
				}

				if (Util.getInt(s) == 1) {
					if (o == null) {
						mensaje = "Falta Informacion para: " + e.nombre;
						view = tcSecIII;
						return !(error = true);
					}
				}
			}
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		Moduloiv03 mod4 = new Moduloiv03();
		caratula = App.getInstance().getEmpresa();
		data = Arrays.asList(getResources().getStringArray(R.array.array_499));
		lstData = new ArrayList<SP499>();
		lmap = new ArrayList<Map<Field, Object>>();

		secCap = mod4.getSecCap(
				getListFields(mod4, "(99|99a_|99b_|99c_|99d_|)",
						"c4p4", new String[] {  "C4P499A_6ESP"
								 }), false);
		
		bean = getCuestionarioService().getModuloiv03(
				App.getInstance().getEmpresa(), secCap);

		if (bean == null) {
			bean = new Moduloiv03();
			bean.id = App.getInstance().getEmpresa().id;
		}

		Field[] fields = App.fields400Sp != null ? App.fields400Sp : bean.getClass().getDeclaredFields();
	//	Log.e ("App.fields400Sp", App.fields400Sp + "");
	//	Log.e ("bean.getClass().getDeclaredFields()", bean.getClass().getDeclaredFields() + "");
		for (int y = 1; y <= 6; y++) {
			lmap.add(bean.getGroup(fields, y, y == 6 ? 5 : 4));	
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
		
			if (lstData.get(i).getRg().equals("1")
					&& lstData.get(i).get499B().equals("")) {
				tcSecIII.setBorderRow(i, true, R.color.transparente);
			} else if ((lstData.get(i).getRg().equals("1"))
					&& !lstData.get(i).get499B().equals("")) {
				tcSecIII.setBorderRow(i, true, R.color.azulacero);
			} else if (lstData.get(i).getRg().equals("2")) {
				tcSecIII.setBorderRow(i, true, R.color.azulacero);
			} else if (lstData.get(i).getRg().equals("")) {
				tcSecIII.setBorderRow(i, true, R.color.transparente);
			}
			
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
			if (opcion == 2 && tmp.getValueMap("c4p499b_" + tmp.orden) != null) {
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
				tmp.setValueMap("c4p499a_" + tmp.orden, opcion);
				reload();
			}
		}
	}

	public class SP499 extends Entity implements IDetailEntityComponent {
		private static final long serialVersionUID = 1L;
		public int orden;
		public String nombre;
		public Moduloiv03 c400;
		public Map<Field, Object> info;

		public SP499() {
			// TODO Auto-generated constructor stub
		}

		public SP499(Integer orden, String nombre, Moduloiv03 obj,Map<Field, Object> info) {
			this.orden = orden;
			this.nombre = nombre;
			this.c400 = obj;	
			this.info = info;
		}

		public String getNombre() {
			return nombre == null ? "" : nombre
					+ (orden == Mod_IV_Fragment_028.ESPECIFIQUE
							&& c400.c4p499a_6esp != null ? " [ "+ c400.c4p499a_6esp + " ]" : "");
		}

		public String getRg() {
			Object val = getValueMap("c4p499a_" + orden);
			return val == null ? "" : val.toString();
		}

		public String get499B() {
			Object val = getValueMap("c4p499b_" + orden);
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
						field.set(c400, value);
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
			e.setValueMap("c4p499a_" + e.orden, 1);
		}
		reload();
	}

	@Override
	public void onAccept() {
		SP499 e = (SP499) dc.get("equipos");
		if (e != null) {
			e.setValueMap(null);
			e.setValueMap("c4p499a_" + e.orden, 2);
		}
		reload();
	}
}

package gob.inei.ene2019v2.fragment.ModIX.dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.TableComponent.ALIGN;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.FieldComponent;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Caretaker;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.UN;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.util.List;
import java.util.Map;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Buscar_unidades_medida extends
		DialogFragmentComponent implements Respondible {

//	@FieldAnnotation(orderIndex = 1)
//	public SpinnerField spnNIVEL;
	@FieldAnnotation(orderIndex = 1)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 2)
	public ButtonComponent btnCancelar;

	public TableComponent tcCarreras;
	private List<UN> lstCarreras;	
	private UN seleccionado;
	
	private static DialogFragmentComponent caller;
	public Map<String, Object>  bean;

	LinearLayout q0, q1, q2, q3, q4;
	private CuestionarioService cuestionarioService;
	public String cap;
	TC_ClickListener listener;
	private Mod_IX_Fragment_001_01 c400;
	private Mod_IX_Fragment_002_01 c500;

	public static Buscar_unidades_medida newInstance(DialogFragmentComponent Capitulo100_2Dialog, String cap) {
		caller = (DialogFragmentComponent) Capitulo100_2Dialog;
		Buscar_unidades_medida f = new Buscar_unidades_medida();
		f.setParent(Capitulo100_2Dialog);
		Bundle args = new Bundle();
		f.cap=cap;
		f.setArguments(args);
		return f;
	}
		
	public Buscar_unidades_medida() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getDialog().setTitle("Ingrese el Nombre de la Unidad de Medida");
		final View rootView = createUI();
		initObjectsWithoutXML(this, rootView);
		listener = new TC_ClickListener();
		tcCarreras.getListView().setOnItemClickListener(listener);
		cargarDatos();
		enlazarCajas();
		listening();
		return rootView;
	}

	@Override
	public void onDismiss(DialogInterface dialog) {
	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */
//		q0 = createQuestionSection(spnNIVEL);
		q1 = createQuestionSection(tcCarreras.getTableView());
		tcCarreras.setSelectorData(R.drawable.selector_sombra_lista);
		LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

//		form.addView(q0);
		form.addView(q1);
		form.addView(botones);

		return contenedor;
	}

    @SuppressLint("ResourceAsColor") 
    @Override
	protected void buildFields() {
//		spnNIVEL = new SpinnerField(this.getActivity()).size(
//				altoComponente + 15, 450).callback("onNivelChangeValue");
//		llenarNIVEL();

		tcCarreras = new TableComponent(getActivity(), this, App.ESTILO)
				.size(530, 600).headerHeight(90).dataColumHeight(65)
				.filter("NOMBRE");
		tcCarreras.setHeaderTextSize(12);
		tcCarreras.addHeader(R.string.cpv0301_n3_all, 0.5f);
		tcCarreras.addHeader(R.string.cpv0301_n3_literal_all, 2.6f, ALIGN.LEFT);

		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);

		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (grabar()) {
					if (cap.equals("Buscar1")) {
						((Mod_IX_Fragment_001_01)caller).seleccionarUM(seleccionado);
					}
					else if (cap.equals("Buscar2")) {
						((Mod_IX_Fragment_002_01)caller).seleccionarUM(seleccionado);
					}{
					}
					Buscar_unidades_medida.this.dismiss();
				}
			}
		});
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Buscar_unidades_medida.this.dismiss();
			}
		});
	}

	private void cargarDatos() {
		cargarTabla();
	}

	public void cargarTabla() {
		lstCarreras=getCuestionarioService().getUnidadesMedidaC4();
		tcCarreras.setData(lstCarreras, "CODIGO","NOMBRE");
	}

	private boolean grabar() {
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
		return true;
	}

	private boolean validar() {
		if (seleccionado  == null) {
			ToastMessage.msgBox(this.getActivity(),
					"No selecciono ninguna Unidad de Medida", ToastMessage.MESSAGE_INFO,
					ToastMessage.DURATION_LONG);
			return false;
		}
		return true;
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService.getInstance(getActivity());
		}
		return cuestionarioService;
	}
	
    @SuppressLint("ResourceAsColor") 
	private class TC_ClickListener implements OnItemClickListener {

		public TC_ClickListener() {
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
	
			seleccionado = (UN) tcCarreras.getAdapter().getItem(arg2);
			Log.e("clck",seleccionado.toString());
			tcCarreras.resetCellColor();
			tcCarreras.setCellColor(arg2, -1, R.color.amarillo, true);
			getDialog().setTitle("Selecc: "+seleccionado.codigo.toString()  + " - " + seleccionado.nombre );
		}
	}
    
	@Override
	public void onCancel() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onAccept() {
		// TODO Auto-generated method stub
	}

	public void nivel(FieldComponent component) {
	}

}
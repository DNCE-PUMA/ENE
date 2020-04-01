package gob.inei.ene2019v2.fragment.ModIX.dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_003;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_003.ACCION;
import gob.inei.ene2019v2.model.ModuloixDet03;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Mod_IX_Fragment_003_01 extends DialogFragmentComponent {
	public interface Mod_IX_Fragment_0033_01Listener {
		void onFinishEditDialog(String inputText);
	}

	@FieldAnnotation(orderIndex = 1)
	public TextField txtC9P903_2;
	@FieldAnnotation(orderIndex = 2)
	public TextField txtC9P903_3;
	@FieldAnnotation(orderIndex = 3)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 4)
	public ButtonComponent btnCancelar;
	private static Mod_IX_Fragment_003 caller;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7;
	private ModuloixDet03 detalle;

	private DialogComponent dlg;

	private ACCION accion;
	private CuestionarioService cuestionarioService;

	private enum ACTION {
		COBERTURA, VALIDAR
	}

	private ACTION action;

	public static Mod_IX_Fragment_003_01 newInstance(FragmentForm pagina,
			ModuloixDet03 detalle, CuestionarioService cuestService,
			Mod_IX_Fragment_003.ACCION accion) {
		caller = (Mod_IX_Fragment_003) pagina;
		Filtros.clear();
		Mod_IX_Fragment_003_01 f = new Mod_IX_Fragment_003_01();
		f.setParent(pagina);
		f.cuestionarioService = cuestService;
		f.accion = accion;
		Bundle args = new Bundle();
		args.putSerializable("detalle", detalle);
		f.setArguments(args);
		return f;
	}

	public Mod_IX_Fragment_003_01() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		detalle = (ModuloixDet03) getArguments().getSerializable("detalle");
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View rootView = createUI();
		getDialog().setTitle( detalle.c9p903_2 ==  null ? "" : "Materia Prima : " + detalle.c9p903_2 );
		initObjectsWithoutXML(this, rootView);

		cargarDatos();
		enlazarCajas(this);
		listening();

		return rootView;

	}

	private void cargarDatos() {
		entityToUI(detalle);
		caretaker.addMemento("antes",
				detalle.saveToMemento(ModuloixDet03.class));
		inicio();
	}

	private void inicio() {
		txtC9P903_2.requestFocus();
	}

	@Override
	protected View createUI() {
		buildFields();
		q0 = createQuestionSection(R.string.c2c100m9p003_2, txtC9P903_2);
		q1 = createQuestionSection(R.string.c2c100m9p003_3, txtC9P903_3);
		LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);
		form.addView(botones);

		return contenedor;
	}

	@Override
	protected void buildFields() {
		txtC9P903_2 = new TextField(this.getActivity(), false)
				.size(altoComponente, 600).hint(R.string.especifique).negrita()
				.soloTextoNumero();
		txtC9P903_3 = new TextField(this.getActivity(), false)
				.size(altoComponente, 600).negrita().centrar();

		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Mod_IX_Fragment_003_01.this.dismiss();
			}
		});
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean flag = grabar();
				if (!flag) {
					return;
				}
				Mod_IX_Fragment_003_01.this.dismiss();
				caller.recargarLista();
				//nextPage();
			}
		});

		Filtros.setFiltro(txtC9P903_2, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC9P903_3, Filtros.TIPO.ALFAN_U, 500,  new char[]{'\n','.',',','+','-','*', '(',')','/','='});
//		Filtros.setFiltro(txtC9P903_3, Filtros.TIPO.NUMBER, 11, -1, null,
//				20000000000l, 30999999999l, -1, 11);
	}

	private void nextPage() {
		FragmentManager fm = caller.getFragmentManager();
		Mod_IX_Fragment_003_02 aperturaDialog = Mod_IX_Fragment_003_02
				.newInstance(caller, detalle, cuestionarioService, accion);
		aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		aperturaDialog.show(fm, "aperturaDialog");

	}

	private boolean validar() {
		error = false;
		String pregunta_no_vacia = getString(R.string.pregunta_no_vacia);
		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (Util.esVacio(txtC9P903_2)) {
			mensaje = pregunta_no_vacia.replace("$", "Nombre de materia prima");
			view = txtC9P903_2;
			return !(error = true);
		}
		if (Util.esVacio(txtC9P903_3)) {
			mensaje = pregunta_no_vacia.replace("$", "Razón social");
			view = txtC9P903_3;
			return !(error = true);
		}

		return true;
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
		savePag(-1);

		return true;
	}

	private void savePag(Integer cod) {
		uiToEntity(detalle);
		try {
			saveVisita(detalle);
		} catch (Exception e) {
			ToastMessage.msgBox(this.getActivity(), e.getMessage(),
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
		}
	}

	private void saveVisita(ModuloixDet03 detalle) throws SQLException {
		if (!cuestionarioService.saveOrUpdate(detalle,
				detalle.getSecCap(caller.getListFields(this)))) {
			ToastMessage.msgBox(this.getActivity(),
					"Los datos no se guardaron", ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
		} else {
			caller.recargarLista();
			//caller.reloadData(detalle, 1);
			// caller.grabarCaratula();
		}
	}

}

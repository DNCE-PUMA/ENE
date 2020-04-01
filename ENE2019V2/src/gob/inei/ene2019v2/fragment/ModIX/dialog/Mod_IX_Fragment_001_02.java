package gob.inei.ene2019v2.fragment.ModIX.dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.TextAreaField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Filtros;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_001;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_001.ACCION;
import gob.inei.ene2019v2.model.ModuloixDet01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Mod_IX_Fragment_001_02 extends DialogFragmentComponent {
	public interface Mod_IX_Fragment_00X_01Listener {
		void onFinishEditDialog(String inputText);
	}

	@FieldAnnotation(orderIndex = 1)
	public TextAreaField txtC901_OBS;
	@FieldAnnotation(orderIndex = 2)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 3)
	public ButtonComponent btnCancelar;

	private static Mod_IX_Fragment_001 caller;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7;
	private ModuloixDet01 detalle;
	private LabelComponent lbltitulo;
	private DialogComponent dlg;
	private Integer resp;
	private ACCION accion;
	private CuestionarioService cuestionarioService;

	private enum ACTION {
		COBERTURA, VALIDAR
	}

	private ACTION action;

	public static Mod_IX_Fragment_001_02 newInstance(FragmentForm pagina,
			ModuloixDet01 detalle, CuestionarioService cuestService,
			Mod_IX_Fragment_001.ACCION accion) {
		caller = (Mod_IX_Fragment_001) pagina;
		Filtros.clear();
		Mod_IX_Fragment_001_02 f = new Mod_IX_Fragment_001_02();
		f.setParent(pagina);
		f.cuestionarioService = cuestService;
		f.accion = accion;
		Bundle args = new Bundle();
		args.putSerializable("detalle", detalle);
		f.setArguments(args);
		return f;
	}

	public Mod_IX_Fragment_001_02() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		detalle = (ModuloixDet01) getArguments().getSerializable("detalle");
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View rootView = createUI();
		getDialog().setTitle("Producto N\u00B0: " + detalle.c9p901_id);
		initObjectsWithoutXML(this, rootView);

		cargarDatos();
		enlazarCajas(this);
		listening();

		return rootView;

	}

	private void cargarDatos() {
		entityToUI(detalle);
		caretaker.addMemento("antes",
				detalle.saveToMemento(ModuloixDet01.class));
		inicio();
	}

	private void inicio() {
		txtC901_OBS.requestFocus();

	}

	@Override
	protected View createUI() {
		buildFields();

		q1 = createQuestionSection(lbltitulo, txtC901_OBS);
		LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q1);
		form.addView(botones);

		return contenedor;
	}

	@Override
	protected void buildFields() {

		lbltitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(MATCH_PARENT, MATCH_PARENT).text("OBSERVACIONES")
				.textSize(21).centrar().negrita();
		txtC901_OBS = new TextAreaField(this.getActivity()).size(400, 750)
				.maxLength(3000);

		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Mod_IX_Fragment_001_02.this.dismiss();
			}
		});
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean flag = grabar();
				if (!flag) {
					return;
				}
				Mod_IX_Fragment_001_02.this.dismiss();
				caller.reloadData(detalle, 1);
			}
		});

		Filtros.setFiltro(txtC901_OBS, Filtros.TIPO.ALFAN_U, 3000, null);

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

	private void saveVisita(ModuloixDet01 detalle) throws SQLException {
		detalle.c9p901_2cd = detalle.c9p901_id;
		if (!cuestionarioService.saveOrUpdate(
				detalle,
				detalle.getSecCap(caller.getListFields(this, new String[] {
						"C9P901_2CD", "C901_OBS" })))) {
			ToastMessage.msgBox(this.getActivity(),
					"Los datos no se guardaron", ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
		} else {
			caller.reloadData(detalle, 1);
			// caller.grabarCaratula();
		}
	}
}

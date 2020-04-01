package gob.inei.ene2019v2.fragment.ModII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Moduloii;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_II_Fragment_002 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgM2P005;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgM2P006;
	@FieldAnnotation(orderIndex = 3)
	public TextField txtM2P006_ESP;
	@FieldAnnotation(orderIndex = 4)
	public RadioGroupOtherField rgM2P007;

	private CuestionarioService cuestionarioService;
	private Moduloii bean;
	private LabelComponent lblTitulo;

	public Mod_II_Fragment_002() {
	}

	public Mod_II_Fragment_002 parent(MasterActivity parent) {
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
				.text(R.string.mod02_title).textSize(21).centrar().negrita();

		rgM2P005 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p005_1, R.string.c1c100m2p005_2).size(
				WRAP_CONTENT, 600).orientation(ORIENTATION.VERTICAL);
		rgM2P006 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p006_1, R.string.c1c100m2p006_2,
				R.string.c1c100m2p006_3, R.string.c1c100m2p006_4,
				R.string.c1c100m2p006_5, R.string.c1c100m2p006_6,
				R.string.c1c100m2p006_7).size(WRAP_CONTENT, 600).orientation(
				ORIENTATION.VERTICAL);
		txtM2P006_ESP = new TextField(this.getActivity(), false).size(
				altoComponente, 450);
		rgM2P007 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p007_1, R.string.c1c100m2p007_2,
				R.string.c1c100m2p007_3).size(WRAP_CONTENT, 600).orientation(
				ORIENTATION.VERTICAL);

		Filtros.setFiltro(txtM2P006_ESP, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */

		LinearLayout q0 = createQuestionSection(lblTitulo);

		LinearLayout q1 = createQuestionSection(R.string.c1c100m2p005, rgM2P005);
		LinearLayout q2 = createQuestionSection(R.string.c1c100m2p006, rgM2P006);
		LinearLayout q3 = createQuestionSection(R.string.c1c100m2p006_esp,txtM2P006_ESP);
		LinearLayout q4 = createQuestionSection(R.string.c1c100m2p007, rgM2P007);

		// ///////////////////////////
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		/* Aca agregamos las preguntas a la pantalla */
		form.addView(q0);

		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);

		return contenedor;
	}

	@Override
	public boolean grabar() {
		uiToEntity(bean);
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

		try {
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

	
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloii(
				App.getInstance().getEmpresa(),
				new Moduloii().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloii();
		}
		bean.id = App.getInstance().getEmpresa().id;
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		// rgP10_5.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
	
	@Override
    public Entity getEntity() {
    	return bean;
    }
}

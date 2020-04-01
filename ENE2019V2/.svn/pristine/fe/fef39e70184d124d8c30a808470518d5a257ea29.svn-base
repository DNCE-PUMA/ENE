package gob.inei.ene2019v2.fragment.ModII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
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

public class Mod_II_Fragment_005 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgM2P018;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgM2P019;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgM2P020;

	private CuestionarioService cuestionarioService;
	private Moduloii bean;
	private LabelComponent lblTitulo,lblTitulo1;

	public Mod_II_Fragment_005() {
	}

	public Mod_II_Fragment_005 parent(MasterActivity parent) {
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

		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
		.text(R.string.mod02_subtitle3).textSize(20).centrar().negrita();
		
		rgM2P018 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p018_1, R.string.c1c100m2p018_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);
		rgM2P019 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p019_1, R.string.c1c100m2p019_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);
		rgM2P020 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p020_1, R.string.c1c100m2p020_2).size(
				WRAP_CONTENT, WRAP_CONTENT).orientation(ORIENTATION.HORIZONTAL);

	}

	@Override
	protected View createUI() {
		buildFields();
		/* Aca creamos las preguntas */

		LinearLayout q0 = createQuestionSection(lblTitulo,lblTitulo1);

		LinearLayout q4 = createQuestionSection(R.string.c1c100m2p018, rgM2P018);
		LinearLayout q5 = createQuestionSection(R.string.c1c100m2p019, rgM2P019);
		LinearLayout q6 = createQuestionSection(R.string.c1c100m2p020, rgM2P020);

		// ///////////////////////////
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		/* Aca agregamos las preguntas a la pantalla */
		form.addView(q0);

		form.addView(q4);
		form.addView(q5);
		form.addView(q6);

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

		/*
		 * if(Util.esVacio(rgP10_5)){ mensaje = pregunta_no_vacia.replace("$",
		 * "Material de la Conexi\u00f3n;"); view = rgP10_5; return !(error =
		 * true); } if(rgP10_5.isTagSelected(4) && Util.esVacio(txtP10_5_O)){
		 * mensaje = especifique_no_vacio; view = txtP10_5_O; return !(error =
		 * true); } if(Util.esVacio(rgP10_6)){ mensaje =
		 * pregunta_no_vacia.replace("$", "Di\u00e1metro de Conexi\u00f3n;");
		 * view = rgP10_6; return !(error = true); }
		 * if(rgP10_6.isTagSelected(10) && Util.esVacio(txtP10_6_O)){ mensaje =
		 * especifique_no_vacio; view = txtP10_6_O; return !(error = true); }
		 * if(Util.esVacio(rgP10_7)){ mensaje = pregunta_no_vacia.replace("$",
		 * "LLaves de paso;"); view = rgP10_7; return !(error = true); }
		 */

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

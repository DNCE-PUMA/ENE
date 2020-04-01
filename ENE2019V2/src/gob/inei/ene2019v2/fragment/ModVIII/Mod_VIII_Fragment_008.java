package gob.inei.ene2019v2.fragment.ModVIII;

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
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloviii;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VIII_Fragment_008 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC8P827;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC8P830;
	
	private CuestionarioService cuestionarioService;
	private Moduloviii bean;
	private Caratula bean1;
	private LabelComponent lblTitulo, lblTitulo2,lblNiv,lblTitulo3,lblTitulo4;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_VIII_Fragment_008() {
	}

	public Mod_VIII_Fragment_008 parent(MasterActivity parent) {
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
				.text(R.string.c2c100m8).textSize(21).centrar().negrita();

		lblTitulo2 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8_Licencias).textSize(21).centrar()
				.negrita();
		
		rgC8P827 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p027_1, R.string.c2c100m8p027_2,R.string.c2c100m8p027_3).size(WRAP_CONTENT, 450).orientation(
				ORIENTATION.VERTICAL);	
		
		rgC8P830 = new RadioGroupOtherField(this.getActivity(),
						R.string.c2c100m8p036_1, R.string.c2c100m8p036_2,
						R.string.c2c100m8p036_3).size(WRAP_CONTENT, 500)
						.orientation(ORIENTATION.HORIZONTAL).callback("FuncionRG830");

		
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo,lblTitulo2);
		q1 = createQuestionSection(R.string.c2c100m8p027, rgC8P827);	
		q2 = createQuestionSection(R.string.c2c100m8p830, rgC8P830);
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
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
		if(Util.getInt(bean1.funcionamiento)>=2017){
			if (Util.esVacio(rgC8P827)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P27");
				view = rgC8P827;
				error = true;
				return false;
			}	
		}
		if (Util.esVacio(rgC8P830)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P830");
			view = rgC8P830;
			error = true;
			return false;
		}
		

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloviii(
				App.getInstance().getEmpresa(),
				new Moduloviii().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloviii();
			bean.id = App.getInstance().getEmpresa().id;
		}
		
		bean1 = App.getInstance().getEmpresa();
		
		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		if(Util.getInt(bean1.funcionamiento)<2017){
			Util.cleanAndLockView(getActivity(),rgC8P827);
			rgC8P830.requestFocus();
		}else{
			Util.lockView(getActivity(), false,rgC8P827);
			rgC8P827.requestFocus();
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
	public Entity getEntity() {
		return bean;
	}
}

package gob.inei.ene2019v2.fragment.ModVIII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Moduloviii;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_VIII_Fragment_011 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC8P845;
	@FieldAnnotation(orderIndex = 2)
	public CheckBoxField chbC8P845_2;


	private CuestionarioService cuestionarioService;
	private Moduloviii bean;
	private LabelComponent lblTitulo, lblSubTitulo,lblNiv,lbl1;
	public GridComponent2 grid845; 
	public GridComponent gridpreg835_1;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	public Mod_VIII_Fragment_011() {
	}

	public Mod_VIII_Fragment_011 parent(MasterActivity parent) {
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
		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.c2c100m8_DCivil).textSize(20).centrar();
		lblNiv= new LabelComponent(this.getActivity())
		.size(altoComponente + 10, 320).text("REGULACIONES EN DEFENSA CIVIL")
		.textSize(15).negrita().alinearIzquierda();
		
		lbl1= new LabelComponent(this.getActivity())
		.size(altoComponente + 50, 440).text("1. Las inspecciones técnicas de seguridad en Defensa Civil realizadas por INDECI (1. Muy escasa, 5.Muy excesiva) ")
		.textSize(15).negrita().alinearIzquierda();
		
		rgC8P845 = new RadioGroupOtherField(this.getActivity(),
				R.string.c2c100m8p002_1, R.string.c2c100m8p002_2,
				R.string.c2c100m8p002_3, R.string.c2c100m8p002_4,
				R.string.c2c100m8p002_5).size(30, 320).orientation(
				ORIENTATION.HORIZONTAL);		
		
		chbC8P845_2 = new CheckBoxField(this.getActivity(),
				R.string.c2c100m8p002_8, "1:0").size(30, 320).callback("OnChangeCheckP845_1");
		
		gridpreg835_1 = new GridComponent(this.getActivity(),Gravity.CENTER_VERTICAL, 1);
		gridpreg835_1.addComponent(rgC8P845);
		gridpreg835_1.addComponent(chbC8P845_2);
		gridpreg835_1.colorFondo(R.color.WhiteSmoke);

		grid845 = new GridComponent2(this.getActivity(),Gravity.CENTER,2);
		grid845.addComponent(lblNiv,2);
		grid845.addComponent(lbl1);
		grid845.addComponent(gridpreg835_1.component());

//
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.c2c100m8p845, grid845.component());

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
	//	form.addView(q2);
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
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

		if (Util.esVacio(rgC8P845)) {
			if (!chbC8P845_2.isChecked()) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P845(B)");
				view = rgC8P845;
				return !(error = true);
			}
		}
		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloviii(
				App.getInstance().getEmpresa(),
				new Moduloviii().getSecCap(getListFields(this,
						new String[] { "C8P839" })));
		if (bean == null) {
			bean = new Moduloviii();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		rgC8P845.requestFocus();
		OnChangeCheckP845_1();
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
	public void OnChangeCheckP845_1(){
		if (chbC8P845_2.isChecked()) {
			Util.cleanAndLockView(getActivity(), rgC8P845);
		} else {
			Util.lockView(getActivity(), false, rgC8P845);
			rgC8P845.requestFocus();
		}
	}

}

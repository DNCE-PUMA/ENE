package gob.inei.ene2019v2.fragment.ModI;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
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
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.service.CuestionarioService;
import gob.inei.ene2019v2.service.UbigeoService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_I_Fragment_004 extends FragmentForm {


	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC1P111_1;
//	@FieldAnnotation(orderIndex = 2)
//	public RadioGroupOtherField rgC1P111A_1;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC1P111_2;
//	@FieldAnnotation(orderIndex = 4)
//	public RadioGroupOtherField rgC1P111A_2;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC1P111_3;
//	@FieldAnnotation(orderIndex = 6)
//	public RadioGroupOtherField rgC1P111A_3;
    @FieldAnnotation(orderIndex = 4)
 	public RadioGroupOtherField rgC1P111A;

	private CuestionarioService cuestionarioService;
	private Moduloi bean;
	private LabelComponent lblTitulo, lblTitulo1, lblTitulo2, lblInternacional,
			lblNacional, lblLocal, lblSino, lblP11A, lblvacio;
	private UbigeoService ubigeoService;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	private GridComponent2 grEspe, grMercado, grEspe9a;

	public Mod_I_Fragment_004() {
	}

	public Mod_I_Fragment_004 parent(MasterActivity parent) {
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
				.text(R.string.moduloI).textSize(21).centrar().negrita();
		lblTitulo1 = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.moduloI_2).textSize(20).centrar().negrita();
	

		lblInternacional = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 15, 320).text(R.string.c1c100m1p011_1)
				.textSize(17).alinearIzquierda().negrita();
		lblNacional = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 15, 320).text(R.string.c1c100m1p011_2)
				.textSize(17).alinearIzquierda().negrita();
		lblLocal = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 15, 320).text(R.string.c1c100m1p011_3)
				.textSize(17).alinearIzquierda().negrita();
		lblSino = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 180).text("Si/No").textSize(17).centrar()
				.negrita();
		lblP11A = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 15, 250)
				.text("111A. El mercado… es su principal mercado?").textSize(17).centrar()
				.negrita();
		lblvacio = new LabelComponent(this.getActivity()).size(altoComponente,
				250);

		rgC1P111_1 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, 180).callback("FuncionP111")
				.orientation(ORIENTATION.HORIZONTAL).centrar();
		rgC1P111_2 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, 180).callback("FuncionP111")
				.orientation(ORIENTATION.HORIZONTAL).centrar();
		rgC1P111_3 = new RadioGroupOtherField(this.getActivity(), R.string.si,
				R.string.no).size(WRAP_CONTENT, 180).callback("FuncionP111")
				.orientation(ORIENTATION.HORIZONTAL).centrar();
		
//		rgC1P111A_1 = new RadioGroupOtherField(this.getActivity(), 
//				R.string.si, R.string.no).size(120, 150)
//				.orientation(ORIENTATION.HORIZONTAL).centrar();
//		rgC1P111A_2 = new RadioGroupOtherField(this.getActivity(), 
//				R.string.si, R.string.no).size(120, 150)
//				.orientation(ORIENTATION.HORIZONTAL).centrar();
//		rgC1P111A_3 = new RadioGroupOtherField(this.getActivity(), 
//				R.string.si, R.string.no).size(120, 150)
//				.orientation(ORIENTATION.HORIZONTAL).centrar();
			
		rgC1P111A = new RadioGroupOtherField(this.getActivity(), 
		R.string.c1c100m1p011a_1, R.string.c1c100m1p011a_2,R.string.c1c100m1p011a_3).size(WRAP_CONTENT, 400)
		.orientation(ORIENTATION.VERTICAL);

		grEspe = new GridComponent2(this.getActivity(), 2);
		grEspe.addComponent(new LabelComponent(getActivity()));
		grEspe.addComponent(new LabelComponent(getActivity()));
	//	grEspe.addComponent(lblP11A);
		
		grEspe.addComponent(lblInternacional);
		grEspe.addComponent(rgC1P111_1);
		//grEspe.addComponent(rgC1P111A_1);
		
		grEspe.addComponent(lblNacional);
		grEspe.addComponent(rgC1P111_2);
		//grEspe.addComponent(rgC1P111A_2);
		
		grEspe.addComponent(lblLocal);
		grEspe.addComponent(rgC1P111_3);
		//grEspe.addComponent(rgC1P111A_3);
		
		grEspe.colorFondo(R.color.transparent);

	}

	public UbigeoService getUbigeoService() {
		if (ubigeoService == null) {
			ubigeoService = UbigeoService.getInstance(getActivity());
		}
		return ubigeoService;
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblTitulo1);
	
		q1 = createQuestionSection(R.string.c1c100m1p011,  Gravity.CENTER
				| Gravity.CENTER_HORIZONTAL,grEspe.component());
		
		q2 = createQuestionSection(R.string.c1c100m1p011a,rgC1P111A);
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
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}



		
		
//		if (rgC1P111_1.isTagSelected(1)) {
//			if (Util.esVacio(rgC1P111A_1)) {
//				mensaje = pregunta_no_vacia
//						.replace("$", "P111A- Internacional");
//				view = rgC1P111A_1;
//				error = true;
//				return false;
//			}
//		}

		if (Util.esVacio(rgC1P111_2)) {
			mensaje = pregunta_no_vacia.replace("$",
					"La pregunta P111- Nacional");
			view = rgC1P111_2;
			error = true;
			return false;
		}

//		if (rgC1P111_2.isTagSelected(1)) {
//			if (Util.esVacio(rgC1P111A_2)) {
//				mensaje = pregunta_no_vacia.replace("$", "P111A- Nacional");
//				view = rgC1P111A_2;
//				error = true;
//				return false;
//			}
//
//		}
		

		if (Util.esVacio(rgC1P111_3)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P111- Local");
			view = rgC1P111_3;
			error = true;
			return false;
		}
//		if (rgC1P111_3.isTagSelected(1)) {
//			if (Util.esVacio(rgC1P111A_3)) {
//				mensaje = pregunta_no_vacia.replace("$", "P111A- Local");
//				view = rgC1P111A_3;
//				error = true;
//				return false;
//			}
//		}

		if (rgC1P111_1.isTagSelected(2) && rgC1P111_2.isTagSelected(2)&& rgC1P111_3.isTagSelected(2)) {
			mensaje = "Deberia marcar una opcion  de mercado ";
			view = rgC1P111_1;
			error = true;
			return false;
		}
		if (Util.esVacio(rgC1P111A)) {
		mensaje = pregunta_no_vacia.replace("$", "P111A- Nacional");
		view = rgC1P111A;
		error = true;
		return false;
	     }
		
		
//		if ((rgC1P111A_1.isTagSelected(1) && rgC1P111A_2.isTagSelected(1) && rgC1P111A_3.isTagSelected(1))
//				|| (rgC1P111A_1.isTagSelected(1) && rgC1P111A_2.isTagSelected(1))
//				|| (rgC1P111A_1.isTagSelected(1) && rgC1P111A_3.isTagSelected(1))
//				|| (rgC1P111A_2.isTagSelected(1) && rgC1P111A_3.isTagSelected(1))
//				|| (rgC1P111A_1.isTagSelected(2) && rgC1P111A_2.isTagSelected(2) && rgC1P111A_3.isTagSelected(2))
//				|| (rgC1P111A_1.isTagSelected(2) && rgC1P111A_2.isTagSelected(2) && Util.esVacio(rgC1P111A_3))
//				|| (rgC1P111A_1.isTagSelected(2) && rgC1P111A_3.isTagSelected(2) && Util.esVacio(rgC1P111A_2))
//				|| (rgC1P111A_2.isTagSelected(2) && rgC1P111A_3.isTagSelected(2) && Util.esVacio(rgC1P111A_1))
//				|| (rgC1P111A_1.isTagSelected(2) && Util.esVacio(rgC1P111A_2) && Util.esVacio(rgC1P111A_3))
//				|| (rgC1P111A_2.isTagSelected(2) && Util.esVacio(rgC1P111A_1) && Util.esVacio(rgC1P111A_3))
//				|| (rgC1P111A_3.isTagSelected(2) && Util.esVacio(rgC1P111A_1) && Util.esVacio(rgC1P111A_2))) {
//			mensaje = "Debe elegir solo un mercado principal";
//			view = rgC1P111A_1;
//			error = true;
//			return false;
//		}
		

		if (rgC1P111_1.isTagSelected(2) && rgC1P111_2.isTagSelected(2)
				&& rgC1P111_3.isTagSelected(2)) {
			mensaje = "DEBE SELECCIONAR UN MERCADO EN P111";
			view = rgC1P111_1;
			error = true;
			return false;
		}
//	       	:	Si  (C1P111_1=1 and C1P111_2=2 and C1P111_3=2) and C1P111A=2,3 Error
//                Si  (C1P111_1=1 and C1P111_2=1 and C1P111_3=2) and C1P111A=3 Error
//                Si  (C1P111_1=2 and C1P111_2=1 and  C1P111_3=1) and C1P111A=1 Error 
//                Si  (C1P111_1=2 and C1P111_2=1 and  C1P111_3=2) and C1P111A=1,3 Error 
//                Si  (C1P111_1=2 and C1P111_2=2 and  C1P111_3=1) and C1P111A=1,2 Error 
//MENSAJE	:	“Error: solo debe seleccionar el mercado principal”
		
		if ((rgC1P111_1.isTagSelected(1) && rgC1P111_2.isTagSelected(2) && rgC1P111_3.isTagSelected(2)&& (rgC1P111A.isTagSelected(2)||rgC1P111A.isTagSelected(3)))
			     || (rgC1P111_1.isTagSelected(1) && rgC1P111_2.isTagSelected(1) && rgC1P111_3.isTagSelected(2)&& (rgC1P111A.isTagSelected(3)))
			    || (rgC1P111_1.isTagSelected(2) && rgC1P111_2.isTagSelected(1) && rgC1P111_3.isTagSelected(1)&& (rgC1P111A.isTagSelected(1)))
				|| (rgC1P111_1.isTagSelected(2) && rgC1P111_2.isTagSelected(1) && rgC1P111_3.isTagSelected(2)&& (rgC1P111A.isTagSelected(1)||rgC1P111A.isTagSelected(3)))
				|| (rgC1P111_1.isTagSelected(2) && rgC1P111_2.isTagSelected(2) && rgC1P111_3.isTagSelected(1)&& (rgC1P111A.isTagSelected(1)||rgC1P111A.isTagSelected(2))))
				 {
			mensaje = "Error: solo debe seleccionar el mercado principal";
			view = rgC1P111A;
			error = true;
			return false;
		}

		return true;
	}

	@Override
	public void cargarDatos() {
		bean = getCuestionarioService().getModuloi(
				App.getInstance().getEmpresa(),
				new Moduloi().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloi();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		rgC1P111_1.requestFocus();
		FuncionP111();
//		FuncionP111_2();
//		FuncionP111_3();
		rgC1P111_1.requestFocus();
	}

	//Si C1P111_1=1 or C1P111_2=1 or  C1P111_3=1 ase a C1P111A
			public void FuncionP111() {
			Integer valor = Integer.parseInt(rgC1P111_1.getTagSelected("0").toString());
			Integer valor1 = Integer.parseInt(rgC1P111_2.getTagSelected("0").toString());
			Integer valor2 = Integer.parseInt(rgC1P111_3.getTagSelected("0").toString());
			if (valor == 1||valor1 == 1||valor2 == 1) {
				Util.lockView(getActivity(), false, rgC1P111A);
				rgC1P111A.requestFocus();
			} else {
				Util.cleanAndLockView(getActivity(), rgC1P111A);
			}
		}
//	public void FuncionP111_1() {
//		Integer valor = Integer.parseInt(rgC1P111_1.getTagSelected("0")
//				.toString());
//		if (valor == 1) {
//			Util.lockView(getActivity(), false, rgC1P111A_1);
//			rgC1P111A_1.requestFocus();
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC1P111A_1);
//		}
//	}

//	public void FuncionP111_2() {
//		Integer valor = Integer.parseInt(rgC1P111_2.getTagSelected("0")
//				.toString());
//		if (valor == 1) {
//			Util.lockView(getActivity(), false, rgC1P111A_2);
//			rgC1P111A_2.requestFocus();
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC1P111A_2);
//		}
//	}

//	public void FuncionP111_3() {
//		Integer valor = Integer.parseInt(rgC1P111_3.getTagSelected("0")
//				.toString());
//		if (valor == 1) {
//			Util.lockView(getActivity(), false, rgC1P111A_3);
//			rgC1P111A_3.requestFocus();
//		} else {
//			Util.cleanAndLockView(getActivity(), rgC1P111A_3);
//		}
//	}

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

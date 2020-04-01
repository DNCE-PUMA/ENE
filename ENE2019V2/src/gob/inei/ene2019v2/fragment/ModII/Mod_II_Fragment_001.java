package gob.inei.ene2019v2.fragment.ModII;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
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
import gob.inei.ene2019v2.model.Moduloii;
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

public class Mod_II_Fragment_001 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public RadioGroupOtherField rgC2P201;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC2P202;
	@FieldAnnotation(orderIndex = 3)
	public TextField txtC2P202_ESP_A;
	@FieldAnnotation(orderIndex = 4) 
	public IntegerField txtC2P203_1;
	@FieldAnnotation(orderIndex = 5)
	public IntegerField txtC2P203_2;
	@FieldAnnotation(orderIndex = 6)
	public IntegerField txtC2P203_3;
	@FieldAnnotation(orderIndex = 7)
	public RadioGroupOtherField rgC2P204;
	@FieldAnnotation(orderIndex = 8)
	public TextField txtC2P204_ESP;
	@FieldAnnotation(orderIndex = 9)
	public RadioGroupOtherField rgC2P205;
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgC2P206;
	@FieldAnnotation(orderIndex = 11)
	public TextField txtC2P206_ESP;
	@FieldAnnotation(orderIndex = 12)
	public RadioGroupOtherField rgC2P207;

	private CuestionarioService cuestionarioService;
	private Moduloii bean;
	private LabelComponent lblTitulo, lblSubTitulo, lblAreaTerre, lblAreaCons,lblAreac;
//	public LabelComponent label1, label2;
	public LabelComponent lbl1, lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
	LinearLayout q0, q1, q2, q3, q4, q5, q6, q7, q8;
	private GridComponent2 grMetros, grd202;
	private Caratula caratula;

	public Mod_II_Fragment_001() {
	}

	public Mod_II_Fragment_001 parent(MasterActivity parent) {
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

		lblSubTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.mod02_subtitle).textSize(20).centrar().negrita();

		lblAreaTerre = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 50, 100)
				.text(R.string.mod02_AreaTerreno).textSize(16).centrar();
		lblAreaCons = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente + 50, 100)
				.text(R.string.mod02_AreaConstruida).textSize(16).centrar();
		
		lblAreac = new LabelComponent(this.getActivity(), App.ESTILO)
		.size(altoComponente + 50, 100)
		.text("C. Cuántos niveles construidos tiene?").textSize(16).centrar();

		rgC2P201 = new RadioGroupOtherField(this.getActivity(),
				R.string.mod02_SI, R.string.mod02_NO)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP1");
				

//		label1 = new LabelComponent(this.getActivity())
//				.size(altoComponente + 10, 100)
//				.text(R.string.mod02_local).textSize(16).centrar().negrita();
//		
//		label2 = new LabelComponent(this.getActivity())
//				.size(altoComponente + 10, 100)
//				.text(R.string.mod02_lugar).textSize(16).centrar().negrita();
		
		
		rgC2P202 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p002_1, R.string.c1c100m2p002_2,
				R.string.c1c100m2p002_3, R.string.c1c100m2p002_4,
				R.string.c1c100m2p002_5, R.string.c1c100m2p002_6,
				R.string.c1c100m2p002_7, R.string.c1c100m2p002_8,
				R.string.c1c100m2p002_9,R.string.c1c100m2p002_10).size(
				WRAP_CONTENT, 500).orientation(ORIENTATION.VERTICAL).callback("FuncionP202");
	
//		rgC2P202.agregarTitle(0, label1);
//		rgC2P202.agregarTitle(9, label2);		

		txtC2P202_ESP_A = new TextField(this.getActivity(), false)
				.size(altoComponente, 300).hint(R.string.especifique)
				.soloTextoNumero();
		
		rgC2P202.agregarEspecifique(8, txtC2P202_ESP_A);
		
	
		
//		rgC2P202.agregarEspecifique(9, txtC2P202_ESP_A);
//		rgC2P202.agregarEspecifique(11, txtC2P202_ESP_A);

		lbl1 = new LabelComponent(this.getActivity())
				.size(altoComponente , 100).text(R.string.mod02_)
				.textSize(16).centrar().negrita();
		lbl2 = new LabelComponent(this.getActivity())
				.size(altoComponente , 100).text(R.string.mod02_)
				.textSize(16).centrar().negrita();
		lbl3 = new LabelComponent(this.getActivity())
				.size(altoComponente , 100).text(R.string.mod02_)
				.textSize(16).centrar().negrita();
		lbl4 = new LabelComponent(this.getActivity())
		.size(altoComponente , 100).text(R.string.mod02_)
		.textSize(16).centrar().negrita();
		lbl5 = new LabelComponent(this.getActivity())
		.size(altoComponente + 8, 100).text(R.string.mod02_)
		.textSize(16).centrar().negrita();
		lbl6 = new LabelComponent(this.getActivity())
		.size(altoComponente + 8, 100).text(R.string.mod02_)
		.textSize(16).centrar().negrita();
		lbl7 = new LabelComponent(this.getActivity())
		.size(altoComponente + 8, 100).text(R.string.mod02_)
		.textSize(16).centrar().negrita();
		lbl8 = new LabelComponent(this.getActivity())
		.size(110 , 100).text(R.string.mod02_)
		.textSize(16).centrar().negrita();
		

		
		txtC2P203_2 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 200).centrar()
				.hint(R.string.metroscuadrados);
		txtC2P203_3 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 200).centrar()
				.hint(R.string.numero);
		txtC2P203_1 = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 200).centrar().hint(R.string.metroscuadrados);
		rgC2P204 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p004_1, R.string.c1c100m2p004_2,
				R.string.c1c100m2p004_3, R.string.c1c100m2p004_4)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).callback("FuncionP4");
		txtC2P204_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		rgC2P204.agregarEspecifique(3, txtC2P204_ESP);
		
		rgC2P205 = new RadioGroupOtherField(this.getActivity(),
				R.string.si, R.string.no).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL).callback("FuncionP5");
		
		rgC2P206 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p006_1, R.string.c1c100m2p006_2,
				R.string.c1c100m2p006_3, R.string.c1c100m2p006_4,
				R.string.c1c100m2p006_5, R.string.c1c100m2p006_6,
			     R.string.c1c100m2p006_8)
				.size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.VERTICAL).callback("FuncionP6");
		txtC2P206_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();
		rgC2P206.agregarEspecifique(6, txtC2P206_ESP);

		rgC2P207 = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m2p007_1, R.string.c1c100m2p007_2,
				R.string.c1c100m2p007_3).size(WRAP_CONTENT, WRAP_CONTENT)
				.orientation(ORIENTATION.HORIZONTAL);

		grMetros = new GridComponent2(this.getActivity(), 3);
		grMetros.addComponent(lblAreaTerre);
		grMetros.addComponent(lblAreaCons);
		grMetros.addComponent(lblAreac);
		grMetros.addComponent(txtC2P203_1); 
		grMetros.addComponent(txtC2P203_2);
		grMetros.addComponent(txtC2P203_3);


		// Filtros.setFiltro(txtC2P202A_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC2P203_1, Filtros.TIPO.NUMBER, 7, -1, null, 1,
				9999998,9999999);
		Filtros.setFiltro(txtC2P203_2, Filtros.TIPO.NUMBER, 7, -1, null, 1,
				9999998,9999999);
		Filtros.setFiltro(txtC2P203_3, Filtros.TIPO.NUMBER, 2, -1, null, 1,
				30,99);
		Filtros.setFiltro(txtC2P204_ESP, Filtros.TIPO.ALFAN_U, 300, null);
		Filtros.setFiltro(txtC2P202_ESP_A, Filtros.TIPO.ALFAN_U, 300, null);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo, lblSubTitulo);
		q1 = createQuestionSection(R.string.mod02_preg01, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P201);
		q2 = createQuestionSection(R.string.mod02_preg02, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P202);
		q4 = createQuestionSection(R.string.mod02_preg03, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, grMetros.component());
		q5 = createQuestionSection(R.string.mod02_preg04, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P204);
		 q6 = createQuestionSection(R.string.mod02_preg05, Gravity.CENTER
		 | Gravity.CENTER_VERTICAL, rgC2P205);
		q7 = createQuestionSection(R.string.mod02_preg06, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P206);
		q8 = createQuestionSection(R.string.mod02_preg07, Gravity.CENTER
				| Gravity.CENTER_VERTICAL, rgC2P207);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q4);
		form.addView(q5);
		form.addView(q6);
		form.addView(q7);
		form.addView(q8);
		
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
			///
			if (rgC2P202.isTagSelected(8)) {
				if (!getCuestionarioService().saveOrUpdate(
						bean,
						bean.getSecCap(getListFields(this, new String[] {
								"C2P203_1", "C2P203_2", "C2P203_3", "C2P204",
								"C2P204_ESP", "C2P205", "C2P206", "C2P206_ESP",
								"C2P207", "C2P208", "C2P208_ESP", "C2P209",
								"C2P209A", "C2P209A_ESP", "C2P210", "C2P212",
								"C2P212_ESP", "C2P217", "C2P219", "C2P219_ESP",
								"C2P221_1", "C2P221_2", "C2P221_3", "C2P221_4",
								"C2P221_5", "C2P221_6", "C2P221_7", "C2P221_8",
								"C2P221_9", "C2P221_9ESP", "C2P221_10",
								"C2P222" })))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no se guardaron",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else {
			///
			if (!getCuestionarioService().saveOrUpdate(bean,
					bean.getSecCap(getListFields(this)))) {
				ToastMessage.msgBox(this.getActivity(),
						"Los datos no se guardaron",
						ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
			}
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

		if (Util.esVacio(rgC2P201)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P201.");
			view = rgC2P201;
			error = true;
			return false;
		}

		if (rgC2P201.isTagSelected(2)) {
			if (Util.esVacio(rgC2P202)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P202");
				view = rgC2P202;
				error = true;
				return false;
			}

			if (rgC2P202.isTagSelected(9)) {
				if (Util.esVacio(txtC2P202_ESP_A)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.202 (Especifique)");
					view = txtC2P202_ESP_A;
					error = true;
					return false;
				} else {
					if (txtC2P202_ESP_A.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC2P202_ESP_A;
						error = true;
						return false;
					}
				}
			}
		}
		Integer valor1 = Integer.parseInt(rgC2P202.getTagSelected("0").toString());
		
		if (valor1 != 10 && valor1 != 8) {
			 if (Util.esVacio(txtC2P203_2)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La pregunta P203.B (Área construida)");
				view = txtC2P203_2;
				error = true;
				return false;
			}
			if (Util.esVacio(txtC2P203_3)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La pregunta P203.C (Niveles  construidos)");
				view = txtC2P203_3;
				error = true;
				return false;
			  }
	     	}

		if (valor1 != 8) {
		
		if (Util.esVacio(txtC2P203_1)) {
			mensaje = pregunta_no_vacia.replace("$",
					"La pregunta P203.A (Área de terreno)");
			view = txtC2P203_1;
			error = true;
			return false;
	 	}
//		 if (Util.esVacio(txtC2P203_2)) {
//			mensaje = pregunta_no_vacia.replace("$",
//					"La pregunta P203.B (Área construida)");
//			view = txtC2P203_2;
//			error = true;
//			return false;
//		}
//		if (Util.esVacio(txtC2P203_3)) {
//			mensaje = pregunta_no_vacia.replace("$",
//					"La pregunta P203.C (Niveles  construidos)");
//			view = txtC2P203_3;
//			error = true;
//			return false;
//		  }
		if (Util.esVacio(rgC2P204)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P204");
			view = rgC2P204;
			error = true;
			return false;
		}
		
		if (rgC2P204.isTagSelected(4)) {
			if (Util.esVacio(txtC2P204_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.204 (Especifique)");
				view = txtC2P204_ESP;
				error = true;
				return false;
			} else {
				if (txtC2P204_ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC2P204_ESP;
					error = true;
					return false;
				}
			}
		}
		if (rgC2P204.isTagSelected(1)) {
			if (Util.esVacio(rgC2P205)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P205");
				view = rgC2P205;
				error = true;
				return false;
			}

			if (rgC2P205.isTagSelected(1)) {
				if (Util.esVacio(rgC2P206)) {
					mensaje = pregunta_no_vacia
							.replace("$", "La pregunta P206");
					view = rgC2P206;
					error = true;
					return false;
				}
				if (rgC2P206.isTagSelected(8)) {
					if (Util.esVacio(txtC2P206_ESP)) {
						mensaje = pregunta_no_vacia.replace("$",
								"La Preg.206 (Especifique)");
						view = txtC2P206_ESP;
						error = true;
						return false;
					} else {
						if (txtC2P206_ESP.getText().length() < 3) {
							mensaje = "Ingrese la información correcta";
							view = txtC2P206_ESP;
							error = true;
							return false;
						}
					}
				}

			}
			if (rgC2P206.isTagSelected(1) || rgC2P206.isTagSelected(6) || rgC2P206.isTagSelected(7)) {
				if (Util.esVacio(rgC2P207)) {
					mensaje = pregunta_no_vacia
							.replace("$", "La pregunta P207");
					view = rgC2P207;
					error = true;
					return false;
				}
			}
		}
//		VERIFICACIÓN   :  Si C2P203_2 > C2P203_1 si C2P203_3>1 Error           
//		MENSAJE            :  “Error: El área construida no puede ser superior al terreno cuando tiene un solo nivel”

		if (Util.getInt(txtC2P203_2) > Util.getInt(txtC2P203_1)&& Util.getInt(txtC2P203_3)==1 ) {
			mensaje = "El área construida no puede ser superior al terreno cuando tiene un solo nivel";
			view = txtC2P203_2;
			error = true;
			return false;
		}
		
		if (rgC2P201.isTagSelected(2) && Util.getInt(caratula.p22,0) ==2) {
			ToastMessage.msgBox(this.getActivity(),
					"VERIFICAR: cuenta con más de 2 locales declarados en la caratula y no los declara en P201", ToastMessage.MESSAGE_INFO,
					ToastMessage.DURATION_LONG);
//			mensaje = "VERIFICAR: cuenta con más de 2 locales declarados en la caratula y no los declara en P201";
//			view = rgC2P201;
//			error = true;
//			return false;
		}
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
			bean.id = App.getInstance().getEmpresa().id;
		}
		caratula = getCuestionarioService().getCaratula(
				App.getInstance().getEmpresa(),
				new Caratula().getSecCap(Util.getListList("P22")));

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		rgC2P201.requestFocus();
		
		FuncionP1();
		FuncionP202();
		FuncionP4();
		 FuncionP5();
		FuncionP6();
		rgC2P201.requestFocus();

	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}


	public void FuncionP1() {
		Integer valor = Integer.parseInt(rgC2P201.getTagSelected("0").toString());

		if (valor == 1) {
			Util.cleanAndLockView(getActivity(), rgC2P202);
			txtC2P203_1.requestFocus();
		} else if (valor == 2) {
			Util.lockView(getActivity(), false, rgC2P202);
			rgC2P202.requestFocus();
		}
	}
	////
	public void FuncionP202() {

		Integer valor = Integer.parseInt(rgC2P202.getTagSelected("0").toString());

		if (valor == 8) { 
			Util.cleanAndLockView(getActivity(),txtC2P203_1,txtC2P203_2,txtC2P203_3,rgC2P204,rgC2P205,rgC2P206,rgC2P206,rgC2P207);
		
		 } else {
			Util.lockView(getActivity(), false,txtC2P203_1,txtC2P203_2,txtC2P203_3,rgC2P204,rgC2P205,rgC2P206,rgC2P206,rgC2P207);
			
			if (valor == 10) {
				Util.cleanAndLockView(getActivity(),txtC2P203_2,txtC2P203_3);
			
			} else {
				Util.lockView(getActivity(), false,txtC2P203_2,txtC2P203_3);
				txtC2P203_1.requestFocus();
			}
			
			rgC2P202.requestFocus();
		}

	}
	///
	
	public void FuncionP4() {
		Integer valor = Integer.parseInt(rgC2P204.getTagSelected("0").toString());

		if (valor == 1) {
			Util.lockView(getActivity(), false, rgC2P205);
			rgC2P205.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(),  rgC2P205, rgC2P206,
					rgC2P207);
		}
	}

	public void FuncionP5() {
		Integer valor = Integer.parseInt(rgC2P205.getTagSelected("0")
				.toString());
		if (valor == 1) {
			Util.lockView(getActivity(), false, rgC2P206);
			rgC2P206.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), rgC2P206, txtC2P206_ESP,
					rgC2P207);
		}
	}

	public void FuncionP6() {

		Integer valor = Integer.parseInt(rgC2P206.getTagSelected("0").toString());

		if (valor == 1 || valor == 6 || valor == 7) {
			Util.lockView(getActivity(), false, rgC2P207);
			rgC2P207.requestFocus();
		} else {
			Util.cleanAndLockView(getActivity(), rgC2P207);
		}

	}
	
	@Override
	public Entity getEntity() {
		return bean;
	}
}

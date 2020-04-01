package gob.inei.ene2019v2.fragment.ModVII.dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModVII.Mod_VII_Fragment_001;
import gob.inei.ene2019v2.fragment.ModVII.Mod_VII_Fragment_001.SP499;
import gob.inei.ene2019v2.model.Moduloii;
import gob.inei.ene2019v2.model.Modulov01;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Mod_VII_Fragment_001_01 extends DialogFragmentComponent {

	@FieldAnnotation(orderIndex = 1)
	public TextField txtC7P701_$A_ESP;
	@FieldAnnotation(orderIndex = 2)
	public RadioGroupOtherField rgC7P701_$B;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC7P701_$C;
	@FieldAnnotation(orderIndex = 4)
	public TextField txtC7P701_$C_ESP;
	@FieldAnnotation(orderIndex = 5)
	public RadioGroupOtherField rgC7P701_$D;
	@FieldAnnotation(orderIndex = 6)
	public RadioGroupOtherField rgC7P701_$E;
	@FieldAnnotation(orderIndex = 7)
	public TextField txtC7P701_$E_ESP;
	@FieldAnnotation(orderIndex = 8)
	public RadioGroupOtherField rgC7P701_$F;
	@FieldAnnotation(orderIndex = 9)
	public TextField txtC7P701_$F_ESP;
	@FieldAnnotation(orderIndex = 10)
	public RadioGroupOtherField rgC7P701_$G;
	@FieldAnnotation(orderIndex = 11)
	public RadioGroupOtherField rgC7P701_$H;
	@FieldAnnotation(orderIndex = 12)
	public TextField txtC7P701_$H_ESP;
	@FieldAnnotation(orderIndex = 13)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 14)
	public ButtonComponent btnCancelar;

	private static Mod_VII_Fragment_001 caller;
	private SP499 bean;
	public Moduloii bean1 ;
	private LinearLayout q0,q1,q2,q3,q4,q5,q6,q7,botones;
	private CuestionarioService cuestionarioService;
	private Field[] fields;

	public static Mod_VII_Fragment_001_01 newInstance(FragmentForm pagina,SP499 detalle) {
		caller = (Mod_VII_Fragment_001) pagina;
		Filtros.clear();
		Mod_VII_Fragment_001_01 f = new Mod_VII_Fragment_001_01();
		f.setParent(pagina);
		Bundle args = new Bundle();
		args.putSerializable("detalle", detalle);
		f.setArguments(args);
		return f;
	}

	public Mod_VII_Fragment_001_01() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		bean = (SP499) getArguments().getSerializable("detalle");
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getDialog().setTitle(bean.nombre);
		final View rootView = createUI();
		initObjectsWithoutXML(this, rootView);

		cargarDatos();
		enlazarCajas();
		listening();
		return rootView;

	}

	private void cargarDatos() {
		fields = this.getClass().getDeclaredFields();
		getBean();
		caretaker.addMemento("antes", bean.saveToMemento(SP499.class));
		
		
		 bean1 = getCuestionarioService().getModuloii(
				App.getInstance().getEmpresa(),
				new Moduloii().getSecCap(Util.getListList("C2P206")));
			if (bean1 == null) {
				bean1 = new Moduloii();
				bean1.id = App.getInstance().getEmpresa().id;
			}
		inicio();
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(txtC7P701_$A_ESP);
		q1 = createQuestionSection(R.string.lbl_title_modvii_preg1_3,
				rgC7P701_$B);
		q2 = createQuestionSection(R.string.lbl_title_modvii_preg1_4,
				rgC7P701_$C);
		q3 = createQuestionSection(R.string.lbl_title_modvii_preg1_5,
				rgC7P701_$D);
		q4 = createQuestionSection(R.string.lbl_title_modvii_preg1_6,
				rgC7P701_$E);
		q5 = createQuestionSection(R.string.lbl_title_modvii_preg1_7,
				rgC7P701_$F);
		q6 = createQuestionSection(R.string.lbl_title_modvii_preg1_8,
				rgC7P701_$G);
		q7 = createQuestionSection(R.string.lbl_title_modvii_preg1_9,
				rgC7P701_$H);

		botones = createButtonSection(btnAceptar, btnCancelar);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);
		form.addView(q4);
		form.addView(q5);
		form.addView(q6);
		form.addView(q7);

		form.addView(botones);

		return contenedor;
	}

	@Override
	protected void buildFields() {

		txtC7P701_$A_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();

		rgC7P701_$B = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1b_1, R.string.c1c100m7p001_1b_2)
				.size(30, 200).orientation(ORIENTATION.HORIZONTAL)
				.callback("jumP1_1B");
		rgC7P701_$C = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1c_1, R.string.c1c100m7p001_1c_2,
				R.string.c1c100m7p001_1c_3, R.string.c1c100m7p001_1c_4,
				R.string.c1c100m7p001_1c_5, R.string.c1c100m7p001_1c_6,
				R.string.c1c100m7p001_1c_7, R.string.c1c100m7p001_1c_8).size(
				380, 500).orientation(ORIENTATION.VERTICAL);
		txtC7P701_$C_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 350).hint(R.string.especifique)
				.soloTextoNumero();
		rgC7P701_$C.agregarEspecifique(7, txtC7P701_$C_ESP);

		rgC7P701_$D = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1b_1, R.string.c1c100m7p001_1b_2)
				.size(30, 200).orientation(ORIENTATION.HORIZONTAL)
				.callback("jumP1_1D");
		rgC7P701_$E = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1e_1, R.string.c1c100m7p001_1e_2,
				R.string.c1c100m7p001_1e_3, R.string.c1c100m7p001_1e_4,
				R.string.c1c100m7p001_1e_5, R.string.c1c100m7p001_1e_6).size(
				310, 550).orientation(ORIENTATION.VERTICAL);
		txtC7P701_$E_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 350).hint(R.string.especifique)
				.soloTextoNumero();
		rgC7P701_$E.agregarEspecifique(5, txtC7P701_$E_ESP);

		rgC7P701_$F = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1g_1, R.string.c1c100m7p001_1g_2,
				R.string.c1c100m7p001_1g_3, R.string.c1c100m7p001_1g_4,
				R.string.c1c100m7p001_1g_5, R.string.c1c100m7p001_1g_6,
				R.string.c1c100m7p001_1g_7, R.string.c1c100m7p001_1g_8,
				R.string.c1c100m7p001_1g_9).size(430, 550).orientation(
				ORIENTATION.VERTICAL);
		txtC7P701_$F_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 350).hint(R.string.especifique)
				.soloTextoNumero();

		rgC7P701_$F.agregarEspecifique(8, txtC7P701_$F_ESP);

		rgC7P701_$G = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1b_1, R.string.c1c100m7p001_1b_2)
				.size(30, 200).orientation(ORIENTATION.HORIZONTAL)
				.callback("jumP1_1G");

		rgC7P701_$H = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1h_1, R.string.c1c100m7p001_1h_2,
				R.string.c1c100m7p001_1h_3, R.string.c1c100m7p001_1h_4,
				R.string.c1c100m7p001_1h_5, R.string.c1c100m7p001_1h_6).size(
				300, 500).orientation(ORIENTATION.VERTICAL);
		txtC7P701_$H_ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 350).hint(R.string.especifique)
				.soloTextoNumero();

		rgC7P701_$H.agregarEspecifique(5, txtC7P701_$H_ESP);

		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Mod_VII_Fragment_001_01.this.dismiss();
			}
		});
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean flag = grabar();
				if (!flag) {
					return;
				}
				caller.reload();
				Mod_VII_Fragment_001_01.this.dismiss();
			}
		});

		Filtros.setFiltro(txtC7P701_$C_ESP, Filtros.TIPO.ALFA_U, 300, null);
		Filtros.setFiltro(txtC7P701_$E_ESP, Filtros.TIPO.ALFA_U, 300, null);
		Filtros.setFiltro(txtC7P701_$F_ESP, Filtros.TIPO.ALFA_U, 300, null);
		Filtros.setFiltro(txtC7P701_$H_ESP, Filtros.TIPO.ALFA_U, 300, null);
		Filtros.setFiltro(txtC7P701_$A_ESP, Filtros.TIPO.ALFA_U, 300, null);
		
	}

	public void jumP1_1B() {
		if (rgC7P701_$B.isTagSelected(1)) {
			Util.cleanAndLockView(getActivity(), rgC7P701_$C, txtC7P701_$C_ESP);
			Util.lockView(getActivity(), false, rgC7P701_$D);
			rgC7P701_$D.requestFocus();
		} else {
			Util.lockView(getActivity(), false, rgC7P701_$C);
			Util.cleanAndLockView(getActivity(), rgC7P701_$D, rgC7P701_$E,
					rgC7P701_$F, rgC7P701_$G, rgC7P701_$H);
			rgC7P701_$C.requestFocus();
		}
	}

	public void jumP1_1D() {
		if (rgC7P701_$D.isTagSelected(1) && rgC7P701_$B.isTagSelected(1)) {
			Util.cleanAndLockView(getActivity(), rgC7P701_$E, txtC7P701_$E_ESP);
			Util.lockView(getActivity(), false, rgC7P701_$F, rgC7P701_$G);
			rgC7P701_$F.requestFocus();
		} else if (rgC7P701_$D.isTagSelected(2) && rgC7P701_$B.isTagSelected(1)) {
			Util.lockView(getActivity(), false, rgC7P701_$E);
			Util.cleanAndLockView(getActivity(), rgC7P701_$F, txtC7P701_$F_ESP,
					rgC7P701_$G, rgC7P701_$H, txtC7P701_$H_ESP);
			rgC7P701_$E.requestFocus();
		}
	}

	public void jumP1_1G() {
		if (rgC7P701_$G.isTagSelected(2)) {
			Util.cleanAndLockView(getActivity(), rgC7P701_$H, txtC7P701_$H_ESP);
			// rgC7P701_2A.requestFocus();
		} else if (rgC7P701_$G.isTagSelected(1) && rgC7P701_$D.isTagSelected(1)) {
			Util.lockView(getActivity(), false, rgC7P701_$H);
			rgC7P701_$H.requestFocus();
		}
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

		setBean();
		return true;
	}

	private void getBean() {
		for (Entry<Field, Object> e : bean.info.entrySet()) {
			Field key = e.getKey();
			Object value = e.getValue();
			try {
				Field campo = getField(fields, key);
				if (campo != null && value != null) {
					Object obj = campo.get(this);
					if (campo.getType() == IntegerField.class) {
						((IntegerField) obj).setText(value.toString());
					} else if (campo.getType() == TextField.class) {
						((TextField) obj).setText(value.toString());
					} else if (campo.getType() == RadioGroupOtherField.class) {
						((RadioGroupOtherField) obj).setValue(value.toString());
					}
				}
			} catch (IllegalArgumentException e1) {
				Log.e("error: ", "error: " + e1.getMessage());
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				Log.e("error: ", "error1: " + e1.getMessage());
				e1.printStackTrace();
			}
		}
	}

	private Field getField(Field[] fields, Field key) {
		if (fields != null && fields.length > 0) {
			for (Field f : fields) {
				if ((f.getName().replaceFirst("[a-z]*", "").toLowerCase()
						.replace("$", "" + bean.orden)).equals(key.getName())) {
					return f;
				}
			}
		}
		return null;
	}

	private List<String> setBean() {
		List<String> campos = new ArrayList<String>();
		for (Entry<Field, Object> e : bean.info.entrySet()) {
			Field key = e.getKey();
			campos.add(key.getName());
		//	Log.e ("key.getName()", key.getName() +""); bueno
			try {
				Object valll = getValue(fields, key);
				valll = valll == null ? e.getValue() : valll;
				key.set(bean.c700, valll);
				bean.info.put(key, valll);
				
			} catch (IllegalArgumentException e1) {
				Log.e("error: ", "error: " + e1.getMessage());
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				Log.e("error: ", "error1: " + e1.getMessage());
				e1.printStackTrace();
			}
		}
		return campos;
	}

	private Object getValue(Field[] fields, Field key) {
		if (fields != null && fields.length > 0) {
			for (Field f : fields) {
				
		//		Log.e ("nbeam orden" , bean.orden +"");
				if ((f.getName().replaceFirst("[a-z]*", "").toLowerCase()
						.replace("$", "" + bean.orden)).equals(key.getName())) {
					try {
						Object val = f.get(this);
						String valor = null;
						if (f.getType() == IntegerField.class) {
							valor = ((IntegerField) val).getText().toString();
						} else if (f.getType() == TextField.class) {
							valor = ((TextField) val).getText().toString();
						} else if (f.getType() == RadioGroupOtherField.class) {
							Object val1 = ((RadioGroupOtherField) val)
									.getValue();
							valor = val1 == null ? null : val1.toString();
						}
						return key.getType() == Integer.class ? Integer
								.valueOf(valor) : valor;
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	private boolean validar() {
		String pregunta_no_vacia = this.getResources().getString(
				R.string.pregunta_no_vacia);
		String especifique_no_vacio = getString(R.string.pregunta_especifique);
		error = false;
		
	
		
		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}
		
		if (Util.esVacio(rgC7P701_$B)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P701_" +bean.orden  +"B");
			view = rgC7P701_$B;
			error = true;
			return false;
		}

		if (rgC7P701_$B.isTagSelected(2)) {
			if (Util.esVacio(rgC7P701_$C)) {
				mensaje = pregunta_no_vacia.replace("$", "La pregunta P701_" +bean.orden  +"C");
				view = rgC7P701_$C;
				error = true;
				return false;
			}
			if (rgC7P701_$C.isTagSelected(8) && Util.esVacio(txtC7P701_$C_ESP)) {
				mensaje = pregunta_no_vacia.replace("$",
						"La Preg.2 (Especifique)");
				view = txtC7P701_$C_ESP;
				error = true;
				return false;
			}
		} else {
		//	if(bean.orden!=7){
				if (Util.esVacio(rgC7P701_$D)) {
					mensaje = pregunta_no_vacia.replace("$", "La pregunta P701_" +bean.orden  +"D");
					view = rgC7P701_$D;
					error = true;
					return false;
				}
	
				if (Util.esVacio(rgC7P701_$E) && rgC7P701_$D.isTagSelected(2)) {
					mensaje = pregunta_no_vacia.replace("$", "La pregunta P701_" +bean.orden  +"E");
					view = rgC7P701_$E;
					error = true;
					return false;
				}
	
				if (rgC7P701_$E.isTagSelected(6) && Util.esVacio(txtC7P701_$E_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.3 (Especifique)");
					view = txtC7P701_$E_ESP;
					error = true;
					return false;
				}
	
				if (Util.esVacio(rgC7P701_$F) && rgC7P701_$D.isTagSelected(1)) {
					mensaje = pregunta_no_vacia.replace("$", "La pregunta P701_" +bean.orden  +"F");
					view = rgC7P701_$F;
					error = true;
					return false;
				}
	
				if (rgC7P701_$F.isTagSelected(9) && Util.esVacio(txtC7P701_$F_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.4 (Especifique)");
					view = txtC7P701_$F_ESP;
					error = true;
					return false;
				}
	
				if (Util.esVacio(rgC7P701_$G) && Util.esVacio(rgC7P701_$E)) {
					mensaje = pregunta_no_vacia.replace("$", "La pregunta P701_" +bean.orden  +"G");
					view = rgC7P701_$G;
					error = true;
					return false;
				}
	
				if (Util.esVacio(rgC7P701_$H) && rgC7P701_$G.isTagSelected(1)) {
					mensaje = pregunta_no_vacia.replace("$", "La pregunta P701_" +bean.orden  +"H");
					view = rgC7P701_$H;
					error = true;
					return false;
				}
	
				if (rgC7P701_$H.isTagSelected(6) && Util.esVacio(txtC7P701_$H_ESP)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.5 (Especifique)");
					view = txtC7P701_$H_ESP;
					error = true;
					return false;
				}
		//	}
		}

		if (bean.orden == Mod_VII_Fragment_001.ESPECIFIQUE) {

			if (Util.getInt(bean.getRg()) == 1 ){
				if (Util.esVacio(txtC7P701_$A_ESP)) {
					mensaje = especifique_no_vacio;
					view = txtC7P701_$A_ESP;
					error = true;
					return false;
				}
			}				
	
		}
		
		if(Util.getInt(bean1.c2p206,0)==1 && rgC7P701_$C.isTagSelected(6)){
			mensaje = "En Preg.701_2 indica que no solicito crédito por no tener título de propiedad pero Preg.206 dice que si tiene";
			view = rgC7P701_$C;
			error = true;
			return false;
		}
		
		if(Util.getInt(bean1.c2p206,0)==1 && rgC7P701_$E.isTagSelected(4)){
			mensaje = "En Preg.701_3 indica que no solicito crédito por no tener título de propiedad pero Preg.206 dice que si tiene";
			view = rgC7P701_$C;
			error = true;
			return false;
		}
		return true;
	}

	private void inicio() {

		jumP1_1B();
		jumP1_1D();
		jumP1_1G();

		if (bean.orden == Mod_VII_Fragment_001.ESPECIFIQUE) {
			q0.setVisibility(View.VISIBLE);
			txtC7P701_$A_ESP.requestFocus();
		} else {
			q0.setVisibility(View.GONE);
			rgC7P701_$B.requestFocus();
		}
		
//		if(bean.orden==7){
//			q3.setVisibility(View.GONE);
//			q4.setVisibility(View.GONE);
//			q5.setVisibility(View.GONE);
//			q6.setVisibility(View.GONE);
//			q7.setVisibility(View.GONE);
//			
//			//btnAceptar.requestFocus();
//		}
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

}
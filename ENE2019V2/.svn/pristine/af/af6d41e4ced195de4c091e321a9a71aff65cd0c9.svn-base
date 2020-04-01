package gob.inei.ene2019v2.fragment.ModVI;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.CheckBoxField;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.RadioGroupOtherField;
import gob.inei.dnce.components.RadioGroupOtherField.ORIENTATION;
import gob.inei.dnce.components.TextField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.dnce.util.Filtros.TIPO;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_006.Detalle;
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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;


public class Mod_VI_Fragment_006_01 extends DialogFragmentComponent {
	
	@FieldAnnotation(orderIndex = 1)
	public TextField txtC6P613E_1ESP;
	@FieldAnnotation(orderIndex = 2)
	public IntegerField txtC6P616B;
	@FieldAnnotation(orderIndex = 3)
	public RadioGroupOtherField rgC6P616C;
	@FieldAnnotation(orderIndex = 4)
	public CheckBoxField chbC6P616D_1;
	@FieldAnnotation(orderIndex = 5)
	public CheckBoxField chbC6P616D_2;
	@FieldAnnotation(orderIndex = 6)
	public CheckBoxField chbC6P616D_3;
	@FieldAnnotation(orderIndex = 7)
	public CheckBoxField chbC6P616D_4;
	@FieldAnnotation(orderIndex = 8)
	public CheckBoxField chbC6P616D_5;
	@FieldAnnotation(orderIndex = 9)
	public CheckBoxField chbC6P616D_6;
	@FieldAnnotation(orderIndex = 10)
	public CheckBoxField chbC6P616D_7;
	@FieldAnnotation(orderIndex = 11)
	public CheckBoxField chbC6P616D_8;
	@FieldAnnotation(orderIndex = 12)
	public CheckBoxField chbC6P616D_9;
	@FieldAnnotation(orderIndex = 13)
	public CheckBoxField chbC6P616D_10;
	@FieldAnnotation(orderIndex = 14)
	public TextField txtC6P616D_10_O;	
	@FieldAnnotation(orderIndex = 15)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 16)
	public ButtonComponent btnCancelar;

	private static Mod_VI_Fragment_006 caller;
	private Detalle detalles;
	public Integer position;
	private LinearLayout q0,q1,q2,q3,botones;
	private CuestionarioService cuestionarioService;
	public GridComponent grid;
	private Field[] fields;

	public static Mod_VI_Fragment_006_01 newInstance(FragmentForm pagina,
			Detalle detalle, Integer position) {
		caller = (Mod_VI_Fragment_006) pagina;
		Filtros.clear();
		Mod_VI_Fragment_006_01 f = new Mod_VI_Fragment_006_01();
		f.setParent(pagina);
		Bundle args = new Bundle();
		args.putSerializable("detalle", detalle);
		f.position = position;
		f.setArguments(args);
		return f;
	}

	public Mod_VI_Fragment_006_01() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		detalles = (Detalle) getArguments().getSerializable("detalle");
		caretaker = new Caretaker<Entity>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getDialog().setTitle(detalles.label);
		final View rootView = createUI();
		initObjectsWithoutXML(this, rootView);

		cargarDatos();
		enlazarCajas();
		listening();
		return rootView;

	}

	
	private void cargarDatos() {
	
		entityToUI(detalles);
		caretaker.addMemento("antes",detalles.saveToMemento(Detalle.class, detalles.label));


		inicio();
	}

	
	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(txtC6P613E_1ESP);
		q1 = createQuestionSection(R.string.c1c100m6p016b,	txtC6P616B);
		q2 = createQuestionSection(R.string.c1c100m6p016c,	rgC6P616C);
		q3 = createQuestionSection(R.string.c1c100m6p016d,chbC6P616D_1, chbC6P616D_2, chbC6P616D_3,chbC6P616D_4,chbC6P616D_5,chbC6P616D_6,chbC6P616D_7,chbC6P616D_8,chbC6P616D_9,grid.component());

		botones = createButtonSection(btnAceptar, btnCancelar);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		form.addView(q2);
		form.addView(q3);

		form.addView(botones);

		return contenedor;
	}

	@Override
	protected void buildFields() {

		txtC6P613E_1ESP = new TextField(this.getActivity(), false)
				.size(altoComponente, 450).hint(R.string.especifique)
				.soloTextoNumero();

		txtC6P616B = new IntegerField(this.getActivity(), false)
				.size(altoComponente, 180).centrar();
		
		rgC6P616C = new RadioGroupOtherField(this.getActivity(),
				R.string.c1c100m7p001_1b_1, R.string.c1c100m7p001_1b_2)
				.size(30, 200).orientation(ORIENTATION.HORIZONTAL)
				.callback("jumP1_1B");
		

		chbC6P616D_1 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c1, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_2 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c2, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_3 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c3, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_4 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c4, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_5 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c5, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_6 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c6, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_7 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c7, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_8 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c8, "1:0").size(WRAP_CONTENT, 550);
		chbC6P616D_9 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c9, "1:0").size(WRAP_CONTENT, 550);
		
		chbC6P616D_10 = new CheckBoxField(this.getActivity(),
				R.string.c1c100m6p016_c10, "1:0").size(WRAP_CONTENT, 150).callback("Funcion616Check");		
		
		txtC6P616D_10_O = new TextField(this.getActivity(), false)
				.size(altoComponente, 400).hint(R.string.especifique)
				.soloTextoNumero();	
		
		
		grid = new GridComponent(this.getActivity(), 2);
		grid.colorFondo(android.R.color.transparent);
		grid.addComponent(chbC6P616D_10);
		grid.addComponent(txtC6P616D_10_O);
		
		btnAceptar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getParent().getActivity(),
				App.ESTILO_BOTON).text(R.string.btnCancelar).size(200, 60);
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Mod_VI_Fragment_006_01.this.dismiss();
			}
		});
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean flag = grabar();
				if (!flag) {
					return;
				}
				Mod_VI_Fragment_006_01.this.dismiss();
			}
		});

		Filtros.setFiltro(txtC6P616B, Filtros.TIPO.NUMBER, null,1,356);
		Filtros.setFiltro(txtC6P616D_10_O, Filtros.TIPO.ALFA_U, 300, null);
		Filtros.setFiltro(txtC6P613E_1ESP, Filtros.TIPO.ALFA_U, 300, null);
		
	}

	public void jumP1_1B() {
		if (rgC6P616C.isTagSelected(1)) {
			Util.lockView(getActivity(), false, chbC6P616D_1, chbC6P616D_2,
					chbC6P616D_3, chbC6P616D_4, chbC6P616D_5,
					chbC6P616D_6, chbC6P616D_7,chbC6P616D_8,
					chbC6P616D_9,chbC6P616D_10);
			chbC6P616D_1.requestFocus();			

		} else {
			Util.cleanAndLockView(getActivity(),chbC6P616D_1, chbC6P616D_2,
					chbC6P616D_3, chbC6P616D_4, chbC6P616D_5,
					chbC6P616D_6, chbC6P616D_7,chbC6P616D_8,
					chbC6P616D_9,chbC6P616D_10,txtC6P616D_10_O);
		}
	}

	private boolean grabar() {
		uiToEntity(detalles);
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
		caller.llenaDetalle(detalles,position);
		return true;
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
		
		if (Util.esVacio(txtC6P616B)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P616B");
			view = txtC6P616B;
			error = true;
			return false;
		}
		
		if (Util.esVacio(rgC6P616C)) {
			mensaje = pregunta_no_vacia.replace("$", "La pregunta P616C");
			view = rgC6P616C;
			error = true;
			return false;
		}

		if (rgC6P616C.isTagSelected(1)) {
			if (!chbC6P616D_1.isChecked() && !chbC6P616D_2.isChecked()
					&& !chbC6P616D_3.isChecked() && !chbC6P616D_4.isChecked()
					&& !chbC6P616D_5.isChecked() && !chbC6P616D_6.isChecked()
					&& !chbC6P616D_7.isChecked() && !chbC6P616D_8.isChecked()
					&& !chbC6P616D_9.isChecked() && !chbC6P616D_10.isChecked()) {
				mensaje = "DEBE MARCAR AL MENOS UNA ALTERNATIVA EN P616C";
				view = chbC6P616D_1;
				error = true;
				return false;
			}
			if (chbC6P616D_10.isChecked()) {
				if (Util.esVacio(txtC6P616D_10_O)) {
					mensaje = pregunta_no_vacia.replace("$",
							"La Preg.616 (Especifique)");
					view = txtC6P616D_10_O;
					error = true;
					return false;
				} else {
					if (txtC6P616D_10_O.getText().length() < 3) {
						mensaje = "Ingrese la información correcta";
						view = txtC6P616D_10_O;
						error = true;
						return false;
					}
				}
			}

		} 

		if (Util.getInt(position)==4) {

			if (Util.esVacio(txtC6P613E_1ESP)) {
				mensaje = "La Preg.616A (Especifique) no puede estar vacía";
				view = txtC6P613E_1ESP;
				error = true;
				return false;
			}else{
				if (txtC6P613E_1ESP.getText().length() < 3) {
					mensaje = "Ingrese la información correcta";
					view = txtC6P613E_1ESP;
					error = true;
					return false;
				}
			}
		}
		
		switch(Util.getInt(position)){
			case 0: if(Util.getInt(txtC6P616B.getText())>12){ToastMessage.msgBox(getActivity(),"Verificar: Máximos días en llegar al destino.", ToastMessage.MESSAGE_INFO,ToastMessage.DURATION_LONG);}break;
			case 1: if(Util.getInt(txtC6P616B.getText())>30){ToastMessage.msgBox(getActivity(),"Verificar: Máximos días en llegar al destino.", ToastMessage.MESSAGE_INFO,ToastMessage.DURATION_LONG);}break;
			case 2: if(Util.getInt(txtC6P616B.getText())>60){ToastMessage.msgBox(getActivity(),"Verificar: Máximos días en llegar al destino.", ToastMessage.MESSAGE_INFO,ToastMessage.DURATION_LONG);}break;
			case 3: if(Util.getInt(txtC6P616B.getText())>8 ){ToastMessage.msgBox(getActivity(),"Verificar: Máximos días en llegar al destino.", ToastMessage.MESSAGE_INFO,ToastMessage.DURATION_LONG);}break;
		}

		return true;
	}

	private void inicio() {
		Log.e("position", position + "");	
		jumP1_1B();
		Funcion616Check();
		if (Util.getInt(position)==4) {
			q0.setVisibility(View.VISIBLE);
			txtC6P613E_1ESP.requestFocus();
		} else {
			q0.setVisibility(View.GONE);
			txtC6P616B.requestFocus();
		}

	}

	public void Funcion616Check() {
		if (!chbC6P616D_10.isChecked()) {
			Util.cleanAndLockView(getActivity(), txtC6P616D_10_O);
		} else {
			Util.lockView(getActivity(), false, txtC6P616D_10_O);
			txtC6P616D_10_O.requestFocus();
		}
	}
	
	
	
	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

}
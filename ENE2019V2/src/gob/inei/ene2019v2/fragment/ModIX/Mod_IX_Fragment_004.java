package gob.inei.ene2019v2.fragment.ModIX;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.DecimalField;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.IntegerField;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Calculo;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloix;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.math.BigDecimal;
import java.sql.SQLException;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class Mod_IX_Fragment_004 extends FragmentForm {

	@FieldAnnotation(orderIndex = 1)
	public DecimalField txtC9P904_1;
	@FieldAnnotation(orderIndex = 2)
	public DecimalField txtC9P904_2;
	@FieldAnnotation(orderIndex = 3)
	public DecimalField txtC9P904_3;
	@FieldAnnotation(orderIndex = 4)
	public DecimalField txtC9P904_4;
	@FieldAnnotation(orderIndex = 5)
	public DecimalField txtC9P904_5;
	@FieldAnnotation(orderIndex = 6)
	public DecimalField txtC9P904_6;
	@FieldAnnotation(orderIndex = 7)
	public DecimalField txtC9P904_7;

	private CuestionarioService cuestionarioService;
	private Moduloix bean;
	private Caratula caratula;
	private LabelComponent lblTitulo,lblTitulota, lblTituloha,  lblNum, lblConcepto, lblTotal, lblpre1,
			lblnota, lblpre2, lblpre3, lblpre4, lblpre5, lblpre6, lblpre7;
	private GridComponent2 grd1,grd;
	LinearLayout q0, q1, q2, q3, q4, q5;

	public Mod_IX_Fragment_004() {
	}

	private static Mod_IX_Fragment_004 caller;

	public Mod_IX_Fragment_004 parent(MasterActivity parent) {
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
		executeEvents();
		confSumatorias();
		enlazarCajas();
		listening();
		return rootView;
	}

	private void confSumatorias() {
		Calculo suma1 = new Calculo(this, txtC9P904_3, 0, 0, Util.getListList(
				txtC9P904_1, txtC9P904_2));
		suma1.setConfOperacion(true, true);

//		Calculo<IntegerField> suma2 = new Calculo<IntegerField>(this, txtC9P904_7,
//				0, 0, Util.getListList(txtC9P904_3, txtC9P904_4, txtC9P904_5,
//						txtC9P904_6));
				
//		suma2.setConfOperacion(true, true);
		suma1.setCallback("onResult");
//		suma2.setCallback("onResult1");
	}

	public void onResult(Integer result) {
		long resp = result - 2 * Util.getInt(txtC9P904_2);
//		Log.e ("result xx ", result + "");
//		Log.e ("resp", resp + "");
		txtC9P904_3.setText(result == null ? "0" : String.valueOf(resp));
		txtC9P904_3.setTextColor(resp < 0 ? Color.RED : Color.BLACK);
	}


		public void onResult1(Integer result) {
			long p904_3 = Util.getLong(txtC9P904_3,0);
			long p904_4 = Util.getLong(txtC9P904_4,0);
			long p904_5 = Util.getLong(txtC9P904_5,0);
			long p904_6 = Util.getLong(txtC9P904_6,0);	
			long rsp = p904_3 + p904_4 + p904_5 + p904_6;
			txtC9P904_7.setText("" + (rsp));
		}
		
				
	private void executeEvents() {
			txtC9P904_3.addTextChangedListener(new calcular(txtC9P904_7));  
			txtC9P904_4.addTextChangedListener(new calcular(txtC9P904_7));  
			txtC9P904_5.addTextChangedListener(new calcular(txtC9P904_7));  
			txtC9P904_6.addTextChangedListener(new calcular(txtC9P904_7));  
	
	}
	
	private class calcular implements TextWatcher {
		private View view;

		public calcular(View view) {
			this.view = view;
		}

		@Override
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
		}

		@Override
		public void afterTextChanged(Editable s) {
//			if (!Util.esVacio(s.toString())) {
//				if(!view.getClass().equals(IntegerField.class)){
//					Util.lockView(getActivity(), false, view);
//				}
				Log.e("recibirrrr::::", "entra aqui");
//				if(!chbP310_1_2.isChecked() && !chbP310_2_2.isChecked() && !chbP310_3_2.isChecked()
//						&& !chbP310_4_2.isChecked() && !chbP310_5_2.isChecked()){
					Log.e("recibirrrr::::", "entra aqui 222");
					
//					Log.e("recibirrrr::p310_1::", ""+Util.getInt(txtP310_1_1,0));
//					Log.e("recibirrrr::p310_2::", ""+Util.getInt(txtP310_2_1,0));
//					Log.e("recibirrrr::p310_3::", ""+Util.getInt(txtP310_3_1,0));
//					Log.e("recibirrrr::p310_4::", ""+Util.getInt(txtP310_4_1,0));
//					
//					
//					int p310_1 = Util.getInt(txtP310_1_1,0);
//					int p310_2 = Util.getInt(txtP310_2_1,0);
//					int p310_3 = Util.getInt(txtP310_3_1,0);
//					int p310_4 = Util.getInt(txtP310_4_1,0);
					
					int p904_3 = Util.getInt(txtC9P904_3,0);
					int p904_4 = Util.getInt(txtC9P904_4,0);
					int p904_5 = Util.getInt(txtC9P904_5,0);
					int p904_6 = Util.getInt(txtC9P904_6,0);	
					int rsp = p904_3 + p904_4 + p904_5 + p904_6;	

						
						Log.e("recibirrrr::antes::", ""+rsp);
						txtC9P904_7.setText("" + rsp);
						txtC9P904_7.setFocusable(false);
						Log.e("recibirrrr::despu�s::", ""+rsp);
						if (rsp < 0) {
							txtC9P904_7.setColorTexto(R.color.red);
						} else {
							txtC9P904_7.setColorTexto(R.color.black);
						}	
					
//				}
//			}
		}
	};	
	

//-10 - 2 * (10+ 10)
//   -10 -40 = -30 	 
	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.text(R.string.Capitulo900).textSize(21).centrar().negrita();
		
		lblTitulota = new LabelComponent(getActivity())
		.size(altoComponente, 205)
		.text("Pregunta 25 ").textSize(17).centrar().negrita()
		.colorFondo(R.color.celesteclaro);
		lblTituloha = new LabelComponent(getActivity())
		.size(altoComponente, 540)
		.text("").textSize(17).centrar().negrita()
		.colorFondo(R.color.celesteclaro);
		
		lblConcepto = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_cab1)
				.size(altoComponente + 15, 500).centrar();
		lblNum = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_cab2)
				.size(altoComponente + 15, 100).centrar();
		lblTotal = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_cab3)
				.size(altoComponente + 15, 150).centrar();
		lblnota = new LabelComponent(getActivity()).text(R.string.nota904)
				.size(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
				.textSize(18);

		lblpre1 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p004_1).size(altoComponente, 250);
		lblpre2 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p004_2).size(altoComponente, 250);
		lblpre3 = new LabelComponent(getActivity(), App.ESTILO).negrita()
				.text(R.string.c2c100m9p004_3).size(altoComponente, 250)
				.centrar();
		lblpre4 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p004_4).size(altoComponente, 250);
		lblpre5 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p004_5).size(altoComponente, 250);
		lblpre6 = new LabelComponent(getActivity()).negrita()
				.text(R.string.c2c100m9p004_6).size(altoComponente + 25, 250);
		lblpre7 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_7).size(altoComponente, 250)
				.centrar();

		LabelComponent p001 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_c1).size(altoComponente, 100)
				.centrar();
		LabelComponent p002 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_c2).size(altoComponente, 100)
				.centrar();
		LabelComponent p003 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_c3).size(altoComponente, 100)
				.centrar();
		LabelComponent p004 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_c4).size(altoComponente + 10, 100)
				.centrar();
		LabelComponent p005 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_c5).size(altoComponente, 100)
				.centrar();
		LabelComponent p006 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_c6).size(altoComponente, 100)
				.centrar();
		LabelComponent p007 = new LabelComponent(getActivity(), App.ESTILO)
				.text(R.string.c2c100m9p004_c7).size(altoComponente, 100)
				.centrar();

		txtC9P904_1 = new DecimalField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().maxLength(10);
		txtC9P904_2 = new DecimalField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().maxLength(10).callback("Focus1");
		txtC9P904_3 = new DecimalField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().readOnly();
		txtC9P904_4 = new DecimalField(this.getActivity(), false)
				.size(altoComponente + 10, 150).centrar().maxLength(10);
		txtC9P904_5 = new DecimalField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().maxLength(10);
		txtC9P904_6 = new DecimalField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().maxLength(10);
		txtC9P904_7 = new DecimalField(this.getActivity(), false)
				.size(altoComponente, 150).centrar().readOnly();

		grd1 = new GridComponent2(this.getActivity(), 3);
		grd1.addComponent(lblNum);
		grd1.addComponent(lblConcepto);
		grd1.addComponent(lblTotal);
		grd1.addComponent(p001);
		grd1.addComponent(lblpre1);
		grd1.addComponent(txtC9P904_1);
		grd1.addComponent(p002);
		grd1.addComponent(lblpre2);
		grd1.addComponent(txtC9P904_2);
		grd1.addComponent(p003);
		grd1.addComponent(lblpre3);
		grd1.addComponent(txtC9P904_3);
		grd1.addComponent(p004);
		grd1.addComponent(lblpre4);
		grd1.addComponent(txtC9P904_4);
		grd1.addComponent(p005);
		grd1.addComponent(lblpre5);
		grd1.addComponent(txtC9P904_5);
		grd1.addComponent(p006);
		grd1.addComponent(lblpre6);
		grd1.addComponent(txtC9P904_6);
		grd1.addComponent(p007);
		grd1.addComponent(lblpre7);
		grd1.addComponent(txtC9P904_7);
		
		grd = new GridComponent2(this.getActivity(), 2);
		grd.addComponent(lblTitulota); //label
		grd.addComponent(lblTituloha); //valor

		Filtros.setFiltro(txtC9P904_1, Filtros.TIPO.NUMBER, 10, -1, null, 0,
				9999999998l);
		Filtros.setFiltro(txtC9P904_2, Filtros.TIPO.NUMBER, 10, -1, null, 0,
				9999999998l);
//		Filtros.setFiltro(txtC9P904_3, Filtros.TIPO.NUMBER, 10, -1, null, 0,
//				9999999998l);
		Filtros.setFiltro(txtC9P904_4, Filtros.TIPO.NUMBER, 10, -1, null, 0,
				9999999998l);
		Filtros.setFiltro(txtC9P904_5, Filtros.TIPO.NUMBER, 10, -1, null, 0,
				9999999998l);
		Filtros.setFiltro(txtC9P904_6, Filtros.TIPO.NUMBER, 10, -1, null, 0,
				9999999998l);
//		Filtros.setFiltro(txtC9P904_7, Filtros.TIPO.NUMBER, 10, -1, null, 0,
//				9999999998l);
	}

	@Override
	protected View createUI() {
		buildFields();

		q0 = createQuestionSection(lblTitulo);
		q1 = createQuestionSection(R.string.c2c100m9p904, lblnota, grd.component(),
				grd1.component());
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q0);
		form.addView(q1);

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

//		for (int i = 1; i <= 7; i++) {
//			DecimalField x = ((DecimalField) getView("txtC9P904_" + (i)));
//			if (Util.esVacio(x)) {
//				mensaje = pregunta_no_vacia.replace("$", "TOTAL");
//				view = x;
//				return !(error = true);
//			}
//		}

		BigDecimal valor1 = Util
				.getBigDecimal(txtC9P904_1.getText().toString());
		BigDecimal valor4 = Util
				.getBigDecimal(txtC9P904_4.getText().toString());
		BigDecimal valor5 = Util
				.getBigDecimal(txtC9P904_5.getText().toString());

//		double SumaX1 = 0;
//		SumaX1 = Util.getSumaDecimal(2, valor1, valor4, valor5).doubleValue();
//
//		Log.e("Sumatoriaaa: ", "" + SumaX1);
//
//		if (Util.getInt(caratula.p25) == 1 && (SumaX1 > 607500)) {
//			mensaje = "La cantidad ingresada en Cap�tulo 900 debe guardar relaci�n con la pregunta (P25 = 1)";
//			view = txtC9P904_1;
//			error = true;
//			return false;
//		}
//
//		if (Util.getInt(caratula.p25) == 2
//				&& (SumaX1 < 607501 || SumaX1 > 6885000)) {
//			mensaje = "La cantidad ingresada en Cap�tulo 900 debe guardar relaci�n con la pregunta (P25 = 2)";
//			view = txtC9P904_1;
//			error = true;
//			return false;
//		}
//
//		if (Util.getInt(caratula.p25) == 3
//				&& (SumaX1 <= 6885001 || SumaX1 > 9315001)) {
//			mensaje = "La cantidad ingresada en Cap�tulo 900 debe guardar relaci�n con la pregunta (P25 = 3)";
//			view = txtC9P904_1;
//			error = true;
//			return false;
//		}
//		if (Util.getInt(caratula.p25) == 4 && (SumaX1 <= 9315000)) {
//			mensaje = "La cantidad ingresada en Cap�tulo 900 debe guardar relaci�n con la pregunta (P25 = 4)";
//			view = txtC9P904_1;
//			error = true;
//			return false;
//		}

		return true;
	}

	@Override
	public void cargarDatos() {
		caratula = App.getInstance().getEmpresa();
		bean = getCuestionarioService().getModuloix(
				App.getInstance().getEmpresa(),
				new Moduloix().getSecCap(getListFields(this)));
		if (bean == null) {
			bean = new Moduloix();
			bean.id = App.getInstance().getEmpresa().id;
		}

		entityToUI(bean);
		inicio();
	}

	private void inicio() {
		
		int total301m  = Util.getInt(caratula.p25);
		
		String label = "";
		switch (total301m) {
	
		case 1 : label ="1. Hasta 607 500 soles";		
			break;
		case 2: label = "2. Entre 607 501 y 6 885 000 soles";		
			break;
		case 3: label = "3. Entre 6 885 001 y 9 315 000  soles";		
			break;
		case 4: label = "4. M�s de 9 315 000 soles";		
			break;	

		default:
			label = "";
			break;
		}
		lblTituloha.setText(Util.getText(label));
		
		
		txtC9P904_3.setTextColor(Util.getLong(txtC9P904_3) < 0 ? Color.RED
				: Color.BLACK);
		txtC9P904_7.setTextColor(Util.getLong(txtC9P904_7) < 0 ? Color.RED
				: Color.BLACK);
		txtC9P904_1.requestFocus();
	}
	
	public void Focus1(){
		if(txtC9P904_2.getText().toString().length()>0){
			txtC9P904_4.requestFocus();
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

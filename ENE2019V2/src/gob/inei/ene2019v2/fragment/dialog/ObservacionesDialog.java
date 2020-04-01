package gob.inei.ene2019v2.fragment.dialog;

import gob.inei.dnce.annotations.FieldAnnotation;
import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogFragmentComponent;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.TextAreaField;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.util.Caretaker;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity.OBSV;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.model.Moduloii;
import gob.inei.ene2019v2.model.Moduloiii02;
import gob.inei.ene2019v2.model.Moduloiv03;
import gob.inei.ene2019v2.model.Moduloix;
import gob.inei.ene2019v2.model.Modulov02;
import gob.inei.ene2019v2.model.Modulovi01;
import gob.inei.ene2019v2.model.Modulovii01;
import gob.inei.ene2019v2.model.Moduloviii;
import gob.inei.ene2019v2.service.CuestionarioService;

import java.sql.SQLException;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class ObservacionesDialog extends DialogFragmentComponent {
	@FieldAnnotation(orderIndex = 1)
	public TextAreaField txtOBSERVACIONES;
	@FieldAnnotation(orderIndex = 2)
	public ButtonComponent btnAceptar;
	@FieldAnnotation(orderIndex = 3)
	public ButtonComponent btnCancelar;
	private CuestionarioService cuestionarioService;
	Caratula caratula;
	Moduloi c100;
	Moduloii c200;
	Moduloiii02 c300;
	Moduloiv03 c400;
	Modulov02 c500;
	Modulovi01 c600;
	Modulovii01 c700;
	Moduloviii c800;
	Moduloix c900;
	private String texto;
	private LabelComponent lblObservaciones;
	private LinearLayout q1, q2;
	private static MasterActivity caller;
	SeccionCapitulo[] secC100, secC200, secC300, secC400, secC500, secC600,
			secC700, secC800, secC900;
	CuestionarioFragmentActivity.OBSV modulo;

	public ObservacionesDialog() {
	}

	public interface C1_Cap00Fragment_001_01Listener {
		void onFinishEditDialog(String inputText);
	}

	public static ObservacionesDialog newInstance(MasterActivity pagina,
			CuestionarioFragmentActivity.OBSV modulo, String ptexto) {
		caller = pagina;
		ObservacionesDialog f = new ObservacionesDialog();
		f.setParentActivity(pagina);
		Bundle args = new Bundle();
		args.putSerializable("modulo", modulo);
		f.setArguments(args);
		f.texto = ptexto;
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		caretaker = new Caretaker<Entity>();

		secC100 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C1_OBS") };
		secC200 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C2_OBS") };
		secC300 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C3_OBS") };
		secC400 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C4_OBS") };
		secC500 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C5_OBS") };
		secC600 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C6_OBS") };
		secC700 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C7_OBS") };
		secC800 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C8_OBS") };
		secC900 = new SeccionCapitulo[] { new SeccionCapitulo(-1, -1, -1, "ID",
				"C9A_OBS") };

		modulo = (OBSV) getArguments().getSerializable("modulo");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
		final View rootView = createUI();
		initObjectsWithoutXML(this, rootView);
		cargarDatos();
		enlazarCajas(this);
		listening();
		return rootView;
	}

	@Override
	protected View createUI() {
		buildFields();
		q1 = createQuestionSection(lblObservaciones);
		q2 = createQuestionSection(txtOBSERVACIONES);
		LinearLayout botones = createButtonSection(btnAceptar, btnCancelar);
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);
		form.addView(q1);
		form.addView(q2);
		form.addView(botones);
		return contenedor;
	}

	@Override
	protected void buildFields() {

		txtOBSERVACIONES = new TextAreaField(getActivity()).size(550, 550)
				.maxLength(2000);

		lblObservaciones = new LabelComponent(this.getActivity(), App.ESTILO)
				.size(altoComponente, 550).text(R.string.OBS).textSize(18)
				.centrar().negrita();
		replaceText(lblObservaciones, Util.getListHashMap("$", texto));

		btnAceptar = new ButtonComponent(getActivity(), App.ESTILO_BOTON).text(
				R.string.btnAceptar).size(200, 60);
		btnCancelar = new ButtonComponent(getActivity(), App.ESTILO_BOTON)
				.text(R.string.btnCancelar).size(200, 60);
		btnCancelar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ObservacionesDialog.this.dismiss();
			}
		});
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean flag = grabar();
				if (!flag) {
					return;
				}
				ObservacionesDialog.this.dismiss();
			}
		});

		Filtros.setFiltro(txtOBSERVACIONES, Filtros.TIPO.ALFAN_U, 3000, null);

	}

	private boolean grabar() {
		if (modulo == OBSV.CAP100) {
			uiToEntity(c100);
		} else if (modulo == OBSV.CAP200) {
			uiToEntity(c200);
		} else if (modulo == OBSV.CAP300) {
			uiToEntity(c300);
		} else if (modulo == OBSV.CAP400) {
			uiToEntity(c400);
		} else if (modulo == OBSV.CAP500) {
			uiToEntity(c500);
		} else if (modulo == OBSV.CAP600) {
			uiToEntity(c600);
		} else if (modulo == OBSV.CAP700) {
			uiToEntity(c700);
		} else if (modulo == OBSV.CAP800) {
			uiToEntity(c800);
		} else if (modulo == OBSV.CAP900) {
			uiToEntity(c900);
		}

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
			if (modulo == OBSV.CAP100) {
				c100.c1_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c100,
						c100.getSecCap(Util.getListList("C1_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP200) {
				c200.c2_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c200,
						c200.getSecCap(Util.getListList("C2_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP300) {
				c300.c3_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c300,
						c300.getSecCap(Util.getListList("C3_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP400) {
				c400.c4_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c400,
						c400.getSecCap(Util.getListList("C4_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP500) {
				c500.c5_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c500,
						c500.getSecCap(Util.getListList("C5_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP600) {
				c600.c6_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c600,
						c600.getSecCap(Util.getListList("C6_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP700) {
				c700.c7_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c700,
						c700.getSecCap(Util.getListList("C7_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP800) {
				c800.c8_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c800,
						c800.getSecCap(Util.getListList("C8_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			} else if (modulo == OBSV.CAP900) {
				c900.c9a_obs = txtOBSERVACIONES.getText().toString();
				if (!getCuestionarioService().saveOrUpdate(c900,
						c900.getSecCap(Util.getListList("C9A_OBS")))) {
					ToastMessage.msgBox(this.getActivity(),
							"Los datos no fueron grabados",
							ToastMessage.MESSAGE_ERROR,
							ToastMessage.DURATION_LONG);
				}
			}

		} catch (SQLException e) {
			ToastMessage.msgBox(this.getActivity(), "ERROR: " + e.getMessage(),
					ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
		}
		return true;
	}

	private boolean validar() {
		String preguntaVacia = this.getResources().getString(
				R.string.pregunta_no_vacia);
		error = false;

		if (Filtros.getErrorFiltro() != null) {
			ToastMessage.msgBox(getActivity(), Filtros.getErrorFiltro()
					.getValue(), ToastMessage.MESSAGE_ERROR,
					ToastMessage.DURATION_LONG);
			Filtros.getErrorFiltro().getKey().requestFocus();
			return false;
		}

//		if (Util.esVacio(txtOBSERVACIONES)) {
//			mensaje = preguntaVacia.replace("$", "OBSERVACIONES ");
//			view = txtOBSERVACIONES;
//			return !(error = true);
//		}
		return true;
	}

	private void cargarDatos() {
		if (modulo == OBSV.CAP100) {
			c100 = getCuestionarioService().getModuloi(
					App.getInstance().getEmpresa(), secC100);
			if (c100 == null) {
				c100 = new Moduloi();
				c100.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c100);
			caretaker.addMemento("antes", c100.saveToMemento(Moduloi.class));
			if (c100.c1_obs != null) {
				txtOBSERVACIONES.setText(c100.c1_obs);
			}
		} else if (modulo == OBSV.CAP200) {
			c200 = getCuestionarioService().getModuloii(
					App.getInstance().getEmpresa(), secC200);
			if (c200 == null) {
				c200 = new Moduloii();
				c200.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c200);
			caretaker.addMemento("antes", c200.saveToMemento(Moduloii.class));
			if (c200.c2_obs != null) {
				txtOBSERVACIONES.setText(c200.c2_obs);
			}
		} else if (modulo == OBSV.CAP300) {
			c300 = getCuestionarioService().getModuloiii02(
					App.getInstance().getEmpresa(), secC300);
			if (c300 == null) {
				c300 = new Moduloiii02();
				c300.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c300);
			caretaker
					.addMemento("antes", c300.saveToMemento(Moduloiii02.class));
			if (c300.c3_obs != null) {
				txtOBSERVACIONES.setText(c300.c3_obs);
			}
		} else if (modulo == OBSV.CAP400) {
			c400 = getCuestionarioService().getModuloiv03(
					App.getInstance().getEmpresa(), secC400);
			if (c400 == null) {
				c400 = new Moduloiv03();
				c400.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c400);
			caretaker.addMemento("antes", c400.saveToMemento(Moduloiv03.class));
			if (c400.c4_obs != null) {
				txtOBSERVACIONES.setText(c400.c4_obs);
			}
		} else if (modulo == OBSV.CAP500) {
			c500 = getCuestionarioService().getModulov02(
					App.getInstance().getEmpresa(), secC500);
			if (c500 == null) {
				c500 = new Modulov02();
				c500.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c500);
			caretaker.addMemento("antes", c500.saveToMemento(Modulov02.class));
			if (c500.c5_obs != null) {
				txtOBSERVACIONES.setText(c500.c5_obs);
			}
		} else if (modulo == OBSV.CAP600) {
			c600 = getCuestionarioService().getModulovi01(
					App.getInstance().getEmpresa(), secC600);
			if (c600 == null) {
				c600 = new Modulovi01();
				c600.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c600);
			caretaker.addMemento("antes", c600.saveToMemento(Modulovi01.class));
			if (c600.c6_obs != null) {
				txtOBSERVACIONES.setText(c600.c6_obs);
			}
		} else if (modulo == OBSV.CAP700) {
			c700 = getCuestionarioService().getModulovii01(
					App.getInstance().getEmpresa(), secC700);
			if (c700 == null) {
				c700 = new Modulovii01();
				c700.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c700);
			caretaker
					.addMemento("antes", c700.saveToMemento(Modulovii01.class));
			if (c700.c7_obs != null) {
				txtOBSERVACIONES.setText(c700.c7_obs);
			}
		} else if (modulo == OBSV.CAP800) {
			c800 = getCuestionarioService().getModuloviii(
					App.getInstance().getEmpresa(), secC800);
			if (c800 == null) {
				c800 = new Moduloviii();
				c800.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c800);
			caretaker.addMemento("antes", c800.saveToMemento(Moduloviii.class));
			if (c800.c8_obs != null) {
				txtOBSERVACIONES.setText(c800.c8_obs);
			}
		} else if (modulo == OBSV.CAP900) {
			c900 = getCuestionarioService().getModuloix(
					App.getInstance().getEmpresa(), secC900);
			if (c900 == null) {
				c900 = new Moduloix();
				c900.id = App.getInstance().getEmpresa().id;
			}
			entityToUI(c900);
			caretaker.addMemento("antes", c900.saveToMemento(Moduloix.class));
			if (c900.c9a_obs != null) {
				txtOBSERVACIONES.setText(c900.c9a_obs);
			}
		}
		inicio();
	}

	private void inicio() {

		txtOBSERVACIONES.requestFocus();
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}
}
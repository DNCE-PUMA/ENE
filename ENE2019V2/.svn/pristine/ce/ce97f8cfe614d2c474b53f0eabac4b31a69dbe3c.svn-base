package gob.inei.ene2019v2.controller;

import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Usuario;
import gob.inei.ene2019v2.service.UsuarioService;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.SQLException;
import android.os.AsyncTask;
import android.util.Log;

public class Inicializacion extends AsyncTask<String, String, String> implements
		Respondible {
	private Activity activity;
	private ProgressDialog pDialog;
	private UsuarioService usuarioService;
	private String msg;
	private String titulo;
	private Usuario usuarioLogueado;
	private String usuario, clave, dni;
//	private PermisoService permisoService;

	public Inicializacion(Activity activity) {
		super();
		this.activity = activity;
		this.titulo = activity.getResources().getString(R.string.app_name);
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	protected void onPreExecute() {
		super.onPreExecute();
		pDialog = new ProgressDialog(this.activity);
		pDialog.setMessage("Iniciando aplicación. Por favor espere...");
		pDialog.setIndeterminate(false);
		pDialog.setCancelable(false);
		pDialog.show();
	}

	protected String doInBackground(String... args) {
		try {
			loguear();
			App.getInstance().setUsuario(usuarioLogueado);
			msg = "Bienvenido " + usuarioLogueado.usuario + ".";
		} catch (NullPointerException e) {
			Log.e(this.getClass().toString(), e.getMessage(), e);
			msg = "Error de ausencia de datos.";
		} catch (SQLException e) {
			Log.e(this.getClass().toString(), e.getMessage(), e);
			msg = e.getMessage();
		} catch (Exception e) {
			Log.e(this.getClass().toString(), e.getMessage(), e);
			msg = e.getMessage();
		} finally {
		}
		return null;
	}

	private void loguear() throws Exception {
		usuarioLogueado = getUsuarioService().getUsuario(usuario, clave);
		if (usuarioLogueado == null) {
			App.getInstance().setUsuario(null);
			throw new Exception("Usuario o clave no existe.");
		}
		
		usuarioLogueado.dni = dni;
		
		//		Personal person = getUsuarioService().getUsuarioPersonal(usuarioLogueado.id);
//		if(person != null) dni = person.dni;
//		
//		usuarioLogueado.permisos = getPermisoService().getPermisos(usuarioLogueado.cargo_id);
//		if ("SIS".equals(usuario)) {
//			return;
//		}
//		Personal persona = getUsuarioService().getPersonal(dni);
//		if (persona == null) {
//			persona = new Personal();
//			persona.dni = dni;
//		} 
//		getUsuarioService().saveOrUpdate(persona);	
//		getUsuarioService().saveOrUpdate(persona, usuarioLogueado);
//		App.getInstance().setPersonal(persona);
	}

	protected void onPostExecute(String file_url) {
		pDialog.dismiss();
		this.activity.runOnUiThread(new Runnable() {
			public void run() {
				DialogComponent dlg = new DialogComponent(activity,
						Inicializacion.this,
						DialogComponent.TIPO_DIALOGO.NEUTRAL, titulo, msg);
				dlg.showDialog();
			}
		});
	}

	private UsuarioService getUsuarioService() {
		if (usuarioService == null) {
			usuarioService = UsuarioService.getInstance(this.activity
					.getApplicationContext());
		}
		return usuarioService;
	}

//	private PermisoService getPermisoService() {
//		if (permisoService == null) {
//			permisoService = PermisoService.getInstance(this.activity
//					.getApplicationContext());
//		}
//		return permisoService;
//	}

	@Override
	public void onCancel() {
	}

	@Override
	public void onAccept() {
		if (App.getInstance().getUsuario() == null) {
			return;
		}
		Intent intent = null;
		intent = new Intent(activity, CuestionarioFragmentActivity.class);
		activity.startActivity(intent);
		activity.finish();
	}
}

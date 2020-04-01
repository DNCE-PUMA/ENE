package gob.inei.ene2019v2.controller;

import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.core.ZipFile;
import gob.inei.dnce.dao.xml.XMLObject;
import gob.inei.dnce.dao.xml.XMLObject.BeansProcesados;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.model.ZipParameters;
import gob.inei.dnce.util.DnceZipConstants;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.common.MyUtil;
import gob.inei.ene2019v2.interfaces.Exportable;
import gob.inei.ene2019v2.interfaces.IExportacion;
import gob.inei.ene2019v2.model.Marco;
import gob.inei.ene2019v2.service.ImpExpService;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import android.app.ProgressDialog;
import android.database.SQLException;
import android.os.AsyncTask;
import android.util.Log;



public class EnvioServidor extends AsyncTask<String, String, String> implements Respondible, Observer, IExportacion {

	private FragmentForm fragmentForm;
	private ProgressDialog pDialog;		
	private Exportable marco;	
	private String rutaArchivo;
	private int cantidadEscribir = 0;
	private int cantidadEscrito = 0;	
	private String msg;
	private String titulo;
	private ImpExpService impExpService;
	private String fechaEnvio;
	private String rutaServidor;
	private int cantidadEnviado;
	private int cantidadEnviadoProcesado;
	private int tipo_exp;
	
	public EnvioServidor(FragmentForm fragmentForm, String ruta, String titulo) {
		super();
		this.fragmentForm = fragmentForm;
		this.rutaArchivo = ruta;
		this.titulo = titulo;
	}
	
	public void setRegistro(Exportable marco) {
		this.marco = marco;
	}
	
	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public void setTipoExportacion(int tipo_exp) {
		this.tipo_exp = tipo_exp;
	}
	
	protected void onPreExecute() {
		super.onPreExecute();
		pDialog = new ProgressDialog(this.fragmentForm.getActivity());
		pDialog.setMessage(titulo+" Por favor espere...");
		pDialog.setIndeterminate(false);
		pDialog.setCancelable(false);
        pDialog.setMax(100);
        pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pDialog.setCancelable(false);
		pDialog.show();
	}

	protected String doInBackground(String... args) {
		try {
			enviar();
//			msg = "Exportación completada correctamente.";
		} catch (NullPointerException e) {
        	Log.e(this.getClass().toString(),e.getMessage(), e);
			msg = "Error de ausencia de datos.";
		} catch (SQLException e) {
        	Log.e(this.getClass().toString(),e.getMessage(), e);
			msg = e.getMessage();
		} catch (Exception e) {
        	Log.e(this.getClass().toString(),e.getMessage(), e);
			msg = e.getMessage();
		} finally {
		}
		return null;
	}
	
	@Override
	protected void onProgressUpdate(String... progress) {
		pDialog.setProgress(Integer.parseInt(progress[0]));
	}

	protected void onPostExecute(String file_url) {
		pDialog.dismiss();
		this.fragmentForm.getActivity().runOnUiThread(new Runnable() {
			public void run() {
				DialogComponent dlg = new DialogComponent(fragmentForm.getActivity(), EnvioServidor.this, 
						DialogComponent.TIPO_DIALOGO.NEUTRAL, titulo, msg);
				dlg.showDialog();
			}
		});
	}	

	private int enviar() throws Exception {
		int serverResponseCode = 0;
		try {			
			Log.e(getClass().getSimpleName(), "iniciando");
			calcularPorcentajeProcesado();
			//File archivo = crearArchivo(rutaArchivo, marco);
			String proyecto = "ENE2019";
			List<File> archivos = MyUtil.exportarCenso((Observer)(IExportacion)this, App.getInstance().getVersion(this.fragmentForm.getActivity()),  
					getExportarService(), rutaArchivo, proyecto, (Marco)marco);
			
			if(archivos!=null && archivos.size()==1) {
				File archivo = archivos.get(0);
			
				String rutaZip = archivo.getAbsolutePath().replace("xml", "zip");
//				Util.zip(rutaZip, archivo);
//				archivo = new File(rutaZip);									
//				Log.e(getClass().getSimpleName(), "finalizo el archivo ["+archivo.getName()+"]");
				
				ZipFile mcompri = new ZipFile(rutaZip);
				ArrayList<File> lstarchivos = new ArrayList<File>();
				lstarchivos.add(new File(archivo.getAbsolutePath()));

				ZipParameters params = new ZipParameters();
				params.setCompressionMethod(DnceZipConstants.COMP_DEFLATE);
				params.setCompressionLevel(DnceZipConstants.DEFLATE_LEVEL_NORMAL);
				params.setEncryptFiles(true);
				params.setEncryptionMethod(DnceZipConstants.ENC_METHOD_AES);
				params.setAesKeyStrength(DnceZipConstants.AES_STRENGTH_256);
				params.setPassword(App.BOARGINGPASS);
//				params.setPassword(MyUtil.getPassword(archivo.getName().replace(".xml", "")));
				
				mcompri.addFiles(lstarchivos, params);
				Log.e("Mira llegue archivos : ", "Mira llegue archivos : ");
				msg = "";
				try {
					serverResponseCode = uploadFile(new File(rutaZip));
//					serverResponseCode = uploadFile(archivo);
					if (serverResponseCode == 200
							|| serverResponseCode == HttpURLConnection.HTTP_OK) {
						msg = "Archivo XML enviado con exito.";					
					} else {
						msg = "Archivo(s) no pudo ser enviado(s).";
					}
					Log.e(getClass().getSimpleName(), "finalizo envio");
	//			} catch (MalformedURLException ex) {
	//				Log.e("Subir mi xml al servidor", "error: " + ex.getMessage(),
	//						ex);
	//				msg = "Error en el URL.";
	//				throw new Exception(msg);
				} catch (NullPointerException e ) {
					e.printStackTrace();
					Log.e("Subir mi xml al servidor",
							"Exception : " + e.getMessage(), e);
					msg = "Error: NullPointer.";
					throw new Exception(msg);
				} catch (Exception e) {
					e.printStackTrace();
					Log.e("Subir mi xml al servidor",
							"Exception : " + e.getMessage(), e);
					msg = "Error: " + e.getMessage();
					throw new Exception(msg);
				} 
			} 
		}catch (IllegalArgumentException e) {
			Log.e(this.getClass().toString(), e.getMessage(), e);
			throw new Exception(
					"No se pudo cargar los datos en la Base de Datos.");
		} 
		return serverResponseCode;
	}	
	
	private int uploadFile(File archivo) throws IOException {
		int serverResponseCode = 0; 
		rutaServidor =   "http://proyectos.inei.gob.pe/WebEne2019/pagweb/transdataxmlenemobile.asp" ;//App.getInstance().getParameters(this.fragmentForm.getActivity()).get(1).value1;
		
		String vindexrural = getNumeroLineasArchivo(archivo);
		String usuario = App.getInstance().getUsuario().usuario;
		String modoEnvio = "MOVIL";
		HttpURLConnection conn = null;
		DataOutputStream dos = null;
		String lineEnd = "\r\n";
		String twoHyphens = "--";
		String boundary = "*****";
		int bytesRead, bytesAvailable, bufferSize;
		byte[] buffer;
		int maxBufferSize = 1 * 1024 * 1024;

		FileInputStream fileInputStream = null;
		fileInputStream = new FileInputStream(archivo);
		bytesAvailable = fileInputStream.available();
		cantidadEnviado = bytesAvailable;
		cantidadEnviadoProcesado = 0;
		calcularPorcentajeProcesado();
		bufferSize = Math.min(bytesAvailable, maxBufferSize);
		buffer = new byte[bufferSize];
		bytesRead = fileInputStream.read(buffer, 0, bufferSize);
		URL url = new URL(rutaServidor);
		conn = (HttpURLConnection) url.openConnection();
		Log.e(getClass().getSimpleName(), "conecto a: " + rutaServidor);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setUseCaches(false);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Connection", "Keep-Alive");
		conn.setRequestProperty("ENCTYPE", "multipart/form-data");
		conn.setRequestProperty("Content-Type",
				"multipart/form-data;boundary=" + boundary);
		conn.setRequestProperty("uploaded_file", archivo.getName());
		dos = new DataOutputStream(conn.getOutputStream());
		dos.writeBytes(twoHyphens + boundary + lineEnd);
		dos.writeBytes("Content-Disposition: form-data; name=\"indexrural\""
				+ lineEnd + lineEnd + vindexrural + lineEnd);
		dos.writeBytes(twoHyphens + boundary + lineEnd);
		dos.writeBytes("Content-Disposition: form-data; name=\"evaluador\""
				+ lineEnd + lineEnd + usuario + lineEnd);
		dos.writeBytes(twoHyphens + boundary + lineEnd);
		dos.writeBytes("Content-Disposition: form-data; name=\"modoenvio\""
				+ lineEnd + lineEnd + modoEnvio + lineEnd);
		dos.writeBytes(twoHyphens + boundary + lineEnd);
		dos.writeBytes("Content-Disposition: form-data; name=\"uploaded_file\";filename=\""
				+ archivo.getName() + "\"" + lineEnd);
		dos.writeBytes(lineEnd);	
		while (bytesRead > 0) {
			dos.write(buffer, 0, bufferSize);
			cantidadEnviadoProcesado += bytesRead;
			bytesAvailable = fileInputStream.available();
			bufferSize = Math.min(bytesAvailable, maxBufferSize);
			bytesRead = fileInputStream.read(buffer, 0, bufferSize);
			calcularPorcentajeProcesado();
		}
		dos.writeBytes(lineEnd);
		dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);
		serverResponseCode = conn.getResponseCode();
		String serverResponseMessage = conn.getResponseMessage();
		Log.e("cargaxml", "HTTP codigo de respuesta : "
				+ serverResponseMessage + ": " + serverResponseCode);
		
		conn.disconnect();
		fileInputStream.close();
		if (dos != null) {
			dos.flush();
			dos.close();	
		}

		return serverResponseCode;
	}
	
	private String getNumeroLineasArchivo(File file) {
		int nroLineas = 0;
		FileReader fr = null;
		BufferedReader bf = null;
		String linea;
		try {
			fr = new FileReader(file);
			bf = new BufferedReader (fr);
			while ((linea = bf.readLine())!=null) {
				nroLineas++;
			}
		} catch (FileNotFoundException e) {
			Log.e(getClass().getSimpleName(), e.getMessage(), e);
		} catch (IOException e) {
			Log.e(getClass().getSimpleName(), e.getMessage(), e);
		} finally {
			if (fr != null) {
				try {
					if (bf != null) bf.close();
					fr.close();
				} catch (IOException e) {
					Log.e(getClass().getSimpleName(), e.getMessage(), e);
				}	
			}
		}
		return String.valueOf(nroLineas);
	}

	@Override
	public void update(Observable observable, Object data) {
		if (data == null) {
			return;
		}
		XMLObject.BeansProcesados procesado = (BeansProcesados) data;
		this.cantidadEscribir = procesado.getTotal();
		this.cantidadEscrito = procesado.getProcesado();
		calcularPorcentajeProcesado();
	}
	
	private void calcularPorcentajeProcesado() {
		int cantidadProcesado = 0;
		if (cantidadEscribir == cantidadEscrito) {
			cantidadProcesado = 50;
		} else {
			cantidadProcesado += (cantidadEscrito*50)/cantidadEscribir;
		}
		if (cantidadEnviado == cantidadEnviadoProcesado) {
			cantidadProcesado = 50;
		} else {
			cantidadProcesado += (cantidadEnviadoProcesado*50)/cantidadEnviado;
		}		
		publishProgress(String.valueOf(cantidadProcesado));
	}
		
	@Override
	public void onCancel() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onAccept() {
		// TODO Auto-generated method stub
	}
	
	private ImpExpService getExportarService() {
		if (impExpService == null) {
			impExpService = ImpExpService.getInstance(this.fragmentForm.getActivity().getApplicationContext());
		}
		return impExpService;
	}

	@Override
	public FragmentForm getFragmentForm() {
		return this.fragmentForm;
	}
}

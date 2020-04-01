package gob.inei.ene2019v2.fragment;

import gob.inei.dnce.components.ButtonComponent;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogComponent.TIPO_DIALOGO;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.interfaces.Searchable1;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.service.MarcoService;
import gob.inei.ene2019v2.service.SegmentacionService;
import gob.inei.ene2019v2.service.UbigeoService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import paul.arian.fileselector.FolderSelectionActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class CalificacionFragment extends FragmentForm implements Respondible {

	private static enum ACCION {
		IMPORTAR
	};
	private TableComponent tcVisor;
	private ACCION accionp;
	private static int REQUEST_CODE_PICK_IMPORT = 2;

	private String TAG = CalificacionFragment.this.getClass().getSimpleName();
	private ArrayList<File> archivos;
	private LabelComponent lblTitulo, lblXml, lblPlantilla;
	private UbigeoService ubigeoService;
	private MarcoService service;
	private SegmentacionService segmentacionService;
	private LabelComponent dummy;
	private ButtonComponent btnMemory;
	private GridComponent grid;
	public static boolean REFRESH;
	private static Searchable1 caller;
	private DialogComponent dialog;

	public CalificacionFragment parent(MasterActivity parent) {
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
		if (CalificacionFragment.REFRESH) {
			CalificacionFragment.REFRESH = false;
			cargarDatos();
		}
		inicio();
		return rootView;
	}

	public void onCancel() {
		Log.e(TAG, "onCancel()");
	}

	public void onAccept() {

		if (accionp == null)
			return;
		switch (accionp) {
		case IMPORTAR:
			// Intent intent = new Intent(getActivity(),
			// FileSelectionActivity.class);
			// String ruta = App.RUTA_BASE;
			// ruta += "/backups";
			// File directorio = new File(ruta);
			// if (!directorio.exists()) {
			// directorio.mkdirs();
			// }
			// intent.putExtra(FileSelectionActivity.START_FOLDER, ruta);
			// intent.putExtra("FILTER_EXTENSION", new String[] { "xml", "zip"
			// });
			// // intent.putExtra("ONLY_DIRECTORY", "ONLY_DIRECTORY");
			// startActivityForResult(intent, REQUEST_CODE_PICK_IMPORT);

			Intent intent = new Intent(getActivity(),
					FolderSelectionActivity.class);
			String ruta = App.RUTA_BASE;
			ruta += "/backups";
			File directorio = new File(ruta);
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			intent.putExtra(FolderSelectionActivity.START_FOLDER, ruta);
			startActivityForResult(intent, REQUEST_CODE_PICK_IMPORT);
			break;
		default:
			Log.e(TAG, "Operacion no programada");
			break;
		}

	}

	@Override
	protected View createUI() {
		buildFields();
		LinearLayout q0 = createQuestionSection(lblTitulo, lblPlantilla);
		LinearLayout q1 = createQuestionSection(grid.component());
		// LinearLayout q3 = createQuestionSection(tcVisor.getTableView());
		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);

		return contenedor;
	}

	@Override
	protected void buildFields() {
		lblTitulo = new LabelComponent(getActivity(), App.ESTILO)
				.text("CALIFICACIÓN PRÁCTICAS")
				.size(MATCH_PARENT + 50, MATCH_PARENT).centrar().textSize(22);

		lblPlantilla = new LabelComponent(getActivity())
				.text(R.string.Plantilla).size(MATCH_PARENT + 50, MATCH_PARENT)
				.centrar().textSize(20).colorFondo(R.color.celesteclaro)
				.negrita();

		lblXml = new LabelComponent(getActivity()).text("Buscar XML")
				.size(altoComponente + 80, 200).centrar().textSize(21);

		dummy = new LabelComponent(getActivity()).text("")
				.size(MATCH_PARENT, 30).textSize(24)
				.colorFondo(R.color.WhiteSmoke);
		btnMemory = new ButtonComponent(getActivity(), App.ESTILO_BOTON).text(
				R.string.ImportarXML).size(200, 60);
		btnMemory.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				getPlantilla2017();

			}
		});

		grid = new GridComponent(getActivity(), Gravity.CENTER, 3, 0);
		grid.addComponent(lblXml);
		grid.addComponent(dummy);
		grid.addComponent(btnMemory);

	}

	public void getPlantilla2017() {
		if (App.getInstance().getPlantilla() == null) {
			ToastMessage.msgBox(this.getActivity(),
					"Debe establecer una Plantilla de Calificación",
					ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
			return;
		} else {
			importar(null);
		}
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode != -1)
			return;
		// archivos = (ArrayList<File>) data
		// .getSerializableExtra(FileSelectionActivity.FILES_TO_UPLOAD);

		// if (archivos != null) {
		// ImportacionVisor r = new ImportacionVisor(this,
		// "Importando información. ");
		// r.setArchivos(archivos);
		// r.execute();
		// }
		archivos = new ArrayList<File>();
		File file = (File) data
				.getSerializableExtra(FolderSelectionActivity.FILES_TO_UPLOAD);

		if (walkin(file) != null) {
			ImportacionVisorCalificacion r = new ImportacionVisorCalificacion(
					this, "Importando información. ");
			r.setArchivos(archivos);
			r.setRutaBase(file.getName());
			r.execute();
		}

	}

	public List<File> walkin(File dir) {
		File listFile[] = dir.listFiles();
		if (listFile != null) {
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].isDirectory()) {
					walkin(listFile[i]);
				} else {
					archivos.add(listFile[i]);
					// Log.e("observa", "vistes: "+listFile[i].getPath());
				}
			}
		}
		if (archivos.size() == 0)
			archivos = null;
		return archivos;
	}

	@Override
	public boolean grabar() {
		return true;
	}

	@Override
	public void cargarDatos() {

		if (CalificacionFragment.REFRESH) {
			refresh();
			return;
		}
//		inicio();
	}

	private void refresh() {
		FragmentManager manager = getActivity().getSupportFragmentManager();
		FragmentTransaction ft = manager.beginTransaction();
		FragmentForm newFragment = this;
		ft.detach(newFragment);
		ft.attach(newFragment);
		ft.commit();
	}

	private void inicio() {
		lblPlantilla.setText(R.string.Plantilla);
		if (App.getInstance().getPlantilla() == null) {
			replaceText(lblPlantilla, Util.getListHashMap("$", "---"));
		} else {
			replaceText(lblPlantilla,
					Util.getListHashMap("$", String.valueOf(App.getInstance().getRuc().ruc)));
		}
	}

	private void importar(ArrayList<File> archivos) {
		accionp = ACCION.IMPORTAR;
		DialogComponent dialog = new DialogComponent(getActivity(), this,
				TIPO_DIALOGO.YES_NO, getResources()
						.getString(R.string.app_name),
				"Desea importar XML para Calificación?");
		dialog.showDialog();
	}

	public MarcoService getMarcoService() {
		if (service == null) {
			service = MarcoService.getInstance(getActivity());
		}
		return service;
	}

	public SegmentacionService getSegmentacionService() {
		if (segmentacionService == null) {
			segmentacionService = SegmentacionService
					.getInstance(getActivity());
		}
		return segmentacionService;
	}

}

package gob.inei.ene2019v2.fragment;

import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.GridComponent2;
import gob.inei.dnce.components.ImageComponent;
import gob.inei.dnce.components.LabelComponent;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.TableComponent;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Cobertura;
import gob.inei.ene2019v2.service.CuestionarioService;
import gob.inei.ene2019v2.service.MarcoService;
import gob.inei.ene2019v2.service.SegmentacionService;
import gob.inei.ene2019v2.service.UbigeoService;

import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class CoberturaFragment_001 extends FragmentForm implements Respondible {

	private String TAG = CoberturaFragment_001.this.getClass().getSimpleName();

	private TableComponent tcCobertura;
	private LabelComponent lblTitulo, ResCompleto, ResIncompleto;
	private UbigeoService ubigeoService;
	private SegmentacionService segmentacionService;
	private MarcoService marcoService;
	private CuestionarioService cuestionarioService;
	private Caratula caratula;
	List<Cobertura> cobertura;
	private GridComponent2 grResultado;

	public CoberturaFragment_001 parent(MasterActivity parent) {
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
		setHasOptionsMenu(true);
		registerForContextMenu(tcCobertura.getListView());
		initObjectsWithoutXML(this, rootView);
		enlazarCajas();
		listening();
		inicio();
		return rootView;
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);

		AdapterView.AdapterContextMenuInfo info;
		info = (AdapterView.AdapterContextMenuInfo) menuInfo;

		if (v.equals(tcCobertura.getListView())) {
		}
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if (!getUserVisibleHint())
			return false;
		final AdapterContextMenuInfo info = (AdapterContextMenuInfo) item
				.getMenuInfo();

		if (item.getGroupId() == 1) {
			Map<String, Object> mp = (Map<String, Object>) (info.targetView
					.getTag());
			if (item.getItemId() == 1) {
				Log.e("entrastes", "vistes");
			}
		}

		return true;
	}

	@Override
	public void onCancel() {

	}

	@Override
	public void onAccept() {

	}

	@Override
	protected View createUI() {
		buildFields();
		LinearLayout q0 = createQuestionSection(lblTitulo);
		LinearLayout q1 = createQuestionSection(0, Gravity.CENTER,
				LinearLayout.VERTICAL, tcCobertura.getTableView(), ResCompleto,
				ResIncompleto);

		ScrollView contenedor = createForm();
		LinearLayout form = (LinearLayout) contenedor.getChildAt(0);

		form.addView(q0);
		form.addView(q1);
		return contenedor;
	}

	@Override
	protected void buildFields() {

		lblTitulo = new LabelComponent(getActivity(), App.ESTILO)
				.size(55, MATCH_PARENT).text(R.string.Cobertura).centrar()
				.textSize(21);

		ResCompleto = new LabelComponent(getActivity(), App.ESTILO)
				.size(altoComponente + 10, 500)
				.text(R.string.CEstado_Completo).centrar().textSize(19);
		ResIncompleto = new LabelComponent(getActivity(), App.ESTILO)
				.size(altoComponente + 10, 500)
				.text(R.string.CEstado_Incompleto).centrar().textSize(19);

		tcCobertura = new TableComponent(getActivity(), this, App.ESTILO)
				.size(860, 500).dataColumHeight(75).headerHeight(75)
				.headerTextSize(15);
		tcCobertura.addHeader(R.string.Cobertura, 2.1f,
				TableComponent.ALIGN.LEFT);
		tcCobertura.addHeader(R.string.Estado, 1.5f, ImageComponent.class,
				R.drawable.ok, R.drawable.eliminar2);
		tcCobertura.setCellColor(-1, 0, true);

	}

	@Override
	public boolean grabar() {
		return true;
	}

	@Override
	public void cargarDatos() {
		caratula = App.getInstance().getEmpresa();
		cargarCobertura(App.getInstance().getEmpresa().id);
	}

	private void inicio() {
		tcCobertura.requestFocus();
	}

	private void cargarCobertura(Integer id) {
		cargarCoberturaGeneral(id);
	}

	private void cargarCoberturaGeneral(Integer id) {
		cobertura = getCuestionarioService().getCoberturaXid(caratula.id);
		tcCobertura.setData(cobertura, "nombre", "estado");

		Log.e("XXXXXXXXXXXXXXXXXXX ", "" + cobertura.size());
		int conteoCobertura = 0;
		if (cobertura.size() > 0) {
			for (Cobertura co : cobertura) {
				if (Util.getInt(co.estado) == 1) {
					conteoCobertura++;
				}
			}
			if (conteoCobertura > 0) {
				ResIncompleto.setVisibility(view.VISIBLE);
				ResCompleto.setVisibility(view.GONE);
			} else {
				ResCompleto.setVisibility(view.VISIBLE);
				ResIncompleto.setVisibility(view.GONE);
			}
		} else {
			ResCompleto.setVisibility(view.GONE);
			ResIncompleto.setVisibility(view.VISIBLE);
		}

	}

	public SegmentacionService getSegmentacionService() {
		if (segmentacionService == null) {
			segmentacionService = SegmentacionService
					.getInstance(getActivity());
		}
		return segmentacionService;
	}

	public UbigeoService getUbigeoService() {
		if (ubigeoService == null) {
			ubigeoService = UbigeoService.getInstance(getActivity());
		}
		return ubigeoService;
	}

	public MarcoService getMarcoService() {
		if (marcoService == null) {
			marcoService = MarcoService.getInstance(getActivity());
		}
		return marcoService;
	}

	public CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService
					.getInstance(getActivity());
		}
		return cuestionarioService;
	}

}

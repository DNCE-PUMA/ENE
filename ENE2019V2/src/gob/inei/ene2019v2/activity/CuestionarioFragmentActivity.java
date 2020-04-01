package gob.inei.ene2019v2.activity;

import gob.inei.dnce.adapter.DepthPageTransformer;
import gob.inei.dnce.adapter.MyFragmentPagerAdapter;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogComponent.TIPO_DIALOGO;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.FragmentViewPager;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.IFormComponent;
import gob.inei.dnce.interfaces.IObservaciones;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Filtros;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.adapter.MyDrawerAdapter;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.controller.Importacion;
import gob.inei.ene2019v2.fragment.Caratula_Fragment_001;
import gob.inei.ene2019v2.fragment.Caratula_Fragment_002;
import gob.inei.ene2019v2.fragment.Caratula_Fragment_003;
import gob.inei.ene2019v2.fragment.Caratula_Fragment_004;
import gob.inei.ene2019v2.fragment.Caratula_Fragment_005;
import gob.inei.ene2019v2.fragment.Caratula_Fragment_006;
import gob.inei.ene2019v2.fragment.Caratula_Fragment_007;
import gob.inei.ene2019v2.fragment.MarcoFragment;
import gob.inei.ene2019v2.fragment.Visita_Fragment_001;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_001;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_002;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_003;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_004;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_005;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_006;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_008;
import gob.inei.ene2019v2.fragment.ModI.Mod_I_Fragment_009;
import gob.inei.ene2019v2.fragment.ModII.Mod_II_Fragment_001;
import gob.inei.ene2019v2.fragment.ModII.Mod_II_Fragment_003;
import gob.inei.ene2019v2.fragment.ModII.Mod_II_Fragment_004;
import gob.inei.ene2019v2.fragment.ModII.Mod_II_Fragment_006;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_001_;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_002_Ant;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_003;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_004;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_005;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_006;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_008;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_009;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_010;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_011;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_012;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_013;
import gob.inei.ene2019v2.fragment.ModIII.Mod_III_Fragment_014;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_001;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_002;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_003;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_004;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_005;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_006;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_007;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_008;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_009;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_010;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_011;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_012;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_014;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_015;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_017;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_019;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_020;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_022;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_022_01;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_022_02;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_023;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_024;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_025;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_026;
import gob.inei.ene2019v2.fragment.ModIV.Mod_IV_Fragment_028;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_001;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_002;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_003;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_004;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_005;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_006;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_007;
import gob.inei.ene2019v2.fragment.ModIX.Mod_IX_Fragment_010;
import gob.inei.ene2019v2.fragment.ModV.Mod_V_Fragment_001;
import gob.inei.ene2019v2.fragment.ModV.Mod_V_Fragment_002;
import gob.inei.ene2019v2.fragment.ModV.Mod_V_Fragment_003;
import gob.inei.ene2019v2.fragment.ModV.Mod_V_Fragment_005;
import gob.inei.ene2019v2.fragment.ModV.Mod_V_Fragment_006;
import gob.inei.ene2019v2.fragment.ModV.Mod_V_Fragment_008;
import gob.inei.ene2019v2.fragment.ModV.Mod_V_Fragment_009;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_001;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_002;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_003;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_004;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_006;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_007;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_008;
import gob.inei.ene2019v2.fragment.ModVI.Mod_VI_Fragment_009;
import gob.inei.ene2019v2.fragment.ModVII.Mod_VII_Fragment_001;
import gob.inei.ene2019v2.fragment.ModVII.Mod_VII_Fragment_003;
import gob.inei.ene2019v2.fragment.ModVII.Mod_VII_Fragment_004;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_001;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_002;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_003;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_004;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_005;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_007;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_008;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_009;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_010;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_011;
import gob.inei.ene2019v2.fragment.ModVIII.Mod_VIII_Fragment_012;
import gob.inei.ene2019v2.fragment.dialog.ObservacionesDialog;
import gob.inei.ene2019v2.listener.MyNavigationClickListener;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.model.Moduloii;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloiii02;
import gob.inei.ene2019v2.model.Moduloiv01;
import gob.inei.ene2019v2.model.Moduloiv02;
import gob.inei.ene2019v2.model.Moduloiv03;
import gob.inei.ene2019v2.model.Modulov01;
import gob.inei.ene2019v2.model.Modulov02;
import gob.inei.ene2019v2.model.Modulovi01;
import gob.inei.ene2019v2.model.Modulovii01;
import gob.inei.ene2019v2.model.Navegation;
import gob.inei.ene2019v2.service.CuestionarioService;
import gob.inei.ene2019v2.service.ImpExpService;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import paul.arian.fileselector.FileSelectionActivity;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;



public class CuestionarioFragmentActivity extends MasterActivity implements
		ActionBar.TabListener, Respondible, Observer, IFormComponent,
		IObservaciones {

	private enum PROCCES {
		MARCO, DATA, CALIFICAR, AJUSTE
	}
 
	private static final int REQUEST_CODE_PICK_MARCO = 1;
	private static final int REQUEST_CODE_PICK_IMPORT = 2;
	private static final int REQUEST_CODE_CALIFICAR = 3;
	public static final int REQUEST_CODE_PICK_GPX_TRACK_MARCO = 4;
	public static final int REQUEST_CODE_PICK_GPX_TRACK_CCCP = 5;
	private PROCCES action = null;
	/**
	 * Fragment managing the behaviors, interactions and presentation of the
	 * navigation drawer.
	 */
	private DrawerLayout drawerLayout;
	private ListView drawerList;
	private ActionBarDrawerToggle drawerToggle;
	private Vector<String> opcionesMenu = new Vector<String>();
	/**
	 * Used to store the last screen title. For use in
	 * {@link #restoreActionBar()}.
	 */
	// public static int prevPage = -1;
	// public static int currentPage = 0;
	private static String TAG = "CuestionarioRuralFragmentActivity";
	private static String TITULO = "";

	SharedPreferences preferencias;
	SharedPreferences.Editor editor;

	private static String PREFERENCIAS = "preferencias";
	private CharSequence mTitle;
	// private CuestionarioService cuestionarioService;
	private CuestionarioService cuestionarioService;
	private ImpExpService impExpService;
	private List<FragmentForm> fragments;
	public static Context baseContext;
	private Navegation nav;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		baseContext = getApplicationContext();
		TAG = this.getClass().toString();
		setContentView(R.layout.activity_principal);
		mTitle = getTitle();
		preferencias = this.getSharedPreferences(PREFERENCIAS,
				Context.MODE_PRIVATE);
		editor = preferencias.edit();
		List<FragmentForm> forms = createFragments();
		pageAdapter = new MyFragmentPagerAdapter(this, forms);
		viewPager = (FragmentViewPager) findViewById(R.id.pagerPrincipal);
		viewPager.setAdapter(pageAdapter);
		viewPager.setFragments(forms);
		final CuestionarioSimpleOnPageChangeListener viewPagerListener = new CuestionarioSimpleOnPageChangeListener();
		// Log.e("Build.VERSION.RELEASE: "+Build.VERSION.RELEASE,
		// "Build.VERSION.SDK_INT: "+Build.VERSION.SDK_INT);
		if (Build.VERSION.SDK_INT >= App.APPSDKAPI) {
			viewPager.setPageTransformer(true, new DepthPageTransformer());
		}
		viewPager.setOnPageChangeListener(viewPagerListener);
		for (String s : getResources().getStringArray(R.array.drawer_array)) {
			opcionesMenu.add(s);
		}

	//	if (App.getInstance().getUsuario().cargo_id != 3) {
	//		opcionesMenu.remove(opcionesMenu.size() - 1);
	//	}

		drawerLayout = (DrawerLayout) findViewById(R.id.drawer_principal_layout);
		drawerList = (ListView) findViewById(R.id.left_principal_drawer);
		drawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		drawerList.setAdapter(new MyDrawerAdapter(opcionesMenu, this));
		int position = App.getInstance().getModoApp() == App.CARTOGRAFIA ? 0
				: 1;
		navigationClickListener = new MyNavigationClickListener(this, 0,
				drawerList, drawerLayout);

		drawerList.setOnItemClickListener(navigationClickListener);
		TITULO = getResources().getString(R.string.app_name);
		final ActionBar actionBar = getActionBar();
		drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
				R.drawable.ic_navigation_drawer,
				R.string.navigation_drawer_open,
				R.string.navigation_drawer_close) {

			public void onDrawerClosed(View view) {
				// getActionBar().setIcon(R.drawable.ic_launcher);
				getActionBar().setTitle(TITULO);
				ActivityCompat
						.invalidateOptionsMenu(CuestionarioFragmentActivity.this);
			}

			public void onDrawerOpened(View drawerView) {
				// getActionBar().setIcon(R.drawable.ic_launcher);
				getActionBar().setTitle("Menu");
				ActivityCompat
						.invalidateOptionsMenu(CuestionarioFragmentActivity.this);
			}
		};
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		drawerLayout.setDrawerListener(drawerToggle);

		if (savedInstanceState != null) {
			actionBar.setSelectedNavigationItem(savedInstanceState.getInt(
					"tab", 1));
		}

		refreshSubTitle();
	}

	public static final Integer CENTROS_POBLADOS = 50;
	public static final Integer MARCO = 0;
	public static final Integer CARATULA = 1;
	public static final Integer VISITAS = 3;
	public static final Integer MODULO_I = 9;
	public static final Integer MODULO_II = 17;
	public static final Integer MODULO_III = 21;
	public static final Integer MODULO_IV = 34;
	public static final Integer MODULO_IV_PROD = 44;
	public static final Integer MODULO_IV_EXTRA = 51;
	public static final Integer MODULO_V = 59;
	public static final Integer MODULO_VI = 66;
	public static final Integer MODULO_VII = 74;
	public static final Integer MODULO_VIII = 77;
	public static final Integer MODULO_VIII_Materia = 78;
	public static final Integer MODULO_VIII_Funka = 81;
	public static final Integer MODULO_IX = 88;
	public static final Integer MODULO_IX_DET = 93;

	private List<FragmentForm> createFragments() {
		fragments = new ArrayList<FragmentForm>();

		/* 00 */fragments.add(new MarcoFragment().parent(this));
		/* 01 */fragments.add(new Caratula_Fragment_001().parent(this));
		/* 02 */fragments.add(new Caratula_Fragment_002().parent(this));
		/* 03 */fragments.add(new Visita_Fragment_001().parent(this));
		/* 04 */fragments.add(new Caratula_Fragment_003().parent(this));
		/* 05 */fragments.add(new Caratula_Fragment_004().parent(this));
		/* 06 */fragments.add(new Caratula_Fragment_005().parent(this));
		/* 07 */fragments.add(new Caratula_Fragment_006().parent(this));
		/* 08 */fragments.add(new Caratula_Fragment_007().parent(this));
		
		/* ********************* MODULO 01 ************************* */
		/* 09 */fragments.add(new Mod_I_Fragment_001().parent(this));
		/* 10 */fragments.add(new Mod_I_Fragment_002().parent(this));
		/* 11 */fragments.add(new Mod_I_Fragment_003().parent(this));
		/* 12 */fragments.add(new Mod_I_Fragment_004().parent(this));
		/* 13 */fragments.add(new Mod_I_Fragment_005().parent(this));
		/* 14 */fragments.add(new Mod_I_Fragment_006().parent(this));
		/* 15 */fragments.add(new Mod_I_Fragment_008().parent(this));
		/* 16 */fragments.add(new Mod_I_Fragment_009().parent(this));
		/* ********************* MODULO 02 ************************* */
		/* 17 */fragments.add(new Mod_II_Fragment_001().parent(this));
		/* 18 */fragments.add(new Mod_II_Fragment_003().parent(this));
		/* 19 */fragments.add(new Mod_II_Fragment_004().parent(this));
		/* 20 */fragments.add(new Mod_II_Fragment_006().parent(this));
		/* ********************* MODULO 03 ************************* */
		/* 21 */fragments.add(new Mod_III_Fragment_001_().parent(this));
		/* 22 */fragments.add(new Mod_III_Fragment_002_Ant().parent(this));
		/* 23 */fragments.add(new Mod_III_Fragment_003().parent(this));
		/* 24 */fragments.add(new Mod_III_Fragment_004().parent(this));
		/* 25 */fragments.add(new Mod_III_Fragment_005().parent(this));
		/* 26 */fragments.add(new Mod_III_Fragment_006().parent(this));
		/* 27 */fragments.add(new Mod_III_Fragment_008().parent(this));
		/* 28 */fragments.add(new Mod_III_Fragment_009().parent(this));
		/* 29 */fragments.add(new Mod_III_Fragment_010().parent(this));
		/* 30 */fragments.add(new Mod_III_Fragment_011().parent(this));
		/* 31 */fragments.add(new Mod_III_Fragment_012().parent(this));
		/* 32 */fragments.add(new Mod_III_Fragment_013().parent(this));
		/* 33 */fragments.add(new Mod_III_Fragment_014().parent(this));
		
		/* ********************* MODULO 04 ************************* */
		/* 34 */fragments.add(new Mod_IV_Fragment_001().parent(this));
		/* 35 */fragments.add(new Mod_IV_Fragment_002().parent(this));
		/* 36 */fragments.add(new Mod_IV_Fragment_003().parent(this));
		/* 37 */fragments.add(new Mod_IV_Fragment_004().parent(this));
		/* 38 */fragments.add(new Mod_IV_Fragment_005().parent(this));
		/* 39 */fragments.add(new Mod_IV_Fragment_006().parent(this));
		/* 40 */fragments.add(new Mod_IV_Fragment_007().parent(this));
		/* 41 */fragments.add(new Mod_IV_Fragment_008().parent(this));
		/* 42 */fragments.add(new Mod_IV_Fragment_009().parent(this));
		/* 43 */fragments.add(new Mod_IV_Fragment_010().parent(this));
		
		/* 44 */fragments.add(new Mod_IV_Fragment_011().parent(this));
		/* 45 */fragments.add(new Mod_IV_Fragment_012().parent(this));
		/* 46 */fragments.add(new Mod_IV_Fragment_014().parent(this));
		/* 47 */fragments.add(new Mod_IV_Fragment_015().parent(this));
		/* 48 */fragments.add(new Mod_IV_Fragment_017().parent(this));
		/* 49 */fragments.add(new Mod_IV_Fragment_019().parent(this));
		/* 50 */fragments.add(new Mod_IV_Fragment_020().parent(this));
		 
		/* 51 */fragments.add(new Mod_IV_Fragment_022().parent(this));
		/* 52 */fragments.add(new Mod_IV_Fragment_022_01().parent(this));
		/* 53 */fragments.add(new Mod_IV_Fragment_022_02().parent(this));
		/* 54 */fragments.add(new Mod_IV_Fragment_023().parent(this));
		/* 55 */fragments.add(new Mod_IV_Fragment_024().parent(this)); 
		/* 56 */fragments.add(new Mod_IV_Fragment_025().parent(this));
		/* 57 */fragments.add(new Mod_IV_Fragment_026().parent(this));
		/* 58 */fragments.add(new Mod_IV_Fragment_028().parent(this));
		/* ********************* MODULO 05 ************************* */
		/* 59 */fragments.add(new Mod_V_Fragment_001().parent(this));
		/* 60 */fragments.add(new Mod_V_Fragment_002().parent(this));
		/* 61 */fragments.add(new Mod_V_Fragment_003().parent(this));
		/* 62 */fragments.add(new Mod_V_Fragment_005().parent(this));
		/* 63 */fragments.add(new Mod_V_Fragment_006().parent(this));
//		/* 64 */fragments.add(new Mod_V_Fragment_007().parent(this));
		/* 64*/fragments.add(new Mod_V_Fragment_008().parent(this));
		/* 65*/fragments.add(new Mod_V_Fragment_009().parent(this));
		/* ********************** MODULO 06 ************************* */
		 /* 66 */fragments.add(new Mod_VI_Fragment_001().parent(this));
		 /* 67 */fragments.add(new Mod_VI_Fragment_002().parent(this));
		 /* 68 */fragments.add(new Mod_VI_Fragment_003().parent(this));
		 /* 69 */fragments.add(new Mod_VI_Fragment_004().parent(this));
//		 /* 68 */fragments.add(new Mod_VI_Fragment_005().parent(this));
		 /* 70 */fragments.add(new Mod_VI_Fragment_006().parent(this));
		 /* 71 */fragments.add(new Mod_VI_Fragment_007().parent(this));
		 /* 72 */fragments.add(new Mod_VI_Fragment_008().parent(this));
		 /* 73 */fragments.add(new Mod_VI_Fragment_009().parent(this));		
		/* ********************* MODULO 07 ************************** */
		 /* 74 */fragments.add(new Mod_VII_Fragment_001().parent(this));
		 /* 75 */fragments.add(new Mod_VII_Fragment_003().parent(this));
		 /* 76 */fragments.add(new Mod_VII_Fragment_004().parent(this));		
		/* ********************* MODULO 08 ************************** */		
		 /* 77 */fragments.add(new Mod_VIII_Fragment_001().parent(this));
		 /* 78 */fragments.add(new Mod_VIII_Fragment_002().parent(this));
		 /* 79 */fragments.add(new Mod_VIII_Fragment_003().parent(this));
		 /* 80 */fragments.add(new Mod_VIII_Fragment_004().parent(this));
		 /* 81 */fragments.add(new Mod_VIII_Fragment_005().parent(this));
		 /* 82 */fragments.add(new Mod_VIII_Fragment_007().parent(this));
		 /* 83 */fragments.add(new Mod_VIII_Fragment_008().parent(this));
		 /* 84 */fragments.add(new Mod_VIII_Fragment_009().parent(this));
		 /* 85 */fragments.add(new Mod_VIII_Fragment_010().parent(this));
		 /* 86 */fragments.add(new Mod_VIII_Fragment_011().parent(this));
		 /* 87 */fragments.add(new Mod_VIII_Fragment_012().parent(this));	
		 /* ********************* MODULO 09 ************************** */
		 /* 88 */fragments.add(new Mod_IX_Fragment_001().parent(this));
		 /* 89 */fragments.add(new Mod_IX_Fragment_002().parent(this));
		 /* 90 */fragments.add(new Mod_IX_Fragment_003().parent(this));
		 /* 91 */fragments.add(new Mod_IX_Fragment_004().parent(this));
		 /* 92 */fragments.add(new Mod_IX_Fragment_005().parent(this));
		 /* 93 */fragments.add(new Mod_IX_Fragment_006().parent(this));
		 /* 94 */fragments.add(new Mod_IX_Fragment_007().parent(this));
		 /* 95 */fragments.add(new Mod_IX_Fragment_010().parent(this));  //8
		return fragments;

	}
	 

	public void refreshSubTitle() {
		String ruta = App.getInstance().getUsuario().ruta == null ? "" : " - "
				+ App.getInstance().getUsuario().ruta;
		String ruc = App.getInstance().getMarco() != null
				&& App.getInstance().getMarco().ruc != null ? App.getInstance()
				.getMarco().ruc : null;
		getActionBar().setSubtitle(
				Util.getText(App.getInstance().getUsuario().usuario, "")
						+ " ["
						+ Util.getText(App.getInstance().getUsuario().equipo,
								"") + ruta + "]"
						+ (ruc != null ? " - " + ruc : ""));
	}

	public void restoreActionBar() {
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setTitle(mTitle);

	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		boolean menuAbierto = drawerLayout.isDrawerOpen(drawerList);
		int posicion = viewPager.getCurrentItem();
		if (posicion <= MARCO) {
			return true;
		} else {
			Caratula caratula = App.getInstance().getEmpresa();
			if (caratula == null)
				return false;
//			nav = getCuestionarioService().getNavegacion(caratula);
//
//			menu.findItem(R.id.action_caratula).setVisible(
//					nav != null && nav.caratula != null);
//			menu.findItem(R.id.action_visitas).setVisible(
//					nav != null && nav.visita != null);
//			nav = posicion <= VISITAS && caratula.resfin != null ? null : nav;
//			menu.findItem(R.id.action_modi).setVisible(
//					nav != null && nav.visita != null /* && nav.modi != null */);
//			menu.findItem(R.id.action_modii).setVisible(
//					nav != null && nav.visita != null /* && nav.modii != null */);
//			menu.findItem(R.id.action_modiii).setVisible(
//					nav != null && nav.visita != null /*
//													 * && nav.modiii != null
//													 */);
//			menu.findItem(R.id.action_modiv).setVisible(
//					nav != null && nav.visita != null /* && nav.modiv != null */);
//			menu.findItem(R.id.action_modv).setVisible(
//					nav != null && nav.visita != null /* && nav.modv != null */);
//			menu.findItem(R.id.action_modvi).setVisible(
//					nav != null && nav.visita != null /* && nav.modvi != null */);
//			menu.findItem(R.id.action_modvii).setVisible(
//					nav != null && nav.visita != null /*
//													 * && nav.modvii != null
//													 */);
//			menu.findItem(R.id.action_modviii).setVisible(
//					nav != null && nav.visita != null /*
//													 * && nav.modviii != null
//													 */);
//			menu.findItem(R.id.action_modix).setVisible(
//					nav != null && nav.visita != null
//			/*
//			 * && !Util.esDiferente(Util.getInt(caratula.p25), 1, 2) &&
//			 * nav.modix != null
//			 */);
		}
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		int posicion = viewPager.getCurrentItem();
		if (posicion != MARCO) {
			getMenuInflater().inflate(R.menu.principal, menu);
//			if (posicion < MODULO_I
//					|| (nav != null && ((posicion == MODULO_I && nav.modi == null)
//							|| (posicion == MODULO_II && nav.modii == null)
//							|| (posicion == MODULO_III && nav.modiii == null)
//							|| (posicion == MODULO_IV && nav.modiv == null)
//							|| (posicion == MODULO_V && nav.modv == null)
//							|| (posicion == MODULO_VI && nav.modvi == null)
//							|| (posicion == MODULO_VII && nav.modvii == null)
//							|| (posicion == MODULO_VIII && nav.modviii == null) || (posicion == MODULO_IX && nav.modix == null))))
//				menu.getItem(0).setVisible(false);
		}

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		if (drawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		int id = item.getItemId();
		Caratula bean = App.getInstance().getEmpresa();
		if (id == R.id.action_ir_marco) {
			irA(MARCO);
		} else if (id == R.id.action_caratula) {
			irA(CARATULA);
		} else if (id == R.id.action_visitas) {
			irA(VISITAS);
		} else if (id == R.id.action_grabar) {
			grabarYContinuar();
		} /*
		 * else if (id == R.id.action_ir_observaciones) {
		 * abrirObservaciones(viewPager.getCurrentItem()); }
	 */
	    else if (id == R.id.action_modi) {
	    	Log.e ("es" , Util.getInt(bean.estado_envio) +"");
	    	Log.e ("p29a" , Util.getInt(bean.p29_a,0) +"");
		
			if (bean!=null){
				//2310
				if ( Util.getInt(bean.p29_a,0)==1 &&bean.p25<3){
					if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_I);
				}else{
					if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_I+3);
				}
				if ( bean.p25>2){
					if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_I+3);
				}
			}
		} else if (id == R.id.action_modii) {
			if (Util.getInt(bean.estado_envio) ==1)	if (Util.getInt(bean.estado_envio) ==1)irA(MODULO_II);
		} else if (id == R.id.action_modiii) {
			if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_III);
		} else if (id == R.id.action_modiv) {
			if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_IV);
		} else if (id == R.id.action_modv) {
			if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_V);
		} else if (id == R.id.action_modvi) {
			if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_VI);
		} else if (id == R.id.action_modvii) {
			if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_VII);
		} else if (id == R.id.action_modviii) {
			if (Util.getInt(bean.estado_envio) ==1)	irA(MODULO_VIII);
		} else if (id == R.id.action_modix) {
			/**********Bloque Temporal - COMENTAR***********/
//			if (nav.funcionamiento>2016){
//				irA(MODULO_IX + 8);	
//			}else {
			if (Util.getInt(bean.estado_envio) ==1)		irA(MODULO_IX);	
//			}

			//CSSC-nav
			/**********Bloque Real - DESCOMENTAR***********/
			
	//		Log.e ("flag de cuest",Util.getInt( App.getInstance().getMarco().flag,0) + "");
			int flag = Util.getInt( App.getInstance().getMarco().flag,0); //algo;
			Caratula caratula = App.getInstance().getEmpresa();
			int p25 = Util.getInt( caratula.p25,0); 					//p25;
	
	
			/**********Bloque Real - DESCOMENTAR - FIN***********/
		} else if (id == R.id.action_ir_observaciones) {
			int currentPage = viewPager.getCurrentItem();
			
			if (currentPage >= MODULO_I && currentPage < MODULO_II) {
				abrirObservaciones(OBSV.CAP100, "CAPÍTULO 100");
				
			} else if (currentPage >= MODULO_II && currentPage < MODULO_III) {
				abrirObservaciones(OBSV.CAP200, "CAPÍTULO 200");
				
			} else if (currentPage >= MODULO_III && currentPage < MODULO_IV) {
				abrirObservaciones(OBSV.CAP300, "CAPÍTULO 300");
				
			} else if (currentPage >= MODULO_IV && currentPage < MODULO_V) {
				abrirObservaciones(OBSV.CAP400, "CAPÍTULO 400");
				
			} else if (currentPage >= MODULO_V && currentPage < MODULO_VI) {
				abrirObservaciones(OBSV.CAP500, "CAPÍTULO 500");
				
			} else if (currentPage >= MODULO_VI && currentPage < MODULO_VII) {
				abrirObservaciones(OBSV.CAP600, "CAPÍTULO 600");
				
			} else if (currentPage >= MODULO_VII && currentPage < MODULO_VIII) {
				abrirObservaciones(OBSV.CAP700, "CAPÍTULO 700");
				
			} else if (currentPage >= MODULO_VIII && currentPage < MODULO_IX) {
				abrirObservaciones(OBSV.CAP800, "CAPÍTULO 800");
				
			} else if (currentPage >= MODULO_IX) {
				abrirObservaciones(OBSV.CAP900, "CAPÍTULO 900");
			}
		}

		return super.onOptionsItemSelected(item);
	}

	public enum OBSV {
		CAP100, CAP200, CAP300, CAP400, CAP500, CAP600, CAP700, CAP800, CAP900
	};
	
	private void abrirObservaciones(OBSV modulo, String texto) {
		FragmentManager fm = this.getSupportFragmentManager();
		ObservacionesDialog dialog = ObservacionesDialog.newInstance(this,
				modulo, texto);
		dialog.show(fm, "obsDialog");
	}

	private void grabarYContinuar() {
		this.grabarYContinuar(viewPager.getCurrentItem() + 1);
	}

	private void irA(int position) {
		esArrastre = true;
		nextFragment(position);
	}

	private void invokeMethod(FragmentForm.OPCION opcion) {
		CuestionarioFragmentActivity.this.pageAdapter.getItem(
				viewPager.getCurrentItem()).invoke(opcion);
	}

	private void grabarYContinuar(int position) {
		int posicionActual = viewPager.getCurrentItem();
		boolean flag = CuestionarioFragmentActivity.this.pageAdapter.getItem(
				posicionActual).grabar();
		if (flag && posicionActual != MARCO) {
			esArrastre = true;
			if (posicionActual == viewPager.getCount() - 1) {
				ToastMessage.msgBox(this, "Registro Finalizado",
						ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
				nextFragment(VISITAS);
			} else {
				debeGrabar = false;
				nextFragment(position);
			}
			return;
		} else {
			esArrastre = false;
		}
	}

	public void setTitulo(String titulo) {
		TITULO = getResources().getString(R.string.app_name);
		if (titulo != null) {
			if (!"".equals(titulo)) {
				TITULO += " " + titulo;
			}
		}
		getActionBar().setTitle(TITULO);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			new AlertDialog.Builder(this)
					.setIcon(android.R.drawable.ic_dialog_alert)
					.setTitle("Salir")
					.setMessage(
							"Esta a punto de salir de la aplicaci\u00f3n, se perder\u00e1 todo aquello que no haya guardado. \u00bfEsta seguro que desea salir del sistema?")
					.setPositiveButton("Si",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// MarcoFragment.PERIODO = null;
									finish();
								}
							}).setNegativeButton("No", null).show();
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onResume() {
		super.onResume();
	//	stopService(new Intent(this, ServicioBurbuja.class));
		if (preferencias.getBoolean("primera_ejecucion", true)) {
			editor.putBoolean("primera_ejecucion", false);
			editor.commit();
			drawerLayout.postDelayed(new Runnable() {
				@Override
				public void run() {
					drawerLayout.openDrawer(Gravity.LEFT);
				}
			}, 500);
		}

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// super.onSaveInstanceState(outState);
		outState.putInt("tab", getActionBar().getSelectedNavigationIndex());
	}

	private class CuestionarioSimpleOnPageChangeListener extends
			FragmentViewPager.SimpleOnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int state) {
			if (state == ViewPager.SCROLL_STATE_DRAGGING) {
				CuestionarioFragmentActivity.this.setPrevPage(viewPager
						.getCurrentItem());
				esArrastre = debeGrabar = true;
			}
			super.onPageScrollStateChanged(state);
		}

		@Override
		public void onPageSelected(final int position) {
			CuestionarioFragmentActivity.this.setCurPage(position);
			invalidateOptionsMenu();
			int prevPage = CuestionarioFragmentActivity.this.getPrevPage();

			Log.e("prevPage", "prevPage: " + prevPage);
			Log.e("position", "position: " + position);

			if (prevPage == MARCO && position == MARCO + 1) {
				if (!CuestionarioFragmentActivity.this.esSalto) {
					esArrastre = false;
					nextFragment(prevPage);
					return;
				}
			}

			if (position <= VISITAS) {
				App.ONLY_VISUALITATION = FragmentForm.DISABLED = false;
			}

			/* ###################### INICIO RETROCESO ###################### */

			if (prevPage == VISITAS && position == VISITAS - 1) {
				Caratula caratula = App.getInstance().getEmpresa();
//				if (caratula != null && Util.getInt(caratula.res_verif) == 1) {
//					debeGrabar = false;
//					nextFragment(CARATULA + 2);
//					return;
//				}
			}
			
			
//			if (prevPage == MODULO_I + 3 && position == MODULO_I + 2) {
//				Caratula car = App.getInstance().getEmpresa();
//				if ( Util.getInt(car.p29_a) == 1 &&  Util.getInt(car.p25) < 3) {
//				} else {
//
//					esArrastre = true;
//					nextFragment(CARATULA + 7 ); //por verificar
//					return;
//				}
//			}
			//retro de 111 a 31
		if (prevPage == MODULO_I + 3 && position == MODULO_I + 2) {
			Caratula car = App.getInstance().getEmpresa();
			if ( Util.getInt(car.p25) > 2) { 
				esArrastre = true;
				nextFragment(CARATULA + 7 ); //por verificar
				return;
			}
			 if (Util.getInt(car.p29_a) == 2 &&  Util.getInt(car.p25) < 3) {
				esArrastre = true;
				nextFragment(CARATULA + 7 ); //por verificar
				return;
			}
    	}
			
			//CACO2019 RETRO si del menu va al 100

			if (prevPage == MODULO_I + 2 && position == MODULO_I + 1) {
				Caratula car = App.getInstance().getEmpresa();
				if (car != null) {
					//2310
					if ( Util.getInt(car.p29_a) == 1 &&  Util.getInt(car.p25) < 3) {
						Moduloi bean = getCuestionarioService().getModuloi(
								App.getInstance().getEmpresa(),
								new Moduloi().getSecCap(Util.getListList( "C1P101A_1")));
						if (bean != null) {
						}	
					}else{
						esArrastre = true;
						nextFragment(CARATULA + 8); //por verificar
						return;
					}
				}
			}
			
			// CACO
			if (prevPage == MODULO_I + 5 && position == MODULO_I + 4) {
				Moduloi bean = getCuestionarioService().getModuloi(
						App.getInstance().getEmpresa(),
						new Moduloi().getSecCap(Util.getListList("C1P101A_1")));
				if (bean != null) {
//					if (!Util.esDiferente(bean.c1p101a_1, 2)) {
//						esArrastre = true;
//						nextFragment(MODULO_I );
//						return;
//					}
				}
			}
			
			
			// CACO
			if (prevPage == MODULO_I + 7 && position == MODULO_I + 6) {
				Moduloi bean = getCuestionarioService().getModuloi(
						App.getInstance().getEmpresa(),
						new Moduloi().getSecCap(Util.getListList("C1P116")));
				if (bean != null) {
					if (!Util.esDiferente(bean.c1p116, 2)) {
						esArrastre = true;
						nextFragment(MODULO_I + 5);
						return;
					}
				}
			}


			//RETROCESOS 301 a 202 puma 2020
			if (prevPage == MODULO_III  && position == MODULO_III -1) {
				Moduloii bean = getCuestionarioService()
						.getModuloii(
								App.getInstance().getEmpresa(),
								new Moduloii().getSecCap(Util
										.getListList("C2P202")));
				
				if (bean != null) {
						 if (!Util.esDiferente(bean.c2p202,8)) {
							esArrastre = true;
							nextFragment(MODULO_II);
							return;
						}
					}
			}	
			
			if (prevPage == MODULO_III  && position == MODULO_III -1) {
				Caratula caratula = App.getInstance().getEmpresa();
				int p25 = Util.getInt(caratula.p25, 0);
				if (p25 < 3) {

				} else {
					esArrastre = true;
					nextFragment(MODULO_II + 1);
					return;
				}
			}

			//RETROCESOS 334 a 301 puma 2020
			if (prevPage == MODULO_III+11  && position == MODULO_III +10) {
				Moduloiii01 bean = getCuestionarioService()
				.getModuloiii01(
						App.getInstance().getEmpresa(),
						new Moduloiii01().getSecCap(Util
								.getListList("C3P301")));
				
				if (bean != null) {
						 if (!Util.esDiferente(bean.c3p301,0)) {
							esArrastre = true;
							nextFragment(MODULO_III);
							return;
						}
					}
			}	
			
			// Retro de 320 a 309
			if (prevPage == MODULO_III + 6 && position == MODULO_III + 5) {
				Moduloiii01 bean = getCuestionarioService().getModuloiii01(
						App.getInstance().getEmpresa(),
						new Moduloiii01().getSecCap(Util.getListList(
								"C3P310_9", "C3P314_12")));
				if (bean != null) {
					// 2310
					if (!Util.esDiferente(bean.c3p310_9, 1)) {
						esArrastre = true;
						nextFragment(MODULO_III + 2);
						return;
					}
				}
			}

			if (prevPage == MODULO_III + 8 && position == MODULO_III + 7) {
				Moduloiii02 bean = getCuestionarioService()
						.getModuloiii02(
								App.getInstance().getEmpresa(),
								new Moduloiii02().getSecCap(Util
										.getListList("C3P320")));
				if (bean != null) {
					if (!Util.esDiferente(bean.c3p320, 2)) {
						debeGrabar = false;
						nextFragment(MODULO_III + 6);
						return;
					}
				}
			}

			//********CSSC - 061119 - BEGIN********
			


			
			if (prevPage == MODULO_III + 9 && position == MODULO_III + 8) {
				Moduloiii02 bean = getCuestionarioService()
						.getModuloiii02(
								App.getInstance().getEmpresa(),
								new Moduloiii02().getSecCap(Util
										.getListList("C3P320","C3P326_2","C3P326_6")));
				
				if (bean != null) {
			//		if (!Util.esDiferente(bean.c3p320, 1)) {
						 if (!Util.esDiferente(bean.c3p326_2, 2)	&& !Util.esDiferente(bean.c3p326_6, 2)) {
							esArrastre = true;
							nextFragment(MODULO_III + 7);
							return;
						}
					}
			//	}
			}	

			if (prevPage == MODULO_III + 9 && position == MODULO_III + 8) {
				Moduloiii02 bean = getCuestionarioService()
						.getModuloiii02(
								App.getInstance().getEmpresa(),
								new Moduloiii02().getSecCap(Util
										.getListList("C3P320")));
				if (bean != null) {
					if (!Util.esDiferente(bean.c3p320, 2)) {
						esArrastre = true;
						nextFragment(MODULO_III + 6);
						return;
					}
				}
			}
			//********CSSC - 061119 - END********

			

			//de 408 a 401
			if (prevPage == MODULO_IV + 2 && position == MODULO_IV + 1) {
				Moduloiv01 mod04 = getCuestionarioService().getModuloiv01(
						App.getInstance().getEmpresa(),
						new Moduloiv01().getSecCap(Util.getListList("C4P403")));
				if (mod04 != null) {
					if (!Util.esDiferente(mod04.c4p403, 4)) {
						esArrastre = true;
						nextFragment(MODULO_IV);
						return;
					}
				}
			}
			//De 404 a 417
			if (prevPage == MODULO_IV+4  && position == MODULO_IV + 3) {
				Moduloiv01 mod04 = getCuestionarioService().getModuloiv01(
						App.getInstance().getEmpresa(),
						new Moduloiv01().getSecCap(Util.getListList("C4P404A_2")));
				if (mod04 != null) {
					if (!Util.esDiferente(mod04.c4p404a_2, 2)) {
						esArrastre = true;
						nextFragment(MODULO_IV+1);
						return;
					}
				}
			}
			
			//425 a 418
			if (prevPage == MODULO_IV + 6 && position == MODULO_IV + 5) {
				Moduloiv01 mod04 = getCuestionarioService().getModuloiv01(
						App.getInstance().getEmpresa(),
						new Moduloiv01().getSecCap(Util.getListList("C4P401","C4P418")));

				if (mod04 != null) {
//					if (!Util.esDiferente(mod04.c4p401, 3) || !Util.esDiferente(mod04.c4p401, 4)) {
//						esArrastre = true;
//						nextFragment(MODULO_IV);
//						return;
//					}
//					else
						if (!Util.esDiferente(mod04.c4p418, 2)) {
						esArrastre = true;
						nextFragment(MODULO_IV + 4);
						return;
					}

				}
			}
			//425A a 433
			if (prevPage == MODULO_IV + 9 && position == MODULO_IV + 8) {
				Moduloiv01 mod04 = getCuestionarioService().getModuloiv01(
						App.getInstance().getEmpresa(),
						new Moduloiv01().getSecCap(Util.getListList("C4P425A_3"))); 
				if (mod04 != null) {
					if (Util.getInt(mod04.c4p425a_3) == 1) {
						esArrastre = true;
						nextFragment(MODULO_IV + 6);
						return;
					}

				}
			}
			//retro puma 499 a 484
			if (prevPage == MODULO_IV_EXTRA + 7 && position == MODULO_IV_EXTRA + 6) {
				Moduloiv03 mod03 = getCuestionarioService().getModuloiv03(
						App.getInstance().getEmpresa(),
						new Moduloiv03().getSecCap(Util.getListList("C4P484_1"))); 

				if (mod03 != null) {
					if (Util.getInt(mod03.c4p484_1) == 1) {
						esArrastre = true;
						nextFragment(MODULO_IV_EXTRA + 4);
						return;
					}

				}
			}
			
			if(prevPage==MODULO_IV_EXTRA+3 && position == MODULO_IV_EXTRA + 2){
				Moduloiv02 mod02 = getCuestionarioService().getModuloiv02(
						App.getInstance().getEmpresa(),
						new Moduloiv02().getSecCap(Util.getListList("C4P475A")));
				
				if(Util.getInt(mod02.c4p475a) == 2){
					esArrastre = true;
					nextFragment(MODULO_IV_EXTRA + 1);
					return;
				}
			}
			
			//retro puma 495 a 487
			if (prevPage == MODULO_IV_EXTRA + 6 && position == MODULO_IV_EXTRA + 5) {
				Moduloiv03 mod03 = getCuestionarioService().getModuloiv03(
						App.getInstance().getEmpresa(),
						new Moduloiv03().getSecCap(Util.getListList("C4P487"))); 

				if (mod03 != null) {
					if (Util.getInt(mod03.c4p487) == 2) {
						esArrastre = true;
						nextFragment(MODULO_IV_EXTRA + 4);
						return;
					}

				}
			}
			
			//retro Johnny
			if (prevPage == MODULO_V + 3 && position == MODULO_V + 2) {
				Modulov01 mod01 = getCuestionarioService()
						.getModulov01(
								App.getInstance().getEmpresa(),
								new Modulov01().getSecCap(Util
										.getListList("C5P503_4")));
				Caratula car = App.getInstance().getEmpresa();
				
				if ((car != null) && (Util.getInt(mod01.c5p503_4) == 1)) {
					if (Util.getInt(car.p25) < 3) {
						debeGrabar = false;
						nextFragment(MODULO_V + 1);
						return;
					}
				}
			}
			
			if (prevPage == MODULO_V + 6 && position == MODULO_V + 5) {
				
				Modulov02 mod02 = getCuestionarioService().getModulov02(
						App.getInstance().getEmpresa(),
						new Modulov02().getSecCap(Util
										.getListList("C5P513B")));
				
				if (Util.getInt(mod02.c5p513b) == 2) {
						debeGrabar = false;
						nextFragment(MODULO_V + 3);
						return;
				}
			}
			
			//retro puma 600 a 511

		
			if (prevPage == MODULO_VI  && position == MODULO_VI - 1) {
				
				Modulov02 mod02 = getCuestionarioService().getModulov02(
						App.getInstance().getEmpresa(),
						new Modulov02().getSecCap(Util
										.getListList("C5P512_1")));
				
				Caratula car = App.getInstance().getEmpresa();
				
				if (Util.getInt(car.p25)  == 1 || Util.getInt(car.p25)  == 2) {
				} else {
					esArrastre = true;
					nextFragment(MODULO_V  + 2);
					return;
				}
				
				if ((car != null) && (Util.getInt(mod02.c5p512_1) == 2)) {
					if (Util.getInt(car.p25) < 3) {
						debeGrabar = false;
						nextFragment(MODULO_V + 3);
						return;
					}
				}
			
			}
			
			//601 hasta 607 RETRO
			if (prevPage == MODULO_VI +2  && position == MODULO_VI + 1) {
				Modulovi01 bean = getCuestionarioService().getModulovi01(
						App.getInstance().getEmpresa(),
						new Modulovi01().getSecCap(Util.getListList("C6P601")));
				if (bean != null) {
					if (Util.getInt(bean.c6p601) == 2) {
						esArrastre = true;
						nextFragment(MODULO_VI);
						return;
					}
				}
			}
			

		
			//deeeeee
			if (prevPage == MODULO_VII  && position == MODULO_VII -1) {
				Modulovi01 bean = getCuestionarioService().getModulovi01(
						App.getInstance().getEmpresa(),
						new Modulovi01().getSecCap(Util.getListList("C6P624", "C6P624_A", "C6P625")));

				if (bean != null) {
					if (Util.getInt(bean.c6p624) == 2 ) {
						esArrastre = true;
						nextFragment(MODULO_VI + 6);
						return;
					}

				}
			}
			
	    //retro puma 705 a 701
			if (prevPage == MODULO_VII+2 && position == MODULO_VII+1) {
				Modulovii01 bean = getCuestionarioService().getModulovii01(
						App.getInstance().getEmpresa(),
						new Modulovii01().getSecCap(Util.getListList(
								"C7P701_1A", "C7P701_2A","C7P701_3A", "C7P701_4A","C7P701_5A", "C7P701_6A","C7P701_7A","C7P701_8A", "C7P701_8B",
								"C7P701_1B", "C7P701_2B","C7P701_3B", "C7P701_4B")));
				 Caratula car = App.getInstance().getEmpresa();
				 
				 if(Util.getInt(bean.c7p701_8a) == 1 ){
					 if ( (Util.getInt(bean.c7p701_8b) == 1 || Util.getInt(bean.c7p701_8b) == 2 ) 
							    && Util.getInt(bean.c7p701_1a)==2
								&& Util.getInt(bean.c7p701_2a) == 2
							    && Util.getInt(bean.c7p701_3a) == 2
								&& Util.getInt(bean.c7p701_4a) == 2
								&& Util.getInt(bean.c7p701_5a) == 2
								&& Util.getInt(bean.c7p701_6a) == 2
								&& Util.getInt(bean.c7p701_7a) == 2  ) {					 
						 	esArrastre = true;
							nextFragment(MODULO_VII);
							return;
					 }
					 if ( (Util.getInt(bean.c7p701_8b) == 1 || Util.getInt(bean.c7p701_8b) == 2 ) 
							 && ( (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
										&& (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
									    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
										&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) ) ) {					 
						 	esArrastre = true;
							nextFragment(MODULO_VII);
							return;
					 }
				 }else if(Util.getInt(bean.c7p701_8a) == 2 ){
					 if (  (  Util.getInt(bean.c7p701_1a)==2
								&& Util.getInt(bean.c7p701_2a) == 2
							    && Util.getInt(bean.c7p701_3a) == 2
								&& Util.getInt(bean.c7p701_4a) == 2
								&& Util.getInt(bean.c7p701_5a) == 2
								&& Util.getInt(bean.c7p701_6a) == 2
								&& Util.getInt(bean.c7p701_7a) == 2 ) &&Util.getInt(car.p25) >2  ) {					 
						 	esArrastre = true;
							nextFragment(MODULO_VII);
							return;
					 }
						if ( ( (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
								&& (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
							    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
								&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) ) && Util.getInt(car.p25) >2){
							esArrastre = true;
							nextFragment(MODULO_VII);
							return;
						}
												
						
						if ((Util.getInt(bean.c7p701_1a) == 1
								|| Util.getInt(bean.c7p701_2a) == 1
								|| Util.getInt(bean.c7p701_3a) == 1
								|| Util.getInt(bean.c7p701_4a) == 1)
								&& ( (Util.getInt(bean.c7p701_1b) == 2 ||  Util.getInt(bean.c7p701_1b)==0) 
										&& ( Util.getInt(bean.c7p701_2b) == 2 || Util.getInt(bean.c7p701_2b)==0 )
										&& ( Util.getInt(bean.c7p701_3b) == 2 || Util.getInt(bean.c7p701_3b)==0 )
										&& ( Util.getInt(bean.c7p701_4b) == 2 || Util.getInt(bean.c7p701_4b)==0 )  )
								&& (Util.getInt(bean.c7p701_5a) == 2
										|| Util.getInt(bean.c7p701_6a) == 2 
										|| Util.getInt(bean.c7p701_7a) == 2)
								&& Util.getInt(car.p25) < 3) {
							 esArrastre = true;
								nextFragment(MODULO_VII);
								return;
						 }
						
						 if (  (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
									&& ( (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
								    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
									&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) )   
									&&	( ( Util.getInt(bean.c7p701_5a) == 1 )
											||	( Util.getInt(bean.c7p701_6a)==1 )
											|| (Util.getInt(bean.c7p701_7a) == 1 )  )
											&& Util.getInt(car.p25) < 3   ) {	
							 esArrastre = true;
								nextFragment(MODULO_VII);
								return;		
						}	
					 
				 }						 

			}
			//P909
			if (prevPage == MODULO_IX +8 && position == MODULO_IX + 7) { //909 a 908 o anterior 846
				Caratula caratula = App.getInstance().getEmpresa();

				if (caratula != null) {
					/**********Bloque Temporal - COMENTAR*********/	
			//CSSC - nav
					/**********Bloque Real - DESCOMENTAR*********/
					int flag = Util.getInt( App.getInstance().getMarco().flag,0); 			//algo;
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					if (flag==1){					//MUESTRA1090==SÍ
						if (funcionamiento == 2017) {
							irA(MODULO_IX -1);	//846
						}
					}else if (flag!=1){				//MUESTRA1090==NO
						irA(MODULO_IX -1);	
					}
					/**********Bloque Real - DESCOMENTAR - FIN*********/
				}
			}
			//De 903 a 901
			if (prevPage == MODULO_IX + 2 && position == MODULO_IX + 1) {
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null) {
				Integer codigo = Integer.parseInt(caratula.ciiu_cd.toString().substring(0, 2));
				int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 
				int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					if (caratula != null) {				
						if (/* flagmuestra==1 && funcionamiento <= 2016 &&*/ ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
							esArrastre = true;
							nextFragment(MODULO_IX ); //901
							return;
						} 
					}
				}
			}
			
			if (prevPage == MODULO_IX + 3 && position == MODULO_IX + 2) {
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null) {
					Integer codigo = Integer.parseInt(caratula.ciiu_cd.toString().substring(0, 2));
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					if ((codigo >= 10 && codigo <= 33) || (codigo == 41 || codigo == 42 /*|| codigo == 43*/)) {
						esArrastre = true;
						nextFragment(MODULO_IX + 1);
						return;
					}
				}
			}		
			if (prevPage == MODULO_IX + 10 && position == MODULO_IX + 9) { //911 a 910
				Caratula caratula = App.getInstance().getEmpresa();

				if (caratula != null) {
					Integer codigo = Integer.parseInt(caratula.ciiu_cd.toString().substring(0, 2));
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0);
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					if (flagmuestra==1 && funcionamiento == 2017 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
						esArrastre = true;
						nextFragment(MODULO_IX + 8);
						return;
					}
					if (flagmuestra==0 && funcionamiento == 2017 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
						esArrastre = true;
						nextFragment(MODULO_IX + 8);
						return;
					}
					if (flagmuestra==1 && funcionamiento <= 2016 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
						esArrastre = true;
						nextFragment(MODULO_IX + 8);
						return;
					}
					if (flagmuestra==0 && funcionamiento <= 2016 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
						esArrastre = true;
						nextFragment(MODULO_IX + 8);
						return;
					}
//					if (flagmuestra==0 && funcionamiento <= 2016 && ((codigo>=10 && codigo<=33 )|| codigo==41 || codigo==42)) {
//						esArrastre = true;
//						nextFragment(MODULO_IX + 8);
//						return;
//					}
				}					
			}
			
			

			/* ###################### FINAL RETROCESO ###################### */

			boolean flag = false;
			Log.e("ocurrioSalto: " + ocurrioSalto, "debeGrabar: " + debeGrabar
					+ " EsArreatre: " + esArrastre + " esSave: " + " esSalto: "
					+ esSalto);
			if ((prevPage < position && debeGrabar) || ocurrioSalto) {
				ocurrioSalto = false;
				flag = CuestionarioFragmentActivity.this.pageAdapter.getItem(
						prevPage).grabar();
				if (!flag) {
					esArrastre = false;
					nextFragment(prevPage);
					return;
				}
				esArrastre = true;
			}
			debeGrabar = true;

			/* ###################### INICIO AVANCE ##################### */

			if (prevPage == CARATULA + 2 && position == CARATULA + 3) {
				Caratula caratula = App.getInstance().getEmpresa();
//				if (caratula != null && Util.getInt(caratula.res_verif) == 1) {
//					debeGrabar = false;
//					nextFragment(VISITAS);
//					return;
//				}
			}
			
			if (prevPage ==  VISITAS && position == VISITAS + 1) { 
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null && Util.getInt(caratula.res_verif) == 1) {
					ToastMessage.msgBox(getApplicationContext(),
							"Encuesta FINALIZADA.",
							ToastMessage.MESSAGE_INFO,
							ToastMessage.DURATION_LONG);
					debeGrabar = false;
					nextFragment(MARCO);
					return;
				}
			}
			
        //salto de 31 a 111
	
//			if (prevPage == CARATULA + 7 && position == CARATULA + 8) {
//				Caratula car = App.getInstance().getEmpresa();
//				if (car != null) {			
//					//2310
//					if (Util.getInt(car.p29_a) == 1 &&  Util.getInt(car.p25) < 3) {
//						
//					}else{
//						debeGrabar = false;
//						nextFragment(MODULO_I + 3); //por verificar
//						return;
//					}
//				}
//			}
			 //salto de 31 a 111
			
			if (prevPage == CARATULA + 7 && position == CARATULA + 8) {
			Caratula car = App.getInstance().getEmpresa();
			if (car != null) {			
				if ( Util.getInt(car.p25) > 2) {
					debeGrabar = false;
					nextFragment(MODULO_I + 3); //por verificar
					return;
				}
			 if (Util.getInt(car.p29_a) == 2 &&  Util.getInt(car.p25) < 3) {
					debeGrabar = false;
					nextFragment(MODULO_I + 3); //por verificar
					return;
				}
			}
		}
			//**********************CSSC - 061119 - BEGIN***********************/
			//AVANCES
			//202 a 301 puma 2020
			if (prevPage == MODULO_II && position == MODULO_II + 1) {
				Moduloii mod02 = getCuestionarioService().getModuloii(
						App.getInstance().getEmpresa(),
						new Moduloii().getSecCap(Util.getListList("C2P202")));

				if (mod02 != null) {
					Log.e("que paso aquiiiiiiii cuestionario: ", "" +mod02.c2p202 );
					if (!Util.esDiferente(mod02.c2p202, 8)) {
						debeGrabar = false;
						nextFragment(MODULO_III);
						return;
					}
				}
			}
			//salto puma 301 a 334 2020
			if (prevPage == MODULO_III && position == MODULO_III + 1) {
				Moduloiii01 bean = getCuestionarioService()
						.getModuloiii01(
								App.getInstance().getEmpresa(),
								new Moduloiii01().getSecCap(Util
										.getListList("C3P301")));
				if (bean != null) {
					if (!Util.esDiferente(bean.c3p301,0)) {
						debeGrabar = false;
						nextFragment(MODULO_III+11);// falta agregar la 334
						return;
					}
				}
			}
			
			///
			if (prevPage == MODULO_III + 6 && position == MODULO_III + 7) {
				Moduloiii02 bean = getCuestionarioService()
						.getModuloiii02(
								App.getInstance().getEmpresa(),
								new Moduloiii02().getSecCap(Util
										.getListList("C3P320")));
				if (bean != null) {
					if (!Util.esDiferente(bean.c3p320, 2)) {
						debeGrabar = false;
						nextFragment(MODULO_III + 9);
						return;
					}
				}
			}
			
			if (prevPage == MODULO_III + 7 && position == MODULO_III + 8) {
				Moduloiii02 bean = getCuestionarioService()
						.getModuloiii02(
								App.getInstance().getEmpresa(),
								new Moduloiii02().getSecCap(Util
										.getListList("C3P326_2","C3P326_6")));
				if (bean != null) {					
					 if (!Util.esDiferente(bean.c3p326_2, 2) && !Util.esDiferente(bean.c3p326_6, 2)) {
						debeGrabar = false;
						nextFragment(MODULO_III + 9);
						return;
					}
				}
			}
			
			
			//404 a 417 puma
			if (prevPage == MODULO_IV + 1 && position == MODULO_IV + 2) {
				Moduloiv01 mod04 = getCuestionarioService().getModuloiv01(
						App.getInstance().getEmpresa(),
						new Moduloiv01().getSecCap(Util.getListList("C4P401","C4P402C","C4P403","C4P404A_2")));

				if (mod04 != null) {
					Log.e("que paso aquiiiiiiii cuestionario: ", "" +mod04.c4p403);
					if (!Util.esDiferente(mod04.c4p404a_2, 2)) {
						debeGrabar = false;
						nextFragment(MODULO_IV + 4);
						return;
					}
				}
			}

			
			//418 a 425
			if (prevPage == MODULO_IV + 4 && position == MODULO_IV + 5) {
				Moduloiv01 mod04 = getCuestionarioService().getModuloiv01(
						App.getInstance().getEmpresa(),
						new Moduloiv01().getSecCap(Util.getListList("C4P418")));

				if (mod04 != null) {
					if (!Util.esDiferente(mod04.c4p418, 2)) {
						debeGrabar = false;
						nextFragment(MODULO_IV + 6);
						return;
					}

				}
			}

			if (prevPage == MODULO_IV + 6 && position == MODULO_IV + 7) {
				Moduloiv01 mod04 = getCuestionarioService().getModuloiv01(
						App.getInstance().getEmpresa(),
						new Moduloiv01().getSecCap(Util.getListList("C4P425A_3"))); 

				if (mod04 != null) {
					if (Util.getInt(mod04.c4p425a_3) == 1) {
						debeGrabar = false;
						nextFragment(MODULO_IV + 9);
						return;
					}

				}
			}
			//avance P484 y P487 puma
			if (prevPage == MODULO_IV_EXTRA + 4 && position == MODULO_IV_EXTRA + 5) {
				Moduloiv03 mod03 = getCuestionarioService().getModuloiv03(
						App.getInstance().getEmpresa(),
						new Moduloiv03().getSecCap(Util.getListList("C4P484_1","C4P487"))); 

				if (mod03 != null) {
					if (Util.getInt(mod03.c4p484_1) == 1) {
						debeGrabar = false;
						nextFragment(MODULO_IV_EXTRA + 7);
						return;
					}
					if (Util.getInt(mod03.c4p487) == 2) {
						debeGrabar = false;
						nextFragment(MODULO_IV_EXTRA + 6);
						return;
					}

				}
			}
			
			if(prevPage==MODULO_IV_EXTRA+1 && position == MODULO_IV_EXTRA + 2){
				Moduloiv02 mod02 = getCuestionarioService().getModuloiv02(
						App.getInstance().getEmpresa(),
						new Moduloiv02().getSecCap(Util.getListList("C4P475A")));
				
				if(Util.getInt(mod02.c4p475a) == 2){
					debeGrabar = false;
					nextFragment(MODULO_IV_EXTRA + 3);
					return;
				}
			}
		
			//Salto Johnny
			if (prevPage == MODULO_V + 1 && position == MODULO_V + 2) {
				
				Modulov01 mod01 = getCuestionarioService()
						.getModulov01(
								App.getInstance().getEmpresa(),
								new Modulov01().getSecCap(Util
										.getListList("C5P503_4")));
				
				Caratula car = App.getInstance().getEmpresa();
				if ((car != null) && (Util.getInt(mod01.c5p503_4) == 1)) {
					if (Util.getInt(car.p25) < 3) {
						Log.e("VERR", "AQUI");
						debeGrabar = false;
						nextFragment(MODULO_V + 3);
						return;
					}

				}
			}

			//De puma 511 a 601
			if (prevPage == MODULO_V + 2 && position == MODULO_V + 3) {
				Modulov01 mod01 = getCuestionarioService()
						.getModulov01(
								App.getInstance().getEmpresa(),
								new Modulov01().getSecCap(Util
										.getListList("C5P511_10")));
				Caratula car = App.getInstance().getEmpresa();

				if ((car != null) && (mod01 != null)) {
					if ((Util.getInt(car.p25) > 2)) {
						debeGrabar = false;
						nextFragment(MODULO_VI);
						return;
					}

				}
			}
			
			//Salto Johnny
			if (prevPage == MODULO_V + 3 && position == MODULO_V + 4) {
				
				Modulov02 mod02 = getCuestionarioService().getModulov02(
						App.getInstance().getEmpresa(),
						new Modulov02().getSecCap(Util
										.getListList("C5P512_1", "C5P513B")));
				
				Caratula car = App.getInstance().getEmpresa();
				if ((car != null) && (Util.getInt(mod02.c5p512_1) == 2)) {
					if (Util.getInt(car.p25) < 3) {
						debeGrabar = false;
						nextFragment(MODULO_VI);
						return;
					}
				}
				
				if (Util.getInt(mod02.c5p513b) == 2) {
					debeGrabar = false;
					nextFragment(MODULO_VI - 1);
					return;
				}
				
			}
			
			
			if (prevPage == MODULO_VI   && position == MODULO_VI + 1) {
				Modulovi01 bean = getCuestionarioService()
						.getModulovi01(
								App.getInstance().getEmpresa(),
								new Modulovi01().getSecCap(Util
										.getListList("C6P601")));
				if (bean != null) {
					if (!Util.esDiferente(bean.c6p601, 2)) {
						debeGrabar = false;
						nextFragment(MODULO_VI +2);
						return;
					}
				}
			}
					
			//De 624 a 700
			if (prevPage == MODULO_VI + 6 && position == MODULO_VI + 7) {
				Modulovi01 bean = getCuestionarioService().getModulovi01(
						App.getInstance().getEmpresa(),
						new Modulovi01().getSecCap(Util.getListList("C6P624",
								"C6P624_A", "C6P625")));

				if (bean != null) {
					if (Util.getInt(bean.c6p624) == 2 ) {
						debeGrabar = false;
						nextFragment(MODULO_VII);
						return;
					}

				}
			} 
		      
			//salto PUMA De 701 a 705
			if (prevPage == MODULO_VII && position == MODULO_VII+1) {
				Log.e ("xx", "a qui es 700");

					
						Modulovii01 bean = getCuestionarioService().getModulovii01(
								App.getInstance().getEmpresa(),
								new Modulovii01().getSecCap(Util.getListList(
										"C7P701_1A", "C7P701_2A","C7P701_3A", "C7P701_4A","C7P701_5A", "C7P701_6A","C7P701_7A","C7P701_8A", "C7P701_8B", 
										"C7P701_1B", "C7P701_2B","C7P701_3B", "C7P701_4B")));				
						Caratula car = App.getInstance().getEmpresa();
						
						Log.e ("car", car.p25 +"");
						Log.e("c7p701_8a",Util.getInt(bean.c7p701_8a)  +"");
						Log.e("c7p701_8b",Util.getInt(bean.c7p701_8b)  +"");
						Log.e("c7p701_1a",Util.getInt(bean.c7p701_1a)  +"");
						Log.e("c7p701_2a",Util.getInt(bean.c7p701_2a)  +"");
						Log.e("c7p701_3a",Util.getInt(bean.c7p701_3a)  +"");
						Log.e("c7p701_4a",Util.getInt(bean.c7p701_4a)  +"");
						Log.e("c7p701_5a",Util.getInt(bean.c7p701_5a)  +"");
						Log.e("c7p701_6a",Util.getInt(bean.c7p701_6a)  +"");
						Log.e("c7p701_7a",Util.getInt(bean.c7p701_7a)  +"");
						Log.e("c7p701_1b",Util.getInt(bean.c7p701_1b)  +"");
						Log.e("c7p701_2b",Util.getInt(bean.c7p701_2b)  +"");
						Log.e("c7p701_3b",Util.getInt(bean.c7p701_3b)  +"");
						Log.e("c7p701_4b",Util.getInt(bean.c7p701_4b)  +"");
						
						
//						VERIFICACIÓN    :  Si C7P701_8A = 1  Pase a C7P701_8A_ESP and C7P701_8B=1,2 and sum(C7P701_1A: C7P701_7A)=14 pase Pase a C7P705_1
//						Si C7P701_8A = 1  Pase a C7P701_8A_ESP and C7P701_8B=1,2 and (C7P701_1B=1 or C7P701_2B=1 or C7P701_3B=1 or C7P701_4B=1)  Pase a C7P703_1
//						Si C7P701_8A = 1  Pase a C7P701_8A_ESP and C7P701_8B=1,2 and (C7P701_1B=2,vacio and C7P701_2B=2,vacio and  C7P701_3B=2,vacio and C7P701_4B=2,vacio)  Pase a C7P705_1
//
//				Si C7P701_8A = 2 and sum(C7P701_1A: C7P701_7A)=14 and P25=1,2  Pase a C7P702_1 luego pase C7P705_1
//				Si C7P701_8A = 2 and sum(C7P701_1A: C7P701_7A)=14 and P25>2  Pase a C7P705_1
//				Si C7P701_8A = 2 and (C7P701_1B=1 or C7P701_2B=1 or C7P701_3B=1 or C7P701_4B=1)  Pase a C7P703_1
//				Si C7P701_8A = 2 and (C7P701_1B=2,vacio and C7P701_2B=2,vacio and  C7P701_3B=2,vacio and C7P701_4B=2,vacio)  Pase a C7P705_1

						
						
			 if(Util.getInt(bean.c7p701_8a) == 1 ){
				 if ( (Util.getInt(bean.c7p701_8b) == 1 || Util.getInt(bean.c7p701_8b) == 2 ) 
						    && Util.getInt(bean.c7p701_1a)==2
							&& Util.getInt(bean.c7p701_2a) == 2
						    && Util.getInt(bean.c7p701_3a) == 2
							&& Util.getInt(bean.c7p701_4a) == 2
							&& Util.getInt(bean.c7p701_5a) == 2
							&& Util.getInt(bean.c7p701_6a) == 2
							&& Util.getInt(bean.c7p701_7a) == 2  ) {					 
					 	debeGrabar = false;
						nextFragment(MODULO_VII+2);
						return;
				 }
				 if ( (Util.getInt(bean.c7p701_8b) == 1 || Util.getInt(bean.c7p701_8b) == 2 ) 
						 && ( (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
									&& (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
								    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
									&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) ) ) {					 
					 	debeGrabar = false;
						nextFragment(MODULO_VII+2);
						return;
				 }
				 
				 
			 }else if(Util.getInt(bean.c7p701_8a) == 2 ){
				 if (  (  Util.getInt(bean.c7p701_1a)==2
							&& Util.getInt(bean.c7p701_2a) == 2
						    && Util.getInt(bean.c7p701_3a) == 2
							&& Util.getInt(bean.c7p701_4a) == 2
							&& Util.getInt(bean.c7p701_5a) == 2
							&& Util.getInt(bean.c7p701_6a) == 2
							&& Util.getInt(bean.c7p701_7a) == 2 ) &&Util.getInt(car.p25) >2  ) {	
					 Log.e ("berenice", "1");
					 	debeGrabar = false;
						nextFragment(MODULO_VII+2);
						return;
				 }
					if ( ( (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
							&& (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
						    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
							&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) ) && Util.getInt(car.p25) > 2 ){
						Log.e ("berenice", "2");
						debeGrabar = false;
						nextFragment(MODULO_VII+2);
						return;
					}
					
					if ((Util.getInt(bean.c7p701_1a) == 1
							|| Util.getInt(bean.c7p701_2a) == 1
							|| Util.getInt(bean.c7p701_3a) == 1
							|| Util.getInt(bean.c7p701_4a) == 1)
							&& ( (Util.getInt(bean.c7p701_1b) == 2 ||  Util.getInt(bean.c7p701_1b)==0) 
										&& ( Util.getInt(bean.c7p701_2b) == 2 || Util.getInt(bean.c7p701_2b)==0 )
										&& ( Util.getInt(bean.c7p701_3b) == 2 || Util.getInt(bean.c7p701_3b)==0 )
										&& ( Util.getInt(bean.c7p701_4b) == 2 || Util.getInt(bean.c7p701_4b)==0 )  )
							&& (Util.getInt(bean.c7p701_5a) == 2
									|| Util.getInt(bean.c7p701_6a) == 2 
									|| Util.getInt(bean.c7p701_7a) == 2)
							&& Util.getInt(car.p25) < 3) {
						 Log.e ("berenice", "3");
						 	debeGrabar = false;
							nextFragment(MODULO_VII+2);
							return;	
					 }
					
					 if (  (Util.getInt(bean.c7p701_1b)==2  ||Util.getInt(bean.c7p701_1b)==0)
								&& ( (Util.getInt(bean.c7p701_2b) == 2||Util.getInt(bean.c7p701_2b)==0)
							    && (Util.getInt(bean.c7p701_3b) == 2||Util.getInt(bean.c7p701_3b)==0)
								&& (Util.getInt(bean.c7p701_4b) == 2||Util.getInt(bean.c7p701_4b)==0) )   
								&&	( ( Util.getInt(bean.c7p701_5a) == 1  )
										||	( Util.getInt(bean.c7p701_6a)==1 )
										|| (Util.getInt(bean.c7p701_7a) == 1  )  )
										&& Util.getInt(car.p25) < 3   ) {	
						 Log.e ("berenice", "4");
						 	debeGrabar = false;
							nextFragment(MODULO_VII+2);
							return;	
					}	
				 
			 }			
		
	}
			if (prevPage == MODULO_I  && position == MODULO_I + 1 ) {
				Moduloi bean = getCuestionarioService().getModuloi(
						App.getInstance().getEmpresa(),
						new Moduloi().getSecCap(Util.getListList("C1P101A_1")));
				if (bean != null) {
					//2310
//					if (!Util.esDiferente(bean.c1p101a_1, 2)) {
//						debeGrabar = false;
//						nextFragment(MODULO_I + 5);
//						return;
//					}
				}
			}		
			
			
			if (prevPage == MODULO_I + 5 && position == MODULO_I + 6) {
				Moduloi bean = getCuestionarioService().getModuloi(
						App.getInstance().getEmpresa(),
						new Moduloi().getSecCap(Util.getListList("C1P116")));
				if (bean != null) {
					if (!Util.esDiferente(bean.c1p116, 2)) {
						debeGrabar = false;
						nextFragment(MODULO_I + 7);
						return;
					}
				}
			}		
			
			
			if (prevPage == MODULO_II + 1 && position == MODULO_II + 2) {
				Caratula caratula = App.getInstance().getEmpresa();
				int p25 = Util.getInt(caratula.p25, 0);
				if (p25 < 3) {

				} else {
					debeGrabar = false;
					nextFragment(MODULO_III );
					return;
				}
			}

			if (prevPage == MODULO_III + 2 && position == MODULO_III + 3) {
				Moduloiii01 bean = getCuestionarioService()
						.getModuloiii01(
								App.getInstance().getEmpresa(),
								new Moduloiii01().getSecCap(Util
										.getListList("C3P310_9")));
				if (bean != null) {
					//2310
					if (!Util.esDiferente(bean.c3p310_9, 1)) {
						debeGrabar = false;
						nextFragment(MODULO_III + 6);
						return;
					}
					
				}
			}			
					
			if (prevPage == MODULO_V + 2   && position == MODULO_V + 3) {
				Caratula car = App.getInstance().getEmpresa();
				if (Util.getInt(car.p25)  == 1 || Util.getInt(car.p25)  == 2) {
				} else {
					debeGrabar = false;
					nextFragment(MODULO_VI);
					return;
				}
			}

			
			// de 800 a 900 
			if (prevPage == MODULO_IX - 1 && position == MODULO_IX ) {
				Caratula caratula = App.getInstance().getEmpresa();

				if (caratula != null) {
					/***************Bloque temporal - Comentar************/
//					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
//					if (funcionamiento > 2016) {	
//						debeGrabar = false;
//						nextFragment(MODULO_IX + 8);
//						return;
//					}
					//CSSC - nav
					/***************Bloque real - Descomentar************/
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 	 //algo;
					

					/***************Bloque real - Descomentar - FIN************/
				}
			}
			if (prevPage == MODULO_IX +9 && position == MODULO_IX +10) {
				Log.e ("que ", "pasa");
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null) {
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 	 //algo;
					int codigo =Util.getInt(Util.getText(caratula.ciiu_cd).substring(0,2)); 
					
					if (funcionamiento == 2017 && ((codigo>=10 && codigo<=33 )|| codigo==41 || codigo==42)) {
						debeGrabar = false;
						nextFragment(MODULO_IX + 11);
						return;
					} 
					
					if (funcionamiento <= 2016 && ((codigo>=10 && codigo<=33 )|| codigo==41 || codigo==42)) {
						debeGrabar = false;
						nextFragment(MODULO_IX + 11);
						return;
					}
								
					
				}
			}
			if (prevPage == MODULO_IX +8 && position == MODULO_IX +9) {  //909 a 910
				Log.e("jgon", "go");
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null) {
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 	 //algo;
					int codigo =Util.getInt(Util.getText(caratula.ciiu_cd).substring(0,2)); 
					
					if (funcionamiento == 2017 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
						debeGrabar = false;
						nextFragment(MODULO_IX + 10);
						return;
					} 
					if ( funcionamiento<=2016 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
						debeGrabar = false;
						nextFragment(MODULO_IX + 10);
						return;
					} 
					
				}
			}
			
			if (prevPage == MODULO_IX +11 && position == MODULO_IX +10) {
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null) {
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 	 //algo;
					int codigo =Util.getInt(Util.getText(caratula.ciiu_cd).substring(0,2)); 
					
					if (funcionamiento == 2017 && ((codigo>=10 && codigo<=33 )|| codigo==41 || codigo==42)) {
						esArrastre = true;
						nextFragment(MODULO_IX + 9);
						return;
					}
					if (flagmuestra==1 && funcionamiento <= 2016 && ((codigo>=10 && codigo<=33 )|| codigo==41 || codigo==42)) {
						esArrastre = true;
						nextFragment(MODULO_IX + 9);
						return;
					}
					if (flagmuestra==0 && funcionamiento <= 2016 && ((codigo>=10 && codigo<=33 )|| codigo==41 || codigo==42)) {
						esArrastre = true;
						nextFragment(MODULO_IX + 9);
						return;
					}
//					if (flagmuestra==1 && funcionamiento <= 2016 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
//						esArrastre = true;
//						nextFragment(MODULO_IX + 9);
//						return;
//					} 
				}
			}
			

			
			if (prevPage == MODULO_IX + 1 && position == MODULO_IX + 2) {  //902 a 903
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null) {
					Integer codigo = Integer.parseInt(caratula.ciiu_cd.toString().substring(0, 2));
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					if ( /* flagmuestra==1 && funcionamiento<=2016 && */ (codigo >= 10 && codigo <= 33) || (codigo == 41 || codigo == 42 )) {
						debeGrabar = false;
						nextFragment(MODULO_IX + 3);
						return;
					}
//					if (flagmuestra==1 && funcionamiento<=2016 && ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
//						debeGrabar = false;
//						nextFragment(MODULO_IX + 3);
//						return;
//					} 
				}
			}
			
			if (prevPage == MODULO_IX  && position == MODULO_IX + 1) {  //901 a 902
				Caratula caratula = App.getInstance().getEmpresa();
				if (caratula != null) {
					Integer codigo = Integer.parseInt(caratula.ciiu_cd.toString().substring(0, 2));
					int flagmuestra = Util.getInt( App.getInstance().getMarco().flag,0); 
					int funcionamiento = Util.getInt(caratula.funcionamiento.toString(),0);
					if ( /*flagmuestra==1 && funcionamiento<=2016 && */ ((codigo<10 || (codigo>33 && codigo!=41 && codigo!=42)))) {
						debeGrabar = false;
						nextFragment(MODULO_IX + 2);
						return;
					} 
				}
			}
	
			
			/* ###################### INICIO FIN ###################### */

			if (esArrastre) {
				CuestionarioFragmentActivity.this.pageAdapter.getItem(position)
						.cargarDatos();
				Filtros.clear();
			}
			CuestionarioFragmentActivity.this.esSalto = false;
			refreshSubTitle();
		}
	}

	public Modulov01 JumP2_17() {
		Modulov01 bean = getCuestionarioService().getModulov01(
				App.getInstance().getEmpresa(),
				new Modulov01().getSecCap(Util.getListList("M5P002_3",
						"M5P001_1A", "M5P001_2A")));
		if (bean == null) {
			bean = new Modulov01();
		}
		bean.id = App.getInstance().getEmpresa().id;

		return bean;
	}

	public Modulov01 JumP6_16() {
		Modulov01 bean = getCuestionarioService().getModulov01(
				App.getInstance().getEmpresa(),
				new Modulov01().getSecCap(Util.getListList("M5P006_1",
						"M5P006_3")));
		if (bean == null) {
			bean = new Modulov01();
		}
		bean.id = App.getInstance().getEmpresa().id;

		return bean;
	}

	public void uploadData() {
		action = PROCCES.DATA;
		DialogComponent dialog = new DialogComponent(this, this,
				TIPO_DIALOGO.YES_NO, getResources()
						.getString(R.string.app_name),
				"Desea importar archivos de respaldo?");
		dialog.showDialog();
	}

	public void uploadMarco() {
		action = PROCCES.MARCO;
		DialogComponent dialog = new DialogComponent(this, this,
				TIPO_DIALOGO.YES_NO, getResources()
						.getString(R.string.app_name),
				"Desea importar archivos de marco?");
		dialog.showDialog();
	}

	public void ajustarAccion() {
		action = PROCCES.AJUSTE;
		// FragmentManager fm = this.getSupportFragmentManager();
		// AjustarAccion aperturaDialog = AjustarAccion
		// .newInstance(pageAdapter.getItem(getCurPage()),
		// getCuestionarioService());
		// aperturaDialog.setAncho(LinearLayout.LayoutParams.MATCH_PARENT);
		// aperturaDialog.show(fm, "aperturaDialog");
	}

	public void calificar() {

		action = PROCCES.CALIFICAR;
		DialogComponent dialog = new DialogComponent(this, this,
				TIPO_DIALOGO.YES_NO, getResources()
						.getString(R.string.app_name),
				"Desea Calificar Prácticas?");
		dialog.showDialog();
	}

	@Override
	public void onCancel() {
		action = null;
	}

	@Override
	public void onAccept() {
		Intent intent = new Intent(this, FileSelectionActivity.class);
		String ruta = App.RUTA_BASE;
		if (action == PROCCES.MARCO) {
			ruta += "/config";
			File directorio = new File(ruta);
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			intent.putExtra(FileSelectionActivity.START_FOLDER, ruta);
			intent.putExtra("FILTER_EXTENSION", new String[] { "cfg", "zip" });
			startActivityForResult(intent, REQUEST_CODE_PICK_MARCO);
		} else if (action == PROCCES.DATA) {
			ruta += "/backups";
			File directorio = new File(ruta);
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			intent.putExtra(FileSelectionActivity.START_FOLDER, ruta);
			intent.putExtra("FILTER_EXTENSION", new String[] { "xml", "zip" });
			startActivityForResult(intent, REQUEST_CODE_PICK_IMPORT);
		} else if (action == PROCCES.CALIFICAR) {
			ruta += "/practicas";
			File directorio = new File(ruta);
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			intent.putExtra(FileSelectionActivity.START_FOLDER, ruta);
			intent.putExtra("FILTER_EXTENSION", new String[] { "xml", "zip" });
			startActivityForResult(intent, REQUEST_CODE_CALIFICAR);
		}
		action = null;
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode != RESULT_OK)
			return;
		ArrayList<File> files = (ArrayList<File>) data
				.getSerializableExtra(FileSelectionActivity.FILES_TO_UPLOAD);
		if (files != null && files.size() == 0) {
			ToastMessage.msgBox(this,
					"Ning\u00fan archivo ha sido seleccionado",
					ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
		}

		Log.e(TAG, "REQUEST_CODE:" + requestCode);
		if (requestCode == REQUEST_CODE_PICK_MARCO) {
			importar(files);
		} else if (requestCode == REQUEST_CODE_PICK_IMPORT) {
			importar(files);
		} else if (requestCode == REQUEST_CODE_PICK_GPX_TRACK_MARCO) {
			if (fragments.get(MARCO) == null) {
				return;
			}
			fragments.get(MARCO)
					.onActivityResult(requestCode, resultCode, data);
		} else if (requestCode == REQUEST_CODE_PICK_GPX_TRACK_CCCP) {
			if (fragments.get(CENTROS_POBLADOS) == null) {
				return;
			}
			fragments.get(CENTROS_POBLADOS).onActivityResult(requestCode,
					resultCode, data);
		}
	}

	private void importar(ArrayList<File> archivos) {
		DialogComponent dlg = new DialogComponent(this, this,
				DialogComponent.TIPO_DIALOGO.NEUTRAL, getResources().getString(
						R.string.app_name), "Seleccione algún item.");
		if (archivos.size() == 0) {
			dlg.showDialog();
			return;
		}
		Importacion r = new Importacion(this, "Importando información. ");
		r.setArchivos(archivos);
		r.execute();
	}

	private CuestionarioService getCuestionarioService() {
		if (cuestionarioService == null) {
			cuestionarioService = CuestionarioService.getInstance(this);
		}
		return cuestionarioService;
	}

	private ImpExpService getImpExpService() {
		if (impExpService == null) {
			impExpService = ImpExpService.getInstance(this);
		}
		return impExpService;
	}

	@Override
	public void update(Observable observable, Object data) {

	}

	@Override
	public String getTitle(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFieldSave(int page) {
		if (page >= MODULO_I && page < MODULO_II) {
			return "C1_OBS";
		} else if (page >= MODULO_II && page < MODULO_III) {
			return "C2_OBS";
		} else if (page >= MODULO_III && page < MODULO_IV) {
			return "C3_OBS";
		} else if (page >= MODULO_IV && page < MODULO_V) {
			return "C4_OBS";
		} else if (page >= MODULO_V && page < MODULO_VI) {
			return "C5_OBS";
		} else if (page >= MODULO_VI && page < MODULO_VII) {
			return "C6_OBS";
		} else if (page >= MODULO_VII && page < MODULO_VIII) {
			return "C7_OBS";
		} else if (page >= MODULO_VIII && page < MODULO_IX) {
			return "C8_OBS";
		} else if (page >= MODULO_IX && page < MODULO_IX_DET) {
			return "C9A_OBS";
		} else if (page >= MODULO_IX_DET) {
			return "C9B_OBS";
		}
		return null;
	}

	@Override
	public Entity getBean(int page) {
		if ((page >= MODULO_III && page < MODULO_IV) || page >= MODULO_IX)
			return App.getInstance().getEmpresa();
		return ((FragmentForm) pageAdapter.getItem(page)).getEntity();
	}

	@Override
	public boolean setSave(Entity bean, List<String> fields, int page)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void showServicio() {
		Intent intent=null;
		
    }
	@Override
    protected void onPause() {
	//	showServicio();
        super.onPause();
    }

}
package gob.inei.ene2019v2.activity;

import gob.inei.dnce.adapter.MyFragmentPagerAdapter;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.DialogComponent.TIPO_DIALOGO;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.FragmentViewPager;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.components.ToastMessage;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.dnce.util.Util;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.adapter.MyDrawerAdapter;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.ExportacionFragment;
//import gob.inei.ene2019v2.fragment.ExportacionFragment;
//import gob.inei.ene2019v2.fragment.ExportacionFragment1;
import gob.inei.ene2019v2.listener.MyNavigationClickListener;
//import gob.inei.ene2019v2.model.Permiso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class ExportacionFragmentActivity extends MasterActivity implements ActionBar.TabListener, Respondible {

	private enum PROCCES{MARCO, DATA}
	private static int REQUEST_CODE_PICK_MARCO = 1;
	private static int REQUEST_CODE_PICK_IMPORT = 2;
	private PROCCES action = null;
    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
	private DrawerLayout drawerLayout;
	private ListView drawerList;
	private ActionBarDrawerToggle drawerToggle;
	private Vector<String> opcionesMenu = new Vector<String>();
    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
	private static String TAG = "ExportacionFragmentActivity";
	private static String TITULO = "";
	
	SharedPreferences preferencias;
	SharedPreferences.Editor editor;

	private static String PREFERENCIAS = "preferencias";
    private CharSequence mTitle;
    private List<FragmentForm> forms;
//    private static String EXPORTACION = "";
    
    public static Context baseContext;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        TAG = this.getClass().toString();
//        EXPORTACION = this.getIntent().getExtras().getString("Exportacion");
        setContentView(R.layout.activity_principal);
        mTitle = getTitle();    
        preferencias = this.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);
		editor = preferencias.edit();
		forms = createFragments();
        pageAdapter = new MyFragmentPagerAdapter(this, forms);
        viewPager = (FragmentViewPager) findViewById(R.id.pagerPrincipal);
        viewPager.setAdapter(pageAdapter);
        viewPager.setFragments(forms);
        ExportacionRuralSimpleOnPageChangeListener viewPagerListener = new ExportacionRuralSimpleOnPageChangeListener();
        viewPager.setOnPageChangeListener(viewPagerListener);
        for (String s : getResources().getStringArray(R.array.drawer_array)) {
			opcionesMenu.add(s);
		}
        if (App.getInstance().getUsuario().cargo_id != 25) {
			opcionesMenu.remove(opcionesMenu.size()-1);
		}
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_principal_layout);
		drawerList = (ListView) findViewById(R.id.left_principal_drawer);
		drawerLayout.setDrawerShadow(R.drawable.drawer_shadow,GravityCompat.START);
		drawerList.setAdapter(new MyDrawerAdapter(opcionesMenu, this));
		drawerList.setOnItemClickListener(new MyNavigationClickListener(this, 2, drawerList, drawerLayout));
		final ActionBar actionBar = getActionBar();
		drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
				R.drawable.ic_navigation_drawer, R.string.navigation_drawer_open,
				R.string.navigation_drawer_close) {

			public void onDrawerClosed(View view) {
				getActionBar().setTitle(R.string.app_name);
				ActivityCompat.invalidateOptionsMenu(ExportacionFragmentActivity.this);
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle("Menu");
				ActivityCompat.invalidateOptionsMenu(ExportacionFragmentActivity.this);
			}
		};
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		drawerLayout.setDrawerListener(drawerToggle);

		if (savedInstanceState != null) {
			actionBar.setSelectedNavigationItem(savedInstanceState.getInt("tab", 1));
		}
		
		String ruta = App.getInstance().getUsuario().ruta == null ? "" : " - " + App.getInstance().getUsuario().ruta;
		actionBar.setSubtitle(Util.getText(App.getInstance().getUsuario().usuario, "") +" ["+Util.getText(App.getInstance().getUsuario().equipo,"") + ruta +"]");
    }
    
    public static final int MARCO = 0;    
    public static final int VIVIENDAS = 1;

    private List<FragmentForm> createFragments() {
		List<FragmentForm> fragments = new ArrayList<FragmentForm>();		
		/*0*/ fragments.add(new ExportacionFragment());			
		return fragments;
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
		return super.onPrepareOptionsMenu(menu);
	}
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		getMenuInflater().inflate(R.menu.principal, menu);
//		// restoreActionBar();
//		// ToastMessage.msgBox(this, "Grabo", ToastMessage.MESSAGE_INFO,
//		// ToastMessage.DURATION_LONG);
//		if (App.getInstance().getUsuario() == null) {
//			menu.getItem(2).setVisible(false);	
//		} else {
//			if (!Permiso.tieneAcceso(App.getInstance().getUsuario().permisos, Permiso.CAMBIAR_DE_DNI)) {
//				menu.getItem(2).setVisible(false);
//			}
//		}
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
//		if (id == R.id.action_cambiar_dni) {
//			FragmentManager fm = this.getSupportFragmentManager();
//			CambiarDNIDialog dialog = CambiarDNIDialog.newInstance(this);
//			dialog.show(fm, "dniDialog");			
//		}
        return super.onOptionsItemSelected(item);
    }    
    
    @Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			new AlertDialog.Builder(this)
		        .setIcon(android.R.drawable.ic_dialog_alert)
		        .setTitle("Salir")
		        .setMessage("Esta a punto de salir de la aplicaci\u00f3n, se perder\u00e1 todo aquello que no haya guardado. \u00bfEsta seguro que desea salir del sistema?")
		        .setPositiveButton("Si", new DialogInterface.OnClickListener(){
			        @Override
			        public void onClick(DialogInterface dialog, int which) {
			        	finish();
			        }
			    })
			    .setNegativeButton("No", null)
			    .show();
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
		outState.putInt("tab", getActionBar().getSelectedNavigationIndex());
	}
	
	private class ExportacionRuralSimpleOnPageChangeListener extends FragmentViewPager.SimpleOnPageChangeListener {		
		@Override
		public void onPageScrollStateChanged(int state) {
			if (state == ViewPager.SCROLL_STATE_DRAGGING) {
				ExportacionFragmentActivity.this.setPrevPage(viewPager.getCurrentItem());
				esArrastre = true;
			}
			super.onPageScrollStateChanged(state);
    	}
    	
    	@Override
		public void onPageSelected(int position) {
    		ExportacionFragmentActivity.this.setCurPage(position);
    		if (position > MARCO) {
    			esArrastre = false;
    			nextFragment(ExportacionFragmentActivity.this.getPrevPage());
    			return;
			}    		
    		boolean flag = false;
    		if (ExportacionFragmentActivity.this.getPrevPage() < ExportacionFragmentActivity.this.getCurPage()) {
        		flag = ExportacionFragmentActivity.this.pageAdapter.getItem(ExportacionFragmentActivity.this.getPrevPage()).grabar();
        		if (!flag) {
        			esArrastre = false;
        			nextFragment(ExportacionFragmentActivity.this.getPrevPage());
        			return;
				}
        		esArrastre = true;
			}
    		if (esArrastre) {
        		ExportacionFragmentActivity.this.pageAdapter.getItem(ExportacionFragmentActivity.this.getCurPage()).cargarDatos();
			}
    		esSalto = false;    		
    	}
	}

	@Override
	public void uploadData() {
		action = PROCCES.DATA;
		DialogComponent dialog = new DialogComponent(this, this, 
				TIPO_DIALOGO.YES_NO, getResources().getString(R.string.app_name), 
				"Desea importar archivos de respaldo?");
		dialog.showDialog();
    }
	
	@Override
	public void uploadMarco() {
		action = PROCCES.MARCO;
		DialogComponent dialog = new DialogComponent(this, this, 
				TIPO_DIALOGO.YES_NO, getResources().getString(R.string.app_name), 
				"Desea importar archivos de marco?");
		dialog.showDialog();
	}

	@Override
	public void calificar() {
		
	}

	@Override
	public void onCancel() {
		action = null;
	}

	@Override
	public void onAccept() {
		Intent intent = new Intent(this, FileSelectionActivity.class);
		if (action == null) {
			ToastMessage.msgBox(this, "Operacion no definida", ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
			return;
		}
		String ruta = App.RUTA_BASE;
		if (action == PROCCES.MARCO) {
			ruta += "/config";
			File directorio = new File(ruta);
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			intent.putExtra(FileSelectionActivity.START_FOLDER, ruta);
			intent.putExtra("FILTER_EXTENSION", new String[]{"cfg","zip"});
			startActivityForResult(intent, REQUEST_CODE_PICK_MARCO);
		} else if (action == PROCCES.DATA) {
			ruta += "/backups";
			File directorio = new File(ruta);
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			intent.putExtra(FileSelectionActivity.START_FOLDER, ruta);
			intent.putExtra("FILTER_EXTENSION", new String[]{"xml","zip"});
			startActivityForResult(intent, REQUEST_CODE_PICK_IMPORT);
		}	 
		action = null;
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	if( resultCode != RESULT_OK) return;
    	if (requestCode != REQUEST_CODE_PICK_MARCO && requestCode != REQUEST_CODE_PICK_MARCO) {
            if (forms != null) {
                for (FragmentForm fragment : forms) {
                    fragment.onActivityResult(requestCode, resultCode, data);
                }
            }
            return;
		}
    	ArrayList<File> files = (ArrayList<File>) data.getSerializableExtra(FileSelectionActivity.FILES_TO_UPLOAD);    	
    	if( files != null && files.size()==0 ){
        	ToastMessage.msgBox(this, "Ning\u00fan archivo ha sido seleccionado", ToastMessage.MESSAGE_ERROR, ToastMessage.DURATION_LONG);
        }    	
        if( requestCode == REQUEST_CODE_PICK_MARCO ){
            importar(files);
        } else if( requestCode == REQUEST_CODE_PICK_IMPORT ){
        	importar(files);
        }
    }
	
	private void importar(ArrayList<File> archivos) {
		DialogComponent dlg = new DialogComponent(this, this, DialogComponent.TIPO_DIALOGO.NEUTRAL, 
				getResources().getString(R.string.app_name), "Seleccione algún item.");
		if (archivos.size() == 0) {
			dlg.showDialog();
			return;
		}
	}
}

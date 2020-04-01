package gob.inei.ene2019v2.activity;

import gob.inei.dnce.adapter.MyFragmentPagerAdapter;
import gob.inei.dnce.components.DialogComponent;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.components.FragmentViewPager;
import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.interfaces.Respondible;
import gob.inei.ene2019v2.R;
import gob.inei.ene2019v2.adapter.MyDrawerAdapter;
import gob.inei.ene2019v2.common.App;
import gob.inei.ene2019v2.fragment.CalificacionFragment;
import gob.inei.ene2019v2.listener.MyNavigationClickListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
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

public class CalificacionFragmentActivity extends MasterActivity implements ActionBar.TabListener, Respondible {

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
//	public static int prevPage = -1;
//	public static int currentPage = 0;
	private static String TAG = "ImportacionFragmentActivity";
//	   private List<FragmentForm> forms;
	SharedPreferences preferencias;
	SharedPreferences.Editor editor;
//	private static int REQUEST_CODE_PICK_MARCO = 1;
//	private static int REQUEST_CODE_PICK_IMPORT = 2;
	private static String PREFERENCIAS = "preferencias";
    private CharSequence mTitle;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().toString();
        setContentView(R.layout.activity_principal);
        mTitle = getTitle();    
        preferencias = this.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);
		editor = preferencias.edit();
		List<FragmentForm> forms = createFragments();
        pageAdapter = new MyFragmentPagerAdapter(this, forms);
        viewPager = (FragmentViewPager) findViewById(R.id.pagerPrincipal);
        viewPager.setAdapter(pageAdapter);
        viewPager.setFragments(forms);
        PrincipalSimpleOnPageChangeListener viewPagerListener = new PrincipalSimpleOnPageChangeListener();
        viewPager.setOnPageChangeListener(viewPagerListener);
        for (String s : getResources().getStringArray(R.array.drawer_array)) {
			opcionesMenu.add(s);
		}
        if (App.getInstance().getUsuario().cargo_id != 3) {
			opcionesMenu.remove(opcionesMenu.size()-1);
		}
        
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_principal_layout);
		drawerList = (ListView) findViewById(R.id.left_principal_drawer);
		drawerLayout.setDrawerShadow(R.drawable.drawer_shadow,GravityCompat.START);
		drawerList.setAdapter(new MyDrawerAdapter(opcionesMenu, this));
//		drawerList.setOnItemClickListener(new MyNavigationClickListener(this, 5, drawerList, drawerLayout));
		navigationClickListener = new MyNavigationClickListener(this, 7,
				drawerList, drawerLayout);
		drawerList.setOnItemClickListener(navigationClickListener);

		
		final ActionBar actionBar = getActionBar();
		drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
				R.drawable.ic_navigation_drawer, R.string.navigation_drawer_open,
				R.string.navigation_drawer_close) {

			public void onDrawerClosed(View view) {
				getActionBar().setTitle(R.string.app_name);
				ActivityCompat.invalidateOptionsMenu(CalificacionFragmentActivity.this);
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle("Menu");
				ActivityCompat.invalidateOptionsMenu(CalificacionFragmentActivity.this);
			}
		};
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		drawerLayout.setDrawerListener(drawerToggle);

		if (savedInstanceState != null) {
			actionBar.setSelectedNavigationItem(savedInstanceState.getInt("tab", 1));
		}
    }
    
    public static final int CALIFICACION = 0;

    private List<FragmentForm> createFragments() {
		List<FragmentForm> fragments = new ArrayList<FragmentForm>();		
		/*01*/ fragments.add(new CalificacionFragment());
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
//		if (menuAbierto)
//			menu.findItem(R.id.menu_info).setVisible(false);
//		else
//			menu.findItem(R.id.menu_info).setVisible(true);
		return super.onPrepareOptionsMenu(menu);
	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.principal, menu);
//        restoreActionBar();
//        ToastMessage.msgBox(this, "Grabo", ToastMessage.MESSAGE_INFO, ToastMessage.DURATION_LONG);
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
//        int id = item.getItemId();
//        if (id == R.id.action_ir_marco) {
//        	grabarYContinuar(MARCO);
//        } else if (id == R.id.action_ir_visitas) {
//        	grabarYContinuar(VISITAS);
//        } else if (id == R.id.action_grabar) {
//        	grabarYContinuar();
//        } 
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
		// super.onSaveInstanceState(outState);
		outState.putInt("tab", getActionBar().getSelectedNavigationIndex());
	}
	
	private class PrincipalSimpleOnPageChangeListener extends FragmentViewPager.SimpleOnPageChangeListener {		
		
//		private int prevPage;
		
		@Override
		public void onPageScrollStateChanged(int state) {
			if (state == ViewPager.SCROLL_STATE_DRAGGING) {
				CalificacionFragmentActivity.this.setPrevPage(viewPager.getCurrentItem());
				esArrastre = true;
			}
			super.onPageScrollStateChanged(state);
    	}
    	
    	@Override
		public void onPageSelected(int position) {
    		CalificacionFragmentActivity.this.setCurPage(position);    		
    		boolean flag = false;
    		if (CalificacionFragmentActivity.this.getPrevPage() < CalificacionFragmentActivity.this.getCurPage()) {
        		flag = CalificacionFragmentActivity.this.pageAdapter.getItem(CalificacionFragmentActivity.this.getPrevPage()).grabar();
        		if (!flag) {
        			esArrastre = false;
        			nextFragment(CalificacionFragmentActivity.this.getPrevPage());
        			return;
				}
        		esArrastre = true;
			}
    		if (esArrastre) {
        		CalificacionFragmentActivity.this.pageAdapter.getItem(CalificacionFragmentActivity.this.getCurPage()).cargarDatos();
			}
    		esSalto = false;    		
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
	
	@Override
	public void uploadData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uploadMarco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calificar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAccept() {
		// TODO Auto-generated method stub
		
	}	
}

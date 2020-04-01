package gob.inei.ene2019v2.listener;

import gob.inei.dnce.components.MasterActivity;
import gob.inei.dnce.listeners.NavigationClickListener;
import gob.inei.ene2019v2.activity.CalificacionFragmentActivity;
import gob.inei.ene2019v2.activity.CoberturaFragmentActivity;
import gob.inei.ene2019v2.activity.CuestionarioFragmentActivity;
import gob.inei.ene2019v2.activity.ExportacionFragmentActivity;
//import gob.inei.ene2019v2.fragment.ExportacionFragment;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MyNavigationClickListener extends NavigationClickListener {
	
	public MyNavigationClickListener(MasterActivity activity, int opcionId,
			ListView drawerList, DrawerLayout drawerLayout) {
		super(activity, opcionId, drawerList, drawerLayout);
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		Intent i = null;
		switch (position) {
		case 0:		
			Log.e("entras", "0: "+0);
			i = new Intent(getActivity(), CuestionarioFragmentActivity.class);	
			break;
		case 1:	
			Log.e("entras", "cobertura: "+1);
			i = new Intent(getActivity(), CoberturaFragmentActivity.class);		
			break;	
		case 2: 
			Log.e("entras", "2: "+2);
			i = new Intent(getActivity(), ExportacionFragmentActivity.class);
			break;
		case 3:
			Log.e("entras", "3: "+3);	
			getActivity().uploadData();
			break;
		case 4:
			Log.e("entras", "4: "+4);
			getActivity().uploadMarco();
			break;
		case 5:
			Log.e("entras", "5: "+5);
			i = new Intent(getActivity(), CalificacionFragmentActivity.class);
			break;
			
			
		default:
			i = null;
			break;
		}	
		if (i == null) {
			return;
		}
		getDrawerList().setItemChecked(position, true);
		getDrawerLayout().closeDrawer(getDrawerList());
		if (position != getOpcionId()) {
			getActivity().startActivity(i);		
			getActivity().finish();
		} else {
			getActivity().nextFragment(0);
		}
	}
	
}

package gob.inei.ene2019v2.adapter;

import gob.inei.dnce.adapter.DrawerAdapter;
import gob.inei.ene2019v2.R;

import java.util.Vector;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyDrawerAdapter extends DrawerAdapter {

	public MyDrawerAdapter(Vector<String> lista, Activity actividad) {
		super(lista, actividad);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = actividad.getLayoutInflater();
		View view = inflater
				.inflate(R.layout.elemento_lista_drawer, null, true);

		TextView txtOpcion = (TextView) view.findViewById(R.id.txtDrawer);
		txtOpcion.setText(lista.elementAt(position));
		txtOpcion.setTextSize(19);
		txtOpcion.setTypeface(Typeface.DEFAULT_BOLD);
		txtOpcion.setPadding(7, 3, 7, 3);
		ImageView imgDrawer = (ImageView) view.findViewById(R.id.imgDrawer);
		switch (position) {

		case 0:
			imgDrawer.setImageResource(R.drawable.map48);
			break;
		case 1:
			imgDrawer.setImageResource(R.drawable.marco48);
			break;
		case 2:
			imgDrawer.setImageResource(R.drawable.cobertura48);
			break;
		case 3:
			imgDrawer.setImageResource(R.drawable.cobertura48);
			break;
		case 4:
			imgDrawer.setImageResource(R.drawable.exportar49);
			break;
		case 5:
			imgDrawer.setImageResource(R.drawable.exportar49);
			break;
//		case 6:
//			imgDrawer.setImageResource(R.drawable.exportar49);
//			break;
//		case 8:
//			imgDrawer.setImageResource(R.drawable.configurar48);
//			break;
//		case 9:
//			imgDrawer.setImageResource(R.drawable.importar48);
//			break;
//		case 10:
//			imgDrawer.setImageResource(R.drawable.configurar48);
//			break;
		case 6:
			imgDrawer.setImageResource(R.drawable.evaluacion248);
			break;
		}
		return view;
	}

}
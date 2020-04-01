package gob.inei.ene2019v2.model;

import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.Spinneable;
import gob.inei.ene2019v2.interfaces.Exportable;

public class Ubigeo extends Entity implements Exportable, Spinneable {

	private static final long serialVersionUID = 1L;
	public String ubigeo = null;
	public String ccdd = null;
	public String ccpp = null;
	public String ccdi = null;
	public String departamento = null;
	public String provincia = null;
	public String distrito = null;
	public String estado = null;

	public Ubigeo() {
	}

	@Override
	public String toString() {
		if (ccpp == null && ccdi == null) {
			return ccdd ;
		} else if (ccdi == null) {
			return ccpp;
		} else {
			return ccdi;
		}
	}

	@Override
	public void cleanEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isTitle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCodigoExportacion() {		
		return ubigeo;
	}

	@Override
	public String getDescripcionExportacion() {
		return ccdi != null ? ccdi + " - " + distrito : distrito;
	}

	@Override
	public String getUbigeo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpinnerLabel() {
		if (ccpp == null && ccdi == null) {
			return ccdd != null ? ccdd + " - " + departamento : departamento;
		} else if (ccdi == null) {
			return ccpp != null ? ccpp + " - " + provincia : provincia;
		} else {
			return ccdi != null ? ccdi + " - " + distrito : distrito;
		}
	}
}

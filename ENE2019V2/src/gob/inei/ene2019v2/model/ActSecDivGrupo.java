package gob.inei.ene2019v2.model;

import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class ActSecDivGrupo extends Entity implements IDetailEntityComponent{

	private static final long serialVersionUID = 1L;
	public String seccion = null;
	public String division = null;
	public String grupo = null;
	public String descripcion = null;

	public ActSecDivGrupo() {
	}

	@Override
	public String toString() {
		return seccion;
	}

	@Override
	public boolean isTitle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cleanEntity() {
		// TODO Auto-generated method stub
		
	}
}


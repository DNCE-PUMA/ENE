package gob.inei.ene2019v2.model;

import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class Cobertura extends Entity implements IDetailEntityComponent {
	private static final long serialVersionUID = 1L;
	public String nombre = null;
	public Integer estado = null;
	
	public Cobertura() {
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return nombre;
	}

}

package gob.inei.ene2019v2.model;

import gob.inei.dnce.annotations.FieldEntity;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.Spinneable;

public class Usuario extends Entity implements Spinneable{
	
	private static final long serialVersionUID = 1L;
	public String usuario; 
	public String clave;
	public Integer cargo_id; 
	public String cod_sede_operativa; 
	public String ccdd; 
	public String ccpp; 
	public String ccdi;
	public String equipo; 
	public String ruta;
	
	@FieldEntity(ignoreField=true)
	public Usuario jefeEquipo;
	@FieldEntity(ignoreField=true)
	public Usuario supervisor;
	@FieldEntity(ignoreField=true)
	public Usuario coordinador;
	@FieldEntity(ignoreField=true)
	public Usuario supervisor_nacional;
//	@FieldEntity(ignoreField=true)
//	public List<Permiso> permisos;
	@FieldEntity(ignoreField=true)
	public String dni;
	
	@Override
	public String toString() {
		return usuario;
	}

	@Override
	public boolean isTitle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSpinnerLabel() {
		// TODO Auto-generated method stub
		return usuario != null ? usuario : "" ;
	}
	
}

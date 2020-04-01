package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class ModuloixDet03 extends Entity implements IDetailEntityComponent, Serializable  {

	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;
	
	public Integer c9p903_id = null;
	public String c9p903_2 = null;
	public String c9p903_3 = null;
	@FieldCalificacion(ignoreField = true)
	public String c903_obs = null;
	
	public ModuloixDet03() {
	}

	public ModuloixDet03(Integer id, Integer c9p903_id) {
		this.id = id;
		this.c9p903_id = c9p903_id;
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
	public String getPks() {
		return "ID,C9P903_ID";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
	@Override
	public boolean equalsToPractice(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ModuloixDet03)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}
		if (this.c9p903_id == null) {
			return false;
		}

		ModuloixDet03 other = (ModuloixDet03) obj;
		if (!this.id.equals(other.id) || !this.c9p903_id.equals(other.c9p903_id) ) {
			return false;
		}
		return true;
	}
}

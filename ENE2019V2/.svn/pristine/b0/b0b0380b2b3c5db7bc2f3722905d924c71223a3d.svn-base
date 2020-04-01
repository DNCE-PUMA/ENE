package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class ModuloixDet02 extends Entity implements IDetailEntityComponent , Serializable {

	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;


	public Integer c9p902_id = null;
	public String c9p902_2 = null;
	public String c9p901_4_cod = null;
	public String c9p902_3 = null;
	public Integer c9p902_4 = null;
	public String c9p902_5 = null;
	public String c9p902_6 = null;
	@FieldCalificacion(ignoreField = true)
	public String c902_obs = null;

	public ModuloixDet02() {
	}

	public ModuloixDet02(Integer id, Integer c9p902_id) {
		this.id = id;
		this.c9p902_id = c9p902_id;
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
		return "ID,C9P902_ID";
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
		if (!(obj instanceof ModuloixDet02)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}
		if (this.c9p902_id == null) {
			return false;
		}

		ModuloixDet02 other = (ModuloixDet02) obj;
		if (!this.id.equals(other.id) || !this.c9p902_id.equals(other.c9p902_id) ) {
			return false;
		}
		return true;
	}

}

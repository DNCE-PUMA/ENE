package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class ModuloixDet05 extends Entity implements IDetailEntityComponent, Serializable  {

	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;
	public Integer c9p908_id = null;
	public Integer c9p908_cod = null;
	public Integer c9p908_1 = null;
	public Integer c9p908_2 = null;
	public Integer c9p908_3 = null;
	public Integer c9p908_4 = null;

	public ModuloixDet05() {
	}

	public ModuloixDet05(Integer id, Integer c9p908_id, Integer c9p908_cod) {
		this.id = id;
		this.c9p908_id = c9p908_id;
		this.c9p908_cod = c9p908_cod;
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
		return "ID, C9P908_ID, C9P908_COD";
	}

//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	

	@Override
	public String toString() {
		return "ModuloIX_VIII [c9p908_id=" + c9p908_id + ", c9p908_cod="
				+ c9p908_cod + "]";
	}
	
	@Override
	public boolean equalsToPractice(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ModuloixDet05)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}

		if (this.c9p908_id == null) {
			return false;
		}
		
		if (this.c9p908_cod == null) {
			return false;
		}
		
		ModuloixDet05 other = (ModuloixDet05) obj;
		if (!this.id.equals(other.id)  || !this.c9p908_id.equals(other.c9p908_id)  || !this.c9p908_cod.equals(other.c9p908_cod)  ) {
			return false;
		}
		return true;
	}
	
}

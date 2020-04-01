package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class ModuloixDet04 extends Entity implements IDetailEntityComponent, Serializable  {

	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;
	public Integer c9p907_id = null;
	public Integer c9p907_cod = null;
	public Integer c9p907_1 = null;
	public Integer c9p907_2 = null;
	public Integer c9p907_3 = null;
	public Integer c9p907_4 = null;
	public Integer c9p907_5 = null;
	
	@FieldCalificacion(ignoreField = true)
	public String c9b_obs = null;
	@FieldCalificacion(ignoreField = true)
	public Integer t_c9a = null;

	public ModuloixDet04() {
	}

	public ModuloixDet04(Integer id, Integer c9p907_id, Integer c9p907_cod) {
		this.id = id;
		this.c9p907_id = c9p907_id;
		this.c9p907_cod = c9p907_cod;
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
		return "ID, C9P907_ID, C9P907_COD";
	}

	@Override
	public String toString() {
		return "ModuloIX_VIII [c9p907_id=" + c9p907_id + ", c9p907_cod="
				+ c9p907_cod + "]";
	}
	@Override
	public boolean equalsToPractice(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ModuloixDet04)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}
		if (this.c9p907_id == null) {
			return false;
		}

		if (this.c9p907_cod == null) {
			return false;
		}
		
		ModuloixDet04 other = (ModuloixDet04) obj;
		if (!this.id.equals(other.id)  || !this.c9p907_id.equals(other.c9p907_id)  || !this.c9p907_cod.equals(other.c9p907_cod)  ) {
			return false;
		}
		return true;
	}
}

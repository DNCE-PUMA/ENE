package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class Moduloiii01 extends Entity implements IDetailEntityComponent, Serializable  { 
	
	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;
	public Integer c3p301 = null;
	public Integer c3p301_omi = null;
	public Integer c3p302_1 = null;
	public Integer c3p302_2 = null;
	public Integer c3p302_3 = null;
	public Integer c3p302_4 = null;
	public Integer c3p302_5 = null;
	public Integer c3p302_6 = null;
	public Integer c3p302_7 = null;
	public Integer c3p302a_1 = null;
	public Integer c3p302a_2 = null;
	public Integer c3p302a_3 = null;
	public Integer c3p302a_4 = null;
	public Integer c3p302a_5 = null;
	public Integer c3p302a_6 = null;
	public Integer c3p302a_7 = null;
	public Integer c3p302a_8 = null;
	public Integer c3p302b_1 = null;
	public Integer c3p302b_2 = null;
	public Integer c3p302b_3 = null;
	public Integer c3p302b_4 = null;
	public Integer c3p302b_5 = null;
	public Integer c3p302b_6 = null;
	public Integer c3p302b_7 = null;
	public Integer c3p302b_8 = null;
	public Integer c3p302c_1 = null;
	public Integer c3p302c_2 = null;
	public Integer c3p302c_3 = null;
	public Integer c3p302c_4 = null;
	public Integer c3p302c_5 = null;
	public Integer c3p302c_6 = null;
	public Integer c3p302c_7 = null;
	public Integer c3p302c_8 = null;	
	
	public Integer c3p302a_a1 = null;
	public Integer c3p302a_a2 = null;
	public Integer c3p302a_a3 = null;
	public Integer c3p302a_a4 = null;
	public Integer c3p302a_a5 = null;
	public Integer c3p302a_a6 = null;
	public String c3p302a_a6esp = null;
	public Integer c3p302_omi = null;
	public Integer c3p303 = null;
//	public Integer c3p303_2 = null;
//	public Integer c3p303_3 = null;
	
	public Integer c3p303_a_1 = null;
	public Integer c3p303_a_2 = null;
	public Integer c3p303_a_3 = null;
	public Integer  c3p303_t= null; 
	public Integer c3p308_1 = null;
	public Integer c3p308_2 = null;
	public Integer c3p308_3 = null;
	public Integer c3p308_4 = null;
	public Integer c3p308_5 = null;
	public String c3p308_5esp = null;
	public Integer c3p308_6 = null;
	public Integer c3p310_1 = null;
	public Integer c3p310_2 = null;
	public Integer c3p310_3 = null;
	public Integer c3p310_4 = null;
	public Integer c3p310_5 = null;
	public Integer c3p310_6 = null;
	public Integer c3p310_7 = null;
	public Integer c3p310_8 = null;
	public String c3p310_8esp = null;
	public Integer c3p310_9 = null;
	public Integer c3p311_1 = null;
	public Integer c3p311_2 = null;
	public Integer c3p311_3 = null;
	public Integer c3p311_4 = null;
	public Integer c3p311_5 = null;
	public Integer c3p311_6 = null;
	public Integer c3p311_7 = null;
	public Integer c3p311_8 = null;
	public Integer c3p311_9 = null;
	public String c3p311_9esp = null;
	public Integer c3p312 = null;
	public Integer c3p314_1 = null;
	public Integer c3p314_2 = null;
	public Integer c3p314_3 = null;
	public Integer c3p314_4 = null;
	public Integer c3p314_5 = null;
	public Integer c3p314_6 = null;
	public Integer c3p314_7 = null;
	public Integer c3p314_8 = null;
	public Integer c3p314_9 = null;
	public Integer c3p314_10 = null;
	public Integer c3p314_11 = null;
	public String c3p314_11esp = null;
	public Integer c3p314_12 = null;
	public Integer c3p314a_1 = null;
	public Integer c3p314a_2 = null;
	public Integer c3p314a_3 = null;
	public Integer c3p314a_4 = null;
	public Integer c3p314a_5 = null;
	public Integer c3p314a_6 = null;
	public Integer c3p314a_7 = null;
	public String c3p314a_7esp = null;
	public Integer c3p314a_8 = null;
	
    public Moduloiii01() {} 
	
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
		return "ID";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moduloiii01 other = (Moduloiii01) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public boolean equalsToPractice(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Moduloiii01)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}

		Moduloiii01 other = (Moduloiii01) obj;
		if (!this.id.equals(other.id) ) {
			return false;
		}
		return true;
	}
} 
package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class Modulov01 extends Entity implements IDetailEntityComponent , Serializable { 

	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;
	
	public Integer c5p501_1a = null;
	public Integer c5p501_1b = null;
	public Integer c5p501_1c = null;
	public Integer c5p501_2a = null;
	public Integer c5p501_2b = null;
	public Integer c5p501_2c = null;
	public Integer c5p501_3a = null;
	public Integer c5p501_3b = null;
	public Integer c5p501_3c = null;
	public Integer c5p501_4a = null;
	public Integer c5p501_4b = null;
	public Integer c5p501_4c = null;
	public Integer c5p501_5a = null;
	public Integer c5p501_5b = null;
	public Integer c5p501_5c = null;
	public Integer c5p501_6a = null;
	public Integer c5p501_6b = null;
	public Integer c5p501_6c = null;
	public Integer c5p501_7a = null;
	public Integer c5p501_7b = null;
	public Integer c5p501_7c = null;
	public Integer c5p501_8a = null;
	public String c5p501_8a_esp = null;
	public Integer c5p501_8b = null;
	public Integer c5p501_8c = null;
	public Integer c5p502 = null;
	public Integer c5p503_1 = null;
	public Integer c5p503_2 = null;
	public Integer c5p503_3 = null;
	public Integer c5p503_4 = null;
	
	public Integer c5p504_1 = null;
	public Integer c5p504_2 = null;
	public Integer c5p504_3 = null;
	public Integer c5p504_4 = null;
	public Integer c5p504_5 = null;
	public Integer c5p504_6 = null;
	public String c5p504_6esp = null;
	
	public Integer c5p505 = null;
	
	public Integer c5p508 = null;
	public Integer c5p509_1 = null;
	public Integer c5p509_3 = null;
	public Integer c5p509_4 = null;
	public Integer c5p509_5 = null;
	public Integer c5p509_7 = null;
	public String c5p509_7esp = null;	
	
	public Integer c5p511_1 = null;
	public Integer c5p511_2 = null;
	public Integer c5p511_3 = null;
	public Integer c5p511_4 = null;
	public Integer c5p511_5 = null;
	public Integer c5p511_6 = null;
	public Integer c5p511_7 = null;
	public Integer c5p511_8 = null;
	public Integer c5p511_9 = null;
	public String c5p511_9esp = null;
	public Integer c5p511_10 = null;
    public Modulov01() {} 
	
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
		Modulov01 other = (Modulov01) obj;
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
		if (!(obj instanceof Modulov01)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}

		Modulov01 other = (Modulov01) obj;
		if (!this.id.equals(other.id) ) {
			return false;
		}
		return true;
	}
} 

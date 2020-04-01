package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class Moduloii extends Entity implements IDetailEntityComponent , Serializable { 
	
	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;
	public Integer c2p201 = null;
	 public Integer c2p202 = null;
	 public String c2p202_esp_a = null;
	 public Integer c2p203_1 = null;
	 public Integer c2p203_2 = null;
	 public Integer c2p203_3 = null;
	 public Integer c2p204 = null;
	 public String c2p204_esp = null;
	 public Integer c2p205 = null;
	 public Integer c2p206 = null;
	 public String c2p206_esp = null;
	 public Integer c2p207 = null;
	 public Integer c2p208 = null;
	 public String c2p208_esp = null;
	 public Integer c2p209 = null;
	 public Integer c2p209a = null;
	 public String c2p209a_esp  = null;
	 public Integer c2p210 = null;
	 public Integer c2p212 = null;
	 public String c2p212_esp = null;
	 public Integer c2p217 = null;
	 public Integer c2p219 = null;
	 public String c2p219_esp = null;
	 public Integer c2p221_1 = null;
	 public Integer c2p221_2 = null;
	 public Integer c2p221_3 = null;
	 public Integer c2p221_4 = null;
	 public Integer c2p221_5 = null;
	 public Integer c2p221_6 = null;
	 public Integer c2p221_7 = null;
	 public Integer c2p221_8 = null;
	 public Integer c2p221_9 = null;
	 public String c2p221_9esp = null;
	 public Integer c2p221_10 = null;
	 public Integer c2p222 = null;
	 @FieldCalificacion(ignoreField = true)
	 public String c2_obs = null;
	 @FieldCalificacion(ignoreField = true)
	 public Integer t_c2 = null;
    
    public Moduloii() {} 
	
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
		Moduloii other = (Moduloii) obj;
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
		if (!(obj instanceof Moduloii)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}

		Moduloii other = (Moduloii) obj;
		if (!this.id.equals(other.id) ) {
			return false;
		}
		return true;
	}
} 
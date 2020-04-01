package gob.inei.ene2019v2.model;

import java.io.Serializable;

import gob.inei.dnce.annotations.FieldCalificacion;
import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;

public class Moduloviii extends Entity implements IDetailEntityComponent , Serializable {

	@FieldCalificacion(ignoreField = true)
	private static final long serialVersionUID = 1L;
	public Integer c8p801 = null;
	public Integer c8p804_1 = null;
	public Integer c8p804_2 = null;
	public Integer c8p804_n = null;
	public Integer c8p806 = null;
	public Integer c8p811 = null;
	public Integer c8p812_1 = null;
	public Integer c8p812_1_n = null;
	public Integer c8p812_2 = null;
	public Integer c8p812_2_n = null;
	public Integer c8p812_3 = null;
	public Integer c8p812_3_n = null;
	public Integer c8p812_4 = null;
	public Integer c8p812_4_n = null;
	public Integer c8p812_5 = null;
	public Integer c8p812_5_n = null;
	public Integer c8p814 = null;
	public Integer c8p815 = null;
	public Integer c8p816 = null;
	public String c8p816_esp = null;
	public Integer c8p817_1 = null;
	public Integer c8p817_1_n = null;
	public Integer c8p817_2 = null;
	public Integer c8p817_2_n = null;
	public Integer c8p817_3 = null;
	public Integer c8p817_3_n = null;
	
	public Integer c8p822_1 = null;
	public Integer c8p822_1_n = null;
	public Integer c8p822_2 = null;
	public Integer c8p822_2_n = null;
	public Integer c8p822_3 = null;
	public Integer c8p822_3_n = null;
	public Integer c8p822_4 = null;
	public Integer c8p822_4_n = null;
	public Integer c8p827 = null;
	public Integer c8p830 = null;
	public Integer c8p834a = null;
	public Integer c8p835_1 = null;
	public Integer c8p835_1_n = null;
	public Integer c8p835_2 = null;
	public Integer c8p835_2_n = null;
	public Integer c8p839 = null;
	public Integer c8p840 = null;
	public Integer c8p841 = null;
	public String c8p841_esp = null;
	public Integer c8p844 = null;	
	
	public Integer c8p845 = null;
	public Integer c8p845_2 = null;
	
	public Integer c8p846_1 = null;
	public Integer c8p846_2 = null;
	public Integer c8p846_3 = null;
	public Integer c8p846_4 = null;
	public Integer c8p846_5 = null;
	public Integer c8p846_6 = null;
	public Integer c8p846_7 = null;
	public Integer c8p846_8 = null;
	public Integer c8p846_9 = null;
	public Integer c8p846_10 = null;
	public Integer c8p846_11 = null;
	public Integer c8p846_12 = null;
	public Integer c8p846_13 = null;
	public Integer c8p846_14 = null;
	public Integer c8p846_15 = null;
	public Integer c8p846_16 = null;
	public Integer c8p846_17 = null;
	public Integer c8p846_18 = null;
	public Integer c8p846_19 = null;
	public Integer c8p846_20 = null;
	public Integer c8p846_21 = null;
	public Integer c8p846_22 = null;
	public Integer c8p846_23 = null;
	public Integer c8p846_24 = null;
	public Integer c8p846_25 = null;
	public Integer c8p846_26 = null;
	public Integer c8p846a_1 = null;
	public Integer c8p846a_2 = null;
	public Integer c8p846a_3 = null;
	public Integer c8p846a_4 = null;
	public Integer c8p846a_5 = null;
	public Integer c8p846a_6 = null;
	public Integer c8p846a_7 = null;
	public Integer c8p846a_8 = null;
	public Integer c8p846a_9 = null;
	public Integer c8p846a_10 = null;
	public Integer c8p846a_11 = null;
	public Integer c8p846a_12 = null;
	public Integer c8p846a_13 = null;
	public Integer c8p846a_14 = null;
	public Integer c8p846a_15 = null;
	public Integer c8p846a_16 = null;
	public Integer c8p846a_17 = null;
	public Integer c8p846a_18 = null;
	public Integer c8p846a_19 = null;
	public Integer c8p846a_20 = null;
	public Integer c8p846a_21 = null;
	public Integer c8p846a_22 = null;
	public Integer c8p846a_23 = null;
	public Integer c8p846a_24 = null;
	public Integer c8p846a_25 = null;
	public Integer c8p846a_26 = null;
	
	@FieldCalificacion(ignoreField = true)
	public String c8_obs = null;
	@FieldCalificacion(ignoreField = true)
	public Integer t_c8 = null;

	public Moduloviii() {
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
		Moduloviii other = (Moduloviii) obj;
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
		if (!(obj instanceof Moduloviii)) {
			return false;
		}
		if (this.id == null) {
			return false;
		}

		Moduloviii other = (Moduloviii) obj;
		if (!this.id.equals(other.id) ) {
			return false;
		}
		return true;
	}
}

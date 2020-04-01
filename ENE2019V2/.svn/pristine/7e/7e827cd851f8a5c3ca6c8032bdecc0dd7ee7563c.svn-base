package gob.inei.ene2019v2.model;

import gob.inei.dnce.components.Entity;
import gob.inei.dnce.interfaces.IDetailEntityComponent;
import gob.inei.dnce.util.Util;
import gob.inei.dnce.util.Util.COMPLETAR;

public class Visita extends Entity implements IDetailEntityComponent { 

	private static final long serialVersionUID = 1L;
	public Integer cv_id = null;
	public Integer cv_fec_dia = null;
	public Integer cv_fec_mes = null;
	public Integer cv_fec_anio = null;
	public Integer cv_fec_hin = null;
	public Integer cv_fec_min = null;
	public Integer cv_fec_hfi = null;
	public Integer cv_fec_mfi = null;
	public Integer cv_prox_dia = null;
	public Integer cv_prox_mes = null;
	public Integer cv_prox_anio = null;
	public Integer cv_prox_hor = null;
	public Integer cv_prox_min = null;
	public Integer cv_resvis = null;
	public String cv_resvis_esp = null;
	public Integer resfec_dia = null;
	public Integer resfec_mes = null;
	public Integer resfec_anio = null;
	public Integer resfin = null;
	public String resfin_esp = null;
	public String enc_dni = null;
	public String end_nom = null;
	public String gps_lat_v = null;
	public String gps_lon_v = null;
    
    public Visita() {} 
    
    public Visita(Integer id, Integer cv_id) {
    	this.id = id;
    	this.cv_id = cv_id;
    }
    
    public String getFechaE(){
		return (cv_fec_dia==null?"__":Util.completarCadena(""+cv_fec_dia, "0", 2, COMPLETAR.IZQUIERDA))+"/"+
				(cv_fec_mes==null?"__":Util.completarCadena(""+cv_fec_mes, "0", 2, COMPLETAR.IZQUIERDA))+"/"+
				(cv_fec_anio==null?"__":cv_fec_anio);
	}
	
	public String getHoraE_from(){
		return (cv_fec_hin==null?"__":Util.completarCadena(""+cv_fec_hin, "0", 2, COMPLETAR.IZQUIERDA))+":"+
				(cv_fec_min==null?"__":Util.completarCadena(""+cv_fec_min, "0", 2, COMPLETAR.IZQUIERDA));
	}
	
	public String getHoraE_to(){
		return (cv_fec_hfi==null?"__":Util.completarCadena(""+cv_fec_hfi, "0", 2, COMPLETAR.IZQUIERDA))+":"+
				(cv_fec_mfi==null?"__":Util.completarCadena(""+cv_fec_mfi, "0", 2, COMPLETAR.IZQUIERDA));
	}
	
	public String getFechaEPV(){
		return (cv_prox_dia==null?"__":Util.completarCadena(""+cv_prox_dia, "0", 2, COMPLETAR.IZQUIERDA))+"/"+
				(cv_prox_mes==null?"__":Util.completarCadena(""+cv_prox_mes, "0", 2, COMPLETAR.IZQUIERDA))+"/"+
				(cv_prox_anio==null?"__":cv_prox_anio);
	}
	
	public String getHoraE_pv(){
		return (cv_prox_hor==null?"__":Util.completarCadena(""+cv_prox_hor, "0", 2, COMPLETAR.IZQUIERDA))+":"+
				(cv_prox_min==null?"__":Util.completarCadena(""+cv_prox_min, "0", 2, COMPLETAR.IZQUIERDA));
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
		return "ID,CV_ID";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
} 

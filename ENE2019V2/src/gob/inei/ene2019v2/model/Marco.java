package gob.inei.ene2019v2.model;

import gob.inei.dnce.components.Entity;
import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.interfaces.IDetailEntityComponent;
import gob.inei.ene2019v2.interfaces.Exportable;

import java.io.Serializable;

public class Marco extends Entity implements IDetailEntityComponent, Serializable, Exportable{
	private static final long serialVersionUID = 1L;
	public String ruc = null;
	public String raz_social_local = null;
	public String ubigeo = null;
	public String ccdd = null; 
	public String nombredd = null;
	public String ccpp = null;
	public String nombrepp = null;
	public String ccdi = null;
	public String nombredi = null;
	public String cccp = null;
	public String nombrecccp = null;
	public String nempresa = null;
	
	public String odei_cd = null;
	public String odei = null;
	public Integer nroestab = null;
	public Integer anio_constitucion = null;
	public Integer anio_apertura = null;
	public String organizacion_legal_cd = null;
	public String organizacion_legal = null;
	public String empresa_estado_cd = null;
	public String empresa_estado = null;
	public String empresa_tipo_cd = null;
	public String empresa_tipo = null;
	public String estado_habido_cd = null;
	public String estado_habido = null;
	public String ciiu_v3 = null;
	public String ciiu_v4 = null;
	public String sector = null;
	public String descr_ciiu = null;
	public String activ_comercio_exterior_cd = null;
	public String activ_comercio_exterior = null;
	public String reg_propiedad_cd = null;
	public String reg_propiedad = null;
	public Integer agregado = null;
	public Integer resfin = null;
	public String zona= null;
	public String mza = null;
	public Integer frente = null;
    public Integer m_tipovia_cd = null;
	public String  m_tipovia= null;
	public String m_nombrevia = null; 
	public String m_puerta = null;
	public String  m_piso = null;
	public String m_interior = null;	
	public String  m_manzana = null;
	public String m_lote = null;	
	public String m_referencia = null;	
	
	public Integer flag = null;
	
	public Marco(){}

	@Override
	public boolean isTitle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getUbigeo() {
		return resfin==null?null:resfin.toString();
	}

	@Override
	public String getCodigoExportacion() {
		return ruc;
	}

	@Override
	public String getDescripcionExportacion() {
		return raz_social_local;
	}

	@Override
	public void cleanEntity() {
		// TODO Auto-generated method stub
		
	}
	
	public static String getFieldsExport(){
		return getFieldsExport(null);
	}
	public static String getFieldsExport(String alias){
		return getFieldsExport(alias, FragmentForm.OPCION.ONE);	
	}
	public static String getFieldsExport(String alias, FragmentForm.OPCION opcion){
		return getFieldsExport(alias, opcion, null);	
	}
	public static String getFieldsExport(String alias, String other){
		return getFieldsExport(alias, FragmentForm.OPCION.ONE, other);	
	}
	public static String getFieldsExport(String alias, FragmentForm.OPCION opcion, String other){
		alias = alias == null?"":alias+".";
		other = other == null?"":","+other;
		switch (opcion) {
			case ONE:
				return alias+"ID,"+alias+"RUC,"+alias+"CCDD,"+alias+"CCPP,"+alias+"CCDI,"+alias+"RAZ_SOCIAL_LOCAL,"+
						alias+"AGREGADO"+other;
			case TWO:
				return alias+"ID,"+alias+"RUC,"+alias+"NOMBREDD,"+alias+"NOMBREPP,"+alias+"NOMBREDI,"+alias+"RAZ_SOCIAL_LOCAL,"+alias+"EMPRESA_TIPO_CD,"+
						alias+"UBIGEO,"+alias+"ANIO_CONSTITUCION,"+alias+"EMPRESA_TIPO,"+
						alias+"CIIU_V3,"+alias+"CIIU_V4,"+alias+"ZONA,"+alias+"MZA,"+alias+"FRENTE,"+alias+"M_TIPOVIA_CD,"+alias+"M_TIPOVIA,"+alias+"M_NOMBREVIA,"+alias+"M_PUERTA,"+alias+"M_PISO,"+alias+"M_INTERIOR,"+alias+"M_MANZANA,"+alias+"M_LOTE,"+alias+"M_REFERENCIA"+other;
			default:
				return alias+"ID,"+alias+"RUC";
		}   
	}
}

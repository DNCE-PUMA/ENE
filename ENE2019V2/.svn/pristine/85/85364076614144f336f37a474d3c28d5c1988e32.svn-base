package gob.inei.ene2019v2.dao;

import gob.inei.dnce.components.FragmentForm;
import gob.inei.dnce.dao.SQLiteDAO;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Equipo;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Periodo;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Ruta;
import gob.inei.ene2019v2.model.Marco;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import android.database.sqlite.SQLiteDatabase;
//import gob.inei.ene2019v2.model.Marco;

public class MarcoDAO extends SQLiteDAO {
	
	public static MarcoDAO INSTANCE;
//	public static final String TABLA_AER = "T_AER";
//	public static final String TABLA_SUBAER = "T_SUBAER";
//	public static final String TABLA_SUBAER_SEGMENTADO = "T_SUBAER_CENTRO_POBLADO";
	public static final String TABLA_MARCO = "T_MARCO";
	public static final String TABLA_CCCP = "T_CENTRO_POBLADO";
	public static final String TABLA_CCCP_FRACCIONADO = "T_CENTRO_POBLADO_FRACCIONADO";
	public static final String TABLA_ZONA = "T_ZONA";
	public static final String TABLA_SUBZONA = "T_SUBZONA";
	public static final String TABLA_CARGA = "T_CARGA";
	public static final String TABLA_RECARGA = "T_REUBICAR_CARGA";
	public static final String VISTA_MAX_CARGA = "V_MAX_CARGA";
	public static final String VISTA_MAX_FICHA = "V_MAX_FICHA";
	public static final String VISTA_MARCO_INFO = "V_MARCO_INFO";
	public static final String TABLA_SUBZONA_SEGMENTADA = "T_SUBZONA_MANZANA";
	public static final String TABLA_MANZANA = "T_MANZANA";
	public static final String TABLA_MANZANA_DETALLE = "T_MANZANA_DETALLE";
	public static final String TABLA_MANZANA_REPLANTEO = "T_MANZANA_REPLANTEADA";
	public static final String TABLA_MANZANA_PROBLEMA = "T_MANZANA_PROBLEMA";
	public static final String TABLA_FRENTE = "T_FRENTE"; 
	public static final String VISTA_FRENTES = "V_FRENTES"; 
	public static final String TABLA_FRENTE_SECUNDARIO = "T_FRENTE_VERTICES"; 
	public static final String V_MANZANA_SEGMENTADA = "V_MANZANAS_SEGMENTADAS";
	public static final String TABLA_PREGUNTA = "T_PREGUNTAS"; 
	public static final String TABLA_ERROR = "T_ERRORES_MANZANAS"; 
	public static final String TABLA_TRACKS = "T_05_DIG_TRACKS"; 

	private MarcoDAO(MyDatabaseHelper dbh) {
		super(dbh);
	}
	
	public static MarcoDAO getInstance(MyDatabaseHelper dbh) {
		if (INSTANCE == null) {
			INSTANCE = new MarcoDAO(dbh);
		}
		return INSTANCE;
	}

	public boolean saveOrUpdate(SQLiteDatabase dbTX, String tableName, Map<String, Object> map, String id) throws SQLException {
		if (id != null) {
			if (map.get(id) == null) {
				int nextID = super.nextID(dbTX, id, tableName, null);
				map.put(id, nextID);
			}
		}
		return super.saveOrUpdate(dbTX, tableName, map, new String[]{"ID"});		
	}
	
	public Map<String, Object> getMaxRegistro(String tableName, String campo, String where, String...whereValues) {
		return super.getMaxMap(tableName, campo, where, whereValues);
	}	
	
	public Map<String, Object> getCountRegistro(String tableName, String campo, String where, String...whereValues) {
		return super.getCountMap(tableName, campo, where, whereValues);
	}	
	
	public List<Marco> getMarco(String codSedeOp, String equipo, String ruta, Integer periodo, FragmentForm.OPCION opcion) {
		StringBuilder query = new StringBuilder();		
		String fields = "", fields1 = "";
		switch (opcion) {
			case ONE: fields = null;break;// EXPORTACION
			case TWO: fields = "u.CCDI, u.DISTRITO AS NOMBREDI, u.CCDD, u.CCPP,"
					+ "u.PROVINCIA AS NOMBREPP, u.DEPARTAMENTO AS NOMBREDD,FLAG ";
					fields1 = "CCDI,NOMBREDI,CCDD,CCPP,NOMBREPP,NOMBREDD,FLAG";break;
			default:break;
		}
		query.append("SELECT DISTINCT ").append(Marco.getFieldsExport("m",opcion,fields)).append(",c.RESFIN").append(" ")
			.append("FROM ").append(TABLA_MARCO).append(" m ")
			.append("LEFT JOIN (SELECT ID, RESFIN FROM ").append(CuestionarioDAO.TABLA_CARATULA).append(") c ON c.ID=m.ID").append(" ")
			.append("INNER JOIN ").append(UbigeoDAO.TABLA).append(" u ON m.UBIGEO=u.UBIGEO").append(" ")
			.append("INNER JOIN (SELECT DISTINCT S.RUC, S.COD_SEDE_OPERATIVA, S.EQUIPO, S.RUTA, S.PERIODO FROM T_SEGMENTACION S").append(") ")
			.append("s on s.RUC = m.RUC").append(" ")
			.append("WHERE s.COD_SEDE_OPERATIVA='").append(codSedeOp).append("' ");
		if(!Equipo.TODOS.equals(equipo)){
			query.append("AND s.EQUIPO = '").append(equipo).append("' ");
		}
		if(!Ruta.TODOS.equals(ruta)){
			query.append("AND s.ruta='"+ruta+"' ");
		}
		if(!Periodo.TODOS.equals(periodo)){
			query.append("AND s.periodo=").append(periodo.toString());
		}
		return getBeans(new Query(query.toString()), Marco.class, 
				Marco.getFieldsExport(null,opcion,fields1+",RESFIN").split("\\,"));
	}
}

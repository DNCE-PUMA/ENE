package gob.inei.ene2019v2.service;

import gob.inei.ene2019v2.dao.SegmentacionDAO;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Equipo;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Periodo;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Ruta;
import gob.inei.ene2019v2.dao.SegmentacionDAO.Sede;
//import gob.inei.ene2019v2.model.Marco;
//import gob.inei.ene2019v2.model.SedeOperativa;
import gob.inei.ene2019v2.model.Segmentacion;
import gob.inei.ene2019v2.model.Ubigeo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SegmentacionService extends Service {

	public static SegmentacionService INSTANCE = null;
	
	private SegmentacionService(Context ctx) {
		super(ctx);
	}
	
	public static SegmentacionService getInstance(Context ctx) {
		if (INSTANCE == null) {
			INSTANCE = new SegmentacionService(ctx);			
		}
		return INSTANCE;
	}
	
	private SegmentacionDAO getDao() {
		if (sqliteDAO == null) {
			sqliteDAO = SegmentacionDAO.getInstance(this.dbh);
		}
		return (SegmentacionDAO)sqliteDAO;
	}
	
	public SQLiteDatabase startTX() {
		return getDao().startTX();
	}
		
	public void commitTX(SQLiteDatabase dbTX) {
		getDao().commitTX(dbTX);
	}
	
	public void endTX(SQLiteDatabase dbTX) {
		getDao().endTX(dbTX);
	}

	public List<Periodo> getPeriodos() {
		return getDao().getPeriodos();
	}
	
	public List<Periodo> getPeriodos(Integer usuarioId) {
		return getDao().getPeriodos(usuarioId);
	}
	
	public List<Periodo> getPeriodos(String codSedeOp, String equipo, String ruta) {
		return getDao().getPeriodos(codSedeOp, equipo, ruta);
	}
	
	public List<Ubigeo> getDistritos(Integer periodo, String ccdd, String ccpp, Integer usuarioId) {
		return getDao().getDistritos(periodo, ccdd, ccpp, usuarioId);
	}
	
	public boolean saveOrUpdate(Segmentacion bean, SQLiteDatabase dbTX) throws SQLException {
		return getDao().saveOrUpdate(bean, dbTX);
	}
	
//	public boolean saveOrUpdate(SedeOperativa bean, SQLiteDatabase dbTX) throws SQLException {
//		return getDao().saveOrUpdate(bean, dbTX); 
//	}
	
	public boolean saveOrUpdate(SQLiteDatabase dbTX, String tableName, Map<String, Object> map, String... pks) throws SQLException {
		return getDao().saveOrUpdate(dbTX, tableName, map, pks);
	}
	
	public Integer nextID(SQLiteDatabase dbTX, String tableName, String campo, String where, String... valores) {
		return getDao().nextID(dbTX, tableName, campo, where, valores);
	}
	
	public List<Map<String, Object>> getRegistros(String tableName, String where, String...whereValues) {
		return getDao().getRegistros(tableName, where, whereValues);
	}
	
	public List<Map<String, Object>> getRegistros(String tableName, String[] campos, String where, String...whereValues) {
		return getDao().getRegistros(tableName, campos, where, whereValues);
	}
	
	public Map<String, Object> getMaxRegistro(String tableName, String campo, String where, String...whereValues) {
		return getDao().getMaxRegistro(tableName, campo, where, whereValues);
	}
	
	public Map<String, Object> getRegistro(String tableName, String[] campos, String where, String...whereValues) {
		return getDao().getRegistro(tableName, campos, where, whereValues);
	}
	
	public boolean delete(SQLiteDatabase dbTX, String tableName, Map<String, Object> map, String... pks) throws SQLException {
		return getDao().delete(dbTX, tableName, map, pks);
	}
	
	public List<Sede> getSedes(String codigoSedeOperativa) {
		return getDao().getSedes(codigoSedeOperativa);
	}
	
	public List<Equipo> getEquipos(String codigoSedeOperativa) {
		return getDao().getEquipos(codigoSedeOperativa);
	}
	
	public List<Ruta> getRutas(String codigoSedeOperativa, String equipo) {
		return getDao().getRutas(codigoSedeOperativa, equipo);
	}
}

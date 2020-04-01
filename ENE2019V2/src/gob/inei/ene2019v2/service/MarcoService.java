package gob.inei.ene2019v2.service;

import gob.inei.dnce.components.FragmentForm;
import gob.inei.ene2019v2.dao.MarcoDAO;
import gob.inei.ene2019v2.model.Marco;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
//import gob.inei.ene2019v2.model.Marco;

public class MarcoService extends Service {

	public static MarcoService INSTANCE = null;
	
	private MarcoService(Context ctx) {
		super(ctx);
	}
	
	public static MarcoService getInstance(Context ctx) {
		if (INSTANCE == null) {
			INSTANCE = new MarcoService(ctx);
		}
		return INSTANCE;
	}
	
	private MarcoDAO getDao() {
		if (sqliteDAO == null) {
			sqliteDAO = MarcoDAO.getInstance(this.dbh);
		}
		return (MarcoDAO)sqliteDAO;
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
	
	public boolean saveOrUpdate(SQLiteDatabase dbTX, String tableName, Map<String, Object> map, String id) throws SQLException {
		return getDao().saveOrUpdate(dbTX, tableName, map, id);
	}
	
	public Map<String, Object> getMaxRegistro(String tableName, String campo, String where, String...whereValues) {
		return getDao().getMaxRegistro(tableName, campo, where, whereValues);
	}
	
	public Map<String, Object> getCountRegistro(String tableName, String campo, String where, String...whereValues) {
		return getDao().getCountRegistro(tableName, campo, where, whereValues);
	}
	
	public List<Marco> getMarco(String codSedeOp, String equipo, String ruta, Integer periodo, FragmentForm.OPCION opcion) {
		return getDao().getMarco(codSedeOp, equipo, ruta, periodo, opcion);
	}
}

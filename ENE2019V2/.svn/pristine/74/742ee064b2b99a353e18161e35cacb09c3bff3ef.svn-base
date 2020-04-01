package gob.inei.ene2019v2.service;

import gob.inei.ene2019v2.dao.UsuarioDAO;
import gob.inei.ene2019v2.model.Usuario;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioService extends Service {

	public static UsuarioService INSTANCE = null;
	
	private UsuarioService(Context ctx) {
		super(ctx);
	}
	
	public static UsuarioService getInstance(Context ctx) {
		if (INSTANCE == null) {
			INSTANCE = new UsuarioService(ctx);
		}
		return INSTANCE;
	}
	
	private UsuarioDAO getDao() {
		if (sqliteDAO == null) {
			sqliteDAO = UsuarioDAO.getInstance(this.dbh);
		}
		return (UsuarioDAO)sqliteDAO;
	}
	
	public Usuario getUsuario(String login, String clave) {
		return getDao().getUsuario(login, clave);
	}
	
	public boolean saveOrUpdate(Usuario bean) throws SQLException {
		return getDao().saveOrUpdate(bean);
	}
	
	public boolean saveOrUpdate(Usuario bean, SQLiteDatabase dbTX) throws SQLException {
		return getDao().saveOrUpdate(bean, dbTX);
	}
	
//	public List<Usuario> getUsuarios(String cod_sede_operativa, String ccdd, String ccpp, 
//			String ccdi, String equipo, Integer usuarioId, Integer tipoSegmentacion) {
//		return getDao().getUsuarios(cod_sede_operativa, ccdd, ccpp, ccdi, equipo, usuarioId, tipoSegmentacion);
//	}
//	
//	public List<Usuario> getUsuarios(String cod_sede_operativa, String ccdd, String ccpp, 
//			String ccdi, String equipo, Integer usuarioId) {
//		return getDao().getUsuarios(cod_sede_operativa, ccdd, ccpp, ccdi, equipo, usuarioId);
//	}
}

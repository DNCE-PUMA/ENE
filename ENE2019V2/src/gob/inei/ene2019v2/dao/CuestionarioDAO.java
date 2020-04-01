package gob.inei.ene2019v2.dao;

import gob.inei.dnce.components.Entity.SeccionCapitulo;
import gob.inei.dnce.dao.SQLiteDAO;
import gob.inei.dnce.dao.xml.XMLDataObject;
import gob.inei.ene2019v2.model.ActSecDivGrpClase;
import gob.inei.ene2019v2.model.ActSecDivGrupo;
import gob.inei.ene2019v2.model.CCPP;
import gob.inei.ene2019v2.model.Caratula;
import gob.inei.ene2019v2.model.Cobertura;
import gob.inei.ene2019v2.model.Marco;
import gob.inei.ene2019v2.model.ModuloIII_det;
import gob.inei.ene2019v2.model.ModuloIII_det2;
import gob.inei.ene2019v2.model.ModuloixDet04;
import gob.inei.ene2019v2.model.ModuloixDet05;
import gob.inei.ene2019v2.model.Moduloi;
import gob.inei.ene2019v2.model.Moduloii;
import gob.inei.ene2019v2.model.Moduloiii01;
import gob.inei.ene2019v2.model.Moduloiii02;
import gob.inei.ene2019v2.model.Moduloiv01;
import gob.inei.ene2019v2.model.Moduloiv02;
import gob.inei.ene2019v2.model.Moduloiv03;
import gob.inei.ene2019v2.model.Moduloix;
import gob.inei.ene2019v2.model.ModuloixDet01;
import gob.inei.ene2019v2.model.ModuloixDet02;
import gob.inei.ene2019v2.model.ModuloixDet03;
import gob.inei.ene2019v2.model.Modulov01;
import gob.inei.ene2019v2.model.Modulov02;
import gob.inei.ene2019v2.model.Modulovi01;
import gob.inei.ene2019v2.model.Modulovii01;
import gob.inei.ene2019v2.model.Moduloviii;
import gob.inei.ene2019v2.model.Navegation;
//import gob.inei.ene2019v2.model.Marco;
//import gob.inei.ene2019v2.model.Navegation;
import gob.inei.ene2019v2.model.Parameter;
import gob.inei.ene2019v2.model.UN;
import gob.inei.ene2019v2.model.Visita;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class CuestionarioDAO extends SQLiteDAO {
	public static CuestionarioDAO INSTANCE;

	public static final String VISTA_NAVEGATION = "V_NAVEGATION";
	public static final String TABLA_CARATULA = "T_05_DIG_CARATULA";
	public static final String TABLA_VISITA = "T_05_DIG_VISITA";
	public static final String TABLA_MODULOI = "T_05_DIG_MODULOI";
	public static final String TABLA_MODULOII = "T_05_DIG_MODULOII";
	public static final String TABLA_MODULOIII01 = "T_05_DIG_MODULOIII01";
	public static final String TABLA_MODULOIII02 = "T_05_DIG_MODULOIII02";	
	public static final String TABLA_MODULOIII_DET = "T_05_DIG_MODULOIII_DET";
	public static final String TABLA_MODULOIII_DET2 = "T_05_DIG_MODULOIII_DET2";
	
	public static final String TABLA_MODULOIV01 = "T_05_DIG_MODULOIV01";
	public static final String TABLA_MODULOIV02 = "T_05_DIG_MODULOIV02";
	public static final String TABLA_MODULOIV03 = "T_05_DIG_MODULOIV03";
	public static final String TABLA_MODULOV01 = "T_05_DIG_MODULOV01";
	public static final String TABLA_MODULOV02 = "T_05_DIG_MODULOV02";
	public static final String TABLA_MODULOVI01 = "T_05_DIG_MODULOVI01";
	public static final String TABLA_MODULOVII01 = "T_05_DIG_MODULOVII01";
	public static final String TABLA_MODULOVIII = "T_05_DIG_MODULOVIII";
	public static final String TABLA_MODULOIX_DET01 = "T_05_DIG_MODULOIX_DET01";
	public static final String TABLA_LITERAL_MODULOIX_DET01 = "T_LITERAL_MODULOIX_DET01";
	public static final String TABLA_MODULOIX_DET02 = "T_05_DIG_MODULOIX_DET02";
	public static final String TABLA_MODULOIX_DET03 = "T_05_DIG_MODULOIX_DET03";
	public static final String TABLA_MODULOIX = "T_05_DIG_MODULOIX";
	public static final String TABLA_MODULOIX_DET04 = "T_05_DIG_MODULOIX_DET04";
	public static final String TABLA_MODULOIX_DET05 = "T_05_DIG_MODULOIX_DET05";
	public static final String TABLA_MODULOIX_DET06 = "T_05_DIG_MODULOIX_DET06";
	public static final String TABLA_MODULOIX_DET07 = "T_05_DIG_MODULOIX_DET07";
	public static final String TABLA_MODULOIX_DET08 = "T_05_DIG_MODULOIX_DET08";
	public static final String TABLA_MODULOIX_VIII = "T_05_DIG_MODULOIX_DET05";
//	public static final String TABLA_MODULOIX_DET011 = "T_05_DIG_MODULOIX_DET06";
	
	public static final String TABLA_MARCO = "T_MARCO";
	public static final String TABLA_SEGMENTACION = "T_SEGMENTACION";

	public static final String TABLA_SECCION = "ACT_SECCION";
	public static final String TABLA_DIVISION = "ACT_SEC_DIVISION";
	public static final String TABLA_GRUPO = "ACT_SEC_DIV_GRUPO";
	public static final String TABLA_CLASE = "ACT_SEC_DIV_GRP_CLASE";
	public static final String TABLA_SECTOR = "AUT_SECTORIAL";
	public static final String TABLA_TIPO = "AUT_SEC_TIPO";
	public static final String TABLA_CCPP = "T_CCPP";
	
	public static final String VISTA_AUT_SECTORIAL = "V_AUT_SECTORIAL";
	public static final String VISTA_COBERTURA = "V_COBERTURA";
	public static final String[] detalle = { "NOMBRE", "ESTADO" };

	private static final String T_05_DIG_MODULOI = null;

	private CuestionarioDAO(MyDatabaseHelper dbh) {
		super(dbh);
	}

	public static CuestionarioDAO getInstance(MyDatabaseHelper dbh) {
		if (INSTANCE == null) {
			INSTANCE = new CuestionarioDAO(dbh);
		}
		return INSTANCE;
	}

	public Integer nextID(String tableName, String field, String where,
			String... values) {
		return super.nextID(field, tableName, where, values);
	}

	public static class CounterObservable extends Observable {
		private int cantidadInsertado;

		public CounterObservable() {
			this(0);
		}

		public CounterObservable(int cantidadAvanzado) {
			cantidadInsertado = cantidadAvanzado;
		}

		private void insertado(int cantidad) {
			cantidadInsertado += 1;
			setChanged();
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("INSERTADO", cantidadInsertado);
			notifyObservers(map);
			// Log.e(getClass().getSimpleName(), "insertados:" +
			// cantidadInsertado);
		}
	}

	public boolean save(SQLiteDatabase dbTX, XMLDataObject dataObjects,
			CounterObservable contadorObserver) throws java.sql.SQLException {
		boolean isTX = true;
		boolean flag = true;
		if (dbTX == null) {
			isTX = false;
			dbTX = this.dbh.getWritableDatabase();
		}
		for (int i = 0; i < dataObjects.getRegistros().size() && flag; i++) {
			if (dataObjects
					.getRegistros()
					.get(i)
					.get(dataObjects.getPkFields().get(
							dataObjects.getPkFields().size() - 1)) == null) {
				int nextID = super.nextID(
						dbTX,
						dataObjects.getPkFields().get(
								dataObjects.getPkFields().size() - 1),
						dataObjects.getTableName(), dataObjects
								.getStringWhereNextID(), dataObjects
								.getWhereValuesNextID(dataObjects
										.getRegistros().get(i)));
				dataObjects
						.getRegistros()
						.get(i)
						.put(dataObjects.getPkFields().get(
								dataObjects.getPkFields().size() - 1), nextID);
			}
			flag = super.save(
					dbTX,
					dataObjects.getTableName(),
					dataObjects.getRegistros().get(i),
					dataObjects.getPkFields().toArray(
							new String[dataObjects.getPkFields().size()]));
			if (contadorObserver != null) {
				contadorObserver.insertado(1);
			}
		}
		if (!isTX) {
			dbTX.close();
			dbTX = null;
			SQLiteDatabase.releaseMemory();
		}
		// Log.e(getClass().getSimpleName(), "Acabo save()");
		return flag;
	}

	public boolean saveM(SQLiteDatabase dbTX, XMLDataObject dataObjects,
			CounterObservable contadorObserver) throws java.sql.SQLException {
		boolean isTX = true;
		boolean flag = true;
		if (dbTX == null) {
			isTX = false;
			dbTX = this.dbh.getWritableDatabase();
		}
		for (int i = 0; i < dataObjects.getRegistros().size() && flag; i++) {
			if (dataObjects
					.getRegistros()
					.get(i)
					.get(dataObjects.getPkFields().get(
							dataObjects.getPkFields().size() - 1)) == null) {
				int nextID = super.nextID(
						dbTX,
						dataObjects.getPkFields().get(
								dataObjects.getPkFields().size() - 1),
						dataObjects.getTableName(), dataObjects
								.getStringWhereNextID(), dataObjects
								.getWhereValuesNextID(dataObjects
										.getRegistros().get(i)));
				dataObjects
						.getRegistros()
						.get(i)
						.put(dataObjects.getPkFields().get(
								dataObjects.getPkFields().size() - 1), nextID);
			}
			try {
				flag = super.save(dbTX, dataObjects.getTableName(), dataObjects
						.getRegistros().get(i), dataObjects.getPkFields()
						.toArray(new String[dataObjects.getPkFields().size()]));
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (contadorObserver != null) {
				contadorObserver.insertado(1);
			}
		}
		if (!isTX) {
			dbTX.close();
			dbTX = null;
			SQLiteDatabase.releaseMemory();
		}
		// Log.e(getClass().getSimpleName(), "Acabo save()");
		return flag;
	}

	public boolean saveOrUpdate(SQLiteDatabase dbTX, XMLDataObject dataObjects,
			CounterObservable contadorObserver) throws java.sql.SQLException {
		boolean isTX = true;
		boolean flag = true;
		if (dbTX == null) {
			isTX = false;
			dbTX = this.dbh.getWritableDatabase();
		}
		for (int i = 0; i < dataObjects.getRegistros().size() && flag; i++) {
			if (dataObjects
					.getRegistros()
					.get(i)
					.get(dataObjects.getPkFields().get(
							dataObjects.getPkFields().size() - 1)) == null) {
				// Log.e(getClass().getSimpleName(), "TableName: " +
				// dataObjects.getTableName() + " pk vacia: " +
				// dataObjects.getPkFields().get(dataObjects.getPkFields().size()-1));
				int nextID = super.nextID(
						dbTX,
						dataObjects.getPkFields().get(
								dataObjects.getPkFields().size() - 1),
						dataObjects.getTableName(), dataObjects
								.getStringWhereNextID(), dataObjects
								.getWhereValuesNextID(dataObjects
										.getRegistros().get(i)));
				dataObjects
						.getRegistros()
						.get(i)
						.put(dataObjects.getPkFields().get(
								dataObjects.getPkFields().size() - 1), nextID);
			}
			flag = super.saveOrUpdate(
					dbTX,
					dataObjects.getTableName(),
					dataObjects.getRegistros().get(i),
					dataObjects.getPkFields().toArray(
							new String[dataObjects.getPkFields().size()]));
			if (contadorObserver != null) {
				contadorObserver.insertado(1);
			}
		}
		if (!isTX) {
			dbTX.close();
			dbTX = null;
			SQLiteDatabase.releaseMemory();
		}
		return flag;
	}

	public boolean existeGPS(String latitud, String longitud) {
		SQLiteDatabase db = this.dbh.getReadableDatabase();
		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("SELECT ID").append(" ").append("FROM ")
				.append(TABLA_CARATULA).append(" ")
				.append("WHERE GPS_LAT=? AND GPS_LON=?").append(" ");
		cursor = db.rawQuery(queryBuilder.toString(), new String[] { latitud,
				longitud });
		if (cursor.getCount() == 0) {
			cursor = null;
			db.close();
			return false;
		} else {
			cursor = null;
			db.close();
			return true;
		}
	}

	// public Marco getMarco(Marco marco, SeccionCapitulo... secciones) {
	// Marco bean = (Marco) getBean(
	// TABLA_MARCO,
	// "NSISCOM = ?",
	// new String[] { marco.nsiscom},
	// Marco.class, secciones);
	// return bean;
	// }
	// public boolean saveOrUpdate(Marco bean, SeccionCapitulo... secciones)
	// throws java.sql.SQLException {
	// return this
	// .saveOrUpdate(
	// TABLA_MARCO,
	// "NSISCOM = '"+bean.nsiscom+"'",
	// bean, new String[] { },
	// secciones);
	// }

	public boolean saveOrUpdate(Caratula bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_CARATULA, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Caratula getCaratula(Marco bean, SeccionCapitulo... secciones) {
		Caratula resp = (Caratula) getBean(TABLA_CARATULA, "ID=?",
				new String[] { bean.id.toString() }, Caratula.class, secciones);
		return resp;
	}

	public Caratula getCaratula(Caratula bean, SeccionCapitulo... secciones) {
		Caratula resp = (Caratula) getBean(TABLA_CARATULA, "ID=?",
				new String[] { bean.id.toString() }, Caratula.class, secciones);
		return resp;
	}

	public boolean borrarCaratula(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_CARATULA, "ID=?", bean.id.toString());
	}

	public List<Caratula> getCaratulas(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_CARATULA, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Caratula.class,
				secciones);
	}
	
//    public Caratula getEmpadronador(String dni, String... secciones) {
//        Caratula resp = (Caratula) getBean(
//                 TABLA_CARATULA, "ENC_DNI = ? LIMIT 1",
//                 new String[] { dni }, Caratula.class, secciones);
//        return resp;
//    }


	public Caratula getEmpadronador(Integer id,String dni,  String... campos) {
		return (Caratula) getBean(TABLA_CARATULA, "ID=? AND ENC_DNI=?  ",
				new String[] { id.toString(), dni.toString() }, "ENC_DNI DESC", Caratula.class, -1,
				-1, campos);
	}
	
	public boolean saveOrUpdate(Visita bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_VISITA, "ID=? AND CV_ID=?", bean,
				new String[] { "id", "cv_id" }, secciones);
	}

	public Visita getVisita(Caratula bean, SeccionCapitulo... secciones) {
		Visita resp = (Visita) getBean(TABLA_VISITA, "ID=?",
				new String[] { bean.id.toString() }, Visita.class, secciones);
		return resp;
	}

	public boolean borrarVisita(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_VISITA, "ID=?", bean.id.toString());
	}

	public boolean borrarVisita(Visita bean) throws java.sql.SQLException {
		return borrar(TABLA_VISITA, "ID=? AND CV_ID=?", bean.id.toString(),
				bean.cv_id.toString());
	}

	public List<Visita> getVisitas(Marco bean, SeccionCapitulo... secciones) {
		return getBeans(TABLA_VISITA, "ID=?",
				new String[] { bean.id.toString() }, "CV_ID", Visita.class,
				secciones);
	}

	public List<Visita> getVisitas(Caratula bean, SeccionCapitulo... secciones) {
		return getBeans(TABLA_VISITA, "ID=?",
				new String[] { bean.id.toString() }, "CV_ID", Visita.class,
				secciones);
	}

	public boolean saveOrUpdate(Moduloi bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOI, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloi getModuloi(Caratula bean, SeccionCapitulo... secciones) {
		Moduloi resp = (Moduloi) getBean(TABLA_MODULOI, "ID=?",
				new String[] { bean.id.toString() }, Moduloi.class, secciones);
		return resp;
	}

	public boolean borrarModuloi(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOI, "ID=?", bean.id.toString());
	}

	public List<Moduloi> getModulois(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOI, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloi.class,
				secciones);
	}

	public boolean saveOrUpdate(Moduloii bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOII, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloii getModuloii(Caratula bean, SeccionCapitulo... secciones) {
		Moduloii resp = (Moduloii) getBean(TABLA_MODULOII, "ID=?",
				new String[] { bean.id.toString() }, Moduloii.class, secciones);
		return resp;
	}

	public boolean borrarModuloii(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOII, "ID=?", bean.id.toString());
	}

	public List<Moduloii> getModuloiis(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOII, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloii.class,
				secciones);
	}

	public boolean saveOrUpdate(Moduloiii01 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIII01, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloiii01 getModuloiii01(Caratula bean,
			SeccionCapitulo... secciones) {
		Moduloiii01 resp = (Moduloiii01) getBean(TABLA_MODULOIII01, "ID=?",
				new String[] { bean.id.toString() }, Moduloiii01.class,
				secciones);
		return resp;
	}

	public boolean borrarModuloiii01(Caratula bean)
			throws java.sql.SQLException {
		return borrar(TABLA_MODULOIII01, "ID=?", bean.id.toString());
	}

	public List<Moduloiii01> getModuloiii01s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIII01, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloiii01.class,
				secciones);
	}
	
	public List<ModuloIII_det> getModuloIII_det(Moduloiii01 bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIII_DET, "ID=? ", new String[] {
				bean.id.toString()} ,"C3P301_ID", ModuloIII_det.class, secciones);
	}
	
	public boolean saveOrUpdate(ModuloIII_det bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIII_DET, "ID=? AND C3P301_ID=? ", bean,
				new String[] { "id", "c3p301_id" }, secciones);
	}
	
	
	public List<ModuloIII_det2> getModuloIII_det2(Moduloiii01 bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIII_DET2, "ID=? ", new String[] {
				bean.id.toString()} ,"C3P302_ID", ModuloIII_det2.class, secciones);
	}
	
	public boolean saveOrUpdate(ModuloIII_det2 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIII_DET2, "ID=? AND C3P302_ID=? ", bean,
				new String[] { "id", "c3p302_id" }, secciones);
	}
	

	public boolean saveOrUpdate(Moduloiii02 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIII02, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloiii02 getModuloiii02(Caratula bean,
			SeccionCapitulo... secciones) {
		Moduloiii02 resp = (Moduloiii02) getBean(TABLA_MODULOIII02, "ID=?",
				new String[] { bean.id.toString() }, Moduloiii02.class,
				secciones);
		return resp;
	}

	public boolean borrarModuloiii02(Integer id) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIII02, "ID=?", id.toString());
	}

	public List<Moduloiii02> getModuloiii02s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIII02, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloiii02.class,
				secciones);
	}

	public boolean saveOrUpdate(Moduloiv01 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIV01, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloiv01 getModuloiv01(Caratula bean, SeccionCapitulo... secciones) {
		Moduloiv01 resp = (Moduloiv01) getBean(TABLA_MODULOIV01, "ID=?",
				new String[] { bean.id.toString() }, Moduloiv01.class,
				secciones);
		return resp;
	}

	public boolean borrarModuloiv01(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIV01, "ID=?", bean.id.toString());
	}

	public List<Moduloiv01> getModuloiv01s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIV01, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloiv01.class,
				secciones);
	}

	public boolean saveOrUpdate(Moduloiv02 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIV02, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloiv02 getModuloiv02(Caratula bean, SeccionCapitulo... secciones) {
		Moduloiv02 resp = (Moduloiv02) getBean(TABLA_MODULOIV02, "ID=?",
				new String[] { bean.id.toString() }, Moduloiv02.class,
				secciones);
		return resp;
	}

	public boolean borrarModuloiv02(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIV02, "ID=?", bean.id.toString());
	}

	public List<Moduloiv02> getModuloiv02s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIV02, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloiv02.class,
				secciones);
	}

	public boolean saveOrUpdate(Moduloiv03 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIV03, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloiv03 getModuloiv03(Caratula bean, SeccionCapitulo... secciones) {
		Moduloiv03 resp = (Moduloiv03) getBean(TABLA_MODULOIV03, "ID=?",
				new String[] { bean.id.toString() }, Moduloiv03.class,
				secciones);
		return resp;
	}

	public boolean borrarModuloiv03(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIV03, "ID=?", bean.id.toString());
	}

	public List<Moduloiv03> getModuloiv03s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIV03, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloiv03.class,
				secciones);
	}

	public boolean saveOrUpdate(Modulov01 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOV01, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Modulov01 getModulov01(Caratula bean, SeccionCapitulo... secciones) {
		Modulov01 resp = (Modulov01) getBean(TABLA_MODULOV01, "ID=?",
				new String[] { bean.id.toString() }, Modulov01.class, secciones);
		return resp;
	}

	public boolean borrarModulov01(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOV01, "ID=?", bean.id.toString());
	}

	public List<Modulov01> getModulov01s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOV01, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Modulov01.class,
				secciones);
	}

	public boolean saveOrUpdate(Modulov02 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOV02, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Modulov02 getModulov02(Caratula bean, SeccionCapitulo... secciones) {
		Modulov02 resp = (Modulov02) getBean(TABLA_MODULOV02, "ID=?",
				new String[] { bean.id.toString() }, Modulov02.class, secciones);
		return resp;
	}

	public boolean borrarModulov02(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOV02, "ID=?", bean.id.toString());
	}
	
//	public boolean borrarModulov02(Modulov02 bean) throws java.sql.SQLException {
//		return borrar(TABLA_MODULOV02, "ID=?", bean.id.toString());
//	}

	public List<Modulov02> getModulov02s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOV02, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Modulov02.class,
				secciones);
	}

	public boolean saveOrUpdate(Modulovi01 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOVI01, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Modulovi01 getModulovi01(Caratula bean, SeccionCapitulo... secciones) {
		Modulovi01 resp = (Modulovi01) getBean(TABLA_MODULOVI01, "ID=?",
				new String[] { bean.id.toString() }, Modulovi01.class,
				secciones);
		return resp;
	}

	public boolean borrarModulovi01(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOVI01, "ID=?", bean.id.toString());
	}

	public List<Modulovi01> getModulovi01s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOVI01, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Modulovi01.class,
				secciones);
	}

	public boolean saveOrUpdate(Modulovii01 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOVII01, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Modulovii01 getModulovii01(Caratula bean,
			SeccionCapitulo... secciones) {
		Modulovii01 resp = (Modulovii01) getBean(TABLA_MODULOVII01, "ID=?",
				new String[] { bean.id.toString() }, Modulovii01.class,
				secciones);
		return resp;
	}

	public boolean borrarModulovii01(Caratula bean)
			throws java.sql.SQLException {
		return borrar(TABLA_MODULOVII01, "ID=?", bean.id.toString());
	}

	public List<Modulovii01> getModulovii01s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOVII01, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Modulovii01.class,
				secciones);
	}

	public boolean saveOrUpdate(Moduloviii bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOVIII, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloviii getModuloviii(Caratula bean, SeccionCapitulo... secciones) {
		Moduloviii resp = (Moduloviii) getBean(TABLA_MODULOVIII, "ID=?",
				new String[] { bean.id.toString() }, Moduloviii.class,
				secciones);
		return resp;
	}

	public boolean borrarModuloviii(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOVIII, "ID=?", bean.id.toString());
	}

	public List<Moduloviii> getModuloviiis(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOVIII, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloviii.class,
				secciones);
	}

	public boolean saveOrUpdate(ModuloixDet01 bean,
			SeccionCapitulo... secciones) throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET01, "ID=? AND C9P901_ID=?",
				bean, new String[] { "id", "c9p901_id" }, secciones);
	}

	public ModuloixDet01 getDet01(Caratula bean, Integer index,
			SeccionCapitulo... secciones) {
		ModuloixDet01 resp = (ModuloixDet01) getBean(TABLA_MODULOIX_DET01,
				"ID=? AND C9P901_ID=?", new String[] { bean.id.toString(),
						index.toString() }, ModuloixDet01.class, secciones);
		return resp;
	}

	public boolean borrarDet01(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIX_DET01, "ID=?", bean.id.toString());
	}

	public boolean borrarDet01(ModuloixDet01 bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIX_DET01, "ID=? AND C9P901_ID=?",
				bean.id.toString(), bean.c9p901_id.toString());
	}

	
	public List<ModuloixDet01> getDet01s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIX_DET01, "ID=?",
				new String[] { bean.id.toString() }, "C9P901_ID",
				ModuloixDet01.class, secciones);
	}

	// public List<ModuloixDet01> getDet01s(Caratula bean,
	// SeccionCapitulo... capitulos) {
	// StringBuilder sbr = new StringBuilder();
	// ModuloixDet01 tmp = new ModuloixDet01();
	// List<String> listaCampos = new ArrayList<String>();
	// for (int i = 0; i < capitulos.length; i++) {
	// SeccionCapitulo seccion = capitulos[i];
	// listaCampos.addAll(tmp.getFieldMatches(seccion.getSeccion(),
	// seccion.getSubseccion(), seccion.getInicio(),
	// seccion.getFin(), seccion.getSubPregI(),
	// seccion.getSubPregF()));
	// if (seccion.getCampos() != null) {
	// for (int j = 0; j < seccion.getCampos().length; j++) {
	// listaCampos.add(seccion.getCampos()[j]);
	// }
	// }
	// }
	// String[] campos = listaCampos.toArray(new String[listaCampos.size()]);
	// String[] camposFinal = new String[campos.length + 3];
	// camposFinal = Arrays.copyOf(campos, camposFinal.length);
	// camposFinal[camposFinal.length - 3] = "orden";
	// camposFinal[camposFinal.length - 2] = "literal";
	// camposFinal[camposFinal.length - 1] = "flag";
	// /* T.M9P001_ID,T.M9P001_2,T.M9P001_3,T.M9P001_4,T.M9P001_5,T.M9P001_6 */
	// sbr.append("SELECT T.ID, T.M9P001_ID,T.M9P001_2,T.M9P001_3,T.M9P001_4,T.M9P001_5,T.M9P001_6, L.ORDEN,L.LITERAL, T.FLAG AS FLAG ")
	// .append("FROM ")
	// .append(TABLA_LITERAL_MODULOIX_DET01)
	// .append(" L LEFT JOIN ( ")
	// .append("SELECT ID,M9P001_ID,M9P001_2,M9P001_3,M9P001_4,M9P001_5,M9P001_6,")
	// .append("(CASE WHEN IFNULL(M9P001_3,0)<>0 THEN 1 ELSE NULL END) AS FLAG ")
	// .append("FROM ").append(TABLA_MODULOIX_DET01)
	// .append(" WHERE ID=? ").append(") T ")
	// .append("ON(L.ID=T.M9P001_ID) ").append("ORDER BY L.ORDEN");
	// Log.e(getClass().getSimpleName(), Arrays.toString(camposFinal) + "["
	// + camposFinal.length + "]" + "[" + campos.length + "]");
	// Query query = new Query(sbr.toString(), bean.id.toString());
	// return getBeans(query, ModuloixDet01.class, camposFinal);
	// }

	public boolean saveOrUpdate(ModuloixDet02 bean,
			SeccionCapitulo... secciones) throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET02, "ID=? AND C9P902_ID=?",
				bean, new String[] { "id", "c9p902_id" }, secciones);
	}

	public ModuloixDet02 getDet02(Caratula bean, SeccionCapitulo... secciones) {
		ModuloixDet02 resp = (ModuloixDet02) getBean(TABLA_MODULOIX_DET02,
				"ID=?", new String[] { bean.id.toString() },
				ModuloixDet02.class, secciones);
		return resp;
	}

	public boolean borrarDet02(ModuloixDet02 bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIX_DET02, "ID=? AND C9P902_ID=?",
				bean.id.toString(), bean.c9p902_id.toString());
	}

	public List<ModuloixDet02> getDet02s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIX_DET02, "ID=?",
				new String[] { bean.id.toString() }, "C9P902_ID",
				ModuloixDet02.class, secciones);
	}

	public boolean saveOrUpdate(ModuloixDet03 bean,
			SeccionCapitulo... secciones) throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET03, "ID=? AND C9P903_ID=?",
				bean, new String[] { "id", "c9p903_id" }, secciones);
	}

	public ModuloixDet03 getDet03(Caratula bean, SeccionCapitulo... secciones) {
		ModuloixDet03 resp = (ModuloixDet03) getBean(TABLA_MODULOIX_DET03,
				"ID=?", new String[] { bean.id.toString() },
				ModuloixDet03.class, secciones);
		return resp;
	}

	public boolean borrarDet03(ModuloixDet03 bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIX_DET03, "ID=? AND C9P903_ID=?",
				bean.id.toString(), bean.c9p903_id.toString());
	}

	public List<ModuloixDet03> getDet03s(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIX_DET03, "ID=?",
				new String[] { bean.id.toString() }, "C9P903_ID",
				ModuloixDet03.class, secciones);
	}

	public boolean saveOrUpdate(Moduloix bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX, "ID=?", bean,
				new String[] { "id" }, secciones);
	}

	public Moduloix getModuloix(Caratula bean, SeccionCapitulo... secciones) {
		Moduloix resp = (Moduloix) getBean(TABLA_MODULOIX, "ID=?",
				new String[] { bean.id.toString() }, Moduloix.class, secciones);
		return resp;
	}

	public boolean borrarModuloix(Caratula bean) throws java.sql.SQLException {
		return borrar(TABLA_MODULOIX, "ID=?", bean.id.toString());
	}

	public List<Moduloix> getModuloixs(Caratula bean,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIX, "ID=?",
				new String[] { bean.id.toString() }, "P3_1", Moduloix.class,
				secciones);
	}

	public boolean saveOrUpdate(ModuloixDet04 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET04,
				"ID=? AND C9P907_ID=? AND C9P907_COD= ? ", bean, new String[] {
						"id", "c9p907_id", "c9p907_cod" }, secciones);
	}

	public List<ModuloixDet04> getListModuloIXS(Caratula bean, Integer pregunta,
			SeccionCapitulo... secciones) {

		//return getBeans(TABLA_MODULOIXs, "ID=? AND C9P907_ID = ?",

		return getBeans(TABLA_MODULOIX_DET04, "ID=? AND C9P907_ID = ?",

				new String[] { bean.id.toString(), pregunta.toString() }, "ID",
				ModuloixDet04.class, secciones);
	}

	public List<ModuloixDet05> getListModuloIX_VIII(Caratula bean, Integer pregunta,
			SeccionCapitulo... secciones) {
		return getBeans(TABLA_MODULOIX_VIII, "ID=? AND C9P908_ID = ?",
				new String[] { bean.id.toString(), pregunta.toString() }, "ID",
				ModuloixDet05.class, secciones);
	}
	
	public boolean saveOrUpdate(ModuloixDet05 bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_VIII,
				"ID=? AND C9P908_ID=? AND C9P908_COD= ? ", bean, new String[] {
						"id", "c9p908_id", "c9p908_cod" }, secciones);
	}
	


	/*
	 * public boolean borrarCuestDet(CuestDet bean, MAINTENCE opcion) throws
	 * java.sql.SQLException {
	 * 
	 * return opcion == MAINTENCE.ONEONLY ? borrar( TABLA_CUESTDET,
	 * "ID=? AND CODCCPP=? AND ZONA_ID=? AND MANZANA_ID=? AND FRENTE_ID=? AND CARGA_ID=? AND P9_1=?"
	 * , bean.id.toString(), bean.codccpp, bean.zona_id, bean.manzana_id,
	 * bean.frente_id.toString(), bean.carga_id.toString(), bean.p9_1.toString()
	 * ): borrar( TABLA_CUESTDET,
	 * "ID=? AND CODCCPP=? AND ZONA_ID=? AND MANZANA_ID=? AND FRENTE_ID=? AND CARGA_ID=?"
	 * , bean.id.toString(), bean.codccpp, bean.zona_id, bean.manzana_id,
	 * bean.frente_id.toString(), bean.carga_id.toString() ); }
	 */

	public Navegation getNavegacion(Caratula bean) {
		return (Navegation) getBean(VISTA_NAVEGATION, "ID=?", Navegation.class,
				bean.id.toString());
	}

	public Parameter getParameter(String parameter,
			SeccionCapitulo... secciones) {
		Parameter bean = (Parameter) getBean(ParameterDAO.TABLA, "PARAMETER='"
				+ parameter + "'", new String[] {}, Parameter.class, secciones);
		return bean;
	}

	public boolean saveOrUpdate(Parameter bean, SeccionCapitulo... secciones)
			throws java.sql.SQLException {
		return this.saveOrUpdate(ParameterDAO.TABLA, "PARAMETER = ?", bean,
				new String[] { "parameter" }, secciones);
	}

	public List<ActSecDivGrpClase> getActividades() {
		return getBeans(TABLA_CLASE, "CLASE IS NOT NULL",
				ActSecDivGrpClase.class);
	}

	public List<CCPP> getCCPP(String ccdd, String ccpp, String ccdi) {
		StringBuilder query = new StringBuilder();		
		String[] campos = new CCPP().getFieldsNames();
		query.append("SELECT DISTINCT ").append(getCamposSelect(campos)).append(" ")
			.append("FROM ").append(TABLA_CCPP).append(" ")
			.append("WHERE CCDD='").append(ccdd).append("' ").append(" ")
		  	.append("AND CCPP='").append(ccpp).append("' ").append(" ")
		  	.append("AND CCDI='").append(ccdi).append("' ").append(" ")
		  	.append("UNION ALL ").append(" ") 
		  	.append("SELECT  DISTINCT ").append(getCamposSelect(campos)).append(" ")
		  	.append("FROM ").append(TABLA_CCPP).append(" ")
		  	.append("WHERE CCDD in ('99', '98' ) ").append(" ");
		Log.e ("query", query  + "");
		return getBeans(new Query(query.toString()), CCPP.class, campos);
	//	return getBeans(new Query(query.toString()), CCPP.class,  ccdd.toString(), ccpp.toString(), ccdi.toString());
	}

	
//	public List<CCPP> getCCPP(String ccdd, String ccpp, String ccdi) {
//		return getBeans(TABLA_CCPP, "CCDD=? AND CCPP=? AND CCDI=? ",
//				CCPP.class, ccdd.toString(), ccpp.toString(), ccdi.toString());
//	}
   

	public List<ActSecDivGrupo> getResoluciones() {
		return getBeans(VISTA_AUT_SECTORIAL, "GRUPO IS NOT NULL",
				ActSecDivGrupo.class);
	}

	public List<Cobertura> getCoberturaXid(Integer id) {
		return getBeans(VISTA_COBERTURA, "ID=?", Cobertura.class, id.toString());
	}

	public Visita getUltimaVisita(Integer id, String... campos) {
		return (Visita) getBean(TABLA_VISITA, "ID=?",
				new String[] { id.toString() }, "CV_ID DESC", Visita.class, -1,
				-1, campos);
	}

	public boolean borrarCapitulos(Integer id, String... capitulos) {
		SQLiteDatabase dbw = dbh.getReadableDatabase();
		if (capitulos.length > 0) {
			for (String cap : capitulos)
				dbw.delete("T_05_DIG_" + cap, "ID=?",
						new String[] { id.toString() });
		}
		dbw.close();
		dbw = null;
		SQLiteDatabase.releaseMemory();
		return true;
	}
	
	public List<Parameter> getParameters(String parameter,
			SeccionCapitulo... secciones) {
		return getBeans(ParameterDAO.TABLA, "PARAMETER==?",
				new String[] { parameter }, "ID", Parameter.class, secciones);
	}
	
	/* Para Calificacion */

	public Moduloi getMODI(Integer id) {
		Moduloi resp = (Moduloi) getBean(TABLA_MODULOI, "ID=?", "id",
				Moduloi.class, id.toString());
		return resp;
	}

	public Moduloii getMODII(Integer id) {
		Moduloii resp = (Moduloii) getBean(TABLA_MODULOII, "ID=?", "id",
				Moduloii.class, id.toString());
		return resp;
	}

	public Moduloiii01 getMODIII_01(Integer id) {
		Moduloiii01 resp = (Moduloiii01) getBean(TABLA_MODULOIII01, "ID=?",
				"id", Moduloiii01.class, id.toString());
		return resp;
	}

	public List<ModuloIII_det> getMODIII_det(Integer id) {
		return getBeans(TABLA_MODULOIII_DET, "ID=?", "id",
				ModuloIII_det.class, id.toString());
	}

	public Moduloiii02 getMODIII_02(Integer id) {
		Moduloiii02 resp = (Moduloiii02) getBean(TABLA_MODULOIII02, "ID=?",
				"id", Moduloiii02.class, id.toString());
		return resp;
	}

	public Moduloiv01 getMODIV_01(Integer id) {
		Moduloiv01 resp = (Moduloiv01) getBean(TABLA_MODULOIV01, "ID=?", "id",
				Moduloiv01.class, id.toString());
		return resp;
	}

	public Moduloiv02 getMODIV_02(Integer id) {
		Moduloiv02 resp = (Moduloiv02) getBean(TABLA_MODULOIV02, "ID=?", "id",
				Moduloiv02.class, id.toString());
		return resp;
	}

	public Moduloiv03 getMODIV_03(Integer id) {
		Moduloiv03 resp = (Moduloiv03) getBean(TABLA_MODULOIV03, "ID=?", "id",
				Moduloiv03.class, id.toString());
		return resp;
	}

	public Modulov01 getMODV_01(Integer id) {
		Modulov01 resp = (Modulov01) getBean(TABLA_MODULOV01, "ID=?", "id",
				Modulov01.class, id.toString());
		return resp;
	}

	public Modulov02 getMODV_02(Integer id) {
		Modulov02 resp = (Modulov02) getBean(TABLA_MODULOV02, "ID=?", "id",
				Modulov02.class, id.toString());
		return resp;
	}

	public Modulovi01 getMODVI(Integer id) {
		Modulovi01 resp = (Modulovi01) getBean(TABLA_MODULOVI01, "ID=?", "id",
				Modulovi01.class, id.toString());
		return resp;
	}

	public Modulovii01 getMODVII(Integer id) {
		Modulovii01 resp = (Modulovii01) getBean(TABLA_MODULOVII01, "ID=?",
				"id", Modulovii01.class, id.toString());
		return resp;
	}

	public Moduloviii getMODVIII(Integer id) {
		Moduloviii resp = (Moduloviii) getBean(TABLA_MODULOVIII, "ID=?", "id",
				Moduloviii.class, id.toString());
		return resp;
	}

	public Moduloix getMODIX(Integer id) {
		Moduloix resp = (Moduloix) getBean(TABLA_MODULOIX, "ID=?", "id",
				Moduloix.class, id.toString());
		return resp;
	}

	public List<ModuloixDet01> getMODIX_01(Integer id) {
		return getBeans(TABLA_MODULOIX_DET01, "ID=?", "id",
				ModuloixDet01.class, id.toString());
	}

	public List<ModuloixDet02> getMODIX_02(Integer id) {
		return getBeans(TABLA_MODULOIX_DET02, "ID=?", "id",
				ModuloixDet02.class, id.toString());
	}

	public List<ModuloixDet03> getMODIX_03(Integer id) {
		return getBeans(TABLA_MODULOIX_DET03, "ID=?", "id",
				ModuloixDet03.class, id.toString());
	}

	public List<ModuloixDet04> getMODIX_04(Integer id) {
		return getBeans(TABLA_MODULOIX_DET04, "ID=?", "id", ModuloixDet04.class,
				id.toString());
	}

	/* Grabado */
	
	public boolean saveOrUpdateCP(Moduloi bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOI, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Moduloii bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOII, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Moduloiii01 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIII01, "ID=?", bean,
				new String[] { "id" });
	}
	
	public boolean saveOrUpdateCP(ModuloIII_det bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIII_DET, "ID=? AND C3P301_ID=? ",
				bean, new String[] { "id", "c3p301_id" });
	}


	public boolean saveOrUpdateCP(Moduloiii02 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIII02, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Moduloiv01 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIV01, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Moduloiv02 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIV02, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Moduloiv03 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIV03, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Modulov01 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOV01, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Modulov02 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOV02, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Modulovi01 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOVI01, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Modulovii01 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOVII01, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(Moduloviii bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOVIII, "ID=?", bean,
				new String[] { "id" });
	}
	


	public List<UN> getUnidadesMedidaC4() {
		StringBuilder query = new StringBuilder();		
		String[] campos = new UN().getFieldsNames();
		query.append("SELECT CODIGO,DESCRIPCION AS NOMBRE FROM T_UNIDAD_MEDIDA ").append(" ");
		Log.e ("query", query  + "");
		return getBeans(new Query(query.toString()), UN.class, campos);
	//	return getBeans(new Query(query.toString()), CCPP.class,  ccdd.toString(), ccpp.toString(), ccdi.toString());
	}

	
	
	public boolean saveOrUpdateCP(Moduloix bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX, "ID=?", bean,
				new String[] { "id" });
	}

	public boolean saveOrUpdateCP(ModuloixDet01 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET01, "ID=? AND C9P901_ID=?",
				bean, new String[] { "id", "c9p901_id" });
	}

	public boolean saveOrUpdateCP(ModuloixDet02 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET02, "ID=? AND C9P902_ID=?",
				bean, new String[] { "id", "c9p902_id" });
	}

	public boolean saveOrUpdateCP(ModuloixDet03 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET03, "ID=? AND C9P903_ID=? ",
				bean, new String[] { "id", "c9p903_id" });
	}

	


	
	public boolean saveOrUpdateCP(ModuloixDet04 bean, SQLiteDatabase dbTX)
			throws java.sql.SQLException {
		return this.saveOrUpdate(TABLA_MODULOIX_DET04,
				"ID=? AND C9P907_ID=? AND C9P907_COD=?", bean, new String[] {
						"id", "c9p907_id", "c9p907_cod" });
	}

}
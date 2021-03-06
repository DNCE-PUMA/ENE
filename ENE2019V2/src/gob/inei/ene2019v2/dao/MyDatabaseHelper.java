package gob.inei.ene2019v2.dao;

import gob.inei.dnce.dao.DatabaseHelper;
import gob.inei.ene2019v2.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class MyDatabaseHelper extends DatabaseHelper {
	/**********************************************/
	private static String TAG = "MyDatabaseHelper";
	// protected static final Logger logger = LoggerFactory.getLogger();

	protected static Context context;

	public MyDatabaseHelper(Context ctx, String databaseName,
			int databaseVersion) {
		super(ctx, databaseName, databaseVersion);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		crearVistasCobertura(db);

	}

	@Override
	public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		crearVistasCobertura(db);
	}

	@Override
	public void leerRAW(SQLiteDatabase db) {
		cargarXML(db, R.raw.sql_ubigeo, "sql_ubigeo");
		cargarXML(db, R.raw.sql_sistema, "sql_sistema");
		cargarXML(db, R.raw.sql_base, "sql_sistema");
		cargarXML(db, R.raw.sql_marco, "sql_tablas");
		cargarXML(db, R.raw.sql_tablas, "sql_tablas");
		cargarXML(db, R.raw.sql_maestro, "sql_maestro");
		cargarXML(db, R.raw.sql_ccpp, "sql_ccpp");
		cargarXML(db, R.raw.sql_tablas_adi, "sql_tablas");
		cargarXML(db, R.raw.sql_unidad_medida, "sql_maestro");
	//	cargarXML(db, R.raw.sql_cccp_grupo1, "sql_ccpp_grupo1");
	//	cargarXML(db, R.raw.sql_cccp_grupo2, "sql_ccpp_grupo2");
	//	cargarXML(db, R.raw.sql_cccp_grupo3, "sql_ccpp_grupo3");	
	//	cargarXML(db, R.raw.sql_cccp_grupo4, "sql_ccpp_grupo4");
		cargarXML(db, R.raw.sql_cccp_grupo5, "sql_ccpp_grupo5");

		// cargarXML(db, R.raw.sql_data_maestro, "sql_datamaestro");
		crearVistasCobertura(db);
	}

	@Override
	public void crearVistasCobertura(SQLiteDatabase db) {
		// cargarXML(db, R.raw.sql_vistas_cartografia, "view");
//		actualizacion2018(db);		
		cargarXML(db, R.raw.sql_vistas, "view");
		// cargarXML(db, R.raw.sql_vistas_report, "view");
		cargarXML(db, R.raw.sql_vistascobertura, "view");
		// cargarXML(db, R.raw.sql_modify_schemadb, "view");*/
	}
	
//	private void actualizacion2018(SQLiteDatabase db){	
//		cargarXML(db, R.raw.sql_sistema_update, "sql_sistema");
//		addColumnIfNotExist(db, CuestionarioDAO.TABLA_MODULOIX_DET06,"C9P909_2_1", "ALTER TABLE "+CuestionarioDAO.TABLA_MODULOIX_DET06 +" ADD COLUMN C9P909_2_1 VARCHAR(300) NULL;");
//		addColumnIfNotExist(db, CuestionarioDAO.TABLA_MODULOIX_DET06,"C9P909_3_1", "ALTER TABLE "+CuestionarioDAO.TABLA_MODULOIX_DET06 +" ADD COLUMN C9P909_3_1 VARCHAR(300) NULL;");
//		
//		addColumnIfNotExist(db, CuestionarioDAO.TABLA_MODULOIX_DET07,"C9P910_2_1", "ALTER TABLE "+CuestionarioDAO.TABLA_MODULOIX_DET07 +" ADD COLUMN C9P910_2_1 VARCHAR(300) NULL;");
//		addColumnIfNotExist(db, CuestionarioDAO.TABLA_MODULOIX_DET07,"C9P910_3_1", "ALTER TABLE "+CuestionarioDAO.TABLA_MODULOIX_DET07 +" ADD COLUMN C9P910_3_1 VARCHAR(300) NULL;");
//		addColumnIfNotExist(db, CuestionarioDAO.TABLA_MODULOIX_DET07,"C9P910_6_1", "ALTER TABLE "+CuestionarioDAO.TABLA_MODULOIX_DET07 +" ADD COLUMN C9P910_6_1 VARCHAR(300) NULL;");
//
//		addColumnIfNotExist(db, CuestionarioDAO.TABLA_MODULOIX_DET08,"C9P911_2_1", "ALTER TABLE "+CuestionarioDAO.TABLA_MODULOIX_DET08 +" ADD COLUMN C9P911_2_1 VARCHAR(300) NULL;");
//		addColumnIfNotExist(db, CuestionarioDAO.TABLA_MODULOIX_DET08,"C9P911_3_1", "ALTER TABLE "+CuestionarioDAO.TABLA_MODULOIX_DET08 +" ADD COLUMN C9P911_3_1 VARCHAR(300) NULL;");
//	}

}

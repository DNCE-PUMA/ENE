package gob.inei.ene2019v2.service;

import gob.inei.dnce.dao.SQLiteDAO;
import gob.inei.ene2019v2.dao.MyDatabaseHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public abstract class Service {

	protected SQLiteDAO sqliteDAO;
	private Context context;
	protected MyDatabaseHelper dbh;
	public static final String DATABASE_NAME = "bdEne2019_desarrollo.db";
	public static final int DATABASE_VERSION = 4;
	
	public Service(Context ctx) {
		this.context=ctx;
		this.dbh = new MyDatabaseHelper(ctx, DATABASE_NAME, DATABASE_VERSION);
	}
	
	public SQLiteDatabase startTX() {
		return null;
	}
		
	public void commitTX(SQLiteDatabase dbTX) {
		
	}
	
	public void endTX(SQLiteDatabase dbTX) {
		
	}
	
}

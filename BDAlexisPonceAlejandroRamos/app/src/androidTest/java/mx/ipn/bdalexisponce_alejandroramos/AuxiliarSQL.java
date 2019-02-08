package mx.ipn.bdalexisponce_alejandroramos;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AuxiliarSQL extends SQLiteOpenHelper{
    String SQL_Tabla = "CREATE TABLE Muestra ("+ "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "NOMBRE TEXT)";

    public AuxiliarSQL(Context context, String DBname, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DBname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase baseDatos) {
        baseDatos.execSQL(SQL_Tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase baseDatos, int oldVersion, int newVersion) {
        baseDatos.execSQL("DROP TABLE IF EXISTS Muestra");
        baseDatos.execSQL(SQL_Tabla);

    }
}

package app.com.davgod.memento.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final Integer DATABASE_VERSION = 1;
    private static final String  DATABASE_NAME = "Memento",
                                 TABLE_NOTES = "Notes";

    private static final String DATABASE_CREATE =
            "create table if not exists " + TABLE_NOTES + " (id integer primary key autoincrement, "
                    + "Description TEXTl, IsFavorite INTEGER, ImageName TEXT);";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NOTES);
        onCreate(db);

    }
}

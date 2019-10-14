package com.chamodshehanka.madrumorpaper.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "MAD.db";
    private static final int DB_VERSION = 2;
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EmployeeInfo.TABLE_NAME + " (" +
                    EmployeeInfo._ID + " PRIMARY KEY AUTOINCREMENT," +
                    EmployeeInfo.COLUMN_1 + " TEXT," +
                    EmployeeInfo.COLUMN_2 + " TEXT," +
                    EmployeeInfo.COLUMN_3 + " TEXT," +
                    EmployeeInfo.COLUMN_4 + " TEXT)";
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EmployeeInfo.TABLE_NAME;

    public DBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}

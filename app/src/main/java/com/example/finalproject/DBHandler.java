package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "distance.db";

    public static final String TABLE = "user";
    public static final String COLUMN_ID = "userid";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_REVIEW = "height";

    public DBHandler (Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DB_NAME,factory,DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " +
                TABLE + "(" +
                COLUMN_ID + "INTEGER PRIMARY KEY," +
                COLUMN_NAME + "TEXT, "+
                COLUMN_REVIEW + "NUMERIC)";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }


}

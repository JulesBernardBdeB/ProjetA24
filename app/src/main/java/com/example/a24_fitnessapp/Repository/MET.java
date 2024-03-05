package com.example.a24_fitnessapp.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MET extends SQLiteOpenHelper {

    //DB info
    static final String DB_NAME = "MET_Repo";
    static final int DB_VERSION = 1;

    //Table name and columns
    public static final String TABLE_NAME = "MET";
    public static final String _ID = "_id";
    public static final String EXERCISE_NAME = "exercise";
    public static final String MET = "met";

    public MET(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    private static final String CREATE_TABLE =  "create table " + TABLE_NAME +
            "(" + _ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " + EXERCISE_NAME + "TEXT NOT NULL, " +
            MET + "NUMBER NOT NULL);";

    private static final String INSERT_VALUES = "INSERT INTO " + TABLE_NAME + "VALUES " +
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        db.execSQL(INSERT_VALUES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

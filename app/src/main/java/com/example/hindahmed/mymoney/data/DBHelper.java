package com.example.hindahmed.mymoney.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hindahmed on 01/07/17.
 */

public class DBHelper extends SQLiteOpenHelper {


    public DBHelper(Context context) {
        super(context, Data.DB_Name, null, Data.DB_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table " + Data.Table_Name + " (" + Data.key_id + " integer, " + Data.key_Month + " integer, " + Data.key_main + " integer, " + Data.key_submain + " integer, " + Data.key_money + " integer )";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "drop table " + Data.Table_Name;
        db.execSQL(sql);
        onCreate(db);
    }
}

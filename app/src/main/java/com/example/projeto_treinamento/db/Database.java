package com.example.projeto_treinamento.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.projeto_treinamento.data_models.FilmeDataModel;

public class Database extends SQLiteOpenHelper {

    private static final String DB_NAME = "db_locadora";
    private static final int DB_VERSION = 1;


    public Database(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
        db.execSQL(FilmeDataModel.criarTabela());
            Log.i("DATABASE", "DB---> criando com sucesso!!! ");

        } catch (Exception e) {

            Log.i("DATABASE", "DB---> ERRO: " + e.getMessage());

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }


}

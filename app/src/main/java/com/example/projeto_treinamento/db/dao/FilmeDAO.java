package com.example.projeto_treinamento.db.dao;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.projeto_treinamento.data_models.FilmeDataModel;
import com.example.projeto_treinamento.db.Database;
import com.example.projeto_treinamento.models.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeDAO implements IFilmesDAO{

    private SQLiteDatabase write;
    private SQLiteDatabase read;


    public FilmeDAO(Context context){
        Database db = new Database(context);
        write = db.getWritableDatabase();
        read = db.getReadableDatabase();
    }
    @Override
    public boolean save(Filme f) {

        ContentValues cv = new ContentValues();
        cv.put("title", f.getTitle());
        cv.put("genero",f.getGender());
        cv.put("year", f.getYear());

        try {
            write.insert(FilmeDataModel.getTABELA(), null, cv);
            Log.i("INFO", "FIlme salvo com sucesso!!!");
        } catch (Exception e) {
            Log.i("INFO", "Ocorreu um erro ao SAlvar o Filme: "+e.getMessage());
            return false;
        }

        return true;

    }

    @Override
    public boolean update(Filme f) {
        return false;
    }

    @Override
    public boolean findById(int id) {
        return false;
    }

    @Override
    public boolean delete(Filme f) {
        return false;
    }

    @SuppressLint("Range")
    @Override
    public List<Filme> list() {
    List<Filme> list = new ArrayList<>();
    String query = "SELECT * FROM "+FilmeDataModel.getTABELA() +";";
        Cursor c = read.rawQuery(query, null);
        while (c.moveToNext()){
            Filme f = new Filme();
            f.setId(c.getInt(Integer.valueOf(c.getColumnIndex("id"))));
            f.setTitle(c.getString(c.getColumnIndex("title")));
            f.setGender(c.getString(c.getColumnIndex("genero")));
            f.setYear(c.getInt(c.getColumnIndex("year")));
            list.add(f);

        }
        c.close();
        return list;
        }
}

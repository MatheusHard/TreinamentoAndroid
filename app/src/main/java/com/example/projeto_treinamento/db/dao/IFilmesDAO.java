package com.example.projeto_treinamento.db.dao;

import com.example.projeto_treinamento.models.Filme;

import java.util.List;

public interface IFilmesDAO {

    public boolean save(Filme f);
    public boolean update(Filme f);
    public boolean findById(int id);
    public boolean delete(Filme f);
    public List<Filme> list();

}

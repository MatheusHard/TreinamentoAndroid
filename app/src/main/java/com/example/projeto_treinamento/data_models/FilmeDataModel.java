package com.example.projeto_treinamento.data_models;

public class FilmeDataModel  {

    // Dados para criar as tabelas no banco de dados
    // MOR - Modelo objeto relacional
    // TUPLA ou Registros

    private final static String TABELA = "filmes";
    private final static String id = "id";
    private final static String title = "title";
    private final static String genero = "genero";
    private final static String year = "year";


    private static String queryCriarTabela = "";


    public static String criarTabela() {


        queryCriarTabela = "CREATE TABLE IF NOT EXISTS " + TABELA;
        queryCriarTabela += "(";
        queryCriarTabela += id + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += title + " VARCHAR(100), ";
        queryCriarTabela += genero + " VARCHAR(100), ";
        queryCriarTabela += year + " INTEGER ";
        queryCriarTabela += ")";

        return queryCriarTabela;
    }

    public static String zerarTabela() {

        queryCriarTabela = "DELETE FROM " + TABELA +";";

        return queryCriarTabela;
    }

    public static String getTABELA() {
        return TABELA;
    }



    public static String getQueryCriarTabela() {
        return queryCriarTabela;
    }



    // Criar dinamicamente uma query SQL para criar
    // a tabela Média Escolar no Banco de Dados



}

package com.example.projeto_treinamento.models;

import java.io.Serializable;

public class Filme implements Serializable {

    private int id;
    private String title;
    private String gender;
    private int year;

    public Filme(){}

    public Filme(String title, String gender, int year) {
        this.title = title;
        this.gender = gender;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

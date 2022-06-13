package com.example.projeto_treinamento.models;

import java.io.Serializable;

public class Filme implements Serializable {
    private String title;
    private String gender;
    private String year;

    public Filme(){}

    public Filme(String title, String gender, String year) {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

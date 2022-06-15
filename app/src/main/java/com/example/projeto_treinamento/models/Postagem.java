package com.example.projeto_treinamento.models;

import java.io.Serializable;

public class Postagem implements Serializable {

    private String title;
    private String subTitle;
    private int image;

    public Postagem() {
    }

    public Postagem(String title, String subTitle, int image) {
        this.title = title;
        this.subTitle = subTitle;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

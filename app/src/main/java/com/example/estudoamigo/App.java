package com.example.estudoamigo;

import android.app.Application;

import java.util.ArrayList;

public class App extends Application {

    private String login;
    private String password;
    private String temaText;
    private float media;
    private ArrayList<Dia> dias = new ArrayList();

    public void addDia(int year, int month, int day, String msg) {
        dias.add(new Dia(year, month, day, msg));
    }

    public String getMsg(int year, int month, int day) {
        for (Dia dia : dias) {
            if(year == dia.getAno() && month == dia.getMes() && day == dia.getDia()) {
                return dia.getMsg();
            }
        }
        return "";
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTemaText() {
        return temaText;
    }

    public void setTemaText(String text) {
        this.temaText = text;
    }


 }

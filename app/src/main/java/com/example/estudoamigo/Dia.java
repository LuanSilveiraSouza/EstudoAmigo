package com.example.estudoamigo;

public class Dia {

    private int ano;
    private int mes;
    private int dia;
    private String msg;

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Dia(int ano, int mes, int dia, String msg) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

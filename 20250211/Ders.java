package com.example.uygulama1;

public class Ders {

    public String dersAdi;
    public double yazili1;
    public double yazili2;

    public Ders(String dersAdi , double yazili1, double yazili2){
        this.dersAdi=dersAdi;
        this.yazili1=yazili1;
        this.yazili2=yazili2;
    }
    public double ortalamahesap(){
        double ortalama;
        ortalama=(yazili1+yazili2)/2;
        return ortalama;
    }
    public String gectiMi(){
        return ortalamahesap() >=50 ? "Gecti" : "Kaldı";
    }
    public String getDersAdi(){
        return dersAdi;
    }
}

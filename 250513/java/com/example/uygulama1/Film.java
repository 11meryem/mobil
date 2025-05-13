package com.example.uygulama1;

import java.io.Serializable;

public class Film implements Serializable {
    int afis;
    String ad;
    int yil;
    String yonetmen;
    String konu;
    float puan;

    public Film(int afis, String ad, int yil, String yonetmen, String konu, float puan) {
        this.afis = afis;
        this.ad = ad;
        this.yil = yil;
        this.yonetmen = yonetmen;
        this.konu = konu;
        this.puan = puan;
    }


    public int getAfis() {
        return afis;
    }

    public void setAfis(int afis) {
        this.afis = afis;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public float getPuan() {
        return puan;
    }

    public void setPuan(float puan) {
        this.puan = puan;
    }
}

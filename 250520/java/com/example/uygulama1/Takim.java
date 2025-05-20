package com.example.uygulama1;

import java.io.Serializable;

public class Takim implements Serializable {
    int logo;
    String ad;
    String yil;
    String aciklama;

    public Takim(int logo, String ad, String yil, String aciklama) {
        this.logo = logo;
        this.ad = ad;
        this.yil = yil;
        this.aciklama = aciklama;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYil() {
        return yil;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}

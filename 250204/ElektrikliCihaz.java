package com.example.uygulama1;

public class ElektrikliCihaz {

    public String cihazAdi;
    public double cihazGucu;
    public double gunlukKullanimSaati;

    public double aylikKullanim(){
        double aylikKullanim;
        aylikKullanim=cihazGucu*gunlukKullanimSaati*30*2.07;
        return aylikKullanim;
    }
}

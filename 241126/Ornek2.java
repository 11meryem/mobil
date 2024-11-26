package com.example.uygulama1;

public class Ornek2 {
    public static void main(String[] args) {
        selamla();
        selamla("Meryem");
        selamla("Hayri", "KOÇMARLAR");
        selamla("Meryem", "AKBAHAR");
    }
    // Aşırı Yüklenilmiş Metotlar
    public static void selamla(){
        System.out.println("Merhaba 11A");
    }
    public static void selamla(String ad){
        System.out.println("Selam "+ad);
    }

    public static void selamla(String ad, String soyad){
        System.out.println("Selam "+adSoyadBirlestir(ad,soyad));
    }

    public static String adSoyadBirlestir(String ad, String soyad){
        String adSoyad = ad + " " + soyad;
        return adSoyad;
    }
}

package com.example.uygulama1;

public class Ornek1 {
    public static void main(String[] args) {
        selamla();

        selamla2("Meryem");
        selamla2("Büşra");

        String ad =adSoyadBirlestir("Hayri", "KOÇMARLAR");
        selamla2(ad);
    }
    // Çoklu Metotlar
    public static void selamla(){
        System.out.println("Merhaba 11A");
    }
    public static void selamla2(String ad){
        System.out.println("Selam "+ad);
    }
    public static String adSoyadBirlestir(String ad, String soyad){
        String adSoyad = ad + " " + soyad;
        return adSoyad;
    }
}

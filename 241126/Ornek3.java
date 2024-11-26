package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        int sayi1;
        System.out.println("1. Sayı");
        sayi1= oku.nextInt();
        int toplam=kare(sayi1);
        System.out.println("Sonuç :"+toplam);
    }
    // Sayının Kresini Alıp Geri Döndüren Metot
    public static int kare(int sayi1){
        int sonuc = sayi1 * sayi1;
        return sonuc;
    }
}

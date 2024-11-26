package com.example.uygulama1;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        // 0-200 2tl
        // 200-300 2.5tl
        // 300 yukarı 4tl
        System.out.println("Kullandığınız Fatura Bilgisi Girin "+faturaHesapla(150));
        System.out.println("Kullandığınız Fatura Bilgisi Girin "+faturaHesapla(250));
        System.out.println("Borcunuz "+faturaHesapla(350));
    }
    // Elektrik Faturası
    public static double faturaHesapla (double miktar){
        double ucret=0;
        if(miktar <= 200){
           ucret = miktar * 2;
        }
        else if (miktar <= 300) {
            ucret = 200 * 2 + (miktar - 200) * 2.5;
        }
        else{
            ucret = 200 * 2 + 100 * 2.5 +(miktar - 300) * 4;
        }

        return ucret;
    }
}

package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float s1,s2,secim,sonuc;


        System.out.print("Sayı 1=  ");
        s1=oku.nextFloat();
        System.out.print("Sayı 2=  ");
        s2= oku.nextFloat();

        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");
        System.out.println("Seçim Yap");
        secim=oku.nextFloat();

        if(secim==1){
            sonuc=s1+s2;
        }
        else if (secim==2) {
            sonuc=s1-s2;
        }
        else if (secim==3) {
            sonuc=s1*s2;
        }
        else if (secim==4) {
            sonuc=s1/s2;
        }
    }
}

package com.example.uygulama1;

import androidx.interpolator.view.animation.FastOutLinearInInterpolator;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        float sayi1,sayi2,secim,sonuc;



        System.out.print("1.Sayıyı Gir:");
        sayi1= oku.nextFloat();
        System.out.print("2. Sayıyı Gir:");
        sayi2= oku.nextFloat();

        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");

        System.out.print("Seçim Yap: ");
        secim=oku.nextFloat();

        if(secim==1){
            sonuc=sayi1+sayi2;
        }
        else if (secim==2){
            sonuc=sayi1-sayi2;
        }
        else if (secim==3) {
            sonuc=sayi1*sayi2;
        }
        else if (secim==4)
        {
            sonuc=sayi1/sayi2;
        }








    }
}

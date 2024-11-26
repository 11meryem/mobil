package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        double s1,s2;
        System.out.println("1.Sayı");
        s1= oku.nextDouble();
        System.out.println("2.Sayı");
        s2= oku.nextDouble();
        double fark=farkhesapla(s1,s2);
        System.out.print("Fark :"+fark);
    }
    // Parametre olarak alınan iki sayı arasındaki farkı ekrana yazdırma
    public static double farkhesapla(double s1,double s2){
        if (s1>s2){
            return s1-s2;
        }
        else {
            return s2-s1;
        }
    }
}

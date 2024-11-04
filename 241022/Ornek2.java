package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        float y1,y2,ortalama;

        System.out.print("1. Yazılıyı Girin: ");
        y1=oku.nextFloat();
        System.out.print("2. Yazılıyı Girin: ");
        y2=oku.nextFloat();

        ortalama=(y1+y2)/2;
        System.out.println("Ortalama: "+ortalama);

        System.out.print("Gelemediği Gün Sayısını Girin: ");
        int devamsizlik = oku.nextInt();

        if(ortalama>=50 && devamsizlik<10){
            System.out.println("Geçti");
        }
        else{
            System.out.println("Kaldı");
        }

    }
}

package com.example.uygulama1;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        double maas,yenimaas;
        Scanner oku=new Scanner(System.in);
        System.out.println("Personel Maaşını Giriniz = ");
        maas= oku.nextDouble();
        yenimaas=maas+(maas*0.43);
        System.out.println("Yeni Maaş = "+yenimaas);

    }
}

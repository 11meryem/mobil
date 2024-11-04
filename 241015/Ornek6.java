package com.example.uygulama1;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        double maas,yenimaas,zamorani;

        System.out.print("Personel Maaşını Giriniz =  ");
        maas= oku.nextDouble();

        System.out.print("Zam Oranı =  %");
        zamorani= oku.nextDouble();

        yenimaas=maas+(maas*zamorani/100);
        System.out.println("Yeni Maaş = "+yenimaas);

    }
}

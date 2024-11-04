package com.example.uygulama1;

import java.util.Scanner;

public class Ornek8 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);



        System.out.print("Maaşı Giriniz");
        double maas=oku.nextDouble();

        System.out.println("Zam Oranını Giriniz");
        double zamOrani=oku.nextDouble();

        double yeniMaas= maas+(maas*zamOrani/100);

        System.out.println("Yeni Maaşınız "+yeniMaas);
    }
}

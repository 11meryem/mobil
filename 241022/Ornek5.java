package com.example.uygulama1;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        int sayi = oku.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + "'e kadar sayıların toplamı " + toplam);


    }
}



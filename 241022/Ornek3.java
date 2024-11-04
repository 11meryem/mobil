package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int toplam=0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " . ;Sayıyı Girin: ");
            int sayi = oku.nextInt();
            toplam += sayi;
        }

        System.out.println("Sayıların Toplamı: " + toplam);
    }
}

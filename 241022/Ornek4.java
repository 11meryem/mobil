package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int toplam=0;

        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }

        System.out.println("Sayıların Toplamı: " + toplam);
    }



}

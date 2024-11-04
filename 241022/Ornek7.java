package com.example.uygulama1;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi=oku.nextInt();
        int carpma=1;

        for (int i = 1; i <= sayi; i++) {
            carpma *= i;
        }

        System.out.println(sayi+ " Sayısının Faktöriyeli: " + carpma);
    }
}

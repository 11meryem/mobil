package com.example.uygulama1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı Gir:");
        int sayi= oku.nextInt();

        if(sayi%2==0) {
            System.out.println("Sayı Çift ");
        }
        else{
            System.out.println("Sayı Tek ");
        }

    }
}

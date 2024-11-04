package com.example.uygulama1;

import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        double a,b,c;

        System.out.print("A Kenarını Giriniz");
        a=oku.nextDouble();

        System.out.print("B kenarını Giriniz");
        b=oku.nextDouble();

        c=Math.sqrt(a*a+b*b);

        System.out.println("C Kenarı: "+c);







    }
}

package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        float kisa,uzun,cevre,alan;

        Scanner oku=new Scanner(System.in);

        System.out.print("Kısa Kenar Gir");
        kisa=oku.nextInt();

        System.out.print("Uzun Kenar Gir");
        uzun=oku.nextInt();

        cevre=(kisa+uzun)*2;
        System.out.println("Çevre = "+cevre);

        alan=kisa*uzun;
        System.out.println("Alan = "+alan);
    }
}

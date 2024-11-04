package com.example.uygulama1;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        System.out.print("Dairenin Yarıçap Değerini Giriniz");

        int r = oku.nextInt();
        double alan=Math.PI * r * r;
        double cevre= 2 * Math.PI * r;

        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi "+cevre);


    }
}

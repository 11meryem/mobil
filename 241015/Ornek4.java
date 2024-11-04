package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
         float ortalama,gecti,kaldi,y1,y2;

        System.out.print("1. Yazılı Giriniz: ");
        y1=oku.nextFloat();
        System.out.print("2. Yazılı Giriniz: ");
        y2=oku.nextFloat();

        ortalama=(y1+y2)/2;

        System.out.println("Ortalama:"+ortalama);

        if(ortalama<=50)
        {
            System.out.println("1 İle Kaldınız");
        }
        else if (ortalama>=50 && ortalama<60)
        {
            System.out.println("2 İle Geçtiniz");
        }
        else if (ortalama>=60 && ortalama<70)
        {
            System.out.println("3 İle Geçtin");
        }
        else if  (ortalama>=70 && ortalama<85)
        {
            System.out.println("4 İle Geçtiniz");
        }
        else {
            System.out.println("5 İle Geçtiniz ");
        }



    }
}

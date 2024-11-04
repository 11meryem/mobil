package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
         float derece ;


         System.out.print("Derece Gir");
        derece=oku.nextFloat();

        System.out.println("Derece: "+derece);

        if(derece<=5){
            System.out.println("Hava Çok Soğuk");
        }
        else if(derece<=20){
            System.out.println("Hava Soğuk");
        }
        else if(derece<=20 && derece<=27){
            System.out.println("Hava Normal");
        }
        else if(derece<=27 && derece<=35){
            System.out.println("Hava Sıcak");
        }
        else{
            System.out.println("Hava Çok Sıcak ");
        }


    }
}

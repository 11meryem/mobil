package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float derece;

        System.out.print("Derece Gir");
        derece=oku.nextFloat();
        System.out.println("Derece = "+derece);
        
        if (derece<=5){
            System.out.println("hava cok soguk");
        } 
        else if (derece<=20) {
            System.out.println("hava soguk");  
        }
        else if (derece>=20 && derece<=27) {
            System.out.println("hava normal");
        }
        else if (derece>=27 && derece<=30) {
            System.out.println("hava sıcak");
        }
        else{
            System.out.println("hava cok sicak");
        }
    }
}

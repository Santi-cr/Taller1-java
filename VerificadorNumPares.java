package com.mycompany.verificadornumpares;
import java.util.Scanner;

public class VerificadorNumPares {

    public static void main(String[] args) {
        
        Scanner vrf = new Scanner(System.in);
        
        double num;
        System.out.println("Ingrese un número");
        num=vrf.nextDouble();
        
        if(num % 2 == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
}

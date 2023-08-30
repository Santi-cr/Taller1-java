package com.mycompany.temperaturaconverter;
import java.util.Scanner;


public class Temperaturaconverter {

    public static void main(String[] args) {
        
        Scanner convertidor = new Scanner(System.in);
        
        double f, c;
        
        System.out.println("Ingrese una temperatura");
        c=convertidor.nextDouble();
        
        f = (9/5) * c + 32;
        
        System.out.println(c+" grados Celsius equivalen a " +f+ " grados Fahrenheit");
        
    }
}

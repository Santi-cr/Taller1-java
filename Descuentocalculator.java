package com.mycompany.descuentocalculator;
import java.util.Scanner;


public class Descuentocalculator {

    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    
    float precio, porcdescuento = 0, descuento=0, precio_total=0;
    System.out.println("Ingrese el precio del producto");
    precio = lector.nextFloat();
    
    System.out.println("Ingrese el porcentaje a descontar");
    porcdescuento = lector.nextFloat();
    
    descuento = precio * (porcdescuento / 100);
    precio_total = precio - descuento;
   
    System.out.println("El valor total del producto es " + precio_total);
    
    
    
    
    
    
    
    }
}

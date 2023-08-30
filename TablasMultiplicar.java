package com.mycompany.tablasmultiplicar;
import java.util.Scanner;


        public class TablasMultiplicar {

    public static void main(String[] args) {
        Scanner tabla = new Scanner(System.in);
        
        int número;
        System.out.println("Ingrese un número");
        número=tabla.nextInt();
        
        System.out.println("Tabla del " +número+ "\n"
        + " 1 x " + número + "=" + (1 * número) + "\n"
        + " 2 x " + número + "=" + (2 * número) + "\n"
        + " 3 x " + número + "=" + (3 * número) + "\n"
        + " 4 x " + número + "=" + (4 * número) + "\n"
        + " 5 x " + número + "=" + (5 * número) + "\n"
        + " 6 x " + número + "=" + (6 * número) + "\n"
        + " 7 x " + número + "=" + (7 * número) + "\n"
        + " 8 x " + número + "=" + (8 * número) + "\n"
        + " 9 x " + número + "=" + (9 * número) + "\n"
        + " 10 x " + número + "=" + (10 * número) + "\n");
        
        
        
    }
}

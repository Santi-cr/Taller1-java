package numerosprimos;
import java.util.Scanner;

public class NumerosPrimos {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, i, d=0;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        for(i=1; i<=num; i++){
            if(num%i==0){
                d++;
            }
            
            
        }
        if(d==2){
            System.out.println("El numero es primo");
        }
        else{
            System.out.println("El numero no es primo");
        }
        
    }
    
}

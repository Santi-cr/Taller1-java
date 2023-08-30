package calculadora_factorial;
import javax.swing.JOptionPane;
public class Calculadora_Factorial {

    
    public static void main(String[] args) {
       int i, num=0, factor=1;
       num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
       for(i=1; i<=num;i++){
           factor=factor*i;
       }
       JOptionPane.showMessageDialog(null,"El factorial de "+num+" es: " + factor);
    }
    
}

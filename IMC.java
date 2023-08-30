package com.mycompany.imc;
import javax.swing.JOptionPane;


public class IMC {

    public static void main(String[] args) {
      float peso, altura, imc;
      
      peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura en cm"));
      
      imc = peso / (altura * altura);
      
      JOptionPane.showMessageDialog(null,"El imc es : " + imc);
      
    }
}

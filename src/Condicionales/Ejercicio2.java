package Condicionales;

import javax.swing.*;

public class Ejercicio2 {
    public static void main (String[] args){
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero entero"));

        if (numero1>numero2){
            JOptionPane.showMessageDialog(null,"El numero mayor es " + numero1);
        }else{
            JOptionPane.showMessageDialog(null,"El numero mayor es " + numero2);
        }
    }
}

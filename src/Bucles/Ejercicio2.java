package Bucles;

import javax.swing.*;

// leer un número e indicar si es positivo o negativo. el proceso se repetirá hasta que se introduzca un 0
public class Ejercicio2 {
    public static void main (String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero "));

        while(numero!=0){
            if (numero>=1){
                JOptionPane.showMessageDialog(null, "El numero es positivo");

            }else{
                JOptionPane.showMessageDialog(null, "El numero es negativo");

            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero "));
        }
    }
}

package Condicionales;

import javax.swing.*;

//hacer un programa que lea un número entero y muestre si el número es multiplo de 10
public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un numero entero"));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
        }

    }
}




package Bucles;

import javax.swing.*;

// Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido
public class Ejercicio4 {
    public static void main (String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        for (int i=1; numero>0; i++){
            System.out.println("se han introducido "+i+" numeros");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        }
    }
}

package Condicionales;

import javax.swing.*;

//pedir  un número entre 0 y 99 999 y decir cuántas cifras tiene
public class Ejercicio8 {
    public static void main (String[] args){

       Double numero;
       numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 99.999"));
       if (numero<10){
           JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
       } else if (numero<100) {
           JOptionPane.showMessageDialog(null , "El numero tiene 2 cifras");
       } else if (numero<1000) {
           JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
       }else if (numero<10000) {
           JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
       }else if (numero<100000) {
           JOptionPane.showMessageDialog(null, "El numero tiene 5 cifras");
       }else{
           JOptionPane.showMessageDialog(null, "El numero esta fuera del rango pedido");
       }
    }
}

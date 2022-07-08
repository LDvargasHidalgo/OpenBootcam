package Condicionales;

import javax.swing.*;
import java.util.jar.JarEntry;

//Hacer un programa que tome dos nùmero y diga si ambos son pares o impares
public class Ejercicio6 {
    public static void main (String[] args){
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if ((numero1%2==0) && (numero2%2==0) ){
            JOptionPane.showMessageDialog(null, "Los dos numeros son pares");
        }else if ((numero1%2==0) && (numero2%2!=0) ){
            JOptionPane.showMessageDialog(null, "El numero 1 es par el numero 2 es impar");
        }else if ((numero1%2!=0) && (numero2%2==0) ){
            JOptionPane.showMessageDialog(null, "El numero 2 es par el numero 1 es impar");
        }else{
            JOptionPane.showMessageDialog(null, "los dos numeros son impares");
        }
    }
}

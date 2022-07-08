package Condicionales;

import javax.swing.*;
// cree un programa que dados 3 numeros los organice de menor  a mayor
public class Ejercicio7 {
    public static void main (String[] args){
        int numero1, numero2, numero3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));

        if ((numero1<numero2) && (numero2<numero3)){
            JOptionPane.showMessageDialog(null,numero1 +"-"+ numero2+"-"+numero3);
        } else if ((numero1<numero3) && (numero3<numero2)){
            JOptionPane.showMessageDialog(null,numero1 +"-"+ numero3+"-"+numero2);
        }else if ((numero2<numero1) && (numero1<numero3)){
            JOptionPane.showMessageDialog(null,numero2 +"-"+ numero1+"-"+numero3);
        }else if ((numero2<numero3) && (numero3<numero1)){
            JOptionPane.showMessageDialog(null,numero2 +"-"+ numero3+"-"+numero1);
        }else if ((numero3<numero1) && (numero1<numero2)){
            JOptionPane.showMessageDialog(null,numero3 +"-"+ numero1+"-"+numero2);
        }else{
            JOptionPane.showMessageDialog(null,numero3 +"-"+ numero2+"-"+numero1);
        }
    }
}

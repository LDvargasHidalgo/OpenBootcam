package Condicionales;

import javax.swing.*;
// Todos los datos que entran por JOptionPane son convertidos en string
public class CondicionalIf {
    public static void main (String[] args){
        int numero, dato=5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));

        if (numero <= dato){
            JOptionPane.showMessageDialog(null, "El numero es 5 o menor a 5");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es mayor a 5");
        }

    }
}

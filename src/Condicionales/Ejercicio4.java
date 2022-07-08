package Condicionales;

import javax.swing.*;

public class Ejercicio4   {
    public static void main (String[] args){
        float valor, valorTotal;
        valor=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de su compre"));

        if (valor>300){
            valorTotal= valor-(valor*0.20f);
            JOptionPane.showMessageDialog(null, "El valor de su compra es de $ "+ valorTotal);
        }else{
          JOptionPane.showMessageDialog(null, "El valor a pagar es $"+valor);
        }
    }
}

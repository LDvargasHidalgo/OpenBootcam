package Condicionales;

import javax.swing.*;

// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
public class Ejercicio9 {
    public static void main (String[] args){
        int dia, mes, ano;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dìa"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        ano = Integer.parseInt((JOptionPane.showInputDialog("Digite el año")));

        if ((dia>0)&&(dia<=30)){
            if((mes>0)&&(mes<=30)){
                if ((ano!=0)){
                    JOptionPane.showMessageDialog(null, "la fecha es correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "El año es incorrecto");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El mes es Incorrecto");
            }

        }else{
            JOptionPane.showMessageDialog(null, "El dia es Incorrecto");
        }
    }
}

package Condicionales;
// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
// Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja mas de 40 horas se
// le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args){
        int horasTrabajadas, horasExtra;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de horas trabajadas"));
        if(horasTrabajadas>40){
            horasExtra = horasTrabajadas-40;
            salarioTotal = (horasExtra*20)+(40*16);
        }else{
            salarioTotal=(horasTrabajadas*16);
        }
        JOptionPane.showMessageDialog(null, "Su salario esta semana es de $"+salarioTotal);
    }
}

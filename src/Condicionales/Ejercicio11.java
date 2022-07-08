package Condicionales;


import javax.swing.*;

// Construir un programa que simule el funcionamiento de una calculadora que pueda realizar las cuatro operaciones aritméticas
//básicas (suma, resta, multiplicacion y division) con valores de numéricos enteros. El usuario debe especificar la operación
//con el primer caracter del parámetro de la línea de comandos: s para la suma, r para la resta, p o m para producto y d para la
// división
public class Ejercicio11 {
    public static void main (String[] args){
        int numero1, numero2, suma, resta, multiplicacion, division;
        char operacion;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));

        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar ").charAt(0);

        switch (operacion){
            case 's':
            case 'S': suma = numero1+numero2;
                    JOptionPane.showMessageDialog(null, "la suma es:"+suma);
                    break;
            case 'r':
            case 'R': resta = numero1-numero2;
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+ resta);
                    break;
            case 'm':
            case 'M': multiplicacion = numero1*numero2;
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+ multiplicacion);
                    break;
            case  'd':
            case  'D': division= numero1/numero2;
                    JOptionPane.showMessageDialog(null, "El resultado de la division es: "+division);
                    break;

            default: JOptionPane.showMessageDialog(null, "Alguno de los datos es errado" );
        }
    }
}

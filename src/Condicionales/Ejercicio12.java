package Condicionales;

import javax.swing.*;
import java.util.Scanner;

// pedir una nota de 0 a 10 mostrarla de la forma Insuficiente, suficiente, bien, notable y sobresaliente
public class Ejercicio12 {
    public static void main (String[] args){
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nota");
        nota = entrada.nextInt();

        if (nota<=2){
            System.out.println("su nota es insuficiente");
        }else if (nota<=4){
            System.out.println("Su nota es suficiente");
        }else if (nota<=6) {
            System.out.println("Su nota es bien");
        } else if (nota<=8) {
            System.out.println("Su nota es notable");
        } else if (nota<=10) {
            System.out.println("Su nota es sobresaliente");
        }else {
            System.out.println("Su nota esta fuera del rango permitido");
        }
    }
}

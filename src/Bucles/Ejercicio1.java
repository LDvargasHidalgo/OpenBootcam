package Bucles;

import java.util.Scanner;
import java.lang.Math;
//la clase math devuelve un numero en tipo dooble
// leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
public class Ejercicio1 {
    public static void main (String[] args){
        float numero, cuadrado;
        Scanner entrada = new Scanner(System.in);


       do {
           System.out.println("Ingrese un numero para sacar su cuadrado");
           numero = entrada.nextFloat();
           cuadrado = (float) Math.pow(numero,2);
           System.out.println("El cuadrado de "+ numero + "es igual a "+ cuadrado);
       }while (numero>=0);
        System.out.println("El numero no puede ser negativo");

    }
}

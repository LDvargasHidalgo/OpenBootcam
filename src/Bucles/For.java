package Bucles;

import java.util.Scanner;

/* CICLO FOR

    for(inicializacion del iterador ; condición ; aumento o decremento){
        instrucciones;
    }
* */
public class For {
    public static void main(String[] args){
        int contador;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de números que desea imprimir en consola, imprimiremos solo los números pares");
        contador = entrada.nextInt();

        for(int i=2; i<=contador; i+=2){
            System.out.println(i);
        }
    }
}

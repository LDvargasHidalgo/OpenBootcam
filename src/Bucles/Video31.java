package Bucles;

import java.util.Scanner;

//leer números hasta que se introduzca un 0, para cada uno indicar si es par o impar
public class Video31 {
    public static void main (String[] args){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        numero = entrada.nextInt();

        while (numero!=0){
            if(numero % 2 ==0){
                System.out.println("El numero "+numero + "es par");
            }else {
                System.out.println("El numero es impar");
            }
            System.out.println("Digite otro numero");
            numero = entrada.nextInt();
        }

    }
}

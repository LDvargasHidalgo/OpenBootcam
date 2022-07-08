package Basico;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        float calificacion1, calificacion2, calificacion3, suma;
        System.out.println(" Digite 3 calificaciones");
        calificacion1 = entrada.nextFloat();
        calificacion2 = entrada.nextFloat();
        calificacion3 = entrada.nextFloat();
        suma = calificacion1+calificacion2+calificacion3;
        System.out.println("La suma de sus calificaciones es:" + suma);


    }
}

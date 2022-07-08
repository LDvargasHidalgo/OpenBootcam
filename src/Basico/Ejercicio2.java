package Basico;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        float salarioSemanal, horasTrabajadas, tarifaXhora;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas horas trabajo el empleado esta semana");
        horasTrabajadas = entrada.nextFloat();
        System.out.println("Cual es la tarifa por hora trabajada");
        tarifaXhora = entrada.nextFloat();
        salarioSemanal = horasTrabajadas * tarifaXhora;
        System.out.println("Su salario de esta semana es: $"+ salarioSemanal);
    }
}

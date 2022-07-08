package Condicionales;

import java.util.Scanner;

//Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial de 1000
// dólares, con el siguiente menú de opciones:
//
//1. Ingresar dinero a la cuenta.
//2. Retirar dinero de la cuenta.
//3. Salir
public class Cajero13 {
    public static void main (String[] args){

        int opcion,cantidadTransaccion, saldo = 1000;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido escoja la transaccion que desea realizar \n 1. Ingresar dinero a la cuenta" +
                "\n 2.Retirar dinero de la cuenta \n 3. Salir \n");
        opcion = entrada.nextInt();

        if (opcion == 1){
            System.out.println("Ingrese la cantidad de dinero que desea consignar");
            cantidadTransaccion = entrada.nextInt();
            saldo += cantidadTransaccion;
            System.out.println("Su nuevo saldo es de: $"+saldo);
        } else if (opcion == 2){
            System.out.println("Ingrese la cantidad de dinero que desea retirar de su cuenta");
            cantidadTransaccion = entrada.nextInt();
            if ((cantidadTransaccion>0)&&(cantidadTransaccion<=saldo)){
                saldo -= cantidadTransaccion;
                System.out.println("Su nuevo saldo es de $" + saldo);
            }else{
                System.out.println("Su saldo es insuficiente para la transaccion");
            }
        } else if (opcion == 3) {
            System.out.println(" Gracias por preferirnos feliz tarde");
        }else{
            System.out.println("Su opcion no se encuentra disponible, Feliz dia");
        }
    }
}

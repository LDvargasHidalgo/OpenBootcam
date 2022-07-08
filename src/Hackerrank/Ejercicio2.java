package Hackerrank;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        int N;
        Scanner entrada =  new Scanner(System.in);
        System.out.println("ingrese un numero entero menor o igual a  100");
        N = entrada.nextInt();

        if ((N>1)&(N<100)){
            if(N%2==0){
                System.out.println("Not Weird");
            }else{
                System.out.println("Weird");
            }
        }else{
            System.out.println("El numero debe ser entero menor o igual a 100");
        }
    }
}

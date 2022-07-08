package Condicionales;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String[] args){
        int dia, mes, adno;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año");
        adno = entrada.nextInt();


        if ((mes == 2) && (adno % 4 == 0) && (adno % 100 != 0) && (dia>=1) && (dia<=29)){
            System.out.println("el año es bisiesto");
             } else if ((mes == 2) && (adno % 4 != 0)  && (dia>=1) && (dia<=28)) {
                 System.out.println("El año no es bisiesto");
        }else{
            System.out.println("los datos ingresados no son correctos");
        }

    }
}

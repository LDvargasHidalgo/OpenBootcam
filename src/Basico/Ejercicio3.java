package Basico;

import java.util.Scanner;

//Guillermo tiene N dolares. Luis tiene la mitad de lo que posee guillermo. Juan posee la mitad de lo que
//poseen Luis y Guillermo juntos. hacer un programa que imprima la cantidad de dinero que poseen entre los tres
public class Ejercicio3 {
    public static void main (String[] args){
        float luis, guillermo, juan, total;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuanto dinero tiene Guillermo");
        guillermo = entrada.nextFloat();
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        total = guillermo+luis+juan;
        System.out.println("Entre Gillermo, Luis y Juan tienen: $"+total);
    }
}

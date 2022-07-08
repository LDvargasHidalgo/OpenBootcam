package Hackerrank;

import java.util.Scanner;
//Nota: Si utiliza el método nextLine() inmediatamente después del método nextInt(),
// recuerde que nextInt() lee tokens de enteros; debido a esto, el último carácter
// de nueva línea para esa línea de entrada de enteros está todavía en cola en el buffer
// de entrada y el siguiente nextLine() estará leyendo el resto de la línea de enteros (que está vacía).

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        String s= scan.nextLine();

        System.out.println(s);
        System.out.println(i);
    }
}

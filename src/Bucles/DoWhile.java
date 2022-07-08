package Bucles;

//se diferencia del while en que las instrucciones se cmplen aol menos una vez y despues si se mira si la condición se cumple

public class DoWhile {
    public static void main (String[] args){

        int numero=11;
        do{
            System.out.println(numero);
            numero++;
        }while (numero<=10);
        System.out.println(numero);
    }
}

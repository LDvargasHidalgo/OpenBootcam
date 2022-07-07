package OpenBootcamp;

public class EjercicioBucles_OpenBootcamp {
    public static void main (String[] args){
        int numero = 0;
        String estacion = "invierno";


        //PRIMER EJERCICIO
        /*int numero = -3;
        if (numero>0){
            System.out.println("El numero "+numero + " es positivo");
        } else if (numero<0) {
            System.out.println("El numero "+numero + " es negativo");
        }else {
            System.out.println("El numero es 0");
        }*/

        //SEGUNDO EJERCICIO BUCLE WHILE
        /*

        while (numero<3){
            numero++;
            System.out.println(numero);
        }*/

        //TERCER EJERCICIO BUCLE DO WHILE
        /*do{
            numero++;
            System.out.println(numero);
            break;
        }while(numero<3);*/

        //EJERCICIO 4 BUCLE FOR
        /*for(int i=0; i<3; i++){
            System.out.println(i);
        }*/

        // EJERCICIO 5 SWITCH
         switch (estacion){
             case "verano":
                 System.out.println("Vamos para la playa es "+ estacion);
                 break;
             case "otoño":
                 System.out.println("Debemos recoger hojas es "+ estacion);
                 break;
             case "primavera":
                 System.out.println("Que hermoso florece el jardin por que es "+ estacion);
                 break;
             case "invierno":
                 System.out.println("Hora de ponerse un buen abrigo estamos en "+ estacion);
                 break;
             default:
                 System.out.println("Esta estacion no la conozco =(");
         }
    }
}

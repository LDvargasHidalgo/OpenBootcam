package OpenBootcamp;

import jdk.swing.interop.SwingInterOpUtils;

public class Objetos {
    public static void main (String[] args){
       Coche miCoche = new Coche(2,120);
       miCoche.acelerar();
       miCoche.acelerar();
       System.out.println("La velocidad actual de mi coche es"+miCoche.velocidadActual);
       System.out.println("El numero de puertas que tiene mi coche es: "+miCoche.numeroPuertas);
       System.out.println("La velocidad maxima de mi coche es"+miCoche.velocidadMaxima);

        Coche miCoche2 = new Coche();
        System.out.println("La velocidad actual de mi coche es"+miCoche2.velocidadActual);
        System.out.println("El numero de puertas que tiene mi coche es: "+miCoche2.numeroPuertas);
        System.out.println("La velocidad maxima de mi coche es"+miCoche2.velocidadMaxima);
    }
}

class Coche{
    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    //CONSTRUCTOR CON PARAMETROS
    public Coche(int puertas, int velocidad){
        numeroPuertas=puertas;
        velocidadMaxima=velocidad;
    }

    public Coche(){
        numeroPuertas=6;
        velocidadMaxima=180;
    }

    public void acelerar() {
        velocidadActual+=15;
    }
    public void desacelerar() {}
}

// un constructor no devuelve ningun tipo de dato
//El nombre debe ser igual al nombre de la clase
package OpenBootcamp;

public class _openBootcamp {
    public static void main (String[] args){
        int resultado = suma(2,5,6);
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.aumPuertas();
        System.out.println(miCoche.numPuertas);

    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    public static class coche{
        int numPuertas = 0;

        public void  aumPuertas(){
            this.numPuertas++;
        }

    }
}

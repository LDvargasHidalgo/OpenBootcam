package OpenBootcamp;

public class Publicas_Privadas {
    public static void main (String[] args){
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setTipo("Coche");
        vehiculo1.setRapido(false);
        boolean rapido = vehiculo1.isRapido();
        String tipo = vehiculo1.getTipo();
        System.out.println(tipo);
        System.out.println("El vehiculo 1 es rapido:"+ rapido);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scooter");
        moto.setVelocidadMaxima(150);
        int velocidadMaxima = moto.getVelocidadMaxima();
        moto.setRapido(true);
        rapido = moto.isRapido();
        tipo = moto.getTipo();
        System.out.println(tipo);
        System.out.println("la velocidad maxima del "+tipo+velocidadMaxima);
        System.out.println("la moto es rapida?  "+ rapido);
    }
}

class Vehiculo{
   private String tipo;
   private int velocidadMaxima;
   private boolean rapido;

   public void setRapido(boolean rapido){
       this.rapido = rapido;
   }

   public boolean isRapido(){
       return this.rapido;
   }


    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setTipo(String tipo){
       this.tipo = tipo;
   }

   public String getTipo(){
       return this.tipo;
   }
}

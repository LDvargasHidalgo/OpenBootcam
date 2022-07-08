package Basico;

public class Patata {
    public static void main (String[] args){

        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);

    }

   public static class Potato{
        public int brazos = 0;

        public void QuitarBrazo(){
            this.brazos--;
       }
   }
}

package OpenBootcamp;

public class EjercicioTema8 {
    public static void main (String[] args){
        Persona persona1 = new Persona();
        persona1.setEdad(25);
        persona1.setNombre("Daniela");
        persona1.setTelefono(1234565);
        System.out.println(persona1.getNombre()+" tiene "+persona1.getEdad()+" años, su numero telefonico es: "+ persona1.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

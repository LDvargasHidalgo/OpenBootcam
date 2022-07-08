package OpenBootcamp;

public class EjercicioTema9 {
    public static void main (String[] args){

        Cliente cliente1 = new Cliente(25,"Daniela",3215623,100000);
        System.out.println(cliente1.mostrarDatos());

        Trabajador trabajador1 = new Trabajador(32, "Julian", 310785411,530000);
        System.out.println("\n \n"+trabajador1.mostrarDatos());

    }
}
class Persona2 {
    int edad;
    String nombre;
    int telefono;

    //CONSTRUCTOR
    public Persona2(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

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

    public String mostrarDatos(){
        return "Cliete:"+ nombre +"\n edad"+ edad +" \n Telefono:"+telefono;
    }
}
class Cliente extends Persona2{
    int credito;


    //CONSTRUCTOR
    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String mostrarDatos(){
        return "Cliente: "+ nombre +"\nEdad: "+ edad +" \nTelefono: "+telefono+"\nCredito: "+credito;
    }
}

class Trabajador extends Persona2{
    int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String mostrarDatos(){
        return "Cliente: "+ nombre +"\nEdad: "+ edad +" \nTelefono: "+telefono+"\nSalario: "+ salario;
    }
}

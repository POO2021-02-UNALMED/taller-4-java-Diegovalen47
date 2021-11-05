package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    static int contador;
    
    static {
        totalPersonas = 0;
        // cedula = 0;
        contador = 0;
    }

    Persona () {
        this(null);
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this(nombre, contador);
        totalPersonas++;
        contador++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

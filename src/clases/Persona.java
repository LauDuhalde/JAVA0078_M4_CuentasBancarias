package clases;

/**
 * La clase Persona representa a una persona con nombre y edad.
 * Se utiliza como entidad asociada en otras clases, como {@code CuentaBancaria}.
 * 
 * @author Thalia Riquelme, Luis Romero, Laura Duhalde
 */
public class Persona {
    
    /** Nombre de la persona */
    private String nombre;
    
    /** Edad de la persona */
    private int edad;
    
    /**
     * Constructor de la clase Persona.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Obtiene el nombre de la persona.
     * 
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre Nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la edad de la persona.
     * 
     * @return Edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Establece la edad de la persona.
     * 
     * @param edad Edad a asignar.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Muestra la información de la persona en consola,
     * incluyendo su nombre y edad.
     */
    public void despliegaInformacion() {
        System.out.println("Nombre: " + nombre + ". Edad: " + edad + ".");
    }
}

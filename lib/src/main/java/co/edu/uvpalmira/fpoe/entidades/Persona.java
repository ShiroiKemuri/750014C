
package co.edu.uvpalmira.fpoe.entidades;

/**
 *
 * @author ramir
 */
public class Persona {
    private long identificacion;
    private String nombres;
    private String apellidos;
    private Genero genero;

    public Persona(long identificacion, String nombres, String apellidos, Genero genero) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
    }
    
    
}

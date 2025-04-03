
package co.edu.uvpalmira.fpoe.entidades;

/**
 *
 * @author ramir
 */
public class Cliente extends Persona {
    
    private long telefono;
    private String correo;
    private int puntos;

    public Cliente(long telefono, String correo, int puntos, long identificacion, String nombres, String apellidos, Genero genero) {
        super(identificacion, nombres, apellidos, genero);
        this.telefono = telefono;
        this.correo = correo;
        this.puntos = puntos;
    }
    
    
}

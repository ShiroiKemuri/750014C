package co.edu.uvpalmira.fpoe.entidades;

/**
 *
 * @author ramir
 */
public class Empleado extends Persona {
    
    private String usuario;
    private String contrasena;

    public Empleado(String usuario, String contrasena, long identificacion, String nombres, String apellidos, Genero genero) {
        super(identificacion, nombres, apellidos, genero);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
}

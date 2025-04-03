package co.edu.uvpalmira.fpoe.entidades;

/**
 *
 * @author ramir
 */
public class TipoProducto {
    
    private String descripcion;
    private short porcentajeIva;

    public TipoProducto(String descripcion, short porcentajeIva) {
        this.descripcion = descripcion;
        this.porcentajeIva = porcentajeIva;
    }
}

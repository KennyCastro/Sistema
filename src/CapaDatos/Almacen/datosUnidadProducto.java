
package CapaDatos.Almacen;
/**
 *
 * @author KENNY
 */
public class datosUnidadProducto {
    private String IdUnidad;
    private String NombreUnidad;

    public datosUnidadProducto() {
    }

    public datosUnidadProducto(String IdUnidad, String NombreUnidad) {
        this.IdUnidad = IdUnidad;
        this.NombreUnidad = NombreUnidad;
    }

    public String getIdUnidad() {
        return IdUnidad;
    }

    public void setIdUnidad(String IdUnidad) {
        this.IdUnidad = IdUnidad;
    }

    public String getNombreUnidad() {
        return NombreUnidad;
    }

    public void setNombreUnidad(String NombreUnidad) {
        this.NombreUnidad = NombreUnidad;
    }
    
    
    
}

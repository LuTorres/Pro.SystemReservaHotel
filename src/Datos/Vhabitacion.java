/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Luis Torres Patiño
 */
public class Vhabitacion {
    private int IdHabitacion;
    private String Numero;
    private String Piso;
    private String Descripcion;
    private String Caracteristicas;
    private Double Precio_Diario;
    private String Estado;
    private String Tipo_Habitacion;

    public Vhabitacion(int IdHabitacion, String Numero, String Piso, String Descripcion, String Caracteristicas, String Estado, String Tipo_Habitacion) {
        this.IdHabitacion = IdHabitacion;
        this.Numero = Numero;
        this.Piso = Piso;
        this.Descripcion = Descripcion;
        this.Caracteristicas = Caracteristicas;
        this.Estado = Estado;
        this.Tipo_Habitacion = Tipo_Habitacion;
    }

    public Vhabitacion() {
    }

    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabhitacion(int IdHabhitacion) {
        this.IdHabitacion = IdHabhitacion;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getPiso() {
        return Piso;
    }

    public void setPiso(String Piso) {
        this.Piso = Piso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristica) {
        this.Caracteristicas = Caracteristicas;
    }

    public Double getPrecio_Diario() {
        return Precio_Diario;
    }

    public void setPrecio_Diario(Double Precio_Diario) {
        this.Precio_Diario = Precio_Diario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTipo_Habitacion() {
        return Tipo_Habitacion;
    }

    public void setTipo_Habitacion(String Tipo_Habitacion) {
        this.Tipo_Habitacion = Tipo_Habitacion;
    }
      
             
    
}

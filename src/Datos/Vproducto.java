/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Luis Torres Patiño
 */
public class Vproducto {
    
    private int IdProducto;
    private String Nombre;
    private String Descripcion;
    private String Unidad_Medida;
    private Double Precio_Venta;

    public Vproducto() {
    }

    public Vproducto(int IdProducto, String Nombre, String Descripcion, String Unidad_Medida, Double Precio_Venta) {
        this.IdProducto = IdProducto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Unidad_Medida = Unidad_Medida;
        this.Precio_Venta = Precio_Venta;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUnidad_Medida() {
        return Unidad_Medida;
    }

    public void setUnidad_Medida(String Unidad_Medida) {
        this.Unidad_Medida = Unidad_Medida;
    }

    public Double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(Double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }
    
    
    
    
}

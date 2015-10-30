
package Datos;

/**
 *
 * @author Luis Torres Patiño
 */
public class Vconsumo {
    private int IdConsumo;
    private int IdReserva;
    private int IdProducto;
    private Double Cantidad;
    private Double Precio_Venta;
    private String Estado;

    public Vconsumo() {
    }

    public Vconsumo(int IdConsumo, int IdReserva, int IdProducto, Double Cantidad, Double Precio_Venta, String Estado) {
        this.IdConsumo = IdConsumo;
        this.IdReserva = IdReserva;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
        this.Precio_Venta = Precio_Venta;
        this.Estado = Estado;
    }

    public int getIdConsumo() {
        return IdConsumo;
    }

    public void setIdConsumo(int IdConsumo) {
        this.IdConsumo = IdConsumo;
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int IdReserva) {
        this.IdReserva = IdReserva;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public Double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(Double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}

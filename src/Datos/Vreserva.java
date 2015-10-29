
package Datos;

import java.sql.Date;

public class Vreserva {
    
    private int IdReserva;
    private int IdHabitacion;
    private int IdCliente;
    private int IdTrabajador;
    private String Tipo_Reserva;
    private Date Fecha_Reserva;
    private Date Fecha_Ingresa;
    private Date Fecha_Salida;
    private Double Costo_Alojamiento;
    private String Estado;

    public Vreserva() {
    }

    public Vreserva(int IdReserva, int IdHabitacion, int IdCliente, int IdTrabajador, String Tipo_Reserva, Date Fecha_Reserva, Date Fecha_Ingresa, Date Fecha_Salida, Double Costo_Alojamiento, String Estado) {
        this.IdReserva = IdReserva;
        this.IdHabitacion = IdHabitacion;
        this.IdCliente = IdCliente;
        this.IdTrabajador = IdTrabajador;
        this.Tipo_Reserva = Tipo_Reserva;
        this.Fecha_Reserva = Fecha_Reserva;
        this.Fecha_Ingresa = Fecha_Ingresa;
        this.Fecha_Salida = Fecha_Salida;
        this.Costo_Alojamiento = Costo_Alojamiento;
        this.Estado = Estado;
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int IdReserva) {
        this.IdReserva = IdReserva;
    }

    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(int IdHabitacion) {
        this.IdHabitacion = IdHabitacion;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdTrabajador() {
        return IdTrabajador;
    }

    public void setIdTrabajador(int IdTrabajador) {
        this.IdTrabajador = IdTrabajador;
    }

    public String getTipo_Reserva() {
        return Tipo_Reserva;
    }

    public void setTipo_Reserva(String Tipo_Reserva) {
        this.Tipo_Reserva = Tipo_Reserva;
    }

    public Date getFecha_Reserva() {
        return Fecha_Reserva;
    }

    public void setFecha_Reserva(Date Fecha_Reserva) {
        this.Fecha_Reserva = Fecha_Reserva;
    }

    public Date getFecha_Ingresa() {
        return Fecha_Ingresa;
    }

    public void setFecha_Ingresa(Date Fecha_Ingreso) {
        this.Fecha_Ingresa = Fecha_Ingreso;
    }

    public Date getFecha_Salida() {
        return Fecha_Salida;
    }

    public void setFecha_Salida(Date Fecha_Salida) {
        this.Fecha_Salida = Fecha_Salida;
    }

    public Double getCosto_Alojamiento() {
        return Costo_Alojamiento;
    }

    public void setCosto_Alojamiento(Double Costo_Alojamiento) {
        this.Costo_Alojamiento = Costo_Alojamiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}

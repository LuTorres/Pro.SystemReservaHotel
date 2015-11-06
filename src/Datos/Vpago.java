
package Datos;

import java.sql.Date;

/**
 *
 * @author Luis Torres Patiño
 */
public class Vpago {
    private int IdPago;
    private int IdReserva;
    private String Tipo_Comprobante;
    private String Num_Comprobante;
    private Double Igv;
    private Double Total_Pago; 
    private Date Fecha_Emision;
    private Date Fecha_Pago;

    public Vpago() {
    }

    public Vpago(int IdPago, int IdReserva, String Tipo_Comprobante, String Num_Comprobante, Double Igv, Double Total_Pago, Date Fecha_Emision, Date Fecha_Pago) {
        this.IdPago = IdPago;
        this.IdReserva = IdReserva;
        this.Tipo_Comprobante = Tipo_Comprobante;
        this.Num_Comprobante = Num_Comprobante;
        this.Igv = Igv;
        this.Total_Pago = Total_Pago;
        this.Fecha_Emision = Fecha_Emision;
        this.Fecha_Pago = Fecha_Pago;
    }

    public int getIdPago() {
        return IdPago;
    }

    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int IdReserva) {
        this.IdReserva = IdReserva;
    }

    public String getTipo_Comprobante() {
        return Tipo_Comprobante;
    }

    public void setTipo_Comprobante(String Tipo_Comprobante) {
        this.Tipo_Comprobante = Tipo_Comprobante;
    }

    public String getNum_Comprobante() {
        return Num_Comprobante;
    }

    public void setNum_Comprobante(String Num_Comprobante) {
        this.Num_Comprobante = Num_Comprobante;
    }

    public Double getIgv() {
        return Igv;
    }

    public void setIgv(Double Igv) {
        this.Igv = Igv;
    }

    public Double getTotal_Pago() {
        return Total_Pago;
    }

    public void setTotal_Pago(Double Total_Pago) {
        this.Total_Pago = Total_Pago;
    }

    public Date getFecha_Emision() {
        return Fecha_Emision;
    }

    public void setFecha_Emision(Date Fecha_Emision) {
        this.Fecha_Emision = Fecha_Emision;
    }

    public Date getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(Date Fecha_Pago) {
        this.Fecha_Pago = Fecha_Pago;
    }
    
    
    
    
}

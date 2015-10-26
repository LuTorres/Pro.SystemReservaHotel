/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Luis Torres Patiño
 */
public class Vpersonas {
    private int IdPersona;
    private String Nombre;
    private String Apellidos;
    private String Tipo_Doccumento;
    private String Num_Documento;
    private String Direccion;
    private String Telefono;
    private String Email;

    public Vpersonas() {
    }

    public Vpersonas(int IdPersona, String Nombre, String Apellido, String Tipo_Doccumento, String Num_Documento, String Direccion, String Telefono, String Email) {
        this.IdPersona = IdPersona;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Tipo_Doccumento = Tipo_Doccumento;
        this.Num_Documento = Num_Documento;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTipo_Doccumento() {
        return Tipo_Doccumento;
    }

    public void setTipo_Doccumento(String Tipo_Doccumento) {
        this.Tipo_Doccumento = Tipo_Doccumento;
    }

    public String getNum_Documento() {
        return Num_Documento;
    }

    public void setNum_Documento(String Num_Documento) {
        this.Num_Documento = Num_Documento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
           
    
    
}

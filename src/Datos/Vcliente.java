/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Luis Torres Patiño
 */
public class Vcliente extends Vpersonas{
    private String Codigo_Cliente;

    public Vcliente() {
    }

    public Vcliente(String Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }

    public String getCodigo_Cliente() {
        return Codigo_Cliente;
    }

    public void setCodigo_Cliente(String Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }
    
    
    
    
}

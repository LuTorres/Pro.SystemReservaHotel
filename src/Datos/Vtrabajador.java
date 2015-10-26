/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Luis Torres Patiño
 */
public class Vtrabajador extends Vpersonas{
 Double Sueldo;
 String Acceso;
 String login;
 String Password;
 String Estado;

    public Vtrabajador() {
    }

    public Vtrabajador(Double Sueldo, String Acceso, String login, String Password, String Estado) {
        this.Sueldo = Sueldo;
        this.Acceso = Acceso;
        this.login = login;
        this.Password = Password;
        this.Estado = Estado;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getAcceso() {
        return Acceso;
    }

    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
 
 
              
    
}

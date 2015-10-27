/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Vcliente;
import Datos.Vproducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Torres Patiño
 */
public class Fcliente {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer TotalRegistro;

    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel Modelo;

        String[] titulos = {"ID", "Nombre", "Apellidos", "Tipo_Documento", "Numero_Documento", "Direccion", "Telefono", "Email", "Codigo"};

        String[] Registro = new String[9];

        TotalRegistro = 0;
        Modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.IdPersona, p.Nombre, p.Apellidos, p.Tipo_Documento, p.Num_Documento"
                + "p.Direccion, p.Telefono, p.Email, c.Codigo_Cliente from persona inner join cliente c "
                + "on p.IdPersona=c.IdPersona where Num_Documento like  '%" + Buscar + "%' order by IdPersona desc ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                Registro[0] = rs.getString("IdPersona");
                Registro[1] = rs.getString("Nombre");
                Registro[2] = rs.getString("Apellidos");
                Registro[3] = rs.getString("Tipo_Documento");
                Registro[4] = rs.getString("Num_Documento");
                Registro[5] = rs.getString("Direccion");
                Registro[6] = rs.getString("Telefono");
                Registro[7] = rs.getString("Email");
                Registro[8] = rs.getString("Codigo_Cliente");


                TotalRegistro = TotalRegistro + 1;
                Modelo.addRow(Registro);
            }
            return Modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return null;

    }

    public boolean insertar(Vcliente dts) {
        sSQL = "insert into persona(Nombre,Apellidos,Tipo_Documento,Num_Documento,Direccion,Telefono,Email )"
                + "values (?,?,?,?,?,?,?)";

        sSQL = "insert into cliente(IdPersona,Codigo_Cliente)"
                + "values (select IdPersona from Persona order by IdPersona des limit 1),?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipo_Doccumento());
            pst.setString(4, dts.getNum_Documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());


            pst2.setString(1, dts.getCodigo_Cliente());

             int n = pst.executeUpdate();

                if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                
            
            
                } else {
                    return false; 

                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;

    }

    public boolean editar(Vcliente dts) {
        sSQL = " update persona set Nombre=?, Apellido=?, Tipo_Documento=?,Num_Documento=?"
                + "Direccion=?, Telefono=?, Email=?, where IdPersona=?";
 
        sSQL2 = " update cliente set Codigo_Cliente=?,"
              + " where IdPersona=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipo_Doccumento());
            pst.setString(4, dts.getNum_Documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());
            pst.setInt(8, dts.getIdPersona());


            pst2.setString(1, dts.getCodigo_Cliente());
            pst2.setInt(2, dts.getIdPersona());

            int n = pst.executeUpdate();
            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;

                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }

    public boolean eliminar(Vcliente dts) {
        sSQL = "delete from cliente where IdPersona=?";
          sSQL2 = "delete from persona where IdPersona=?";
        
          try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            
            pst.setInt(1, dts.getIdPersona());


            pst2.setInt(1, dts.getIdPersona());

            int n = pst.executeUpdate();
            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;

                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
}

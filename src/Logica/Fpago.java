/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Vhabitacion;
import Datos.Vpago;
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
public class Fpago {

    
    
    private Conexion mysql=new Conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer TotalRegistro;
     public Double TotalConsumo;
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","IdReserva","Comprobante","Numero","Igv","Total","Fecha Emision","Fecha Pago"};
         
        String [] Registro = new String [8];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from pago where IdReserva=" + Buscar + " order by IdPago desc";
          
           
         try {
             
             Statement st = cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("IdPago");
                 Registro [1]=rs.getString("IdReserva");
                 Registro [2]=rs.getString("Tipo_Comprobante");
                 Registro [3]=rs.getString("Num_Comprobante");
                 Registro [4]=rs.getString("Igv");
                 Registro [5]=rs.getString("Total_Pago");
                 Registro [6]=rs.getString("Fecha_Emision");
                 Registro [7]=rs.getString("Fecha_Pago");
 
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
    
     }
    
     public boolean insertar (Vpago dts){
       sSQL="insert into pago(IdReserva,Tipo_Comprobante,Num_Comprobante,Igv,Total_Pago,Fecha_Emision,Fecha_Pago)" +
          "values (?,?,?,?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdReserva());
             pst.setString( 2, dts.getTipo_Comprobante());
             pst.setString( 3, dts.getNum_Comprobante());
             pst.setDouble( 4, dts.getIgv());
             pst.setDouble( 5, dts.getTotal_Pago());
             pst.setDate( 6, dts.getFecha_Emision());
             pst.setDate( 7, dts.getFecha_Pago());
              
             int n=pst.executeUpdate();
             if (n!=0){
                 return true;
             } 
             else{
                 return false;
             }
             
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return false;
  
     }
     
      public boolean editar (Vpago dts){
         sSQL=" update pago set IdReserva=?,Tipo_Comprobante=?,Num_Comprobante=?,Igv=?,Total_Pago=?,Fecha_Emision=?,Fecha_Pago=?"+
          " where IdPago=?";           
                 
          try {
              PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdReserva());
             pst.setString( 2, dts.getTipo_Comprobante());
             pst.setString( 3, dts.getNum_Comprobante());
             pst.setDouble( 4, dts.getIgv());
             pst.setDouble( 5, dts.getTotal_Pago());
             pst.setDate( 6, dts.getFecha_Emision());
             pst.setDate( 7, dts.getFecha_Pago());
              
             pst.setInt( 8, dts.getIdPago());
             
             int n=pst.executeUpdate();
             if (n!=0){
                 return true;
               } 
             else{
                 return false;
             }
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
            return false;
         }
    
         
  
     }
    
       public boolean eliminar (Vpago dts){
        sSQL="delete from pago where IdPago=?";
           try {
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             
             pst.setInt( 1, dts.getIdPago());
              
             int n=pst.executeUpdate();
             if (n!=0){
                 return true;
             } 
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return false;
  
     } 
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Vhabitacion;
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
public class Fproducto {

    
    
    private Conexion mysql=new Conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer TotalRegistro;
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","Producto","Descripcion","Unidad Medida","Precio Venta",};
         
        String [] Registro = new String [5];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from producto where Nombre like'%" + Buscar + "%' order by IdProducto desc ";
          
           
         try {
             
             Statement st = cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("IdProducto");
                 Registro [1]=rs.getString("Nombre");
                 Registro [2]=rs.getString("Descripcion");
                 Registro [3]=rs.getString("Unidad_Medida");
                 Registro [4]=rs.getString("Precio_Venta");
 
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
    
     }
    
     public boolean insertar (Vproducto dts){
       sSQL="insert into producto(Nombre,Descripcion,Unidad_Medida,Precio_Venta)" +
          "values (?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setString( 1, dts.getNombre());
             pst.setString( 2, dts.getDescripcion());
             pst.setString( 3, dts.getUnidad_Medida());
             pst.setDouble( 4, dts.getPrecio_Venta());

              
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
     
      public boolean editar (Vproducto dts){
         sSQL=" update producto set Nombre=?,Descripcion=?,Unidad_Medida=?Precio_Venta=?"+
          " where IdProducto=?";           
                 
          try {
              PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setString( 1, dts.getNombre());
             pst.setString( 2, dts.getDescripcion());
             pst.setString( 3, dts.getUnidad_Medida());
             pst.setDouble( 4, dts.getPrecio_Venta());
      
             pst.setInt( 5, dts.getIdProducto());
              
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
    
       public boolean eliminar (Vproducto dts){
        sSQL="delete from producto where IdProducto=?";
           try {
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             
             pst.setInt( 1, dts.getIdProducto());
              
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

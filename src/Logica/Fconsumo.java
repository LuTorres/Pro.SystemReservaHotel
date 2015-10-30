 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Vconsumo;
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
public class Fconsumo {

    
    
    private Conexion mysql=new Conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer TotalRegistro;
    public Double TotalConsumo;
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","IdReserva","IdProducto","Producto","Cantidad","Precio_Venta","Estado"};
         
        String [] Registro = new String [7];
        
        TotalRegistro=0;
        TotalConsumo=0.0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select c.IdConsumo,c.IdReserva,c.IdProducto,p.Nombre,c.Cantidad,c.Precio_Venta "
                + " c.Estado from consumo c inner join producto p on c.IdProducto=p.IdProducto" 
                + " where c.IdReserva ="+ Buscar + " order by IdConsumo desc ";
          
           
         try {
             
             Statement st = cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("IdConsumo");
                 Registro [1]=rs.getString("IdReserva");
                 Registro [2]=rs.getString("IdProducto");
                 Registro [3]=rs.getString("Nombre");
                 Registro [4]=rs.getString("Cantidad ");
                 Registro [5]=rs.getString("Precio_Venta");
                 Registro [6]=rs.getString("Estado");
                 
                 TotalRegistro=TotalRegistro+1;
                 TotalConsumo=TotalConsumo +(rs.getDouble("Cantidad") * rs.getDouble("Precio_Venta"));
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
    
     }
    
     public boolean insertar (Vconsumo dts){
       sSQL="insert into consumo (IdReserva,IdProducto,Cantidad,Precio_Venta,Estado)" +
          "values (?,?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdReserva());
             pst.setInt( 2, dts.getIdProducto());
             pst.setDouble( 3, dts.getCantidad());
             pst.setDouble( 4, dts.getPrecio_Venta());
             pst.setString( 5, dts.getEstado() );

              
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
     
      public boolean editar (Vconsumo dts){
         sSQL=" update consumo set IdReserva=?,IdProducto=?,Cantidad=?Precio_Venta=?,Estado=?"+
          " where IdConsumo=?";           
                 
          try {
              PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdReserva());
             pst.setInt( 2, dts.getIdProducto());
             pst.setDouble( 3, dts.getCantidad());
             pst.setDouble( 4, dts.getPrecio_Venta());
             pst.setString( 5, dts.getEstado() );
             
             pst.setInt( 6, dts.getIdConsumo());
              
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
    
       public boolean eliminar (Vconsumo dts){
        sSQL="delete from consumo where IdConsumo=?";
           try {
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             
             pst.setInt( 1, dts.getIdConsumo() );
              
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

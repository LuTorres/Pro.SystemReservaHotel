/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Vhabitacion;
import Datos.Vproducto;
import Datos.Vreserva;
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
public class Freserva {

    
    
    private Conexion mysql=new Conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer TotalRegistro;
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","IdHabitacion","Numero","IdCliente","Cliente","IdTrabajador","Trabajador","Tipo_Reserva","Fecha_Reserva","Fecha_Ingreso","Fecha_Salida","Costo","Estado"};
         
        String [] Registro = new String [13];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select r.IdReserva,r.IdHabitacion,h.Numero,r.IdCliente,"+
                "(select Nombre from persona where IdPersona=r.IdCliente)as Cliente,"+
                 "(select Apellidos from persona where IdPersona=r.IdCliente) as ClienteAp,"+
                "r,IdTrabajador,(select Nombre from persona where IdPersona=r.IdTrabajador)as Trabajadorn,"+
                "r.Tipo_Reserva,r.Fecha_Reserva,r.Fecha_Ingresa,r.Fecha_Salida,"+
                "r.Costo_Alojamiento,r.Estado from reserva r inner join Habitacion h on r.IdHabitacion=h where r.Fecha_Reserva like'%" + Buscar + "%' order by IdReserva desc ";
          
           
         try {
             
             Statement st = cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("IdReserva");
                 Registro [1]=rs.getString("IdHabitacion");
                 Registro [2]=rs.getString("Numero");
                 Registro [3]=rs.getString("IdCliente");
                 Registro [4]=rs.getString("Cliente") + " " + rs.getString("ClienteAp");
                 Registro [5]=rs.getString("IdTrabajador");
                 Registro [6]=rs.getString("Trabajadorn");
                 Registro [7]=rs.getString("Tipo_Reserva");
                 Registro [8]=rs.getString("Fecha_Reserva");
                 Registro [10]=rs.getString("Fecha_Ingresa");
                 Registro [11]=rs.getString("Costo_Alojamiento");
                 Registro [12]=rs.getString("Estado");
 
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
    
     }
    
     public boolean insertar (Vreserva dts){
       sSQL="insert into reserva (IdHabitacion,IdCliente,IdTrabajador,Tipo_Reserva,Fecha_Reserva,Fecha_Ingresa,Fecha_Salida,Costo_Alojamiento,Estado)" +
          "values (?,?,?,?,?,?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdHabitacion());
             pst.setInt( 2, dts.getIdCliente());
             pst.setInt( 3, dts.getIdTrabajador());
             pst.setString( 4, dts.getTipo_Reserva());
             pst.setDate( 5, dts.getFecha_Reserva());
             pst.setDate( 6, dts.getFecha_Ingresa());
             pst.setDate( 7, dts.getFecha_Salida());
             pst.setDouble( 8, dts.getCosto_Alojamiento());
             pst.setString( 9, dts.getEstado());
             

              
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
     
      public boolean editar (Vreserva dts){
         sSQL=" update reserva set IdHabiacion=?,IdCliente=?,IdTrabajador=?,Tipo_Reserva=?,Fecha_Reserva=?,Fecha_Ingresa=?,Fecha_Salida=?,Costo_Alojamiento=?,Estado=?"+
          " where IdReserva=?";           
                 
          try {
              PreparedStatement pst=cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdHabitacion());
             pst.setInt( 2, dts.getIdCliente());
             pst.setInt( 3, dts.getIdTrabajador());
             pst.setString( 4, dts.getTipo_Reserva());
             pst.setDate( 5, dts.getFecha_Reserva());
             pst.setDate( 6, dts.getFecha_Ingresa());
             pst.setDate( 7, dts.getFecha_Salida());
             pst.setDouble( 8, dts.getCosto_Alojamiento());
             pst.setString( 9, dts.getEstado());
             
             pst.setInt( 10, dts.getIdReserva());
              
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
    
       public boolean eliminar (Vreserva dts){
        sSQL="delete from reserva where IdReserva=?";
           try {
             PreparedStatement pst=cn.prepareStatement(sSQL); 
             
             pst.setInt( 1, dts.getIdReserva());
              
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

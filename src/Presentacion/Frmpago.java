/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import Datos.Vhabitacion;
import Datos.Vpago;
import Datos.Vproducto;
import Datos.Vreserva;
import Logica.Fconsumo;
import Logica.Fhabitacion;
import Logica.Fpago;
import Logica.Fproducto;
import Logica.Freserva;
import com.sun.org.apache.bcel.internal.generic.FCMPG;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Torres Patiño
 */
public class Frmpago extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frmpago
     */
    public Frmpago() {
        initComponents();
        mostrar(IdReserva);
        inhabilitar();
        txtIdReserva.setText(IdReserva);
        txtCliente.setText(Cliente);
        txtHabitacion.setText(Habitacion);
        txtIdHabitacion.setText(IdHabitacion);
        txtTotalReserva.setText(Double.toString(TotalReserva ));
        
        Fconsumo func = new Fconsumo();
        func.mostrar(IdReserva);
        
        txtTotal_Pago.setText(Double.toString(TotalReserva + func.TotalConsumo));
        
        
    }
    private String accion = "Guardar"; 
    public static String IdReserva;
     public static String Cliente;
      public static String IdHabitacion;
       public static String Habitacion;
        public static  Double TotalReserva;
    
    
    void ocultar_columnas() {

        TablaListado.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaListado.getColumnModel().getColumn(0).setMinWidth(0);
        TablaListado.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        TablaListadoConsumo.getColumnModel().getColumn(1).setMaxWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(1).setMinWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(1).setPreferredWidth(0);
    }
    
     void ocultar_columnasconsumo() {

        TablaListadoConsumo.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(0).setMinWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        TablaListadoConsumo.getColumnModel().getColumn(1).setMaxWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(1).setMinWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        TablaListadoConsumo.getColumnModel().getColumn(2).setMaxWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(2).setMinWidth(0);
        TablaListadoConsumo.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

    void inhabilitar() {
        txtIdPago.setVisible(false);
    
        txtIdReserva.setVisible(false);
        txtCliente.setEnabled(false);
        txtNum_Comprobante.setEnabled(false);
        cboTipo_Comprobante.setEnabled(false);
        txtIgv.setEnabled(false);
        txtTotal_Pago.setEnabled(false);
        txtTotalReserva.setEnabled(false);
        dcFecha_Emision.setEnabled(false);
        dcFecha_Pago.setEnabled(false);
        
        txtIdHabitacion.setVisible(false);
        txtHabitacion.setEnabled(false);

        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtIdPago.setText("");
        txtNum_Comprobante.setText("");
        txtIgv.setText("");
        txtTotal_Pago.setText("");

    }

    void habilitar() {
       txtIdPago.setVisible(false);
    
        txtIdReserva.setVisible(true);
        txtCliente.setEnabled(true);
        txtNum_Comprobante.setEnabled(true);
        cboTipo_Comprobante.setEnabled(true);
        txtIgv.setEnabled(true);
        txtTotal_Pago.setEnabled(true);
        txtTotalReserva.setEnabled(true);
        dcFecha_Emision.setEnabled(true);
        dcFecha_Pago.setEnabled(true);
        
        txtIdHabitacion.setVisible(true);
        txtHabitacion.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtIdPago.setText("");
        txtNum_Comprobante.setText("");
        txtIgv.setText("");
        //txtTotal_Pago.setText("");

    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Fpago func = new Fpago();
            modelo = func.mostrar(buscar);

            TablaListado.setModel(modelo);
            ocultar_columnas();
            lblTotalRegistrosConsumo.setText("Total Pagos" + Integer.toString(func.TotalRegistro));
            
            //Mostrar los datos de los consumos.....
            
            Fconsumo func2 = new Fconsumo();
            modelo= func2.mostrar(buscar);
            TablaListadoConsumo.setModel(modelo);
            ocultar_columnasconsumo();
            
            lblTotalRegistrosConsumo.setText("Total Consumo" + func2.TotalRegistro);
            lblTotalConsumo.setText("Consumo Total: $." + func2.TotalConsumo);
             


        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);


        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdPago = new javax.swing.JTextField();
        txtIdReserva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalReserva = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        txtIdHabitacion = new javax.swing.JTextField();
        cboTipo_Comprobante = new javax.swing.JComboBox();
        txtNum_Comprobante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        txtTotal_Pago = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dcFecha_Emision = new com.toedter.calendar.JDateChooser();
        dcFecha_Pago = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListadoConsumo = new javax.swing.JTable();
        lblTotalRegistrosConsumo = new javax.swing.JLabel();
        lblTotalConsumo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaListado = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        lblTotalRegistros1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pagos ..");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro De Pagos"));

        txtIdReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdReservaActionPerformed(evt);
            }
        });

        jLabel3.setText("Reserva:");

        jLabel2.setText("Habitacion: ");

        jLabel6.setText("Num Comprobante:");

        jLabel7.setText("Tipo Comprobante:");

        btnNuevo.setBackground(new java.awt.Color(0, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon("D:\\Descarga\\magnatune-icono-7207-48.png")); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/zipdisk-dev-icono-7550-32.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/firma-mala-icono-5788-32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Reserva:");

        txtHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitacionActionPerformed(evt);
            }
        });

        txtIdHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdHabitacionActionPerformed(evt);
            }
        });

        cboTipo_Comprobante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boleta", "Factura", "Ticket", "Otro", " " }));

        jLabel8.setText("Igv:");

        jLabel10.setText("Total Pago:");

        jLabel11.setText("Fecha Emision:");

        jLabel12.setText("Total Pago:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTotalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dcFecha_Emision, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(cboTipo_Comprobante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtNum_Comprobante))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(43, 43, 43))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(35, 35, 35)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11))
                                        .addGap(35, 35, 35)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIgv)
                                    .addComponent(txtTotal_Pago))))
                        .addGap(135, 135, 135))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(dcFecha_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboTipo_Comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNum_Comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTotal_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dcFecha_Emision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcFecha_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado De Consumos "));

        TablaListadoConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "Unidad Medida", "Precio Venta"
            }
        ));
        TablaListadoConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListadoConsumoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaListadoConsumo);

        lblTotalRegistrosConsumo.setText("Registros");

        lblTotalConsumo.setText("Total Consumo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTotalConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblTotalRegistrosConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalRegistrosConsumo)
                    .addComponent(lblTotalConsumo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado De Pagos"));

        TablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "Unidad Medida", "Precio Venta"
            }
        ));
        TablaListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListadoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaListado);

        btnEliminar.setBackground(new java.awt.Color(0, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar-el-campo-de-texto-icono-6959-32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(0, 255, 255));
        btnSalir1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir-de-mi-perfil-icono-3964-32.png"))); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        lblTotalRegistros1.setText("Registros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalRegistros1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir1)
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalRegistros1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdReservaActionPerformed

        txtIdReserva.transferFocus();
    }//GEN-LAST:event_txtIdReservaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        btnGuardar.setText("Guardar");
        accion = "Guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIgv.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar El Igv Del Comprobante De Pago A Generar");
            txtIgv.requestFocus();

            return;

        }
        if (txtTotal_Pago.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar El Total De Pago Del Comprobante");
            txtTotal_Pago.requestFocus();

            return;

        }

        if (txtNum_Comprobante.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar Un Numero De Comprobante Del Pago");
            txtNum_Comprobante.requestFocus();

            return;

        }

        Vpago dts = new Vpago();
        Fpago fun = new Fpago();
        dts.setIdReserva(Integer.parseInt(txtIdReserva.getText()));

     
        int  Seleccionado = cboTipo_Comprobante.getSelectedIndex();
        dts.setTipo_Comprobante((String) cboTipo_Comprobante.getItemAt(Seleccionado));
        dts.setNum_Comprobante(txtNum_Comprobante.getText());
        dts.setIgv(Double.parseDouble(txtIgv.getText()));
        dts.setTotal_Pago(Double.parseDouble(txtTotal_Pago.getText()));
        
        Calendar Cal;
        int d,m,a;
        
        Cal=dcFecha_Pago.getCalendar();
        d=Cal.get(Calendar.DAY_OF_MONTH);
       m=Cal.get(Calendar.MONTH);
       a=Cal.get(Calendar.YEAR) - 1900;
       
       dts.setFecha_Pago(new Date (a,m,d));
        
       
        Cal=dcFecha_Emision.getCalendar();
        d=Cal.get(Calendar.DAY_OF_MONTH);
       m=Cal.get(Calendar.MONTH);
       a=Cal.get(Calendar.YEAR) - 1900;
       
       dts.setFecha_Emision(new Date (a,m,d));
        
        
        if (accion.equals("Guardar")) {
            if (fun.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane,"EL PAGO PORM $." + txtTotal_Pago.getText() + 
                        "DEL SR." + txtCliente.getText() + "HA SIDO REALIZADO CON EXITO");
                mostrar(IdReserva);
                inhabilitar();
                
                // Desocupar la Habitacion
                Fhabitacion func2 = new Fhabitacion();
                Vhabitacion dts2 = new Vhabitacion();
                
                dts2.setIdHabhitacion(Integer.parseInt(txtIdHabitacion.getText()));
                func2.desocupar(dts2);
                
                // Cancelar o pagar la reserva
               Freserva func3 = new Freserva();
                Vreserva dts3 = new Vreserva();
                
                dts3.setIdReserva(Integer.parseInt(txtIdReserva.getText()));
                func3.pagar(dts3);
               
            }

        }
        else if(accion.equals("Editar") ){
            dts.setIdPago(Integer.parseInt(txtIdPago.getText()));

            if (fun.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane,"El PAGO FUE DEL SR." + txtCliente.getText() + " HA SIDO MODIFICDO CORRECTAMENTE "  );
                mostrar(IdReserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TablaListadoConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListadoConsumoMouseClicked
      
    }//GEN-LAST:event_TablaListadoConsumoMouseClicked

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionActionPerformed

    private void txtIdHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdHabitacionActionPerformed

    private void TablaListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListadoMouseClicked
        // TODO add your handling code here:
         btnGuardar.setText("Editar ");
        habilitar();
        btnEliminar.setEnabled(true);
        accion = "editar";

        int fila = TablaListadoConsumo.rowAtPoint(evt.getPoint());

        txtIdPago.setText(TablaListadoConsumo.getValueAt(fila, 0).toString() );
        //txtIdReserva.setText(TablaListadoConsumo.getValueAt(fila, 1).toString() );

        
        cboTipo_Comprobante.setSelectedItem(TablaListadoConsumo.getValueAt(fila, 2).toString() );
        txtNum_Comprobante.setText(TablaListadoConsumo.getValueAt(fila, 3).toString() );
        txtIgv.setText(TablaListadoConsumo.getValueAt(fila, 4).toString() );
        txtTotal_Pago.setText(TablaListadoConsumo.getValueAt(fila, 5).toString() );
        
        dcFecha_Emision.setDate(Date.valueOf(TablaListado.getValueAt(fila, 6).toString()));
        dcFecha_Pago.setDate(Date.valueOf(TablaListado.getValueAt(fila, 7).toString()));
    }//GEN-LAST:event_TablaListadoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
           if (!txtIdPago.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar el pago?","Confirmar",2 );

            if (confirmacion==0) {
                Fpago  fun = new Fpago();
                Vpago dts= new Vpago();

                dts.setIdPago( Integer.parseInt(txtIdPago.getText()));
                fun.eliminar(dts );
                mostrar(IdReserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmpago().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListado;
    private javax.swing.JTable TablaListadoConsumo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox cboTipo_Comprobante;
    private com.toedter.calendar.JDateChooser dcFecha_Emision;
    private com.toedter.calendar.JDateChooser dcFecha_Pago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTotalConsumo;
    private javax.swing.JLabel lblTotalRegistros1;
    private javax.swing.JLabel lblTotalRegistrosConsumo;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtIdHabitacion;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtIdReserva;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtNum_Comprobante;
    private javax.swing.JTextField txtTotalReserva;
    private javax.swing.JTextField txtTotal_Pago;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Vcliente;
import Logica.Fcliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Torres Patiño
 */
public class Frmcliente extends javax.swing.JFrame {

    /**
     * Creates new form Experimento
     */
    public Frmcliente() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    private String accion = "Guardar";
    void ocultar_columnas() {

        TablaListado.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaListado.getColumnModel().getColumn(0).setMinWidth(0);
        TablaListado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void inhabilitar() {
        txtIdPersona.setVisible(false);
    
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        
        cboTipo_Documento.setEnabled(false);
        txtNum_Documento.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtEmail.setEnabled(false);
        txtCodigo_Cliente.setEnabled(false);
        
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

        txtIdPersona.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtNum_Documento.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtCodigo_Cliente.setText("");
    }

    void habilitar() {
        txtIdPersona.setVisible(false);
    
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        
        cboTipo_Documento.setEnabled(true);
        txtNum_Documento.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtEmail.setEnabled(true);
        txtCodigo_Cliente.setEnabled(true);
        
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);

        txtIdPersona.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtNum_Documento.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtCodigo_Cliente.setText("");
        
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel Modelo;
            Fcliente func = new Fcliente();
            Modelo = func.mostrar(buscar);

            TablaListado.setModel(Modelo);
            ocultar_columnas();
            lblTotalRegistros.setText("Total registros" + Integer.toString(func.TotalRegistro));


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

        jPanel1 = new javax.swing.JPanel();
        txtIdPersona = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNum_Documento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboTipo_Documento = new javax.swing.JComboBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo_Cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTotalRegistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro De Clientes"));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel6.setText("Numero Documento");

        txtNum_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum_DocumentoActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo Documento");

        cboTipo_Documento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DMI", "LI", "CC", "REGISTRO CIVIL", "T.I" }));
        cboTipo_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipo_DocumentoActionPerformed(evt);
            }
        });

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

        jLabel4.setText("Apellidos");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel8.setText("Direccion");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel11.setText("Email");

        jLabel12.setText("Codigo :");

        txtCodigo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo_ClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(105, 105, 105))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNum_Documento)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtIdPersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTipo_Documento, javax.swing.GroupLayout.Alignment.TRAILING, 0, 187, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodigo_Cliente))))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTipo_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCodigo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Clientes ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado De Clientes"));

        TablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Documento", "Numero Doc", "Direccion", "Telefono", "Email", "Codigo"
            }
        ));
        TablaListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaListado);

        jLabel9.setText("Buscar");

        btnBuscar.setBackground(new java.awt.Color(0, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/xmag-icono-5512-32.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar-el-campo-de-texto-icono-6959-32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir-de-mi-perfil-icono-3964-32.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTotalRegistros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnBuscar)
                        .addGap(38, 38, 38)
                        .addComponent(btnEliminar)
                        .addGap(47, 47, 47)
                        .addComponent(btnSalir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalRegistros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalRegistros))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNum_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum_DocumentoActionPerformed
     txtNum_Documento.transferFocus();       
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum_DocumentoActionPerformed

    private void cboTipo_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipo_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipo_DocumentoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        btnGuardar.setText("Guardar");
        accion = "Guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         if (txtNombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar Un Nombre Para el Cliente");
            txtNombre.requestFocus();

            return;

        }
        if (txtApellidos.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar Los Apellitos Del Cliente");
            txtApellidos.requestFocus();

            return;

        }

        if (txtNum_Documento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar Un Numero De Documento Del Cliente");
        txtNum_Documento.requestFocus();

        return;

        }
        
        if (txtCodigo_Cliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar Un Codigo De Cliente");
        txtCodigo_Cliente.requestFocus();

        return;

        }

        Vcliente dts=new Vcliente();
        Fcliente fun = new Fcliente()  ;
        dts.setNombre(txtNombre.getText());

        dts.setNombre(txtNombre.getText());

        dts.setApellidos(txtApellidos.getText());

        int  Seleccionado = cboTipo_Documento.getSelectedIndex();
        dts.setTipo_Doccumento((String) cboTipo_Documento.getItemAt(Seleccionado));
        dts.setNum_Documento(txtNum_Documento.getText());
        dts.setDireccion(txtDireccion.getText());
        dts.setTelefono(txtTelefono.getText());
        dts.setEmail(txtEmail.getText());
        dts.setCodigo_Cliente(txtCodigo_Cliente.getText());
   
        if (accion.equals("Guardar ")) {
            if (fun.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane,"EL CLIENTE FUE REGISTRAD0 SATISFACTORIAMENTE");
                mostrar("");
                inhabilitar();
            }

        }
        else if(accion.equals("Editar") ){
            dts.setIdPersona(Integer.parseInt(txtIdPersona.getText()));

            if (fun.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane,"El Cliente Fue Editado Satisfactoriamente"   );
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        txtApellidos.transferFocus();
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
          txtDireccion.transferFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
          txtTelefono.transferFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
 
        txtEmail.transferFocus();  
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCodigo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo_ClienteActionPerformed
        // TODO add your handling code here:
        txtCodigo_Cliente.transferFocus();
    }//GEN-LAST:event_txtCodigo_ClienteActionPerformed

    private void TablaListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListadoMouseClicked
        btnGuardar.setText("Editar ");
        habilitar();
        btnEliminar.setEnabled(true);
        accion = "editar";

        int fila = TablaListado.rowAtPoint(evt.getPoint());

        txtIdPersona.setText(TablaListado.getValueAt(fila, 0).toString() );
        txtNombre.setText(TablaListado.getValueAt(fila, 1).toString() );

        txtApellidos.setText(TablaListado.getValueAt(fila, 2).toString() );
        cboTipo_Documento.setSelectedItem(TablaListado.getValueAt(fila, 3).toString() );
        txtNum_Documento.setText(TablaListado.getValueAt(fila, 4).toString() );
        txtDireccion.setText(TablaListado.getValueAt(fila, 5).toString() );
        txtTelefono.setText(TablaListado.getValueAt(fila, 6).toString() );
        txtEmail.setText(TablaListado.getValueAt(fila, 7).toString() );
        txtCodigo_Cliente.setText(TablaListado.getValueAt(fila, 8).toString() );
        
    }//GEN-LAST:event_TablaListadoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText() );
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (!txtIdPersona.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar el cliente?","Confirmar",2 );

            if (confirmacion==0) {
                Fcliente  fun = new Fcliente();
                Vcliente dts= new Vcliente();

                dts.setIdPersona( Integer.parseInt(txtIdPersona.getText()));
                fun.eliminar(dts );
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmcliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboTipo_Documento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo_Cliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdPersona;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum_Documento;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.DPersona;
import Datos.DTipoUsuario;
import Datos.DUsuarios;
import Datos.guardarDatos;
import Logica.LConnection;
import Logica.LEstados;
import Logica.LUsuarios;
import static Presentacion.frmMantenimiento.dpnEscritorio;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josug
 */
public class frmUsuario extends javax.swing.JInternalFrame {
    public static int control = 0;
    private LEstados es = new LEstados();
    /**
     * Creates new form frmUsuario
     */
    String accion = null;
    
    public frmUsuario() {
        initComponents();
        mostrarBuscar("");
        
        cmbEstado.setModel(es.llenarComboPersona());
        
        txtId.setVisible(false);
        txtId.setEditable(false);
        txtUsuario.setVisible(false);
        txtClave.setVisible(false);
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtCedula.setVisible(false);
        txtTelefono.setVisible(false);
        txtIdDireccion.setVisible(false);
        txtIdDireccion.setEnabled(false);
        txtDireccion.setVisible(false);
        txtDireccion.setEnabled(false);
        txtIdTipoU.setVisible(false);
        txtIdTipoU.setEnabled(false);
        txtTipoU.setVisible(false);
        txtTipoU.setEnabled(false);
        cmbEstado.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        btnBuscarDireccion.setVisible(false);
        btnBuscarTipoU.setVisible(false);
        
        lblId.setVisible(false);
        lblUsuario.setVisible(false);
        lblContraseña.setVisible(false);
        lblNombres.setVisible(false);
        lblApellidos.setVisible(false);
        lblCedula.setVisible(false);
        lblTelefono.setVisible(false);
        lblDireccion.setVisible(false);
        lblEstado.setVisible(false);
        lblTipo.setVisible(false);
    }
    
    public void mostrarBuscar(String buscar){
        try {
            DefaultTableModel miModelo;
            LUsuarios log = new LUsuarios();
            miModelo = log.mostrarUsuarios(buscar);
            tblUsuarios.setModel(miModelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificar(){
        txtId.setVisible(true);
        txtId.setEditable(false);
        txtUsuario.setVisible(true);
        txtClave.setVisible(true);
        txtNombre.setVisible(true);
        txtApellido.setVisible(true);
        txtCedula.setVisible(true);
        txtTelefono.setVisible(true);
        txtIdDireccion.setVisible(true);
        txtIdDireccion.setEnabled(false);
        txtDireccion.setVisible(true);
        txtDireccion.setEnabled(false);
        txtIdTipoU.setVisible(true);
        txtIdTipoU.setEnabled(false);
        txtTipoU.setVisible(true);
        txtTipoU.setEnabled(false);
        cmbEstado.setVisible(true);
        
        btnGuardar.setVisible(true);
        btnCancelar.setVisible(true);
        btnBuscarDireccion.setVisible(true);
        btnBuscarTipoU.setVisible(true);
        
        lblId.setVisible(true);
        lblUsuario.setVisible(true);
        lblContraseña.setVisible(true);
        lblNombres.setVisible(true);
        lblApellidos.setVisible(true);
        lblCedula.setVisible(true);
        lblTelefono.setVisible(true);
        lblDireccion.setVisible(true);
        lblTipo.setVisible(true);
        
        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnCancelarForm.setVisible(false);
        btnEliminar.setVisible(false);
        btnTipoUsuario.setVisible(false);
    }
    
    public void mostrarBotones(){
        txtId.setVisible(false);
        txtId.setEditable(false);
        txtUsuario.setVisible(false);
        txtClave.setVisible(false);
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtCedula.setVisible(false);
        txtTelefono.setVisible(false);
        txtIdDireccion.setVisible(false);
        txtIdDireccion.setEnabled(false);
        txtDireccion.setVisible(false);
        txtDireccion.setEnabled(false);
        txtIdTipoU.setVisible(false);
        txtIdTipoU.setEnabled(false);
        txtTipoU.setVisible(false);
        txtTipoU.setEnabled(false);
        cmbEstado.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        btnBuscarDireccion.setVisible(false);
        btnBuscarTipoU.setVisible(false);
        
        lblId.setVisible(false);
        lblUsuario.setVisible(false);
        lblContraseña.setVisible(false);
        lblNombres.setVisible(false);
        lblApellidos.setVisible(false);
        lblCedula.setVisible(false);
        lblTelefono.setVisible(false);
        lblDireccion.setVisible(false);
        lblTipo.setVisible(false);
        
        btnAgregar.setVisible(true);
        btnEditar.setVisible(true);
        btnCancelarForm.setVisible(true);
        btnEliminar.setVisible(true);
        btnTipoUsuario.setVisible(true);
    }

    public void limpiarCampos(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtClave.setText("");
        txtDireccion.setText("");
        txtId.setText("");
        txtIdDireccion.setText("");
        txtIdTipoU.setText("");
        txtTelefono.setText("");
        txtTipoU.setText("");
        txtUsuario.setText("");
        cmbEstado.setSelectedIndex(0);
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
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelarForm = new javax.swing.JButton();
        txtIdTipoU = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtTipoU = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnBuscarDireccion = new javax.swing.JToggleButton();
        txtIdDireccion = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnBuscarTipoU = new javax.swing.JToggleButton();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnTipoUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 104, 88));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 104, 88));

        btnCancelarForm.setText("Cancelar");
        btnCancelarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFormActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 104, 88));
        jPanel1.add(txtIdTipoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 60, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, -1));
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, -1));

        lblTipo.setText("Tipo de Usuario:");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        lblId.setText("ID:");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblNombres.setText("Nombres:");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblApellidos.setText("Apellidos:");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 250, -1));

        lblCedula.setText("Cédula de Identidad:");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lblDireccion.setText("Dirección");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 104, 88));
        jPanel1.add(txtTipoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 180, -1));

        lblTelefono.setText("Telefono:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, -1));

        btnBuscarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 40, 30));
        jPanel1.add(txtIdDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 60, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 180, -1));

        btnBuscarTipoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoUActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarTipoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 40, 30));

        lblEstado.setText("Estado:");
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 160, -1));

        btnTipoUsuario.setText("Tipo Usuario");
        btnTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 104, 88));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jButton5.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        modificar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int fila = tblUsuarios.rowAtPoint(evt.getPoint());
        txtId.setText(tblUsuarios.getValueAt(fila, 0).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(fila, 1).toString());
        txtClave.setText(tblUsuarios.getValueAt(fila, 2).toString());
        txtNombre.setText(tblUsuarios.getValueAt(fila, 3).toString());
        txtApellido.setText(tblUsuarios.getValueAt(fila, 4).toString());
        txtCedula.setText(tblUsuarios.getValueAt(fila, 5).toString());
        txtIdDireccion.setText(tblUsuarios.getValueAt(fila, 6).toString());
        txtDireccion.setText(tblUsuarios.getValueAt(fila, 7).toString());
        txtTelefono.setText(tblUsuarios.getValueAt(fila, 8).toString());
        txtIdTipoU.setText(tblUsuarios.getValueAt(fila, 9).toString());
        txtTipoU.setText(tblUsuarios.getValueAt(fila, 10).toString());
        cmbEstado.setSelectedItem(tblUsuarios.getValueAt(fila, 11).toString());
        
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblUsuarios.getSelectedRows().length > 0){
            accion = "modificar";
            modificar();
        }else{
            JOptionPane.showMessageDialog(null, "Se debe de Seleccionar un usuario");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String actualizar = null;
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Nombre obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocusInWindow();
            return;
        }
        
        if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Apellido obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtApellido.requestFocusInWindow();
            return;
        }
        
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Cedula obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtCedula.requestFocusInWindow();
            return;
        }
        
        if(txtClave.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Contraseña obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtClave.requestFocusInWindow();
            return;
        }    
        
        if(cmbEstado.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Usuario obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtApellido.requestFocusInWindow();
            return;
        }          
        
        String msg = null;
        String msg1 = null;
        String msg2 = null;
        if(txtId.getText().equals("")){
            DUsuarios dts = new DUsuarios();
            LUsuarios fun = new LUsuarios();
            DPersona dtp = new DPersona();
            DTipoUsuario dtt = new DTipoUsuario();
            
            String tipo = String.valueOf(cmbEstado.getSelectedItem());
            dtp.setNombre(txtNombre.getText());
            dtp.setApellido(txtApellido.getText());
            dtp.setCedulaIdent(txtCedula.getText());
            dtp.setTelefono(txtTelefono.getText());
            dts.setLoginUsuario(txtUsuario.getText());
            dts.setPasswordUsuario(txtClave.getText());
            dtp.setDireccionId(Integer.parseInt(txtIdDireccion.getText()));
            dts.setTipoUsuarioId(Integer.parseInt(txtIdTipoU.getText()));
            dtt.setNombre(tipo);
            msg = fun.insertarUsuarios(dts, dtp, dtt);
            mostrarBuscar("");
            if(msg == "si"){
                JOptionPane.showMessageDialog(rootPane, "Se insertó de forma correcta", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un problema al insertar", "Información", JOptionPane.ERROR);
            }
        }else if(accion.equals("modificar")){
            DUsuarios dts = new DUsuarios();
            LUsuarios fun = new LUsuarios();
            DPersona dtp = new DPersona();
            DTipoUsuario dtt = new DTipoUsuario();
            
            String tipo = String.valueOf(cmbEstado.getSelectedItem());
            dts.setIdUsuario(Integer.parseInt(txtId.getText()));
            dtp.setIdPersona(Integer.parseInt(txtId.getText()));
            dtt.setIdTipoUsuario(Integer.parseInt(txtId.getText()));
            dtp.setDireccionId(Integer.parseInt(txtIdTipoU.getText()));
            dtp.setNombre(txtNombre.getText());
            dtp.setApellido(txtApellido.getText());
            dtp.setCedulaIdent(txtCedula.getText());
            dtp.setTelefono(txtTelefono.getText());
            dts.setLoginUsuario(txtUsuario.getText());
            dts.setPasswordUsuario(txtClave.getText());
            dtt.setNombre(tipo);
            msg = fun.editarUsuarios(dts, dtp, dtt);
            mostrarBuscar("");
            modificar();
        }
        mostrarBotones();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtId.getText().equals("")){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el Usuario?", "Confirmación", 2);
            if(confirmacion == 0){
                LUsuarios func = new LUsuarios();
                DUsuarios dts = new DUsuarios();
                DPersona dtp = new DPersona();
                DTipoUsuario dtt = new DTipoUsuario();
                
                dts.setIdUsuario(Integer.parseInt(txtId.getText()));
                dtp.setIdPersona(Integer.parseInt(txtId.getText()));
                
                func.eliminarUsuarios(dts, dtp, dtt);
                mostrarBuscar("");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        mostrarBotones();
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDireccionActionPerformed
        frmVistaDireccion form = new frmVistaDireccion();
        form.setVisible(true);
        form.toFront();
        control = 2;
    }//GEN-LAST:event_btnBuscarDireccionActionPerformed

    private void btnBuscarTipoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoUActionPerformed
        frmVistaTipoU form = new frmVistaTipoU();
        form.setVisible(true);
        form.toFront();
        control = 1;
    }//GEN-LAST:event_btnBuscarTipoUActionPerformed

    private void btnCancelarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFormActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarFormActionPerformed

    private void btnTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoUsuarioActionPerformed
        frmTipoUsuario misTipoU = new frmTipoUsuario();
        dpnEscritorio.add(misTipoU);
        misTipoU.show();
    }//GEN-LAST:event_btnTipoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JToggleButton btnBuscarDireccion;
    private javax.swing.JToggleButton btnBuscarTipoU;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarForm;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnTipoUsuario;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtClave;
    public static javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtIdDireccion;
    public static javax.swing.JTextField txtIdTipoU;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    public static javax.swing.JTextField txtTipoU;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

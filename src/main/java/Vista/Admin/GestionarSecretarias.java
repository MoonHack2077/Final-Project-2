/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Admin;

import Controlador.ControladorCrud;
import Excepciones.AlmacenadoExcepcion;
import Excepciones.ContraseñaInseguraExcepcion;
import Excepciones.CorreoInvalidoExcepcion;
import Excepciones.DatoDigitadoExcepcion;
import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoCuentaConExpExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Excepciones.SinLaTerminacionCorrectaExcepcion;
import Excepciones.TelefonoCortoExcepcion;
import Modelo.Persona;
import Modelo.Secretaria;
import Validacion.Validacion;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class GestionarSecretarias extends javax.swing.JFrame {

    private ControladorCrud controlador;
    private Validacion validacion;
    
    /**
     * Creates new form GestionarSecretarias
     */
    public GestionarSecretarias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = new ControladorCrud();
        this.validacion = new Validacion();
        setEnabledInputs(false);
        llenarComboSecretarias();
   }
    
    /**
     * Metodo para activar o desactivar los botones de eliminar y editar
     * @param enabled 
     */
    private void setEnabledInputs(boolean enabled){
        btnEditar.setEnabled(enabled);
        btnEliminar.setEnabled(enabled);
        btnAñadir.setEnabled(!enabled);
    }
     
    /**
     * Metodo para limpiar el contenido de los textFields
     */   
    private void limpiarInputs(){
        txtDocumento.setText("");
        txtEdad.setText("");
        txtNombre2.setText("");
        txtContraseña.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        cbxSecretarias.setSelectedItem("Buscar una secretaria");
        txtAñosExp.setText("");
        cbxEstados.setSelectedItem("Seleccione su estado civil");
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
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        txtContraseña = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        cbxSecretarias = new javax.swing.JComboBox();
        cbxEstados = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAñosExp = new javax.swing.JTextField();
        lblValidacion = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTIONAR SECRETARIAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nombre:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Documento: ");

        jLabel5.setText("Correo:");

        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre2KeyTyped(evt);
            }
        });

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        jLabel6.setText("Contraseña:");

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel4.setText("Edad:");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        cbxSecretarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSecretariasActionPerformed(evt);
            }
        });

        cbxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su estado civil", "Casada", "Soltera", "Viuda", "Divorciada" }));

        jLabel3.setText("Años de experiencia:");

        txtAñosExp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñosExpKeyTyped(evt);
            }
        });

        lblValidacion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblValidacion.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxEstados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtContraseña)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAñosExp)))
                        .addGap(27, 27, 27)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxSecretarias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(41, 41, 41)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAñosExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(cbxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxSecretarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolver))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
     
    /**
     * Metodo que maneja el evento del boton de volver a la ventana de administrador 
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaAdmin admin = new VistaAdmin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo para que al presionar el botón botón de limpiar se limpien todos los campos
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarInputs();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Metodo para que el usuario solo digite letras en el textField del nombre
     * @param evt 
     */
    private void txtNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyTyped
        try{
            lblValidacion.setText("");
            validacion.validarSoloLetras(evt);
        }catch( DatoDigitadoExcepcion ex ){
            lblValidacion.setText(ex.getMessage());
        }
    }//GEN-LAST:event_txtNombre2KeyTyped

    /**
     * Metodo para que el usuario solo digite numeros en el textField del documento
     * @param evt 
     */
    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        try{
            lblValidacion.setText("");
            validacion.validarSoloNumeros(evt);
        }catch( DatoDigitadoExcepcion ex ){
            lblValidacion.setText(ex.getMessage());
        }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    /**
     * Metodo que maneja el evento del boton de añadir para ejecutar su accion
     * @param evt 
     */
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        try{
            //Se validan los campos
            if( txtDocumento.getText().isBlank() || txtEdad.getText().isBlank()
                || txtNombre2.getText().isBlank() || txtCorreo.getText().isBlank() 
                || txtContraseña.getText().isBlank() || txtTelefono.getText().isBlank()
                || txtAñosExp.getText().isBlank() || cbxEstados.getSelectedIndex() == 0
            ){
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                return;
            }
            
            //Hacemos mas validaciones
            validacion.verificarArroba(txtCorreo.getText());
            validacion.verificarLaTerminacionCorrecta(txtCorreo.getText());
            validacion.validarTelefono(txtTelefono.getText());
            validacion.validarContraseña(txtContraseña.getText());
            validacion.validarAñosExp(Integer.parseInt(txtAñosExp.getText()));

            //Se obtienen los valores de los textFields
            String nombre = txtNombre2.getText();
            String documento = txtDocumento.getText();
            String correo = txtCorreo.getText();
            String contraseña = txtContraseña.getText();
            String telefono = txtTelefono.getText();
            String estadoCivil = cbxEstados.getSelectedItem().toString();
            int edad = Integer.parseInt(txtEdad.getText());
            int añosExp = Integer.parseInt(txtAñosExp.getText());

            //Creamos al doctor con sus respectivos datos
            Secretaria secretaria = new Secretaria(nombre,documento,correo,contraseña,telefono,edad,añosExp,estadoCivil);

            //Verificamos se se añade el doctor
            controlador.añadirUsuario(secretaria);
            JOptionPane.showMessageDialog(null, "Secretaria con el documento: " + documento + " añadida");
            limpiarInputs();
            llenarComboSecretarias();
        }catch(MayorDeEdadExcepcion | AlmacenadoExcepcion | TelefonoCortoExcepcion
                | ContraseñaInseguraExcepcion | SinLaTerminacionCorrectaExcepcion
                | CorreoInvalidoExcepcion | NoCuentaConExpExcepcion ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    /**
     * Metodo que maneja el evento del boton de eliminar para ejecutar su accion
     * @param evt 
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            if( cbxSecretarias.getSelectedIndex()==0 ){
                JOptionPane.showMessageDialog(null, "No hay una secretaria seleccionada");
                return;
            }
            Secretaria secretaria = (Secretaria) cbxSecretarias.getSelectedItem();

            controlador.eliminarUsuario(secretaria.getDocumento());
            JOptionPane.showMessageDialog(null, "Secretaria con el documento: " + secretaria.getDocumento() + " eliminado");
            limpiarInputs();
            llenarComboSecretarias();
            setEnabledInputs(false);
        }catch(NoEncontradoExcepcion ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * Metodo que maneja el evento del boton de editar para ejecutar su accion
     * @param evt 
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
            //Se validan los campos
            if( txtDocumento.getText().isBlank() || txtEdad.getText().isBlank()
                || txtNombre2.getText().isBlank() || txtContraseña.getText().isBlank() 
                || txtCorreo.getText().isBlank() || txtTelefono.getText().isBlank()
                || txtAñosExp.getText().isBlank()  || cbxEstados.getSelectedIndex() == 0
            ){
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                return;
            }
            
            //Hacemos mas validaciones
            validacion.verificarArroba(txtCorreo.getText());
            validacion.verificarLaTerminacionCorrecta(txtCorreo.getText());
            validacion.validarTelefono(txtTelefono.getText());
            validacion.validarContraseña(txtContraseña.getText());
            validacion.validarAñosExp(Integer.parseInt(txtAñosExp.getText()));

            //Se obtienen los valores de los textFields
            String nombre = txtNombre2.getText();
            String documento = txtDocumento.getText();
            String correo = txtCorreo.getText();
            String contraseña = txtContraseña.getText();
            String telefono = txtTelefono.getText();
            String estadoCivil = cbxEstados.getSelectedItem().toString();
            int edad = Integer.parseInt(txtEdad.getText());
            int añosExp = Integer.parseInt(txtAñosExp.getText());

            //Creamos a la secretaria con sus respectivos datos
            Secretaria secretaria = new Secretaria(nombre,documento,correo,contraseña,telefono,edad,añosExp,estadoCivil);

            //Verificamos si los datos del doctor fueron editados
            controlador.editarUsuario(secretaria);
            JOptionPane.showMessageDialog(null, "Secretaria con el documento: " + documento + " editada");
            limpiarInputs();
            llenarComboSecretarias();
            setEnabledInputs(false);
        }catch(MayorDeEdadExcepcion | AlmacenadoExcepcion | TelefonoCortoExcepcion
                | ContraseñaInseguraExcepcion | SinLaTerminacionCorrectaExcepcion
                | CorreoInvalidoExcepcion | NoCuentaConExpExcepcion ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * Metodo para que el usuario solo digite numeros en el textField del edad
     * @param evt 
     */
    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        try{
            lblValidacion.setText("");
            validacion.validarSoloNumeros(evt);
        }catch( DatoDigitadoExcepcion ex ){
            lblValidacion.setText(ex.getMessage());
        }
    }//GEN-LAST:event_txtEdadKeyTyped
    
    
    /**
     * Metodo para llenar el combobox de las secretarias
     */
    private void llenarComboSecretarias(){
        cbxSecretarias.removeAllItems();
        cbxSecretarias.addItem("Buscar una secretaria");
        
        for (Persona secretaria : controlador.getLista()) {
            if( secretaria instanceof Secretaria) cbxSecretarias.addItem(secretaria);
        }       
    }
    
    /**
     * Metodo para que cada vez que se seleccione una secretaria los campos se llenen con su respeciva informacion
     * @param evt 
     */
    private void cbxSecretariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSecretariasActionPerformed
      
        if( controlador.getLista().isEmpty() ) return;

        //Si el primer elemento esta seleccionado, no es válido
        if( cbxSecretarias.getSelectedIndex()==0 ) {
            limpiarInputs();
            setEnabledInputs(false);
            return;
        }
        Secretaria secretaria = (Secretaria) cbxSecretarias.getSelectedItem();
        
        //Se verifica que la cita no sea nula
        if( secretaria != null ){
            txtDocumento.setText(secretaria.getDocumento());
            txtEdad.setText(String.valueOf(secretaria.getEdad()));
            txtNombre2.setText(secretaria.getNombre());
            txtContraseña.setText(secretaria.getContraseña());
            txtCorreo.setText(secretaria.getCorreo());
            txtTelefono.setText(secretaria.getTelefono());
            cbxEstados.setSelectedItem(secretaria.getEstadoCivil());
            txtAñosExp.setText( String.valueOf(secretaria.getAñosExp()) );
            
            setEnabledInputs(true);
        }
    }//GEN-LAST:event_cbxSecretariasActionPerformed

    /**
     * Metodo para que en el textField del año solo se puedan ingresar numeros
     * @param evt 
     */
    private void txtAñosExpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñosExpKeyTyped
        try{
            lblValidacion.setText("");
            validacion.validarSoloNumeros(evt);
        }catch( DatoDigitadoExcepcion ex ){
            lblValidacion.setText(ex.getMessage());
        }
    }//GEN-LAST:event_txtAñosExpKeyTyped

    /**
     * Metodo para que en el textField del telefono solo se puedan ingresar numeros
     * @param evt 
     */
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        try{
            lblValidacion.setText("");
            validacion.validarSoloNumeros(evt);
        }catch( DatoDigitadoExcepcion ex ){
            lblValidacion.setText(ex.getMessage());
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxEstados;
    private javax.swing.JComboBox cbxSecretarias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblValidacion;
    private javax.swing.JTextField txtAñosExp;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

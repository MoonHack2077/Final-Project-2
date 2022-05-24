/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Secretaria;

import Controlador.ControladorPaciente;
import Excepciones.AlmacenadoExcepcion;
import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Paciente;
import Modelo.Validacion;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author USER
 */
public class GestionarPacientes extends javax.swing.JFrame {

    private ControladorPaciente controlador;
    private Validacion validacion;
    /**
     * Creates new form GestionarPacientes
     */
    public GestionarPacientes() {
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorPaciente();
        this.validacion = new Validacion();
        setEnabledInputs(false);
        llenarComboPacientes();
        
        //Se añaden los botones de EPS Y SISBEN al radioGroup de salud
        salud.add(rbnEps);
        salud.add(rbnSisben);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salud = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtNombre2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbnSisben = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbnEps = new javax.swing.JRadioButton();
        txtEdad = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxPacientes = new javax.swing.JComboBox();
        cbxEstados = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTIONAR PACIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre2KeyTyped(evt);
            }
        });

        jLabel7.setText("Telefono:");

        jLabel1.setText("Nombre:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Edad:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        jLabel2.setText("Documento: ");

        rbnSisben.setText("SISBEN");

        jLabel6.setText("Contraseña:");

        rbnEps.setText("EPS");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel5.setText("Correo:");

        cbxPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPacientesActionPerformed(evt);
            }
        });

        cbxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su estado civil", "Casado", "Soltero", "Viudo", "Divorciado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCorreo)
                                            .addComponent(txtContraseña)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addComponent(btnLimpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbnSisben)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbnEps)
                                    .addComponent(cbxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(32, 32, 32)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                .addGap(37, 37, 37)
                .addComponent(cbxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnSisben)
                    .addComponent(rbnEps))
                .addGap(15, 15, 15)
                .addComponent(cbxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para resetear los campos
     */
    private void limpiarInputs(){
        txtDocumento.setText("");
        txtEdad.setText("");
        txtNombre2.setText("");
        txtContraseña.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        cbxPacientes.setSelectedItem("Buscar un paciente");
        salud.clearSelection();
        cbxEstados.setSelectedItem("Seleccione su estado civil");
    }
    
    /**
     * Metodo para activar o desactivar los botones de eliminar y editar
     * @param enabled 
     */
    private void setEnabledInputs(boolean enabled){
        btnEditar.setEnabled(enabled);
        btnEliminar.setEnabled(enabled);
        btnRegistrar.setEnabled(!enabled);
    }
    
    /**
     * Metodo que maneja el evento del boton registrar para agregar al paciente
     * @param evt 
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            //Se validan los campos
            if(
                txtNombre2.getText().isBlank() || txtDocumento.getText().isBlank() 
                || txtEdad.getText().isBlank() || txtCorreo.getText().isBlank() 
                || txtContraseña.getText().isBlank() ||  txtTelefono.getText().isBlank()
                || cbxEstados.getSelectedIndex() == 0 || ( !rbnSisben.isSelected() && !rbnEps.isSelected() ) )
            {
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                return;
            }
            //Obteniendo los datos del paciente
            String nombre = txtNombre2.getText();
            String documento = txtDocumento.getText();
            String correo = txtCorreo.getText();
            String contraseña = txtContraseña.getText();
            String telefono = txtTelefono.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            boolean hasSisben = rbnSisben.isSelected();
            boolean hasEps = rbnEps.isSelected();
            String estadoCivil = cbxEstados.getSelectedItem().toString();

            //Creamos al paciente con sus respectivos datos
            Paciente paciente = new Paciente(nombre,documento,correo,contraseña,edad,telefono,estadoCivil,hasSisben,hasEps);
            
            //Añadiendo al paciente
            controlador.añadirPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Se añadio el paciente con documento " + documento);
            limpiarInputs();
            llenarComboPacientes();
        }catch(MayorDeEdadExcepcion | AlmacenadoExcepcion ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * Metodo que maneja el evento del boton de volver para retroceder de ventana
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaSecretaria secre = new VistaSecretaria();
        secre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo que maneja el evento del boton editar para editar la informacion paciente
     * @param evt 
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
             //Se validan los campos
            if( txtNombre2.getText().isBlank() || txtDocumento.getText().isBlank() 
                || txtEdad.getText().isBlank() || txtCorreo.getText().isBlank() 
                || txtContraseña.getText().isBlank() ||  txtTelefono.getText().isBlank()
                || cbxEstados.getSelectedIndex() == 0 || ( !rbnSisben.isSelected() && !rbnEps.isSelected() )    )
            {
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                return;
            }
            //Obteniendo los datos del paciente
            String nombre = txtNombre2.getText();
            String documento = txtDocumento.getText();
            String correo = txtCorreo.getText();
            String contraseña = txtContraseña.getText();
            String telefono = txtTelefono.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            boolean hasSisben = rbnSisben.isSelected();
            boolean hasEps = rbnEps.isSelected();
            String estadoCivil = cbxEstados.getSelectedItem().toString();

            //Creamos al paciente con sus respectivos datos
            Paciente paciente = new Paciente(nombre,documento,correo,contraseña,edad,telefono,estadoCivil,hasSisben,hasEps);
            
            controlador.editarPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Se editó la información el paciente con documento " + documento);
            limpiarInputs();
            llenarComboPacientes();
            setEnabledInputs(false);
        }catch(MayorDeEdadExcepcion | NoEncontradoExcepcion ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());      
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * Metodo que maneja el evento del boton eliminar para eliminar al paciente
     * @param evt 
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            if( cbxPacientes.getSelectedIndex()==0 ){
                JOptionPane.showMessageDialog(null, "No hay un paciente seleccionado");
                return;
            }
            Paciente paciente = (Paciente) cbxPacientes.getSelectedItem();

            //Se elimina al paciente
            controlador.eliminarPaciente(paciente.getDocumento());
            JOptionPane.showMessageDialog(null, "Se eliminó el paciente con documento " + paciente.getDocumento());
            limpiarInputs();
            llenarComboPacientes();
            setEnabledInputs(false);
        }catch(NoEncontradoExcepcion ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

   /**
     * Metodo para que el usuario solo digite letras en el textField del nombre
     * @param evt 
     */
    private void txtNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyTyped
        validacion.soloLetras(evt);
    }//GEN-LAST:event_txtNombre2KeyTyped

    /**
     * Limpiar campos
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarInputs();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Metodo para que el usuario solo digite numeros en el textField del Documento
     * @param evt 
     */
    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        validacion.soloNumeros(evt);
    }//GEN-LAST:event_txtDocumentoKeyTyped

    /**
     * Metodo para que el usuario solo digite numeros en el textField del edad
     * @param evt 
     */
    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        validacion.soloNumeros(evt);
    }//GEN-LAST:event_txtEdadKeyTyped

    
    /**
     * Metodo para llenar el combobox de los pacientes
     */
    private void llenarComboPacientes(){
        cbxPacientes.removeAllItems();
        cbxPacientes.addItem("Buscar un paciente");
        
        for (Paciente paciente : controlador.getPacientes()) {
            cbxPacientes.addItem(paciente);
        }       
    }

    
    /**
     * Metodo para que cada vez que se seleccione un paciente los campos se llenen con su respeciva informacion
     * @param evt 
     */
    private void cbxPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPacientesActionPerformed
        
        if( controlador.getPacientes().isEmpty() ) return;

        //Si el primer elemento esta seleccionado, no es válido
        if( cbxPacientes.getSelectedIndex()==0 ) {
            limpiarInputs();
            setEnabledInputs(false);
            return;
        }
        Paciente paciente = (Paciente) cbxPacientes.getSelectedItem();
        //Se verifica que la cita no sea nula
        if( paciente != null ){
            txtDocumento.setText(paciente.getDocumento());
            txtEdad.setText(String.valueOf(paciente.getEdad()));
            txtNombre2.setText(paciente.getNombre());
            txtContraseña.setText(paciente.getContraseña());
            txtCorreo.setText(paciente.getCorreo());
            txtTelefono.setText(paciente.getTelefono());
            rbnEps.setSelected(paciente.hasEps());
            rbnSisben.setSelected(paciente.hasSisben());
            cbxEstados.setSelectedItem(paciente.getEstadoCivil());
            
            setEnabledInputs(true);
        }
    }//GEN-LAST:event_cbxPacientesActionPerformed
     /**
     * Metodo para que el usuario solo digite numeros en el textField de telefono
     * @param evt 
     */
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        validacion.soloNumeros(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxEstados;
    private javax.swing.JComboBox cbxPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbnEps;
    private javax.swing.JRadioButton rbnSisben;
    private javax.swing.ButtonGroup salud;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

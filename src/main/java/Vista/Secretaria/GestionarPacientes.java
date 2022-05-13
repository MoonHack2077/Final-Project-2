/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Secretaria;

import Controlador.ControladorHospital;
import Modelo.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class GestionarPacientes extends javax.swing.JFrame {

    private ControladorHospital controlador;
    /**
     * Creates new form GestionarPacientes
     */
    public GestionarPacientes(ControladorHospital controlador) {
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = controlador;
        setEnabledInputs(false);
        /*Los botones del sisben y eps se deben manejar así
        * porque el paciente solo puede tener uno de ellos, no ambos
        * Esto hace que al seleccionar uno se desmarqu el otro
        */
        botones.add(rbnSisben);
        botones.add(rbnEps);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        rbnSisben = new javax.swing.JRadioButton();
        rbnEps = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTIONAR PACIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nombre");

        jLabel2.setText("Documento");

        jLabel3.setText("Edad:");

        rbnSisben.setText("SISBEN");

        rbnEps.setText("EPS");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbnSisben)
                        .addGap(30, 30, 30)
                        .addComponent(rbnEps)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtDocumento)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnSisben)
                    .addComponent(rbnEps))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnBuscar))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para resetear los campos
     */
    private void limpiarInputs(){
        txtDocumento.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        rbnEps.setSelected(false);
        rbnSisben.setSelected(false);
    }
    
    /**
     * Metodo para activar o desactivar los botones de eliminar y editar
     * @param enabled 
     */
    private void setEnabledInputs(boolean enabled){
        btnEditar.setEnabled(enabled);
        btnEliminar.setEnabled(enabled);
    }
    
    /**
     * Metodo que maneja el evento del boton registrar para agregar al paciente
     * @param evt 
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        
        //Obteniendo los datos del paciente
        String nombre = txtNombre.getText();
        int documento = Integer.parseInt(txtDocumento.getText());
        int edad = Integer.parseInt(txtEdad.getText());       
        boolean hasSisben = rbnSisben.isSelected();
        boolean hasEps = rbnEps.isSelected();
        
        //Creamos al paciente
        Paciente paciente = new Paciente(nombre, documento, edad, hasSisben, hasEps, hasEps);
        
        /*** EXCEPCION ****/
        boolean añadido = controlador.añadirPaciente(paciente);
        
        if( añadido ){
            JOptionPane.showMessageDialog(null, "Se añadio el paciente con documento " + documento);
            limpiarInputs();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo añadir al paciente");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * Metodo que maneja el evento del boton de volver para retroceder de ventana
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaSecretaria secre = new VistaSecretaria(controlador);
        secre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo que maneja el evento del boton editar para editar la informacion paciente
     * @param evt 
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        /*Los botones del sisben y eps se deben manejar así
        * porque el paciente solo puede tener uno de ellos, no ambos
        * Esto hace que al seleccionar uno se desmarqu el otro
        */
        //botones.add(rbnSisben);
        //botones.add(rbnEps);
        
        //Obteniendo los datos del paciente
        String nombre = txtNombre.getText();
        int documento = Integer.parseInt(txtDocumento.getText());
        int edad = Integer.parseInt(txtEdad.getText());       
        boolean hasSisben = rbnSisben.isSelected();
        boolean hasEps = rbnEps.isSelected();
        
        //Creamos al paciente
        Paciente paciente = new Paciente(nombre, documento, edad, hasSisben, hasEps, hasEps);
        
        /*** EXCEPCION ****/
        boolean editado = controlador.editarPaciente(paciente);
        
        if( editado ){
            JOptionPane.showMessageDialog(null, "Se editó la información el paciente con documento " + documento);
            limpiarInputs();
            setEnabledInputs(false);
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo editar la información del paciente");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * Metodo que maneja el evento del boton eliminar para eliminar al paciente
     * @param evt 
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Obteniendo el documento del paciente
        int documento = Integer.parseInt(txtDocumento.getText());
        
        /*** EXCEPCION ****/
        boolean eliminado = controlador.eliminarPaciente(documento);
        
        if( eliminado ){
            JOptionPane.showMessageDialog(null, "Se eliminó el paciente con documento " + documento);
            limpiarInputs();
            setEnabledInputs(false);
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar al paciente");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * Metodo que maneja el evento del boton de buscar para buscar al paciente
     * @param evt 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Obteniendo el documento del paciente
        int documento = Integer.parseInt(txtDocumento.getText());
        
        /*** EXCEPCION ****/
        Paciente paciente = controlador.buscarPaciente(documento);
        
        if( paciente != null ){
            txtNombre.setText(paciente.getNombre());
            txtEdad.setText(String.valueOf(paciente.getEdad()));
            rbnSisben.setSelected(paciente.hasSisben());
            rbnEps.setSelected(paciente.hasEps());
            setEnabledInputs(true);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró al paciente");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbnEps;
    private javax.swing.JRadioButton rbnSisben;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

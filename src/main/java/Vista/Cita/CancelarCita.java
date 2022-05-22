/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Cita;

import Controlador.ControladorCancelarCita;
import Modelo.Cita;
import Modelo.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CancelarCita extends javax.swing.JFrame {

    private ControladorCancelarCita controlador;
    private javax.swing.JFrame vistaVolver;
    /**
     * Creates new form CancelarCita
     */
    public CancelarCita( javax.swing.JFrame vistaVolver) {
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorCancelarCita();
        this.vistaVolver = vistaVolver;
        llenarComboCitas();
    }

    //Este controlador unicamente será llamado  por el paciente
    public CancelarCita(javax.swing.JFrame vistaVolver, Paciente paciente) {
        initComponents();
        setLocationRelativeTo(null);
        this.vistaVolver = vistaVolver;
        controlador = new ControladorCancelarCita();
        
        Cita cita = controlador.buscarCita(paciente.getDocumento());
        cbxCitas.addItem(cita);
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
        cbxCitas = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalleCita = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANCELAR CITA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        cbxCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCitasActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR CITA");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Detalle de la cita:");

        txtDetalleCita.setEditable(false);
        txtDetalleCita.setColumns(20);
        txtDetalleCita.setRows(5);
        txtDetalleCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txtDetalleCita);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbxCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cbxCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnCancelar)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolver))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para resetaer la informacion de los campos
     */
    private void resetearCampos(){
        llenarComboCitas();
        txtDetalleCita.setText("");
    }
    
    /**
     * Metodo que se encarga de llenar el combobox con los pacientes para ser seleccionados
     */
    private void llenarComboCitas(){
        cbxCitas.removeAllItems();
        cbxCitas.addItem("Seleccione una cita");
        
        for (Cita cita : controlador.getCitas()) {
            cbxCitas.addItem(cita);
        }
    }
    
    /**
     * Metodo que maneja el evento del boton volver para ejecutar su acción
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        vistaVolver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo que maneja el evento del boton cancelar para cancelar la cita
     * @param evt 
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //El primer elemento no es válido
        if( cbxCitas.getSelectedItem().equals("Seleccione una cita")){
            JOptionPane.showMessageDialog(null, "Cita no válida");
            return;
        }
        
        //Obtenemos al paciente
        Cita cita = (Cita) cbxCitas.getSelectedItem();
        
        //Confirmamos si se desea cancelar la cita
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro desea cancelar esta cita?");
        
        if( confirmacion==0 ){
            /*** EXCEPCION ***/
            boolean cancelada = controlador.eliminarCita(cita.getPaciente().getDocumento());
            if( cancelada ){
                JOptionPane.showMessageDialog(null, "Cita cancelada");
                resetearCampos();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo cancelar la cita");
            }    
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Metodo para que cada vez que se seleccione una cita mostrar su detalle
     * @param evt 
     */
    private void cbxCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCitasActionPerformed
        //Si el primer elemento esta seleccionado, no es válido
        //por lo tanto se muestra ese aviso
        if( cbxCitas.getSelectedItem() != null && cbxCitas.getSelectedItem().equals("Seleccione una cita")) {
            txtDetalleCita.setText("Ninguna cita seleccionada");
            return;
        }
        Cita cita = (Cita) cbxCitas.getSelectedItem();
        //Se verifica que la cita no sea nula
        if( cita != null ){
            txtDetalleCita.setText("Cita creada:\n " + 
                    cita.getFecha().toLocaleString() + "\n" +
                    cita.toString());
        }
    }//GEN-LAST:event_cbxCitasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cbxCitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDetalleCita;
    // End of variables declaration//GEN-END:variables
}

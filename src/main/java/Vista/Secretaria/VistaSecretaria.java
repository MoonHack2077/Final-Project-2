/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Secretaria;

import Singleton.Singleton;
import Vista.Login;

/**
 *
 * @author USER
 */
public class VistaSecretaria extends javax.swing.JFrame {

    private Singleton controlador;
    
    /**
     * Creates new form VistaSecretaria
     */
    public VistaSecretaria() {
        initComponents();
        setLocationRelativeTo(null);
        controlador = Singleton.getINSTANCIA(); 
        
        if( controlador.getDoctores().isEmpty() || controlador.getPacientes().isEmpty() ){
            btnAgregarCita.setEnabled(false);
        }
        if( controlador.getCitas().isEmpty() ) btnCancelarCita.setEnabled(false);
        if( controlador.getMultas().isEmpty() ) btnPagoMulta.setEnabled(false);
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
        btnAgregarCita = new javax.swing.JButton();
        btnCancelarCita = new javax.swing.JButton();
        btGestionarPac = new javax.swing.JButton();
        btnPagoMulta = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnAgregarCita.setText("AGREGAR CITA");
        btnAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCitaActionPerformed(evt);
            }
        });

        btnCancelarCita.setText("CANCELAR CITA");
        btnCancelarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCitaActionPerformed(evt);
            }
        });

        btGestionarPac.setText("GESTIONAR PACIENTES");
        btGestionarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGestionarPacActionPerformed(evt);
            }
        });

        btnPagoMulta.setText(" PAGO  MULTA");
        btnPagoMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoMultaActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGestionarPac))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPagoMulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnAgregarCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarCita)
                .addGap(18, 18, 18)
                .addComponent(btGestionarPac)
                .addGap(18, 18, 18)
                .addComponent(btnPagoMulta)
                .addContainerGap(10, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Metodo para cambiar de ventana
     * @param ventana 
     */
    private void cambiarVentana(javax.swing.JFrame ventana){
        ventana.setVisible(true);
        this.dispose();
    }
    
    /**
     * Metodo que maneja el evento del boton de agregar cita para abrir su respectiva ventana
     * @param evt 
     */
    private void btnAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCitaActionPerformed
        AgendarCita cita = new AgendarCita();
        cambiarVentana(cita);
    }//GEN-LAST:event_btnAgregarCitaActionPerformed

    /**
     * Metodo que maneja el evento del boton de volver para retroceder a la ventana principal
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Login main = new Login();
        cambiarVentana(main);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo que maneja el evento del boton de gestionar pacientes para abrir su ventana
     * @param evt 
     */
    private void btGestionarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGestionarPacActionPerformed
        GestionarPacientes pacientes = new GestionarPacientes();
        cambiarVentana(pacientes);
    }//GEN-LAST:event_btGestionarPacActionPerformed

    /**
     * Metodo que maneja el evento del boton cancelar cita para abrir su ventana
     * @param evt 
     */
    private void btnCancelarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCitaActionPerformed
        CancelarCita cancelar = new CancelarCita();
        cambiarVentana(cancelar);
    }//GEN-LAST:event_btnCancelarCitaActionPerformed

    /**
     * Metodo para ir a la ventana de pago de las multas
     * @param evt 
     */
    private void btnPagoMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoMultaActionPerformed
        PagoMulta pago = new PagoMulta();
        cambiarVentana(pago);
    }//GEN-LAST:event_btnPagoMultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGestionarPac;
    private javax.swing.JButton btnAgregarCita;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JButton btnPagoMulta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

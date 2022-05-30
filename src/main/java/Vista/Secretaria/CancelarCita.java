/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Secretaria;

import Controlador.ControladorCancelarCita;
import Excepciones.DatoDigitadoExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Cita;
import Modelo.Paciente;
import Modelo.Validacion;
import Vista.Paciente.VistaPaciente;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CancelarCita extends javax.swing.JFrame {

    private ControladorCancelarCita controlador;
    private Paciente paciente;
    private boolean isPaciente;
    private Validacion validacion;
    private Cita cita;
    /**
     * Creates new form CancelarCita
     */
    public CancelarCita() {
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorCancelarCita();
        validacion = new Validacion();
        btnCancelar.setEnabled(false);
    }

    //Este constructor será llamado por el paciente
    public CancelarCita(Paciente paciente) {
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorCancelarCita();
        this.paciente = paciente;
        isPaciente = true;
        
        //Se inhabilitan las funciones que tendría la secretaria
        lbl1.setVisible(false);
        btnBuscar.setVisible(false);
        txtDocumento.setVisible(false);
        
        
        this.cita = controlador.buscarCita( paciente.getDocumento() );
        lblDoctor.setText( this.cita.getDoctor().getNombre() );
        lblFecha.setText( this.cita.getFecha().toGMTString() );
        lblMotivo.setText( this.cita.getDoctor().getEspecialidad());
        lblPaciente.setText( this.cita.getPaciente().getNombre() );
               
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
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lblValidacion = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANCELAR CITA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnCancelar.setText("CANCELAR CITA");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Detalle de la cita:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Motivo:");

        lblMotivo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Doctor:");

        lblDoctor.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Paciente:");

        lblPaciente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lbl1.setText("Ingrese el documento del paciente");

        lblValidacion.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnBuscar))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValidacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl1)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(26, 26, 26)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolver))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    /**
     * Metodo que maneja el evento del boton volver para ejecutar su acción
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if( this.isPaciente ){
            VistaPaciente vista = new VistaPaciente(this.paciente);
            vista.setVisible(true);
        }else{
            VistaSecretaria vista = new VistaSecretaria();
            vista.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo para que cada vez que cambie la cita seleccionada se muestren sus detalles
     * @param evt 
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Confirmamos si se desea cancelar la cita
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro desea cancelar esta cita?");

        if( confirmacion==0 ){
            boolean cancelada = controlador.eliminarCita(this.cita.getPaciente().getDocumento());
            if( cancelada ){
                JOptionPane.showMessageDialog(null, "Cita cancelada");
                
                if( this.isPaciente ){
                    VistaPaciente vista = new VistaPaciente(this.paciente);
                    vista.setVisible(true); 
                    this.dispose();
                    return;
                }
                
                lblDoctor.setText( "" );
                lblFecha.setText( "" );
                lblMotivo.setText( "");
                lblPaciente.setText( "" );
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo cancelar la cita");
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Metodo para buscar pacientes
     * @param evt 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            //Obtenemos el documento
            String documento = txtDocumento.getText();

            this.cita = controlador.buscarCita(documento);

            if( this.cita == null ) throw new NoEncontradoExcepcion("No se encontró una cita con ese documento");

            lblDoctor.setText( this.cita.getDoctor().getNombre() );
            lblFecha.setText( this.cita.getFecha().toLocaleString());
            lblMotivo.setText( this.cita.getDoctor().getEspecialidad());
            lblPaciente.setText( this.cita.getPaciente().getNombre() );
            btnCancelar.setEnabled(true);
        }catch( NoEncontradoExcepcion ex ){
            lblValidacion.setText(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * Metodo para que la secretaria digite unicamente numeros en el textField del documento 
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblValidacion;
    private javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
}

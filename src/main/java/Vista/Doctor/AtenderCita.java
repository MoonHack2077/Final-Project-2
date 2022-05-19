/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Doctor;

import Controlador.ControladorDoctor;
import Controlador.ControladorHospital;
import Controlador.ControladorPaciente;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Multa;
import Vista.Paciente.VerHistorial;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class AtenderCita extends javax.swing.JFrame {

    private ControladorPaciente controladorPaciente;
    private ControladorHospital controlador;
    private Doctor doctor;
    private Cita cita;
    /**
     * Creates new form AtenderCita
     */
    public AtenderCita( ControladorHospital controlador, Doctor doctor) {
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = controlador;
        this.controladorPaciente = new ControladorPaciente();
        this.doctor = doctor;
        this.cita = doctor.getAgenda().get(0);
        lblPaciente.setText(this.cita.getPaciente().toString());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTratamientos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConclusiones = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        lblPaciente = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        btnMultar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ATENDER CITA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("La primer cita de tu agenda es: ");

        txtTratamientos.setColumns(20);
        txtTratamientos.setRows(5);
        jScrollPane1.setViewportView(txtTratamientos);

        jLabel2.setText("Escribe aquí los tratamientos para el paciente:");

        txtConclusiones.setColumns(20);
        txtConclusiones.setRows(5);
        jScrollPane2.setViewportView(txtConclusiones);

        jLabel3.setText("Escribe aquí las conclusiones de la cita");

        btnConfirmar.setText("CONFIRMAR ATENCION");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnHistorial.setText("Ver historial del paciente");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnMultar.setText("Multar paciente");
        btnMultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 263, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistorial)
                .addGap(18, 18, 18)
                .addComponent(btnMultar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHistorial)
                    .addComponent(btnMultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(15, 15, 15))
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
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para resetear los campos
     */
    private void resetearCampos(){
        txtConclusiones.setText("");
        txtTratamientos.setText("");
        if( doctor.getAgenda().isEmpty() ){
            lblPaciente.setText("Ya no tienes citas por atenter!!");
            btnHistorial.setEnabled(false);
            btnMultar.setEnabled(false);
            btnConfirmar.setEnabled(false);
        }else{
            cita = doctor.getAgenda().get(0);
            lblPaciente.setText(cita.getPaciente().toString());
        }
    }
    
    /**
     * Metodo que maneja el evento del boton volver para retroceder de ventana
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaDoctor vistaDoctor = new VistaDoctor(controlador, this.doctor);
        vistaDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo que maneja el evento del boton de confirmar la atencion de la cita para ejecutar su accion
     * @param evt 
     */
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //VALIDAR QUE NO ESTEN VACIOS LOS CAMPOS

        //Obtenemos los datos para anexarlos al historial del paciente
        String conclusiones = txtConclusiones.getText();
        String tratamientos = txtTratamientos.getText();
        cita.setConclusiones("\n Conclusiones: " + conclusiones + 
                "\n Tratamientos: " + tratamientos);
          
        boolean eliminada = controlador.eliminarCita(cita.getPaciente().getDocumento());
        if( eliminada ){
            JOptionPane.showMessageDialog(null, "Cita atendida con exito");
            resetearCampos();                  
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrió algún error");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * Metodo para ver el historial del paciente
     * @param evt 
     */
    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        VerHistorial historial = new VerHistorial(cita.getPaciente(),this);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

    /**
     * Metodo que maneja el evento del boton multar paciente para multarlo si no asistió
     * @param evt 
     */
    private void btnMultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultarActionPerformed
        //Confirmamos si se desea multar al paciente
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea multar al paciente " + cita.getPaciente().getNombre() + "?");
        
        if( confirmacion==0 ){
            //Creamos la multa y la registramos
            Multa multa = new Multa(cita);
            controladorPaciente.descuentoMulta(multa);
            boolean añadida = controlador.añadirMulta(multa);
            boolean cancelada = controlador.eliminarCita(cita.getPaciente().getDocumento());
            if( añadida && cancelada){
                JOptionPane.showMessageDialog(null, "Se ha multado al paciente: " + cita.getPaciente().getNombre());
                resetearCampos();
            }
        }
    }//GEN-LAST:event_btnMultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnMultar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JTextArea txtConclusiones;
    private javax.swing.JTextArea txtTratamientos;
    // End of variables declaration//GEN-END:variables
}

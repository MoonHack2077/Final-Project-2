/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Doctor;

import Controlador.ControladorDoctor;
import Controlador.ControladorHospital;
import Modelo.Doctor;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class BloquearFecha extends javax.swing.JFrame {

    private ControladorDoctor controladorDoctor;
    private ControladorHospital controlador;
    private Doctor doctor;
    
    /**
     * Creates new form BloqeuarFecha
     */
    public BloquearFecha(ControladorHospital controlador,Doctor doctor) {
        initComponents();
        setLocationRelativeTo(null);
        this.doctor = doctor;
        this.controlador = controlador;
        this.controladorDoctor = new ControladorDoctor();
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
        btnBloquear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        txtAñoCita = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("BLOQUEAR FECHA"), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnBloquear.setText("BLOQUEAR");
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese la fecha de la cita:");

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        txtAñoCita.setText("AÑO");
        txtAñoCita.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoCitaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAñoCitaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAñoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAñoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnBloquear)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para remover el texto del texfield del año, ya que este es solo un indicador
     * @param evt 
     */
    private void txtAñoCitaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoCitaFocusGained
        if( txtAñoCita.getText().equals("AÑO")  ){
            txtAñoCita.setText("");
        }
    }//GEN-LAST:event_txtAñoCitaFocusGained

    /**
     * Metodo para insertar el indicador de AÑO si este pierde el foco y no habia nada escrito
     * @param evt 
     */
    private void txtAñoCitaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoCitaFocusLost
        if( txtAñoCita.getText().equals("")  ){
            txtAñoCita.setText("AÑO");
        }
    }//GEN-LAST:event_txtAñoCitaFocusLost

    /**
     * Metodo que resetea los campos
     */
    private void resetearCampos(){
        txtAñoCita.setText("AÑO");
        cbxDia.setSelectedItem("Dia");
        cbxMes.setSelectedItem("Mes");
    }
    
    /**
     * Metodo que maneja el evento del boton bloquear para bloquear la fecha
     * @param evt 
     */
    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        //Validacion necesaria por si en algun combobox se selecciona un elemento que no corresponde 
        if( cbxDia.getSelectedIndex() == 0 || cbxMes.getSelectedIndex() == 0 ||
            txtAñoCita.getText().equals("AÑO")){
            JOptionPane.showMessageDialog(null, "Faltan campos por seleccionar");
            return;
        }
        
        //Parseamos los datos para crear la fecha
        int dia = Integer.parseInt(cbxDia.getSelectedItem().toString());
        int mes = Integer.parseInt(cbxMes.getSelectedItem().toString());
        int año = Integer.parseInt(txtAñoCita.getText());
        
        //En caso de que el mes sea 2 (febrero), validar si los dias y el año corresponden
        if( mes == 2 && dia >= 30 ){
            JOptionPane.showMessageDialog(null, "Febrero no tiene esa cantidad de dias");
            return;
        }
        
        //En caso de que el mes sea 2 (febrero), validar si es un año bisiesto
        if( mes == 2 && dia == 29 && año % 4 != 0 ){
            JOptionPane.showMessageDialog(null, "Febrero no tiene esa cantidad de dias");
            return;
        }
        
        // los meses 4, 6, 9 y 11 solo tienen 30 dias
        if( (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && ( dia == 31 ) ){
            JOptionPane.showMessageDialog(null, "El mes seleccionado no tiene esa cantidad de dias");
            return;
        }
        
        //Creamos la fecha
        Date fecha = new Date(año, mes-1, dia);
        
        //Se verifica que el doctor no tenga cita ese dia
        boolean coincide = controladorDoctor.bloquearFecha(doctor,fecha);   
        if( coincide ){
            JOptionPane.showMessageDialog(null, "Ya tienes citas para este dia, no puedes bloquearlo\n Prueba con otro!!");
            return;
        }     
        JOptionPane.showMessageDialog(null, "La fecha " + fecha.toString() + "\n Ha sido bloqueada exitosamente!!");
        resetearCampos();
    }//GEN-LAST:event_btnBloquearActionPerformed

    /**
     * Metodo que maneja el evento del boton volver para retroceder de ventana
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaDoctor vistaDoctor = new VistaDoctor(controlador, this.doctor);
        vistaDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAñoCita;
    // End of variables declaration//GEN-END:variables
}

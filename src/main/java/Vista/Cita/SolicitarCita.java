/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Cita;

import Controlador.ControladorDoctor;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Paciente;
import Vista.Paciente.VistaPaciente;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SolicitarCita extends javax.swing.JFrame {

    private javax.swing.JFrame vistaVolver;
    
    /**
     * Creates new form GestionarCita
     */
    public SolicitarCita(javax.swing.JFrame vistaVolver) {
        initComponents();
        setLocationRelativeTo(null);
        this.vistaVolver = vistaVolver;
        llenarComboDoctores();
        llenarComboPacientes();
    }

    //Este controlador unicamente será llamado  por el paciente
    public SolicitarCita(VistaPaciente vistaVolver, Paciente paciente) {
        initComponents();
        setLocationRelativeTo(null);
        llenarComboDoctores();
        cbxPacientes.addItem(paciente);
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
        cbxDoctores = new javax.swing.JComboBox();
        cbxPacientes = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        txtAñoCita = new javax.swing.JTextField();
        btnSolicitar = new javax.swing.JButton();
        cbxHora = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOLICITAR CITA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

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

        btnSolicitar.setText("SOLICITAR CITA");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "7:00 AM", "7:20 AM", "7:40 AM", "8:00 AM", "8:20 AM", "8:40 AM", "9:00 AM", "9:20 AM", "9:40 AM", "10:00 AM", "10:20 AM", "10:40 AM", "11:00 AM", "11:20 AM", "11:40 AM", "1:00 PM", "1:20 PM", "1:40 PM", "2:00 PM", "2:20 PM", "2:40 PM", "3:00 PM", "3:20 PM", "3:40 PM", "4:00 PM", "4:20 PM", "4:40 PM", "5:00 PM", "5:20 PM", "5:40 PM" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAñoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSolicitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxDoctores, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(cbxDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAñoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnSolicitar)
                .addGap(17, 17, 17))
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
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que resetea los campos
     */
    private void resetear(){
        txtAñoCita.setText("AÑO");
        cbxDia.setSelectedItem("Dia");
        cbxMes.setSelectedItem("Mes");
        cbxHora.setSelectedItem("Hora");
        cbxDoctores.setSelectedItem("Seleccione un doctor");
        llenarComboPacientes();
    }
    
    /**
     * Metodo que se encarga de llenar el combobox con los doctres y su especialidad para ser seleccionados
     */
    private void llenarComboDoctores(){
        cbxDoctores.removeAllItems();
        cbxDoctores.addItem("Seleccione un doctor");
        
        for (Doctor doctor : controlador.getDoctores()) {
            cbxDoctores.addItem(doctor);
        }
    }
    
    /**
     * Metodo que se encarga de llenar el combobox con los pacientes para ser seleccionados
     */
    private void llenarComboPacientes(){
        cbxPacientes.removeAllItems();
        cbxPacientes.addItem("Seleccione un paciente");
        
        for (Paciente paciente : controlador.getPacientes()) {
            //Condicion para que el combobox solo se llene con los pacientes que no tengan una cita
            if( !paciente.hasCita() ) cbxPacientes.addItem(paciente);
        }
    }
    
    /**
     * Metodo que maneja el evento del boton solicitar para ejecutar su acción
     * @param evt 
     */
    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        //Validacion necesaria por si en algun combobox se selecciona un elemento que no corresponde 
        if( cbxDia.getSelectedIndex() == 0 || cbxHora.getSelectedIndex() == 0 ||
            cbxMes.getSelectedIndex() == 0 || cbxPacientes.getSelectedItem().equals("Seleccione un paciente")|| 
            cbxDoctores.getSelectedIndex() == 0 || txtAñoCita.getText().equals("AÑO"))
        {
            JOptionPane.showMessageDialog(null, "Faltan campos por seleccionar");
            return;
        }

        //Obteniendo al doctor y al paciente
        Doctor doctor = (Doctor) cbxDoctores.getSelectedItem();
        Paciente paciente = (Paciente) cbxPacientes.getSelectedItem();
        
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
        
        //Creamos la fecha para compararla con la fecha bloqueada
        Date fechaAux = new Date(año, mes-1, dia);
       
        //Validamos si la fecha elegida no es la misma que la fecha que ha bloqueado el doctor
        boolean validar = controladorDoctor.validarFechaBloqueada(doctor, fechaAux);
        if( validar ){            
            JOptionPane.showMessageDialog(null, "El doctor " + doctor.getNombre() + " ha bloqueado ese dia para tener citas\n Por favor seleccione otro");
            return;
        }
        
        //El combobox de la hora viene en este formato: hora:minuto
        //Por lo tanto se le hace un split a la hora seleccionada y así optenemos ambos por separado
        String[] horas = cbxHora.getSelectedItem().toString().split(":");
        int hora = Integer.parseInt(horas[0]);
        
        //En el anterior split el dato nos quedaria de la siguiente manera: ["hora" , "minuto AM/PM"]
        //Por lo tanto se le hace un split nuevamente al segundo elemento para solo obtener el dato numerico
        //El AM y PM son indicadores mas que todo
        int minuto = Integer.parseInt(horas[1].split(" ")[0]);
        
        //Creamos la fecha de la cita
        Date fecha = new Date(año, mes-1, dia, hora, minuto);
        //Creamos la cita
        Cita cita = new Cita( paciente,doctor,fecha );
        
        /*** EXCEPCION ***/
        boolean creada = controlador.añadirCita(cita);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        if( creada ){
            JOptionPane.showMessageDialog(null, "Cita creada:\n " + 
                    cita.getFecha().toLocaleString() + "\n" +
                    cita.toString());            
            resetear();
        }else{
            JOptionPane.showMessageDialog(null, "El doctor " + doctor.getNombre() + " ya tiene una cita asignada a esa hora");
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    /**
     * Metodo que maneja el evento del boton volver para ejecutar su acción
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        vistaVolver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox cbxDoctores;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox cbxPacientes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAñoCita;
    // End of variables declaration//GEN-END:variables
}

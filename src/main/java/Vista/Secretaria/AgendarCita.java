/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Secretaria;

import Controlador.ControladorSolicitarCita;
import Excepciones.CoincideConFechaBloqueadaExcepcion;
import Excepciones.DiaNoDisponibleExcepcion;
import Excepciones.EspecialidadNoEncontradaExcepcion;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Paciente;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class AgendarCita extends javax.swing.JFrame {

    private ControladorSolicitarCita controlador;
    /**
     * Creates new form GestionarCita
     */
    public AgendarCita() {
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorSolicitarCita();
        llenarComboPacientes();
        llenarComboDoctores("");
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
        btnSolicitar = new javax.swing.JButton();
        cbxHora = new javax.swing.JComboBox<>();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        lblValidacion = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGENDAR CITA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setText("Ingrese la fecha de la cita:");

        btnSolicitar.setText("AGENDAR CITA");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "7:00 AM", "7:20 AM", "7:40 AM", "8:00 AM", "8:20 AM", "8:40 AM", "9:00 AM", "9:20 AM", "9:40 AM", "10:00 AM", "10:20 AM", "10:40 AM", "11:00 AM", "11:20 AM", "11:40 AM", "1:00 PM", "1:20 PM", "1:40 PM", "2:00 PM", "2:20 PM", "2:40 PM", "3:00 PM", "3:20 PM", "3:40 PM", "4:00 PM", "4:20 PM", "4:40 PM", "5:00 PM", "5:20 PM", "5:40 PM" }));

        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una especialidad", "Medicina General", "Dermatologia", "Odontologia", "Pediatria", "Cardiología", "Urologia", "Gastroenterología", "Anatomía", "Ortopedia", "Oftalmología", "Oncología" }));
        cbxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEspecialidadActionPerformed(evt);
            }
        });

        lblValidacion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblValidacion.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnSolicitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que resetea los campos
     */
    private void resetear(){
        cbxHora.setSelectedItem("Hora");
        cbxDoctores.setSelectedItem("Seleccione un doctor");
        llenarComboPacientes();
        llenarComboDoctores("");
        cbxEspecialidad.setSelectedItem("Seleccione una especialidad");
    }
    
    /**
     * Metodo que se encarga de llenar el combobox con los doctres y su especialidad para ser seleccionados
     */
    private void llenarComboDoctores(String especialidad){
        try{
            cbxDoctores.removeAllItems();

            //Si el primer item esta seleccionado este no es válido        
            if( cbxEspecialidad.getSelectedIndex()==0 ){
                btnSolicitar.setEnabled(false);
                throw new EspecialidadNoEncontradaExcepcion("Ninguna especialidad seleccionada");
            }

            controlador.especialidades(especialidad);

            btnSolicitar.setEnabled(true);
            cbxDoctores.addItem("Seleccione un doctor");

            for (Doctor doctor : controlador.getDoctores()) {
                if( doctor.getEspecialidad().equals(especialidad) ) cbxDoctores.addItem(doctor);
            }
        }catch( EspecialidadNoEncontradaExcepcion ex ){
            cbxDoctores.addItem(ex.getMessage());
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
            if( !paciente.hasCita() && !paciente.hasMulta()) cbxPacientes.addItem(paciente);
        }
    }
    
    /**
     * Metodo que maneja el evento del boton solicitar para ejecutar su acción
     * @param evt 
     */
    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        try{
            //Validamos los campos 
            if( cbxHora.getSelectedIndex() == 0 || cbxDoctores.getSelectedIndex() == 0 )
            {
                JOptionPane.showMessageDialog(null, "Faltan campos por seleccionar");
                return;
            }

            //Obteniendo al doctor y al paciente
            Doctor doctor = (Doctor) cbxDoctores.getSelectedItem();
            Paciente pacienteSolicitante = (Paciente) cbxPacientes.getSelectedItem();

            //Creamos la fecha para compararla con la fecha bloqueada
            Date fecha = dateChooser.getDate();
            
            //Validamos si la fecha elegida no es la misma que la fecha que ha bloqueado el doctor
            controlador.validarFechaBloqueada(doctor, fecha);
            
            //El combobox de la hora viene en este formato: hora:minuto
            //Por lo tanto se le hace un split a la hora seleccionada y así optenemos ambos por separado
            String[] horas = cbxHora.getSelectedItem().toString().split(":");
            int hora = Integer.parseInt(horas[0]);

            //En el anterior split el dato nos quedaria de la siguiente manera: ["hora" , "minuto AM/PM"]
            //Por lo tanto se le hace un split nuevamente al segundo elemento para solo obtener el dato numerico
            //El AM y PM son indicadores mas que todo
            int minuto = Integer.parseInt(horas[1].split(" ")[0]);

            //Creamos la fecha de la cita
            fecha.setHours(hora);
            fecha.setMinutes(minuto);
            fecha.setSeconds(0);
            
            //Creamos la cita
            Cita cita = new Cita( pacienteSolicitante,doctor,fecha );

            //Verificamos si el doctor no tiene citas para esa hora
            controlador.verificarDisponibilidad(cita);
            
            //Añadimos la cita
            controlador.añadirCita(cita);
            JOptionPane.showMessageDialog(null, "Cita creada:\n " +
                cita.getFecha().toLocaleString() + "\n" +
                cita.toString() + "\nMotivo: " + cita.getDoctor().getEspecialidad()
            );
            btnSolicitar.setEnabled(false);
            resetear();
        }catch(DiaNoDisponibleExcepcion | CoincideConFechaBloqueadaExcepcion ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    /**
     * Metodo que maneja el evento del boton volver para ejecutar su acción
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaSecretaria vista = new VistaSecretaria();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo para que cada vez que cambie el item seleccionado se muestren los doctores con esa especialidad
     * @param evt 
     */
    private void cbxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEspecialidadActionPerformed
        llenarComboDoctores(cbxEspecialidad.getSelectedItem().toString());
    }//GEN-LAST:event_cbxEspecialidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cbxDoctores;
    private javax.swing.JComboBox<String> cbxEspecialidad;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JComboBox cbxPacientes;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblValidacion;
    // End of variables declaration//GEN-END:variables
}

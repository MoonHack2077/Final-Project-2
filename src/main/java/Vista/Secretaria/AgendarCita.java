/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Secretaria;

import Controlador.ControladorSolicitarCita;
import Excepciones.CoincideConFechaBloqueadaExcepcion;
import Excepciones.DatoDigitadoExcepcion;
import Excepciones.DiaNoDisponibleExcepcion;
import Excepciones.EspecialidadNoEncontradaExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Paciente;
import Modelo.Validacion;
import Vista.Paciente.VistaPaciente;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class AgendarCita extends javax.swing.JFrame {

    private ControladorSolicitarCita controlador;
    private Validacion validacion;
    private Paciente paciente;
    private boolean isPaciente;
    
    /**
     * Creates new form GestionarCita
     */
    public AgendarCita() {
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorSolicitarCita();
        llenarComboDoctores("");
        validacion = new Validacion();
        btnSolicitar.setEnabled(false);
    }
    
    //Este constructor será llamado por el paciente
    public AgendarCita(Paciente paciente) {
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorSolicitarCita();
        llenarComboDoctores("");
        this.paciente = paciente;
        isPaciente = true;
        btnSolicitar.setEnabled(false);
       
        btnVolver.setBounds(5, 5, btnVolver.getWidth(), btnVolver.getHeight());
        panel.setBounds(10, 90, panel.getWidth()/2, panel.getHeight());
        
        //Se inhabilitan las funciones que tendría la secretaria       
        panelPac.setVisible(false);
        lbl2.setVisible(false);
        lblPaciente.setVisible(false);
        lblValidacion.setVisible(false);
        
        //Se cuadra el estilo de la ventana
        //panelDoc.setBounds(0, 0, panelDoc.getWidth(), panelDoc.getHeight());
        //panelDate.setBounds(250, 400, panelDate.getWidth(), panelDate.getHeight());
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnSolicitar = new javax.swing.JButton();
        lblValidacion = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        panelDate = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbxHora = new javax.swing.JComboBox<>();
        dateChooser = new com.toedter.calendar.JDateChooser();
        panelDoc = new javax.swing.JPanel();
        cbxDoctores = new javax.swing.JComboBox();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        panelPac = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGENDAR CITA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnSolicitar.setText("AGENDAR CITA");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        lblValidacion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblValidacion.setForeground(new java.awt.Color(255, 0, 0));

        lbl2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbl2.setText("Paciente seleccionado:");

        lblPaciente.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        panelDate.setBorder(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese la fecha de la cita:");

        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "7:00 AM", "7:20 AM", "7:40 AM", "8:00 AM", "8:20 AM", "8:40 AM", "9:00 AM", "9:20 AM", "9:40 AM", "10:00 AM", "10:20 AM", "10:40 AM", "11:00 AM", "11:20 AM", "11:40 AM", "1:00 PM", "1:20 PM", "1:40 PM", "2:00 PM", "2:20 PM", "2:40 PM", "3:00 PM", "3:20 PM", "3:40 PM", "4:00 PM", "4:20 PM", "4:40 PM", "5:00 PM", "5:20 PM", "5:40 PM" }));

        javax.swing.GroupLayout panelDateLayout = new javax.swing.GroupLayout(panelDate);
        panelDate.setLayout(panelDateLayout);
        panelDateLayout.setHorizontalGroup(
            panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelDateLayout.setVerticalGroup(
            panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelDoc.setBorder(null);

        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una especialidad", "Medicina General", "Dermatologia", "Odontologia", "Pediatria", "Cardiología", "Urologia", "Gastroenterología", "Anatomía", "Ortopedia", "Oftalmología", "Oncología" }));
        cbxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDocLayout = new javax.swing.GroupLayout(panelDoc);
        panelDoc.setLayout(panelDocLayout);
        panelDocLayout.setHorizontalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDocLayout.setVerticalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cbxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelPac.setBorder(null);

        lbl1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbl1.setText("Ingrese el documento del paciente:");

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

        javax.swing.GroupLayout panelPacLayout = new javax.swing.GroupLayout(panelPac);
        panelPac.setLayout(panelPacLayout);
        panelPacLayout.setHorizontalGroup(
            panelPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelPacLayout.setVerticalGroup(
            panelPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl1)
                .addGap(13, 13, 13)
                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(panelPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(32, 32, 32)
                        .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panelDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl2)
                    .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(panelDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSolicitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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
                        .addGap(22, 22, 22)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que resetea los campos
     */
    private void resetear(){
        cbxHora.setSelectedItem("Hora");
        cbxDoctores.setSelectedItem("Seleccione un doctor");
        llenarComboDoctores("");
        cbxEspecialidad.setSelectedItem("Seleccione una especialidad");
        txtDocumento.setText("");
        lblPaciente.setText("");
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
     * Metodo que maneja el evento del boton solicitar para ejecutar su acción
     * @param evt 
     */
    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        try{
            //Validamos los campos 
            if( cbxHora.getSelectedIndex() == 0 || cbxDoctores.getSelectedIndex() == 0 
                    || dateChooser.getDate() == null )
            {
                JOptionPane.showMessageDialog(null, "Faltan campos por seleccionar");
                return;
            }

            //Obteniendo al doctor y al paciente
            Doctor doctor = (Doctor) cbxDoctores.getSelectedItem();

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
            Cita cita = new Cita( this.paciente,doctor,fecha );

            //Verificamos si el doctor no tiene citas para esa hora
            controlador.verificarDisponibilidad(cita);
            
            //Añadimos la cita
            controlador.añadirCita(cita);
            JOptionPane.showMessageDialog(null, "Cita creada:\n " +
                cita.getFecha().toLocaleString() + "\n" +
                cita.toString() + "\nMotivo: " + cita.getDoctor().getEspecialidad()
            );
            if( isPaciente ){
                VistaPaciente vista = new VistaPaciente(paciente);
                vista.setVisible(true);
                this.dispose();
            }
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
        if( this.isPaciente ){
            VistaPaciente vista = new VistaPaciente(paciente);
            vista.setVisible(true);
        }else{
            VistaSecretaria vista = new VistaSecretaria();
            vista.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * Metodo para que cada vez que cambie el item seleccionado se muestren los doctores con esa especialidad
     * @param evt 
     */
    private void cbxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEspecialidadActionPerformed
        llenarComboDoctores(cbxEspecialidad.getSelectedItem().toString());
    }//GEN-LAST:event_cbxEspecialidadActionPerformed

    /**
     * Metodo para buscar un paciente por medio del documento para asignar su cita
     * @param evt 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            //Obtenemos el documento
            String documento = txtDocumento.getText();
            this.paciente = controlador.getControlador().buscarPaciente(documento);

            //Si no se encuentra al paciente lanzamos esta excepcion
            if( this.paciente==null  ) throw new NoEncontradoExcepcion();
                
            if( this.paciente.hasCita() ){
                lblPaciente.setText( "El paciente seleccionado ya tiene cita" );
                btnSolicitar.setEnabled(false);
                return;
            }

            if( this.paciente.hasMulta() ){
                lblPaciente.setText( "El paciente esta multado" );
                btnSolicitar.setEnabled(false);
                return;
            }
            
            btnSolicitar.setEnabled(true);
            lblPaciente.setText( this.paciente.toString() );
        }catch(NoEncontradoExcepcion ex){
            lblPaciente.setText( ex.getMessage() );
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
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cbxDoctores;
    private javax.swing.JComboBox<String> cbxEspecialidad;
    private javax.swing.JComboBox<String> cbxHora;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblValidacion;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelDate;
    private javax.swing.JPanel panelDoc;
    private javax.swing.JPanel panelPac;
    private javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
}

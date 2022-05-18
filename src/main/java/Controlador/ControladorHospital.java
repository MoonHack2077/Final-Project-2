/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.MayorDeEdad;
import Exceptionses.documento_registrado;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Paciente;
import Modelo.Secretaria;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorHospital {
    private ControladorDoctor controladorDoctor;
    private ArrayList<Doctor> doctores;
    private ArrayList<Secretaria> secretarias;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Cita> citas;
    
    public ControladorHospital(){
        controladorDoctor = new ControladorDoctor();
        doctores = new ArrayList<>();
        secretarias = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
    }

    
    /********* GESTION DOCTORES *********/
    
    /**
     * Metodo para buscar un doctor registrado por medio del documento
     * @param documento
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Doctor buscarDoctor(String documento)throws documento_registrado{   
        for (Doctor doctor : doctores) {
            if(doctor.getDocumento().equals(documento)) return doctor;
        }
        return null;
    }
    
    /**
     * Metodo para añadir un doctor
     * @param doctor
     * @return true si pudo añadirlo, de lo contrario false;
     */
    public boolean añadirDoctor(Doctor doctor) throws MayorDeEdad{
        Doctor aux = buscarDoctor(doctor.getDocumento());
        
        if(aux == null){
            if( doctor.getEdad() < 18) throw new MayorDeEdad();
            doctores.add(doctor);
            return true;
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar un doctor almacenado
     * @param documento
     * @return true si pudo eliminarlo, de lo contrario false
     */
    public boolean eliminarDoctor(String documento){
        Doctor aux = buscarDoctor(documento);
        
        if( aux != null ){
            for (int i = 0; i < doctores.size(); i++) {
                if(doctores.get(i).getDocumento().equals(documento)){
                    doctores.remove(i);
                    return true;
                }
                
            }
        }
        return false;
    }
    
    /**
     * Metodo para editar la informacion de un doctor
     * @param doctor
     * @return true si pudo editarla, de lo contrario false
     */
    public boolean editarDoctor(Doctor doctor){
    Doctor aux = buscarDoctor(doctor.getDocumento());
        
        if( aux != null ){
            for(int i=0 ; i<doctores.size(); i++){
                if(doctores.get(i).getDocumento().equals(doctor.getDocumento())){
                    
                    //Inyectando los nuevos valores
                    doctores.get(i).setNombre(doctor.getNombre());
                    doctores.get(i).setEdad(doctor.getEdad());
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    /********* GESTION SECRETARIAS *********/
    
    /**
     * Metodo para buscar una secretaria registrada por medio del documento
     * @param documento
     * @return secretaria si la encuentra, de lo contrario null
     */
    public Secretaria buscarSecretaria(String documento)throws documento_registrado{
    
        for (Secretaria secretaria : secretarias) {
            if(secretaria.getDocumento().equals(documento)) return secretaria;
        }
        return null;
    }
    
    /**
     * Metodo para añadir una secretaria
     * @param secretaria
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirSecretaria(Secretaria secretaria){
        Secretaria aux = buscarSecretaria(secretaria.getDocumento());
        
        if(aux == null){
            secretarias.add(secretaria);
            return true;
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar una secretaria almacenada
     * @param documento
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarSecretaria(String documento){
        Secretaria aux = buscarSecretaria(documento);
        
        if( aux != null ){
            for (int i = 0; i < secretarias.size(); i++) {
                if(secretarias.get(i).getDocumento().equals(documento)){
                    secretarias.remove(i);
                    return true;
                }
                
            }
        }
        return false;
    }
    
    /**
     * Metodo para editar la informacion de una secretaria
     * @param secretaria
     * @return true si pudo editarla, de lo contrario false
     */
    public boolean editarSecretaria(Secretaria secretaria){
    Secretaria aux = buscarSecretaria(secretaria.getDocumento());
        
        if( aux != null ){
            for(int i=0 ; i<secretarias.size(); i++){
                if(secretarias.get(i).getDocumento().equals(secretaria.getDocumento())){
                    
                    //Inyectando los nuevos valores
                    secretarias.get(i).setNombre(secretaria.getNombre());
                    secretarias.get(i).setEdad(secretaria.getEdad());
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
     
    /********* GESTION PACIENTES *********/
    /**
     * Metodo para buscar un paciente registrado por medio del documento
     * @param documento
     * @return paciente si lo encuentra, de lo contrario null
     */
    public Paciente buscarPaciente(String documento)throws documento_registrado{
    
        for (Paciente paciente : pacientes) {
            if(paciente.getDocumento().equals(documento)) return paciente;
        }
        return null;
    }
    
    /**
     * Metodo para añadir un paciente
     * @param paciente
     * @return true si pudo añadirlo, de lo contrario false;
     */
    public boolean añadirPaciente(Paciente paciente){
        Paciente aux = buscarPaciente(paciente.getDocumento());
        
        if(aux == null){
            pacientes.add(paciente);
            return true;
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar un paciente almacenado
     * @param documento
     * @return true si pudo eliminarlo, de lo contrario false
     */
    public boolean eliminarPaciente(String documento){
        Paciente aux = buscarPaciente(documento);
        
        if( aux != null ){
            for (int i = 0; i < pacientes.size(); i++) {
                if( pacientes.get(i).getDocumento().equals(documento )){
                    pacientes.remove(i);
                    return true;
                }
                
            }
        }
        return false;
    }
    
    /**
     * Metodo para editar la informacion de un paciente
     * @param paciente
     * @return true si pudo editarla, de lo contrario false
     */
    public boolean editarPaciente(Paciente paciente){
    Paciente aux = buscarPaciente(paciente.getDocumento());
        
        if( aux != null ){
            for(int i=0 ; i < pacientes.size(); i++){
                if( pacientes.get(i).getDocumento().equals(paciente.getDocumento() )){
                    
                    //Inyectando los nuevos valores
                    pacientes.get(i).setNombre(paciente.getNombre());
                    pacientes.get(i).setEdad(paciente.getEdad());
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /********* GESTION CITAS *********/
    /**
     * Metodo para buscar una cita registrada por medio del documento del paciente
     * @param documento
     * @return cita si la encuentra, de lo contrario null
     */
    public Cita buscarCita(String documento){
    
        for (Cita cita : citas) {
            if(cita.getPaciente().getDocumento().equals(documento) ) return cita;
        }
        return null;
    }
    
    /**
     * Metodo para añadir una cita al array general de las citas y a la agenda del respectivo doctor
     * @param cita
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirCita(Cita cita){
        Cita aux = buscarCita(cita.getPaciente().getDocumento());
        
        if(aux == null){
            boolean verificada = controladorDoctor.verificarDisponibilidad(cita);
            if( !verificada ){
                citas.add(cita);
                cita.getDoctor().getAgenda().add(cita);
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar una cita almacenada
     * @param documento
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarCita(String documento){
        Cita aux = buscarCita(documento);
        
        if( aux != null ){
            for (int i = 0; i < citas.size(); i++) {
                if(citas.get(i).getPaciente().getDocumento().equals(documento)){
                    if(controladorDoctor.eliminarCitaDeLaAgenda(citas.get(i))){
                        citas.remove(i);
                        return true;                  
                    }
                }
                
            }
        }
        return false;
    }
    
    
    
    /**
     * @return the doctores
     */
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    /**
     * @return the secretarias
     */
    public ArrayList<Secretaria> getSecretarias() {
        return secretarias;
    }

    /**
     * @return the pacientes
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * @return the citas
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }

            
}

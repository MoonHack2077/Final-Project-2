/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.AlmacenadoExcepcion;
import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Admin;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Multa;
import Modelo.Paciente;
import Modelo.Secretaria;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorHospital {
    private ControladorDoctor controladorDoctor;
    private Admin[] admins;
    private ArrayList<Doctor> doctores;
    private ArrayList<Secretaria> secretarias;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Cita> citas;
    private ArrayList<Multa> multas;
    
    public ControladorHospital(){
        controladorDoctor = new ControladorDoctor();
        admins = new Admin[2];
        doctores = new ArrayList<>();
        secretarias = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
        multas = new ArrayList<>();
    }

    /**
     * 
     * @param correo
     * @param contraseña 
     */
    public Admin buscarAdmin(String correo, String contraseña){
        
        for (Admin admin : admins) {
            if( admin.getCorreo().equals(correo) && admin.getContraseña().equals(contraseña) ) return admin;
        }
        
        return null;
    }
    
    /********* GESTION DOCTORES *********/
    
    /**
     * Metodo para buscar un doctor registrado por medio del documento
     * @param documento
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Doctor buscarDoctor(String documento){   
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
    public boolean añadirDoctor(Doctor doctor) throws AlmacenadoExcepcion,MayorDeEdadExcepcion{
        Secretaria secretaria = buscarSecretaria(doctor.getDocumento());
        Doctor aux = buscarDoctor(doctor.getDocumento());
        Paciente paciente = buscarPaciente(doctor.getDocumento());
        
        //Excepciones
        if( aux != null || secretaria != null || paciente != null  ) throw  new AlmacenadoExcepcion();
        if( doctor.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        doctores.add(doctor);
        return true;
        
    }
    
    /**
     * Metodo para eliminar un doctor almacenado
     * @param documento
     * @return true si pudo eliminarlo, de lo contrario false
     */
    public boolean eliminarDoctor(String documento) throws NoEncontradoExcepcion{
        Doctor aux = buscarDoctor(documento);
        if( aux == null ) throw new NoEncontradoExcepcion();
        for (int i = 0; i < doctores.size(); i++) {
            if(doctores.get(i).getDocumento().equals(documento)){
                doctores.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Metodo para editar la informacion de un doctor
     * @param doctor
     * @return true si pudo editarla, de lo contrario false
     */
    public boolean editarDoctor(Doctor doctor) throws NoEncontradoExcepcion, MayorDeEdadExcepcion{
        Doctor aux = buscarDoctor(doctor.getDocumento());
        
        //Excepciones
        if( aux == null ) throw new NoEncontradoExcepcion();
        if( doctor.getEdad() < 18) throw new MayorDeEdadExcepcion();
       
        for(int i=0 ; i<doctores.size(); i++){
            if(doctores.get(i).getDocumento().equals(doctor.getDocumento())){
                //Inyectando los nuevos valores
                doctores.get(i).setNombre(doctor.getNombre());
                doctores.get(i).setEdad(doctor.getEdad());
            }
        }
        
        return true;
    }
    
    
    /********* GESTION SECRETARIAS *********/
    
    /**
     * Metodo para buscar una secretaria registrada por medio del documento
     * @param documento
     * @return secretaria si la encuentra, de lo contrario null
     */
    public Secretaria buscarSecretaria(String documento){
    
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
    public boolean añadirSecretaria(Secretaria secretaria) throws MayorDeEdadExcepcion, AlmacenadoExcepcion{
        Secretaria aux = buscarSecretaria(secretaria.getDocumento());
        Doctor doctor = buscarDoctor(secretaria.getDocumento());
        Paciente paciente = buscarPaciente(secretaria.getDocumento());
        
        //Excepciones
        if( aux != null || doctor != null || paciente != null  ) throw  new AlmacenadoExcepcion();
        if( secretaria.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        secretarias.add(secretaria);
        return true;
    }
    
    /**
     * Metodo para eliminar una secretaria almacenada
     * @param documento
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarSecretaria(String documento) throws NoEncontradoExcepcion{
        Secretaria aux = buscarSecretaria(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
       
        for (int i = 0; i < secretarias.size(); i++) {
            if(secretarias.get(i).getDocumento().equals(documento)){
                secretarias.remove(i);
            }
        }
        
        return true;
    }
    
    /**
     * Metodo para editar la informacion de una secretaria
     * @param secretaria
     * @return true si pudo editarla, de lo contrario false
     */
    public boolean editarSecretaria(Secretaria secretaria) throws MayorDeEdadExcepcion, NoEncontradoExcepcion{
    Secretaria aux = buscarSecretaria(secretaria.getDocumento());
    
    //Excepciones
    if( aux == null ) throw new NoEncontradoExcepcion();
    if( secretaria.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
    for(int i=0 ; i<secretarias.size(); i++){
        if(secretarias.get(i).getDocumento().equals(secretaria.getDocumento())){
            //Inyectando los nuevos valores
            secretarias.get(i).setNombre(secretaria.getNombre());
            secretarias.get(i).setEdad(secretaria.getEdad());
            return true;
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
    public Paciente buscarPaciente(String documento){
    
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
    public boolean añadirPaciente(Paciente paciente)throws MayorDeEdadExcepcion, AlmacenadoExcepcion{
        Secretaria secretaria = buscarSecretaria(paciente.getDocumento());
        Doctor doctor = buscarDoctor(paciente.getDocumento());
        Paciente aux = buscarPaciente(paciente.getDocumento());
        
        //Excepciones
        if( aux != null || secretaria != null || doctor != null  ) throw  new AlmacenadoExcepcion();
        if( paciente.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        pacientes.add(paciente);
        return true;       
    }
    
    /**
     * Metodo para eliminar un paciente almacenado
     * @param documento
     * @return true si pudo eliminarlo, de lo contrario false
     */
    public boolean eliminarPaciente(String documento) throws NoEncontradoExcepcion{
        Paciente aux = buscarPaciente(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < pacientes.size(); i++) {
            if( pacientes.get(i).getDocumento().equals(documento )){
                pacientes.remove(i);
            }
        }
        
        return true;
    }
    
    /**
     * Metodo para editar la informacion de un paciente
     * @param paciente
     * @return true si pudo editarla, de lo contrario false
     */
    public boolean editarPaciente(Paciente paciente) throws NoEncontradoExcepcion, MayorDeEdadExcepcion{
        Paciente aux = buscarPaciente(paciente.getDocumento());
        
        //Excepciones
        if( aux == null ) throw new NoEncontradoExcepcion();
        if( paciente.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        for(int i=0 ; i < pacientes.size(); i++){
            if( pacientes.get(i).getDocumento().equals(paciente.getDocumento() )){
                //Inyectando los nuevos valores
                pacientes.get(i).setNombre(paciente.getNombre());
                pacientes.get(i).setEdad(paciente.getEdad());
                return true;
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
                        citas.get(i).getPaciente().setHasCita(false);
                        citas.remove(i);
                        return true;                  
                    }
                }
                
            }
        }
        return false;
    }
    
    
    /*** GESTION DE MULTAS ***/
    /**
     * Metodo para buscar una multa registrada por medio del documento del paciente
     * @param documento
     * @return multa si la encuentra, de lo contrario null
     */
    public Multa buscarMulta(String documento){
    
        for (Multa multa : getMultas()) {
            if(multa.getCita().getPaciente().getDocumento().equals(documento)) return multa;
        }
        return null;
    }
    
    /**
     * Metodo para añadir una multa al array general de las multas
     * @param multa
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirMulta(Multa multa){
        Multa aux = buscarMulta(multa.getCita().getPaciente().getDocumento());
        
        if(aux == null){
              multas.add(multa);
              multa.getCita().getPaciente().setHasMulta(true);
              return true;
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar una multa almacenada
     * @param documento
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarMulta(String documento){
        Multa aux = buscarMulta(documento);
        
        if( aux != null ){
            for (int i = 0; i < getMultas().size(); i++) {
                if(getMultas().get(i).getCita().getPaciente().getDocumento().equals(documento)){
                    multas.get(i).getCita().getPaciente().setHasMulta(false);
                    multas.remove(i);
                    return true;                                     
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

    /**
     * @return the multas
     */
    public ArrayList<Multa> getMultas() {
        return multas;
    }

            
}

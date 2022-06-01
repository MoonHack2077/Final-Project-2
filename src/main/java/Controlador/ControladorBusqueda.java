/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.AlmacenadoExcepcion;
import Modelo.Persona;
import Modelo.Doctor;
import Modelo.Paciente;
import Modelo.Secretaria;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorBusqueda {

    private Persona[] admins;
    private ArrayList<Doctor> doctores;
    private ArrayList<Secretaria> secretarias;
    private ArrayList<Paciente> pacientes;
    
    public ControladorBusqueda() {
        admins = Singleton.getINSTANCIA().getAdmins();
        doctores = Singleton.getINSTANCIA().getDoctores();
        secretarias = Singleton.getINSTANCIA().getSecretarias();
        pacientes = Singleton.getINSTANCIA().getPacientes();
    }
    
    
    /**
     * Metodo para buscar coincidencias en los datos irrepetibles en los administradores
     * @param documento
     * @param correo
     * @param contraseña
     * @param telefono
     * @throws AlmacenadoExcepcion 
     */
    public void buscarAdmin(String documento,String correo, String contraseña, String telefono) throws AlmacenadoExcepcion{
        
        for (Persona admin : getAdmins()) {
            if( admin.getDocumento().equals(documento) ) throw new AlmacenadoExcepcion("El docmuento");
            if( admin.getCorreo().equals(correo) ) throw new AlmacenadoExcepcion("El correo");
            if(admin.getContraseña().equals(contraseña)) throw new AlmacenadoExcepcion("La contraseña"); 
            if(admin.getTelefono().equals(telefono) ) throw new AlmacenadoExcepcion("El telefono");
        }
        
    }
    
    /**
     * Metodo para buscar un admin
     * @param documento
     * @return admin si lo encuentra, de lo contrario null
     */
    public Persona buscarAdmin(String documento){
        
        for (Persona admin : getAdmins()) {
            if( admin.getDocumento().equals(documento) ) return admin;
        }
        
        return null;
    }
    
    /**
     * Metodo para buscar coincidencias en los datos irrepetibles en los doctores
     * @param documento
     * @param correo
     * @param contraseña
     * @param telefono
     * @throws AlmacenadoExcepcion 
     */
    public void buscarDoctor(String documento, String correo, String contraseña, String telefono) throws AlmacenadoExcepcion{   
        
        for (Doctor doctor : getDoctores()) {
            if( doctor.getDocumento().equals(documento) ) throw new AlmacenadoExcepcion("El docmuento");
            if( doctor.getCorreo().equals(correo) ) throw new AlmacenadoExcepcion("El correo");
            if(doctor.getContraseña().equals(contraseña)) throw new AlmacenadoExcepcion("La contraseña"); 
            if(doctor.getTelefono().equals(telefono) ) throw new AlmacenadoExcepcion("El telefono");        
        }
        
    }
    
    /**
     * Metodo para buscar un doctor registrado por medio del documento, correo y contraseña
     * @param documento
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Doctor buscarDoctor(String documento){   
        for (Doctor doctor : getDoctores()) {
            if(doctor.getDocumento().equals(documento) ) return doctor;
        }
        return null;
    }
    
    /**
     * Metodo para buscar coincidencias en los datos irrepetibles en las secretarias
     * @param documento
     * @param correo
     * @param contraseña
     * @param telefono
     * @throws AlmacenadoExcepcion 
     */
    public void buscarSecretaria(String documento, String correo, String contraseña, String telefono)throws AlmacenadoExcepcion{
    
        for (Secretaria secretaria : getSecretarias()) {
            if(secretaria.getDocumento().equals(documento) ) throw new AlmacenadoExcepcion("El docmuento");
            if(secretaria.getCorreo().equals(correo) ) throw new AlmacenadoExcepcion("El correo");
            if(secretaria.getContraseña().equals(contraseña)) throw new AlmacenadoExcepcion("La contraseña"); 
            if(secretaria.getTelefono().equals(telefono) ) throw new AlmacenadoExcepcion("El telefono");
        }
        
    }
    
    /**
     * Metodo para buscar una secretaria registrada por medio del documento
     * @param documento
     * @return secretaria si la encuentra, de lo contrario null
     */
    public Secretaria buscarSecretaria(String documento){
    
        for (Secretaria secretaria : getSecretarias()) {
            if(secretaria.getDocumento().equals(documento)) return secretaria;
        }
        return null;
    }
    
    /**
     * Metodo para buscar coincidencias en los datos irrepetibles en los pacientes
     * @param documento
     * @param correo
     * @param contraseña
     * @param telefono
     * @throws AlmacenadoExcepcion 
     */
    public void buscarPaciente(String documento, String correo, String contraseña, String telefono)throws AlmacenadoExcepcion{
    
        for (Paciente paciente : getPacientes()) {
            if(paciente.getDocumento().equals(documento) ) throw new AlmacenadoExcepcion("El docmuento");
            if(paciente.getCorreo().equals(correo) ) throw new AlmacenadoExcepcion("El correo");
            if(paciente.getContraseña().equals(contraseña)) throw new AlmacenadoExcepcion("La contraseña"); 
            if(paciente.getTelefono().equals(telefono) ) throw new AlmacenadoExcepcion("El telefono");
        }
        
    }
    
    /**
     * Metodo para buscar un paciente registrado por medio del documento
     * @param documento
     * @return paciente si lo encuentra, de lo contrario null
     */
    public Paciente buscarPaciente(String documento){
    
        for (Paciente paciente : getPacientes()) {
            if(paciente.getDocumento().equals(documento)) return paciente;
        }
        return null;
    }

    /**
     * @return the admins
     */
    public Persona[] getAdmins() {
        return admins;
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
}

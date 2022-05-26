/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Admin;
import Modelo.Doctor;
import Modelo.Paciente;
import Modelo.Secretaria;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorLogin {

    private Admin[] admins;
    private ArrayList<Doctor> doctores;
    private ArrayList<Secretaria> secretarias;
    private ArrayList<Paciente> pacientes;
    
    public ControladorLogin() {
        admins = Singleton.getINSTANCIA().getAdmins();
        doctores = Singleton.getINSTANCIA().getDoctores();
        secretarias = Singleton.getINSTANCIA().getSecretarias();
        pacientes = Singleton.getINSTANCIA().getPacientes();
    }
    
    /**
     * Metodo para añadir los admins
     * @return
     * @throws NoEncontradoExcepcion 
     */
    public void añadirAdmin(){
        Admin juan = new Admin("Juan Manuel Arenas Rincon", "1234567890", "juan@mihospital.co", "soyeladmin1", "3000000000", 20, "Soltero");
        Admin bryan = new Admin("Bryan Alejandro Benavides", "9876543210", "bryan@mihospital.co", "soyeladmin2", "4000000000", 20, "Casado");
        
        admins[0] = juan;    
        admins[1] = bryan;
    }
    
    /**
     * Metodo para buscar un admin
     * @param correo
     * @param contraseña 
     * @return admin si lo encuentra, de lo contrario null
     */
    public Admin buscarAdmin(String correo, String contraseña){
        
        for (Admin admin : admins) {
            if( admin.getCorreo().equals(correo) && admin.getContraseña().equals(contraseña) ) return admin;
        }
        
        return null;
    }

    /**
     * Metodo para buscar un doctor registrado por medio del documento
     * @param documento
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Doctor buscarDoctor(String correo, String contraseña){   
        for (Doctor doctor : doctores) {
            if(doctor.getCorreo().equals(correo) && doctor.getContraseña().equals(contraseña)) return doctor;
        }
        return null;
    }
    
    /**
     * Metodo para buscar una secretaria registrada por medio del documento
     * @param documento
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Secretaria buscarSecretaria(String correo, String contraseña){   
        for (Secretaria secretaria : secretarias) {
            if(secretaria.getCorreo().equals(correo) && secretaria.getContraseña().equals(contraseña)) return secretaria;
        }
        return null;
    }
    
     /**
     * Metodo para buscar un paciente registrado por medio del documento
     * @param documento
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Paciente buscarPaciente(String correo, String contraseña){   
        for (Paciente paciente : pacientes) {
            if(paciente.getCorreo().equals(correo) && paciente.getContraseña().equals(contraseña)) return paciente;
        }
        return null;
    }
    
}

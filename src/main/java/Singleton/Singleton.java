/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Modelo.Admin;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Multa;
import Modelo.Paciente;
import Modelo.Secretaria;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Singleton{
    
    private static Singleton INSTANCIA = new Singleton();
    
    private Admin[] admins;
    private ArrayList<Doctor> doctores;
    private ArrayList<Secretaria> secretarias;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Cita> citas;
    private ArrayList<Multa> multas;
    
    private String txtDoctores = "doctores.txt";
    private String txtSecretarias = "secretarias.txt";
    private String txtPacientes = "pacientes.txt";
    private String txtCitas = "citas.txt";
    private String txtMultas = "multas.txt";
    
    private Singleton() {
        admins = new Admin[2];
        doctores = leerDoctores();
        secretarias = leerSecretarias();
        pacientes = leerPacientes();
        citas = leerCitas();
        multas = leerMultas();
    }
    
    /**
     * Metodo para escribir los doctores 
     */
    public void escribirDoctores(){
        try{
            FileOutputStream archivo = new FileOutputStream(txtDoctores);
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(doctores);
        }catch(FileNotFoundException ex){
            ex.getStackTrace();
        }catch(IOException ex){
            ex.getStackTrace();
        }
    }

    /**
     * Metodo para leer los doctores
     * @return ArrayList
     */
    public ArrayList<Doctor> leerDoctores(){
    
        try{
            FileInputStream archivo = new FileInputStream(txtDoctores);
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Doctor>) lector.readObject();
        }catch(IOException | ClassNotFoundException ex){
            ex.getStackTrace();
            return new ArrayList<>();
        }
        
    }
    
    /**
     * Metodo para escribir las secretarias
     */
    public void escribirSecretarias(){
        try{
            FileOutputStream archivo = new FileOutputStream(txtSecretarias);
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(secretarias);
        }catch(FileNotFoundException ex){
            ex.getStackTrace();
        }catch(IOException ex){
            ex.getStackTrace();
        }
    }

    /**
     * Metodo para leer las secretarias
     * @return ArrayList
     */
    public ArrayList<Secretaria> leerSecretarias(){
    
        try{
            FileInputStream archivo = new FileInputStream(txtSecretarias);
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Secretaria>) lector.readObject();
        }catch(IOException | ClassNotFoundException ex){
            ex.getStackTrace();
            return new ArrayList<>();
        }
        
    }
    
    
    /**
     * Metodo para escribir los pacientes
     */
    public void escribirPacientes(){
        try{
            FileOutputStream archivo = new FileOutputStream(txtPacientes);
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(pacientes);
        }catch(FileNotFoundException ex){
            ex.getStackTrace();
        }catch(IOException ex){
            ex.getStackTrace();
        }
    }

    /**
     * Metodo para leer los pacientes
     * @return ArrayList
     */
    public ArrayList<Paciente> leerPacientes(){
    
        try{
            FileInputStream archivo = new FileInputStream(txtPacientes);
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Paciente>) lector.readObject();
        }catch(IOException | ClassNotFoundException ex){
            ex.getStackTrace();
            return new ArrayList<>();
        }
        
    }
    
    
    /**
     * Metodo para escribir las citas
     */
    public void escribirCitas(){
        try{
            FileOutputStream archivo = new FileOutputStream(txtCitas);
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(citas);
        }catch(FileNotFoundException ex){
            ex.getStackTrace();
        }catch(IOException ex){
            ex.getStackTrace();
        }
    }

    /**
     * Metodo para leer las citas
     * @return ArrayList
     */
    public ArrayList<Cita> leerCitas(){
    
        try{
            FileInputStream archivo = new FileInputStream(txtCitas);
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Cita>) lector.readObject();
        }catch(IOException | ClassNotFoundException ex){
            ex.getStackTrace();
            return new ArrayList<>();
        }
        
    }
    
    /**
     * Metodo para escribir las multas
     */
    public void escribirMultas(){
        try{
            FileOutputStream archivo = new FileOutputStream(txtMultas);
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(multas);
        }catch(FileNotFoundException ex){
            ex.getStackTrace();
        }catch(IOException ex){
            ex.getStackTrace();
        }
    }

    /**
     * Metodo para leer las multas
     * @return ArrayList
     */
    public ArrayList<Multa> leerMultas(){
    
        try{
            FileInputStream archivo = new FileInputStream(txtMultas);
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Multa>) lector.readObject();
        }catch(IOException | ClassNotFoundException ex){
            ex.getStackTrace();
            return new ArrayList<>();
        }
        
    }
    
    
    /**
     * @return the INSTANCIA
     */
    public static Singleton getINSTANCIA() {
        return INSTANCIA;
    }

    /**
     * @return the admins
     */
    public Admin[] getAdmins() {
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

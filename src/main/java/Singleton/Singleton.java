/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Modelo.Cita;
import Modelo.Multa;
import Modelo.Persona;
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
    
    private ArrayList<Persona> lista;
    private ArrayList<Cita> citas;
    private ArrayList<Multa> multas;
    
    
    private Singleton() {
        lista = leerLista();
        citas = leerCitas();
        multas = leerMultas();
    }
    
    /**
     * Metodo para escribir la lista de los usuarios registrados
     */
    public void escribirLista(){
        try{
            FileOutputStream archivo = new FileOutputStream("lista.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(getLista());
        }catch(FileNotFoundException ex){
            ex.getStackTrace();
        }catch(IOException ex){
            ex.getStackTrace();
        }
    }

    /**
     * Metodo para leer los usuarios registrados
     * @return 
     */
    public ArrayList<Persona> leerLista(){
    
        try{
            FileInputStream archivo = new FileInputStream("lista.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Persona>) lector.readObject();
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
            FileOutputStream archivo = new FileOutputStream("citas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(getCitas());
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
            FileInputStream archivo = new FileInputStream("citas.dat");
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
            FileOutputStream archivo = new FileOutputStream("multas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(getMultas());
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
            FileInputStream archivo = new FileInputStream("multas.dat");
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

    /**
     * @return the lista
     */
    public ArrayList<Persona> getLista() {
        return lista;
    }

}

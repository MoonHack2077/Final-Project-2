/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.AlmacenadoExcepcion;
import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
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
public class ControladorCrud {

    private ArrayList<Persona> lista;
    
    public ControladorCrud() {
        lista = Singleton.getINSTANCIA().getLista();
    }
    
    
    /**
     * Metodo para buscar coincidencias en los datos irrepetibles en los administradores
     * @param documento, el documento a comparar del usuario 
     * @param correo, el correo a comparar del usuario
     * @param contraseña, la contraseñaa comparar del usuario
     * @param telefono, el telefono a comparar del usuario
     * @throws AlmacenadoExcepcion, si alguno de los datos por parametro coincide con alguno de los almacenados 
     */
    public void buscarCoincidencia(String documento,String correo, String contraseña, String telefono) throws AlmacenadoExcepcion{
        
        for (Persona persona : getLista()) {
            if( persona.getDocumento().equals(documento) ) throw new AlmacenadoExcepcion("El docmuento");
            if( persona.getCorreo().equals(correo) ) throw new AlmacenadoExcepcion("El correo");
            if( persona.getContraseña().equals(contraseña)) throw new AlmacenadoExcepcion("La contraseña"); 
            if( persona.getTelefono().equals(telefono) ) throw new AlmacenadoExcepcion("El telefono");
        }
        
    }
    
    /**
     * Metodo para buscar un doctor registrado por medio del documento, correo y contraseña
     * @param documento, el documento del usuario a ser buscado
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Persona buscarPersona(String documento){   
        for (Persona persona : getLista()) {
            if(persona.getDocumento().equals(documento) ){
                if( persona instanceof Doctor) return (Doctor) persona;
                
                if( persona instanceof Secretaria) return(Secretaria) persona;
                
                if( persona instanceof Paciente)return(Paciente) persona;
                
            }
        }
        return null;
    }
    
    /**
     * Metodo para añadir un usuario a la lista
     * @param persona, la persona a ser añadida
     * @return true al ser añadida la persona
     * @throws MayorDeEdadExcepcion en el caso de que la persona sea instancia de un doctor o secretaria, si 
     * es menor deedad no será añadido
     */
    public boolean añadirUsuario(Persona persona)throws MayorDeEdadExcepcion {
        buscarCoincidencia(persona.getDocumento(), persona.getCorreo(), persona.getContraseña(), persona.getTelefono());
        
        //Excepciones
        if( persona instanceof Doctor ||  persona instanceof Secretaria ){
            if( persona.getEdad() < 18) throw new MayorDeEdadExcepcion();
        }
        
        lista.add(persona);
        Singleton.getINSTANCIA().escribirLista();
        
        return true;
    }
    
    /**
     * Metodo para eliminar un usuario
     * @param documento, el documento de la persona a eliminar
     * @return true si lo elimina
     * @throws NoEncontradoExcepcion, en caso de que el documento no coincida con alguno de los que estan almacenados 
     */
    public boolean eliminarUsuario(String documento) throws NoEncontradoExcepcion{
        Persona persona = buscarPersona(documento);
        
        //Excepcion
        if( persona == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < lista.size(); i++) {
            if( lista.get(i).getDocumento().equals(documento )){
                lista.remove(i);
                Singleton.getINSTANCIA().escribirLista();
            }
        }
        
        return true;
    }
    
    /**
     * Metodo para editar la informacion de un usuario
     * @param usuario, el usuario con la informacion a editar
     * @return true si la pudo editar
     * @throws NoEncontradoExcepcion, en caso de que el documento no coincida con alguno de los que estan almacenados 
     * @throws MayorDeEdadExcepcionen el caso de que la persona sea instancia de un doctor o secretaria, si 
     * es menor deedad no será añadido 
     */
    public boolean editarUsuario(Persona usuario) throws NoEncontradoExcepcion, MayorDeEdadExcepcion{       
        Persona persona = buscarPersona(usuario.getDocumento());
        
        //Excepciones
        if( persona == null ) throw new NoEncontradoExcepcion();
        if( persona instanceof Doctor ||  persona instanceof Secretaria ){
            if( persona.getEdad() < 18) throw new MayorDeEdadExcepcion();
        }
        
        for(int i=0 ; i < lista.size(); i++){
            if( lista.get(i).getDocumento().equals(usuario.getDocumento() )){
                //Inyectando los nuevos valores
                lista.get(i).setNombre(usuario.getNombre());
                lista.get(i).setEdad(usuario.getEdad());
                lista.get(i).setContraseña(usuario.getContraseña());
                lista.get(i).setCorreo(usuario.getCorreo());
                lista.get(i).setEstadoCivil(usuario.getEstadoCivil());
                lista.get(i).setTelefono(usuario.getTelefono());
                
                if( lista.get(i) instanceof Doctor ){
                    Doctor doc = (Doctor) lista.get(i);
                    Doctor docUser = (Doctor) usuario;
                    doc.setEspecialidad( docUser.getEspecialidad() );
                }
                
                if( lista.get(i) instanceof Secretaria ){
                    Secretaria sec = (Secretaria) lista.get(i);
                    Secretaria secUser = (Secretaria) usuario;
                    sec.setAñosExp(secUser.getAñosExp());
                }
                
                if( lista.get(i) instanceof Paciente ){
                    Paciente pac = (Paciente) lista.get(i);
                    Paciente pacUser = (Paciente) usuario;
                    pac.setRegimenDeSalud( pacUser.getRegimenDeSalud() );
                }
                
                Singleton.getINSTANCIA().escribirLista();
            }
        }
        
        return true;
    }
    

    /**
     * @return the lista
     */
    public ArrayList<Persona> getLista() {
        return lista;
    }
  
}

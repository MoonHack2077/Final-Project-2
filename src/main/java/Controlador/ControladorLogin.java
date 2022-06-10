/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorLogin {

    private ArrayList<Persona> lista;
    
    public ControladorLogin() {
        lista = Singleton.getINSTANCIA().getLista();
    }
    
    /**
     * Metodo para añadir los admins
     */
    public void añadirAdmin(){
        Persona juan = new Persona("Juan Manuel Arenas Rincon", "1234567890", "juan@mihospital.co", "soyadmin1", "3000000000", 20, "Soltero");
        Persona bryan = new Persona("Bryan Alejandro Benavides", "9876543210", "bryan@mihospital.co", "soyadmin2", "4000000000", 20, "Casado");
        
        lista.add(juan);
        lista.add(bryan);
    }
    
    /**
     * Metodo para buscar el usuario que coincida con los datos introducidos en el login
     * @param correo, el correo que es introducido en el textField
     * @param contraseña, la contraseña que es introducido en el textField
     * @return la persona que coincida, de lo contrario null
     */
    public Persona buscarUsuario(String correo, String contraseña){
        
        for (Persona persona : lista) {
            if( persona.getCorreo().equals(correo) && persona.getContraseña().equals(contraseña) ) return persona;
        }
        
        return null;
    }
    
}

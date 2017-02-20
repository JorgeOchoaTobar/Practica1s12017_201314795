/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class NodoUsuario {

    String Nombre;
    NodoUsuario sig;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public NodoUsuario getSigUsuario(){
    return sig;
    }
    
    public void setSigUsuario(NodoUsuario sig){
    this.sig = sig;
    }
    
    public NodoUsuario(String Nom){
     Nombre = Nom;
     sig = this;
    }
}

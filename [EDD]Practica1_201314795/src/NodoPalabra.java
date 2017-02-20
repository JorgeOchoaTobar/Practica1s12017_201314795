/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class NodoPalabra {

    String Palabra;
    NodoPalabra sig;

//Insertar al insertar al final
    public NodoPalabra(String p) {
        this.Palabra = p;
        this.sig = null;
    }

    //Insertar al inicio
    public NodoPalabra(String p, NodoPalabra n) {
        Palabra = p;
        sig = n;
    }

}

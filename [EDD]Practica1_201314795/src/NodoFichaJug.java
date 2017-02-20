/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class NodoFichaJug {
    String letraJu;
    NodoFichaJug sig;
    
    public NodoFichaJug(String p) {
        this.letraJu = p;
        this.sig = null;
    }

    //Insertar al inicio
    public NodoFichaJug(String p, NodoFichaJug n) {
        letraJu = p;
        sig = n;
    }

}

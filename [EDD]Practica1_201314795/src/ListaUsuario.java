/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ListaUsuario {

    private NodoUsuario inicio;

    public ListaUsuario() {
        inicio = null;
    }

    public boolean Vacia() {
        return inicio == null;
    }

    public ListaUsuario insertarUsuario(String n) {
        NodoUsuario nuevo = new NodoUsuario(n);
        if (inicio != null) {
            nuevo.sig = inicio.sig;
            inicio.sig = nuevo;
        }
        inicio = nuevo;
        return this;
    }

    public void recorreUsuario() {
        NodoUsuario aux = inicio.sig;
        String usu = "";
        do {
            usu = usu + "[" + aux.Nombre + "]->";
            aux = aux.sig;
        } while (aux != inicio.sig);
        System.out.print(usu);
    }

    public boolean eliminar(String n) {
        NodoUsuario actual = inicio;
        boolean encontrar = false;
        while (actual.sig != inicio && !encontrar) {
            encontrar = (actual.sig.Nombre == n);
            if (!encontrar) {
                actual = actual.sig;
            }
        }
        encontrar = (actual.sig.Nombre == n);
        if (encontrar) {
            NodoUsuario aux = actual.sig;
            if (inicio == inicio.sig) {
                inicio = null;
            } else {
                if (aux == inicio) {
                    inicio = actual;
                }
                actual.sig = aux.sig;
            }
            aux = null;
        }
        return encontrar == true;
    }
}

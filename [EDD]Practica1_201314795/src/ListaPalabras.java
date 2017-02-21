/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ListaPalabras {

    protected NodoPalabra inicio, fin;

    public ListaPalabras() {
        inicio = null;
        fin = null;
    }

    public boolean Vacia() {
        if (inicio == null) {

            return true;
        } else {
            return false;
        }
    }

    public void AgregarInicio(String p) {
        inicio = new NodoPalabra(p, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void AgregarFinal(String p) {
        if (!Vacia()) {
            fin.sig = new NodoPalabra(p);
            fin = fin.sig;
        } else {
            inicio = fin = new NodoPalabra(p);
        }
    }

    public void mostrarLista() {
        NodoPalabra recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.Palabra + "]->");
            recorrer = recorrer.sig;
        }
    }
    
    public boolean buscar(String pal){
     NodoPalabra actual = inicio;
        boolean busca = false;
        while (actual.sig != null && !busca) {
            busca = (actual.sig.Palabra == pal);
            if (!busca) {
                actual = actual.sig;
            }
        }
        return busca;
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ColaFichas {

    NodoFichas inicio, fin;
    int tam;

    public ColaFichas() {
        inicio = fin = null;
        tam = 0;
    }

    public boolean Vacia() {
        return inicio == null;
    }

    public void insertarFichas(String l) {
        NodoFichas nuevo = new NodoFichas(l);
        if (Vacia()) {
            inicio = nuevo;
        } else {
            fin.sig = nuevo;
        }
        fin = nuevo;
        tam++;
    }

    public String QuitarFicha() {
        String aux = inicio.letras;
        inicio = inicio.sig;
        tam--;
        return aux;
    }

    public String InicioFicha() {
        return inicio.letras;
    }

    public int TamañoCola() {
        return tam;
    }
    
      public void mostarColaFicha() {
        NodoFichas recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.letras + "]->");
            recorrer = recorrer.sig;
        }
    }
}

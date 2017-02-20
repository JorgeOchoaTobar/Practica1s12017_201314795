/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ListaFichaJug {

    protected NodoFichaJug inicio, fin;

    public ListaFichaJug() {
        inicio = null;
        fin = null;
    }

    public boolean VaciaFicha() {
        if (inicio == null) {

            return true;
        } else {
            return false;
        }
    }

    public void AgregarInicioFicha(String p) {
        inicio = new NodoFichaJug(p, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void AgregarFinalFicha(String p) {
        if (!VaciaFicha()) {
            fin.sig = new NodoFichaJug(p);
            fin = fin.sig;
        } else {
            inicio = fin = new NodoFichaJug(p);
        }
    }

    public void mostrarListaFicha() {
        NodoFichaJug recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.letraJu + "]->");
            recorrer = recorrer.sig;
        }
    }

    public void eliminarFicha(String l) {
        if (!VaciaFicha()) {
            if (inicio == fin && l == inicio.letraJu) {
                inicio = fin = null;
            } else if (l == inicio.letraJu) {
                inicio = inicio.sig;
            } else {
                NodoFichaJug anterior, temporal;
                anterior = inicio;
                temporal = inicio.sig;
                while (temporal != null && temporal.letraJu != l) {
                    anterior = anterior.sig;
                    temporal = temporal.sig;
                }
                if (temporal != null) {
                    anterior.sig = temporal.sig;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class EDDPractica1_201314795 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaUsuario Usuario = new ListaUsuario();
        ListaPalabras Palabra = new ListaPalabras();
        ListaFichaJug fichaju = new ListaFichaJug();
        ColaFichas fichas = new ColaFichas();
        boolean eliminado = false;
        Usuario.insertarUsuario("Jorge");
        Usuario.insertarUsuario("Billy");
        Usuario.insertarUsuario("Ochoa");
        Usuario.insertarUsuario("Tobar");
        Usuario.recorreUsuario();
        if (!Usuario.Vacia()) {
            eliminado = Usuario.eliminar("Billy");
            System.out.println(eliminado);
            Usuario.recorreUsuario();
            System.out.println();
        }
        Palabra.AgregarFinal("perro");
        Palabra.AgregarFinal("gato");
        Palabra.AgregarFinal("pez");
        Palabra.AgregarFinal("amor");
        Palabra.mostrarLista();
        System.out.println();

        fichaju.AgregarFinalFicha("A");
        fichaju.AgregarFinalFicha("B");
        fichaju.AgregarFinalFicha("C");
        fichaju.AgregarFinalFicha("D");
        fichaju.mostrarListaFicha();
        System.out.println();
        if (!fichaju.VaciaFicha()) {
            fichaju.eliminarFicha("B");
            fichaju.mostrarListaFicha();
        System.out.println();
        }

        System.out.println("Hoal");
        fichas.insertarFichas("A");
        fichas.insertarFichas("E");
        fichas.insertarFichas("D");
        fichas.insertarFichas("C");
        fichas.mostarColaFicha();
        System.out.println();
        if (!fichas.Vacia()) {
            fichas.QuitarFicha();
            fichas.QuitarFicha();
            fichas.QuitarFicha();
            fichas.QuitarFicha();
            fichas.mostarColaFicha();
        }

// TODO code application logic here
    }

}

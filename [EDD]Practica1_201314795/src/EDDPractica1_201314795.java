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
        Panel1 p2 = new Panel1();
        ColaFichas fichas = new ColaFichas();
        boolean eliminado = false;
        p2.setVisible(true);

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
        System.out.println(Palabra.buscar("pez"));
        System.out.println(Palabra.buscar("amor"));

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
        fichas.insertarFichas("R");
        fichas.insertarFichas("T");
        fichas.insertarFichas("J");
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

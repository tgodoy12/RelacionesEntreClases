package teorico2.service;
/**
 * disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
 *  * mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
 *  * revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
 *  * devuelve true, sino false.
 */

import teorico2.entities.Jugador;
import teorico2.entities.Revolver;

import java.util.ArrayList;

public class JugadorService {
    private ArrayList<Jugador> listaJugadores;

    public JugadorService() {
        listaJugadores = new ArrayList<>(6);
    }

    public Jugador crearJugador(Integer id, String nombre) {
        return new Jugador(id, nombre);
    }

    public void anadirLista(Jugador j) {
        listaJugadores.add(j);
    }

   // public boolean disparo(Revolver r) {
    //}

}

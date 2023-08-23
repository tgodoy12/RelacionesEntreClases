package teorico2.service;

import teorico2.entities.Juego;
import teorico2.entities.Jugador;
import teorico2.entities.Revolver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JuegoService {
    public ArrayList<Jugador> jugadoresArray;


    public JuegoService() {
        jugadoresArray = new ArrayList<>();

    }

    //Jugadores
    public void crearJugador(Integer id, String nombre) {
        Jugador j = new Jugador(id, nombre);
        anadirLista(j);
    }

    private void anadirLista(Jugador j) {
        jugadoresArray.add(j);
    }

    //Revolver
    private Revolver llenarRevolver() {
        Revolver r = new Revolver();

        Integer posActual = (int) (Math.random() * 7);
        Integer posAgua = (int) (Math.random() * 7);

        r.setPosicionActual(posActual);
        r.setPosicionAgua(posAgua);


        return r;
    }

    private boolean mojar(Revolver r) {
        if (r.getPosicionActual().equals(r.getPosicionAgua())) {
            return true;
        }
        return false;

    }


    private void siguienteChoro(Revolver r) {
        Integer posA = r.getPosicionActual();
        if (posA < 6) {
            posA++;
        } else {
            posA = 1;
        }
    }

    private boolean disparo(Revolver r) {
        boolean mojado = mojar(r);
        if (!mojado) {
            siguienteChoro(r);
            return mojado;
        } else {
            return mojado;
        }
    }

    //Métodos de juego
    public Juego llenarJuego(ArrayList<Jugador> jugadoresList, Revolver r) {

        Juego j = new Juego(jugadoresList, r);

        return j;
    }



    /** ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
     * aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
     * moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
     * mojar. Al final del juego, se debe mostrar que jugador se mojó.
     * Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     */
    public void ronda(ArrayList<Jugador> jugadoresList) {
        Revolver r = llenarRevolver();
        Juego nuevoJuego = llenarJuego(jugadoresList, r);
        Iterator it = jugadoresList.iterator();

        while (it.hasNext()) {
            
        }

    }


}
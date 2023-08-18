package teorico2.service;

import teorico2.entities.Juego;
import teorico2.entities.Jugador;
import teorico2.entities.Revolver;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoService {
    private ArrayList<Jugador> jugadoresArray;

    public JuegoService() {
        jugadoresArray = new ArrayList<>();

    }

    //Jugadores
    private void crearJugador(Integer id, String nombre) {
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
        boolean mojado = mojar(r);
        if (!mojado) {
            r.setPosicionActual(r.getPosicionActual() + 1);
        }
    }

    //Métodos de juego
    public Juego llenarJuego(ArrayList<Jugador> jArray, Revolver r) {

        Juego j = new Juego(jArray, r);

        return j;
    }

    /** ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
     * aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
     * moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
     * mojar. Al final del juego, se debe mostrar que jugador se mojó.
     * Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     */
    public ArrayList<Jugador> preRonda() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducir cantidad de jugadores. Max 6");
        int cantidad = scanner.nextInt();
        if (cantidad>6)  {
            cantidad = 6;
        }

        String nombre;
        Integer id;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre:");
            nombre = scanner.next();
            System.out.println("ID:");
            id = scanner.nextInt();
            crearJugador(id, nombre);
        }

        return jugadoresArray;

    }

    public void ronda() {
        ArrayList<Jugador> jugadores = preRonda();
        Juego j = llenarJuego(jugadores, llenarRevolver());

        for (Jugador aux: jugadores) {
            System.out.println();
            if (aux.isMojado()) {
                System.out.println("El jugador " + aux.getNombre() + aux.getId() + "ha ganado la partida");
                break;
            }

        }


    }


}
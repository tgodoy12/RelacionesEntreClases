package teorico2.entities;

import java.util.ArrayList;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
 * Revolver
 */

public class Juego {
    private ArrayList<Jugador> jugadoresList;
    private Revolver r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadoresList, Revolver r) {
        this.jugadoresList = jugadoresList;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadoresList() {
        return jugadoresList;
    }

    public void setJugadoresList(ArrayList<Jugador> jugadoresList) {
        this.jugadoresList = jugadoresList;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "jugadoresList=" + jugadoresList +
                ", r=" + r +
                '}';
    }
}

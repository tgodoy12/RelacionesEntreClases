package ejercicio3.service;

import ejercicio3.entities.Baraja;
import ejercicio3.entities.Carta;
import ejercicio3.enumeraciones.Palo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BarajaService {
    ArrayList<Carta> cartas;

    public BarajaService() {
        this.cartas = new ArrayList<>();
    }

    public Baraja crearBaraja() {
        int numero = 1;
        Palo palo;
        for (int i=0; i<40; i++) {
            if (i >=0 && i <10) {
                if ((numero == 8) || (numero == 9)) {
                    numero++;
                    numero++;
                }
                Carta carta = new Carta(numero, Palo.BASTO);
                cartas.add(carta);

            } else if(i >= 10 && i <20) {
                if (i == 10) {
                    numero = 1;
                }
                if ((numero == 8) || (numero == 9)) {
                    numero++;
                    numero++;
                }
                Carta carta = new Carta(numero, Palo.COPA);
                cartas.add(carta);

            } else if(i >= 20 && i <30) {
                if (i == 20) {
                    numero = 1;
                }
                if ((numero == 8) || (numero == 9)) {
                    numero++;
                    numero++;
                }
                Carta carta = new Carta(numero, Palo.ORO);
                cartas.add(carta);

            } else if(i >= 30 && i <40) {
                if (i == 30) {
                    numero = 1;
                }
                if ((numero == 8) || (numero == 9)) {
                    numero++;
                    numero++;
                }
                Carta carta = new Carta(numero, Palo.ESPADA);
                cartas.add(carta);
            }
            numero++;
        }

        Baraja baraja = new Baraja(cartas);

        return baraja;
    }

    public Baraja barajar(Baraja baraja) {
        Collections.shuffle(baraja.getCartas());

        return baraja;
    }

    public void siguienteCarta(Baraja baraja) {
        ArrayList<Carta> cartas = baraja.getCartas();
        Iterator it = cartas.iterator();

        if (it.hasNext()) {
            System.out.println(it.next() + " ");
            it.remove();
        } else {
            System.out.println("Ya no quedan más cartas disponibles");
        }
    }

    public int cartasDisponibles(Baraja baraja) {
        int disponibles = baraja.getCartas().size();

        return disponibles;
    }

    /**
    public ArrayList<Carta> darCartas(Baraja baraja, int numero) {

    }
    */

}

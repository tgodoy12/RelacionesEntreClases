package ejercicio3.service;

import ejercicio3.entities.Baraja;
import ejercicio3.entities.Carta;
import ejercicio3.enumeraciones.Palo;

import java.util.ArrayList;

public class BarajaService {
    ArrayList<Carta> cartas;

    public BarajaService() {
        this.cartas = new ArrayList<>();
    }

    public Baraja crearBaraja() {
        int numero = 1;
        Palo palo;
        for (int i=0; i<40; i++) {
            if (i >=0 && i <=10) {
                Carta carta = new Carta(numero++, Palo.BASTO);
                cartas.add(carta);
            } else if(i >= 11 && i <=20) {
                Carta carta = new Carta(numero++, Palo.COPA);
                cartas.add(carta);
            } else if(i >= 21 && i <=30) {
                Carta carta = new Carta(numero++, Palo.ORO);
                cartas.add(carta);
            } else if(i >= 31 && i <=40) {
                Carta carta = new Carta(numero++, Palo.ESPADA);
                cartas.add(carta);
            }
        }

        Baraja baraja = new Baraja(cartas);

        return baraja;
    }


}

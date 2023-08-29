package ejercicio3.entities;

import ejercicio3.enumeraciones.Palo;

public class Carta {
    private int numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(int numero, Palo palo) {
        if ((numero >= 1) && (numero <= 12) && (numero != 8) && (numero != 9)) {
            this.numero = numero;
        }
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo=" + palo +
                '}';
    }
}

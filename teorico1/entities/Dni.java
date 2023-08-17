package teorico1.entities;

public class Dni {
    private String serie;
    private int numero;

    public Dni() {
    }

    public Dni(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" +
                "serie='" + serie + '\'' +
                ", numero=" + numero +
                '}';
    }
}

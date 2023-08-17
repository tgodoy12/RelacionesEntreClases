package teorico2.service;

import teorico2.entities.Revolver;



/**
 * llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
 *  deben ser aleatorios.
 *  • mojar(): devuelve true si la posición del agua coincide con la posición actual
 *  • siguienteChorro(): cambia a la siguiente posición del tambor
 *  • toString(): muestra información del revolver (posición actual y donde está el agua)
 */

public class RevolverService {


    public Revolver llenarRevolver() {
        Revolver r = new Revolver();

        Integer posActual = (int) (Math.random() * 7);
        Integer posAgua = (int) (Math.random() * 7);

        r.setPosicionActual(posActual);
        r.setPosicionAgua(posAgua);


        return r;
    }

    public boolean mojar(Revolver r) {
        if (r.getPosicionActual().equals(r.getPosicionAgua())) {
            return true;
        }
        return false;

    }


    public void siguienteChoro(Revolver r) {
        boolean mojado = mojar(r);
        if (!mojado) {
            r.setPosicionActual(r.getPosicionActual() + 1);
        }
    }
//TODO pasar los metodos directamente a la clase Revolver y borrar la clase service
}


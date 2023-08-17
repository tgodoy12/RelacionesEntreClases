package teorico1.service;

import teorico1.entities.Dni;
import teorico1.entities.Persona;

import java.util.Scanner;

public class PersonaService {

    /**
     * Relacion 1..1 entre Persona y Dni
     * Este metodo instancia la clase dni únicamente porque se instancia la clase persona.
     * Dni tiene una relacion de COMPOSICION con Persona
     * Si persona se elimina, se elimina dni
     *
     * @param nombre
     * @param apellido
     * @param serie
     * @param numero
     * @return
     */
    public Persona crearPersona(String nombre, String apellido, String serie, int numero) {
        Persona person = new Persona(nombre, apellido);
        Dni dni = new Dni(serie, numero);
        person.setDni(dni);

        return person;
    }

    public void mostrarPersona(Persona p) {
        System.out.println(p.toString());
        System.out.println(p.getDni().toString());
    }

}

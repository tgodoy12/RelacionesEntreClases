package ejercicio1.service;

import ejercicio1.entities.Perro;
import ejercicio1.entities.Persona;

import java.util.ArrayList;

public class PersonaService {
    public ArrayList<Persona> personaArray;

    //el constructor de la clase inicializa el array
    public PersonaService() {
        personaArray = new ArrayList<>();
    }

    //crear persona sin perro
    public Persona crearPersona(String nombre, String apellido, Integer documento) {
        Persona person = new Persona(nombre, apellido, documento);
        personaArray.add(person);

        return person;
    }

    //crear persona nueva con perro nuevo
    public Persona asociarPersonaPerro (String nombre, String apellido, Integer documento, String nombrePerro, String raza, Integer edad, Integer tamanio) {
        Persona person = new Persona(nombre, apellido, documento);
        Perro dog = new Perro(nombrePerro, raza, edad, tamanio);
        person.setPerro(dog);
        personaArray.add(person);

        return person;
    }

    //asociar persona a perro, siendo ambos creados anteriormente
    public void perroParaPersona(Persona person, Perro dog) {
        person.setPerro(dog);
    }

    //asociar perro nuevo a persona en lista de espera (ya creada)
    public void perroNuevoAdoptado(Persona person, String nombrePerro, String raza, Integer edad, Integer tamanio) {
        Perro dog = new Perro(nombrePerro, raza, edad, tamanio);
        person.setPerro(dog);
    }

    //asociar Persona nueva a perro ya en la lista de espera
    public Persona personaNuevaAdopta(Perro dog, String nombre, String apellido, Integer documento) {
        Persona person = crearPersona(nombre, apellido, documento);
        perroParaPersona(person, dog);

        return person;
    }
}

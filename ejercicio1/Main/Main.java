package ejercicio1.Main;

import ejercicio1.entities.Perro;
import ejercicio1.entities.Persona;
import ejercicio1.service.PerroService;
import ejercicio1.service.PersonaService;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
 * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */

public class Main {
    public static void main(String[] args) {
        PersonaService personServ = new PersonaService();
        PerroService dogServ = new PerroService();

        Perro dog1 = dogServ.crearPerro("rufo", "beagle", 10, 80);
        Perro dog2 = dogServ.crearPerro("pitufo", "chihuahua", 20, 15);

        Persona person1 = personServ.crearPersona("Trilce", "godoy", 46626163);
        Persona person2 = personServ.crearPersona("Lala", "Jira", 414512313);

        personServ.personaNuevaAdopta(dog1, "Mariela", "gonzalez", 45615616);
        personServ.perroParaPersona(person1, dog2);

        //TODO agregar sout en los metodos para ver los datos ingresados a medida que los voy probando


    }
}

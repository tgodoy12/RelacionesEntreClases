package teorico1.main;

import teorico1.entities.Dni;
import teorico1.entities.Persona;
import teorico1.service.PersonaService;

import java.util.Scanner;

/**
 * Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
 * objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
 * acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */

public class Main {
    public static void main(String[] args) {
        PersonaService personaServ = new PersonaService();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Nombre:");
        String nombre = scanner.next();

        System.out.println("Apellido:");
        String apellido = scanner.next();

        System.out.println("DNI:");
        System.out.println("Serie:");
        String serie = scanner.next();
        System.out.println("Número:");
        int numero = scanner.nextInt();

       Persona persona = personaServ.crearPersona(nombre, apellido, serie, numero);

       personaServ.mostrarPersona(persona);



    }
}

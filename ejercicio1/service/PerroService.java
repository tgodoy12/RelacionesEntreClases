package ejercicio1.service;

import ejercicio1.entities.Perro;

import java.util.ArrayList;

public class PerroService {
    private ArrayList<Perro> perroArray;

    public PerroService() {
        perroArray = new ArrayList<>();
    }

    public Perro crearPerro(String nombre, String raza, Integer edad, Integer tamanio) {
        Perro dog = new Perro(nombre, raza, edad, tamanio);
        perroArray.add(dog);
        return dog;
    }

    //TODO crear múltiples perros pasando cantidad por parametro


}


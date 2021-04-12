package es.quantosh.app;

import es.quantosh.app.hogar.Persona;
 // O usar wildcard

public class EjemploPaquetes {
    public static void main(String[] args) {

        // Haciendo referencia a la clase completo dentro de un package, no haría falta el import de esta forma
        /*
        es.quantosh.app.hogar.Persona Ismael = new es.quantosh.app.hogar.Persona();
        Ismael.nombre = "Ismael";
        Ismael.apellido = "Barea";
         */

        // Con import instanciando persona
        Persona Victor = new Persona("Tass", "Notreal");
        Victor.setNombre("Victor");
        Victor.setApellido("Peperoni");

        // Mismo package no necesita import o referencia
        Perro perro1 = new Perro();
        perro1.nombre = "Tobby";
        perro1.raza = "Bulldog";

        System.out.println("Apellido: "+ Victor.getApellido() + "\nNombre: " + Victor.getNombre());
    }
}

package es.quantosh.app.jardin;

import es.quantosh.app.hogar.Persona;
 // O usar wildcard

// 161 Import static
import static es.quantosh.app.hogar.Persona.*;
import static es.quantosh.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        // Haciendo referencia a la clase completo dentro de un package, no haría falta el import de esta forma
        /*
        es.quantosh.app.hogar.Persona Ismael = new es.quantosh.app.hogar.Persona();
        Ismael.nombre = "Ismael";
        Ismael.apellido = "Barea";
         */

        // En otros lenguajes se les llama namespaces a los paquetes

        // Con import instanciando persona
        Persona Victor = new Persona("Tass", "Notreal");
        Victor.setNombre("Victor");
        Victor.setApellido("De Unzúe");
        Victor.setColorPelo("COLORIDO");

        // Mismo package no necesita import o referencia
        Perro perro1 = new Perro();
        perro1.nombre = "Tobby";
        perro1.raza = "Bulldog";

        String jugando = perro1.jugar(Victor);

        System.out.println("Nombre: " + Victor.getNombre() + "\nApellido: "+ Victor.getApellido() + "\nMi color de pelo es: " + Victor.getColorPelo());
        System.out.println("Jugando: " + jugando);

        String saludo = saludar();

        System.out.println("Este es mi saludo: " + saludo);

        // Constantes static
        String generoMujer = Persona.GENERO_FEMENINO;
        String generoMasculino = GENERO_MASCULINO;
    }
}

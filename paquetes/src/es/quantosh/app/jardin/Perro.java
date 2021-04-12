package es.quantosh.app.jardin;
import es.quantosh.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarpelota();
    }
}

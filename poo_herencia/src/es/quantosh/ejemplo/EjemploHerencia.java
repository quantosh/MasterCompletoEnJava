package es.quantosh.ejemplo;

import es.quantosh.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Ismael");
        alumno.setApellido("Barea");
        alumno.setInstituto("Zaidin Vergeles");
        alumno.setNotaEntornos(5.6);
        alumno.setNotaProgramacion(7.2);

        AlumnoInternacional dave = new AlumnoInternacional();
        dave.setNombre("Dave");
        dave.setApellido("Stewart");
        dave.setNotaIdiomas(9.50);
        dave.setPais("Australia");
        dave.setInstituto("Zaidin Vergeles");
        dave.setNotaEntornos(6.2);
        dave.setNotaProgramacion(8.5);


        Profesor profesor = new Profesor();
        profesor.setAsignatura("Programación");
        profesor.setNombre("José Luis");
        profesor.setApellido("Berenguel");

        System.out.println("");
        System.out.println("Profesor "+profesor.getAsignatura() + " "
        + profesor.getNombre() + " " + profesor.getApellido());
    }
}

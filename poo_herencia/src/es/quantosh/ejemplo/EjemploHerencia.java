package es.quantosh.ejemplo;

import es.quantosh.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("=== Creando la instancia objeto de alumno ===");
        Alumno alumno = new Alumno();
        alumno.setNombre("Ismael");
        alumno.setApellido("Barea");
        alumno.setInstituto("Zaidin Vergeles");
        alumno.setNotaEntornos(5.6);
        alumno.setNotaProgramacion(7.2);

        System.out.println("=== Creando la instancia objeto de AlumnoInternacional ===");
        AlumnoInternacional dave = new AlumnoInternacional();
        dave.setNombre("Dave");
        dave.setApellido("Stewart");
        dave.setNotaIdiomas(9.50);
        dave.setPais("Australia");
        dave.setInstituto("Zaidin Vergeles");
        dave.setNotaEntornos(6.2);
        dave.setNotaProgramacion(8.5);

        System.out.println("=== Creando la instancia objeto de Profesor ===");
        Profesor profesor = new Profesor();
        profesor.setAsignatura("Programación");
        profesor.setNombre("José Luis");
        profesor.setApellido("Berenguel");

        System.out.println("");
        System.out.println("Profesor "+profesor.getAsignatura() + " "
                + profesor.getNombre() + " " + profesor.getApellido());

        System.out.println(dave.getNombre()
                + " " + dave.getApellido()
                + " " + dave.getInstituto()
                + " " + dave.getPais());

        Class clase = dave.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + "es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}

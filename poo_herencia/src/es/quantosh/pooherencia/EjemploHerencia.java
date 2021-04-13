package es.quantosh.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Ismael");
        alumno.setApellido("Barea");
        Profesor profesor = new Profesor();
        profesor.setAsignatura("Programación");
        profesor.setNombre("José Luis");
        profesor.setApellido("Berenguel");

        System.out.println("");
        System.out.println("Profesor "+profesor.getAsignatura() + " "
        + profesor.getNombre() + " " + profesor.getApellido());
    }
}

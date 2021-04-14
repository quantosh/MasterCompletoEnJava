package es.quantosh.ejemplo;

import es.quantosh.pooherencia.Alumno;
import es.quantosh.pooherencia.AlumnoInternacional;
import es.quantosh.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("=== Creando la instancia objeto de alumno ===");
        Alumno alumno = new Alumno("Ismael", "Barea", 30,"Zaidin Vergeles");
        alumno.setNotaEntornos(5.6);
        alumno.setNotaProgramacion(7.2);

        System.out.println("=== Creando la instancia objeto de AlumnoInternacional ===");
        AlumnoInternacional dave = new AlumnoInternacional("Dave", "Stewart", "Australia");
        dave.setInstituto("Zaidin Vergeles");
        dave.setNotaIdiomas(9.50);
        dave.setNotaEntornos(6.2);
        dave.setNotaProgramacion(8.5);

        System.out.println("=== Creando la instancia objeto de Profesor ===");
        Profesor profesor = new Profesor();
        profesor.setAsignatura("Programación");
        profesor.setNombre("José Luis");
        profesor.setApellido("Berenguel");
    }
}

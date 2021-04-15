package es.quantosh.ejemplo;

import es.quantosh.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("=== Creando la instancia objeto de alumno ===");
        Alumno alumno = new Alumno("Ismael", "Barea", 30,"Zaidin Vergeles");
        alumno.setNotaEntornos(5.6);
        alumno.setNotaProgramacion(7.2);
        alumno.setEmail("Ismael@zaidinvergeles.es");

        System.out.println("=== Creando la instancia objeto de AlumnoInternacional ===");
        AlumnoInternacional dave = new AlumnoInternacional("Dave", "Stewart", "Australia");
        dave.setInstituto("Zaidin Vergeles");
        dave.setNotaIdiomas(9.50);
        dave.setNotaEntornos(6.2);
        dave.setNotaProgramacion(8.5);
        dave.setEmail("dave.international@ieszaidinvergeles.es");

        System.out.println("=== Creando la instancia objeto de Profesor ===");
        Profesor profesor = new Profesor("José Luis", "Berenguel", "Programación");
        profesor.setEdad(43);
        profesor.setEmail("jlberenguel@ieszaidinvergeles.es");

        imprimir(alumno);
        imprimir(dave);
        imprimir(profesor);
    }

    /**
     * Filtrando según el tipo de objeto
     * @param persona
     */
    public static void imprimir(Persona persona) {
        System.out.println("\nImprimiendo los datos del tipo Persona");
        System.out.println(
                "Nombre: "+persona.getNombre()
                        +"\nApellido: "+ persona.getApellido()
                        +"\nEdad: "+ persona.getEdad()
                        +"\nEmail: "+ persona.getEmail());
        // Si es persona y alumno:
        if(persona instanceof Alumno) {
            System.out.println("\nImprimiendo los datos del tipo Alumno");
            System.out.println("Instituto: " + ((Alumno)persona).getInstituto());
            System.out.println("Nota Entornos de Desarrollo: " + ((Alumno)persona).getNotaEntornos());
            System.out.println("Nota Programación: " + ((Alumno)persona).getNotaProgramacion());

            // Si es alumno internacional:
            if(persona instanceof AlumnoInternacional){
                System.out.println("\nImprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional)persona).getPais());
            }
        }
        if(persona instanceof Profesor){
            System.out.println("Asignatura: "+ ((Profesor)persona).getAsignatura());
        }

    }
}


package es.quantosh.pooherencia;

// Profesor es la clase hija de Persona
public class Profesor extends Persona {
    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}

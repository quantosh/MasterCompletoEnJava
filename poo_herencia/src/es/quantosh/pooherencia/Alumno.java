package es.quantosh.pooherencia;

// Alumno es la clase hija de Persona
public class Alumno extends Persona{
    // Hereda los atributos de persona
    private String instituto;
    private double notaEntornos;
    private double notaProgramacion;

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaEntornos() {
        return notaEntornos;
    }

    public void setNotaEntornos(double notaEntornos) {
        this.notaEntornos = notaEntornos;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }
}

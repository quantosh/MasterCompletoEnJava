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

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String instituto){
        super(nombre, apellido, edad);
        this.instituto = instituto;
    }

    public Alumno(){
        super();
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido, int edad, String instituto, double notaEntornos, double notaProgramacion){
        this(nombre, apellido, edad, instituto);
        this.notaEntornos = notaEntornos;
        this.notaProgramacion = notaProgramacion;
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

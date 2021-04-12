package es.quantosh.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private String colorPelo;

    public static final String GENERO_MASCULINO = "Hombre";
    public static final String GENERO_FEMENINO = "Mujer";

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarpelota(){
        return "Lanza la pelota al perro";
    }
    // 161 Import estático
    public static String saludar(){
        return "Hola que tal";
    }
}


package Poo;

public enum TipoAutomovil {
    SEDAN("Sedan", 4 , "Auto normal"),
    STATION_WAGON("Station Wagon", 5 , "Auto mediano"),
    HATCHBACK("Hatchback", 5 , "Auto compacto"),
    PICKUP("Pickup", 4 , "Camioneta"),
    COUPE("Coupé", 2 , "Auto normal"),
    CONVERTIBLE("Convertible", 2 , "Auto deportivo"),
    FURGON("Furgón", 3 , "Auto utilitario");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }


}

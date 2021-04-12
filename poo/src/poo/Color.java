package poo;

public enum Color {
    // 145. Enumerador Poo.Color (enum)
    // Queda más organizado con un enum
    // toString es para dar una representación a cada constante

    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}

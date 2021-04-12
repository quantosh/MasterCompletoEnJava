package Poo;

// 155 implementando el método comparar con
public class Automovil implements Comparable<Automovil>{
    // Por estandar una clase viene ordenada de la siguiente manera
    // Atributos, constructor, getter & setters y luego los métodos
    private int id;
    private static int ultimoId;

    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceruedas;

    // 151

    // 146 Implementando enumerador con más atributos
    private TipoAutomovil tipo;

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    // 143. Atributos constantes final
    // Se nombran en MAYUSCULA_Y_SEPARADOS_POR_BARRA_BAJA
    // El orden del modificador final da igual, el public private protected son modificadores de acceso
    // Mientras que el static o el final son más de comportamiento de estructura

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;

    // 143. En caso de que fuera private solo se podría usar

    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    // 144. Atributos constantes con final 2º
    // Muy útil para evitar errores si tienes que realizar un cambio, solo deberías cambiar la constante y se cambiaría en toda la app
    // Para parametrizar con un conjunto de opciones
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    // 145 Enumerador Poo.Color (enum)

    // Modificadores éstaticos
    public static Color colorPatente = Color.NARANJO;

    // public Au
    public Automovil(){
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Constructor, prepara el objeto para poder ser usado
    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(); // No la entiendo 142
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    //
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters
    public String getFabricante(){
        return this.fabricante;
    }
    public String getModelo(){
        return this.modelo;
    }
    public Color getColor(){
        return this.color;
    }

    // Setters
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + " " + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.estanque.getCapacidad()*porcentajeBencina);
    }
    // sobrecarga de método, mismo nombre pero diferente tipo de dato
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.estanque.getCapacidad()*(porcentajeBencina/100f));
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // Click derecho -> 'Override Methods...' Ctrl + O
    @Override // Documentación
    public boolean equals(Object obj) {
        // Si ambos son iguales por referencia automáticamente retornamos true
        if(this == obj){
            return true;
        }
        // Si el obj es distinto de automovil return false
        if(!(obj instanceof Automovil)){
            return false;
        }
        // Cast aunque no me entero muy bien
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    // 140. Resolver problema toString - Click derecho -> Generate -> toString
    @Override // Sobreescribimos un método padre
    // Esto se utiliza para representar el objeto como texto
    public String toString() {
        System.out.println();
        String detalle =
                            "\nAuto con id= " + this.id +
                            "\nConductor= " + this.conductor +
                            "\nFabricante= " + this.getFabricante() +
                            "\nModelo= " + this.getModelo();
        if(this.getTipo() != null){
                detalle += "\nTipo= " + this.getTipo().getDescripcion();
        }
                detalle +=  "\nColor= " + color.getColor() +
                            "\nCapacidadEstanque= " + this.getEstanque().getCapacidad() +
                            "\nColorPatente= " + colorPatente.getColor();

                // Si es null
                if(this.motor != null){
                    detalle +=  "\nCilindrada=" + this.motor.getCilindrada();
                }
        return detalle;
    }

    // 151


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        // Asigna por defecto para evitar los nullpointer exception
        if(estanque == null){
            int capacidadPorDefecto = 40;
            this.estanque = new Estanque(capacidadPorDefecto);
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }


    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // 154
    public void addRueda(Rueda rueda){
        this.ruedas[indiceruedas++] = rueda;
    }

    // 141
    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    // 155 Implementando comparable
    public int compareTo(Automovil a) {
        return this.conductor.toString().compareTo(a.conductor.toString());
    }
}

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        // 139 Importamos fecha para comprar valores diferentes
        Date fecha = new Date();

        // Instancio objeto Automovil Subaru
        Automovil subaru = new Automovil("Subaru","Impreza" ,Color.BLANCO, 1.8, 60);

        // Instancio objeto Automovil Mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.2, 40);

        // Instancio objeto sin parametros gracias al constructor vacío
        Automovil ford = new Automovil();

        // Instancio objeto Automovil Nissan
        Automovil nissan = new Automovil("Nissan","Almera", Color.GRIS, 4.2, 65);

        // Comprobando que cada objeto es único aunque sea igual
        Automovil nissan2 = new Automovil("Nissan","Almera", Color.GRIS, 4.2, 65);

        // 139. Comprobando que cada objeto es único aunque sea igual
        Automovil fiat = new Automovil();

        // Calculo consumo con principios de encapsulamiento
        System.out.println("KM por litro " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("KM por litro " + mazda.calcularConsumo(300, 60));
        System.out.println("KM por litro " + nissan.calcularConsumo(300, 60));

        // Prueba de que es único
        System.out.println(nissan);
        System.out.println(nissan2);
        System.out.println("¿Son iguales con == " + (nissan == nissan2));
        System.out.println("¿Son iguales con Equals? " + (nissan.equals(nissan2)));

        // 139. Un método sin valor no puede comparar referencias
        System.out.println(fiat.equals(nissan));
        System.out.println("¿Son equals subaru y fecha u otro? " + subaru.equals(fecha));

        // 140. toString - Si llamas directamente al objeto imprimira el nombre de la clase @ con su "hashcode" ej: Automovil@2f4d3709
        System.out.println(subaru.toString());

    }
}

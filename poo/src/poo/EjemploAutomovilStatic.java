package poo;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        // Instancio objeto Poo.Automovil Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru","Impreza" ,Color.BLANCO, motorSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setEstanque(new Estanque());

        // Instancio objeto Poo.Automovil Mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        // Instancio objeto Poo.Automovil Nissan
        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS, new Motor(6.0, TipoMotor.BENCINA), new Estanque(66));
        nissan.setTipo(TipoAutomovil.PICKUP);

        /*
        // Instancio objeto Poo.Automovil vacío
        Poo.Automovil fiat = new Poo.Automovil();
         */

        // 141. Modificando atributo estatico
        // fiat.colorPatente = "rojo"; // Modifica el atributo static para todos los obj de la clase Poo.Automovil
        // Poo.Automovil.setColorPatente(Poo.Color.NARANJO); // Modifica el atributo solo para el vehiculo en concreto

        // 140. toString - Si llamas directamente al objeto imprimira el nombre de la clase @ con su "hashcode" ej: Poo.Automovil@2f4d3709
        System.out.println(subaru.toString());
        System.out.println(mazda.toString());
        System.out.println(nissan.toString());

        System.out.println(Automovil.getColorPatente());
        // 142. Atributos y métodos estáticos 2
        System.out.println("Kilometros por litros " + mazda.calcularConsumo(300, 60));

        System.out.println("La velocidad máxima en carretera es: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("La velocidad máxima en ciudad es: " + Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}

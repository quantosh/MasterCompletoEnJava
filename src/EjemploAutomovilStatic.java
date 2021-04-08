public class EjemploAutomovilStatic {
    public static void main(String[] args) {



        // Instancio objeto Automovil Subaru
        Automovil subaru = new Automovil("Subaru","Impreza" ,Color.BLANCO, 1.8, 60);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        // Instancio objeto Automovil Mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.2, 40);
        mazda.setTipo(TipoAutomovil.PICKUP);
        // Instancio objeto Automovil Nissan
        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS, 4.2, 65);
        nissan.setTipo(TipoAutomovil.PICKUP);

        /*
        // Instancio objeto Automovil vacío
        Automovil fiat = new Automovil();
         */

        // 141. Modificando atributo estatico
        // fiat.colorPatente = "rojo"; // Modifica el atributo static para todos los obj de la clase Automovil
        // Automovil.setColorPatente(Color.NARANJO); // Modifica el atributo solo para el vehiculo en concreto

        // 140. toString - Si llamas directamente al objeto imprimira el nombre de la clase @ con su "hashcode" ej: Automovil@2f4d3709
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

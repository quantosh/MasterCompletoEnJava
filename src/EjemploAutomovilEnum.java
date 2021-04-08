public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        // Instancio objeto Automovil Subaru
        Automovil subaru = new Automovil("Subaru","Impreza" ,Color.BLANCO, 1.8, 60);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        // Instancio objeto Automovil Mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.2, 40);
        mazda.setTipo(TipoAutomovil.PICKUP);

        // 147 Utilizando enum con sentencias switch case
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo Subaru: " + tipo.getNombre());
        System.out.println("Tipo desc. Subaru: " + tipo.getDescripcion());

        // La nueva versión de Switch no precisa de break pero necesita flechas -> despùes del caso
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte , de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, con aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil con doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil comun y corriente");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maletero grande");
        }

        // 148 Iterando enum con foreach
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.println(ta + " -> " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
        }
    }
}

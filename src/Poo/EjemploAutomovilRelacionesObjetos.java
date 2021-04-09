package Poo;

import java.util.Date;

public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Rueda[] ruedasSub = new Rueda[5];


        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Persona tass = new Persona("Tass", "Wass");
        Persona lalo = new Persona("Lalo", "ElKalo");
        // 139 Importamos fecha para comprar valores diferentes
        Date fecha = new Date();

        // Instancio objeto Poo.Automovil Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru","Impreza" ,Color.BLANCO, motorSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setEstanque(new Estanque(50));
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSub);

        // Instancio objeto Poo.Automovil Mazda

        Rueda[] ruedasMaz = new Rueda[5];

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL),new Estanque(45), tass, ruedasMaz);
        mazda.setEstanque(new Estanque(999));



        // Instancio objeto sin parametros gracias al constructor vacío
        Automovil ford = new Automovil();
        mazda.setConductor(conductorMazda);


        Rueda[] ruedasNissan = new Rueda[5];
        // Instancio objeto Poo.Automovil Nissan
        Automovil nissan = new Automovil("Nissan","Almera", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(97), lalo, ruedasNissan);

        // Comprobando que cada objeto es único aunque sea igual

        Automovil nissan2 = new Automovil("Nissan","Almera", Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(67), tass, ruedasNissan);

        // Añadiendo ruedas con el método add

        for(int i = 0; i < ruedasMaz.length; i++){
            mazda.addRueda(new Rueda("Yokohama", 15, 12.5));
        }

        for(int i = 0; i < ruedasSub.length; i++){
            subaru.addRueda(new Rueda("Michelin", 17, 10.5));
        }

        for(int i = 0; i < ruedasNissan.length; i++){
            nissan.addRueda(new Rueda("Pirelli", 20, 11.5));
        }

        System.out.println(mazda.toString());
        System.out.println("Conductor Mazda: " + mazda.getConductor());
        System.out.println(mazda.getRuedas().toString());
    }
}

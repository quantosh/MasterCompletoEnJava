package Poo;

import java.util.Arrays;
import java.util.Date;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {
        Rueda[] ruedasSub = new Rueda[5];


        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Persona tass = new Persona("Tass", "Wass");
        Persona weans = new Persona("Weans", "Yeans");
        Persona lalo = new Persona("Lalo", "ElKalo");
        Persona beans = new Persona("Beans", "ElCholo");
        // 139 Importamos fecha para comprar valores diferentes
        Date fecha = new Date();

        // Instancio objeto Poo.Automovil Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru","Impreza" ,Color.BLANCO, motorSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setEstanque(new Estanque(50));
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSub);
        subaru.setConductor(beans);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL),new Estanque(45));
        mazda.setConductor(weans);

        Automovil nissan = new Automovil("Nissan","Almera", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(97));
        nissan.setConductor(lalo);

        Automovil suzuki = new Automovil("Suzuki","Vitara", Color.GRIS, new Motor(1.7, TipoMotor.BENCINA), new Estanque(67));
        suzuki.setConductor(tass);
        suzuki.setTipo(TipoAutomovil.SUV);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Pepe", "Mujica"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);

        for (int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }
    }
}

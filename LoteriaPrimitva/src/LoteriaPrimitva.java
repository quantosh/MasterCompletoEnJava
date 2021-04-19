import java.util.Arrays;
import java.util.Scanner;

public class LoteriaPrimitva {
    public static void main(String[] args) {
        //int[] usuario = {1, 2, 3, 4, 5, 6};
        //int[] ganadora = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println("Aciertos: " + aciertos(ganadora, usuario));

        int [] usuario = leerCombinacionTeclado();
        int [] ganadora = combinacionAleatoria();

        mostrarCombinacion("Combinación del usuario: " + usuario);
        mostrarCombinacion("Combinación ganadora" + ganadora);

        System.out.println("Ha obtenido " + aciertos(ganadora,usuario)+ " aciertos");

    }

    //
    public static int[] combinacionAleatoria() {
        int [] ganadora = new int[7];
        for(int i = 0; i < 7; i++){
            double randomNumber = Math.random() * 49;
            randomNumber = randomNumber + 1;
            return ganadora[i] = (int)randomNumber;
        }

    }

    public static int[] leerCombinacionTeclado() {
        int[] usuario = new int[6];
        int numero;
        for (int i = 0; i < usuario.length; i++) {
            do {
                numero = leerNumero(1, 49);
            } while (buscarNumero(usuario, numero));

            usuario[i]=numero;
        }
        return usuario;
    }

    public static int aciertos(int[] ganadora, int[] usuario) {
        int aciertos = 0;
        for (int i = 0; i < ganadora.length - 1; i++) {
            if (buscarNumero(usuario, ganadora[i])) {
                aciertos++;
            }
        }
        if (aciertos == 6) {
            aciertos++;
        } else if (aciertos == 5) {
            if (buscarNumero(usuario, ganadora[ganadora.length])) {
                aciertos++;
            }
        }
        return aciertos;
    }

    public static void mostrarCombinacion(String mensaje, int[] c) {
        System.out.println(mensaje);
        for (int numero : c) {
            System.out.print(numero + ", ");
        }
        System.out.println("");
    }

    private static boolean buscarNumero(int[] combinacion, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < combinacion.length && !encontrado; i++) {
            if (combinacion[i] == numero) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    // Leer combinación
    private static int leerNumero(int min, int max) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca el número de su combinación (1 <= n <= 49): ");
        } while (!sc.hasNextInt()){
                sc.next();
                System.out.println("Debe introducir un número");
        }


    }
}

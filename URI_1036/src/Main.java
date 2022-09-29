import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = (B * B) - 4 * A * C;

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        }
        else if ( delta == 0) {
            double R0 = (-B / 2 * A);
        }
        else {
            double R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2.0 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }


        sc.close();


    }

}

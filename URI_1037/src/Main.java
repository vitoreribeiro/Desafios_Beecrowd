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

        double n = sc.nextDouble();

        if (n >= 0.0 && n <= 25.0){
            System.out.println("Intervalo [0,25]");
        }
        else if (n > 25.0 && n <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if (n > 50.0 && n <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else if (n > 75 && n <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();

    }

}

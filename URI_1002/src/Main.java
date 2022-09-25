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

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();

        double area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f%n", area);

        scan.close();

    }

}

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
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double media = 0;
        while(contador < 2){
            double x = sc.nextDouble();

            if (x < 0 || x > 10){
                System.out.println("nota invalida");
            }
            else {
                media += x;
                contador++;
            }
        }
        System.out.printf("media = %.2f%n", media/contador);

        sc.close();
    }
}

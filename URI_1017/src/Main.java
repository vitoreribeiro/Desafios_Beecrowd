import java.util.Locale;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 12km/L

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        int distancia = tempo * velocidade;

        double litros = distancia / 12.0;


        System.out.printf("%.3f%n", litros);


        sc.close();

    }

}

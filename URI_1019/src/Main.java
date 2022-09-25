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

        int N = sc.nextInt();
        int M = N;

        int horas = M / 3600;
        M = M - horas * 3600;
        int minutos = M / 60;
        M = M - minutos * 60;
        int segundos = M;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();

    }

}

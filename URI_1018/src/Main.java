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

        int notas100 = M / 100;
        M = M - notas100 * 100;
        int notas50 = M / 50;
        M = M - notas50 * 50;
        int notas20 = M / 20;
        M = M - notas20 * 20;
        int notas10 = M / 10;
        M = M - notas10 * 10;
        int notas5 = M / 5;
        M = M - notas5 * 5;
        int notas2 = M / 2;
        M = M - notas2 * 2;
        int notas1 = M;

        System.out.println(N);
        System.out.println(notas100 +" nota(s) de R$ 100,00");
        System.out.println(notas50 +" nota(s) de R$ 50,00");
        System.out.println(notas20 +" nota(s) de R$ 20,00");
        System.out.println(notas10 +" nota(s) de R$ 10,00");
        System.out.println(notas5 +" nota(s) de R$ 5,00");
        System.out.println(notas2 +" nota(s) de R$ 2,00");
        System.out.println(notas1 +" nota(s) de R$ 1,00");


        sc.close();

    }

}

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

        /*
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double M = N;

        int notas100 = (int) M / 100;
        M = M - notas100 * 100;
        int notas50 = (int) M / 50;
        M = M - notas50 * 50;
        int notas20 = (int) M / 20;
        M = M - notas20 * 20;
        int notas10 = (int) M / 10;
        M = M - notas10 * 10;
        int notas5 = (int) M / 5;
        M = M - notas5 * 5;
        int notas2 = (int) M / 2;
        M = M - notas2 * 2;
        int moedas1 = (int) M;
        M = (M - moedas1) * 100;
        int moedas50 = (int) M / 50;
        M = M - moedas50 * 50;
        int moedas25 = (int) M / 25;
        M = M - moedas25 * 25;
        int moedas10 = (int) M / 10;
        M = M - moedas10 * 10;
        int moedas05 = (int) M / 5;
        M = M - moedas05 * 5;
        int moedas01 = (int) M;


        System.out.println("NOTAS:");
        System.out.println(notas100 +" nota(s) de R$ 100.00");
        System.out.println(notas50 +" nota(s) de R$ 50.00");
        System.out.println(notas20 +" nota(s) de R$ 20.00");
        System.out.println(notas10 +" nota(s) de R$ 10.00");
        System.out.println(notas5 +" nota(s) de R$ 5.00");
        System.out.println(notas2 +" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

    }

}

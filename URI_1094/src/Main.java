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

        double quantidade;
        char tipo;
        double n = sc.nextInt();
        int total = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        double i = 0;

        while (i < n) {
            quantidade = sc.nextInt();
            tipo = sc.next().charAt(0);
            total += quantidade;

            switch (tipo) {
                case 'C':
                    totalCoelhos += quantidade;
                    break;
                case 'R':
                    totalRatos += quantidade;
                    break;
                case 'S':
                    totalSapos += quantidade;
                    break;
            }
            i++;

        }

        double percentCoelhos = (double) totalCoelhos / (double) total * 100;
        double percentRatos = (double) totalRatos / (double) total * 100;
        double percentSapos = (double) totalSapos / (double) total * 100;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);

        System.out.printf("Percentual de coelhos: %.2f ", percentCoelhos);
        System.out.println("%");
        System.out.printf("Percentual de ratos: %.2f ", percentRatos);
        System.out.println("%");
        System.out.printf("Percentual de sapos: %.2f ", percentSapos);
        System.out.println("%");
    }
}



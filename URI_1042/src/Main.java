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

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        if (N1 < N2  && N1 < N3) {
            System.out.println(N1);
            if (N2 < N3) {
                System.out.println(N2);
                System.out.println(N3);
            } else {
                System.out.println(N3);
                System.out.println(N2);
            }
        }
        else if (N2 < N3) {
            System.out.println(N2);
            if (N1 < N3) {
                System.out.println(N1);
                System.out.println(N3);
            } else {
                System.out.println(N3);
                System.out.println(N1);
            }
        }
        else{
            System.out.println(N3);
            if (N1 < N2) {
                System.out.println(N1);
                System.out.println(N2);
            } else {
                System.out.println(N2);
                System.out.println(N1);
            }
        }

        System.out.println("");
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);
    }

}

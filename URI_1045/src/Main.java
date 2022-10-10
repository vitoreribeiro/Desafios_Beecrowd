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

        double aux;

        if (B > A && B > C) {
            aux = A;
            A = B;
            B = aux;
        } else if (C > A) {
            aux = A;
            A = C;
            C = aux;
        }

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == (B * B) + (C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < (B * B) + (C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && B != C) || (A == C && C != B) || (B == C && A != B)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();

    }

}

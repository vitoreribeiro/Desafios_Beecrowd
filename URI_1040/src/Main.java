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

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media =  Math.floor((N1 * 2.0) + (N2 * 3.0) + (N3 * 4.0) + N4)/ 10.0;

        System.out.printf("Media: %.1f%n",  media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }

        else if (media < 7.0 && media >= 5.0) {
            System.out.println("Aluno em exame.");
            double NExame = sc.nextDouble();
            System.out.println("Nota do exame: " + NExame);
            double mediaNova = (media + NExame) / 2.0;
            if (mediaNova >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaNova);
        }
        else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}

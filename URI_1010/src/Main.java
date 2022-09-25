import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int code1 = scan.nextInt();
        int number1 = scan.nextInt();
        double value1 = scan.nextDouble();

        int code2 = scan.nextInt();
        int number2 = scan.nextInt();
        double value2 = scan.nextDouble();

        double total = number1 * value1 + number2 * value2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


        scan.close();


    }

}

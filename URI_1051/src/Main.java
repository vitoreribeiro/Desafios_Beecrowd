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

        double salario = sc.nextDouble();
        double imposto = 0;

        if(salario > 0 && salario <= 2000.0){
            imposto = 0;
        }
        else if (salario > 2000.0 && salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario > 3000 && salario <= 4500.0){
            imposto = (1000.0 * 0.08) + ((salario - 3000) * 0.18);
        }
        else if (salario > 4500){
            imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salario - 4500)*0.28);
        }

        if (imposto == 0){
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();

    }

}

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

        double salary = sc.nextDouble();
        int percent = 0;
        double add = 0;
        double newSalary = 0;

        if(salary > 0.0 && salary <=400.0){
            newSalary = salary * 1.15;
            percent = 15;
        }
        else if(salary > 400.0 && salary <= 800.0){
            newSalary = salary * 1.12;
            percent = 12;
        }
        else if(salary > 800.0 && salary <= 1200.0){
            newSalary = salary * 1.10;
            percent = 10;
        }
        else if(salary > 1200.0 && salary <= 2000.0){
            newSalary = salary * 1.07;
            percent = 7;
        }
        else if(salary > 2000){
            newSalary = salary * 1.04;
            percent = 4;
        }

        add = newSalary - salary;

        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", add);
        System.out.println("Em percentual: " + percent + " %");

        sc.close();

    }

}
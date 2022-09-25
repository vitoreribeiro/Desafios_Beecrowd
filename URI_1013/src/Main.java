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

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a>b && a>c){
            System.out.println(a + " eh o maior");
        }else if (b>c) {
            System.out.println(b + " eh o maior");
        }else {
            System.out.println(c + " eh o maior");
        }

        scan.close();
    }
}

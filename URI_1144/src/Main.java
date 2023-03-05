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

        Scanner sc =  new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = 1, b = 1, c = 1;

        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            System.out.print(a * a + " ");
            System.out.print(b * a);
            System.out.println();

            System.out.print(a + " ");
            System.out.print(b+1 + " ");
            System.out.print(c+1);
            System.out.println();

            a+=1;
            b = a * a;
            c = b * a;
        }
        
        sc.close();

    }

}

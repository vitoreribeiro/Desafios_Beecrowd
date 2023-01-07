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

        int n = sc.nextInt();
        double x, y;

        for(int i = 1; i <= n; i++){
            x = sc.nextInt();
            y = sc.nextInt();

            if(y == 0){
                System.out.println("divisao impossivel");
            } else{
                System.out.printf("%.1f%n", (x/y));
            }
        }
        sc.close();
    }
}

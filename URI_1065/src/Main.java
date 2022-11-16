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

        Scanner sc = new Scanner(System.in);

        int cont = 0;

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            if(num % 2 == 0){
                cont++;
            }
        }

        System.out.println(cont + " valores pares");

        sc.close();

    }

}

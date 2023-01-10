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

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;

        if(y < x){
            int aux = x;
            x = y;
            y = aux;
        }

        for(int i = x; i <= y; i++){
            if(i % 13 != 0){
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();

    }

}

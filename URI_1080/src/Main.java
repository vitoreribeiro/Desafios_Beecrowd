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

        int maior = 0;
        int posicao = 0;
        int n;

        for(int i = 1; i <= 100; i++){
            n = sc.nextInt();

            if(n > maior){
                maior = n;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);
    }

}

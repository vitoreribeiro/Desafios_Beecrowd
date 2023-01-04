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

        int n = sc.nextInt();
        int maior;
        int menor;
        int soma = 0;

        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x >= y){
                maior = x;
                menor = y;
            } else {
                maior = y;
                menor = x;
            }

            for(int j = menor + 1; j < maior; j++){
                if(j % 2 != 0){
                    soma +=j;
                }
            }

            System.out.println(soma);
            soma = 0;
        }

    }

}

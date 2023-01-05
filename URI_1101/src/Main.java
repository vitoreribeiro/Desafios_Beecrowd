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

        int m, n, maior, menor;

        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        while (m > 0 &&  n > 0){
            int soma = 0;
            if(m > n){
                maior = m;
                menor = n;
            } else{
                maior = n;
                menor = m;
            }

            for(int i = menor; i <= maior; i++){
                soma += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + soma);

            m = sc.nextInt();
            n = sc.nextInt();

        }

    }

}

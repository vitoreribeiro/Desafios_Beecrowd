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

        int validador = 0;
        int senhaValida = 2002;
        int senhaDigitada = sc.nextInt();

        while(validador == 0){
            if(senhaValida != senhaDigitada){
                System.out.println("Senha Invalida");
                senhaDigitada = sc.nextInt();
            } else {
                System.out.println("Acesso Permitido");
                validador = 1;
            }
        }
        sc.close();
    }
}

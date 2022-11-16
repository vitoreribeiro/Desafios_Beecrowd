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

        int contPar = 0;
        int contImpar = 0;
        int contPositivo = 0;
        int contNegativo = 0;

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();

            if(num % 2 == 0){
                contPar++;
            } else {
                contImpar++;
            }

            if(num > 0){
                contPositivo++;
            }
            else if (num < 0){
                contNegativo++;
            }
        }

        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");

    }

}

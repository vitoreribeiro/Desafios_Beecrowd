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
        int resposta = 0;
        int alcool = 0, gasolina = 0, diesel = 0;

        while(resposta != 4){
            resposta = sc.nextInt();

            int verifica = 0;
            while(verifica == 0){
                if(resposta < 1 || resposta > 4){
                    resposta = sc.nextInt();
                } else{
                    verifica = 1;
                }
            }

            switch (resposta){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
            }
        }

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

}

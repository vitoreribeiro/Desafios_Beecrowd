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

        int ddd = sc.nextInt();
        String cidade = "";


        switch (ddd){
            case 61:
                cidade = "Brasilia";
               break;
            case 71:
                cidade = "Salvador";
                break;
            case 11:
                cidade = "Sao Paulo";
                break;
            case 21:
                cidade = "Rio de Janeiro";
                break;
            case 32:
                cidade = "Juiz de Fora";
                break;
            case 19:
                cidade = "Campinas";
                break;
            case 27:
                cidade = "Vitoria";
                break;
            case 31:
                cidade = "Belo Horizonte";
                break;
            default:
                cidade = "DDD nao cadastrado";
            }

        System.out.println(cidade);
        sc.close();
        }
    }

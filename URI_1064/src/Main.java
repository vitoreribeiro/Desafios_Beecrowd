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

        Double[] mat = new Double[6];

        for(int i = 0; i < mat.length; i++){
                mat[i] = sc.nextDouble();
        }
        int cont = 0;
        double soma = 0;
        for(Double num : mat){
            if(num > 0){
                cont++;
                soma += num;
            }
        }
        double media = soma / cont;

        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();

    }
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = 1;
        while (codigo == 1) {
            int contador = 0;
            double media = 0;
            while (contador < 2) {
                double x = sc.nextDouble();

                if (x < 0 || x > 10) {
                    System.out.println("nota invalida");
                } else {
                    media += x;
                    contador++;
                }
            }
            System.out.printf("media = %.2f%n", media / contador);

            System.out.println("novo calculo (1-sim 2-nao)");
            codigo = sc.nextInt();

            while(codigo < 1 || codigo > 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                codigo = sc.nextInt();
            }
        }
        sc.close();
    }
}





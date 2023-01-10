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

        int resposta = 1;
        int golInter, golGremio;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        int jogos= 0;

        while(resposta == 1){
            golInter = sc.nextInt();
            golGremio = sc.nextInt();

            if(golInter > golGremio){
                vitoriasInter++;
            } else if(golGremio > golInter){
                vitoriasGremio++;
            } else {
                empates++;
            }
            jogos++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            resposta = sc.nextInt();
        }

        System.out.println(jogos + " grenais");
        System.out.println("Inter:"+ vitoriasInter);
        System.out.println("Gremio:"+vitoriasGremio);
        System.out.println("Empates:"+ empates);
        if (vitoriasInter>vitoriasGremio){
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();

    }

}

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

        int segundoTotal = 0, minutoTotal = 0, horaTotal = 0, diaTotal = 0;

        String[] diaInicio = sc.nextLine().split(" ");
        String[] horaInicio = sc.nextLine().replaceAll(" ", "").split(":");

        int diaInicial = Integer.parseInt(diaInicio[1]);
        int horaInicial = Integer.parseInt(horaInicio[0]);
        int minutoInicial = Integer.parseInt(horaInicio[1]);
        int segundoInicial = Integer.parseInt(horaInicio[2]);

        String[] diaFim = sc.nextLine().split(" ");
        String[] horaFim = sc.nextLine().replaceAll(" ", "").split(":");

        int diaFinal = Integer.parseInt(diaFim[1]);
        int horaFinal = Integer.parseInt(horaFim[0]);
        int minutoFinal = Integer.parseInt(horaFim[1]);
        int segundoFinal = Integer.parseInt(horaFim[2]);

        int aux1 = segundoInicial + minutoInicial*60 + horaInicial*60*60 + diaInicial*60*60*24;
        int aux2 = segundoFinal + minutoFinal*60 + horaFinal*60*60 + diaFinal*60*60*24;
        int diferenca = aux2 - aux1;

        System.out.println(diferenca/(60*60*24) + " dia(s)");
        diferenca = diferenca % (60*60*24);
        System.out.println(diferenca/(60*60) + " hora(s)");
        diferenca = diferenca % (60*60);
        System.out.println(diferenca/(60) + " minuto(s)");
        diferenca = diferenca % (60);
        System.out.println(diferenca + " segundo(s)");

    }
}

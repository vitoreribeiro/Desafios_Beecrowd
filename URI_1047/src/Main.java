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

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        int totalHoras = 0;
        int totalMinutos = 0;

        if(horaFinal > horaInicial && minutoFinal > minutoInicial){
            totalHoras = horaFinal - horaInicial;
            totalMinutos = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if (horaFinal > horaInicial && minutoFinal < minutoInicial){
            totalHoras = horaFinal - horaInicial - 1;
            totalMinutos = minutoFinal - minutoInicial + 60;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if (horaFinal < horaInicial && minutoFinal < minutoInicial) {
            totalHoras = horaFinal - horaInicial + 23;
            totalMinutos = minutoFinal - minutoInicial + 60;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if(horaFinal < horaInicial && minutoFinal > minutoInicial){
            totalHoras = horaFinal - horaInicial + 24;
            totalMinutos = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if (horaFinal == horaInicial && minutoFinal > minutoInicial){
            totalHoras = 0;
            totalMinutos = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if (horaFinal == horaInicial && minutoFinal < minutoInicial) {
            totalHoras = 23;
            totalMinutos = minutoFinal - minutoInicial + 60;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if (horaFinal > horaInicial && minutoFinal == minutoInicial){
            totalHoras = horaFinal - horaInicial;
            totalMinutos = 0;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if(horaFinal < horaInicial && minutoFinal == minutoInicial){
            totalHoras = horaFinal - horaInicial + 24;
            totalMinutos = 0;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        }
        else if(horaFinal == horaInicial && minutoFinal == minutoInicial){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        sc.close();
    }

}


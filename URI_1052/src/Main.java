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


        int n = sc.nextInt();
        String mes = "December";

        switch (n) {
            case 1:
                mes = "January";
                break;
            case 2:
                mes = "February";
                break;
            case 3:
                mes = "March";
                break;
            case 4:
                mes = "April";
                break;
            case 5:
                mes = "May";
                break;
            case 6:
                mes = "June";
                break;
            case 7:
                mes = "July";
                break;
            case 8:
                mes = "August";
                break;
            case 9:
                mes = "September";
                break;
            case 10:
                mes = "October";
                break;
            case 11:
                mes = "November";
                break;
            case 12:
                mes = "December";
                break;
            default:
                mes = "Invalid.";
        }
        System.out.println(mes);
    }
}


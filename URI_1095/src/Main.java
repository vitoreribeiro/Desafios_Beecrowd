import java.io.IOException;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int i = 1;
        for (int j = 60; j >= 0; j -= 5){
            System.out.println("I=" + i + " J=" + j);
            i += 3;
        }
    }
}
import java.io.IOException;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int j = 7;
        for(int i = 1; i <= 9; i += 2){
            int contador = 1;
            while(contador <= 3){
                System.out.println("I=" + i + " J=" + j);
                j--;
                contador++;
            }
            j +=5;
        }
    }
}

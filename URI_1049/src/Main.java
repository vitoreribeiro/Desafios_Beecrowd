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

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = "";

        if (a.equals("vertebrado")){
            if (b.equals("ave")){
                if (c.equals("carnivoro")){
                    d = "aguia";
                }
                else {
                    d = "pomba";
                }
            }
            else if (b.equals("mamifero")){
                if (c.equals("onivoro")){
                    d = "homem";
                }
                else {
                    d = "vaca";
                }
            }
        }
        else if (a.equals("invertebrado")){
            if (b.equals("inseto")){
                if (c.equals("hematofago")){
                    d = "pulga";
                }
                else {
                    d = "lagarta";
                }
            }
            else if (b.equals("anelideo")){
                if (c.equals("hematofago")){
                    d = "sanguessuga";
                }
                else {
                    d = "minhoca";
                }
            }
        }


        System.out.println(d);


        sc.close();

    }

}

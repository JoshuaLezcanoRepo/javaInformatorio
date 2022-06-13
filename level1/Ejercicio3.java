import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un solo número entero: ");
        int nota = scan.nextInt();
        scan.close();
        String sal = "";
        nota = nota + 1;

        for (int i = 1; i < nota; i++) {
            sal = sal + " "+ i;
            System.out.println(sal);
        }
    }
}
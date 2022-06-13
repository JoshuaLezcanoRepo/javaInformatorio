import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        double factorial = 1;
        System.out.print("Ingrese un número: ");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();
    
        for (int i=nota;i>0;i--) {
            factorial=factorial*i;
        }

        System.out.print("El factorial de " + nota + " es: " + factorial);

        }
}
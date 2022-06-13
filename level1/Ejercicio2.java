import java.io.IOException;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scan.nextInt();

        System.out.println("- Suma de " + a + " + " + b + ": " + (a + b));
        System.out.println("- Resta de " + a + " - " + b + ": " + (a - b));
        System.out.println("- Multiplicación de " + a + " x " + b + ": " + (a * b));
        System.out.println("- División de " + a + " / " + b + ": " + (a / b));
        System.out.println("- Módulo de " + a + " % " + b + ": " + (a % b));
        scan.close();
    }
}
import java.io.IOException;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scan.nextInt();
        scan.close();
        int producto = 0;

        for (int i=1; i<=b; i++) {
            producto = producto + a;
        }

        System.out.println("Valor del producto: " + producto);
    }
}
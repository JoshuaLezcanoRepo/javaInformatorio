import java.io.IOException;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el número base: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el valor del exponente: ");
        int b = scan.nextInt();
        scan.close();
        int resultadof = 1;

        for (int i=b; i!=0; i--) {
            resultadof = resultadof * a;
        }
        
        System.out.println("- Resultado de " + a + " elevado a " + b + " : " + resultadof);
    }
}
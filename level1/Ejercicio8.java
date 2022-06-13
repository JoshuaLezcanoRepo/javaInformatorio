import java.io.IOException;
import java.util.*;

public class Ejercicio8 {
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su Nombre y Apellido: ");
        String nomape = scan.nextLine();
        System.out.print("Ingrese su Edad: ");
        String edad = scan.nextLine();
        System.out.print("Ingrese su Dirección: ");
        String dire = scan.nextLine();
        System.out.print("Ingrese su Ciudad: ");
        String ciu = scan.nextLine(); 
        scan.close();

        System.out.printf(ciu + " - " + dire + " - " + edad + " - " + nomape);
    }
}
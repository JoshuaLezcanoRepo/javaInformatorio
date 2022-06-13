import java.io.IOException;
import java.util.*;

public class Ejercicio1 {
    
    public static void main(String[] args) throws IOException{
        //Creamos un objeto Scanner que tomará los valores de entrada por Consola.
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un nombre de Usuario: ");
        String usuario = scan.next();

        System.out.println("HOLA " + usuario + "!!!");
        scan.close();
    }
}
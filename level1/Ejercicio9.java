import java.io.IOException;
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        char letra;
        int cantdveces = 0; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una frase, texto, etc: ");
        String texto = scan.nextLine();
        System.out.print("Ingrese la letra a calcular: ");
        letra = (char) System.in.read();
        scan.close();
        cantdveces = contarCara(texto, letra);
        System.out.println("- El carácter " + letra + " aparece " + cantdveces + " veces.");

    }

    public static int contarCara(String texto, char letra) {
        int posicion, contador = 0;
        posicion = texto.indexOf(letra);
        while (posicion != -1) { 
            contador++;
            posicion = texto.indexOf(letra, posicion + 1);
        }
        return contador;
    }
}
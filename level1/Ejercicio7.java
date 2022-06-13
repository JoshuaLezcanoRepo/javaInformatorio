import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {

    public static void main(String[] args) throws Exception{
        System.out.print("- Escriba su texto a convertir: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        String texto = reader.readLine();
        texto = toUppercase(texto);
        String output = String.format("Su texto en Mayúscula es: %s", texto);
        System.out.println(output);
    }

    public static String toUppercase(String texto) throws IOException{
        char[] c = texto.toCharArray();
        String output = "";
        for (char i : c){
            if ('a'<=i && i<='z'){
                output = output + ((char) ((int) i - 32));
            } else {
                output = output + i;
            }
        }
        return output;
    }
}
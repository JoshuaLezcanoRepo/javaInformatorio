import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Ejercicio1 {
    
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese sus ciudades, separadas por coma: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nciud = reader.readLine();
        String fsplit [] = nciud.split(",");

        ArrayList<String> ciudades = new ArrayList<String>();
        for (String x : fsplit) {
            ciudades.add(x);
        }

        String output = "";
        for (int i = 0; i<ciudades.size(); i++) {
            output = String.format("#%s - %s", (i+1), ciudades.get(i));
            System.out.println(output);
        }
    }
}
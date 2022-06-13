import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese sus horas de trabajo, separadas por coma: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String horastrabajadas = reader.readLine();
        String fsplit [] = horastrabajadas.split(", ");

        ArrayList<Integer> horasplit = new ArrayList<Integer>();
        for (String x : fsplit) {
            horasplit.add(Integer.valueOf(x));
        }

        System.out.print("Ingrese el valor de horas de trabajo, separadas por coma: ");
        String valorhoras = reader.readLine();
        String fvhsplit [] = valorhoras.split(", ");

        ArrayList<Integer> vhsplit = new ArrayList<Integer>();
        for (String x : fvhsplit) {
            vhsplit.add(Integer.valueOf(x));
        }

        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i=0; i<horasplit.size(); i++) {
            output.add((horasplit.get(i) * vhsplit.get(i)));
        }
        
        System.out.println(horasplit);
        System.out.println(vhsplit);
        System.out.println(output);
    }
}
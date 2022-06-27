import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("");
        palabras.add("Informatorio");
        palabras.add(null);

        List<String> result = palabras.stream()
                .filter(x -> x != null)
                .filter(x -> x != "")
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
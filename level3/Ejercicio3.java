import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        List<String> result = palabras.stream()
                .filter(e -> Character.toUpperCase(e.charAt(0)) == 'B')
                .collect(Collectors.toList());
        System.out.println(result.size());
    }
}
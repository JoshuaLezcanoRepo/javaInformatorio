import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> resultadof = new ArrayList<>();
        numeros.stream().forEach(n -> resultadof.add(n * n));
        System.out.println(resultadof);
    }
}
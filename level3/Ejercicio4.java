import java.util.List;
import java.util.ArrayList;
import java.util.stream.LongStream;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);

        List<Long> resultadof = new ArrayList<>();
        palabras.stream().distinct()
                .forEach(n -> resultadof.add(LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b)));
        System.out.println(resultadof);
    }
}
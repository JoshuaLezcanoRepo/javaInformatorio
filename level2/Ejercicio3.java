import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList<Integer>();
        for (int i= 0; i<53; i++) {
            baraja.add(i);
        }

        System.out.println("- Baraja Original: " + baraja);
        Collections.reverse(baraja);
        System.out.println("- Baraja Reversa: " + baraja);
        Collections.shuffle(baraja);
        System.out.println("- Baraja Mezclada: " + baraja);
    }
}
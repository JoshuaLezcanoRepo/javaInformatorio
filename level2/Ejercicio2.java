import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> listanros = new ArrayList<Integer>();
        for (int i= 0; i<6; i++) {
            listanros.add(i);
        }
        System.out.println(listanros);

        listanros.add(0, 1);
        System.out.println(listanros);
        listanros.add(7, 6);
        System.out.println(listanros);
    }
}
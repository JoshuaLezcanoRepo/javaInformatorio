import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

class Emple {
    public String nombreyapellido;
    public int dni;
    public int horastrabajadas;
    public int valorhoras;

    public Emple(int dni, String nombreyapellido, int horastrabajadas, int valorhoras) {
        this.nombreyapellido = nombreyapellido;
        this.dni = dni;
        this.horastrabajadas = horastrabajadas;
        this.valorhoras = valorhoras;
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Emple> empleadosh = new HashSet<Emple>();
        Map<Integer, Integer> paga = new HashMap<Integer, Integer>();
        empleadosh.add(new Emple(12345678, "Carlos", 8, 300));
        empleadosh.add(new Emple(44651798, "Josh", 12, 600));
        empleadosh.add(new Emple(44652799, "Kevin", 16, 1200));
        for (Emple i : empleadosh) {
            paga.put(i.dni, (i.horastrabajadas*i.valorhoras));
        }
        System.out.println("El suedo para el Empleado Josh, D.N.I '44651798' es: " + "$" + paga.get(44651798));
    }
}
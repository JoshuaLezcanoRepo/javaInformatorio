import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.parse("2022-06-26");
        List<Estudiantes> listEstudiantes = List.of(
                new Estudiantes("Borghi", "Santiago", LocalDate.parse("2003-05-16")),
                new Estudiantes("Simpson", "Homero", LocalDate.parse("1980-08-16")),
                new Estudiantes("David", "Joshua", LocalDate.parse("2003-02-05")),
                new Estudiantes("Joel", "Kevin", LocalDate.parse("2009-07-12")),
                new Estudiantes("Dybala", "Paulo", LocalDate.parse("1999-10-15")));

        Map<String, Integer> resultadof = listEstudiantes.stream()
                .collect(Collectors.toMap(elemento -> elemento.getNombreyApellido(),
                        elemento -> Period.between(elemento.getFecha(), fecha).getYears(),
                        (existing, replacement) -> existing));
        System.out.println(resultadof);
    }
}

class Estudiantes {
    public String apellido;
    public String nombre;
    public LocalDate fechaDN;

    public Estudiantes(String apellido, String nombre, LocalDate fechaDN) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDN = fechaDN;
    }

    public LocalDate getFecha() {
        return this.fechaDN;
    }

    public String getNombreyApellido() {
        return (this.apellido + " " + this.nombre);
    }

    public String toString() {
        return String.valueOf(this.fechaDN) + this.apellido + this.nombre;
    }
}
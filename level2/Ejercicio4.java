import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
            ArrayList<String> nestudiantes = new ArrayList<String>();
            nestudiantes.add("Laura");
            nestudiantes.add("Pablo");
            nestudiantes.add("Jorge");
            nestudiantes.add("Martín");
            nestudiantes.add("Javier");
            nestudiantes.add("Alan");
            nestudiantes.add("Francisco");
            nestudiantes.add("José");
            nestudiantes.add("Luís");
            nestudiantes.add("Kevin");
            nestudiantes.add("Raúl");
            nestudiantes.add("Santiago");

            ArrayList<String> curso1 = new ArrayList<String>(nestudiantes.subList(0, 4));
            ArrayList<String> curso2 = new ArrayList<String>(nestudiantes.subList(4, 8));
            ArrayList<String> curso3 = new ArrayList<String>(nestudiantes.subList(8, 12));
            System.out.println("Curso 1: " + curso1);
            System.out.println("Curso 2: " + curso2);
            System.out.println("Curso 3: " + curso3);
        }
    }
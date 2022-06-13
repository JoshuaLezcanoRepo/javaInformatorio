public class Ejercicio7 {
    public static void main(String[] args) {
        String[] fb = FuncionFB(1, 8);
        System.out.print("[");  
        for (String string : fb) {
            System.out.print(" "+string);            
        }
        System.out.print(" ]"); 
        System.out.println();
    }

    public static String[] FuncionFB(int a, int b){
        String output = "";
        String input = "";

        for (int i=a; i<b-1;i++){
            input = String.valueOf(i);
            if (i % 2 == 0) input = "Fizz"; 
            if (i % 3 == 0) input = "Buzz";
            if (i % 2 == 0 && i % 3 == 0) input = "FizzBuzz"; 
            output = output +" "+ input;
        }

        output = output + " " + String.valueOf(b-1);
        System.out.println(output);
        return output.split(" ");
    }
}
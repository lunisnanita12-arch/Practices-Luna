import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hola usuario dijita tu nombre");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("hola " + nombre);

    }
}

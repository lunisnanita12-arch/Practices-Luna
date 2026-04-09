import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

         int opcion = 0;
        do {
            mostrarMenu();
            switch (opcion) {
                case 1 -> {
                    registroEstudiante();
                }
                case 2->  {
                    mostrarDatos();
                }
                case 3 -> {

                }  
            
                default -> {
                    System.out.println("Opcion invalida");
                }
            }
        }while(opcion != 4);
        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("""
               \n --- Sistema de Registro de Estudiantes ---

                    1. Registrar datos de un estudiante
                    2. Mostrar datos del estudiante actual
                    3. Calcular promedio de notas del estudiante actual
                    0. Salir
                    Ingrese su opción:

                """);
    }

    public static void registroEstudiante() {
        System.out.println(" Digite el nombre del Usuario");
        String nombre = sc.nextLine();
        System.out.println("Registro De Estudiante Exitoso");
    }
    public static void mostrarDatos() {
        
    }

    public static void calcularNotas() {

      
    }
    public static void validarNota(double nota) {
        
    }
    public static void validarNombre(String nombre) {
        
    }
}

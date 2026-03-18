import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       login();
    }
// variables de Usuario 
    public static int codigoEmpleado = 4567;
    public static int turnoPermitido;
    public static int materiaPrima = 500;
    public static double materiaPrimaxPieza = 25;
    public static int producionMaximaxTurnos = 20; // 20 piezas
    public static Scanner entradas = new Scanner(System.in);

public static void login() {

    boolean login = false; 

  do{  
        System.out.println("Ingrese su codigo de empleado: ");
        int codigoIngresado = entradas.nextInt();
            if (codigoIngresado != codigoEmpleado){
                System.out.println("El Codigo Ingresado es Erroneo");
            }else {
                
                    System.out.println("Ingrese el numero de turno que ingresa (1,2 o 3)");
                    int turnopermitido = entradas.nextInt();
                    switch (turnopermitido){
                        case 1,2,3 ->{
                            System.out.println("Has ingresado Exitosamente");
                            login = true;
                            menu();
                        }
                        default ->{
                            System.out.println(" El turno es Invalido intente nuevamente");
                        } 
                    }}
        }while (login != true);
        entradas.close();
}

public static void menu() {
    int opcion = entradas.nextInt();

    do{

    System.out.println("""

        1. Producir piezas
        2. Ver stock de materia prima
        3. Reportar daño de máquina
        4. Cerrar turno
        
        """);   

        switch (opcion){
                //producur pieza
            case 1 ->{
                //Producir piezas
            }
            //Ver stock de materia prima
            case 2->{
                //Ver stock de materia prima
            }
            //  Reportar daño de máquina
            case 3->{
                // Reportar daño de máquina
            }
            //Cerrar turno
            case 4->{
                //Cerrar turno
            }
            default ->{
                System.out.println(" Opcion Invalida");
            }
        }
        }while (opcion != 4); 
}



}   

package sistemaIndustrial.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       login();
    }
// variables de Usuario 
    public static int codigoEmpleado = 4567;
    public static int turnoPermitido;
    public static int stockMateriaPrima = 500; //500kg
    public static int numeroPiezaRealizadas = 0; // por 1 pieza necesita 25kg de materia prima
    public static int producionMaximaxTurnos = 20; // 20 piezas
    public static Scanner entradas = new Scanner(System.in);

public static void login() {

    boolean login = false; 
    int intentos = 0;

  do{  
        System.out.println("Ingrese su codigo de empleado: ");
        int codigoIngresado = entradas.nextInt();
            if (codigoIngresado != codigoEmpleado){
                System.out.println("El Codigo Ingresado es Erroneo");
                intentos ++;
                System.out.println(intentos);
            }
            else{
                
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


               if (intentos == 3){
                  System.out.println("El numero de intentos se ha excedido\n Acceso denegado");
               }     
        }while (login != true && intentos != 3);
        entradas.close();
}

   public static void menu() {
      int opcion;
      do {
         System.out.println("\n1. Producir piezas\n2. Ver stock de materia prima\n3. Reportar daño de máquina\n4. Cerrar turno\n\n");
         opcion = entradas.nextInt();
         switch (opcion) {
            case 1 ->{
               //producirpieza
               producirPieza();}
            case 2->{
               verStock();
            } 
            // reportar daño
            case 3->{
                  reportarDaño();
            }
            //cierre de turno
            case 4->{
               cierreTurno(numeroPiezaRealizadas, stockMateriaPrima);
               break;
            }
            default->{
               System.out.println(" Opcion Invalida");
            }
         }
      } while(opcion != 4);

   }

   public static void producirPieza() {
      System.out.println("\n-----P-r-o-d-u-c-i-o-n---d-e---p-i-e-z-a----");
      System.out.println("\n\n Digite el numero de piezas a fabricar:");
      int numeroPieza = entradas.nextInt();
      entradas.nextLine();
      if (numeroPieza < 0) {
         System.out.println("Las piezas deben ser mayores que 0");
      } else if (numeroPieza > producionMaximaxTurnos) {
         System.out.println(" No debe superar 20 piezas");
      } else if (numeroPieza*25 > stockMateriaPrima) {
         System.out.println("Materia prima insuficiente");
      } else {
         numeroPiezaRealizadas += numeroPieza;
         int materiaNecesaria = numeroPieza * 25;
         stockMateriaPrima -= materiaNecesaria; 
         System.out.printf("Producción realizada con éxito\nStock restante: %d kg\n", stockMateriaPrima);
      }

   }

   public static void verStock() {
      System.out.printf("Stock de materia prima: %d", stockMateriaPrima);
      
   }

   public static void cierreTurno(int piezasrealizadas, int stockMateriaPrima) {
      System.out.printf("""
            Total de piezas producidas: %d
            Materia prima restante: %d
            Estado final de la máquina: // Queda pendiente poner este estado
            """, piezasrealizadas,stockMateriaPrima);
      
   }

   public static void reportarDaño(){
      System.out.println(" ¿Quieres reportar un daño? \n si la respuesta es si escribe (true) sino (false)");
      boolean decision = entradas.nextBoolean();
      if (decision == true){
         System.out.println("Maquina en mantenimiento");
      }
      else if (decision == false){
         System.out.println("No se reporto Daño, has salido de nuevo al menu");
      }   
      else {
         System.out.println("Valor invalido");   
      }entradas.nextLong();

      }
      
   }
   



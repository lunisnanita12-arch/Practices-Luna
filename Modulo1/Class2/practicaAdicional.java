package Class2;
import java.util.Scanner;
public class practicaAdicional {

private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        program();

    }
    
    public static void menu(){
    System.out.print("\n Bienvenido al menú de resultados de ejercicios adicionales.\n Por favor, seleccione una opción del 1 al 11: ");
        System.out.println("__________________________________");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
         System.out.println("__________________________________");
    }
    
    public static void program() {

        int opcion;  
    
        do {
            
            menu(); 
            opcion = entrada.nextInt();  
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    //funcionejercicio3();1
                case 4:
                    //funcionejercicio3();
                case 5:
                    //funcionejercicio3();
                case 6:
                    //funcionejercicio3();
                case 7:
                    //funcionejercicio3();
                case 8:
                    //funcionejercicio3();
                case 9:
                    //funcionejercicio3();
                case 10:
                    //funcionejercicio3();
                case 11:
                    //funcionejercicio3();                                
                default:
                    System.out.println("Opción no válida");
            }
            if (opcion < 1 || opcion > 11) {
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 11.");
                menu();
                opcion = entrada.nextInt();
            }
        } while (opcion != 11); // El programa se ejecutará hasta que el usuario seleccione la opción 11 para salir
           System.out.println("Has salido");

     
    }

    public static void ejercicio1() {

        int resultado = 6/ 2 *( 1 + 2 );
        System.out.printf("\n El resultado de la expresión es: %d%n", resultado);
    /*
    ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
    
     R/ Es 9 ya que primero se soluciona lo que va en parentesis y luego si se resuelve la multiplicación y división de izquierda a derecha, por lo tanto se resuelve 6/2 y luego se multiplica por el resultado del parentesis que es 3, dando como resultado final 9.
    
    Explique por que la otra calculadora genera un resultado diferente.
    
    R/La otra calculadora si sumo lo del parentesis pero fue resolviendo de derecha a izquierda, por lo tanto primero se multiplico 2 por el resultado del parentesis que es 3, dando como resultado 6, y luego se resolvió la división de 6 entre 6, dando como resultado final 1.
    */
     
    }
      
    public static void ejercicio2() {

        //Conversion de kilos a gramos, teniendo encuenta q 1 kilo es igual a 1000 gramos
        final double GRAMOS_POR_KILOS = 1000.0;
        double preciox100gramos = 5.95;
        double precioxKilo = preciox100gramos * GRAMOS_POR_KILOS/100.0;
        System.out.printf("\n El precio por kilo es: $%.2f%n", precioxKilo);

        //segun el resultado obtbenido, el vendedor lo estaba vendiendo a un valor menor que el del mercado. Seria incorrecto el precio.
    
    }


   
}

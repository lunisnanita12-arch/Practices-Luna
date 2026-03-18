package Class2;
import java.util.Arrays;
import java.util.Scanner;
public class practicaAdicional {

private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        program();

    }
    
    public static void menu(){
    System.out.print(" \n .\n Bienvenido al menú de resultados de ejercicios adicionales.\n Por favor, seleccione una opción del 1 al 11: ");
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
        System.out.println("11. Salir del programa");
         System.out.println("__________________________________");
    }
    
    public static void program() {

        int opcion;  
    
        do {  
            menu(); 
            opcion = entrada.nextInt();  
            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 ->ejercicio10(); 
                case 11-> System.out.println("Saliendo del programa...");
                         
                default->
                    System.out.println("Opción no válida");
            }
            if (opcion < 1 || opcion > 11) {
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 10.");
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

        /*
        según el resultado obtenido, 
        el vendedor lo estaba vendiendo a un valor menor que el del mercado. 
        Seria incorrecto el precio.
     */
    }
    public static void ejercicio3(){
        // segun lo planteado es una suma basica de los peces rojos  + los peces azules....
        int pecesRojos = 284;
        int pecesAzules = 163;
        var totalPecesColores= pecesAzules + pecesRojos;
        System.out.printf("El total de peces de colores es: %d", totalPecesColores);

    }
   

    public static void ejercicio4(){
    
        double saldoInicial = 23;
        double saldoFinal = 12.75;

        var saldoGastado = saldoInicial - saldoFinal;
        System.out.printf("El saldo gastado fue $%.2f%n", saldoGastado);

        //y si quisieramos saber cual vale normalmente la boleta seria:

        var valorBoleta = (saldoGastado*100)/70;
        System.out.printf("el valor de la boleta es $%.2f", valorBoleta);
    }

    public static void ejercicio5(){
        double valorPcBarrio= 660;
        var descuento = (valorPcBarrio * 10)/100; // 10%

        var valorPcBarrioDescuento = valorPcBarrio - descuento;
        System.out.println("El valor del PC con el descuento es de $"+ valorPcBarrioDescuento);
    }
   
    public static void ejercicio6(){
        // teniendo encuenta que 34 es el valor con el 15% de descuento podemos deducir que es el valor de 85%

        double valorConDescuento = 34;
        var valorSinDescuento =  (valorConDescuento*100)/85;
        System.out.printf("El valor sin descuento es: $%.1f%n", valorSinDescuento);
    }
      public static void ejercicio7(){
        System.out.println("----- CALCULADORA DIGITAL ----");
        System.out.println("Ingresa el primer valor: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Ingresa el segundo Valor ");
        double numero2 = entrada.nextDouble();

        System.out.println("Segun lo que quiera calcular dijite : \n(1): Division \n(2): Multiplicacion\n(3): Suma \n(4): Resta ");
        int menu2 = entrada.nextInt();



        var resultado =
            (menu2 == 1) ? numero1/numero2 :
            (menu2 == 2) ? numero1*numero2 : 
            (menu2 == 3) ? numero1 +numero2: 
            (menu2 == 4) ? numero1-numero2: 0;
             if (resultado == 0 || resultado > 4){
                System.out.println("Opcion no Valida");
                return;
             }
         
            System.out.printf("El resultado es: %.2f ",resultado );
            


       
    }
     public static void ejercicio8(){
    
        System.out.println("CALCULO DE AREA Y PERIMETRO DE UN RECTANGULO\n");
        System.out.println("ingresa el valor de la base");
        double base = entrada.nextDouble();
        System.out.println("ingrese el valor de el altura");
        double altura = entrada.nextDouble();
        System.out.println("Segun lo que quiera calcular dijite : \n(1): Area \n(2): Perimetro");
        int opcion = entrada.nextInt();
          var resultado = 
          (opcion == 1)? base * altura:
          (opcion == 2)?(base+base+altura+altura):0;
          if (opcion == 0 || opcion > 2){
            System.out.println("Opcion no Valida");
                return;
          }
          System.out.printf("El resultado es: %.2f ",resultado );




    }
     public static void ejercicio9(){

        System.out.println("----- CONVERSION DE TEMPERATURA -----");
        System.out.println("Ingrese la temperatura en celsius ");
        double celsius = entrada.nextDouble();
        double Fahrenheit = celsius * 9/5 + 32;
        double Kelvin = celsius + 273.15;

        System.out.println("Segun lo que quiera calcular dijite : \n(1): Fahrenheit \n(2): Kelvin ");
        int opcion = entrada.nextInt();
        var resultado = 
            (opcion == 1)? Fahrenheit:
            (opcion == 2)? Kelvin: 0;

            if (opcion == 0 || opcion > 2){
            System.out.println("Opcion no Valida");
                return;
            }
                System.out.println("El resultado es:" + resultado);
    

       
    }
     public static void ejercicio10(){
        System.out.println("---C-A-C-U-L-O---D-E---L-A---M-E-D-I-A---\n");
        System.out.println("Ingrese la cantidad de numeros que tiene la media");

        int iteracion = entrada.nextInt();
        int contador = 0;
        double total = 0;
        double[] listaMedia = new double [iteracion];

        while (contador != iteracion){
         System.out.printf("Ingrese el #%d valor: ", contador + 1);
         double num = entrada.nextDouble();
         listaMedia[contador]= num;
         contador ++;
         total = total + num;
         

        }

        System.out.println("La Media de los numeros: " + Arrays.toString(listaMedia) +"/["+ iteracion + "] es: " + total/iteracion );

       
    }
 }



import java.util.Scanner;

public class aplicacionDeUtilidadesEnConsolaClass5 {
    public static void main(String[] args) {


       Scanner entradaDato = new Scanner(System.in);

        int opcion;
        do { // uso de bucle para que se repita hasta que el usuario desee salir
            System.out.println(" \n ---C-O-N-S-O-L-A----M-A-T-E-M-A-T-I-C-A-S----");
            System.out.println("");
            System.out.println("Escoje la opcion del [1] al [3] dependiendo que quieres calcular:");
            System.out.println("");
            System.out.println("1] Calcular Area de una figura (circulo o Rectangulo)");
            System.out.println("2] Calcular edad futura");
            System.out.println("3] Verificar si un numero es primo");
            System.out.println("Salir del programa");
            opcion = entradaDato.nextInt();
                switch (opcion){ // uso de condicional SWITCH para dirigir el programa a lo que el usuario desee 
                    case 1 ->{ 
                        System.out.println("Segun lo que quieras calcular dijite : \n(1): Circulo \n(2): Rectangulo ");
                        int submenu = entradaDato.nextInt();
                        if (submenu <= 0 || submenu >=3){ //uso de condicional IF ya que es un submenu corto
                            System.out.println("Opcion Invalida");
                        }else if (submenu == 1){
                            final double PI = 3.14159; //uso de variable constante -¿Esta bien declararla desde aca? 
                            System.out.println("\n----C-A-L-C-U-L-O----A-R-E-A----D-E-L----C-I-R-C-U-L-O----\n");
                            System.out.println("Para calcular el area del circulo ingrese el valor de su radio");
                            double radio = entradaDato.nextDouble();
                            double area = PI *(radio*radio);
                            System.out.printf("El area del circulo con radio %.1f es: %.1f /n ", radio, area);
                        }else {
                            System.out.println("\n----C-A-L-C-U-L-O----A-R-E-A----D-E-L----R-E-C-T-A-N-G-U-L-O----");
                            System.out.println("Para calcular el area del rectangulo ingrese el valor de la base");
                            double base = entradaDato.nextDouble();
                            System.out.println("ingrese el valor de el altura");
                            double altura = entradaDato.nextDouble();
                            double area = base*altura;
                            System.out.printf("El area del rectangulo es: %.1f %n", area);

                        }
                    }
                    case 2 ->{
                        System.out.println("----C-A-L-C-U-L-O----D-E----LA----E-D-A-D----F-U-T-U-R-A----");
                        System.out.println("Ingrese tu edad actual");
                        int edadActual = entradaDato.nextInt();
                        System.out.println("Ingrese el numero de años en el futuro que quiere calcular");
                        int añofuturo = entradaDato.nextInt();
                        var añosEnElFuturo = añofuturo + edadActual;
                        System.out.printf(" Los años que tendras en %d años sera de %d años %n", añofuturo, añosEnElFuturo);
                    }
                    case 3 -> {
                        int numero = 0;
                        System.out.println("\n---C-A-L-C-U-L-A-R---S-I---E-L---N-U-M-E-R-O---E-S---P-R-I-M-O---O---N-O---");
                        System.out.println("Inserte el numero que quieres saber si es primo: ");
                        numero = entradaDato.nextInt();
                        int iteracion = 2;
                        boolean esPrimo = true;
                        while (iteracion != numero) {
                        
                            if (numero <= 1) {
                                    esPrimo = false;
                                } else  if (numero % iteracion == 0) {
                                    esPrimo = false;
                                    break; // encontramos un divisor
                                
                                }
                                iteracion ++;
            
                        }        
                            if (esPrimo) {
                                System.out.println(numero + " es primo");
                            } else {
                                System.out.println(numero + " no es primo");
                            }
                        
                    }
                    
                    default ->{
                        System.out.println("Opcion no valida");
                    }
                }
        
        } while (opcion != 5);
                    
            System.out.println("Hasta pronto.....");
            entradaDato.close();
        


    }

}

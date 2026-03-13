package Class3;

import java.util.Scanner;

public class ejercicioBanco {

public static final Scanner entrada= new Scanner(System.in);
public static int usuario = 1415;    
public static  int contraseña = 1234;
public static double saldoInicial = 1000000;
public static void main(String[] args) {
        login();

    }
public static void login() {
    
        int usuario = 1415;    
        int contraseña = 1234;
        boolean login = false;
        int intentos = 0;
        while (login == false && intentos < 3) {

                System.out.println("----L-O-G-I-N---");
                System.out.println("Ingrese el Usuario");
                int usuarioIngresado = entrada.nextInt();
                System.out.println("Ingresa la Contraseña");
                int contraseñaIngresada = entrada.nextInt();
                entrada.nextLine();
            
                if (usuario != usuarioIngresado || contraseña != contraseñaIngresada){
                    System.out.println(" El usuario o la Contraseña es Incorrecta/ intentalo de Nuevo");
                    intentos ++;}

                    else
                    {
                        login = true;
                       
                    }

         }       
        
            if (intentos == 3){
                System.out.println("Has excedido el numero de intentos");
                                    
                  }
                   
            else{
                 login = true;
                 menu();
                }

        
        
}

// Metodo de impresion de nombre de usuario
public static void saludar (int usuario){
     System.out.printf("Bienvido a tu Cuenta %d%n", usuario);
}

// Metodo de Consultar Saldo
public static void consultarSaldo() {
    System.out.println("Su saldo actual es: " + saldoInicial);
}

public static void transferirDinero() {
    System.out.println("Digite el numero de Cuenta de Destino: ");
    int numeroDestino = entrada.nextInt();
    System.out.println("Digite el monto a transferir: ");
    double montoDeTransferencia = entrada.nextInt();
    entrada.nextLine();

    if (montoDeTransferencia <= 0){
        System.out.println("Monto Invalido");
    } 
    else if (saldoInicial < montoDeTransferencia){
        System.out.println("Saldo insuficiente");

    } else {
        double saldoActual = saldoInicial - montoDeTransferencia;
        saldoInicial = saldoActual; 
        System.out.println("Transferencia realizada con exito");
        System.out.printf("%n Saldo Restante: $ %.0f ", saldoInicial);    
    
    }   
}

public static void retirarDinero() {
   
    System.out.println("Digite el monto a retirar: ");
    double montoDeTransferencia = entrada.nextInt();
    entrada.nextLine();

    if (montoDeTransferencia <= 0){
        System.out.println("Monto Invalido");
    } 
    else if (saldoInicial < montoDeTransferencia){
        System.out.println("Saldo insuficiente");

    } else {
        double saldoActual = saldoInicial - montoDeTransferencia;
        saldoInicial = saldoActual; 
        System.out.println("Retiro realizada con exito");
        System.out.printf("%n Saldo Restante: $ %.0f ", saldoInicial);    
    
    }   
}


//Menu del Programa
public static void menu(){
saludar(usuario);
int opcion;
do{
System.out.println("\n-------M---E---N---U------");
System.out.println("\n 1. Consultar Saldo");
System.out.println(" 2. Transferir dinero");
System.out.println(" 3. Retirar Dinero");
System.out.println(" 4. Salir.\n"); 

    opcion = entrada.nextInt();
    switch (opcion){
     case 1 ->{      
            consultarSaldo(); 


     }
     case  2->{
        transferirDinero();
     }
     case  3->{
       retirarDinero();
     }
     case  4-> { 
            System.out.println("Gracias por usar Banco DevSenior");
            System.out.printf("Saldo final: $.0f");
            System.out.println("Saliendo de la cuenta.... Hasta Pronto!!");
           
     }
     default ->{
        System.out.println("Valor Erroneo, intente de Nuevo");
     }

    }


    }while(opcion != 4);

}

}

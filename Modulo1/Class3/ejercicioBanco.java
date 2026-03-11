package Class3;

import java.util.Scanner;

public class ejercicioBanco {

public static final Scanner entrada= new Scanner(System.in);
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
                 saludar(usuario);
                 cuenta();
                }

        
        
}

public static void saludar (int usuario){
     System.out.printf("Bienvido a tu Cuenta %d%n", usuario);
}
/* 
public static void cuenta(){
System.out.println("Bienvenido a tu Cuenta luna");
System.out.println("Digite del ");
}
*/
}

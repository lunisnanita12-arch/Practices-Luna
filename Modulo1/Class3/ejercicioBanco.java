package Class3;

import java.util.Scanner;

public class ejercicioBanco {

public static final Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        login();

    }
public static void login() {
    
String usuario = "luna";    
int contraseña = 1234;
boolean login = false;
while (login == false) {

        System.out.println("----L-O-G-I-N---");
        System.out.println("Ingrese el Usuario");
        String usuarioIngresado = entrada.nextLine();
        System.out.println("Ingresa la Contraseña");
        int contraseñaIngresada = entrada.nextInt();


        if (usuario != usuarioIngresado && contraseña != contraseñaIngresada){
            System.out.println(" El usuario o la Contraseña es Incorrecta/ intentalo de Nuevo");
        } else {
            login = true;
        }
}

System.out.println("Usuario Registrado.....");
}
}

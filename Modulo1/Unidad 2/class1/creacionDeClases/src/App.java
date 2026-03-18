import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingresa el Destino del avion");
        String destino = entrada.nextLine();
        System.out.println(" Ingresa el Origen del avion");
        String origen = entrada.nextLine();
        System.out.println(" Ingresa la fecha del vuelo del avion");
        String fecha = entrada.nextLine();
        System.out.println(" Ingresa el numero de pasajeros");
         int  pasajero = entrada.nextInt();

     Vuelos vuelo1 = new Vuelos(destino, origen, fecha, pasajero);
    
        
    System.out.printf("Destino: %s%n Origen: %s%n Fecha:%s%n Pasajeros: %d", 
                vuelo1.getDestino(),    
                vuelo1.getOrigen(), 
                vuelo1.getFecha(), 
                vuelo1.getPasajeros());
                
    entrada.close();
    }

}

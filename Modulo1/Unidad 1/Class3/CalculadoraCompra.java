package Class2;
import java.util.Scanner;

public class CalculadoraCompra {
     public static void main(String[] args) {
        
        Scanner entradScanner = new Scanner(System.in);
        final double TASA_IMPUESTO = 0.15; // 15% de impuesto

        System.out.println("Bienvenido a la Calculadora de Compra!");
        System.out.print("Ingrese el precio unitario del artículo: ");
        double precioUnitario = entradScanner.nextDouble();

        System.out.print("Ingrese la cantidad de artículos comprados: ");
        int cantidadArticulos = entradScanner.nextInt();
        
        System.out.println("Cantidad a pagar el cliente por los artículos ");
        double cantidadaPagar = entradScanner.nextDouble();
        entradScanner.nextLine();

        // Calcular el subtotal, el monto del impuesto, el total de la compra y el cambio
        var subtotal = precioUnitario * cantidadArticulos;
        var montoImpuesto = subtotal * TASA_IMPUESTO;
        var totalCompra = subtotal + montoImpuesto;
        var cambio = cantidadaPagar - totalCompra;
        var impuestoEnPorcentaje = TASA_IMPUESTO * 100;

        System.out.printf("Subtotal: $%.2f%n" , subtotal);
        System.out.printf("Monto del impuesto($%.0f%%): $%.2f%n" ,impuestoEnPorcentaje, montoImpuesto);
        System.out.printf("Total de la compra: $%.2f%n" ,totalCompra);
        System.out.printf("Cambio: $%.2f%n" , cambio);

        System.out.printf("%n Gracias por su compra! Vuelva pronto!");
        entradScanner.close();




          
    }


}
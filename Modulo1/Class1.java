import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variables Constantes

        final double CM_POR_METRO = 100.0;
        final double LIBRAS_POR_KG = 2.20462;
        final float FACTOR_CELSIUS_FAHRENHEIT = 1.8f;
        final double OFFSET_FAHRENHEIT = 32.0;
        final double ML_POR_LITRO = 1000.0;

        System.out.println("Hello, World Welcome to ConvertDay!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s ! Welcome to ConvertDay!", name);
        scanner.nextLine();

        System.out.println("Please enter a length in meters: ");
        double lengthInMeters = scanner.nextDouble();
        double convertedLength = lengthInMeters * CM_POR_METRO;
        System.out.printf("%.2f meters is equal to %.2f centimeters.%n", lengthInMeters, convertedLength);

        System.out.println("Please enter a weight in kilograms: ");
        double weightInKg = scanner.nextDouble();
        var convertedWeight = weightInKg * LIBRAS_POR_KG;
        System.out.printf("%.2f kilograms is equal to %.2f pounds.%n", weightInKg, convertedWeight);

        System.out.println("Please enter a temperature in Celsius: ");
        float tempInCelsius = scanner.nextFloat();
        double convertedTemp = tempInCelsius * FACTOR_CELSIUS_FAHRENHEIT + OFFSET_FAHRENHEIT;
        System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n", tempInCelsius, convertedTemp);

        System.out.println("Please enter a volume in liters: ");
        double volumeInLiters = scanner.nextDouble();   
        double convertedVolume = volumeInLiters * ML_POR_LITRO;
        System.out.printf("%.2f liters is equal to %.2f milliliters.%n", volumeInLiters, convertedVolume);


        scanner.close();
    }
}
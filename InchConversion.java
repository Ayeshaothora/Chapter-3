import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for inches
        System.out.print("Enter the number of inches: ");
        double inches = scanner.nextDouble();

        // Convert and display results
        convertToFeet(inches);
        convertToYards(inches);

        scanner.close();
    }

    public static void convertToFeet(double inches) {
        double feet = inches / 12;
        System.out.printf("%.2f inches is equal to %.2f feet.%n", inches, feet);
    }

    public static void convertToYards(double inches) {
        double yards = inches / 36;
        System.out.printf("%.2f inches is equal to %.2f yards.%n", inches, yards);
    }
}

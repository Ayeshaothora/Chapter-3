import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for room dimensions
        System.out.print("Enter room length (feet): ");
        double length = scanner.nextDouble();
        System.out.print("Enter room width (feet): ");
        double width = scanner.nextDouble();
        System.out.print("Enter room height (feet): ");
        double height = scanner.nextDouble();

        // Calculate and display cost
        double totalCost = calculateCost(length, width, height);
        System.out.printf("Total cost to paint the room: $%.2f%n", totalCost);

        scanner.close();
    }

    public static double calculateCost(double length, double width, double height) {
        double wallArea = calculateWallArea(length, width, height);
        double gallonsNeeded = calculateGallonsNeeded(wallArea);
        double price = gallonsNeeded * 32;
        return price;
    }

    public static double calculateWallArea(double length, double width, double height) {
        double wallArea = 2 * (length * height + width * height);
        return wallArea;
    }

    public static double calculateGallonsNeeded(double wallArea) {
        return wallArea / 350;
    }
}

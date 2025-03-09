import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two double values
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Call computePercent method with original order
        computePercent(num1, num2);
        // Call computePercent method with reversed order
        computePercent(num2, num1);

        scanner.close();
    }

    public static void computePercent(double num1, double num2) {
        double percentage = (num1 / num2) * 100;
        System.out.printf("%.2f is %.2f percent of %.2f%n", num1, percentage, num2);
    }
}

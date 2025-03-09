import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for current year and birth year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculate and display insurance premium
        int premium = calculatePremium(currentYear, birthYear);
        System.out.printf("Your insurance premium is: $%d%n", premium);

        scanner.close();
    }

    public static int calculatePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        int decades = age / 10;
        return (decades + 15) * 20;
    }
}

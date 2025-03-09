import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first and last name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Test overloaded methods
        displaySalutation(firstName);
        System.out.println(); // Separate outputs
        displaySalutation(firstName, lastName);

        scanner.close();
    }

    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }
}

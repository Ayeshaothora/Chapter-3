import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name and GPA
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade point average: ");
        double gpa = scanner.nextDouble();

        // Call method to display bookstore credit
        displayCredit(name, gpa);

        scanner.close();
    }

    public static void displayCredit(String name, double gpa) {
        double credit = gpa * 10;
        System.out.printf("%s, with a GPA of %.2f, you have earned a bookstore credit of $%.2f.%n", name, gpa, credit);
    }
}

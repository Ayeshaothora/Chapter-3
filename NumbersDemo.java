import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two integer values
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Call methods for first number
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        // Call methods for second number
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

        scanner.close();
    }

    public static void displayTwiceTheNumber(int number) {
        System.out.println("Twice " + number + " is " + (number * 2));
    }

    public static void displayNumberPlusFive(int number) {
        System.out.println(number + " plus five is " + (number + 5));
    }

    public static void displayNumberSquared(int number) {
        System.out.println(number + " squared is " + (number * number));
    }
}

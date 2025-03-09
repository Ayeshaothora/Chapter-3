import java.util.Scanner;

public class BookBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test first method (no parameters)
        double total1 = computeBill();
        System.out.printf("Total for one book: $%.2f%n", total1);

        // Prompt user for the number of books
        System.out.print("Enter the number of books ordered: ");
        int quantity = scanner.nextInt();
        double total2 = computeBill(quantity);
        System.out.printf("Total for %d books: $%.2f%n", quantity, total2);

        // Prompt user for a coupon value
        System.out.print("Enter coupon value: ");
        double coupon = scanner.nextDouble();
        double total3 = computeBill(quantity, coupon);
        System.out.printf("Total for %d books with a $%.2f coupon: $%.2f%n", quantity, coupon, total3);

        scanner.close();
    }

    public static double computeBill() {
        return computeBill(1);
    }

    public static double computeBill(int quantity) {
        double subtotal = quantity * 14.99;
        return subtotal * 1.08;
    }

    public static double computeBill(int quantity, double coupon) {
        double subtotal = (quantity * 14.99) - coupon;
        return subtotal * 1.08;
    }
}

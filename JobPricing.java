import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for job details
        System.out.print("Enter job name: ");
        String jobName = scanner.nextLine();
        System.out.print("Enter cost of materials: ");
        double materialCost = scanner.nextDouble();
        System.out.print("Enter number of hours of work required: ");
        double workHours = scanner.nextDouble();
        System.out.print("Enter number of hours of travel time: ");
        double travelHours = scanner.nextDouble();

        // Calculate job estimate
        double estimatedCost = calculateEstimate(materialCost, workHours, travelHours);

        // Display job estimate
        System.out.printf("The estimated cost for '%s' is: $%.2f%n", jobName, estimatedCost);

        scanner.close();
    }

    public static double calculateEstimate(double materialCost, double workHours, double travelHours) {
        return materialCost + (workHours * 35) + (travelHours * 12);
    }
}

import java.util.Scanner;

public class MadLibWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for words
        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter a direction: ");
        String direction = scanner.nextLine();

        // Call method to display Mad Lib story
        displayStory(animal, number, direction);

        scanner.close();
    }

    public static void displayStory(String animal, int number, String direction) {
        System.out.println("Once upon a time, a brave " + animal + " set out on a journey.");
        System.out.println("It traveled " + number + " miles to the " + direction + ", searching for adventure.");
        System.out.println("Along the way, it met new friends and discovered a hidden treasure!");
        System.out.println("And so, the " + animal + " became the hero of the land.");
    }
}

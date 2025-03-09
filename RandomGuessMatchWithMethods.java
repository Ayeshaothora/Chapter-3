import java.util.Scanner;

public class RandomGuessMatchWithMethods {

    // Define the constants for MIN and MAX
    public static final int MIN = 1;
    public static final int MAX = 100;

    public static void main(String[] args) {
        // Generate a random number between MIN and MAX inclusive
        int randomNumber = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        
        // Declare a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the user's guess
        int userGuess = getUserGuess();

        // Check if the user's guess is correct
        boolean isCorrect = checkGuess(randomNumber, userGuess);

        // Call the displayResults method to show the results
        displayResults(randomNumber, userGuess, isCorrect);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to prompt the user to guess a number
    public static int getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between " + MIN + " and " + MAX + ": ");
        return scanner.nextInt();
    }

    // Method to check if the user's guess matches the random number
    public static boolean checkGuess(int randomNumber, int userGuess) {
        return randomNumber == userGuess;
    }

    // Method to display the results, including how far the guess was from the random number
    public static void displayResults(int randomNumber, int userGuess, boolean isCorrect) {
        System.out.println("Random Number: " + randomNumber);
        System.out.println("Your Guess: " + userGuess);
        if (isCorrect) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Incorrect guess. You were off by " + Math.abs(randomNumber - userGuess) + ".");
        }
    }
}

package com.softserve.edu05_arr_loop.hw;
import java.util.Random;
import java.util.Scanner;

public class Hw4 {

    public static void main(String[] args) {
        guessingGame();
    } // Nice very nice

    public static void guessingGame() {
        // Generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Main loop for the guessing game
        while (true) {
            // Prompt the user to guess the number
            System.out.print("Guess the number (between 1 and 100): ");
            int userGuess = scanner.nextInt();

            // Check if the guess is correct
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break; // Exit the loop if the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}

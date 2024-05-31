package com.softserve.edu05.hw05;

import java.util.Scanner;

    public class GuessTheNumber {
        public static void main(String[] args) {
            int min = 1;
            int max = 100;

            // Generate a random number between 1 and 100
            int randomNumber = RandomNumberGenerator.generateRandomNumber(min, max);

            // Initialize scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Initialize guess variable
            int guess;

            // Loop until the user guesses the correct number
            while (true) {
                System.out.print("Guess the number (between 1 and 100): ");
                guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break; // Exit the loop if the guess is correct
                } else if (guess < randomNumber) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Too high, try again.");
                }
            }

        }
    }

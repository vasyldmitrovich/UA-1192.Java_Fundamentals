package com.softserve.edu11.hw.hw4;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String nameRegex = "^[a-zA-Z\\s-]+$";

        String[] greetingPhrases = {
                "Hello, %s! How are you today?",
                "Hey there, %s! Nice to see you.",
                "Hi %s! Hope you're having a great day."
        };

        String firstName = "";
        String lastName = "";

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine().trim();

            if (firstName.matches(nameRegex)) {
                break;
            } else {
                System.out.println("Invalid input. First name can only contain English letters, spaces, and hyphens.");
            }
        }

        while (true) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine().trim();

            if (lastName.matches(nameRegex)) {
                break;
            } else {
                System.out.println("Invalid input. Last name can only contain English letters, spaces, and hyphens.");
            }
        }

        int randomIndex = random.nextInt(greetingPhrases.length);

        String greetingMessage = String.format(greetingPhrases[randomIndex], firstName + " " + lastName);

        System.out.printf("\n" + greetingMessage);
        scanner.close();
    }
}

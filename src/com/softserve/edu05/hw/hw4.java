package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(100) + 1;
        int selectedNum;

        System.out.println("Hey, lets play!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess the number (1-100)?");

        do {
            System.out.print("Enter your guess: ");
            selectedNum = scanner.nextInt();

            if (selectedNum > randomNum) {
                System.out.println("Too high, try again.");
            } else if (selectedNum < randomNum) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        } while (selectedNum != randomNum);
    }
}


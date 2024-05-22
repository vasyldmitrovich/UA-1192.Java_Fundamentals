package com.softserve.edu05.hw;

import java.util.Random;

public class Randomizer {
    public static void RandomizerApp() {// Nice it interesting
        boolean check = false;
        int counter = 0;
        Random rnd = new Random();
        int guessTheNum = rnd.nextInt(0, 101);
        System.out.println("\n" + "=".repeat(20) + "Try to guess the number!" + "=".repeat(20));
        do {
            System.out.println("Input your number: ");
            counter++;
            int usernum = Hw1_1.getNumber();
            if (usernum > guessTheNum) {
                System.out.println("Too high, try again");
                check = false;
            } else if (usernum < guessTheNum) {
                System.out.println("Too low, try again");
                check = false;
            } else if (usernum == guessTheNum) {
                System.out.println("=".repeat(60));
                System.out.printf("Congratulations!\nYou guessed the number from %d try!\n", counter);
                System.out.println("=".repeat(60));
                check = true;
            }
        } while (!check);
    }
}

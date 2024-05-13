package com.softserve.edu05.hw;

public class Task54 {

    public static void execute() {
        System.out.println("Lets try to guess a number");
        GuessNumber guessNumber = new GuessNumber();
        int attempt = CustomScanner.scanInt();

        do {
            if (guessNumber.isEqual(attempt)) {
                System.out.println("Congratulations! You've guessed)");
                break;
            } else {
                if (guessNumber.isGreater(attempt)) {
                    System.out.println("Too high, try again");
                } else {
                    System.out.println("Too low, try again");
                }
                attempt = CustomScanner.scanInt();
            }
        } while (true);
    }

}

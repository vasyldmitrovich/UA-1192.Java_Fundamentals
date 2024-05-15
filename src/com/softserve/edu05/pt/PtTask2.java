package com.softserve.edu05.pt;

import java.util.Scanner;

public class PtTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {
        System.out.println("Enter a number: ");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not a prime");
        }
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number < 0) number = -number;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}

package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw1_1 {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static final int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] names = {"January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

    public static void hwDoTask1() {
        System.out.print("Enter number of month: ");
        int monthNumber = Hw1_1.getNumber();
        if ((monthNumber > 0) && (monthNumber <= 12)) {
            System.out.printf("Name of month: %s \n%s has %d days\n", names[monthNumber - 1],
                    names[monthNumber - 1], month[monthNumber - 1]);
        } else System.out.println("You entered wrong number");
    }

    public static int getNumber() {
        return SCANNER.nextInt();
    }
}





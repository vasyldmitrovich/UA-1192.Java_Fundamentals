package com.softserve.edu05.hw;

import java.util.Scanner;

public class Month_number {
    private final static int[] month_array = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        int number = scanner.nextInt();

        if ((number <= 0 || number > 12)) {
            System.out.println("You entered the wrong number!");
        } else {
            System.out.printf("There are %d days in this month", month_array[number - 1]);
        }
    }
}

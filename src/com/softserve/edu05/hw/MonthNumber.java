package com.softserve.edu05.hw;


import java.util.Scanner;

public class MonthNumber {
    private static final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final Scanner scanner = new Scanner(System.in);

    public static int getPrompt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static void getDays(int month) {
        if (month > 12 || month <= 0) {
            System.out.println("Invalid number of month");
        } else {
            System.out.println("In the month numbered " + month + ", the number of days is " + monthDays[month - 1]);
        }
    }
}

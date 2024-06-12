package com.softserve.edu05.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Subtask1 {

    private static final int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    Subtask1() {}

    public void start() {// Good
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the month number");
        try {
            int month = sc.nextInt();
            int days = getDays(month);
            System.out.println("There are " + days + " days in this month");
            // Added InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("You enter non-integer value");
        }
    }


    public static int getDays (int month) {
        int daysInMonth = 0;
        if (month > 1 && month < 12) {
            daysInMonth = days[month - 1];
        } else {
            System.out.println("You enter wrong number");
        }
        return daysInMonth;
    }
}

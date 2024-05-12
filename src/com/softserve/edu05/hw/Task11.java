package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task11 {
    private static final int[] MONTH_ARRAY = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int GetDaysByMonth(int number) {
        if ((number <= 0 || number > 12)) {
            System.out.println("You entered the wrong number!");
            return 0;
        } else {
            System.out.printf("There are %d days in this month\n", MONTH_ARRAY[number - 1]);
            return MONTH_ARRAY[number - 1];
        }
    }

}

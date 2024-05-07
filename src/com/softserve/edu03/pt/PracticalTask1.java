package com.softserve.edu03.pt;

import java.util.Scanner;

public class PracticalTask1 { // It was not necessary to do this class, but ok

    private int a;
    private int b;

    PracticalTask1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getTotal() {
        return "The sum of " + a + " and " + b + " is " + (a + b);
    }

    public String getAverage() {
        return "The average of " + a + " and " + b + " is " + ((a + b)/2);
    }

    public static String getNumber(String prompt) {
        int number = 0;
        try {
            number = Integer.parseInt(prompt);
        } catch (Exception e) {
            System.out.println("Error");
        }
        return "You enter " + number;
    }
}

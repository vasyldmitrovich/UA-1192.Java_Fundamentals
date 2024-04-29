package com.softserve.edu01.pt;

import java.util.Scanner;

public class PracticalTask3 {

    PracticalTask3() {}

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for variable a");
        try {
            int a = sc.nextInt();
            System.out.println("Enter value for variable b");
            int b = sc.nextInt();
            double divine = (double) a / b;
            System.out.println("a + b = " + (a + b) + "\n" +
                    "a - b = " + (a - b) + "\n" +
                    "a * b = " + (a * b) + "\n" +
                    "a / b = " + divine);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

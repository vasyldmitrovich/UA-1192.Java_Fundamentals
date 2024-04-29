package com.softserve.edu01.pt;

import java.util.Scanner;

public class PracticalTask2 {

    PracticalTask2() {}

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        try {
            int firstNumber = sc.nextInt();
            System.out.println("Enter second number");
            int secondNumber = sc.nextInt();
            System.out.println("Enter third number");
            int thirdNumber = sc.nextInt();
            double avg = (double) (firstNumber + secondNumber + thirdNumber)/3;
            System.out.println("Average is " + avg);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

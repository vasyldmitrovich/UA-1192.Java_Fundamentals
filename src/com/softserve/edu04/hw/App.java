package com.softserve.edu04.hw;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Input first number: ");
        float number1 = scanner.nextFloat();
        System.out.println("Input second number: ");
        float number2 = scanner.nextFloat();
        System.out.println("Input third number: ");
        float number3 = scanner.nextFloat();
        boolean inRange = number1 >= -5 && number1 <= 5 && number2 >= -5 && number2 <= 5 && number3 >= -5 && number3 <= 5;
        if (inRange) {
            System.out.println("All numbers belong to the interval [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the interval [-5, 5]");
        }
    }
}

package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task2 {
    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("enter second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("sum of numbers: " + sum);

            System.out.println("would you like to try again? (y/n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}

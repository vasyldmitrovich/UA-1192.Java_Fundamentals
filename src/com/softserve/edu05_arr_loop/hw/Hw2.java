package com.softserve.edu05_arr_loop.hw;
import java.util.Scanner;


public class Hw2 {
    public static void main(String[] args) {// Ok
    Scanner scanner = new Scanner(System.in);
    boolean repeat = true;

    do {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        System.out.print("Do you want to perform the operation again? (yes/no): ");
        String choice = scanner.next().toLowerCase();

        if (!choice.equals("yes")) {
            repeat = false;
        }

    } while (repeat);

    System.out.println("Program terminated.");
    scanner.close();
}
}

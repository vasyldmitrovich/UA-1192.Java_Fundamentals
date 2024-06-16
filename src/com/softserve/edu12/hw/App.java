package com.softserve.edu12.hw;

import com.softserve.edu12.hw.Div;

import java.util.Scanner;

import static com.softserve.edu12.hw.ReadNumber.readNumber;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = Div.div(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (
                NumberFormatException e) {

            System.out.println("Invalid input format. Please enter valid double numbers.");
        } catch (
                ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (
                Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void task2() {
        try {
            int[] numbers = new int[10];
            for (int i = 0; i < 10; i++) {
                while (true) {

                    try {
                        int start = (i == 0) ? 1 : numbers[i - 1];
                        int end = (i == 9) ? 100 : 100;
                        System.out.printf("Enter number a%d (in range %d to %d): ", i + 1, start + 1, end - 1);
                        int num = readNumber(start + 1, end - 1);
                        numbers[i] = num;
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            System.out.println("Entered numbers: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
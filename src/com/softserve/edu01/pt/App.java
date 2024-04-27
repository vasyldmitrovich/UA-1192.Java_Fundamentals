package com.softserve.edu01.pt;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
/*
        Write a program that reads three strings and outputs them in the reverse order, each
        on a new line.
 */

        String[] log = new String[3];
        System.out.println("Print some text: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i >= 0; i--) {
            log[i] = scanner.nextLine();
        }
        System.out.println("Reversed output: ");
        for (String element : log) {
            System.out.println(element);
        }
    }

    public static void task2() {
/*
Write a program that takes three numbers from console as input to calculate and print
output the average of the numbers
 */
        double[] arr = new double[3];
        double sum = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter number: ");
            arr[i] = readDoubleInput();
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("The average of entered numbers is: " + avg);
    }

    private static void task3() {
/*
        Define integer variables a and b. Read values a and b from Console, perform basic calculations
        and output results.
 */
        System.out.println("Enter variable \"a\" integer value: ");
        int a = readIntInput();
        System.out.println("Enter variable \"b\" integer value: ");
        int b = readIntInput();
        System.out.println("Calculation results: ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + (double)a / b);

    }

    private static void task4() {
/*
        Output question “How are you?“. Define string variable answer. Read the value
        answer and output: “You are (answer)".
 */

        System.out.println("Hi there!");
        System.out.println("How are you doing? ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer.toLowerCase(Locale.ROOT).equals("good") || answer.toLowerCase(Locale.ROOT).equals("fine")){
            System.out.println("I`m glad to hear you are fine)");
        } else {
            System.out.println("So you are " + answer);
        }

    }


    private static int readIntInput() {
        scanner = new Scanner(System.in);
        int input;
        try {
            input = scanner.nextInt();

        } catch (InputMismatchException exception) {
            System.out.println("You should enter integer number, please try again: ");
            return readIntInput();
        }
        return input;
    }

    private static double readDoubleInput() {
        scanner = new Scanner(System.in);
        double input;
        try {
            input = scanner.nextDouble();

        } catch (InputMismatchException exception) {
            System.out.println("You should enter the number, please try again: ");
            return readDoubleInput();
        }
        return input;
    }


}

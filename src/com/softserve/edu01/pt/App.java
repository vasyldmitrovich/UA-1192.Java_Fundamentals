package com.softserve.edu01.pt;

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
        System.out.println("Input first string");
        String first = scanner.nextLine();
        System.out.println("Input second string");
        String second = scanner.nextLine();
        System.out.println("Input third string");
        String third = scanner.nextLine();
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);

    }

    public static void task2() {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the numbers is: " + average);
    }

    public static void task3() {
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + ((double) a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

        public static void task4() {
            System.out.println("How are you");
            scanner.nextLine();
            String answer = scanner.nextLine();
            System.out.println("You are " + answer);

        }
    }

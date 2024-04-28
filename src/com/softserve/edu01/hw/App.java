package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        String age = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    public static void task2() {
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();
        System.out.println("Enter the third string:");
        String string3 = scanner.nextLine();
        System.out.println("Reversed order:");
        System.out.println((string3));
        System.out.println((string2));
        System.out.println((string1));
    }
    public static void task3() {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + average);


    }
}


package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        firstTask();
        averageNumber();
        calculator();
        dialogue();
    }

    private static void firstTask() {
        System.out.println("Input 3 lines of text:");
        String Line1 = scanner.nextLine();
        String Line2 = scanner.nextLine();
        String Line3 = scanner.nextLine();
        System.out.printf("\nOutput text: \n" + Line3 + "\n" + Line2 + "\n" + Line1 + "\n");
    }

    public static void averageNumber() {
        System.out.println("Input first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Input second number:");
        int secondtNum = scanner.nextInt();
        System.out.println("Input third number:");
        int thirdtNum = scanner.nextInt();
        double average = (firstNum + secondtNum + thirdtNum) / 3.0;
        System.out.println("Average is " + average + "\n");
    }

    public static void calculator() {
        System.out.println("Input number a:");
        int a = scanner.nextInt();
        System.out.println("Input number b:");
        int b = scanner.nextInt();
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        double division = (double) a / (double) b;
        System.out.printf("a+b =" + sum + "\na-b =" + diff + "\na*b =" + mul + "\na/b =" + division + "\n");
    }

    public static void dialogue() {
        System.out.println("How are you?");
        scanner.nextLine();
        String answer = scanner.nextLine();
        System.out.println("You are " + answer + "\n");
    }

}

package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text: ");
        String firstString = bufferedReader.readLine();
        String secondString = bufferedReader.readLine();
        String thirdString = bufferedReader.readLine();
        System.out.println(thirdString);
        System.out.println(secondString);
        System.out.println(firstString);
    }

    public static void task2() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            double firstNumber = in.nextDouble();
            System.out.println("Enter the second number: ");
            double secondNumber = in.nextDouble();
            System.out.println("Enter the third number: ");
            double thirdNumber = in.nextDouble();
            double avg = (firstNumber + secondNumber + thirdNumber) / 3;
            System.out.println("The average is " + avg);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("You need to enter a number!");
        }
    }

    public static void task3() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = in.nextInt();
            System.out.println("Enter b: ");
            int b = in.nextInt();

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + ((double)a / b));
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("You need to enter an integer number!");
        }
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = in.nextLine();
        System.out.println("You are (" + answer + ")");
    }
}

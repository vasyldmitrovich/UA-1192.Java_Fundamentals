package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public App() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        App.task1();
        task2();
        task3();
        task4();
    }

    private static void task1() throws IOException {
        System.out.println("Enter the first string");
        String firstLine = br.readLine();

        System.out.println("Enter the second string");
        String secondLine = br.readLine();

        System.out.println("Enter the third string");
        String thirdLine = br.readLine();

        System.out.println(thirdLine);
        System.out.println(secondLine);
        System.out.println(firstLine);
    }

    private static void task2() throws IOException {
        System.out.println("Enter 3 numbers");

        double firstNumber = Integer.parseInt(br.readLine());
        double secondNumber = Integer.parseInt(br.readLine());
        double thirdNumber = Integer.parseInt(br.readLine());
        double average = ((firstNumber + secondNumber + thirdNumber) / 3);

        System.out.println("The average of the numbers = " + average);
    }

    private static void task3() throws IOException {
        System.out.println("Enter 2 numbers (a&b)");
        double a = Double.parseDouble((br.readLine()));
        double b = Double.parseDouble((br.readLine()));

        double firstValue = (a + b);
        double secondValue = (a - b);
        double thirdValue = (a * b);

        System.out.println("a + b = " + firstValue);
        System.out.println("a - b = " + secondValue);
        System.out.println("a * b = " + thirdValue);

        if (b == 0) {
            System.out.println("Error");
        } else {
            double fourthValue = (a / b);
            System.out.println("a / b = " + fourthValue);
        }
    }

    private static void task4() throws IOException {
        System.out.println("How old are you?");

        String answer = br.readLine();
        System.out.println("You are " + answer + " years old");
    }
}




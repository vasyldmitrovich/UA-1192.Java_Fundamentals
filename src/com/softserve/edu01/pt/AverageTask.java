package com.softserve.edu01.pt;

import java.io.IOException;
import java.util.Scanner;

public class AverageTask {

    public static void makeCalculation(Scanner scanner) throws IOException {

        System.out.println("Input first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number:");
        int thirdNumber = scanner.nextInt();

        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        System.out.println("Average is: " + average);
    }

    public static double calculateAverage(int first, int second, int third) {
        return (first + second + third) / 3.0;
    }

}

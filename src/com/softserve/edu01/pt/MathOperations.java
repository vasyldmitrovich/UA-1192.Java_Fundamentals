package com.softserve.edu01.pt;

import java.io.IOException;
import java.util.Scanner;

public class MathOperations {

    public static void makeOperations(Scanner scanner) throws IOException {

        System.out.println("Input a number:");
        int a = scanner.nextInt();
        System.out.println("Input b number:");
        int b = scanner.nextInt();

        int sum = a + b;
        int subtr = a - b;
        int mult = a * b;
        double div = (double) a / b;
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtr);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
    }
}

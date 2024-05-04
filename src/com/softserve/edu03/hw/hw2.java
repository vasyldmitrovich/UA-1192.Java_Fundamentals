package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw2 {
    /**
     Methods of this class calculate the smallest number

     Author: Andrew Tandyriak
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Input number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Input number 3: ");
        int number3 = scanner.nextInt();
        int smallest = Math.min(Math.min(number1, number2), number3);
        System.out.println("The smallest number is " + smallest);
        scanner.close();
    }
}

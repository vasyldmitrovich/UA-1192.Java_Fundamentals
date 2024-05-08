package com.softserve.edu03.hw;

import java.util.Scanner;

public class Hw2 {

    public static void main(String[] args) {// Good
        Scanner scanner = new Scanner(System.in);

        System.out.println("Smallest Number");

        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Third number: ");
        int thirdNumber = scanner.nextInt();

        int smallestNumber = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        System.out.println("The smallest number is: " + smallestNumber);
    }
}


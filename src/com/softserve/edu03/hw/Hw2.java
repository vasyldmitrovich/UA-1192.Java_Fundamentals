package com.softserve.edu03.hw;
import java.util.Scanner;

public class Hw2 {
    public static void main(String...args) {
        double first = getNumber("Input the first number ");
        double second = getNumber("Input the second number ");
        double third = getNumber("Input the third number");

        double theSmallest = getTheSmallest (first, second, third);
        System.out.println("The smallest number is " + theSmallest);
    }

    private static int getNumber(String a) {
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static double getTheSmallest (double first, double second, double third) {
        return Math.min(Math.min(first, second), third);
    }

}

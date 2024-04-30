package com.softserve.edu03.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        System.out.println("The area of the triangle is: " + calcTriangleArea(side1, side2, side3));
    }

    public static void task2() {
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();
        System.out.println("The smallest number is: " + findSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }

    public static double calcTriangleArea(double firstSide, double secondSide, double thirdSide) {
        double s = (firstSide * secondSide * thirdSide) / 2;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }

    public static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        return Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
    }
}

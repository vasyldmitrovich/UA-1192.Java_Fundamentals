package com.softserve.edu03.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void task1() {
        System.out.println("Input side 1:");
        double side1 = scanner.nextDouble();

        System.out.println("Input side 2:");
        double side2 = scanner.nextDouble();

        System.out.println("Input side 3:");
        double side3 = scanner.nextDouble();

        double area = calculateTriangleArea(side1, side2, side3);

        System.out.println("The area of the triangle is " + area);

    }

    public static double calculateTriangleArea(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    public static void task2() {
        System.out.println("Input first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Input second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Input third number: ");
        double thirdNumber = scanner.nextDouble();
        System.out.println("The smallest number is: " + findSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }
    public static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        return Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
    }


}

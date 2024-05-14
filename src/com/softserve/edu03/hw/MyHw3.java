package com.softserve.edu03.hw;

import java.util.Scanner;

public class MyHw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1();
        task2();
        scanner.close();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        double area = calculateTriangleArea(side1, side2, side3);
        System.out.printf("The area of the triangle is %.2f%n", area);
    }

    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int num1 = getIntInput(scanner, "Enter the first number: ");
        int num2 = getIntInput(scanner, "Enter the second number: ");
        int num3 = getIntInput(scanner, "Enter the third number: ");

        int smallest = findSmallest(num1, num2, num3);

        System.out.println("The smallest number is: " + smallest);
    }

    public static int getIntInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Invalid input. Please enter an integer: ");
        }
        return scanner.nextInt();
    }
    public static int findSmallest(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}


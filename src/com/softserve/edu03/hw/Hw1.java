package com.softserve.edu03.hw;

import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {// Nice very nice
        Scanner scanner = new Scanner(System.in);

        System.out.println("Triangle Area Calculator");

        System.out.print(" side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print(" side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print(" side 3: ");
        double side3 = scanner.nextDouble();

        double area = calculateArea(side1, side2, side3);
        System.out.println("The area of the triangle is: " + area);
    }

    public static double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
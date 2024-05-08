package com.softserve.edu03.hw.task1;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {// Nice it is very good
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Side1");
        double side1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Input Side2");
        double side2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Input Side3");
        double side3 = Double.parseDouble(scanner.nextLine());

        System.out.println("The area of the triangle is " + calculateArea(side1,side2,side3));
    }

    private static double calculateArea(double side1, double side2, double side3) {
        double s = calculateSemiPerimeter(side1, side2, side3);
        return Math.sqrt(s * (s-side1) * (s-side2) *(s-side3));
    }

    private static double calculateSemiPerimeter(double side1, double side2, double side3) {
        return (side1+side2+side3) / 2;
    }
}

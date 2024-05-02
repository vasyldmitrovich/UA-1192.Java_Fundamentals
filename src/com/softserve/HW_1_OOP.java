package com.softserve;
import java.util.Scanner;

import static edu03.TriangleAreaCalculator.calculateTriangleArea;

public class HW_1_OOP {
    public static void main(String[] args) {

        class App {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the lengths of the three sides of the triangle:");

                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();

                System.out.println("The area of the triangle is: " + calculateTriangleArea(side1, side2, side3));
            }

        }
    }
}
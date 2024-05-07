package com.softserve.edu03.hw;

import java.util.Scanner;

public class AppHw31 {
/*
    Java console application with method to calculate the area of a triangle.
 */

    public static void main(String[] args) {

        double[] sides = new double[3];
        Scanner scanner = new Scanner(System.in);
        // Do not forget spaces between variable and another path of code

        for (int i = 1; i < 4; i++) {
            System.out.println("Input Side " + i + ": ");
            sides[i - 1] = scanner.nextDouble();
        }
        System.out.printf("The area of the triangle is %.2f", calcTriangleArea(sides));
    }

    //Good
    private static double calcTriangleArea(double[] args) {
        double s = (args[0] + args[1] + args[2]) / 2;
        return Math.sqrt(s * (s - args[0]) * (s - args[1]) * (s - args[2]));
    }
}

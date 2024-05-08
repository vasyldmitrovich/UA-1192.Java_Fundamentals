package com.softserve.edu03;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input first side of triangle");
        double side1 = sc.nextDouble();
        System.out.println("input second side of triangle");
        double side2 = sc.nextDouble();
        System.out.println("input third side of triangle");
        double side3 = sc.nextDouble();


        double area = calculateTriangleArea(side1, side2, side3);// You do not use variable area, write println and use it
    }

    public static double calculateTriangleArea(double a, double b, double c) {

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Triangle area %.2f/ " + area);


        return s;
    }
}

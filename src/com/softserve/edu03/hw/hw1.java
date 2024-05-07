package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw1 {// Name of class should start from Uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input side 1: ");
        double side1 = scanner.nextDouble();

        System.out.println("Input side 2: ");
        double side2 = scanner.nextDouble();

        System.out.println("Input side 3: ");
        double side3 = scanner.nextDouble();

        // Put this logic to method and call this method here
        double semiPer = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPer * (semiPer - side1) * (semiPer - side2) * (semiPer - side3));
        System.out.println("The area of the triangle is " + area);
    }
}

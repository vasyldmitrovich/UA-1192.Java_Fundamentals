package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw1 {// Name of class should start from uppercase
    /**
     Methods of this class calculate the area of the triangle

     Author: Andrew Tandyriak
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side 1: ");
        //Add spaces for more readable of code
        double side1 = scanner.nextDouble();

        System.out.print("Input side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Input side 3: ");
        double side3 = scanner.nextDouble();

        //Create method for this operation and call this method here
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the triangle is " + area);

        scanner.close();
    }

}

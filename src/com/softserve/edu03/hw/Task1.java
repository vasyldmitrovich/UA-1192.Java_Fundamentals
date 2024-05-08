package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int side1 = getNumber("Enter the first side:");
        int side2 = getNumber("Enter the second side:");
        int side3 = getNumber("Enter the third side:");

        double halfPer = (double) (side1 + side2 + side3) / 2; // to find a half of perimeter

        double area = Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));

        String result = String.format("%.2f", area); // use String.format to make only 2 symbols after comma
        System.out.println("The area of the triangle: " + result);

    }

    private static int getNumber(String prompt) {// Good method
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}


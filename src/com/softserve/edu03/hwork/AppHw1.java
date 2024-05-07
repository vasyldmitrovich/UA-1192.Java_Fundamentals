package com.softserve.edu03.hwork;

import java.util.Scanner;

public class AppHw1 {
    public static void main(String[] args) {// Good but add spaces for more readable of code
        int first = getNumber("Input side 1:");

        int second = getNumber("Input side 2:");

        int third = getNumber("Input side 3:");

        int area = getArea(first, second, third);

        System.out.println("The area of the triangle is " + area);
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.nextLine());//You can use another method of Scanner class for reading int
    }

    private static int getArea(int first, int second, int third) {
        double p = (double) (first + second + third) / 2;
        int area = (int) Math.sqrt(p * (p - first) * (p - second) * (p - third));
        return area;

    }
}

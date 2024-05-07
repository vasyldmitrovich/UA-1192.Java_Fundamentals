package com.softserve.edu03.hw;
import java.util.Scanner;

public class Hw1 {
    public static void main(String...args) {
        int first = getNumber("Input side 1");
        int second = getNumber("Input side 2");
        int third = getNumber ("Input side 3");

        double area = getArea (first, second, third);

        System.out.println ("Tha area of the triangle is " + area);
    }

    private static double getArea(int first, int second, int third) {// Good
        double s = (first + second + third) / 2;
        double area = Math.sqrt(s * (s - first) * (s - second) * (s - third));
        return s;
    }

    private static int getNumber(String s) {// Nice method very nice
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }


}

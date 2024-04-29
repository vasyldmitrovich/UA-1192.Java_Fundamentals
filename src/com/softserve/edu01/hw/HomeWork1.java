package com.softserve.edu01.hw;

import java.util.Scanner;

public class HomeWork1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input radius");
        double radius = scanner.nextDouble();
        double perimeter = Math.PI * 2 * radius;
        System.out.println("Flower bed perimeter is: " + perimeter);
        double area = Math.PI * (radius * radius);
        System.out.println("Flower bed area is: " + area);
    }
}

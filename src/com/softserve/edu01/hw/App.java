package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter " + perimeter);
        System.out.println("Area " + area);
    }
    public static void task2() {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
    public static void task3() {
        System.out.println("Enter the cost per minute of the first call (c1):");
        double c1 = scanner.nextDouble();
        System.out.println("Enter the duration of the first call in minutes (t1):");
        double t1 = scanner.nextDouble();
        System.out.println("Enter the cost per minute of the second call (c2):");
        double c2 = scanner.nextDouble();
        System.out.println("Enter the duration of the second call in minutes (t2):");
        double t2 = scanner.nextDouble();
        System.out.println("Enter the cost per minute of the third call (c3):");
        double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of the third call in minutes (t3):");
        double t3 = scanner.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("Cost of the first call: $" + cost1);
        System.out.println("Cost of the second call: $" + cost2);
        System.out.println("Cost of the third call: $" + cost3);
        System.out.println("Total cost of all calls: $" + totalCost);
    }
}


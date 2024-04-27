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
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculate perimeter and area of a circle.");
        System.out.print("Input the radius = ");
        float a = scan.nextFloat();
        double res1, res2;
        res1 = 2 * 3.14 * a;
        res2 = 3.14 * a * a;
        System.out.println("Perimeter is " + res1);
        System.out.println("Area is " + res2);
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Where do you live, " + name);
        String address = scan.nextLine();
        System.out.print("Have a nice day " + name + " from " + address);
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Three phone calls were made from different countries.");
        System.out.print("Input the cost per minute of the first call: ");
        float c1 = scan.nextFloat();
        System.out.print("Input the duration of the first call: ");
        float t1 = scan.nextFloat();
        System.out.print("Input the cost per minute of the second call: ");
        float c2 = scan.nextFloat();
        System.out.print("Input the duration of the second call: ");
        float t2 = scan.nextFloat();
        System.out.print("Input the cost per minute of the third call: ");
        float c3 = scan.nextFloat();
        System.out.print("Input the duration of the third call: ");
        float t3 = scan.nextFloat();
        double sum;
        sum = c1 * t1 + c2 * t2 + c3 * t3;
        System.out.println("Total cost is " + sum);

    }
}


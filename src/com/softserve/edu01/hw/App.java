package com.softserve.edu01.hw;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        System.out.println("End of first task");
        task2();
        System.out.println("End of second task");
        task3();
        System.out.println("End of third task");
    }

    public static void task1() {
        System.out.println("Enter radius of circle");
        try {
            double radius = sc.nextDouble();
            System.out.println("Perimeter: " + (2 * 3.14 * radius) + "\n" +
                    "Area: " + (3.14 * (Math.pow(radius, 2))));
            // Added InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("You enter non-double value");
        }
    }

    public static void task2() {
        System.out.println("What your name?");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Where do you live, " + name + " ?");
        String address = sc.nextLine();
        System.out.println("Your name is " + name + " and you live in " + address);
    }

    public static void task3() {
        System.out.println("Enter cost per minute of first call");
        try {
            double c1 = sc.nextDouble();
            System.out.println("Enter duration of first call(in second)");
            int t1 = sc.nextInt();
            System.out.println("Enter cost per minute of second call");
            double c2 = sc.nextDouble();
            System.out.println("Enter duration of second call(in second)");
            int t2 = sc.nextInt();
            System.out.println("Enter cost per minute of third call");
            double c3 = sc.nextDouble();
            System.out.println("Enter duration of third call(in second)");
            int t3 = sc.nextInt();
            double total = (double)(c1 * t1) + (c2 * t2) + (c3 * t3);
            System.out.println("The cost of first call is - " + (c1 * t1) + "\n" +
                    "The cost of second call is - " + (c2 * t2) + "\n" +
                    "The cost pf third call is - " + (c3 * t3) + "\n" +
                    "Total cost of three calls is - " + total);
            // Added InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("You enter non-integer/double value");
        }
    }
}


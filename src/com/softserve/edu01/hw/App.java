package com.softserve.edu01.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Specify the radius of the circle: ");
            double radius = in.nextDouble();

            double perimeter = 2 * Math.PI * radius;
            double square = Math.PI * Math.pow(radius, 2);

            System.out.println("The perimeter of the circle is equal: " + perimeter);
            System.out.println("The square of the circle is equal: " + square);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Radius should by a number!");
        }
    }

    public static void task2() {
        String name;
        String address;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = in.nextLine();
        System.out.println("Your name is " + name + ", your address is " + address);
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Specify the cost per minute of the first call: ");
        double costPerMin1 = in.nextDouble();
        System.out.println("Specify the duration of the first call in minutes: ");
        double duration1 = in.nextDouble();
        System.out.println("Specify the cost per minute of the second call: ");
        double costPerMin2 = in.nextDouble();
        System.out.println("Specify the duration of the second call in minutes: ");
        double duration2 = in.nextDouble();
        System.out.println("Specify the cost per minute of the third call in minutes: ");
        double costPerMin3 = in.nextDouble();
        System.out.println("Specify the duration of the third call: ");
        double duration3 = in.nextDouble();
        double cost1 = costPerMin1 * duration1;
        double cost2 = costPerMin2 * duration2;
        double cost3 = costPerMin3 * duration3;
        System.out.println("The cost of the first call is equal: " + cost1);
        System.out.println("The cost of the second call is equal: " + cost2);
        System.out.println("The cost of the third call is equal: " + cost3);
        System.out.println("The total cost is equal: " + (cost1 + cost2 + cost3));
    }
}


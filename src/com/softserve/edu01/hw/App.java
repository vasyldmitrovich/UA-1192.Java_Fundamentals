package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        circle();
        conversation();
        phoneCalls();
    }

    public static void circle() {
        System.out.println("Type radius");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double perimetr = 2 * Math.PI * radius;
        System.out.println("area is: " + area + "\nperimetr is: " + perimetr);
    }

    public static void conversation() {
        scanner.nextLine();
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live " + name + "?");
        String address = scanner.nextLine();
        System.out.println("Now I know where you live " + name + " you live in " + address);
    }

    public static void phoneCalls() {
        double total = 0;
        double[] c = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input "+(i+1)+" call cost per minute");
            c[i] = scanner.nextDouble();
        }
        double[] t = new double[3];
        for (int k = 0; k < 3; k++) {
            System.out.println("Input "+(k+1)+" calls duration");
            t[k] = scanner.nextDouble();
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Cost of " + (j + 1) + " call is " + c[j] * t[j]);
            total = total + c[j] * t[j];
        }
        System.out.println("Total cost is " + total);
    }

}


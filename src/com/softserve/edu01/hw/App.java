package com.softserve.edu01.hw;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            doFlowerTask();
            doNameAddressTask();
            doPhoneCallTask();
        } catch (IOException ignored) {}
    }

    public static void doFlowerTask() throws IOException {
        System.out.println("--- Flower bed task ---");
        System.out.print("Input flower bed radius in meters: ");
        double radiusInMeters = sc.nextDouble();
        double perimeter = 2 * Math.PI * radiusInMeters;
        //double area = Math.PI * radiusInMeters * radiusInMeters;
        double area = Math.PI * Math.pow(radiusInMeters, 2);
        System.out.println("Flower bed perimeter: " + perimeter + " m");
        System.out.println("Flower bed area: " + area + " m2");
    }

    public static void doNameAddressTask() throws IOException {
        System.out.println("\n--- Name & Address task ---");
        String name;
        String address;
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Where do you live, " + name + '?');
        address = sc.nextLine();
        System.out.println("Nice to meet you, " + name + ". I live in " + address + " too.");
    }

    public static void doPhoneCallTask() throws IOException {
        System.out.println("\n--- Phone calls task ---");
        System.out.print("Input first call's cost per minute: ");
        double c1 = sc.nextDouble();
        System.out.print("Input second call's cost per minute: ");
        double c2 = sc.nextDouble();
        System.out.print("Input third call's cost per minute: ");
        double c3 = sc.nextDouble();

        System.out.print("Input first call's duration in seconds: ");
        int t1 = sc.nextInt();
        System.out.print("Input second call's duration in seconds: ");
        int t2 = sc.nextInt();
        System.out.print("Input third call's duration in seconds: ");
        int t3 = sc.nextInt();

        double firstCallCost = (t1 / 60) * c1; //cost for full minutes
        firstCallCost += (t1 % 60) * c1 / 60;   //add cost for seconds that remain
        double secondCallCost = (t2 / 60) * c2;
        secondCallCost += (t2 % 60) * c2 / 60;
        double thirdCallCost = (t3 / 60) * c3;
        thirdCallCost += (t3 % 60) * c3 / 60;

        System.out.println("First call cost: " + firstCallCost);
        System.out.println("Second call cost: " + secondCallCost);
        System.out.println("Third call cost: " + thirdCallCost);
        System.out.println("Total cost: " + (firstCallCost + secondCallCost + thirdCallCost));
    }
}


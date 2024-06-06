package com.softserve.edu12.ptask;

import java.util.Scanner;

public class AppPt {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        while (true) {
            try {
                System.out.println("Enter side a: ");
                int a = Integer.parseInt(scan.nextLine());

                System.out.println("Enter side b: ");
                int b = Integer.parseInt(scan.nextLine());

                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is " + area);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException(
                    "The sides should not negative"
            );
        }
        return a * b;
    }

    public static void task2() {
        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }
}

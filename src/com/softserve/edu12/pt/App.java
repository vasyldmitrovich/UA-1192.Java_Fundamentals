package com.softserve.edu12.pt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ColorException, TypeException {
        task1();
        task2();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int a = readInt("Enter side a: ");
                int b = readInt("Enter side b: ");

                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is: " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void task2() throws ColorException, TypeException {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }

    private static int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException(
                    "The sides should not be negative"
            );
        }
        return a * b;
    }
}

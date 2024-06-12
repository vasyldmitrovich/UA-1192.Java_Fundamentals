package com.softserve.edu12.pt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ColorException {

        task1();
        task2();
    }

    final static Scanner scanner = new Scanner(System.in);

    public static void task1() {
        while (true)
            try {
                int a = readInt("Enter side a:");
                int b = readInt("Enter side b:");
                int area = squareRectangle(a, b);

                System.out.println("The rectangle area is: " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
    }

    private static int squareRectangle(int a, int b) throws IllegalAccessException {
        if (a < 0 || b < 0) {
            throw new IllegalAccessException("The sides shouldn't be < 0");
        } else {
            return a * b;
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("It should be a number");
            }
        }
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


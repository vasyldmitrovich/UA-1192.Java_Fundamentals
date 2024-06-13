package com.softserve.edu12.pt;

import java.util.Arrays;
import java.util.Scanner;

public class AppPt {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// Cool
        System.out.println("-".repeat(20) + "First practical task" + "-".repeat(20));
        pt1();
        System.out.println("-".repeat(20) + "Second practical task" + "-".repeat(20));
        pt2();
    }

    public static void pt1() {
        while (true) {
            try {
                int a = readInt("Enter side a");
                int b = readInt("Enter side b");
                int area = squareRectangle(a, b);
                System.out.println("The rectangle area is:" + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException("The sides shouldn't be < 0");
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

    private static void pt2() {
        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = readFromConsole();
            System.out.println("__________________________");
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }

    private static Plant readFromConsole() {
        while (true) {
            try {
                System.out.println("Enter the plant parameters.");
                System.out.print("Enter the size:");
                int size = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the color:");
                String color = scanner.nextLine();

                System.out.print("Enter the type:");
                String type = scanner.nextLine();
                return new Plant(size, color, type);

            } catch (NumberFormatException e) {
                System.err.println("You must enter int!");
            } catch (SizeException | ColorException | TypeException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
    }

}

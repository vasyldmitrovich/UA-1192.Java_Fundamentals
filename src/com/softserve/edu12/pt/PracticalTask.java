package com.softserve.edu12.pt;

import com.softserve.edu12.pt.Plant.Plant;

import java.util.Scanner;

public class PracticalTask {
    public static final Scanner SCANNER = new Scanner(System.in);

    public void task1() {

        while (true) {
            try {
                int a = getPrompt("Enter side \"a\"");
                int b = getPrompt("Enter side \"b\"");
                int square = squareRectangle(a, b);
                System.out.println("Square of rectangle is: " + square);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void task2() {
        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }

    private static int squareRectangle(int a, int b) {

        if (a < 0 | b < 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        return a * b;
    }

    private int getPrompt(String prompt) {

        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Side must be a number");
            }
        }
    }
}

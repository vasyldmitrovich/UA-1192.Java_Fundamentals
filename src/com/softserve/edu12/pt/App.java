package com.softserve.edu12.pt;

import com.softserve.edu12.pt.plant.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static final Scanner SC = new Scanner(System.in);
    private static final Random RAND = new Random(System.currentTimeMillis());

    private static final String[] COLOR_INPUTS = {"Green", "red", "violet", "Yellow", "some"};
    private static final String[] TYPE_INPUTS = {"Tree", "some", "grass", "flower", "follower"};

    public static void main(String[] args) {// Ok
        System.out.println("Task 1");
        demonstrateSquareTask();
        System.out.println();

        System.out.println("Task 2");
        demonstratePlantTask();
    }

    private static void demonstrateSquareTask() {
        int a = 0;
        int b = 0;
        boolean loopAlive = true;

        while (loopAlive) {
            try {
                System.out.print("Input a side: ");
                a = Integer.parseInt(SC.nextLine());
                loopAlive = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer value. Try again.");
            }
        }

        loopAlive = true;
        while (loopAlive) {
            try {
                System.out.print("Input b side: ");
                b = Integer.parseInt(SC.nextLine());
                loopAlive = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer value. Try again.");
            }
        }

        try {
            int square = squareRectangle(a, b);
            System.out.println("Square is " + square);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid params for square calculation.");
        }
    }

    private static void demonstratePlantTask() {
        int count = 10;

        List<Plant> plants = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            try {
                plants.add(generatePlant());
            } catch (Exception e) {
                System.out.println(i + ": " + e.getMessage());
            }
        }

        System.out.println("Initial plants count: " + count);
        System.out.println("Generated without errors: " + plants.size());

        for (Plant plant : plants) {
            System.out.println(plant.toString());
        }
    }

    private static Plant generatePlant() {
        int size = RAND.nextInt(100);
        String colorString = COLOR_INPUTS[RAND.nextInt(COLOR_INPUTS.length)];
        String typeString = TYPE_INPUTS[RAND.nextInt(TYPE_INPUTS.length)];
        return new Plant(size, colorString, typeString);
    }

    private static int squareRectangle(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Impossible case: Negative or zero square in result");
        }

        return a * b;
    }
}

package com.softserve.edu12.pt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        System.out.println("Demonstrate task 1");
//        task1();

        System.out.println("Demonstrate task 2");
        task2();
    }

    public static void task1() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Input first side length");
            int a = sc.nextInt();

            System.out.println("Input second side length");
            int b = sc.nextInt();

            int area = squareRectangle(a, b);

            System.out.println("The area of rectangle is " + area);

        } catch (InputMismatchException exception) {

            System.out.println("Value should be an integer");

        } catch (NegativeSideDimensionException exception) {

            System.out.println(exception.getMessage());

        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println("Something went wrong" + (message == null ? "" : ": " + message));
        }
    }

    public static void task2() {
        try {
            Plant[] plants = new Plant[5];
            plants[0] = createPlant(10, "GREEN", "FLOWER");
            plants[1] = createPlant(15, "RED", "TREE");
            plants[2] = createPlant(20, "BLUE", "SHRUB");
            plants[3] = createPlant(5, "YELLOW", "HERB");
            plants[4] = createPlant(25, "BROWN", "TREE");

            for (Plant plant : plants) {
                System.out.println(plant);
            }
        } catch (ColorException | TypeException | SizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Plant createPlant(int size, String colorStr, String typeStr) throws ColorException, TypeException, SizeException {
        Color color;
        Type type;

        try {
            color = Color.valueOf(colorStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(colorStr);
        }

        try {
            type = Type.valueOf(typeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException(typeStr);
        }

        return new Plant(size, color, type);
    }

    public static int squareRectangle(int a, int b) {

        if (a < 0 || b < 0) {
            throw new NegativeSideDimensionException();
        }

        return a * b;
    }
}

package com.softserve.edu12.pt;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTasks {
    private final Scanner SCANNER = new Scanner(System.in);
    public final String GAP = "-".repeat(40);
    public final String NL = "\n";

    public int squareRectangle(int side1, int side2) {
        return side1 * side2;
    }

    public int getSize(String promt) {
        while (true) {
            try {
                System.out.println(promt);
                int side = Integer.parseInt(SCANNER.nextLine());
                if (side < 0) {
                    throw new IllegalArgumentException(
                            "Value can't be negative"
                    );
                }
                return side;
            } catch (NumberFormatException e2) {
                System.out.println("You have to input a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\nTry again");
            }
        }
    }

    public void runPractical1() {
        int side1 = getSize("Enter the size of first side: ");
        int side2 = getSize("Enter the size of second side: ");
        int area = squareRectangle(side1, side2);
        System.out.printf("The area of rectangle is with sides %d and %d is: %d",
                side1, side2, area);
    }

    public void runPractical2() {
        Plant[] plants = plantToArray();
        for (var plant : plants) {
            System.out.println(plant);
        }
    }

    public Plant[] plantToArray() {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = plantCreate();
        }
        return plants;
    }

    public Type typeInput(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String type = SCANNER.nextLine();
                return typeStrToEnum(type);
            } catch (TypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Color colorInput(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String color = SCANNER.nextLine();
                return colorStrToEnum(color);
            } catch (ColorException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int sizeInput(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                int size = Integer.parseInt(SCANNER.nextLine());
                if (size < 5 | size > 20){
                    throw new IllegalArgumentException("Illegal size\nSize must be from 5 to 20");
                }else return size;
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public Plant plantCreate() {
        System.out.println("Enter parameters of new plant.");
        Type type = typeInput("Enter a type of plant:");
        Color color = colorInput("Enter a color of plant:");
        int size = sizeInput("Enter a size of plant:");
        return new Plant(type, color, size);
    }

    public Color colorStrToEnum(String strColor) throws ColorException {
        for (var color : Color.values()) {
            if (strColor.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Available colors :" + Arrays.toString(Color.values()));
    }

    public Type typeStrToEnum(String strType) throws TypeException {
        for (var type : Type.values()) {
            if (strType.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Available types :" + Arrays.toString(Type.values()));
    }
}

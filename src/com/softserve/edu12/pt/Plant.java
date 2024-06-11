package com.softserve.edu12.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException {
        Color color = colorStrToEnum(colorStr);
        Type type = typeStrToEnum(typeStr);
        this.size = size;
        this.type = type;
        this.color = color;
    }

    static Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input a type from the list of available: " +
                Arrays.toString(Type.values()));
    }

    static Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input a color from the list of available: " +
                Arrays.toString(Color.values()));

    }

    @Override
    public String toString() {
        return "This is a plant of type %s of color %s of size %d".formatted(
                type.toString().toLowerCase(), color.toString().toLowerCase(), size);
    }

    static Plant readFromConsole() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the plant with parameters: ");
                System.out.println("Enter type: ");
                String typeStr = sc.nextLine();
                System.out.println("Enter color: ");
                String colorStr = sc.nextLine();
                System.out.println("Enter the size: ");
                int size = Integer.parseInt(sc.nextLine());
                return new Plant(typeStr, colorStr, size);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }
        }
    }
}

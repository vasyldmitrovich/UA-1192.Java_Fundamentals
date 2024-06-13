package com.softserve.edu12.ptask;

import java.util.Arrays;
import java.util.Scanner;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException {
        this.type = typeStrToEnum(typeStr);
        this.color = colorStrToEnum(colorStr);
        this.size = size;
    }

    static Type typeStrToEnum(String typeStr) throws TypeException {// This is nice
        for (Type type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input only type from the list: " + Arrays.toString(Type.values()));
    }

    static Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input only color from the list: " + Arrays.toString(Color.values()));
    }

    @Override
    public String toString() {
        return "This is a plant of type of %s of color %s of size %d"
                .formatted(type.toString().toLowerCase(), color.toString().toLowerCase(), size);
    }

    static Plant readFromConsole() {// Interesting method, it is good
        var scan = new Scanner(System.in);
        while (true)
            try {
                System.out.println("Enter the plant parameters.");
                System.out.println("Enter type: ");
                String typeStr = scan.nextLine();
                System.out.println("Enter color: ");
                String colorStr = scan.nextLine();
                System.out.println("Enter size: ");
                int size = Integer.parseInt(scan.nextLine());
                return new Plant(typeStr, colorStr, size);
            } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
            System.out.println("Size should be a number");
        }
    }

    static void verifySize(int size) throws SizeException {
        if (size < 1 || size > 100) {
            throw new SizeException("Size should be between 1 and 100");
        }
    }
}

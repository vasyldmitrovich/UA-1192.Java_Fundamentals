package com.softserve.edu12_excep.pt.pt2;

import java.util.Arrays;

public class Plant {
    // Enumerations
    public enum Color {
        RED, GREEN, BLUE, YELLOW, ORANGE;
    }

    public enum Type {
        FLOWER, TREE, SHRUB, VINE, GRASS;
    }

    private int size;
    private Color color;
    private Type type;

    // Constructor
    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        setSize(size);
        setColor(color);
        setType(type);
    }

    // Setters with validation
    public void setSize(int size) throws IllegalArgumentException {
        if (size <= 0 || size > 100) {
            throw new IllegalArgumentException("Invalid size: Size must be between 1 and 100.");
        }
        this.size = size;
    }

    public void setColor(Color color) throws ColorException {
        if (!isValidColor(color)) {
            throw new ColorException("Invalid color: " + color);
        }
        this.color = color;
    }

    public void setType(Type type) throws TypeException {
        if (!isValidType(type)) {
            throw new TypeException("Invalid type: " + type);
        }
        this.type = type;
    }

    // Method to verify if size is correct
    public boolean isSizeCorrect() {
        return size >= 10 && size <= 50;
    }

    // Method to verify if color and type are both valid
    public boolean areColorAndTypeValid() {
        return isValidColor(color) && isValidType(type);
    }

    // Helper methods to validate color and type
    private boolean isValidColor(Color color) {
        return Arrays.asList(Color.values()).contains(color);
    }

    private boolean isValidType(Type type) {
        return Arrays.asList(Type.values()).contains(type);
    }

    // Override toString() method for string representation of Plant object
    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    // Main method to test the Plant class
    public static void main(String[] args) {
        try {
            // Create an array of five plants
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(30, Color.RED, Type.FLOWER);
            plants[1] = new Plant(20, Color.GREEN, Type.TREE);
            plants[2] = new Plant(40, Color.BLUE, Type.SHRUB);
            plants[3] = new Plant(15, Color.YELLOW, Type.VINE);
            plants[4] = new Plant(25, Color.ORANGE, Type.GRASS);

            // Print plant details
            for (Plant plant : plants) {
                System.out.println(plant);
                System.out.println("Is size correct? " + plant.isSizeCorrect());
                System.out.println("Are color and type valid? " + plant.areColorAndTypeValid());
                System.out.println();
            }

        } catch (ColorException | TypeException | IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    // Exception classes for Color and Type
    public static class ColorException extends Exception {
        public ColorException(String message) {
            super(message);
        }
    }

    public static class TypeException extends Exception {
        public TypeException(String message) {
            super(message);
        }
    }
}





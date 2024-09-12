package com.softserve.edu12.pt12.pt2;

enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE;
}

enum Type {
    FLOWER, TREE, SHRUB, VINE, GRASS;
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        verifySize(size);
        verifyColorAndType(color, type);
        this.size = size;
        this.color = color;
        this.type = type;
    }

    private void verifySize(int size) throws IllegalArgumentException {
        if (size <= 0 || size > 1000) {
            throw new IllegalArgumentException("Size must be between 1 and 1000.");
        }
    }

    private void verifyColorAndType(Color color, Type type) throws ColorException, TypeException {
        if (color == null) {
            throw new ColorException("Invalid color provided.");
        }
        if (type == null) {
            throw new TypeException("Invalid type provided.");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

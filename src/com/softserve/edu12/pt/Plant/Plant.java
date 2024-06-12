package com.softserve.edu12.pt.Plant;

public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant () {
        this.size = 10;
        this.color = Color.GREEN;
        this.type = Type.CACTUS;
    }

    public Plant (int size, String color, String type) {
        this.size = checkSize(size);
        checkColorAndType(color, type);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = checkSize(size);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException();
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(String type) {
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException();
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color.toString() +
                ", type=" + type.toString() +
                '}';
    }

    private int checkSize (int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size of your plant is too small");
        } else if (size > 20) {
            throw new IllegalArgumentException("Size of your plant is too big");
        } else {
            return size;
        }
    }

    private void checkColorAndType (String color, String type) {

        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException();
        }

        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException();
        }
    }
}

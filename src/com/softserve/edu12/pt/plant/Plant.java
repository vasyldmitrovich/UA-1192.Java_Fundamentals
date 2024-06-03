package com.softserve.edu12.pt.plant;

public class Plant {

    private static final int MIN_SIZE = 15;
    private static final int MAX_SIZE = 80;

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {// Your constructor could throw exception, but i do not see that
        checkNullable(color);
        checkNullable(type);
        checkSize(size);

        this.size = size;
        this.color = color;
        this.type = type;
    }

    public Plant(int size, String color, String type) {
        checkNullable(color);
        checkNullable(type);
        checkSize(size);

        this.size = size;
        this.color = Color.of(color);
        this.type = Type.of(type);
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = Color.of(color);
    }

    public void setType(String type) {
        this.type = Type.of(type);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size + "cm" +
                ", color=" + color.toString() +
                ", type=" + type.toString() +
                '}';
    }

    private void checkSize(int size) {
        if (size < MIN_SIZE) {
            throw new IllegalArgumentException("Plant is too small: " + size +
                    " cm. It must be at least " + MIN_SIZE + " cm");
        }
        if (size > MAX_SIZE) {
            throw new IllegalArgumentException("Plant is too large: " + size +
                    " cm. Maximum available value is " + MAX_SIZE + " cm");
        }
    }

    private void checkNullable(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Color or type of plant is null");
        }
    }
}

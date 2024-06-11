package com.softserve.edu12.pt;

import java.util.Arrays;

public class Plant {
    private int size;
    private Color color;
    private Type type;


    public Plant(int size, String colorStr, String typeStr) throws ColorException, TypeException, SizeException {
        if (size < 0 | size > 1000) {
            throw new SizeException("Size must be > 0 and < 1000");
        } else {
            this.size = size;
        }
        Color color = colorStrToEnum(colorStr);
        Type type = typeStrToEnum(typeStr);
        this.color = color;
        this.type = type;


    }

    private Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Available a color from the list" + Arrays.toString(Color.values()));

    }

    private Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Available type from the list" + Arrays.toString(Type.values()));
    }

    @Override
    public String toString() {
        return "This is a plant of type %s of color %s of size %d"
                .formatted(
                        type.toString().toLowerCase(),
                        color.toString().toLowerCase(),
                        size);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

package com.softserve.edu12.pt;

enum Color {
    RED, BLUE, YELLOW, GREEN
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

enum Type {
    FLOWER, TREE, SHRUB
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        setSize(size);
        setColor(color);
        setType(type);
    }

    public void setSize(int size) {
        if (size < 1 || size > 10) {
            throw new IllegalArgumentException("size should be from 1 to 10.");
        }
        this.size = size;
    }

    public void setColor(Color color) throws ColorException {
        for (Color c : Color.values()) {
            if (c == color) {
                this.color = color;
                return;
            }
        }
        throw new ColorException("wrong color of plant: " + color);
    }

    public void setType(Type type) throws TypeException {// Interesting
        for (Type t : Type.values()) {
            if (t == type) {
                this.type = type;
                return;
            }
        }
        throw new TypeException("wrong type of plant: " + type);
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

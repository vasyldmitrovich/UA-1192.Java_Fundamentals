package com.softserve.edu12.pt.pt2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public void validateSize() throws SizeException {
        if (size < 1 || size > 10) {
            throw new SizeException("Size should be between 1 and 10.");
        }
    }

    public void validateColorAndType() throws ColorException, TypeException {
        if (!isValidColor(color)) {
            throw new ColorException("Invalid color: " + color);
        }
        if (!isValidType(type)) {
            throw new TypeException("Invalid type: " + type);
        }
    }

    private boolean isValidColor(Color color) {
        for (Color c : Color.values()) {
            if (c.equals(color)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidType(Type type) {
        for (Type t : Type.values()) {
            if (t.equals(type)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plant:" + "size: " + size + ", color: " + color + ", type: " + type;
    }
}

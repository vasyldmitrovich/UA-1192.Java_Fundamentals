package com.softserve.edu12.pt;

public class Plant {

    private int size;

    private Color color;

    private Type type;

    public Plant() {
        this.size = 1;
        this.color = Color.GREEN;
        this.type = Type.FLOWER;
    }

    public Plant(int size, Color color, Type type) throws SizeException, ColorException, TypeException {
        this.verifyColorAndTypeAndSize(color, type, size);
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws SizeException {
        validateSize(size);
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws ColorException {
        validateColor(color);
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) throws TypeException {
        validateType(type);
        this.type = type;
    }

    private void validateSize(int size) throws SizeException {
        if (size < 1 || size > 100) {
            throw new SizeException("Size must be between 1 and 100. Given size: " + size);
        }
    }

    private void validateColor(Color color) throws ColorException {
        if (color == null) {
            throw new ColorException("null");
        }
    }

    private void validateType(Type type) throws TypeException {
        if (type == null) {
            throw new TypeException("null");
        }
    }

    private void verifyColorAndType(Color color, Type type) throws ColorException, TypeException {
        this.validateColor(color);
        this.validateType(type);
    }

    private void verifyColorAndTypeAndSize(Color color, Type type, int size) throws ColorException, TypeException, SizeException {
        this.validateColor(color);
        this.validateType(type);
        this.validateSize(size);
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

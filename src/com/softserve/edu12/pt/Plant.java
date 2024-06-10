package com.softserve.edu12.pt;


public class Plant {

    private int size;
    Color color;
    Type type;

    public Plant() {
    }

    public Plant(int size, String color, String type) throws TypeException, ColorException, SizeException {
        this.size = setSize(size);
        this.color = setColor(color);
        this.type = setType(type);
    }

    private int setSize(int size) throws SizeException{

        if(size>1000) throw new SizeException("The size is too high");
        if(size<5) throw new SizeException("The size is too small");
        return size;
    }

    private Color setColor(String color) throws ColorException {
        Color[] colors = Color.values();

        for (Color value : colors) {
            if (value.getValue().equalsIgnoreCase(color))
                return value;
        }

        throw new ColorException("Wrong plant's color set");
    }

    private Type setType(String type) throws TypeException {
        Type[] types = Type.values();

        for (Type value : types) {
            if (value.getType().equalsIgnoreCase(type))
                return value;
        }

        throw new TypeException("Wrong plant's type set");

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

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

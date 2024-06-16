package com.softserve.edu12.pt;

public class Plant extends PracticalTasks {
    private Type type;
    private Color color;
    private int size;

    public Plant(Type type, Color color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return GAP + NL + "\t\t\t\tPlant" + NL +
                "Type: " + type + NL +
                "Color: " + color + NL +
                "Size: " + size + NL + GAP;
    }
}

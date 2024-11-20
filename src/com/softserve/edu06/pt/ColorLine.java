package com.softserve.edu06.pt;

public class ColorLine extends Line {

    private String color;

    public ColorLine() {
        super();
        this.color = "null";
    }

    public ColorLine(String color) {
        super();
        this.color = color;
    }

    public ColorLine(Point first, Point second) {
        super(first, second);
        this.color = "null";
    }

    public ColorLine(Point first, Point second, String color) {
        super(first, second);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "first=" + getFirst() +
                ", second=" + getSecond() +
                ", color=" + color +
                '}';
    }
}


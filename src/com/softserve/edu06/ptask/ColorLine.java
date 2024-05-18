package com.softserve.edu06.ptask;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorLine: " + " color = " + color;
    }

    public void print() {
        System.out.println(toString());
    }
}


package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " with color " + color;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}

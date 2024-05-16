package com.softserve.edu06.pt;

public class ColorLine extends Line{
    String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }
    public void print() {
        System.out.println(toString());
    }// The same use this
    @Override
    public String toString() {
        return "Color line starts at " + getStart() + ", ends at " + getEnd()
                + " and have color " + color;
    }
}

package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    public String toString() {
        return super.toString() + " Color: " + color;
    }

    public void print() {
        System.out.println(toString());
    }
}
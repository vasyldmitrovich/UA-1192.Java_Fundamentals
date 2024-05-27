package com.softserve.edu06_oop1.pt.pt3;


public class ColorLine extends Line {
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorLine{" + "start=" + getStart() + ", end=" + getEnd() + ", color='" + color + '\'' + '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}

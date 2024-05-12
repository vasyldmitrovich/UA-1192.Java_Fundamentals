package com.softserve.edu06.pt;

public class ColorLine extends Line {

    private String color;

    public ColorLine() {
        super();
        this.color = "black";
    }

    public ColorLine(String color) {
        super();
        this.color = color;
    }

    public ColorLine(Point start, Point end) {
        super(start, end);
        this.color = "black";
    }

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
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
                "start=" + getStart() +
                ", end=" + getEnd() +
                ", color=" + color +
                '}';
    }
}

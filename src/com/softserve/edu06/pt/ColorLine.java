package com.softserve.edu06.pt;

public class ColorLine extends Line {// Ok

    private String color;

    public ColorLine(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public ColorLine(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        this.color = "black";
    }

    public ColorLine(Point start, Point end) {
        super(start, end);
        this.color = "black";
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
                "\n\tstart=" + start +
                ", \n\tend=" + end +
                ", \n\tcolor='" + color + '\'' +
                "\n}";
    }
}

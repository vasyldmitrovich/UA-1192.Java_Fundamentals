package com.softserve.edu06.pt.geometry;

public class ColourLine extends Line {

    private String colour;// The same

    public ColourLine(Point point1, Point point2, String colour) {
        super(point1, point2);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Line from " + getPoint1() + " to " + getPoint2() + " have a colour " + colour;
    }
}





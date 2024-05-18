package com.softserve.edu06.pt.geometry;

public class ColourLine extends Line {

    private final String COLOUR;

    public ColourLine(Point point1, Point point2, String colour) {
        super(point1, point2);
        this.COLOUR = colour;
    }

    @Override
    public String toString() {
        return "Line from " + getPOINT1() + " to " + getPOINT2() + " have a colour " + COLOUR;
    }
}





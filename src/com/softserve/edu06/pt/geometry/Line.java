package com.softserve.edu06.pt.geometry;

public class Line {
    private final Point POINT1;// Why final
    private final Point POINT2;

    public Line(Point point1, Point point2) {
        this.POINT1 = point1;
        this.POINT2 = point2;
    }

    public Point getPOINT1() {
        return POINT1;
    }

    public Point getPOINT2() {
        return POINT2;
    }

    // Add getters

    @Override
    public String toString() {
        return "Line from " + POINT1 + " to " + POINT2;
    }

}

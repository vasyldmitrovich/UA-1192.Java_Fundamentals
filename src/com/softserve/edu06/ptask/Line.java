package com.softserve.edu06.ptask;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    @Override
    public String toString() {
        return "Line: " + "point 1 = " + point1 +
                ", point 2 = " + point2;
    }

    public void print() {
        System.out.println(toString());
    }
}

package com.softserve.edu06.pt.geometry;

public class Point {
    private final int X, Y;

    public Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    @Override
    public String toString() {
        return "Point (" + X + ", " + Y + ")";
    }

}

package com.softserve.edu06.ptask;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point: " + "x = " + x +
                ", y = " + y;
    }

    public void print() {
        System.out.println(toString());
    }
}

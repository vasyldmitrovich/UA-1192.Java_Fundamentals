package com.softserve.academy.edu06.pt;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void Pint() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return Point.class.getName() + "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

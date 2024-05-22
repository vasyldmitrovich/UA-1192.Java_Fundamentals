package com.softserve.edu06.pt.practicaltask2;

public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 12;
    }

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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print() {
        System.out.println("Your x = " + this.x + "\n" + "Your y = " + this.y);
    }
}

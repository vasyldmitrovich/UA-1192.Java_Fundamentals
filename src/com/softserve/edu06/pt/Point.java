package com.softserve.edu06.pt;

public class Point {

    //can be double
    private int x;
    private int y;

//is it good practice to use one constructor inside another like this or bad??????
//    public Point(int x) {
//        new Point(x, 0);
//    }

    public Point() {
        this.x = 0;
        this.y = 0;
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

    public void print() {
        System.out.print("Out: " + this);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

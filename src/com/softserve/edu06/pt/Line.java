package com.softserve.edu06.pt;

public class Line {

    private Point first;
    private Point second;

    public Line() {
        first = new Point();
        second = new Point();
    }

    public Line(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    public Point getFirst() {
        return first;
    }

    public void setFirst(Point first) {
        this.first = first;
    }

    public Point getSecond() {
        return second;
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

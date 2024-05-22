package com.softserve.edu06.pt.entity.t3;

public class Line {
    Point a1;// Make private
    Point a2;

    public Line() {
    }

    public Line(Point a1, Point a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public void print(){
        System.out.println("Print Line");
    }

    public Point getA1() {
        return a1;
    }

    public void setA1(Point a1) {
        this.a1 = a1;
    }

    public Point getA2() {
        return a2;
    }

    public void setA2(Point a2) {
        this.a2 = a2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                '}';
    }
}

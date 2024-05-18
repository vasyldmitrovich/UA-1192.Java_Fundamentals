package com.softserve.edu06_oop1.pt02;

public class Line {
    private Point point1;
    private Point point2;


    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line() {
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void print() {
        System.out.println("Info about Line\n" +
                "Point 1 = (x:" + point1.getX() + ";y:" + point1.getY() + ")\n" +
                "Point 2 = (x:" + point2.getX() + ";y:" + point2.getY() + ")\n");
    }


}

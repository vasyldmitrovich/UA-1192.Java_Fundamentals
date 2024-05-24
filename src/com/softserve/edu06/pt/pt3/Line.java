package com.softserve.edu06.pt.pt3;

public class Line {
    Point firstPoint;
    Point secondPoint;

    public Line(){}
    public Line(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public String print(){
        return toString();
    }

    @Override
    public String toString() {
        return "-".repeat(40) + "\n" + "Line: \n" +
                "First point: " + firstPoint + "\n" +
                "Second point: " + secondPoint + "-".repeat(40) + "\n";
    }
}

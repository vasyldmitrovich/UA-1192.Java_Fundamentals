package com.softserve.edu06.pt.PracticalTask2;

public class Line {

    protected Point firstPoint;
    protected Point secondPoint;

    public Line() {
        this.firstPoint = new Point();
        this.secondPoint = new Point(1, 13);
    }

    public Line (Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }

    public void print() {
        System.out.println("Your first point is " + this.firstPoint.toString() + "\n"
                + "Your second point is " + this.firstPoint.toString());
    }
}

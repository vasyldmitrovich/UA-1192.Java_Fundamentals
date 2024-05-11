package com.softserve.edu06.pt;

public class Line {

    protected Point start;
    protected Point end;

    public Line(int x1, int y1, int x2, int y2) {
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setStart(int x, int y) {
        start = new Point(x, y);
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setEnd(int x, int y) {
        end = new Point(x, y);
    }

    public void print() {
        System.out.println("Out: " + this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "\n\tstart=" + start +
                ", \n\tend=" + end +
                "\n}";
    }
}

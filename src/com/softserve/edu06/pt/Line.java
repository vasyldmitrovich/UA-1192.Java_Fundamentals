package com.softserve.edu06.pt;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }


    public void print() {
        System.out.println(this);
    }// Without using toString() use this

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Line " +
                " starts at " + start +
                ", ends at " + end;
    }
}
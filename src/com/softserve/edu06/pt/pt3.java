package com.softserve.edu06.pt;

public class pt3 {
    public static void main(String[] args) {

        Line[] lines = new Line[4];

        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(3, 3);

        lines[0] = new Line(p1, p2);
        lines[1] = new Line(p3, p4);
        lines[2] = new ColorLine(p1, p3, "Red");
        lines[3] = new ColorLine(p2, p4, "Blue");

        for (Line line : lines) {
            line.print();
        }
    }
}

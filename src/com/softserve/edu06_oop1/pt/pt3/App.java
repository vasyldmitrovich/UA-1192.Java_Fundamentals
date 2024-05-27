package com.softserve.edu06_oop1.pt.pt3;

public class App {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(7, 8);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        ColorLine colorLine1 = new ColorLine(p1, p3, "red");
        ColorLine colorLine2 = new ColorLine(p2, p4, "blue");

        Line[] lines = {line1, line2, colorLine1, colorLine2};

        for (Line line : lines) {
            line.print();
        }
    }
}

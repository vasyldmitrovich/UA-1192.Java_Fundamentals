package com.softserve.edu06.pt;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(1, 1));
        lines[1] = new ColorLine(new Point(0, 0), new Point(2, 2), "Red");
        lines[2] = new ColorLine(new Point(1, 1), new Point(3, 3), "Blue");

        for (Line line : lines) {
            line.print();
        }

    }
}
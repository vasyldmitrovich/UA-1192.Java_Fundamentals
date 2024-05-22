package com.softserve.edu06_oop1.pt02;

public class App {
    public static void main(String... args) {// Nice
        Line[] lines = new Line[4];
        lines[0] = new Line(new Point(0, 0), new Point(1, 1));
        lines[1] = new Line(new Point(1, 1), new Point(2, 2));
        lines[2] = new ColorLine(new Point(0, 2), new Point(1, 3), "Red");
        lines[3] = new ColorLine(new Point(1, 1), new Point(3, 3), "Blue");

        for (Line line : lines) {
            line.print();

        }
    }
}

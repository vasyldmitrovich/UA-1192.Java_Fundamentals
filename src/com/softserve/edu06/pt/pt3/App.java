package com.softserve.edu06.pt.pt3;

public class App {
    public static void main(String[] args) {
        doSecondPT();
    }

    public static void doSecondPT() {
        Line[] lines = {
                new Line(new Point(5, 6), new Point(12, 13)),
                new Line(new Point(9, 10), new Point(14, 16)),
                new ColorLine(new Point(3, 4), new Point(9, 10), "Purple"),
                new ColorLine(new Point(7, 8), new Point(8, 7), "Green")
        };
        for(var i : lines) {
            System.out.println(i.print());
        }
        }
    }


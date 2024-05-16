package com.softserve.edu06.pt;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void print() {
        System.out.println(toString());
    }
}

class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line from " + startPoint + " to " + endPoint;
    }

    public void print() {
        System.out.println(toString());
    }
}

class ColorLine extends Line {
    String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Line from " + startPoint + " to " + endPoint + " with color " + color;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}

public class Main1 {
    public static void main(String[] args) {
        Line[] lines = new Line[3];

        // Додавання об'єктів типу Line і ColorLine до масиву
        lines[0] = new Line(new Point(0, 0), new Point(1, 1));
        lines[1] = new Line(new Point(2, 2), new Point(3, 3));
        lines[2] = new ColorLine(new Point(4, 4), new Point(5, 5), "red");

        // Виклик методу print() для кожного об'єкта в масиві
        for (Line line : lines) {
            line.print();
        }
    }
}

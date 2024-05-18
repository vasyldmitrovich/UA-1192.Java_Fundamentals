package com.softserve.edu06_oop1.pt02;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                "point 1 = x=" + getPoint1().getX() + " y=" + getPoint1().getY() +
                ", point 2 = x=" + getPoint2().getX() + " y=" + getPoint2().getY() +
                '}';
    }

    public void print() {
        System.out.println("Info about Color Line\n" + "Color:" + color +
                "\nPoint 1 = (x:" + getPoint1().getX() + ";y:" + getPoint1().getY() + ")\n" +
                "Point 2 = (x:" + getPoint2().getX() + ";y:" + getPoint2().getY() + ")\n");
    }

}

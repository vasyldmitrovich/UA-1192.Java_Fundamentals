package com.softserve.edu06.pt.practicaltask2;

public class ColorLine extends Line{

    private String color;

    public ColorLine() {
        super(new Point(2, 15), new Point(3, 16));
        this.color = "red";
    }

    public ColorLine (Point firstPoint, Point secondPoint, String color) {
        super(firstPoint, secondPoint);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Your first point is " + this.firstPoint.toString() + "\n"
                + "Your second point is " + this.firstPoint.toString() + "\n"
                + "Your color is " + this.color);
    }
}

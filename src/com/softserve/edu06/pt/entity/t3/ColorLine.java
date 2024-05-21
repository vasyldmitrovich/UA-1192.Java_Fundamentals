package com.softserve.edu06.pt.entity.t3;

public class ColorLine extends Line {
    private String color;


    public ColorLine(Point a1, Point a2, String color) {
        super(a1, a2);
        this.color = color;
    }

    public ColorLine(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Print color Line");
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
                '}';
    }
}

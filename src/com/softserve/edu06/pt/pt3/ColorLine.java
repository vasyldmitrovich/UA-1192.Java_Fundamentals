package com.softserve.edu06.pt.pt3;

public class ColorLine extends Line{
    String color;
    public ColorLine(){}
    public ColorLine(Point firstPoint, Point secondPoint, String color){
        super(firstPoint,secondPoint);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public String print(){
        return toString();
    }

    @Override
    public String toString() {
        return "-".repeat(40) + "\n" + "Color line: \n" +
                "Color: " + getColor() + "\n" +
                "First point: " + firstPoint + "\n" +
                "Second point: " + secondPoint +  "-".repeat(40) + "\n";
    }
}

package com.softserve.edu06.pt;

import java.util.Objects;

public class ColorLine extends Line{
    String color;


    public ColorLine(){}


    public ColorLine(Point start, Point end, String color){
        super(start,end);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String print(){
    return String.format("Printing %s color line from %s to %s", getColor(), getStart().print(), getEnd().print());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColorLine colorLine = (ColorLine) o;
        return color.equals(colorLine.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}

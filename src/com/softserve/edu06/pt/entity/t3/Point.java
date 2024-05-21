package com.softserve.edu06.pt.entity.t3;

public class Point {
    private String x;
    private String y;

    public Point() {
    }

    public Point(String x, String y) {
        this.x = x;
        this.y = y;
    }

   public void print(){
       System.out.println("Print Point");
   }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}
package com.softserve.edu06.pt.pt3;

public class Point {
    private int x;
    private int y;

    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String print(){
        return toString();
    }

    @Override
    public String toString() {
        return "\n" + "x: " + getX()+ "\n" +
                "y: " + getY() + "\n";

    }
}

package com.softserve.edu06.pt;

public class Point {
    private int x,y;
    public Point(){

    }
    public Point(int x,int y){
    this.x=x;
    this.y=y;
    }



    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void print(){
        System.out.println("Info about Point\n" +
                "Point = (x:"+getX()+";y:"+getY()+')');
    }
}

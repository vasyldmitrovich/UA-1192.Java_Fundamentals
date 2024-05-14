package com.softserve.edu06.pt;

public class ColorLine extends Line{
    private String color;
    public ColorLine(){

    }
    public ColorLine(Point point1,Point point2,String color){
        super(point1,point2);
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                "point 1 = x=" + getPoint1().getX() +" y="+getPoint1().getY()+
                ", point 2 = x=" + getPoint2().getX() +" y="+getPoint2().getY()+
                '}';
    }
    public void print(){
        System.out.println("Info about Color Line\n" +"Color:"+color+
                "\nPoint 1 = (x:"+getPoint1().getX()+";y:"+getPoint1().getY()+")\n"+
                "Point 2 = (x:"+getPoint2().getX()+";y:"+getPoint2().getY()+")\n");
    }
}

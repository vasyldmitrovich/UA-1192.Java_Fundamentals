package com.softserve.edu06.pt;

import java.util.Arrays;

public class AppPt {
    public static void main(String[] args) {// Good
        System.out.println("************************First practical task************************");
        firstPt();
        System.out.println("************************Second practical task************************");
        secondPt();


    }

    public static void firstPt(){
        Car [] cars = {
                new Sedan("Audi",320,2016,560),
                new Sedan("Porsche",330,2018,600),
                new Sedan("Volkswagen",280,2017,360),
                new Truck("Skania",150,2004,true),
                new Truck("Volvo",160,2010,false),
                new Truck("Daf",110,2015,true),
        };
        for (int i = 0;i< cars.length;i++){
            cars[i].print();
            System.out.println("_____________________________________________________________");
        }
    }
    public static void secondPt(){
        Line [] lines = {
                new Line(new Point(10,2),new Point(20,2)),
                new Line(new Point(12,5),new Point(12,8)),
                new ColorLine(new Point(22,32),new Point(34,12),"red"),
                new ColorLine(new Point(12,6),new Point(12,10),"blue"),
        };
        for (int i=0;i< lines.length;i++){
            lines[i].print();
        }
    }
}

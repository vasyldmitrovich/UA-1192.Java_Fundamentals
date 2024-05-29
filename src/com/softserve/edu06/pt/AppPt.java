package com.softserve.edu06.pt;

import com.softserve.edu06.pt.pt2.Car;
import com.softserve.edu06.pt.pt2.Sedan;
import com.softserve.edu06.pt.pt2.Truck;
import com.softserve.edu06.pt.pt3.Point;
import com.softserve.edu06.pt.pt3.Line;
import com.softserve.edu06.pt.pt3.ColorLine;


public class AppPt {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Truck("Ford", 120, 2015);
        cars[1] = new Sedan("Toyota", 160, 2018);
        cars[2] = new Truck("Chevrolet", 110, 2012);
        cars[3] = new Sedan("Honda", 150, 2019);

        for (Car car : cars) {
            System.out.println(car);

            car.run();
            car.stop();
        }

        Line[] Lines = new Line[4];
        Lines[0] = new Line(new Point("6", "14"), new Point("33", "98"));
        Lines[1] = new ColorLine(new Point("2", "7"), new Point("10", "8"), "yellow");
        Lines[2] = new Line(new Point("8", "7"), new Point("15", "8"));
        Lines[3] = new ColorLine(new Point("3", "-1"), new Point("18", "8"), "blue");

        for (Line line : Lines) {
            line.print();
        }
    }
}
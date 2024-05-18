package com.softserve.edu06.pt;

import com.softserve.edu06.pt.auto.Car;
import com.softserve.edu06.pt.auto.Sedan;
import com.softserve.edu06.pt.auto.Truck;
import com.softserve.edu06.pt.geometry.ColourLine;
import com.softserve.edu06.pt.geometry.Line;
import com.softserve.edu06.pt.geometry.Point;

public class PracticalTask {

    public void task2() {
        Car[] cars = {
                new Sedan("Renault", 240, 2022),
                new Sedan("Volkswagen", 220, 2020),
                new Truck("Citroen", 180, 2015),
                new Truck("Volvo", 200, 2017)
        };
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void task3() {
        Line[] lines = {
                new Line(new Point(4, 5), new Point(6, 7)),
                new Line(new Point(5, 7), new Point(10, 12)),
                new ColourLine(new Point(0, 1), new Point(2, 6), "black"),
                new ColourLine(new Point(8, 1), new Point(7, 6), "red")
        };
        for (Line line : lines) {
            System.out.println(line);
        }
    }
}

package com.softserve.edu06.pt;

import com.softserve.edu06.pt.entity.t2.Car;
import com.softserve.edu06.pt.entity.t2.Sedan;
import com.softserve.edu06.pt.entity.t2.Truck;
import com.softserve.edu06.pt.entity.t3.ColorLine;
import com.softserve.edu06.pt.entity.t3.Line;
import com.softserve.edu06.pt.entity.t3.Point;

public class AppPractical {
    public static void main(String[] args) {
        //task2
        Car[] cars = new Car[4];
        cars[0] = new Sedan("Kia Forte", 124.6f, "2023");
        cars[1] = new Sedan("Volkswagen Jetta", 2.6f, "2022");
        cars[2] = new Truck("MAN", 2.6f, "2011");
        cars[3] = new Truck("WW", 2.6f, "2014");

        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.stop();
            System.out.println();
        }
        //task3
        Line[] lines = new Line[4];
        lines[0] = new Line(new Point("12", "24"), new Point("33", "98"));
        lines[1] = new ColorLine(new Point("2", "7"), new Point("10", "8"), "red");
        lines[2] = new Line(new Point("8", "7"), new Point("15", "8"));
        lines[3] = new ColorLine(new Point("3", "-1"), new Point("18", "8"), "blue");

        for (Line line : lines) {
            line.print();
        }
    }
}

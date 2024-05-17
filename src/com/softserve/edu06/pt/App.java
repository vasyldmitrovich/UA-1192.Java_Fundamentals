package com.softserve.edu06.pt;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

//        task1();
        task2();
    }


    public static void task1() {
        Car[] arr = {
                new Sedan("Focus", 250, 2022),
                new Truck("Man95", 180, 2005),
                new Sedan("Volt", 160, 2012),
                new Truck("Volvo", 180, 2015)
        };
        for (Car car : arr) {
            System.out.println(car.getModel() + " " + car.getMaxSpeed() + " " + car.getYearOfProduction());
        }
    }

    public static void task2() {

        Line[] arr = {
                new Line(
                        new Point(5, 20),
                        new Point(15, 30)
                ),
                new ColorLine(
                        new Point(18, 35),
                        new Point(40, 25)
                ),
                new ColorLine(
                        new Point(20, 30),
                        new Point(15, 55),
                        "black"
                ),
                new ColorLine("white"),
        };

        for (Line line : arr) {
            line.print();
        }

    }
}

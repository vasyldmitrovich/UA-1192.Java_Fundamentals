package com.softserve.edu06.pt;

public class App {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Car[] cars = {
          new Sedan("Rapid", 160, 2012),
          new Sedan("Jetta", 220, 2019),
          new Truck("Maverick", 200, 2019),
          new Truck("Santa Cruz", 180, 2022),
        };

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void task2() {
        Line[] lines = {
                new Line(),
                new Line(
                        new Point(0, 0),
                        new Point(10, 0)
                ),
                new ColorLine(
                        new Point(0, 0),
                        new Point(10, 5)
                ),
                new ColorLine(
                        new Point(0, 0),
                        new Point(10, 5),
                        "yellow"
                ),
                new ColorLine("red"),
        };

        for (Line line : lines) {
            line.print();
        }
    }
}

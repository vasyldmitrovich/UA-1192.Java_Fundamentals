package com.softserve.edu06.ptask;

import java.io.IOException;
import java.util.Scanner;

public class AppPt {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {// All good
        task2();
        task3();
    }

    public static void task2() {
        Car[] cars = new Car[4];
        cars[0] = new Truck("Ford", 110.0, 2017);
        cars[1] = new Truck("Chevrolet", 115.0, 2021);
        cars[2] = new Sedan("Toyota Camry", 100.0, 2022);
        cars[3] = new Sedan("Volvo", 90.0, 2016);

        for (Car car : cars) {
            System.out.println("The model: " + car.getModel());
            System.out.println("Max speed: " + car.getMaxSpeed() + " km/h");
            System.out.println("Year of production: " + car.getYearOfProduction());
            car.run();
            car.stop();
        }
    }

    public static void task3() {
        Point p1 = new Point(1.0, 3.0);
        Point p2 = new Point(2.0, 5.0);

        Line line1 = new Line(p1, p2);
        ColorLine colorLine1 = new ColorLine(p1, p2, "Black");

        Line[] lines = {line1, colorLine1};

        for (Line line : lines) {
            line.print();
            }
        }
    }



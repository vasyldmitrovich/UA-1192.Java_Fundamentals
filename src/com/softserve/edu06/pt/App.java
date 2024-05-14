package com.softserve.edu06.pt;

public class App {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        task2();
        System.out.println("Task 2: ");
        task3();
    }

    public static void task2() {
        Car[] cars = new Car[5];
        cars[0] = new Sedan("Audi A4", 220, 2020);
        cars[1] = new Sedan("BMW X5", 250, 2018);
        cars[2] = new Sedan("Nissan X-Trail", 210, 2015);
        cars[3] = new Truck("DAF", 120, 2010);
        cars[4] = new Truck("Volvo", 115, 2012);

        showCars(cars);
    }


    public static void task3() {
        Line[] lines = new Line[4];
        lines[0] = new Line(new Point(1, 2), new Point(2, 3));
        lines[1] = new ColorLine(new Point(2, 2), new Point(5, 3), "green");
        lines[2] = new Line(new Point(4, 2), new Point(3, 3));
        lines[3] = new ColorLine(new Point(10,1), new Point(8, 4), "yellow");
        for(Line line : lines) {
            line.print();
            System.out.println("=".repeat(50));
        }
    }

    public static void showCars(Car[] arr) {
        for (Car car : arr) {
            System.out.println(car);
            car.run();
            car.stop();
            System.out.println("=".repeat(50));
        }
    }

}
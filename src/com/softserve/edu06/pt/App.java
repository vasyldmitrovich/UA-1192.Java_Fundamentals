package com.softserve.edu06.pt;

public class App {
    public static void main(String[] args) {
        System.out.println("Start");
        //Task1
        abstract class Car {
            String model;
            int maxSpeed;
            int yearOfProduction;

            public Car(String model, int maxSpeed, int yearOfProduction) {
                this.model = model;
                this.maxSpeed = maxSpeed;
                this.yearOfProduction = yearOfProduction;
            }

            abstract void run();

            abstract void stop();
        }

        class Truck extends com.softserve.edu06.pt.Car {
            public Truck(String model, int maxSpeed, int yearOfProduction) {
                super(model, maxSpeed, yearOfProduction);
            }

            @Override
            void run() {
                System.out.println(model + " Track start");
            }

            @Override
            void stop() {
                System.out.println(model + " Track stop");
            }
        }

        class Sedan extends com.softserve.edu06.pt.Car {
            public Sedan(String model, int maxSpeed, int yearOfProduction) {
                super(model, maxSpeed, yearOfProduction);
            }

            @Override
            void run() {
                System.out.println(model + " Sedan start");
            }

            @Override
            void stop() {
                System.out.println(model + " Sedan Stop");
            }
        }

        class Main {
            public static void main(String[] args) {
                // Створення масиву об'єктів типу Car
                com.softserve.edu06.pt.Car[] cars = new com.softserve.edu06.pt.Car[4];

                // Додавання вантажівок та седанів до масиву
                cars[0] = new com.softserve.edu06.pt.Truck("MAN", 120, 2018);
                cars[1] = new com.softserve.edu06.pt.Truck("Volvo", 110, 2016);
                cars[2] = new com.softserve.edu06.pt.Sedan("Toyota Camry", 180, 2020);
                cars[3] = new com.softserve.edu06.pt.Sedan("Honda Acord", 170, 2019);

                // Виведення інформації про кожен автомобіль
                for (com.softserve.edu06.pt.Car car : cars) {
                    car.run(); // Почати рух
                    car.stop(); // Зупинити
                }
            }
        }
        //Task2
        class Point {
            int x;
            int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "(" + x + ", " + y + ")";
            }

            public void print() {
                System.out.println(toString());
            }
        }

        class Line {
            com.softserve.edu06.pt.Point startPoint;
            com.softserve.edu06.pt.Point endPoint;

            public Line(com.softserve.edu06.pt.Point startPoint, com.softserve.edu06.pt.Point endPoint) {
                this.startPoint = startPoint;
                this.endPoint = endPoint;
            }

            @Override
            public String toString() {
                return "Line from " + startPoint + " to " + endPoint;
            }

            public void print() {
                System.out.println(toString());
            }
        }

        class ColorLine extends com.softserve.edu06.pt.Line {
            String color;

            public ColorLine(com.softserve.edu06.pt.Point startPoint, com.softserve.edu06.pt.Point endPoint, String color) {
                super(startPoint, endPoint);
                this.color = color;
            }

            @Override
            public String toString() {
                return "Line from " + startPoint + " to " + endPoint + " with color " + color;
            }

            @Override
            public void print() {
                System.out.println(toString());
            }
        }

         class Main1 {
            public static void main(String[] args) {
                com.softserve.edu06.pt.Line[] lines = new com.softserve.edu06.pt.Line[3];

                // Додавання об'єктів типу Line і ColorLine до масиву
                lines[0] = new com.softserve.edu06.pt.Line(new com.softserve.edu06.pt.Point(0, 0), new com.softserve.edu06.pt.Point(1, 1));
                lines[1] = new com.softserve.edu06.pt.Line(new com.softserve.edu06.pt.Point(2, 2), new com.softserve.edu06.pt.Point(3, 3));
                lines[2] = new com.softserve.edu06.pt.ColorLine(new com.softserve.edu06.pt.Point(4, 4), new com.softserve.edu06.pt.Point(5, 5), "red");

                // Виклик методу print() для кожного об'єкта в масиві
                for (com.softserve.edu06.pt.Line line : lines) {
                    line.print();
                }
            }
        }


    }
}

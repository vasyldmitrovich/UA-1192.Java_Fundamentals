package com.softserve.academy.edu06.pt;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
// Create classes called Truck and Sedan which extend class Car.
// In main() method create array of Car’s objects. Add to this array some
// trucks and sedans and print info about it.

        System.out.println("Task 2");
        Car[] cars = new Car[5];
        cars[0] = new Truck("Truck1", 100, 2000);
        cars[1] = new Truck("Truck2", 120, 2001);
        cars[2] = new Sedan("Sedan1", 150, 2002);
        cars[3] = new Sedan("Sedan2", 170, 2003);
        cars[4] = new Sedan("Sedan3", 190, 2004);

        Arrays.stream(cars).forEach(System.out::println);

        System.out.println("Task 3");
// Create three classes − Point, Line, and ColorLine:
// • The "Point" class should have attributes "x" and "y".
// • The "Line" class should contain two objects of the "Point" class.
// • The "ColorLine" class should have an additional attribute "color", which extends the "Line" class.
// Override toString() method and define print() method in every classes.
// In main() method create an array of Line objects and add some instances of both Line and
// ColorLine to it. Call the print() method for all objects in the array.

        Line[] lines = new Line[5];
        lines[0] = new Line(new Point(1, 1), new Point(2, 2));
        lines[1] = new Line(new Point(3, 3), new Point(4, 4));
        lines[2] = new ColorLine(new Point(5, 5), new Point(6, 6), "red");
        lines[3] = new ColorLine(new Point(7, 7), new Point(8, 8), "green");
        lines[4] = new ColorLine(new Point(9, 9), new Point(10, 10), "blue");

        Arrays.stream(lines).forEach(Line::Pint);
    }
}

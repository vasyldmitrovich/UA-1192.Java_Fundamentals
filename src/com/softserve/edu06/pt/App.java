package com.softserve.edu06.pt;

import com.softserve.edu06.pt.practicaltask1.Car;
import com.softserve.edu06.pt.practicaltask1.Sedan;
import com.softserve.edu06.pt.practicaltask1.Truck;
import com.softserve.edu06.pt.practicaltask2.ColorLine;
import com.softserve.edu06.pt.practicaltask2.Line;
import com.softserve.edu06.pt.practicaltask2.Point;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        practicalTask1();
        System.out.println("End of first practical task");

        practicalTask2();
        System.out.println("End of second practical task");
    }

    public static void practicalTask1 () {
        int count = 0;
        int maxSpeed = 0;
        int yearOfProduction = 0;
        Car[] cars = new Car[6];
        Truck truck1 = new Truck();
        Sedan sedan1 = new Sedan();
        cars[0] = truck1;
        cars[1] = sedan1;

        while (count < 4) {
            System.out.println("Enter the model of truck");
            String model = sc.nextLine();
            System.out.println("Enter the max speed of truck");

            try {
                maxSpeed = sc.nextInt();
                System.out.println("Enter the year of production for truck");
                yearOfProduction = sc.nextInt();
                Truck truck = new Truck(model, maxSpeed, yearOfProduction);
                cars[2 + count] = truck;
                sc.nextLine();
                System.out.println("Enter the model of sedan");
                model = sc.nextLine();
                System.out.println("Enter the max speed of sedan");
                maxSpeed = sc.nextInt();
                System.out.println("Enter the year of production for sedan");
                yearOfProduction = sc.nextInt();
                Sedan sedan = new Sedan(model, maxSpeed, yearOfProduction);
                cars[3 + count] = sedan;
                sc.nextLine();

            } catch (Exception e) {
                System.out.println("Error");
                System.exit(0);
            }

            count += 2;
        }

        System.out.println(Arrays.toString(cars));
    }

    public static void practicalTask2 () {
        int count = 0;
        int x = 0;
        int y = 0;
        String color = "";
        Point point1 = null;
        Point point2 = null;
        Line[] lines = new Line[6];
        Line line1 = new Line();
        ColorLine colorLine1 = new ColorLine();
        lines[0] = line1;
        lines[1] = colorLine1;

        while (count < 4) {

            try {
                System.out.println("Enter the value of x for first point of the line");
                x = sc.nextInt();
                System.out.println("Enter the value of y for first point of the line");
                y = sc.nextInt();
                point1 = new Point(x, y);
                System.out.println("Enter the value of x for second point of the line");
                x = sc.nextInt();
                System.out.println("Enter the value of y for second point of the line");
                y = sc.nextInt();
                point2 = new Point(x, y);
                Line line = new Line(point1, point2);
                lines[2 + count] = line;
                sc.nextLine();
                System.out.println("Enter the value of x for first point of the color line");
                x = sc.nextInt();
                System.out.println("Enter the value of y for first point of the color line");
                y = sc.nextInt();
                point1 = new Point(x, y);
                System.out.println("Enter the value of x for second point of the color line");
                x = sc.nextInt();
                System.out.println("Enter the value of y for second point of the color line");
                y = sc.nextInt();
                point2 = new Point(x, y);
                sc.nextLine();
                System.out.println("Enter the color of the color line");
                color = sc.nextLine();
                ColorLine colorLine = new ColorLine(point1, point2, color);
                lines[3 + count] = colorLine;
            } catch (Exception e) {
                System.out.println("Error");
                System.exit(0);
            }

            count += 2;
        }

       for (Line item : lines) {
           item.print();
       }
    }
}

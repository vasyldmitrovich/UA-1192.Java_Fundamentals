package com.softserve.edu06.pt;

import java.util.Random;

public class App {

    public static final Random RAND = new Random(System.currentTimeMillis());

    private static final String[] TRUCK_MODELS = {"Man", "Volvo", "Peterbilt"};
    private static final String[] SEDAN_MODELS = {"BMW", "Mercedes", "Audi"};
    private static final String[] COLORS = {"red", "green", "blue"};

    public static void main(String[] args) {
        System.out.println("Practice task 1");
        demonstrateCarTask();
        System.out.println();

        System.out.println("Practice task 2");
        demonstrateLineTask();
    }

    private static void demonstrateCarTask() {
        Car[] cars = new Car[5];

        System.out.println("Cars: [");
        for (int i = 0; i < cars.length; i++) {
            cars[i] = generateRandomCar();
            System.out.println("\t" + cars[i]);
        }
        System.out.println("]");

        for (int i = 0; i < 2; i++) {
            int randIndex = RAND.nextInt(cars.length);

            if (RAND.nextBoolean()) {
                cars[randIndex].run();
            } else {
                cars[randIndex].stop();
            }
        }
    }

    private static Car generateRandomCar() {
        //from 80 to 150
        int maxSpeed = RAND.nextInt(70) + 80;
        //from 2015 to 2022
        int year = RAND.nextInt(7) + 2015;

        if (RAND.nextBoolean()) {
            String model = TRUCK_MODELS[RAND.nextInt(TRUCK_MODELS.length)];
            return new Truck(model, maxSpeed, year);
        } else {
            String model = SEDAN_MODELS[RAND.nextInt(SEDAN_MODELS.length)];
            return new Sedan(model, maxSpeed, year);
        }
    }

    private static void demonstrateLineTask() {
        Line[] lines = new Line[5];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = getRandomLine();
            lines[i].print();
        }
    }

    private static Line getRandomLine() {
        //from -20 to 20
        int x1 = RAND.nextInt(40) - 20;
        int y1 = RAND.nextInt(40) - 20;
        int x2 = RAND.nextInt(40) - 20;
        int y2 = RAND.nextInt(40) - 20;

        if (RAND.nextBoolean()) {
            return new Line(x1, y1, x2, y2);
        } else {
            String color = COLORS[RAND.nextInt(COLORS.length)];
            return new ColorLine(x1, y1, x2, y2, color);
        }
    }
}

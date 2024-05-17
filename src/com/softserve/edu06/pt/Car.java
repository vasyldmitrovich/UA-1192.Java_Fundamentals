package com.softserve.edu06.pt;

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

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Year of Production: " + yearOfProduction);
    }
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println(model + " (Truck) is running.");
    }

    @Override
    void stop() {
        System.out.println(model + " (Truck) has stopped.");
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println(model + " (Sedan) is running.");
    }

    @Override
    void stop() {
        System.out.println(model + " (Sedan) has stopped.");
    }
}

 class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        // Додавання деяких вантажівок і седанів до масиву
        cars[0] = new Truck("Volvo FH16", 120, 2020);
        cars[1] = new Truck("Scania R450", 110, 2019);
        cars[2] = new Sedan("Toyota Camry", 210, 2021);
        cars[3] = new Sedan("Honda Accord", 220, 2022);


        for (Car car : cars) {
            car.printInfo();
            car.run();
            car.stop();
            System.out.println();
        }
    }
}

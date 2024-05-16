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
}

class Truck extends Car {
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

class Sedan extends Car {
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
        Car[] cars = new Car[4];

        // Додавання вантажівок та седанів до масиву
        cars[0] = new Truck("MAN", 120, 2018);
        cars[1] = new Truck("Volvo", 110, 2016);
        cars[2] = new Sedan("Toyota Camry", 180, 2020);
        cars[3] = new Sedan("Honda Acord", 170, 2019);

        // Виведення інформації про кожен автомобіль
        for (Car car : cars) {
            car.run(); // Почати рух
            car.stop(); // Зупинити
        }
    }
}

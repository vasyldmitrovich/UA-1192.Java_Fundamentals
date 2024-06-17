package com.softserve.edu06.pt;

public class pt2 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Truck("Volvo FH", 120, 2015);
        cars[1] = new Truck("Scania R500", 130, 2018);
        cars[2] = new Sedan("Toyota Camry", 210, 2020);
        cars[3] = new Sedan("Mercedes B200", 260, 2019);

        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.stop();
        }
    }
}

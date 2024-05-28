package com.softserve.edu07_oop2.hw.hw2;

public class App {
    public static void main(String[] args) {
        Liner liner = new Liner(10);
        System.out.println("Liner floors: " + liner.getFloors());
        System.out.println("Liner is sailing: " + liner.isSailing());

        Boat boat = new Boat(500);
        System.out.println("Boat volume: " + boat.getVolume());
        System.out.println("Boat is sailing: " + boat.isSailing());

        Plane plane = new Plane(1000);
        System.out.println("Plane max distance: " + plane.getMaxDistance());
        plane.fly();
        plane.land();

        Helicopter helicopter = new Helicopter(2000, 15000);
        System.out.println("Helicopter weight: " + helicopter.getWeight());
        System.out.println("Helicopter max height: " + helicopter.getMaxHeight());
        helicopter.fly();
        helicopter.land();

        Bus bus = new Bus("Route 66");
        System.out.println("Bus route: " + bus.getRoute());
        bus.drive();

        Motorcycle motorcycle = new Motorcycle(180);
        System.out.println("Motorcycle max speed: " + motorcycle.getMaxSpeed());
        motorcycle.drive();

        Car car = new Car("Tesla Model S");
        System.out.println("Car model: " + car.getModel());
        car.drive();
    }
}





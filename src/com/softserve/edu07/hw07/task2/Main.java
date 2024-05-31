package com.softserve.edu07.hw07.task2;

// Main.java
public class Main {
    public static void main(String[] args) {
        Liner liner = new Liner();
        liner.setFloors(10);
        liner.drive(); // Вызов метода WaterVehicle, который в свою очередь вызывает isSailing()

        Car car = new Car();
        car.setMaxSpeed(200);
        car.drive(); // Вызов метода GroundVehicle, который просто выводит сообщение о движении
    }
}

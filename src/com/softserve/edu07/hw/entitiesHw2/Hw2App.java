package com.softserve.edu07.hw.entitiesHw2;

public class Hw2App {
    public static void main(String[] args) {
        hw1();
    }// This is good, nice

    public static void hw1(){
        Passengers [] passengers = {
                new Liner(2000,3),
                new Boat(10,5),
                new Plane(250,30000),
                new Helicopter(8,2000,5000),
                new Bus(30,"Kherson-Kharkiv"),
                new Motorcycle(2,220),
                new Car(5,"Audi Rs6"),
        };
        for (var Passengers:passengers) {
            if(Passengers instanceof WaterVehicle waterVehicle){
                waterShow(waterVehicle);
            }else if(Passengers instanceof FlyingVehicle flyingVehicle){
                flyingShow(flyingVehicle);
            }else if(Passengers instanceof  GroundVehicle groundVehicle){
                groundShow(groundVehicle);
            }
        }
    }

    public static void waterShow(WaterVehicle waterVehicle){
        waterVehicle.isSailing();
        System.out.println("************************************");
    }
    public static void flyingShow(FlyingVehicle flyingVehicle){
        flyingVehicle.fly();
        flyingVehicle.land();
        System.out.println("************************************");
    }
    public static void groundShow(GroundVehicle groundVehicle){
        groundVehicle.drive();
        System.out.println("************************************");
    }
}

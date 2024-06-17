package com.softserve.edu07.hw.hw2;

public class Bus extends GroundVehicle {
    String route;

    public Bus(String route, int passengers) {
        setPassengers(passengers);
        this.route = route;
    }


    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
            System.out.println("Driving on " + getRoute());
    }

    @Override
    public void info() {
        System.out.println("Type: " + getClass().getSimpleName() + "\n Passengers: " + getPassengers());
        drive();
        System.out.println("-------------------");
    }
}
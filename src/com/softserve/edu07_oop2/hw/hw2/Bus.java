package com.softserve.edu07_oop2.hw.hw2;

public class Bus extends Passengers implements GroundVehicle {
    private String route;

    public Bus(String route) {
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
        // Implement logic for driving
    }
}



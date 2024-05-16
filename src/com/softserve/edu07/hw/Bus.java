package com.softserve.edu07.hw;

public class Bus extends GroundVehicle {

    private String route;

    public Bus() {}

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus drive");
    }
}

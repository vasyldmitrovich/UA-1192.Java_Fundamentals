package com.softserve.edu07.hwork;

public class Bus extends GroundVehicle {

    private String route;

    public Bus() {
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
    }
}

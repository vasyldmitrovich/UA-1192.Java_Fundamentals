package com.softserve.edu07.hw.vehicle;

public class Bus extends GroundVehicle {

    private String route;

    public Bus() {
        route = "Kyiv-Chop";
        passengers = 10;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Start engine");
        System.out.println("Selected route: " + route);
        System.out.println("Running...");
        System.out.println("Stops at the bus stop");
    }
}

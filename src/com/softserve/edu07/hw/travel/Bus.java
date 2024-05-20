package com.softserve.edu07.hw.travel;

public class Bus extends GroundVehicle {
    private String route;

    public Bus() {
        setPassengers(20);
        System.out.println("Bus is created.Number of passengers: " + getPassengers());
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is drive");

    }
}

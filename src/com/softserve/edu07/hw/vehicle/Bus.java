package com.softserve.edu07.hw.vehicle;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passenger, String route) {
        super(passenger);
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
        System.out.println("The bus drives by route " + getRoute() + ", there are " + getPassenger() + " passengers!");
    }
}

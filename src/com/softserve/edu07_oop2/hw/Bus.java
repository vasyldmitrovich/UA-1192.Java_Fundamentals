package com.softserve.edu07_oop2.hw;

public class Bus extends GroundVechicle {

    private String route;

    public Bus() {
    }

    public Bus(String route) {
        this.route = route;
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

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                '}' + "Passengers{" +
                "passengers=" + getPassengers() +
                '}';
    }
}

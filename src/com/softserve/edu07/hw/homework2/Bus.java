package com.softserve.edu07.hw.homework2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus () {
        this.passengers = 40;
        this.route = "Lviv-Krakow-Prague";
    }

    public Bus (int passengers, String route) {
        this.passengers = passengers;
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
        System.out.println("The bus drives");
    }
}

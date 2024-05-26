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
        if (getPassengers() > 0) {
            System.out.println("The bus is driving on " + getRoute());
        } else System.out.println("The bus is in a bus fleet");
    }

    @Override
    public void info() {
        String gap = "\n";
        System.out.println("-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap + "Passengers: " + getPassengers() + gap);
        drive();
        System.out.println(gap + "-".repeat(40));
    }
}

package com.softserve.edu07.hw.entitiesHw2;

public class Bus extends GroundVehicle{
    private String route;
    public Bus(int passengers,String route) {
        super(passengers);
        this.route=route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("I'm a driving Bus\nMy Route: "+route +" with "+ getPassengers()+" passengers");
    }
}

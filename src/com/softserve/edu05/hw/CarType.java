package com.softserve.edu05.hw;

public enum CarType {
    AUTOMOBILE("Automobile"),
    BUS("Bus"),
    HEAVY_DUTY_TRUCK("Heavy Duty Truck"),
    PICKUP("Pickup");

    private final String name;

    CarType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

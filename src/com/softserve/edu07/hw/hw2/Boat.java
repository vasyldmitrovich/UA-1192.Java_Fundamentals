package com.softserve.edu07.hw.hw2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int volume, int passengers) {
        setPassengers(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        if (getPassengers() > 0) {
            System.out.println(getClass().getSimpleName() + " is sailing");
        } else System.out.println(getClass().getSimpleName() + " boat is moored");
    }

    public void info() {
        String gap = "\n";
        System.out.println("-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap +
                "Volume: " + getVolume() + gap + "Passengers: " + getPassengers() + gap);
        isSailing();
        System.out.println(gap + "-".repeat(40));
    }
}

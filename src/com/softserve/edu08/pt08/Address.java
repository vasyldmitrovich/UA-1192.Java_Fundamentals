package com.softserve.edu08.pt08;

public class Address implements Cloneable {
    private String city;
    private String street;
    private int building;

    public Address(String city, String street, int building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "City: " + city + ", Street: " + street + ", Building: " + building;
    }
}

package com.softserve.edu08.pt;

public class Address {
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "City: " + city + ", Street: " + street + ", Building: " + building;
    }
}

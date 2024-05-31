package com.softserve.edu08.pt;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);

    }
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address implements Cloneable {

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

    public int getBuilding_number() {
        return building;
    }

    public void setBuilding_number(int building_number) {
        this.building= building_number;
    }

}








package com.softserve.edu08.pt08;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        cloned.address = (Address) this.address.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Department Name: " + name + ", Address: " + address.toString();
    }
}

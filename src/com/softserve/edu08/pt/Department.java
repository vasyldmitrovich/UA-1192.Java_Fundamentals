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

    public void setName(String name) {
        this.name = name;
    }


    public Address getAddress() {
        return address;
    }


    @Override
    public Department clone() {
        try {
            Department cloned = (Department) super.clone();
            cloned.address = new Address(address.getCity(), address.getStreet(), address.getBuilding());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Department Name: " + name + ", Address: [" + address.toString() + "]";
    }

    public static void main(String[] args) {

        Department department1 = new Department("Engineering", "Kyiv", "Shevchenko Street", 12);


        System.out.println(department1);


        Department department2 = department1.clone();

        department2.getAddress().setCity("Lviv");


        System.out.println(department1);
        System.out.println(department2);
    }
}
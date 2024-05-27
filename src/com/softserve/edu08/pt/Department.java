package com.softserve.edu08.pt;

public class Department implements Cloneable {// Good
    private String name;
    private Address address;

    public Department() {
    }

    public Department(String name, String city, String street, int building) {
        this.address = new Address(city, street, building);
        this.name = name;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Department myClone = (Department) super.clone();
        myClone.setAddress((Address) getAddress().clone());
        return myClone;
    }

    @Override
    public String toString() {
        return "Department " + name + " in city " + getAddress().city + " in street " + getAddress().street + " building number is " + getAddress().building;
    }

    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building;


        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}

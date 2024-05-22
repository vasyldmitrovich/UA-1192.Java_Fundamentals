package com.softserve.edu08.pt;

public class Department implements Cloneable{

    private String name;
    private Address address;

    public Department () {
        this.name = "Finance Department";
        this.address = new Address();
    }

    public Department (String name, Address address) {
        this.name = name;
        this.address = address;
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
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                "," + address.toString() +
                '}';
    }

    @Override
    public Department clone() throws CloneNotSupportedException {
        Department clone = (Department) super.clone();
        clone.address = address.clone();
        return clone;
    }

    public static class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Address () {
            this.city = "Lviv";
            this.street = "Shevchenka Avenue";
            this.building = 8;
        }

        public Address (String city, String street, int building) {
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
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }

}

package com.softserve.edu08_nest.pt;
public class Department implements Cloneable {
    private String name;
    private Address address;

    // Department constructor
    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    // Overriding the clone method to support cloning
    @Override
    protected Department clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        cloned.address = new Address(this.address.getCity(), this.address.getStreet(), this.address.getBuilding());
        return cloned;
    }

    @Override
    public String toString() {
        return "Department Name: " + name + ", " + address.toString();
    }

    // Address inner class
    public class Address {
        private String city;
        private String street;
        private int building;

        // Address constructor
        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        // Getter for city
        public String getCity() {
            return city;
        }

        // Setter for city
        public void setCity(String city) {
            this.city = city;
        }

        // Getter for street
        public String getStreet() {
            return street;
        }

        // Setter for street
        public void setStreet(String street) {
            this.street = street;
        }

        // Getter for building
        public int getBuilding() {
            return building;
        }

        // Setter for building
        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address: " + street + " St, " + city + ", Building " + building;
        }
    }

    public Address getAddress() {
        return this.address;
    }
}


package com.softserve.edu08_nest.pt;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, String city, String street, int building_number) {
        this.name = name;
        this.address = new Address(city, street, building_number);
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

    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building_number;

        public Address(String city, String street, int building_number) {
            this.city = city;
            this.street = street;
            this.building_number = building_number;
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

        public int getBuilding_number() {
            return building_number;
        }

    }
}
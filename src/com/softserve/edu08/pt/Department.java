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


        public int getBuilding() {
            return building;
        }



        @Override
        public String toString() {
            return "City: " + city + ", Street: " + street + ", Building: " + building;
        }
    }

    @Override
    public Department clone() {
        try {
            Department cloned = (Department) super.clone();
            cloned.address = new Address(this.address.getCity(), this.address.getStreet(), this.address.getBuilding());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Department Name: " + name + ", Address: [" + address.toString() + "]";
    }
}

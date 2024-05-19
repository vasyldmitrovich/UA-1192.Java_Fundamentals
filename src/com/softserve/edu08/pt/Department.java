package com.softserve.edu08.pt;

public class Department implements Cloneable {

    private String field;
    private Address address;

    public Department() {}

    public Department(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getAddress() {
        return address.toString();
    }

    public void setAddress(String city, String street, int building) {
        address = new Address(city, street, building);
    }

    public void changeCity(String city) {
        address.city = city;
    }

    public void changeStreet(String street) {
        address.street = street;
    }

    public void changeBuilding(int building) {
        address.building = building;
    }

    @Override
    protected Department clone() throws CloneNotSupportedException {
        Department clone = (Department) super.clone();
        clone.address = address.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Department{" +
                "field='" + field + '\'' +
                ", address=" + address +
                '}';
    }

    private static class Address implements Cloneable {

        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        protected Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }

        @Override
        public String toString() {
            return "City: " + city +
                    ", Street: " + street +
                    ", Building: " + building;
        }
    }
}

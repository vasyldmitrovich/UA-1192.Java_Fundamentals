package com.softserve.edu08.pt;

public class Department implements Cloneable{

    private String name;
    private Address address;

    public Department(){

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
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        cloned.address = (Address) cloned.address.clone();

        return cloned;
    }

    class Address implements Cloneable{
        String city, street;
        int builing;

        Address(){}

        String getCity() {
            return city;
        }

        void setCity(String city) {
            this.city = city;
        }

        String getStreet() {
            return street;
        }

        void setStreet(String street) {
            this.street = street;
        }

        int getBuiling() {
            return builing;
        }

        void setBuiling(int builing) {
            this.builing = builing;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", builing=" + builing +
                    '}';
        }
    }



}

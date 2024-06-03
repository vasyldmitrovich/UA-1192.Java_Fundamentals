package com.softserve.edu08.pt;

public class Department implements Cloneable {
    private String name;
    private Adress adress;

    public Department() {
    }

    public Department(String name, String city, String street, int buildings) {
        this.name = name;
        adress = new Adress(city, street, buildings);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    private void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        String gap = " - ";
        return "Department_name:" + gap + name +
                gap + "Adress info:" + gap + adress;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department myDept = (Department) super.clone();
        myDept.setAdress((Adress) getAdress().clone());
        return myDept;
    }

    public class Adress implements Cloneable {// Mabe Address
        private String city;
        private String street;
        private int buildings;

        public Adress(String city, String street, int buildings) {
            this.city = city;
            this.street = street;
            this.buildings = buildings;
        }

        public String getCity() {
            return city;
        }

        private void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        private void setStreet(String street) {
            this.street = street;
        }

        public int getBuildings() {
            return buildings;
        }

        private void setBuildings(int buildings) {
            this.buildings = buildings;
        }

        public void sets(String city, String street, int buildings) {// You have constructor
            setName(name);
            this.city = city;
            this.street = street;
            this.buildings = buildings;
        }

        @Override
        public String toString() {
            String gap = " | ";
            return "City: " + city + gap +
                    "Street: " + street + gap +
                    "Buildings: " + buildings +
                    gap;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}

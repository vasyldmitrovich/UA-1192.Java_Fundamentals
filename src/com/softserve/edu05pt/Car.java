package com.softserve.edu05pt;

public class Car {
    private String type;
    private int yearOfProduction;
    private String engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {

        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = String.valueOf(engineCapacity);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return Double.parseDouble(engineCapacity);
    }// This is interesting

        public void setEngineCapacity( double engineCapacity){
            this.engineCapacity = String.valueOf(engineCapacity);
        }// You can change field to double and do not do casting to string
    }











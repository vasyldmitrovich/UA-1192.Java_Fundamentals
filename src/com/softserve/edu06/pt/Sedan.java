package com.softserve.edu06.pt;

public class Sedan extends Car {// Ok
    private int engPower;
    public Sedan(){

    }
    public Sedan(String model,int maxSpeed,int yearOfProduction,int engPower){
        super(model, maxSpeed, yearOfProduction);
        this.engPower=engPower;
    }

    @Override
    public void print() {
        System.out.println("Info about Sedan:\n" +
                "Model:"+getModel()+"\nMax speed:"+getMaxSpeed()+
                "\nYear of production"+getYearOfProduction()+
                "\nEngine power:"+engPower);
    }

    @Override
    public void run() {
        System.out.println("The sedan is run");

    }

    @Override
    public void stop() {
        System.out.println("The sedan has stopped.");

    }
}

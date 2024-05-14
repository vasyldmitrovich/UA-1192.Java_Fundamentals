package com.softserve.edu06.pt;

public class Truck extends Car{
    private boolean whithTrailer;

    public Truck(String model,int maxSpeed,int yearOfProduction,boolean whithTrailer){
        super(model, maxSpeed, yearOfProduction);
        this.whithTrailer=whithTrailer;
    }
    @Override
    public void run() {
        System.out.println("The truck is run");
    }

    @Override
    public void stop() {
        System.out.println("The truck has stopped.");
    }
    @Override
    public void print() {
        System.out.println("Info about Truck:\n" +
                "Model:"+getModel()+"\nMax speed:"+getMaxSpeed()+
                "\nYear of production:"+getYearOfProduction()+
                "\nWith trailer?:"+whithTrailer);
    }
}

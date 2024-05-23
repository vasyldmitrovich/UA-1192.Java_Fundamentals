package com.softserve.edu07.hw;

public class FixedPayWorker extends SalariedEmployee{
    private double salary;


    public FixedPayWorker(double salary, String... args){
        super(args[0], args[1], args[2]);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}

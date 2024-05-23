package com.softserve.edu07.hw;

public class HourlyPaidWorker extends SalariedEmployee{
    private double hourlyRate;
    private double hours;


    public HourlyPaidWorker(double hourlyRate, String... args){
        super(args[0], args[1], args[2]);
        this.hourlyRate = hourlyRate;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    public void addHours(double val){
        hours +=val;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*hours;
    }
}

package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private int rate ;
    private int hours;
    public static int totalSum = 0;

    public Employee(){
        System.out.println("Constructor");

    }

    public Employee(String name,int rate,int hours){
        System.out.println("Constructor with all parameters");
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name){
        System.out.println("Constructor only with name");
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public float getRate(){
        return rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours(){
        return hours;
    }

    public int getSalary(){
        return rate*hours;
    }

    @Override
    public String toString(){
        return "{"+
                "Name = "+name+"\nRate = "+rate+
                "\nHours = "+hours+"}";
    }

    public float getBonus(){
        return (rate*0.1f);
    }
}

package com.softserve.edu06.hw;

public class Developer extends Employee {
    private String info;

    public Developer(String name, String info, int age, double salary){
        super(name, age, salary);
        this.info = info;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, Salary: %.2f", getName(), getAge(), getInfo(), getSalary());
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
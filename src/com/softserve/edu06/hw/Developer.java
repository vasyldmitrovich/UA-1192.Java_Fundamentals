package com.softserve.edu06.hw;

public class Developer extends Employee{
    private String position;

    public Developer(){
        super();
        position=null;
    }
    public Developer(String name, int age, int salary,String position){
        super(name, age, salary);
        this.position=position;
    }
    @Override
    public String report(){
        return String.format("Name:%s, Age: %d,"+
                " Position: %s, Salary: \u20B4 %.2f.",getName(),getAge(),position,getSalary());
    }
}
